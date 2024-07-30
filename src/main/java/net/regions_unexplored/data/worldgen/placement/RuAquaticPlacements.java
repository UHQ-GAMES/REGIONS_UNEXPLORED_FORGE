package net.regions_unexplored.data.worldgen.placement;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.SurfaceRuleData;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.regions_unexplored.data.worldgen.features.RuAquaticFeatures;
import net.regions_unexplored.data.worldgen.features.RuVegetationFeatures;
import net.regions_unexplored.registry.PlacedFeatureRegistry;

import java.util.List;

public class RuAquaticPlacements {
    //0.6.0
    public static final ResourceKey<PlacedFeature> AIR_CORAL = PlacedFeatureRegistry.createKey("air_coral");
    public static final ResourceKey<PlacedFeature> FLOURAMINE = PlacedFeatureRegistry.createKey("flouramine");

    public static final ResourceKey<PlacedFeature> CATTAIL_FEN = PlacedFeatureRegistry.createKey("cattail_fen");
    public static final ResourceKey<PlacedFeature> CATTAIL_RIVER = PlacedFeatureRegistry.createKey("cattail_river");

    public static final ResourceKey<PlacedFeature> TALL_HYACINTH_STOCK = PlacedFeatureRegistry.createKey("tall_hyacinth_stock");
    public static final ResourceKey<PlacedFeature> HYACINTH_PLANTS = PlacedFeatureRegistry.createKey("hyacinth_plants");
    public static final ResourceKey<PlacedFeature> HYACINTH_FLOWERS = PlacedFeatureRegistry.createKey("hyacinth_flowers");
    public static final ResourceKey<PlacedFeature> HYACINTH_ROCKS = PlacedFeatureRegistry.createKey("hyacinth_rocks");

    public static final ResourceKey<PlacedFeature> MOSSY_SEA_ROCKS = PlacedFeatureRegistry.createKey("mossy_sea_rocks");
    public static final ResourceKey<PlacedFeature> BLUE_MAGNOLIA_FLOWERS_AQUATIC = PlacedFeatureRegistry.createKey("red_magnolia_flowers_aquatic");
    public static final ResourceKey<PlacedFeature> PINK_MAGNOLIA_FLOWERS_AQUATIC = PlacedFeatureRegistry.createKey("pink_magnolia_flowers_aquatic");
    public static final ResourceKey<PlacedFeature> WHITE_MAGNOLIA_FLOWERS_AQUATIC = PlacedFeatureRegistry.createKey("white_magnolia_flowers_aquatic");
    public static final ResourceKey<PlacedFeature> JUNGLE_TREE_AQUATIC = PlacedFeatureRegistry.createKey("jungle_tree_aquatic");
    public static final ResourceKey<PlacedFeature> PALM_TREE_AQUATIC = PlacedFeatureRegistry.createKey("palm_tree_aquatic");
    public static final ResourceKey<PlacedFeature> ELEPHANT_EAR_AQUATIC = PlacedFeatureRegistry.createKey("elephant_ear_aquatic");
    public static final ResourceKey<PlacedFeature> PALM_SAPLING_AQUATIC = PlacedFeatureRegistry.createKey("palm_sapling_aquatic");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        //0.6.0
        final Holder<ConfiguredFeature<?, ?>> AIR_CORAL = featureGetter.getOrThrow(RuAquaticFeatures.AIR_CORAL);
        final Holder<ConfiguredFeature<?, ?>> FLOURAMINE = featureGetter.getOrThrow(RuAquaticFeatures.FLOURAMINE);

        final Holder<ConfiguredFeature<?, ?>> FEN_CATTAIL = featureGetter.getOrThrow(RuAquaticFeatures.FEN_CATTAIL);
        final Holder<ConfiguredFeature<?, ?>> WATER_CATTAIL = featureGetter.getOrThrow(RuAquaticFeatures.WATER_CATTAIL);

        final Holder<ConfiguredFeature<?, ?>> TALL_HYACINTH_STOCK = featureGetter.getOrThrow(RuAquaticFeatures.TALL_HYACINTH_STOCK);
        final Holder<ConfiguredFeature<?, ?>> HYACINTH_PLANTS = featureGetter.getOrThrow(RuAquaticFeatures.HYACINTH_PLANTS);
        final Holder<ConfiguredFeature<?, ?>> HYACINTH_FLOWERS = featureGetter.getOrThrow(RuAquaticFeatures.HYACINTH_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> HYACINTH_ROCKS = featureGetter.getOrThrow(RuAquaticFeatures.HYACINTH_ROCKS);

        final Holder<ConfiguredFeature<?, ?>> MOSSY_SEA_ROCKS = featureGetter.getOrThrow(RuAquaticFeatures.MOSSY_SEA_ROCKS);
        final Holder<ConfiguredFeature<?, ?>> BLUE_MAGNOLIA_FLOWERS_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.BLUE_MAGNOLIA_FLOWERS_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> PINK_MAGNOLIA_FLOWERS_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.PINK_MAGNOLIA_FLOWERS_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> WHITE_MAGNOLIA_FLOWERS_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.WHITE_MAGNOLIA_FLOWERS_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> JUNGLE_TREE_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.JUNGLE_TREE_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> PALM_TREE_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.PALM_TREE_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> ELEPHANT_EAR_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.ELEPHANT_EAR_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> PALM_SAPLING_AQUATIC = featureGetter.getOrThrow(RuVegetationFeatures.PALM_SHRUB);
        //0.6.0
        register(context, RuAquaticPlacements.AIR_CORAL, AIR_CORAL, NoiseBasedCountPlacement.of(20, 10.0D, -0.25D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.TALL_SEAGRASS), BiomeFilter.biome());
        register(context, RuAquaticPlacements.FLOURAMINE, FLOURAMINE, NoiseBasedCountPlacement.of(80, 10.0D, 0.3D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());

        register(context, RuAquaticPlacements.CATTAIL_FEN, FEN_CATTAIL, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 24), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(3), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome()));
        register(context, RuAquaticPlacements.CATTAIL_RIVER, WATER_CATTAIL, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 6), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(3), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome()));

        register(context, RuAquaticPlacements.TALL_HYACINTH_STOCK, TALL_HYACINTH_STOCK, NoiseBasedCountPlacement.of(20, 80.0D, 0.3D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.HYACINTH_PLANTS, HYACINTH_PLANTS, seagrassPlacement(80));
        register(context, RuAquaticPlacements.HYACINTH_FLOWERS, HYACINTH_FLOWERS, CountPlacement.of(15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.HYACINTH_ROCKS, HYACINTH_ROCKS, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.MOSSY_SEA_ROCKS, MOSSY_SEA_ROCKS, NoiseBasedCountPlacement.of(1, 80.0D, 0.3D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());

        register(context, RuAquaticPlacements.BLUE_MAGNOLIA_FLOWERS_AQUATIC, BLUE_MAGNOLIA_FLOWERS_AQUATIC, CountPlacement.of(35), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.PINK_MAGNOLIA_FLOWERS_AQUATIC, PINK_MAGNOLIA_FLOWERS_AQUATIC, CountPlacement.of(35), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.WHITE_MAGNOLIA_FLOWERS_AQUATIC, WHITE_MAGNOLIA_FLOWERS_AQUATIC, CountPlacement.of(35), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.JUNGLE_TREE_AQUATIC, JUNGLE_TREE_AQUATIC, List.of(CountPlacement.of(24), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuAquaticPlacements.PALM_TREE_AQUATIC, PALM_TREE_AQUATIC, List.of(CountPlacement.of(15), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuAquaticPlacements.PALM_SAPLING_AQUATIC, PALM_SAPLING_AQUATIC, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuAquaticPlacements.ELEPHANT_EAR_AQUATIC, ELEPHANT_EAR_AQUATIC, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

    }

    private static List<PlacementModifier> seagrassPlacement(int count) {
        return List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, CountPlacement.of(count), BiomeFilter.biome());
    }

    protected static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}
