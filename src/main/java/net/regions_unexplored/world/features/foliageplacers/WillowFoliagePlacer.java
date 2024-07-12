package net.regions_unexplored.world.features.foliageplacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.material.Fluids;

import java.util.Map;

public class WillowFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<WillowFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec((placer) -> {
        return foliagePlacerParts(placer).and(placer.group(IntProvider.codec(4, 16).fieldOf("height").forGetter((height) -> {
            return height.height;
        }), Codec.floatRange(0.0F, 1.0F).fieldOf("flower_decoration_chance").forGetter((flowerChance) -> {
            return flowerChance.flowerDecorationChance;
        }))).apply(placer, WillowFoliagePlacer::new);
    });
    private final IntProvider height;
    private final float flowerDecorationChance;

    public WillowFoliagePlacer(IntProvider ip1, IntProvider ip2, IntProvider height, float flowerDecorationChance) {
        super(ip1, ip2);
        this.height = height;
        this.flowerDecorationChance = flowerDecorationChance;
    }

    public static FoliagePlacerType<?> fpt;
    static {
        fpt = new FoliagePlacerType<>(CODEC);
    }
    protected FoliagePlacerType<?> type() {
        return fpt;
    }

    protected void createFoliage(LevelSimulatedReader level, FoliageSetter setter, RandomSource random, TreeConfiguration treeConfig, int p_272975_, FoliageAttachment foliage, int j, int k, int height) {
        boolean flag = foliage.doubleTrunk();
        BlockPos blockpos = foliage.pos().above(height);
        int i = k + foliage.radiusOffset() - 1;
        //layer_1
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos);
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.north());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.south());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.east());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.north().north());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.south().south());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.east().east());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.west().west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.north().west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.north().north().west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.north().west().west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.south().west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.south().south().west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.south().west().west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.north().east());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.north().north().east());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.north().east().east());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.south().east());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.south().south().east());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.south().east().east());
        //layer_2
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().north());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().south());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().east());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().north().north());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().south().south());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().east().east());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().west().west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().north().west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().south().west());
        if(random.nextInt(3)==0) {
            tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().south().south().west());
        }
        if(random.nextInt(3)==0) {
            tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().south().west().west());
        }
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().north().east());
        if(random.nextInt(3)==0) {
            tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().north().north().east());
        }
        if(random.nextInt(3)==0) {
            tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().north().east().east());
        }
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().south().east());
        if(random.nextInt(3)==0) {
            tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().south().south().east());
        }
        if(random.nextInt(3)==0) {
            tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().south().east().east());
        }
        //layer_3
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().above());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().above().north());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().above().south());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().above().east());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above().above().west());
        //hanging
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.north().north());
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.south().south());
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.east().east());
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.west().west());
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.north().north().west());
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.north().west().west());
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.south().south().west());
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.south().west().west());
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.north().north().east());
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.north().east().east());
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.south().south().east());
        placeHangingLeaves(level, setter, random, treeConfig, blockpos.south().east().east());
    }

    public int foliageHeight(RandomSource random, int i, TreeConfiguration treeConfiguration) {
        return this.height.sample(random);
    }

    protected boolean shouldSkipLocation(RandomSource randomSource, int i, int j, int k, int l, boolean b) {
        return false;
    }

    protected static boolean tryPlaceLeaf(LevelSimulatedReader level, FoliageSetter setter, RandomSource random, TreeConfiguration treeConfiguration, BlockPos pos) {
        if (!TreeFeature.validTreePos(level, pos)) {
            return false;
        } else {
            BlockState blockstate = treeConfiguration.foliageProvider.getState(random, pos);
            if (blockstate.hasProperty(BlockStateProperties.WATERLOGGED)) {
                blockstate = blockstate.setValue(BlockStateProperties.WATERLOGGED, level.isFluidAtPosition(pos, (p_225638_) -> p_225638_.isSourceOfType(Fluids.WATER)));
            }

            setter.set(pos, blockstate);
            return true;
        }
    }

    protected static void placeHangingLeaves(LevelSimulatedReader level, FoliageSetter setter, RandomSource random, TreeConfiguration treeConfiguration, BlockPos pos) {
        int type = random.nextInt(3);
        if(type==0){
            tryPlaceLeaf(level,setter,random,treeConfiguration,pos);
        }
        else if(type==1){
            tryPlaceLeaf(level,setter,random,treeConfiguration,pos);
            tryPlaceLeaf(level,setter,random,treeConfiguration,pos.below());
        }
        else{
            tryPlaceLeaf(level,setter,random,treeConfiguration,pos);
            tryPlaceLeaf(level,setter,random,treeConfiguration,pos.below());
            tryPlaceLeaf(level,setter,random,treeConfiguration,pos.below().below());
        }
    }
}
