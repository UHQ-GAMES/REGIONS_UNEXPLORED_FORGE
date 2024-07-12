package net.regions_unexplored.world.features.treedecorators;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.data.tags.RuTags;

import java.util.Random;

public class WillowTrunkDecorator extends TrunkVineDecorator {
	public static final WillowTrunkDecorator INSTANCE = new WillowTrunkDecorator();
	public static MapCodec<WillowTrunkDecorator> codec;
	public static TreeDecoratorType<?> tdt;
	static {
		codec = MapCodec.unit(() -> INSTANCE);
		tdt = new TreeDecoratorType<>(codec);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return tdt;
	}

	@Override
	public void place(Context context) {
		BlockPos newpos = context.logs().get(0);
		if(context.level().isStateAtPosition(newpos, WillowTrunkDecorator::isGrass)){
			newpos=newpos.above();
		}
		placeRoot(context, newpos.north());
		placeRoot(context, newpos.east());
		placeRoot(context, newpos.south());
		placeRoot(context, newpos.west());
		placeLog(context, newpos.north().above());
		placeLog(context, newpos.east().above());
		placeLog(context, newpos.south().above());
		placeLog(context, newpos.west().above());
		placeLog(context, newpos.north().above(2));
		placeLog(context, newpos.east().above(2));
		placeLog(context, newpos.south().above(2));
		placeLog(context, newpos.west().above(2));
	}

	public void placeRoot(Context context, BlockPos pos) {
		LevelSimulatedReader level = context.level();
		Random random = new Random();
		int rd = random.nextInt(2)+4;
		int i = 0;
		BlockPos.MutableBlockPos placePos = pos.mutable();
		while(i<=rd){
			if(isReplaceable(level, placePos)&&level.isStateAtPosition(placePos.above(), WillowTrunkDecorator::isDirt)){
				context.setBlock(placePos, Blocks.HANGING_ROOTS.defaultBlockState());
				break;
			}
			placeLog(context, placePos);
			placePos.move(Direction.DOWN);
			i++;
		}
	}
	public void placeLog(Context context, BlockPos pos) {
		LevelSimulatedReader level = context.level();
		
		if(level.isStateAtPosition(pos, WillowTrunkDecorator::isForestGrass)){
			context.setBlock(pos, RuBlocks.PEAT_DIRT.get().defaultBlockState());
		}
		else if(level.isStateAtPosition(pos, WillowTrunkDecorator::isPlainsGrass)){
			context.setBlock(pos, RuBlocks.SILT_DIRT.get().defaultBlockState());
		}
		else if(level.isStateAtPosition(pos, WillowTrunkDecorator::isGrass)){
			context.setBlock(pos, Blocks.DIRT.defaultBlockState());
		}
		else if(isReplaceable(level, pos)) {
			context.setBlock(pos, RuBlocks.WILLOW_LOG.get().defaultBlockState());
		}
		else{
			return ;
		}

		if(level.isStateAtPosition(pos, WillowTrunkDecorator::isForestGrass)){
			context.setBlock(pos.below(), RuBlocks.PEAT_DIRT.get().defaultBlockState());
		}
		else if(level.isStateAtPosition(pos, WillowTrunkDecorator::isPlainsGrass)){
			context.setBlock(pos.below(), RuBlocks.SILT_DIRT.get().defaultBlockState());
		}
		else if(level.isStateAtPosition(pos, WillowTrunkDecorator::isGrass)){
			context.setBlock(pos.below(), Blocks.DIRT.defaultBlockState());
		}
	}

	public static boolean isGrass(BlockState state) {
		return state.is(Blocks.GRASS_BLOCK)
				||state.is(Blocks.MYCELIUM)
				||state.is(Blocks.DIRT)
				||state.is(RuBlocks.ALPHA_GRASS_BLOCK.get());
	}
	public static boolean isForestGrass(BlockState state) {
		return state.is(RuBlocks.PEAT_GRASS_BLOCK.get())
				||state.is(RuBlocks.PEAT_DIRT.get());
	}
	public static boolean isPlainsGrass(BlockState state) {
		return state.is(RuBlocks.SILT_GRASS_BLOCK.get())
				||state.is(RuBlocks.SILT_DIRT.get());
	}
	public static boolean isDirt(BlockState state) {
		return state.is(BlockTags.DIRT);
	}
	public static boolean isAllGrass(BlockState state) {
		return state.is(Blocks.GRASS_BLOCK)
				||state.is(Blocks.MYCELIUM)
				||state.is(Blocks.DIRT)
				||state.is(RuBlocks.PEAT_GRASS_BLOCK.get())
				||state.is(RuBlocks.SILT_GRASS_BLOCK.get())
				||state.is(RuBlocks.ALPHA_GRASS_BLOCK.get())
				||state.is(RuBlocks.PEAT_DIRT.get())
				||state.is(RuBlocks.SILT_DIRT.get());
	}

	public static boolean isReplaceableBlock(BlockState state) {
		return state.is(RuTags.REPLACEABLE_BLOCKS);
	}
	public static boolean isReplaceable(LevelSimulatedReader reader, BlockPos pos) {
		return reader.isStateAtPosition(pos, WillowTrunkDecorator::isReplaceableBlock);
	}
}

