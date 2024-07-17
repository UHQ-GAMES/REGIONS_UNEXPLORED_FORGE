package net.regions_unexplored.world.level.feature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.data.tags.RuTags;
import net.regions_unexplored.world.level.block.aquatic.TallHyacinthStockBlock;
import net.regions_unexplored.world.level.block.state.properties.TallHyacinthStockShape;
import net.regions_unexplored.world.level.feature.configuration.HyacinthStockConfiguration;

import java.util.Random;

public class HyacinthStockFeature extends Feature<HyacinthStockConfiguration> {

    public HyacinthStockFeature(Codec<HyacinthStockConfiguration> codec) {
        super(codec);
    }

    public boolean place(FeaturePlaceContext<HyacinthStockConfiguration> context) {
        HyacinthStockConfiguration stockConfiguration = context.config();
        BlockPos pos = context.origin();
        RandomSource randomSource = context.random();
        WorldGenLevel level = context.level();
        int height_main = context.random().nextInt(stockConfiguration.sizeVariation) + stockConfiguration.minimumSize;

        if(!level.getBlockState(pos.below()).isFaceSturdy(level, pos, Direction.UP)){
           return false;
        }

        int placeCheck = 0;
        BlockPos.MutableBlockPos placePos = pos.mutable();
        while (placeCheck <= height_main) {
            if(level.getBlockState(placePos).is(Blocks.WATER)){
                placePlant(level, placePos, randomSource, stockConfiguration);
            }
            else{
                break;
            }
            placePos.move(Direction.UP);
            placeCheck = placeCheck + 1;
        }
        return true;
    }

    public boolean placePlant(LevelAccessor level, BlockPos pos, RandomSource randomSource, HyacinthStockConfiguration stockConfiguration) {
        Random random = new Random();
        if(level.isOutsideBuildHeight(pos)){
            return true;
        }
        if(!level.getBlockState(pos.below()).is(RuBlocks.TALL_HYACINTH_STOCK.get())){
            level.setBlock(pos, stockConfiguration.stockProvider.getState(randomSource, pos), 2);
        }
        if(level.getBlockState(pos.below())==RuBlocks.TALL_HYACINTH_STOCK.get().defaultBlockState()){
            level.setBlock(pos, stockConfiguration.stockProvider.getState(randomSource, pos).setValue(TallHyacinthStockBlock.SHAPE, TallHyacinthStockShape.TIP), 2);
            level.setBlock(pos.below(), stockConfiguration.stockProvider.getState(randomSource, pos.below()).setValue(TallHyacinthStockBlock.SHAPE, TallHyacinthStockShape.BASE_FRUSTUM), 2);
        }
        if(level.getBlockState(pos.below().below())==RuBlocks.TALL_HYACINTH_STOCK.get().defaultBlockState().setValue(TallHyacinthStockBlock.SHAPE, TallHyacinthStockShape.BASE_FRUSTUM)){
            level.setBlock(pos, stockConfiguration.stockProvider.getState(randomSource, pos).setValue(TallHyacinthStockBlock.SHAPE, TallHyacinthStockShape.TIP), 2);
            level.setBlock(pos.below(), stockConfiguration.stockProvider.getState(randomSource, pos.below()).setValue(TallHyacinthStockBlock.SHAPE, TallHyacinthStockShape.FRUSTUM), 2);
            level.setBlock(pos.below().below(), stockConfiguration.stockProvider.getState(randomSource, pos.below().below()).setValue(TallHyacinthStockBlock.SHAPE, TallHyacinthStockShape.BASE), 2);
        }
        if(level.getBlockState(pos.below().below())==RuBlocks.TALL_HYACINTH_STOCK.get().defaultBlockState().setValue(TallHyacinthStockBlock.SHAPE, TallHyacinthStockShape.FRUSTUM)){
            level.setBlock(pos, stockConfiguration.stockProvider.getState(randomSource, pos).setValue(TallHyacinthStockBlock.SHAPE, TallHyacinthStockShape.TIP), 2);
            level.setBlock(pos.below(), stockConfiguration.stockProvider.getState(randomSource, pos.below()).setValue(TallHyacinthStockBlock.SHAPE, TallHyacinthStockShape.FRUSTUM), 2);
            level.setBlock(pos.below().below(), stockConfiguration.stockProvider.getState(randomSource, pos.below().below()).setValue(TallHyacinthStockBlock.SHAPE, TallHyacinthStockShape.MIDDLE), 2);
        }
        return true;
    }
    
    public static boolean isReplaceableDirtBlock(BlockState state) {
        return state.is(RuTags.TREE_GRASS_REPLACEABLES);
    }


    public static boolean isReplaceableDirt(LevelSimulatedReader reader, BlockPos pos) {
        return reader.isStateAtPosition(pos, HyacinthStockFeature::isReplaceableDirtBlock);
    }

    public static boolean isReplaceableBlock(BlockState state) {
        return state.is(RuTags.REPLACEABLE_BLOCKS);
    }

    public static boolean isReplaceable(LevelSimulatedReader reader, BlockPos pos) {
        return reader.isStateAtPosition(pos, HyacinthStockFeature::isReplaceableBlock);
    }
}