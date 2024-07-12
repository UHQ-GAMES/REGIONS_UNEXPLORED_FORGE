package net.regions_unexplored.data.worldgen.placement;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ClampedNormalInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.data.worldgen.features.RuNetherFeatures;
import net.regions_unexplored.data.worldgen.features.RuVegetationFeatures;
import net.regions_unexplored.registry.PlacedFeatureRegistry;

import java.util.List;

public class RuNetherPlacements {
    public static final ResourceKey<PlacedFeature> SMALL_YELLOW_BIOSHROOM = PlacedFeatureRegistry.createKey("small_yellow_bioshroom");
    public static final ResourceKey<PlacedFeature> MYCOTOXIC_MUSHROOMS = PlacedFeatureRegistry.createKey("mycotoxic_mushrooms");
    public static final ResourceKey<PlacedFeature> MYCOTOXIC_GRASS = PlacedFeatureRegistry.createKey("mycotoxic_grass");
    public static final ResourceKey<PlacedFeature> MYCOTOXIC_DAISY = PlacedFeatureRegistry.createKey("mycotoxic_daisy");
    public static final ResourceKey<PlacedFeature> MYCOTOXIC_BIOSHROOM = PlacedFeatureRegistry.createKey("mycotoxic_bioshroom");

    public static final ResourceKey<PlacedFeature> BRIMSPROUT = PlacedFeatureRegistry.createKey("brimsprout");
    public static final ResourceKey<PlacedFeature> BRIM_FLAMES = PlacedFeatureRegistry.createKey("brim_flames");
    public static final ResourceKey<PlacedFeature> DORCEL = PlacedFeatureRegistry.createKey("dorcel");
    public static final ResourceKey<PlacedFeature> BRIMWOOD_SHRUB = PlacedFeatureRegistry.createKey("brimwood_shrub");

    public static final ResourceKey<PlacedFeature> GLISTERING_MEADOW_ROCK = PlacedFeatureRegistry.createKey("glistering_meadow_rock");
    public static final ResourceKey<PlacedFeature> GLISTERING_IVY = PlacedFeatureRegistry.createKey("glistering_ivy");
    public static final ResourceKey<PlacedFeature> GLISTERING_SPROUT = PlacedFeatureRegistry.createKey("glistering_sprout");
    public static final ResourceKey<PlacedFeature> GLISTERING_FERN = PlacedFeatureRegistry.createKey("glistering_fern");
    public static final ResourceKey<PlacedFeature> GLISTERING_BLOOM = PlacedFeatureRegistry.createKey("glistering_bloom");
    public static final ResourceKey<PlacedFeature> GLISTER_SPIRE = PlacedFeatureRegistry.createKey("glister_spire");
    public static final ResourceKey<PlacedFeature> GLISTER_BULB = PlacedFeatureRegistry.createKey("glister_bulb");

    public static final ResourceKey<PlacedFeature> HANGING_EARLIGHT = PlacedFeatureRegistry.createKey("hanging_earlight");
    public static final ResourceKey<PlacedFeature> COBALT_ROOTS = PlacedFeatureRegistry.createKey("cobalt_roots");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_CLUSTER = PlacedFeatureRegistry.createKey("blackstone_cluster");
    public static final ResourceKey<PlacedFeature> COBALT_EARLIGHT = PlacedFeatureRegistry.createKey("cobalt_earlight");
    public static final ResourceKey<PlacedFeature> TALL_COBALT_EARLIGHT = PlacedFeatureRegistry.createKey("tall_cobalt_earlight");
    public static final ResourceKey<PlacedFeature> OBSIDIAN_SPIRE = PlacedFeatureRegistry.createKey("obsidian_spire");

    public static final ResourceKey<PlacedFeature>  POINTED_REDSTONE_NETHER = PlacedFeatureRegistry.createKey("pointed_redstone_nether");
    public static final ResourceKey<PlacedFeature>  LARGE_POINTED_REDSTONE_NETHER = PlacedFeatureRegistry.createKey("large_pointed_redstone_nether");
    public static final ResourceKey<PlacedFeature>  POINTED_REDSTONE_CLUSTER_NETHER = PlacedFeatureRegistry.createKey("pointed_redstone_cluster_nether");
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>> SMALL_YELLOW_BIOSHROOM = featureGetter.getOrThrow(RuNetherFeatures.SMALL_YELLOW_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> MYCOTOXIC_MUSHROOMS = featureGetter.getOrThrow(RuNetherFeatures.PATCH_MYCOTOXIC_MUSHROOMS);
        final Holder<ConfiguredFeature<?, ?>> MYCOTOXIC_GRASS = featureGetter.getOrThrow(RuNetherFeatures.PATCH_MYCOTOXIC_GRASS);
        final Holder<ConfiguredFeature<?, ?>> MYCOTOXIC_DAISY = featureGetter.getOrThrow(RuNetherFeatures.PATCH_MYCOTOXIC_DAISY);
        final Holder<ConfiguredFeature<?, ?>> MYCOTOXIC_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_YELLOW_BIOSHROOM);

        final Holder<ConfiguredFeature<?, ?>> BRIMSPROUT = featureGetter.getOrThrow(RuNetherFeatures.PATCH_BRIMSPROUT);
        final Holder<ConfiguredFeature<?, ?>> BRIM_FLAMES = featureGetter.getOrThrow(RuNetherFeatures.PATCH_BRIM_FLAMES);
        final Holder<ConfiguredFeature<?, ?>> DORCEL = featureGetter.getOrThrow(RuNetherFeatures.DORCEL);
        final Holder<ConfiguredFeature<?, ?>> BRIMWOOD_SHRUB = featureGetter.getOrThrow(RuNetherFeatures.BRIMWOOD_SHRUB);

        final Holder<ConfiguredFeature<?, ?>> GLISTERING_MEADOW_ROCK = featureGetter.getOrThrow(RuNetherFeatures.NETHER_ROCK);
        final Holder<ConfiguredFeature<?, ?>> GLISTERING_IVY = featureGetter.getOrThrow(RuNetherFeatures.PATCH_GLISTERING_IVY);
        final Holder<ConfiguredFeature<?, ?>> GLISTERING_SPROUT = featureGetter.getOrThrow(RuNetherFeatures.PATCH_GLISTERING_SPROUT);
        final Holder<ConfiguredFeature<?, ?>> GLISTERING_FERN = featureGetter.getOrThrow(RuNetherFeatures.PATCH_GLISTERING_FERN);
        final Holder<ConfiguredFeature<?, ?>> GLISTERING_BLOOM = featureGetter.getOrThrow(RuNetherFeatures.PATCH_GLISTERING_BLOOM);
        final Holder<ConfiguredFeature<?, ?>> GLISTER_SPIRE = featureGetter.getOrThrow(RuNetherFeatures.PATCH_GLISTER_SPIRE);
        final Holder<ConfiguredFeature<?, ?>> GLISTER_BULB = featureGetter.getOrThrow(RuNetherFeatures.PATCH_GLISTER_BULB);

        final Holder<ConfiguredFeature<?, ?>> HANGING_EARLIGHT = featureGetter.getOrThrow(RuNetherFeatures.PATCH_HANGING_EARLIGHT);
        final Holder<ConfiguredFeature<?, ?>> COBALT_ROOTS = featureGetter.getOrThrow(RuNetherFeatures.PATCH_COBALT_ROOTS);
        final Holder<ConfiguredFeature<?, ?>> BLACKSTONE_CLUSTER = featureGetter.getOrThrow(RuNetherFeatures.PATCH_BLACKSTONE_CLUSTER);
        final Holder<ConfiguredFeature<?, ?>> COBALT_EARLIGHT = featureGetter.getOrThrow(RuNetherFeatures.PATCH_COBALT_EARLIGHT);
        final Holder<ConfiguredFeature<?, ?>> TALL_COBALT_EARLIGHT = featureGetter.getOrThrow(RuNetherFeatures.TALL_COBALT_EARLIGHT);
        final Holder<ConfiguredFeature<?, ?>> OBSIDIAN_SPIRE = featureGetter.getOrThrow(RuNetherFeatures.OBSIDIAN_SPIRE);

        final Holder<ConfiguredFeature<?, ?>> POINTED_REDSTONE_NETHER = featureGetter.getOrThrow(RuNetherFeatures.POINTED_REDSTONE_NETHER);
        final Holder<ConfiguredFeature<?, ?>> LARGE_POINTED_REDSTONE_NETHER = featureGetter.getOrThrow(RuNetherFeatures.LARGE_POINTED_REDSTONE_NETHER);
        final Holder<ConfiguredFeature<?, ?>> POINTED_REDSTONE_CLUSTER_NETHER = featureGetter.getOrThrow(RuNetherFeatures.POINTED_REDSTONE_CLUSTER_NETHER);

        register(context, RuNetherPlacements.SMALL_YELLOW_BIOSHROOM, SMALL_YELLOW_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(1), PlacementUtils.filteredByBlockSurvival(RuBlocks.MYCOTOXIC_GRASS.get()), BiomeFilter.biome()));
        register(context, RuNetherPlacements.MYCOTOXIC_MUSHROOMS, MYCOTOXIC_MUSHROOMS, List.of(CountOnEveryLayerPlacement.of(1),  NoiseThresholdCountPlacement.of(-0.8D, 5, 12), BiomeFilter.biome()));
        register(context, RuNetherPlacements.MYCOTOXIC_GRASS, MYCOTOXIC_GRASS, List.of(CountOnEveryLayerPlacement.of(30), BiomeFilter.biome()));
        register(context, RuNetherPlacements.MYCOTOXIC_DAISY, MYCOTOXIC_DAISY, List.of(CountOnEveryLayerPlacement.of(5), BiomeFilter.biome()));
        register(context, RuNetherPlacements.MYCOTOXIC_BIOSHROOM, MYCOTOXIC_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(7), PlacementUtils.filteredByBlockSurvival(RuBlocks.STONE_BUD.get()), BiomeFilter.biome()));

        register(context, RuNetherPlacements.BRIMSPROUT, BRIMSPROUT, List.of(CountOnEveryLayerPlacement.of(30), BiomeFilter.biome()));
        register(context, RuNetherPlacements.BRIM_FLAMES, BRIM_FLAMES, List.of(CountOnEveryLayerPlacement.of(5), PlacementUtils.filteredByBlockSurvival(RuBlocks.BRIMSPROUT.get()), BiomeFilter.biome()));
        register(context, RuNetherPlacements.DORCEL, DORCEL, List.of(CountOnEveryLayerPlacement.of(2), PlacementUtils.filteredByBlockSurvival(RuBlocks.BRIMSPROUT.get()), BiomeFilter.biome()));
        register(context, RuNetherPlacements.BRIMWOOD_SHRUB, BRIMWOOD_SHRUB, List.of(CountOnEveryLayerPlacement.of(1), PlacementUtils.filteredByBlockSurvival(RuBlocks.BRIMSPROUT.get()), BiomeFilter.biome()));

        register(context, RuNetherPlacements.GLISTERING_MEADOW_ROCK, GLISTERING_MEADOW_ROCK, CountOnEveryLayerPlacement.of(1), PlacementUtils.filteredByBlockSurvival(RuBlocks.GLISTERING_NYLIUM.get()), BiomeFilter.biome());
        register(context, RuNetherPlacements.GLISTERING_IVY, GLISTERING_IVY, CountPlacement.of(155), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
        register(context, RuNetherPlacements.GLISTERING_SPROUT, GLISTERING_SPROUT, List.of(CountOnEveryLayerPlacement.of(30), BiomeFilter.biome()));
        register(context, RuNetherPlacements.GLISTERING_FERN, GLISTERING_FERN, List.of(CountOnEveryLayerPlacement.of(15), BiomeFilter.biome()));
        register(context, RuNetherPlacements.GLISTERING_BLOOM, GLISTERING_BLOOM, List.of(CountOnEveryLayerPlacement.of(7), BiomeFilter.biome()));
        register(context, RuNetherPlacements.GLISTER_SPIRE, GLISTER_SPIRE, List.of(CountOnEveryLayerPlacement.of(3), BiomeFilter.biome()));
        register(context, RuNetherPlacements.GLISTER_BULB, GLISTER_BULB, List.of(CountOnEveryLayerPlacement.of(2), BiomeFilter.biome()));

        register(context, RuNetherPlacements.HANGING_EARLIGHT, HANGING_EARLIGHT, CountPlacement.of(225), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
        register(context, RuNetherPlacements.COBALT_ROOTS, COBALT_ROOTS, List.of(CountOnEveryLayerPlacement.of(8), BiomeFilter.biome()));
        register(context, RuNetherPlacements.BLACKSTONE_CLUSTER, BLACKSTONE_CLUSTER, List.of(CountOnEveryLayerPlacement.of(4), PlacementUtils.filteredByBlockSurvival(RuBlocks.STONE_BUD.get()), BiomeFilter.biome()));
        register(context, RuNetherPlacements.COBALT_EARLIGHT, COBALT_EARLIGHT, List.of(CountOnEveryLayerPlacement.of(3), BiomeFilter.biome()));
        register(context, RuNetherPlacements.TALL_COBALT_EARLIGHT, TALL_COBALT_EARLIGHT, List.of(CountOnEveryLayerPlacement.of(3), BiomeFilter.biome()));
        register(context, RuNetherPlacements.OBSIDIAN_SPIRE, OBSIDIAN_SPIRE, CountPlacement.of(155), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());

        register(context, RuNetherPlacements.POINTED_REDSTONE_NETHER, POINTED_REDSTONE_NETHER, CountPlacement.of(UniformInt.of(192, 256)), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, CountPlacement.of(UniformInt.of(1, 5)), RandomOffsetPlacement.of(ClampedNormalInt.of(0.0F, 3.0F, -10, 10), ClampedNormalInt.of(0.0F, 0.6F, -2, 2)), BiomeFilter.biome());
        register(context, RuNetherPlacements.LARGE_POINTED_REDSTONE_NETHER, LARGE_POINTED_REDSTONE_NETHER, CountPlacement.of(UniformInt.of(10, 48)), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
        register(context, RuNetherPlacements.POINTED_REDSTONE_CLUSTER_NETHER, POINTED_REDSTONE_CLUSTER_NETHER, CountPlacement.of(UniformInt.of(78, 126)), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
    }

    protected static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}
