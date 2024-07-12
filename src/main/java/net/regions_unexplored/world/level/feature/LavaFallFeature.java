package net.regions_unexplored.world.level.feature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.material.Fluids;

public class LavaFallFeature extends Feature<NoneFeatureConfiguration> {

    public LavaFallFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        BlockPos pos = context.origin();
        WorldGenLevel level = context.level();

        if (level.getBlockState(pos.below()).isAir()&&!level.getBlockState(pos).isAir()){
            return false;
        }

        BlockPos.MutableBlockPos placePos = pos.mutable();

        while (level.getBlockState(placePos).isAir()){
            if (level.isOutsideBuildHeight(placePos)){
                return false;
            }
            placePos.move(Direction.UP);
        }

        if(level.getBlockState(placePos).is(BlockTags.BASE_STONE_OVERWORLD)) {
            if (level.getBlockState(placePos.above()).is(BlockTags.BASE_STONE_OVERWORLD)) {
                level.setBlock(placePos, Fluids.LAVA.defaultFluidState().createLegacyBlock(), 2);
                level.scheduleTick(placePos, Fluids.LAVA.defaultFluidState().getType(), 2);
                level.setBlock(placePos.above(), Blocks.MAGMA_BLOCK.defaultBlockState(), 2);
                return true;
            }
        }
        return false;
    }
}