package net.regions_unexplored.data.worldgen.features;

import net.minecraft.core.Direction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ClampedNormalFloat;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformFloat;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedBlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.placement.EnvironmentScanPlacement;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.registry.ConfiguredFeatureRegistry;
import net.regions_unexplored.registry.FeatureRegistry;
import net.regions_unexplored.world.level.block.other.AshBlock;
import net.regions_unexplored.world.level.block.wood.AspenLogBlock;
import net.regions_unexplored.world.level.feature.configuration.FallenTreeConfiguration;
import net.regions_unexplored.world.level.feature.configuration.LargePointedRedstoneConfiguration;
import net.regions_unexplored.world.level.feature.configuration.PointedRedstoneClusterConfiguration;
import net.regions_unexplored.world.level.feature.configuration.PointedRedstoneConfiguration;

import java.util.List;

public class RuMiscOverworldFeatures {
    //-----------------------KEYS-----------------------//
    public static final ResourceKey<ConfiguredFeature<?, ?>> DISK_CLAY = ConfiguredFeatureRegistry.createKey("disk_clay");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DISK_GRAVEL = ConfiguredFeatureRegistry.createKey("disk_gravel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DISK_SAND = ConfiguredFeatureRegistry.createKey("disk_sand");
    //ROCKS
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDWOODS_ROCK = ConfiguredFeatureRegistry.createKey("redwoods_rock");
    //FALLEN_TREES
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_LARCH_TREE = ConfiguredFeatureRegistry.createKey("fallen_larch_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_MAPLE_TREE = ConfiguredFeatureRegistry.createKey("fallen_maple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_OAK_TREE = ConfiguredFeatureRegistry.createKey("fallen_oak_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_OAK_TREE_WITH_BLOB = ConfiguredFeatureRegistry.createKey("fallen_oak_tree_with_blob");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_PINE_TREE = ConfiguredFeatureRegistry.createKey("fallen_pine_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_SNOW_PINE_TREE = ConfiguredFeatureRegistry.createKey("fallen_snow_pine_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_SILVER_BIRCH_TREE = ConfiguredFeatureRegistry.createKey("fallen_silver_birch_tree");
    //CAVE_FEATURES
    public static final ResourceKey<ConfiguredFeature<?, ?>> POINTED_REDSTONE = ConfiguredFeatureRegistry.createKey("pointed_redstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_POINTED_REDSTONE = ConfiguredFeatureRegistry.createKey("large_pointed_redstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POINTED_REDSTONE_CLUSTER = ConfiguredFeatureRegistry.createKey("pointed_redstone_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_REDSTONE_LARGE = ConfiguredFeatureRegistry.createKey("ore_redstone_large");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PRISMARITE_CLUSTERS = ConfiguredFeatureRegistry.createKey("prismarite_clusters");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HANGING_PRISMARITE_CLUSTER = ConfiguredFeatureRegistry.createKey("hanging_prismarite_cluster");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERAL_POOL = ConfiguredFeatureRegistry.createKey("mineral_pool");

    public static final ResourceKey<ConfiguredFeature<?, ?>> LAVA_FALL = ConfiguredFeatureRegistry.createKey("lava_fall");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LAVA_DELTA = ConfiguredFeatureRegistry.createKey("overworld_lava_delta");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASH_VENT = ConfiguredFeatureRegistry.createKey("ash_vent");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_BLOB = ConfiguredFeatureRegistry.createKey("basalt_blob");
    //OTHER_FEATURES
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_PATCH_WITH_WATER = ConfiguredFeatureRegistry.createKey("moss_patch_with_water");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARSH = ConfiguredFeatureRegistry.createKey("marsh");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WATER_EDGE = ConfiguredFeatureRegistry.createKey("water_edge");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ICICLE_UP = ConfiguredFeatureRegistry.createKey("icicle_up");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMOULDERING_DIRT = ConfiguredFeatureRegistry.createKey("smouldering_dirt");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEADOW_ROCK = ConfiguredFeatureRegistry.createKey("meadow_rock");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROCK = ConfiguredFeatureRegistry.createKey("rock");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_NOISE_PUMPKINS = ConfiguredFeatureRegistry.createKey("patch_noise_pumpkins");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_NOISE_ROCKS = ConfiguredFeatureRegistry.createKey("patch_noise_rocks");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_NOISE_BUSH = ConfiguredFeatureRegistry.createKey("patch_noise_bush");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);
        RuleTest baseStoneTest = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
        RuleTest stoneOreTest = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateOreTest = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        List<OreConfiguration.TargetBlockState> ORE_REDSTONE_TARGET_LIST = List.of(OreConfiguration.target(stoneOreTest, Blocks.REDSTONE_ORE.defaultBlockState()), OreConfiguration.target(deepslateOreTest, Blocks.DEEPSLATE_REDSTONE_ORE.defaultBlockState()));
        List<OreConfiguration.TargetBlockState> STONE_GRASS_TARGET_LIST = List.of(OreConfiguration.target(stoneOreTest, RuBlocks.STONE_GRASS_BLOCK.get().defaultBlockState()), OreConfiguration.target(deepslateOreTest, RuBlocks.DEEPSLATE_GRASS_BLOCK.get().defaultBlockState()));

        //---------------------FEATURES---------------------//
        register(context, DISK_CLAY, Feature.DISK, new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.CLAY), BlockPredicate.matchesBlocks(List.of(Blocks.DIRT, RuBlocks.PEAT_DIRT.get(), RuBlocks.SILT_DIRT.get(), RuBlocks.SILT_MUD.get(), RuBlocks.PEAT_MUD.get(), Blocks.CLAY)), UniformInt.of(2, 3), 1));
        register(context, DISK_GRAVEL, Feature.DISK, new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.GRAVEL), BlockPredicate.matchesBlocks(List.of(Blocks.DIRT, RuBlocks.PEAT_DIRT.get(), RuBlocks.SILT_DIRT.get(), RuBlocks.SILT_MUD.get(), RuBlocks.PEAT_MUD.get(), RuBlocks.SILT_GRASS_BLOCK.get(), RuBlocks.PEAT_GRASS_BLOCK.get(),  Blocks.GRASS_BLOCK)), UniformInt.of(2, 5), 2));
        register(context, DISK_SAND, Feature.DISK, new DiskConfiguration(new RuleBasedBlockStateProvider(BlockStateProvider.simple(Blocks.SAND), List.of(new RuleBasedBlockStateProvider.Rule(BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.AIR), BlockStateProvider.simple(Blocks.SANDSTONE)))), BlockPredicate.matchesBlocks(List.of(Blocks.DIRT, RuBlocks.PEAT_DIRT.get(), RuBlocks.SILT_DIRT.get(), RuBlocks.SILT_MUD.get(), RuBlocks.PEAT_MUD.get(), RuBlocks.SILT_GRASS_BLOCK.get(), RuBlocks.PEAT_GRASS_BLOCK.get(),  Blocks.GRASS_BLOCK)), UniformInt.of(2, 6), 2));
        //ROCKS
        register(context, REDWOODS_ROCK, Feature.FOREST_ROCK, new BlockStateConfiguration(Blocks.MOSSY_COBBLESTONE.defaultBlockState()));
        //FALLEN_TREES
        register(context, FALLEN_LARCH_TREE, FeatureRegistry.FALLEN_BLOB_TREE.get(), new FallenTreeConfiguration(BlockStateProvider.simple(RuBlocks.LARCH_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.LARCH_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.GOLDEN_LARCH_LEAVES.get().defaultBlockState()), 5, 9, false));
        register(context, FALLEN_MAPLE_TREE, FeatureRegistry.FALLEN_BLOB_TREE.get(), new FallenTreeConfiguration(BlockStateProvider.simple(RuBlocks.MAPLE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.MAPLE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.MAPLE_LEAVES.get().defaultBlockState()), 4, 4, false));
        register(context, FALLEN_OAK_TREE, FeatureRegistry.FALLEN_BLOB_TREE.get(), new FallenTreeConfiguration(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), BlockStateProvider.simple(RuBlocks.DEAD_LEAVES.get().defaultBlockState()), 4, 4, false));
        register(context, FALLEN_OAK_TREE_WITH_BLOB, FeatureRegistry.FALLEN_BLOB_TREE.get(), new FallenTreeConfiguration(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), BlockStateProvider.simple(RuBlocks.DEAD_LEAVES.get().defaultBlockState()), 4, 4, true));
        register(context, FALLEN_PINE_TREE, FeatureRegistry.FALLEN_BLOB_TREE.get(), new FallenTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_LEAVES.get().defaultBlockState()), 5, 6, false));
        register(context, FALLEN_SNOW_PINE_TREE, FeatureRegistry.FALLEN_SNOW_TREE.get(), new FallenTreeConfiguration(BlockStateProvider.simple(RuBlocks.STRIPPED_PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.STRIPPED_PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_LEAVES.get().defaultBlockState()), 5, 6, false));
        register(context, FALLEN_SILVER_BIRCH_TREE, FeatureRegistry.FALLEN_BLOB_TREE.get(), new FallenTreeConfiguration(BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_LOG.get().defaultBlockState().setValue(AspenLogBlock.IS_BASE, true)), BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_LEAVES.get().defaultBlockState()), 4, 3, false));
        //CAVE_FEATURES
        register(context, POINTED_REDSTONE, Feature.SIMPLE_RANDOM_SELECTOR, new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(FeatureRegistry.POINTED_REDSTONE.get(), new PointedRedstoneConfiguration(0.5F, 0.7F, 0.5F, 0.5F), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1))), PlacementUtils.inlinePlaced(FeatureRegistry.POINTED_REDSTONE.get(), new PointedRedstoneConfiguration(0.5F, 0.7F, 0.5F, 0.5F), EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1))))));
        register(context, LARGE_POINTED_REDSTONE, FeatureRegistry.LARGE_POINTED_REDSTONE.get(), new LargePointedRedstoneConfiguration(30, UniformInt.of(1, 6), UniformFloat.of(0.4F, 2.0F), 0.33F, UniformFloat.of(0.3F, 0.9F), UniformFloat.of(0.4F, 1.0F), UniformFloat.of(0.0F, 0.3F), 4, 0.6F));
        register(context, POINTED_REDSTONE_CLUSTER, FeatureRegistry.POINTED_REDSTONE_CLUSTER.get(), new PointedRedstoneClusterConfiguration(12, UniformInt.of(3, 6), UniformInt.of(2, 8), 1, 3, UniformInt.of(2, 4), UniformFloat.of(0.3F, 0.7F), ClampedNormalFloat.of(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
        register(context, ORE_REDSTONE_LARGE, Feature.ORE, new OreConfiguration(ORE_REDSTONE_TARGET_LIST, 20));

        register(context, PRISMARITE_CLUSTERS, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.LARGE_PRISMARITE_CLUSTER.get().defaultBlockState(), 1).add(RuBlocks.PRISMARITE_CLUSTER.get().defaultBlockState(), 5)), 32));
        register(context, HANGING_PRISMARITE_CLUSTER, FeatureRegistry.HANGING_PRISMARITE.get(), FeatureConfiguration.NONE);

        register(context, MINERAL_POOL, Feature.WATERLOGGED_VEGETATION_PATCH, new VegetationPatchConfiguration(BlockTags.LUSH_GROUND_REPLACEABLE, BlockStateProvider.simple(Blocks.CALCITE), PlacementUtils.inlinePlaced(holderGetter.getOrThrow(CaveFeatures.POINTED_DRIPSTONE)), CaveSurface.FLOOR, ConstantInt.of(3), 0.8F, 5, 0.1F, UniformInt.of(4, 7), 0.7F));

        register(context, LAVA_FALL, FeatureRegistry.LAVA_FALL.get(), FeatureConfiguration.NONE);
        register(context, OVERWORLD_LAVA_DELTA, FeatureRegistry.OVERWORLD_LAVA_DELTA.get(), new VegetationPatchConfiguration(BlockTags.LUSH_GROUND_REPLACEABLE, BlockStateProvider.simple(RuBlocks.VOLCANIC_ASH.get().defaultBlockState().setValue(AshBlock.HAS_GRAVITY, false)), PlacementUtils.inlinePlaced(holderGetter.getOrThrow(CaveFeatures.POINTED_DRIPSTONE)), CaveSurface.FLOOR, ConstantInt.of(3), 0.8F, 5, 0.1F, UniformInt.of(4, 7), 0.7F));
        register(context, ASH_VENT, FeatureRegistry.ASH_VENT.get(), FeatureConfiguration.NONE);
        register(context, BASALT_BLOB, FeatureRegistry.BASALT_BLOB.get(), new ColumnFeatureConfiguration(ConstantInt.of(1), UniformInt.of(1, 4)));
        //OTHER_FEATURES
        register(context, MOSS_PATCH_WITH_WATER, Feature.WATERLOGGED_VEGETATION_PATCH, new VegetationPatchConfiguration(BlockTags.LUSH_GROUND_REPLACEABLE, BlockStateProvider.simple(Blocks.MOSS_BLOCK), PlacementUtils.inlinePlaced(holderGetter.getOrThrow(RuVegetationFeatures.PATCH_GRASS)), CaveSurface.FLOOR, ConstantInt.of(3), 0.8F, 5, 0.1F, UniformInt.of(4, 7), 0.7F));
        register(context, MARSH, FeatureRegistry.MARSH.get(), FeatureConfiguration.NONE);
        register(context, WATER_EDGE, FeatureRegistry.WATER_EDGE.get(), FeatureConfiguration.NONE);
        register(context, ICICLE_UP, FeatureRegistry.ICICLE_UP.get(), FeatureConfiguration.NONE);
        register(context, SMOULDERING_DIRT, FeatureRegistry.SMOULDERING_DIRT.get(), FeatureConfiguration.NONE);
        register(context, MEADOW_ROCK, FeatureRegistry.MEADOW_ROCK.get(), FeatureConfiguration.NONE);
        register(context, ROCK, FeatureRegistry.ROCK.get(), FeatureConfiguration.NONE);
        register(context, PATCH_NOISE_PUMPKINS, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.PUMPKIN.defaultBlockState(), 4).add(Blocks.CARVED_PUMPKIN.defaultBlockState().setValue(CarvedPumpkinBlock.FACING, Direction.NORTH), 1).add(Blocks.CARVED_PUMPKIN.defaultBlockState().setValue(CarvedPumpkinBlock.FACING, Direction.SOUTH), 1).add(Blocks.CARVED_PUMPKIN.defaultBlockState().setValue(CarvedPumpkinBlock.FACING, Direction.EAST), 1).add(Blocks.CARVED_PUMPKIN.defaultBlockState().setValue(CarvedPumpkinBlock.FACING, Direction.WEST), 1).add(Blocks.AIR.defaultBlockState(), 75))), List.of(RuBlocks.SILT_PODZOL.get(), Blocks.SNOW_BLOCK), 125));
        register(context, PATCH_NOISE_ROCKS, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.STONE_GRASS_BLOCK.get().defaultBlockState(), 1).add(RuBlocks.MOSSY_STONE.get().defaultBlockState(), 1).add(Blocks.STONE.defaultBlockState(), 1).add(Blocks.COBBLESTONE.defaultBlockState(), 1).add(Blocks.AIR.defaultBlockState(), 75))), List.of(Blocks.GRASS_BLOCK), 125));
        register(context, PATCH_NOISE_BUSH, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.MAPLE_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2).add(Blocks.OAK_LEAVES.defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2).add(Blocks.AIR.defaultBlockState(), 75))), List.of(Blocks.GRASS_BLOCK), 125));
    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int i) {
        return FeatureUtils.simpleRandomPatchConfiguration(i, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(stateProvider)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
