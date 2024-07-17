package net.regions_unexplored.world.level.block.aquatic;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.block.RuBlocks;
public class GiantLilyBlock extends HorizontalDirectionalBlock implements net.minecraftforge.common.IPlantable {
    public static final MapCodec<? extends GiantLilyBlock> CODEC = simpleCodec(GiantLilyBlock::new);
    protected static final VoxelShape NORTH = Block.box(0.0D, 0.0D, 2.0D, 14.0D, 4D, 16.0D);
    protected static final VoxelShape EAST = Block.box(0.0D, 0.0D, 0.0D, 14.0D, 4D, 14.0D);
    protected static final VoxelShape SOUTH = Block.box(2.0D, 0.0D, 0.0D, 16.0D, 4D, 14.0D);
    protected static final VoxelShape WEST = Block.box(2.0D, 0.0D, 2.0D, 16.0D, 4D, 16.0D);

    public GiantLilyBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        return new ItemStack(RuBlocks.FLOWERING_LILY_PAD.get());
    }


    @Override
    public void fallOn(Level level, BlockState state, BlockPos pos, Entity entity, float f) {
        if(entity.getType() != EntityType.FROG) {
            if (entity.isSuppressingBounce()) {
                super.fallOn(level, state, pos, entity, f);
            } else {
                entity.causeFallDamage(f, 0.0F, level.damageSources().fall());
            }
        }
    }

    @Override
    public void updateEntityAfterFallOn(BlockGetter blockGetter, Entity entity) {
        Vec3 vec3 = entity.getDeltaMovement();
        if (vec3.y < -0.7D) {
            if(entity.getType() != EntityType.FROG) {
                if (entity.isSuppressingBounce()) {
                    super.updateEntityAfterFallOn(blockGetter, entity);
                } else {
                    this.bounceUp(entity);
                }
            }
        }
        else{
            entity.setDeltaMovement(entity.getDeltaMovement().multiply(1.0D, 0.0D, 1.0D));
            entity.setDeltaMovement(entity.getDeltaMovement().multiply(1.0D, 0.0D, 1.0D));
        }
    }

    private void bounceUp(Entity entity) {
        if(entity.getType() != EntityType.FROG) {
            Vec3 vec3 = entity.getDeltaMovement();
            if (vec3.y < 0.0D) {
                double d0 = entity instanceof LivingEntity ? 1.0D : 0.8D;
                entity.setDeltaMovement(vec3.x, -vec3.y * d0, vec3.z);
            }
        }
    }

    public VoxelShape getShape(BlockState state, BlockGetter block, BlockPos pos, CollisionContext context) {
        if(state== this.defaultBlockState().setValue(FACING, Direction.NORTH)){
            return NORTH;
        }
        else if(state== this.defaultBlockState().setValue(FACING, Direction.EAST)){
            return EAST;
        }
        else if(state== this.defaultBlockState().setValue(FACING, Direction.SOUTH)){
            return SOUTH;
        }
        else{
            return WEST;
        }
    }

    @Override
    public BlockState updateShape(BlockState p_51032_, Direction p_51033_, BlockState p_51034_, LevelAccessor p_51035_, BlockPos p_51036_, BlockPos p_51037_) {
        return !p_51032_.canSurvive(p_51035_, p_51036_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_51032_, p_51033_, p_51034_, p_51035_, p_51036_, p_51037_);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        if(level.getFluidState(pos.below()).is(Fluids.WATER)){
            if(state== this.defaultBlockState().setValue(FACING, Direction.NORTH)){
            return level.getBlockState(pos.west())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.WEST)&
                    level.getBlockState(pos.south().west())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.SOUTH)&
                    level.getBlockState(pos.south())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.EAST);
            }
            else if(state== this.defaultBlockState().setValue(FACING, Direction.EAST)){
            return level.getBlockState(pos.north())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.NORTH)&
                    level.getBlockState(pos.west())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.SOUTH)&
                    level.getBlockState(pos.west().north())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.WEST);
            }
            else if(state== this.defaultBlockState().setValue(FACING, Direction.SOUTH)){
            return level.getBlockState(pos.north().east())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.NORTH)&
                    level.getBlockState(pos.east())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.EAST)&
                    level.getBlockState(pos.north())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.WEST);
            }
            else{
            return level.getBlockState(pos.east())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.NORTH)&
                    level.getBlockState(pos.south().east())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.EAST)&
                    level.getBlockState(pos.south())== RuBlocks.GIANT_LILY_PAD.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.SOUTH);
            }
        }
        return false;
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Direction direction = context.getHorizontalDirection().getOpposite();

        if(context.getHorizontalDirection().getOpposite()==Direction.NORTH){
            if(!level.isClientSide()){
                level.setBlock(pos.west(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.WEST), 20);
                level.setBlock(pos.south().west(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.SOUTH), 20);
                level.setBlock(pos.south(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.EAST), 20);
                level.blockUpdated(pos.west(), Blocks.AIR);
                level.blockUpdated(pos.south().west(), Blocks.AIR);
                level.blockUpdated(pos.south(), Blocks.AIR);
            }
            return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
        }
        else if(context.getHorizontalDirection().getOpposite()==Direction.EAST){
            if(!level.isClientSide()){
                level.setBlock(pos.north(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.NORTH), 20);
                level.setBlock(pos.west(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.SOUTH), 20);
                level.setBlock(pos.west().north(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.WEST), 20);
            }
            return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
        }
        else if(context.getHorizontalDirection().getOpposite()==Direction.SOUTH){
            if(!level.isClientSide()){
                level.setBlock(pos.north().east(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.NORTH), 20);
                level.setBlock(pos.east(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.EAST), 20);
                level.setBlock(pos.north(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.WEST), 20);
            }
            return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
        }
        else{
            if(!level.isClientSide()){
                level.setBlock(pos.east(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.NORTH), 20);
                level.setBlock(pos.south().east(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.EAST), 20);
                level.setBlock(pos.south(), this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, Direction.SOUTH), 20);
            }
            return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_54794_) {
        p_54794_.add(FACING);
    }

    @Override
    public int getLightBlock(BlockState p_54460_, BlockGetter p_54461_, BlockPos p_54462_) {
        return 0;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState p_51039_, BlockGetter p_51040_, BlockPos p_51041_) {
        return false;
    }

    @Override
    public BlockState getPlant(BlockGetter world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return defaultBlockState();
        return state;
    }
}
