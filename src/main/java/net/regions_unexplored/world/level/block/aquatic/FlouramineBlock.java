package net.regions_unexplored.world.level.block.aquatic;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.*;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.world.level.block.other.CobaltObsidianBlock;
import net.regions_unexplored.world.level.block.state.properties.RuBlockStateProperties;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;

public class FlouramineBlock extends GrowingPlantHeadBlock implements LiquidBlockContainer {
    public static final MapCodec<FlouramineBlock> CODEC = simpleCodec(FlouramineBlock::new);
    protected static final VoxelShape SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 14, 15.0);
    public static final BooleanProperty IS_ACTIVE = RuBlockStateProperties.ACTIVE;
    private static final double GROW_PER_TICK_PROBABILITY = 0.14;

    public MapCodec<FlouramineBlock> codec() {
        return CODEC;
    }

    //Properties
    public FlouramineBlock(Properties properties) {
        super(properties, Direction.UP, SHAPE, true, 0.14);
        this.registerDefaultState(this.stateDefinition.any().setValue(IS_ACTIVE, false).setValue(AGE, 0));
    }
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(new Property[]{AGE}).add(IS_ACTIVE);
    }

    public BlockState getStateForPlacement(LevelAccessor p_53949_) {
        return (BlockState)this.defaultBlockState().setValue(AGE, p_53949_.getRandom().nextInt(25));
    }

    public static boolean isActive(BlockState state) {
        return state.getValue(IS_ACTIVE);
    }

    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource randomSource) {
        if (isActive(state)) {
            Direction direction = Direction.getRandom(randomSource);
            if (direction != Direction.UP) {
                BlockPos blockpos = pos.relative(direction);
                BlockState blockstate = level.getBlockState(blockpos);
                for(int i = 0; i <= 2; i++){
                    if (!state.canOcclude() || !blockstate.isFaceSturdy(level, blockpos, direction.getOpposite())) {
                        double d0 = direction.getStepX() == 0 ? randomSource.nextDouble() : 0.5D + (double)direction.getStepX() * 0.6D;
                        double d1 = direction.getStepY() == 0 ? randomSource.nextDouble() : 0.5D + (double)direction.getStepY() * 0.6D;
                        double d2 = direction.getStepZ() == 0 ? randomSource.nextDouble() : 0.5D + (double)direction.getStepZ() * 0.6D;
                        level.addParticle(ParticleTypes.BUBBLE_COLUMN_UP, (double)pos.getX() + d0, (double)pos.getY() + d1, (double)pos.getZ() + d2, 0.0D, 0.0D, 0.0D);
                    }
                }
            }
        }
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        checkForEntity(state, level, pos, pos.getX(), pos.getY(), pos.getZ());
        super.tick(state, level, pos, random);
        level.scheduleTick(pos, this, 3);
    }

    @Override
    public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        super.onPlace(blockstate, world, pos, oldState, moving);
        world.scheduleTick(pos, this, 1);
    }


    public static void checkForEntity(BlockState state, LevelAccessor levelAccessor, BlockPos pos, double x, double y, double z) {
        List<Player> player = levelAccessor.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true);
        List<Monster> monster = levelAccessor.getEntitiesOfClass(Monster.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true);
        List<Animal> animals = levelAccessor.getEntitiesOfClass(Animal.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true);

        if (!player.isEmpty()||!monster.isEmpty()||!animals.isEmpty()) {
            if (!state.getValue(IS_ACTIVE)){
                activate(state,levelAccessor,pos);
            }
        }
        else if(state.getValue(IS_ACTIVE)){
            deactivate(state,levelAccessor,pos);
        }
    }

    public static void activate(BlockState state, LevelAccessor level, BlockPos pos) {
        level.playSound(null, pos, SoundEvents.PUFFER_FISH_BLOW_UP, SoundSource.BLOCKS, 1.0F, 0.5F);
        level.setBlock(pos, state.setValue(IS_ACTIVE, true), 2);
    }

    public static void deactivate(BlockState state, LevelAccessor level, BlockPos pos) {
        level.playSound(null, pos, SoundEvents.PUFFER_FISH_BLOW_OUT, SoundSource.BLOCKS, 1.0F, 0.5F);
        level.setBlock(pos, state.setValue(IS_ACTIVE, false), 2);
    }


    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide) {
            if (entity instanceof Player||entity instanceof Monster||entity instanceof Animal) {
                tryExplode(level, pos);
            }
        }
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        ItemStack item = player.getWeaponItem();
        Set<Holder<Enchantment>> enchantments = item.getEnchantments().keySet();
        boolean hasSilkTouch = enchantments.toString().contains("silk_touch");
        if (!level.isClientSide) {
            if(!hasSilkTouch){
                tryExplode(level, pos);
            }
        }
        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

    @Override
    public void onBlockExploded(BlockState state, Level level, BlockPos pos, Explosion explosion) {
        super.onBlockExploded(state, level, pos, explosion);
    }

    protected void tryExplode(Level level, BlockPos pos) {
        level.removeBlock(pos, true);
        BlockPos.MutableBlockPos pos1 = pos.below().mutable();
        while(level.getBlockState(pos1).is(RuBlocks.FLOURAMINE.get())||level.getBlockState(pos1).is(RuBlocks.FLOURAMINE_PLANT.get())){
            level.removeBlock(pos1, true);
            pos1.move(Direction.DOWN);
        }

        float f = 4.0F;
        level.explode(null, pos.getX()+0.5, pos.getY()+0.5, pos.getZ()+0.5, f, Level.ExplosionInteraction.BLOCK);
    }

    @Override
    protected Block getBodyBlock() {
        return RuBlocks.FLOURAMINE_PLANT.get();
    }

    @Override
    public boolean canAttachTo(BlockState state) {
        return !state.is(Blocks.MAGMA_BLOCK);
    }

    @Override
    protected int getBlocksToGrowWhenBonemealed(RandomSource randomSource) {
        return randomSource.nextInt(1);
    }

    protected boolean canGrowInto(BlockState state) {
        return state.is(Blocks.WATER);
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return true;
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_54302_) {
        FluidState fluidstate = p_54302_.getLevel().getFluidState(p_54302_.getClickedPos());
        return fluidstate.is(FluidTags.WATER) && fluidstate.getAmount() == 8 ? super.getStateForPlacement(p_54302_) : null;
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        return context.getItemInHand().getItem() != this.asItem();
    }

    public boolean canPlaceLiquid(@javax.annotation.Nullable Player p_299149_, BlockGetter p_54304_, BlockPos p_54305_, BlockState p_54306_, Fluid p_54307_) {
        return false;
    }

    public boolean placeLiquid(LevelAccessor p_54309_, BlockPos p_54310_, BlockState p_54311_, FluidState p_54312_) {
        return false;
    }

    protected FluidState getFluidState(BlockState p_54319_) {
        return Fluids.WATER.getSource(false);
    }
}
