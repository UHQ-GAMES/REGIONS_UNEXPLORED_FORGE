package net.regions_unexplored.world.level.block.plant.other;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.world.level.block.state.properties.RuBlockStateProperties;
import net.regions_unexplored.world.level.block.state.properties.WillowShape;

public class WillowVinesBlock extends Block {
    public static final MapCodec<? extends WillowVinesBlock> CODEC = simpleCodec(WillowVinesBlock::new);
    public static final EnumProperty<WillowShape> SHAPE = RuBlockStateProperties.WILLOW_SHAPE;
    protected static final VoxelShape BOX = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public WillowVinesBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(SHAPE, WillowShape.END));
    }

    @Override
    protected MapCodec<? extends WillowVinesBlock> codec() {
        return CODEC;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(SHAPE);
    }
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        Vec3 vec3 = state.getOffset(getter, pos);
        return BOX.move(vec3.x, vec3.y, vec3.z);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockpos = pos.above();
        return mayPlaceOn(level.getBlockState(blockpos), level, pos);
    }

    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        if(state.is(RuBlocks.WILLOW_VINES.get())&&getter.getBlockState(pos.above(2)).is(RuBlocks.WILLOW_VINES.get())&&getter.getBlockState(pos.above(3)).is(RuBlocks.WILLOW_VINES.get()))
        {return false;}
        return state.isFaceSturdy(getter, pos.above(), Direction.DOWN) || state.is(RuBlocks.WILLOW_VINES.get())|| state.is(RuBlocks.WILLOW_LEAVES.get()) || state.is(BlockTags.LEAVES);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState state1, LevelAccessor level, BlockPos pos, BlockPos pos1) {
        WillowShape shape;

        if(level.getBlockState(pos.below()) == RuBlocks.WILLOW_VINES.get().defaultBlockState().setValue(SHAPE, WillowShape.END)) {
            shape = WillowShape.MIDDLE;
        }
        else if(level.getBlockState(pos.below()) == RuBlocks.WILLOW_VINES.get().defaultBlockState().setValue(SHAPE, WillowShape.MIDDLE)) {
            shape = WillowShape.BASE;
        }
        else{
            shape = WillowShape.END;
        }

        if(!this.canSurvive(state, level, pos)){
            return Blocks.AIR.defaultBlockState();
        }
        return state.setValue(SHAPE, shape);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(SHAPE, WillowShape.END);
    }
}

