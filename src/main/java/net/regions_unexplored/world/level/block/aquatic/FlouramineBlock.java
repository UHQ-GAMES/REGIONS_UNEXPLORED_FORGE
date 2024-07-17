package net.regions_unexplored.world.level.block.aquatic;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.*;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.EnchantingTableBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.SculkSensorPhase;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.block.entity.RuBlockEntities;
import net.regions_unexplored.block.entity.block.FlouramineBlockEntity;
import net.regions_unexplored.world.level.block.other_dirt.AshenDirtBlock;
import net.regions_unexplored.world.level.block.state.properties.RuBlockStateProperties;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class FlouramineBlock extends GrowingPlantHeadBlock implements LiquidBlockContainer, EntityBlock {
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

    //BlockEntity
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return RuBlockEntities.FLOURAMINE_BLOCK_ENTITY.get().create(blockPos, blockState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> entityType) {

        return !level.isClientSide ? createTickerHelper(entityType, RuBlockEntities.FLOURAMINE_BLOCK_ENTITY.get(), FlouramineBlockEntity::setActive) : null;
    }

    @Nullable
    protected static <E extends BlockEntity, A extends BlockEntity> BlockEntityTicker<A> createTickerHelper(BlockEntityType<A> p_152133_, BlockEntityType<E> p_152134_, BlockEntityTicker<? super E> p_152135_) {
        return p_152134_ == p_152133_ ? (BlockEntityTicker<A>) p_152135_ : null;
    }

    //


    public static boolean canActivate(BlockState state) {
        return state.getValue(IS_ACTIVE);
    }

    public void activate(BlockState state) {
        state.setValue(IS_ACTIVE, true);
    }

    public void deactivate(BlockState state) {
        state.setValue(IS_ACTIVE, false);
    }

    public static boolean isActive(BlockState state) {
        return state.getValue(IS_ACTIVE);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {

        super.tick(state, level, pos, random);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide) {
            if (!(entity instanceof WaterAnimal)) {
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

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(IS_ACTIVE, false);
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
