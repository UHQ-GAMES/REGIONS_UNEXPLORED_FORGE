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

public class SakuraFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<SakuraFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec((placer) -> {
        return foliagePlacerParts(placer).and(placer.group(IntProvider.codec(4, 16).fieldOf("height").forGetter((height) -> {
            return height.height;
        }), Codec.floatRange(0.0F, 1.0F).fieldOf("flower_decoration_chance").forGetter((flowerChance) -> {
            return flowerChance.flowerDecorationChance;
        }))).apply(placer, SakuraFoliagePlacer::new);
    });
    private final IntProvider height;
    private final float flowerDecorationChance;

    public SakuraFoliagePlacer(IntProvider ip1, IntProvider ip2, IntProvider height, float flowerDecorationChance) {
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


    protected void createFoliage(LevelSimulatedReader level, FoliageSetter setter, RandomSource random, TreeConfiguration treeConfig, int p_272975_, FoliageAttachment foliage, int p_273647_, int p_273700_, int height) {
        BlockPos blockpos = foliage.pos().above(height);
        if(random.nextInt(2)==0){
            placeLeavesBlobLeft(level,setter,random,treeConfig,blockpos);
        }
        else{
            placeLeavesBlobRight(level,setter,random,treeConfig,blockpos);
        }
    }

    public boolean placeLeavesBlobLeft(LevelSimulatedReader level, FoliageSetter setter, RandomSource random, TreeConfiguration treeConfiguration, BlockPos pos) {
        placeLeavesTopLeft(level, setter, random, treeConfiguration, pos);
        placeLeavesMiddle(level, setter, random, treeConfiguration, pos.above());
        placeLeavesTopLeft(level, setter, random, treeConfiguration, pos.above().above());
        return true;
    }
    public boolean placeLeavesBlobRight(LevelSimulatedReader level, FoliageSetter setter, RandomSource random, TreeConfiguration treeConfiguration, BlockPos pos) {
        placeLeavesTopRight(level, setter, random, treeConfiguration, pos);
        placeLeavesMiddle(level, setter, random, treeConfiguration, pos.above());
        placeLeavesTopRight(level, setter, random, treeConfiguration, pos.above().above());
        return true;
    }
    public void placeLeavesMiddle(LevelSimulatedReader level, FoliageSetter setter, RandomSource random, TreeConfiguration treeConfiguration, BlockPos pos) {
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos);

        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.north());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.north().east());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.north().east().east());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.north().west());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.north().west().west());

        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.north().north());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.north().north().east());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.north().north().west());


        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.south());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.south().east());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.south().east().east());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.south().west());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.south().west().west());

        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.south().south());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.south().south().east());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.south().south().west());


        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.east());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.east().east());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.west());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.west().west());
    }
    public void placeLeavesTopLeft(LevelSimulatedReader level, FoliageSetter setter, RandomSource random, TreeConfiguration treeConfiguration, BlockPos pos) {
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos);
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.north());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.north().west());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.south());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.south().east());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.east());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.east().north());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.west());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.west().south());
    }
    public void placeLeavesTopRight(LevelSimulatedReader level, FoliageSetter setter, RandomSource random, TreeConfiguration treeConfiguration, BlockPos pos) {
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos);
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.north());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.south());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.east());
        tryPlaceLeaf(level, setter, random, treeConfiguration, pos.west());
    }


    public int foliageHeight(RandomSource p_273679_, int p_273336_, TreeConfiguration p_273643_) {
        return this.height.sample(p_273679_);
    }

    protected boolean shouldSkipLocation(RandomSource p_273294_, int p_273380_, int p_272865_, int p_272853_, int p_272631_, boolean p_273432_) {
        return false;
    }

    protected static boolean tryPlaceLeaf(LevelSimulatedReader level, FoliageSetter setter, RandomSource random, TreeConfiguration treeConfiguration, BlockPos pos) {
        if (!TreeFeature.validTreePos(level, pos)) {
            return false;
        } else {
            BlockState blockstate = treeConfiguration.foliageProvider.getState(random, pos);
            if (blockstate.hasProperty(BlockStateProperties.WATERLOGGED)) {
                blockstate = blockstate.setValue(BlockStateProperties.WATERLOGGED, Boolean.valueOf(level.isFluidAtPosition(pos, (p_225638_) -> {
                    return p_225638_.isSourceOfType(Fluids.WATER);
                })));
            }

            setter.set(pos, blockstate);
            return true;
        }
    }
}

