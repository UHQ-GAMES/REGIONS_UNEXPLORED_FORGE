package net.regions_unexplored.world.level.block.plant.tall;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.material.FluidState;
import net.regions_unexplored.data.tags.RuTags;
import net.regions_unexplored.world.level.block.state.properties.RuBlockStateProperties;

import javax.annotation.Nullable;

public class RuSandyDoublePlantBlock extends DoublePlantBlock {
    public static final BooleanProperty IS_RED = RuBlockStateProperties.IS_RED;

    public RuSandyDoublePlantBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(HALF, DoubleBlockHalf.LOWER).setValue(IS_RED, false));
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(RuTags.SANDY_PLANT_CAN_SURVIVE_ON);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockpos = pos.below();
        BlockState groundState = level.getBlockState(blockpos);
        if (state.getValue(HALF) == DoubleBlockHalf.UPPER)
            return groundState.is(this) && groundState.getValue(HALF) == DoubleBlockHalf.LOWER;
        else
            return this.mayPlaceOn(groundState, level, blockpos);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_52901_) {
        p_52901_.add(HALF, IS_RED);
    }

    public void setPlacedBy(Level level, BlockPos pos, BlockState p_52874_, LivingEntity p_52875_, ItemStack p_52876_) {
        BlockPos blockpos = pos.above();
        boolean isRed = level.getBlockState(pos.below()).is(Blocks.RED_SAND);
        level.setBlock(blockpos, copyWaterloggedFrom(level, blockpos, this.defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER).setValue(IS_RED, isRed)), 3);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
        Level level = context.getLevel();
        boolean isRed = context.getLevel().getBlockState(context.getClickedPos().below()).is(TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("forge", "sand/red")));
        if(blockpos.getY() < level.getMaxBuildHeight() - 1) {
            if(level.getBlockState(blockpos.above()).canBeReplaced(context)) {
                return this.stateDefinition.any().setValue(HALF, DoubleBlockHalf.LOWER).setValue(IS_RED, isRed);
            }
        }
        return super.getStateForPlacement(context);
    }
}
