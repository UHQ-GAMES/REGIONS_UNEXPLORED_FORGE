package net.regions_unexplored.world.level.block.wood;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.regions_unexplored.world.level.block.state.properties.RuBlockStateProperties;

public class WillowLogBlock extends Block {
   public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
   public static final BooleanProperty MOSSED = RuBlockStateProperties.MOSSED;

   public WillowLogBlock(Properties p_55926_) {
      super(p_55926_);
      this.registerDefaultState(this.defaultBlockState().setValue(AXIS, Direction.Axis.Y).setValue(MOSSED, false));
   }

   public BlockState rotate(BlockState p_55930_, Rotation p_55931_) {
      return rotatePillar(p_55930_, p_55931_);
   }

   public static BlockState rotatePillar(BlockState p_154377_, Rotation p_154378_) {
      switch (p_154378_) {
         case COUNTERCLOCKWISE_90:
         case CLOCKWISE_90:
            switch ((Direction.Axis)p_154377_.getValue(AXIS)) {
               case X:
                  return p_154377_.setValue(AXIS, Direction.Axis.Z);
               case Z:
                  return p_154377_.setValue(AXIS, Direction.Axis.X);
               default:
                  return p_154377_;
            }
         default:
            return p_154377_;
      }
   }

   @Override
   public BlockState updateShape(BlockState state, Direction direction, BlockState state1, LevelAccessor level, BlockPos pos, BlockPos pos1) {
      boolean mossed = false;

      if(level.getBlockState(pos.above()).is(Blocks.MOSS_CARPET)||level.getBlockState(pos.above()).is(Blocks.MOSS_BLOCK)){
         mossed = true;
      }

      return state.setValue(MOSSED, mossed);
   }

   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_55933_) {
      p_55933_.add(AXIS, MOSSED);
   }

   public BlockState getStateForPlacement(BlockPlaceContext context) {
      boolean mossed = false;


      if(context.getLevel().getBlockState(context.getClickedPos().above()).is(Blocks.MOSS_CARPET)||context.getLevel().getBlockState(context.getClickedPos().above()).is(Blocks.MOSS_BLOCK)){
         mossed = true;
      }

      return this.defaultBlockState().setValue(AXIS, context.getClickedFace().getAxis()).setValue(MOSSED, mossed);
   }
}