package net.regions_unexplored.world.level.feature.aquatic;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.material.Fluids;
import net.regions_unexplored.world.level.block.plant.tall.ShrubBlock;
import net.regions_unexplored.world.level.feature.configuration.ShrubConfiguration;

public class AquaticShrubFeature extends Feature<ShrubConfiguration> {

    public AquaticShrubFeature(Codec<ShrubConfiguration> codec) {
        super(codec);
    }

    public boolean place(FeaturePlaceContext<ShrubConfiguration> context) {
        ShrubConfiguration shrubConfiguration = context.config();
        BlockPos pos = context.origin();
        RandomSource randomSource = context.random();
        WorldGenLevel level = context.level();


        if(level.isOutsideBuildHeight(pos.above())) {
            return false;
        }

        if(level.getBlockState(pos).is(Blocks.WATER) && level.getBlockState(pos.above()).is(Blocks.WATER)) {
                placeSapling(level, pos, shrubConfiguration.saplingProvider.getState(randomSource, pos));
            return true;
        }
        return false;
    }

    public void placeSapling(WorldGenLevel level, BlockPos pos, BlockState state){
        level.setBlock(pos, state.setValue(ShrubBlock.HALF, DoubleBlockHalf.LOWER), 2);
        level.setBlock(pos.above(), state.setValue(ShrubBlock.HALF, DoubleBlockHalf.UPPER), 2);
    }
}