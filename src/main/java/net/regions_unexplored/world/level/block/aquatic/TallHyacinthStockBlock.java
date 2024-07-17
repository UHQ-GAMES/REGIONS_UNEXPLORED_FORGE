package net.regions_unexplored.world.level.block.aquatic;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.world.level.block.state.properties.RuBlockStateProperties;
import net.regions_unexplored.world.level.block.state.properties.TallHyacinthStockShape;
import org.jetbrains.annotations.Nullable;

public class TallHyacinthStockBlock extends Block implements LiquidBlockContainer, net.minecraftforge.common.IForgeShearable {
    public static final EnumProperty<TallHyacinthStockShape> SHAPE = RuBlockStateProperties.TALL_HYACINTH_STOCK_SHAPE;
    protected static final VoxelShape BOX = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public TallHyacinthStockBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(SHAPE, TallHyacinthStockShape.BASE_TIP));
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
        if(level.getFluidState(pos).is(Fluids.WATER)||level.getFluidState(pos).is(Fluids.FLOWING_WATER)) {
            if (level.getFluidState(pos).getAmount() != 8) {
                return false;
            }
            BlockPos blockpos = pos.below();
            return mayPlaceOn(level.getBlockState(blockpos), level, blockpos);
        }
        return false;
    }

    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.isFaceSturdy(getter, pos, Direction.UP) || state.is(RuBlocks.TALL_HYACINTH_STOCK.get());
    }


    public BlockState getStateForPlacement(BlockPlaceContext context) {
        if(!context.getLevel().getBlockState(context.getClickedPos().below()).is(RuBlocks.TALL_HYACINTH_STOCK.get())){
            return this.defaultBlockState().setValue(SHAPE, TallHyacinthStockShape.BASE_TIP);
        }
        else{
            return this.defaultBlockState().setValue(SHAPE, TallHyacinthStockShape.TIP);
        }
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState state1, LevelAccessor level, BlockPos pos, BlockPos pos1) {
        TallHyacinthStockShape shape = state.getValue(SHAPE);
        if(!level.getBlockState(pos.below()).is(RuBlocks.TALL_HYACINTH_STOCK.get())) {
            if(!level.getBlockState(pos.above()).is(RuBlocks.TALL_HYACINTH_STOCK.get())) {
                shape = TallHyacinthStockShape.BASE_TIP;
            }
            else if(level.getBlockState(pos.above()) == RuBlocks.TALL_HYACINTH_STOCK.get().defaultBlockState().setValue(SHAPE, TallHyacinthStockShape.TIP)) {
                shape = TallHyacinthStockShape.BASE_FRUSTUM;
            }
            else{
                shape = TallHyacinthStockShape.BASE;
            }
        }
        else{
            if(!level.getBlockState(pos.above()).is(RuBlocks.TALL_HYACINTH_STOCK.get())) {
                shape = TallHyacinthStockShape.TIP;
            }
            else if(level.getBlockState(pos.above()) == RuBlocks.TALL_HYACINTH_STOCK.get().defaultBlockState().setValue(SHAPE, TallHyacinthStockShape.TIP)) {
                shape = TallHyacinthStockShape.FRUSTUM;
            }
            else if(level.getBlockState(pos.above()) == RuBlocks.TALL_HYACINTH_STOCK.get().defaultBlockState().setValue(SHAPE, TallHyacinthStockShape.FRUSTUM)) {
                shape = TallHyacinthStockShape.MIDDLE;
            }
        }

        if(!this.canSurvive(state, level, pos)){
            return Blocks.AIR.defaultBlockState();
        }
        return state.setValue(SHAPE, shape);
    }

    public FluidState getFluidState(BlockState p_154537_) {
        return Fluids.WATER.getSource(false);
    }

    @Override
    public boolean canPlaceLiquid(@Nullable Player p_300220_, BlockGetter p_54766_, BlockPos p_54767_, BlockState p_54768_, Fluid p_54769_) {
        return false;
    }

    public boolean placeLiquid(LevelAccessor p_154520_, BlockPos p_154521_, BlockState p_154522_, FluidState p_154523_) {
        return false;
    }
}

