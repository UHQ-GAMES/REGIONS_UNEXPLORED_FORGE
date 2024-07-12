package net.regions_unexplored.data.worldgen.features;

import net.minecraft.core.Direction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ClampedNormalFloat;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformFloat;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.EnvironmentScanPlacement;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.registry.ConfiguredFeatureRegistry;
import net.regions_unexplored.registry.FeatureRegistry;
import net.regions_unexplored.world.level.block.plant.flower.GroundCoverBlock;
import net.regions_unexplored.world.level.feature.configuration.LargePointedRedstoneConfiguration;
import net.regions_unexplored.world.level.feature.configuration.PointedRedstoneClusterConfiguration;
import net.regions_unexplored.world.level.feature.configuration.PointedRedstoneConfiguration;

public class RuNetherFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_YELLOW_BIOSHROOM = ConfiguredFeatureRegistry.createKey("small_yellow_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MYCOTOXIC_MUSHROOMS = ConfiguredFeatureRegistry.createKey("patch_mycotoxic_mushrooms");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MYCOTOXIC_GRASS = ConfiguredFeatureRegistry.createKey("patch_mycotoxic_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MYCOTOXIC_DAISY = ConfiguredFeatureRegistry.createKey("patch_mycotoxic_daisy");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BRIMSPROUT = ConfiguredFeatureRegistry.createKey("patch_brimsprout");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BRIM_FLAMES = ConfiguredFeatureRegistry.createKey("patch_brim_flames");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DORCEL = ConfiguredFeatureRegistry.createKey("dorcel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRIMWOOD_SHRUB = ConfiguredFeatureRegistry.createKey("brimwood_shrub");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ROCK = ConfiguredFeatureRegistry.createKey("nether_rock");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GLISTERING_IVY = ConfiguredFeatureRegistry.createKey("patch_glistering_ivy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GLISTERING_SPROUT = ConfiguredFeatureRegistry.createKey("patch_glistering_sprout");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GLISTERING_FERN = ConfiguredFeatureRegistry.createKey("patch_glistering_fern");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GLISTERING_BLOOM = ConfiguredFeatureRegistry.createKey("patch_glistering_bloom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GLISTER_SPIRE = ConfiguredFeatureRegistry.createKey("patch_glister_spire");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GLISTER_BULB = ConfiguredFeatureRegistry.createKey("patch_glister_bulb");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_HANGING_EARLIGHT = ConfiguredFeatureRegistry.createKey("patch_hanging_earlight");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_COBALT_EARLIGHT = ConfiguredFeatureRegistry.createKey("patch_cobalt_earlight");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_COBALT_EARLIGHT = ConfiguredFeatureRegistry.createKey("tall_cobalt_earlight");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLACKSTONE_CLUSTER = ConfiguredFeatureRegistry.createKey("patch_blackstone_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_COBALT_ROOTS = ConfiguredFeatureRegistry.createKey("patch_cobalt_roots");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OBSIDIAN_SPIRE = ConfiguredFeatureRegistry.createKey("obsidian_spire");

    public static final ResourceKey<ConfiguredFeature<?, ?>> POINTED_REDSTONE_NETHER = ConfiguredFeatureRegistry.createKey("pointed_redstone_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_POINTED_REDSTONE_NETHER = ConfiguredFeatureRegistry.createKey("large_pointed_redstone_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POINTED_REDSTONE_CLUSTER_NETHER = ConfiguredFeatureRegistry.createKey("pointed_redstone_cluster_nether");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MYCOTOXIC_NYLIUM_BONEMEAL = ConfiguredFeatureRegistry.createKey("mycotoxic_nylium_bonemeal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLISTERING_NYLIUM_BONEMEAL = ConfiguredFeatureRegistry.createKey("glistering_nylium_bonemeal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_NYLIUM_BONEMEAL = ConfiguredFeatureRegistry.createKey("cobalt_nylium_bonemeal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRIMSPROUT_NYLIUM_BONEMEAL = ConfiguredFeatureRegistry.createKey("brimsprout_nylium_bonemeal");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        SimpleWeightedRandomList.Builder<BlockState> mycotoxicMushroomsBuilder = SimpleWeightedRandomList.builder();
        SimpleWeightedRandomList.Builder mycotoxicBoneMealBlocks = SimpleWeightedRandomList.builder().add(RuBlocks.MYCOTOXIC_GRASS.get().defaultBlockState(), 100).add(RuBlocks.YELLOW_BIOSHROOM.get().defaultBlockState(), 7);
        SimpleWeightedRandomList.Builder glisteringBoneMealBlocks = SimpleWeightedRandomList.builder().add(RuBlocks.GLISTERING_SPROUT.get().defaultBlockState(), 140).add(RuBlocks.GLISTERING_BLOOM.get().defaultBlockState(), 30).add(RuBlocks.GLISTERING_BLOOM.get().defaultBlockState(), 10);
        SimpleWeightedRandomList.Builder cobaltBoneMealBlocks = SimpleWeightedRandomList.builder().add(RuBlocks.COBALT_ROOTS.get().defaultBlockState(), 100).add(RuBlocks.COBALT_EARLIGHT.get().defaultBlockState(), 2);
        SimpleWeightedRandomList.Builder brimsproutBoneMealBlocks = SimpleWeightedRandomList.builder().add(RuBlocks.BRIMSPROUT.get().defaultBlockState(), 140).add(RuBlocks.DORCEL.get().defaultBlockState(), 1);
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                mycotoxicMushroomsBuilder.add(RuBlocks.MYCOTOXIC_MUSHROOMS.get().defaultBlockState().setValue(GroundCoverBlock.AMOUNT, Integer.valueOf(i)).setValue(GroundCoverBlock.FACING, direction), 1);
            }
        }
        WeightedStateProvider mycotoxicWeights = new WeightedStateProvider(mycotoxicBoneMealBlocks);
        WeightedStateProvider glisteringWeights = new WeightedStateProvider(glisteringBoneMealBlocks);
        WeightedStateProvider cobaltWeights = new WeightedStateProvider(cobaltBoneMealBlocks);
        WeightedStateProvider brimsproutWeights = new WeightedStateProvider(brimsproutBoneMealBlocks);

        register(context, SMALL_YELLOW_BIOSHROOM, FeatureRegistry.SMALL_YELLOW_BIOSHROOM.get(), FeatureConfiguration.NONE);
        register(context, PATCH_MYCOTOXIC_MUSHROOMS, Feature.RANDOM_PATCH, new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(mycotoxicMushroomsBuilder)))));
        register(context, PATCH_MYCOTOXIC_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.MYCOTOXIC_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_MYCOTOXIC_DAISY, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.MYCOTOXIC_DAISY.get().defaultBlockState()), 16));

        register(context, PATCH_BRIMSPROUT, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.BRIMSPROUT.get().defaultBlockState()), 32));
        register(context, PATCH_BRIM_FLAMES, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.FIRE.defaultBlockState()), 12));
        register(context, DORCEL, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.DORCEL.get())));
        register(context, BRIMWOOD_SHRUB, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.BRIMWOOD_SHRUB.get())));

        register(context, NETHER_ROCK, FeatureRegistry.NETHER_ROCK.get(), FeatureConfiguration.NONE);
        register(context, PATCH_GLISTERING_IVY, FeatureRegistry.GLISTERING_IVY.get(), FeatureConfiguration.NONE);
        register(context, PATCH_GLISTERING_SPROUT, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.GLISTERING_SPROUT.get().defaultBlockState()), 32));
        register(context, PATCH_GLISTERING_FERN, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.GLISTERING_FERN.get().defaultBlockState())));
        register(context, PATCH_GLISTERING_BLOOM, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.GLISTERING_BLOOM.get().defaultBlockState())));
        register(context, PATCH_GLISTER_SPIRE, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.GLISTER_SPIRE.get().defaultBlockState()), 16));
        register(context, PATCH_GLISTER_BULB, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.GLISTER_BULB.get().defaultBlockState())));

        register(context, PATCH_HANGING_EARLIGHT, FeatureRegistry.HANGING_EARLIGHT.get(), FeatureConfiguration.NONE);
        register(context, PATCH_BLACKSTONE_CLUSTER, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.BLACKSTONE_CLUSTER.get().defaultBlockState()), 16));
        register(context, PATCH_COBALT_EARLIGHT, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.COBALT_EARLIGHT.get().defaultBlockState()), 6));
        register(context, TALL_COBALT_EARLIGHT, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.TALL_COBALT_EARLIGHT.get().defaultBlockState())));
        register(context, PATCH_COBALT_ROOTS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.COBALT_ROOTS.get().defaultBlockState()), 32));
        register(context, OBSIDIAN_SPIRE, FeatureRegistry.OBSIDIAN_SPIRE.get(), FeatureConfiguration.NONE);

        register(context, POINTED_REDSTONE_NETHER, Feature.SIMPLE_RANDOM_SELECTOR, new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(FeatureRegistry.POINTED_REDSTONE.get(), new PointedRedstoneConfiguration(0.5F, 0.7F, 0.5F, 0.5F), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1))), PlacementUtils.inlinePlaced(FeatureRegistry.POINTED_REDSTONE.get(), new PointedRedstoneConfiguration(0.5F, 0.7F, 0.5F, 0.5F), EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1))))));
        register(context, LARGE_POINTED_REDSTONE_NETHER, FeatureRegistry.LARGE_POINTED_REDSTONE.get(), new LargePointedRedstoneConfiguration(30, UniformInt.of(1, 6), UniformFloat.of(0.4F, 2.0F), 0.33F, UniformFloat.of(0.3F, 0.9F), UniformFloat.of(0.4F, 1.0F), UniformFloat.of(0.0F, 0.3F), 4, 0.6F));
        register(context, POINTED_REDSTONE_CLUSTER_NETHER, FeatureRegistry.POINTED_REDSTONE_CLUSTER.get(), new PointedRedstoneClusterConfiguration(12, UniformInt.of(3, 6), UniformInt.of(2, 8), 1, 3, UniformInt.of(2, 4), UniformFloat.of(0.3F, 0.7F), ClampedNormalFloat.of(0.0F, 0.0F, 0.0F, 0.0F), 0.1F, 3, 8));

        //BONEMEALS

        register(context, MYCOTOXIC_NYLIUM_BONEMEAL, Feature.NETHER_FOREST_VEGETATION, new NetherForestVegetationConfig(mycotoxicWeights, 3, 1));
        register(context, GLISTERING_NYLIUM_BONEMEAL, Feature.NETHER_FOREST_VEGETATION, new NetherForestVegetationConfig(glisteringWeights, 3, 1));
        register(context, COBALT_NYLIUM_BONEMEAL, Feature.NETHER_FOREST_VEGETATION, new NetherForestVegetationConfig(cobaltWeights, 3, 1));
        register(context, BRIMSPROUT_NYLIUM_BONEMEAL, Feature.NETHER_FOREST_VEGETATION, new NetherForestVegetationConfig(brimsproutWeights, 3, 1));
    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int i) {
        return FeatureUtils.simpleRandomPatchConfiguration(i, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(stateProvider)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
