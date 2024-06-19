package net.regions_unexplored.world.level.block.aquatic.flouramine;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.block.RuBlocks;
import org.jetbrains.annotations.Nullable;

public class FlouramineBlock extends GrowingPlantHeadBlock implements LiquidBlockContainer {
   public static final MapCodec<FlouramineBlock> CODEC = simpleCodec(FlouramineBlock::new);
   protected static final VoxelShape SHAPE = Block.box(2.0D, 2.0D, 2.0D, 14.0D, 14.0D, 14.0D);
   private static final double GROW_PER_TICK_PROBABILITY = 0.14D;

   public MapCodec<FlouramineBlock> codec() {
      return CODEC;
   }

   public FlouramineBlock(BlockBehaviour.Properties p_54300_) {
      super(p_54300_, Direction.UP, SHAPE, true, 0.14D);
   }

   @Override
   public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
      super.tick(state, level, pos, random);
   }

   @Override
   public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
      if (!level.isClientSide) {
         if (!(entity instanceof WaterAnimal)) {
            level.removeBlock(pos, true);
            BlockPos.MutableBlockPos pos1 = pos.below().mutable();
            while(level.getBlockState(pos1).is(RuBlocks.FLOURAMINE.get())||level.getBlockState(pos1).is(RuBlocks.FLOURAMINE_PLANT.get())){
               level.removeBlock(pos1, true);
               pos1.move(Direction.DOWN);
            }
            explode(level, pos);
         }
      }
   }

   @Override
   public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
      ItemStack item = player.getMainHandItem();
      if (!level.isClientSide) {
         if(!item.getAllEnchantments().containsKey(Enchantments.SILK_TOUCH)){
            level.removeBlock(pos, true);
            BlockPos.MutableBlockPos pos1 = pos.below().mutable();
            while(level.getBlockState(pos1).is(RuBlocks.FLOURAMINE.get())||level.getBlockState(pos1).is(RuBlocks.FLOURAMINE_PLANT.get())){
               level.removeBlock(pos1, true);
               pos1.move(Direction.DOWN);
            }
            explode(level, pos);
         }
      }
      return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
   }

   @Override
   public void onBlockExploded(BlockState state, Level level, BlockPos pos, Explosion explosion) {
      super.onBlockExploded(state, level, pos, explosion);
   }

   protected void explode(Level level, BlockPos pos) {
      float f = 4.0F;
      level.explode(null, pos.getX()+0.5, pos.getY()+0.5, pos.getZ()+0.5, f, Level.ExplosionInteraction.BLOCK);
   }

   protected boolean canGrowInto(BlockState p_54321_) {
      return p_54321_.is(Blocks.WATER);
   }

   protected Block getBodyBlock() {
      return RuBlocks.FLOURAMINE_PLANT.get();
   }

   public boolean canAttachTo(BlockState p_153455_) {
      return !p_153455_.is(Blocks.MAGMA_BLOCK);
   }

   public boolean canPlaceLiquid(@Nullable Player p_299149_, BlockGetter p_54304_, BlockPos p_54305_, BlockState p_54306_, Fluid p_54307_) {
      return false;
   }

   public boolean placeLiquid(LevelAccessor p_54309_, BlockPos p_54310_, BlockState p_54311_, FluidState p_54312_) {
      return false;
   }

   protected int getBlocksToGrowWhenBonemealed(RandomSource p_221366_) {
      return 1;
   }

   @Nullable
   public BlockState getStateForPlacement(BlockPlaceContext p_54302_) {
      FluidState fluidstate = p_54302_.getLevel().getFluidState(p_54302_.getClickedPos());
      return fluidstate.is(FluidTags.WATER) && fluidstate.getAmount() == 8 ? super.getStateForPlacement(p_54302_) : null;
   }

   public FluidState getFluidState(BlockState p_54319_) {
      return Fluids.WATER.getSource(false);
   }
}