package net.regions_unexplored.world.level.block.aquatic;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.Shapes;
import net.regions_unexplored.block.RuBlocks;
import org.jetbrains.annotations.Nullable;

public class FlouraminePlantBlock extends GrowingPlantBodyBlock implements LiquidBlockContainer {
    public static final MapCodec<FlouraminePlantBlock> CODEC = simpleCodec(FlouraminePlantBlock::new);

    public MapCodec<FlouraminePlantBlock> codec() {
        return CODEC;
    }

    public FlouraminePlantBlock(BlockBehaviour.Properties p_54323_) {
        super(p_54323_, Direction.UP, Shapes.block(), true);
    }

    protected FlouramineBlock getHeadBlock() {
        return (FlouramineBlock) RuBlocks.FLOURAMINE.get();
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        return this.getHeadBlock().onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

    public boolean canAttachTo(BlockState state) {
        return this.getHeadBlock().canAttachTo(state);
    }

    @Override
    public boolean canPlaceLiquid(@Nullable Player player, BlockGetter blockGetter, BlockPos blockPos, BlockState blockState, Fluid fluid) {
        return false;
    }

    @Override
    public boolean placeLiquid(LevelAccessor levelAccessor, BlockPos blockPos, BlockState blockState, FluidState fluidState) {
        return false;
    }

    protected FluidState getFluidState(BlockState p_54336_) {
        return Fluids.WATER.getSource(false);
    }
}
