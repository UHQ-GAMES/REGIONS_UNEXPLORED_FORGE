package net.regions_unexplored.world.level.block.plant.nether;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.data.tags.RuTags;
import net.regions_unexplored.entity.RuDamageTypes;

public class DorcelPlantBlock extends FlowerBlock {
    protected static final float AABB_OFFSET = 6.0F;
    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    public DorcelPlantBlock(Holder<MobEffect> mobEffect, int i, Properties properties) {
        super(mobEffect, i, properties);
    }

    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        return false;
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
            entity.hurt(level.damageSources().source(RuDamageTypes.DORCEL), 1.0F);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockpos = pos.below();

        return this.mayPlaceOn(level.getBlockState(blockpos), level, blockpos);
    }

    protected boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(RuTags.BRIM_PLANT_CAN_SURVIVE_ON);
    }
}
