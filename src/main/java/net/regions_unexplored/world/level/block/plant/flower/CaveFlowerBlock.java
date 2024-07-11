package net.regions_unexplored.world.level.block.plant.flower;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.PlantType;

public class CaveFlowerBlock extends BushBlock {
    protected static final float AABB_OFFSET = 3.0F;
    protected static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 10.0D, 13.0D);
    private final Holder<MobEffect> suspiciousStewEffect;
    private final int effectDuration;

    public CaveFlowerBlock(Holder<MobEffect> effect, int duration, Properties properties) {
        super(properties);
        this.suspiciousStewEffect = effect;
        if (effect.get().isInstantenous()) {
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
    protected MapCodec<? extends BushBlock> codec() {
        return null;
    }
}