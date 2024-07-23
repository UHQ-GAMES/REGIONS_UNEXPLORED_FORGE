package net.regions_unexplored.world.level.block.plant.sapling;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.block.RuBlocks;

public class RuCactusSaplingBlock extends SaplingBlock implements BonemealableBlock {
    protected static final float AABB_OFFSET = 6.0F;
    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);

    public RuCactusSaplingBlock(TreeGrower treeGrower, Properties properties) {
        super(treeGrower, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(STAGE, Integer.valueOf(0)));
    }

    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource randomSource) {
        if ((level.getMaxLocalRawBrightness(pos.above()) >= 9 && randomSource.nextInt(7) == 0)&&(!(level.getBlockState(pos.below()).is(Blocks.CACTUS)||level.getBlockState(pos.below()).is(RuBlocks.SAGUARO_CACTUS.get())))) {
            this.advanceTree(level, pos, state, randomSource);
        }
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos p_51030_) {
        BlockPos blockpos = p_51030_.below();
        return mayPlaceOn(level.getBlockState(blockpos), level, blockpos);
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(BlockTags.SAND) || state.is(BlockTags.DIRT) || state.is(Blocks.FARMLAND)|| state.is(RuBlocks.SAGUARO_CACTUS.get())|| state.is(Blocks.CACTUS);
    }

    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}

