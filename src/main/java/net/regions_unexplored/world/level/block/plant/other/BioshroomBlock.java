package net.regions_unexplored.world.level.block.plant.other;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.PlantType;
import net.regions_unexplored.data.tags.RuTags;

public class BioshroomBlock extends SaplingBlock {
    protected static final float AABB_OFFSET = 3.0F;
    protected static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 13.0D, 13.0D);
    protected final TreeGrower treeGrower;
    private final Holder<MobEffect> suspiciousStewEffect;
    private final int effectDuration;

    public BioshroomBlock(TreeGrower tree, Holder<MobEffect> mobEffect, int duration, Properties properties) {
        super(tree, properties);
        this.treeGrower = tree;
        this.suspiciousStewEffect = mobEffect;
        if (mobEffect.get().isInstantenous()) {
            this.effectDuration = duration;
        } else {
            this.effectDuration = duration * 20;
        }
    }

    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        Vec3 vec3 = state.getOffset(getter, pos);
        return SHAPE.move(vec3.x, vec3.y, vec3.z);
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        return false;
    }

    @Override
    public PlantType getPlantType(BlockGetter getter, BlockPos pos) {
        return PlantType.CAVE;
    }

    public MobEffect getSuspiciousStewEffect() {
        return this.suspiciousStewEffect.get();
    }

    public int getEffectDuration() {
        return this.effectDuration;
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        if(level.getBlockState(pos.below()).is(RuTags.BIOSHROOM_GROW_BLOCK)) {
            return true;
        }
        else{
            return false;
        }
    }
}
