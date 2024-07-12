package net.regions_unexplored.data.worldgen.features;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HugeMushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.BeehiveDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.registry.ConfiguredFeatureRegistry;
import net.regions_unexplored.registry.FeatureRegistry;
import net.regions_unexplored.world.features.foliageplacers.SakuraFoliagePlacer;
import net.regions_unexplored.world.features.foliageplacers.WillowFoliagePlacer;
import net.regions_unexplored.world.features.treedecorators.ChanceWillowTrunkDecorator;
import net.regions_unexplored.world.features.treedecorators.WillowTrunkDecorator;
import net.regions_unexplored.world.level.block.leaves.AppleLeavesBlock;
import net.regions_unexplored.world.level.block.wood.BambooLogBlock;
import net.regions_unexplored.world.level.feature.configuration.GiantBioshroomConfiguration;
import net.regions_unexplored.world.level.feature.configuration.RuTreeConfiguration;

import java.util.List;
import java.util.OptionalInt;

public class RuTreeFeatures {
    //-----------------------KEYS-----------------------//
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_BLUE_BIOSHROOM = ConfiguredFeatureRegistry.createKey("giant_blue_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_GREEN_BIOSHROOM = ConfiguredFeatureRegistry.createKey("giant_green_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_PINK_BIOSHROOM = ConfiguredFeatureRegistry.createKey("giant_pink_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_YELLOW_BIOSHROOM = ConfiguredFeatureRegistry.createKey("giant_yellow_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_RED_MUSHROOM = ConfiguredFeatureRegistry.createKey("giant_red_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_BROWN_MUSHROOM = ConfiguredFeatureRegistry.createKey("giant_brown_mushroom");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BRIM_WILLOW_TREE = ConfiguredFeatureRegistry.createKey("brim_willow_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BRIM_WILLOW_TREE = ConfiguredFeatureRegistry.createKey("tall_brim_willow_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ACACIA_TREE = ConfiguredFeatureRegistry.createKey("acacia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ACACIA_TREE_SHRUB = ConfiguredFeatureRegistry.createKey("acacia_tree_shrub");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ALPHA_OAK_TREE = ConfiguredFeatureRegistry.createKey("alpha_oak_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ASHEN_TREE = ConfiguredFeatureRegistry.createKey("ashen_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASHEN_PINE_TREE = ConfiguredFeatureRegistry.createKey("ashen_pine_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BAMBOO_TREE = ConfiguredFeatureRegistry.createKey("bamboo_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MEGA_BAOBAB_TREE = ConfiguredFeatureRegistry.createKey("mega_baobab_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ULTRA_BAOBAB_TREE = ConfiguredFeatureRegistry.createKey("ultra_baobab_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERING_OAK_TREE = ConfiguredFeatureRegistry.createKey("flowering_oak_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_FLOWERING_OAK_TREE = ConfiguredFeatureRegistry.createKey("big_flowering_oak_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> APPLE_OAK_TREE = ConfiguredFeatureRegistry.createKey("apple_oak_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_APPLE_OAK_TREE = ConfiguredFeatureRegistry.createKey("big_apple_oak_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKWOOD_TREE = ConfiguredFeatureRegistry.createKey("blackwood_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_BLACKWOOD_TREE = ConfiguredFeatureRegistry.createKey("big_blackwood_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_BLACKWOOD_TREE = ConfiguredFeatureRegistry.createKey("giant_blackwood_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BIRCH_TREE_ASPEN = ConfiguredFeatureRegistry.createKey("birch_tree_aspen");

    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_TREE = ConfiguredFeatureRegistry.createKey("cobalt_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_DARK_OAK = ConfiguredFeatureRegistry.createKey("tall_dark_oak");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGNOLIA_TREE = ConfiguredFeatureRegistry.createKey("magnolia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_MAGNOLIA_TREE = ConfiguredFeatureRegistry.createKey("blue_magnolia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_MAGNOLIA_TREE = ConfiguredFeatureRegistry.createKey("pink_magnolia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_MAGNOLIA_TREE = ConfiguredFeatureRegistry.createKey("white_magnolia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_MAGNOLIA_TREE = ConfiguredFeatureRegistry.createKey("big_magnolia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_BLUE_MAGNOLIA_TREE = ConfiguredFeatureRegistry.createKey("big_blue_magnolia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_PINK_MAGNOLIA_TREE = ConfiguredFeatureRegistry.createKey("big_pink_magnolia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_WHITE_MAGNOLIA_TREE = ConfiguredFeatureRegistry.createKey("big_white_magnolia_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CYPRESS_TREE = ConfiguredFeatureRegistry.createKey("cypress_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_CYPRESS_TREE = ConfiguredFeatureRegistry.createKey("giant_cypress_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CHERRY_TREE = ConfiguredFeatureRegistry.createKey("cherry_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_BOG_TREE = ConfiguredFeatureRegistry.createKey("dead_bog_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_TREE = ConfiguredFeatureRegistry.createKey("dead_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_DEAD_TREE = ConfiguredFeatureRegistry.createKey("big_dead_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_PINE_TREE = ConfiguredFeatureRegistry.createKey("dead_pine_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_PINE_TREE_TALL = ConfiguredFeatureRegistry.createKey("dead_pine_tree_tall");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_STRIPPED_PINE_TREE = ConfiguredFeatureRegistry.createKey("dead_stripped_pine_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_STRIPPED_PINE_TREE_TALL = ConfiguredFeatureRegistry.createKey("dead_stripped_pine_tree_tall");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_STRIPPED_PINE_TREE_MOUNTAIN = ConfiguredFeatureRegistry.createKey("dead_stripped_pine_tree_mountain");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_EUCALYPTUS_TREE = ConfiguredFeatureRegistry.createKey("small_eucalyptus_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EUCALYPTUS_TREE = ConfiguredFeatureRegistry.createKey("eucalyptus_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_JOSHUA_TREE = ConfiguredFeatureRegistry.createKey("large_joshua_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDIUM_JOSHUA_TREE = ConfiguredFeatureRegistry.createKey("medium_joshua_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JOSHUA_TREE_SHRUB = ConfiguredFeatureRegistry.createKey("joshua_tree_shrub");

    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNGLE_TREE = ConfiguredFeatureRegistry.createKey("jungle_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_JUNGLE_TREE = ConfiguredFeatureRegistry.createKey("big_jungle_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> KAPOK_TREE = ConfiguredFeatureRegistry.createKey("kapok_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> LARCH_TREE = ConfiguredFeatureRegistry.createKey("larch_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_LARCH_TREE = ConfiguredFeatureRegistry.createKey("big_larch_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_LARCH_TREE = ConfiguredFeatureRegistry.createKey("larch_golden_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_GOLDEN_LARCH_TREE = ConfiguredFeatureRegistry.createKey("big_golden_larch_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MAPLE_TREE = ConfiguredFeatureRegistry.createKey("maple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_MAPLE_TREE = ConfiguredFeatureRegistry.createKey("big_maple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MAPLE_TREE = ConfiguredFeatureRegistry.createKey("red_maple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_RED_MAPLE_TREE = ConfiguredFeatureRegistry.createKey("big_red_maple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_MAPLE_TREE = ConfiguredFeatureRegistry.createKey("orange_maple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_ORANGE_MAPLE_TREE = ConfiguredFeatureRegistry.createKey("big_orange_maple_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MAUVE_OAK_BEE = ConfiguredFeatureRegistry.createKey("mauve_oak_bee");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAUVE_OAK = ConfiguredFeatureRegistry.createKey("mauve_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_MAUVE_OAK = ConfiguredFeatureRegistry.createKey("big_mauve_oak");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_TREE_WITH_BRANCH = ConfiguredFeatureRegistry.createKey("oak_tree_with_branch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_TREE_WITH_FLOWERS = ConfiguredFeatureRegistry.createKey("oak_tree_with_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_TREE = ConfiguredFeatureRegistry.createKey("oak_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_TREE_TALL = ConfiguredFeatureRegistry.createKey("oak_tree_tall");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_OAK_TREE = ConfiguredFeatureRegistry.createKey("big_oak_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_TREE_SHRUB = ConfiguredFeatureRegistry.createKey("oak_tree_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_BUSH = ConfiguredFeatureRegistry.createKey("oak_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_BUSH_WITH_FLOWERS = ConfiguredFeatureRegistry.createKey("oak_bush_with_flowers");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PALM_TREE = ConfiguredFeatureRegistry.createKey("palm_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_PALM_TREE = ConfiguredFeatureRegistry.createKey("tall_palm_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALM_TREE_SHRUB = ConfiguredFeatureRegistry.createKey("palm_tree_shrub");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_TREE = ConfiguredFeatureRegistry.createKey("pine_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_TREE_TALL = ConfiguredFeatureRegistry.createKey("pine_tree_tall");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRIPPED_PINE_TREE = ConfiguredFeatureRegistry.createKey("stripped_pine_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRIPPED_PINE_TREE_TALL = ConfiguredFeatureRegistry.createKey("stripped_pine_tree_tall");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRIPPED_PINE_TREE_MOUNTAIN = ConfiguredFeatureRegistry.createKey("stripped_pine_tree_mountain");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_TREE_SHRUB = ConfiguredFeatureRegistry.createKey("pine_tree_shrub");

    public static final ResourceKey<ConfiguredFeature<?, ?>> LUSH_PINE_TREE = ConfiguredFeatureRegistry.createKey("lush_pine_tree");
    //DONE
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAGUARO_CACTUS = ConfiguredFeatureRegistry.createKey("saguaro_cactus");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ICE_SPIRE = ConfiguredFeatureRegistry.createKey("ice_spire");
    //DONE
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_BIRCH_TREE = ConfiguredFeatureRegistry.createKey("silver_birch_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_BIRCH_TREE_TALL = ConfiguredFeatureRegistry.createKey("silver_birch_tree_tall");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ENCHANTED_BIRCH_TREE = ConfiguredFeatureRegistry.createKey("enchanted_birch_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENCHANTED_BIRCH_TREE_TALL = ConfiguredFeatureRegistry.createKey("enchanted_birch_tree_tall");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRUCE_TREE_TALL = ConfiguredFeatureRegistry.createKey("spruce_tree_tall");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRUCE_TREE_SHRUB = ConfiguredFeatureRegistry.createKey("spruce_tree_shrub");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_OAK_TREE = ConfiguredFeatureRegistry.createKey("small_oak_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_SOCOTRA_TREE = ConfiguredFeatureRegistry.createKey("large_socotra_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SOCOTRA_TREE = ConfiguredFeatureRegistry.createKey("small_socotra_tree");
    //DONE
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDWOOD_TREE = ConfiguredFeatureRegistry.createKey("redwood_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_REDWOOD_TREE = ConfiguredFeatureRegistry.createKey("giant_redwood_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ULTRA_REDWOOD_TREE = ConfiguredFeatureRegistry.createKey("ultra_redwood_tree");

    //DONE
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_TREE = ConfiguredFeatureRegistry.createKey("willow_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_WILLOW_TREE = ConfiguredFeatureRegistry.createKey("big_willow_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_TREE_VINES = ConfiguredFeatureRegistry.createKey("willow_tree_vines");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<Block> holderGetter = context.lookup(Registries.BLOCK);
        register(context, GIANT_BLUE_BIOSHROOM, FeatureRegistry.GIANT_BLUE_BIOSHROOM.get(), new GiantBioshroomConfiguration(BlockStateProvider.simple(RuBlocks.BLUE_BIOSHROOM_STEM.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.BLUE_BIOSHROOM_BLOCK.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.GLOWING_BLUE_BIOSHROOM_BLOCK.get().defaultBlockState()), 7, 7));
        register(context, GIANT_GREEN_BIOSHROOM, FeatureRegistry.GIANT_GREEN_BIOSHROOM.get(), new GiantBioshroomConfiguration(BlockStateProvider.simple(RuBlocks.GREEN_BIOSHROOM_STEM.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.GREEN_BIOSHROOM_BLOCK.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.GLOWING_GREEN_BIOSHROOM_BLOCK.get().defaultBlockState()), 8, 5));
        register(context, GIANT_PINK_BIOSHROOM, FeatureRegistry.GIANT_PINK_BIOSHROOM.get(), new GiantBioshroomConfiguration(BlockStateProvider.simple(RuBlocks.PINK_BIOSHROOM_STEM.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINK_BIOSHROOM_BLOCK.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.GLOWING_PINK_BIOSHROOM_BLOCK.get().defaultBlockState()), 7, 8));
        register(context, GIANT_YELLOW_BIOSHROOM, FeatureRegistry.GIANT_YELLOW_BIOSHROOM.get(), new GiantBioshroomConfiguration(BlockStateProvider.simple(RuBlocks.YELLOW_BIOSHROOM_STEM.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.YELLOW_BIOSHROOM_BLOCK.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.GLOWING_YELLOW_BIOSHROOM_BLOCK.get().defaultBlockState()), 5, 4));
        register(context, GIANT_BROWN_MUSHROOM, Feature.HUGE_BROWN_MUSHROOM, new HugeMushroomFeatureConfiguration(BlockStateProvider.simple(Blocks.BROWN_MUSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.valueOf(true)).setValue(HugeMushroomBlock.DOWN, Boolean.valueOf(false))), BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.valueOf(false)).setValue(HugeMushroomBlock.DOWN, Boolean.valueOf(false))), 3));
        register(context, GIANT_RED_MUSHROOM, Feature.HUGE_RED_MUSHROOM, new HugeMushroomFeatureConfiguration(BlockStateProvider.simple(Blocks.RED_MUSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.valueOf(false))), BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.valueOf(false)).setValue(HugeMushroomBlock.DOWN, Boolean.valueOf(false))), 2));

        register(context, ASHEN_TREE, FeatureRegistry.ASHEN_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.ASHEN_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.ASHEN_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.DEAD_BRANCH.get().defaultBlockState()), 12, 5));
        register(context, ASHEN_PINE_TREE, FeatureRegistry.ASHEN_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.ASHEN_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.DEAD_BRANCH.get().defaultBlockState()), 12, 7));

        register(context, BRIM_WILLOW_TREE, FeatureRegistry.BRIM_WILLOW.get(), FeatureConfiguration.NONE);
        register(context, TALL_BRIM_WILLOW_TREE, FeatureRegistry.TALL_BRIM_WILLOW.get(), FeatureConfiguration.NONE);

        register(context, ACACIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.ACACIA_LOG), new ForkingTrunkPlacer(5, 2, 2), BlockStateProvider.simple(Blocks.ACACIA_LEAVES), new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)), new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, ACACIA_TREE_SHRUB, FeatureRegistry.TREE_SHRUB.get(), new RuTreeConfiguration(BlockStateProvider.simple(Blocks.ACACIA_LOG.defaultBlockState()), BlockStateProvider.simple(Blocks.ACACIA_LEAVES.defaultBlockState()), BlockStateProvider.simple(RuBlocks.ACACIA_BRANCH.get().defaultBlockState()), 1, 3));

        register(context, ALPHA_OAK_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.ALPHA_LOG.get().defaultBlockState()), new StraightTrunkPlacer(4, 2, 0),BlockStateProvider.simple(RuBlocks.ALPHA_LEAVES.get().defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, BAMBOO_TREE, FeatureRegistry.BAMBOO_TREE.get(), new RuTreeConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.BAMBOO_LOG.get().defaultBlockState(), 1).add(RuBlocks.BAMBOO_LOG.get().defaultBlockState().setValue(BambooLogBlock.LEAVES, true), 2)), BlockStateProvider.simple(RuBlocks.BAMBOO_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.OAK_BRANCH.get().defaultBlockState()), 12, 8));

        register(context, FLOWERING_OAK_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()),new StraightTrunkPlacer(4, 3, 0),new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3).add(RuBlocks.FLOWERING_LEAVES.get().defaultBlockState(), 1)),new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, BIG_FLOWERING_OAK_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()),new FancyTrunkPlacer(8, 11, 0),new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3).add(RuBlocks.FLOWERING_LEAVES.get().defaultBlockState(), 1)),new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

        register(context, APPLE_OAK_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()),new StraightTrunkPlacer(4, 2, 0),new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 18).add(RuBlocks.APPLE_OAK_LEAVES.get().defaultBlockState(), 1).add(RuBlocks.APPLE_OAK_LEAVES.get().defaultBlockState().setValue(AppleLeavesBlock.AGE, Integer.valueOf(1)), 1).add(RuBlocks.APPLE_OAK_LEAVES.get().defaultBlockState().setValue(AppleLeavesBlock.AGE, Integer.valueOf(2)), 2).add(RuBlocks.APPLE_OAK_LEAVES.get().defaultBlockState().setValue(AppleLeavesBlock.AGE, Integer.valueOf(3)), 2).add(RuBlocks.APPLE_OAK_LEAVES.get().defaultBlockState().setValue(AppleLeavesBlock.AGE, Integer.valueOf(4)), 2)),new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, BIG_APPLE_OAK_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()),new FancyTrunkPlacer(8, 11, 0),new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 14).add(RuBlocks.APPLE_OAK_LEAVES.get().defaultBlockState(), 1).add(RuBlocks.APPLE_OAK_LEAVES.get().defaultBlockState().setValue(AppleLeavesBlock.AGE, Integer.valueOf(1)), 1).add(RuBlocks.APPLE_OAK_LEAVES.get().defaultBlockState().setValue(AppleLeavesBlock.AGE, Integer.valueOf(2)), 2).add(RuBlocks.APPLE_OAK_LEAVES.get().defaultBlockState().setValue(AppleLeavesBlock.AGE, Integer.valueOf(3)), 2).add(RuBlocks.APPLE_OAK_LEAVES.get().defaultBlockState().setValue(AppleLeavesBlock.AGE, Integer.valueOf(4)), 2)),new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(2), 3), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

        register(context, MEGA_BAOBAB_TREE, FeatureRegistry.MEGA_BAOBAB_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.BAOBAB_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.BAOBAB_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.BAOBAB_BRANCH.get()), 5, 5));
        register(context, ULTRA_BAOBAB_TREE, FeatureRegistry.ULTRA_BAOBAB_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.BAOBAB_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.BAOBAB_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.BAOBAB_BRANCH.get()), 12, 6));

        register(context, BLACKWOOD_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.BLACKWOOD_LOG.get().defaultBlockState()), new StraightTrunkPlacer(12, 4, 2), BlockStateProvider.simple(RuBlocks.BLACKWOOD_LEAVES.get().defaultBlockState()), new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(2, 2), UniformInt.of(5, 5)), new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build());
        register(context, BIG_BLACKWOOD_TREE, FeatureRegistry.BLACKWOOD_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.BLACKWOOD_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.BLACKWOOD_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.BLACKWOOD_BRANCH.get().defaultBlockState()), 19, 5));

        register(context, BIRCH_TREE_ASPEN, FeatureRegistry.ASPEN_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(Blocks.BIRCH_LOG.defaultBlockState()), BlockStateProvider.simple(Blocks.BIRCH_LEAVES.defaultBlockState()), BlockStateProvider.simple(RuBlocks.BIRCH_BRANCH.get().defaultBlockState()), 4, 3));

        register(context, COBALT_TREE, FeatureRegistry.COBALT_TREE.get(), FeatureConfiguration.NONE);

        register(context, TALL_DARK_OAK, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.DARK_OAK_LOG), new DarkOakTrunkPlacer(8, 4, 1), BlockStateProvider.simple(Blocks.DARK_OAK_LEAVES), new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)), new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())).ignoreVines().build());

        register(context, MAGNOLIA_TREE, FeatureRegistry.SAKURA_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.MAGNOLIA_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.MAGNOLIA_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.MAGNOLIA_BRANCH.get().defaultBlockState()), 1, 4));
        register(context, BLUE_MAGNOLIA_TREE, FeatureRegistry.SAKURA_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.MAGNOLIA_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.BLUE_MAGNOLIA_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.MAGNOLIA_BRANCH.get().defaultBlockState()), 1, 4));
        register(context, PINK_MAGNOLIA_TREE, FeatureRegistry.SAKURA_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.MAGNOLIA_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINK_MAGNOLIA_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.MAGNOLIA_BRANCH.get().defaultBlockState()), 1, 4));
        register(context, WHITE_MAGNOLIA_TREE, FeatureRegistry.SAKURA_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.MAGNOLIA_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.WHITE_MAGNOLIA_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.MAGNOLIA_BRANCH.get().defaultBlockState()), 1, 5));
        register(context, BIG_MAGNOLIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.MAGNOLIA_LOG.get().defaultBlockState()),new FancyTrunkPlacer(8, 11, 0),BlockStateProvider.simple(RuBlocks.MAGNOLIA_LEAVES.get().defaultBlockState()),new SakuraFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, BIG_BLUE_MAGNOLIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.MAGNOLIA_LOG.get().defaultBlockState()),new FancyTrunkPlacer(8, 11, 0),BlockStateProvider.simple(RuBlocks.BLUE_MAGNOLIA_LEAVES.get().defaultBlockState()),new SakuraFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, BIG_PINK_MAGNOLIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.MAGNOLIA_LOG.get().defaultBlockState()),new FancyTrunkPlacer(8, 11, 0),BlockStateProvider.simple(RuBlocks.PINK_MAGNOLIA_LEAVES.get().defaultBlockState()),new SakuraFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, BIG_WHITE_MAGNOLIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.MAGNOLIA_LOG.get().defaultBlockState()),new FancyTrunkPlacer(8, 11, 0),BlockStateProvider.simple(RuBlocks.WHITE_MAGNOLIA_LEAVES.get().defaultBlockState()),new SakuraFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

        register(context, CYPRESS_TREE, FeatureRegistry.CYPRESS_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.CYPRESS_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.CYPRESS_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.CYPRESS_BRANCH.get().defaultBlockState()), 17, 4));
        register(context, GIANT_CYPRESS_TREE, FeatureRegistry.GIANT_CYPRESS_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.CYPRESS_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.CYPRESS_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.CYPRESS_BRANCH.get().defaultBlockState()), 25, 5));

        register(context, CHERRY_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.CHERRY_LOG), new CherryTrunkPlacer(7, 1, 0, new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(ConstantInt.of(1), 1).add(ConstantInt.of(2), 1).add(ConstantInt.of(3), 1).build()), UniformInt.of(2, 4), UniformInt.of(-4, -3), UniformInt.of(-1, 0)), BlockStateProvider.simple(Blocks.CHERRY_LEAVES), new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F), new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, DEAD_BOG_TREE, FeatureRegistry.DEAD_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.DEAD_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.DEAD_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.DEAD_BRANCH.get().defaultBlockState()), 6, 2));

        register(context, DEAD_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.DEAD_LOG.get().defaultBlockState()), new StraightTrunkPlacer(6, 2, 0),BlockStateProvider.simple(RuBlocks.DEAD_LEAVES.get().defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, BIG_DEAD_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.DEAD_LOG.get().defaultBlockState()),new FancyTrunkPlacer(12, 3, 0),BlockStateProvider.simple(RuBlocks.DEAD_LEAVES.get().defaultBlockState()),new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(2), 3), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

        register(context, DEAD_PINE_TREE, FeatureRegistry.PINE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.DEAD_PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 10, 4));
        register(context, DEAD_PINE_TREE_TALL, FeatureRegistry.PINE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.DEAD_PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 14, 5));
        register(context, DEAD_STRIPPED_PINE_TREE, FeatureRegistry.STRIPPED_PINE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.DEAD_PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 10, 4));
        register(context, DEAD_STRIPPED_PINE_TREE_TALL, FeatureRegistry.STRIPPED_PINE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.DEAD_PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 14, 5));
        register(context, DEAD_STRIPPED_PINE_TREE_MOUNTAIN, FeatureRegistry.STRIPPED_PINE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.DEAD_PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 15, 7));

        register(context, SMALL_EUCALYPTUS_TREE, FeatureRegistry.SMALL_EUCALYPTUS_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.EUCALYPTUS_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.EUCALYPTUS_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.EUCALYPTUS_BRANCH.get().defaultBlockState()), 13, 8));
        register(context, EUCALYPTUS_TREE, FeatureRegistry.EUCALYPTUS_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.EUCALYPTUS_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.EUCALYPTUS_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.EUCALYPTUS_BRANCH.get().defaultBlockState()), 14, 8));

        register(context, MEDIUM_JOSHUA_TREE, FeatureRegistry.MEDIUM_JOSHUA_TREE.get(), FeatureConfiguration.NONE);
        register(context, LARGE_JOSHUA_TREE, FeatureRegistry.LARGE_JOSHUA_TREE.get(), FeatureConfiguration.NONE);
        register(context, JOSHUA_TREE_SHRUB, FeatureRegistry.SMALL_JOSHUA_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.JOSHUA_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.JOSHUA_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.JOSHUA_BEARD.get().defaultBlockState()), 1, 1));

        register(context, JUNGLE_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.JUNGLE_LOG.defaultBlockState()), new StraightTrunkPlacer(6, 5, 0), BlockStateProvider.simple(Blocks.JUNGLE_LEAVES.defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).decorators(ImmutableList.of(new LeaveVineDecorator(0.25f))).build());
        register(context, BIG_JUNGLE_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.JUNGLE_LOG.defaultBlockState()), new FancyTrunkPlacer(9, 11, 0), BlockStateProvider.simple(Blocks.JUNGLE_LEAVES.defaultBlockState()), new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().decorators(ImmutableList.of(new LeaveVineDecorator(0.25f))).build());

        register(context, KAPOK_TREE, FeatureRegistry.KAPOK_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.KAPOK_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.KAPOK_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.KAPOK_BRANCH.get().defaultBlockState()), 20, 7));

        register(context, LARCH_TREE, FeatureRegistry.LARCH_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.LARCH_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.LARCH_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.LARCH_BRANCH.get().defaultBlockState()), 18, 5));
        register(context, BIG_LARCH_TREE, FeatureRegistry.LARCH_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.LARCH_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.LARCH_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.LARCH_BRANCH.get().defaultBlockState()), 23, 7));

        register(context, GOLDEN_LARCH_TREE, FeatureRegistry.LARCH_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.LARCH_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.GOLDEN_LARCH_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.LARCH_BRANCH.get().defaultBlockState()), 18, 5));
        register(context, BIG_GOLDEN_LARCH_TREE, FeatureRegistry.LARCH_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.LARCH_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.GOLDEN_LARCH_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.LARCH_BRANCH.get().defaultBlockState()), 23, 7));

        register(context, MAPLE_TREE, FeatureRegistry.MAPLE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.MAPLE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.MAPLE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.MAPLE_BRANCH.get().defaultBlockState()), 6, 4));
        register(context, BIG_MAPLE_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.MAPLE_LOG.get().defaultBlockState()),new FancyTrunkPlacer(8, 11, 0),BlockStateProvider.simple(RuBlocks.MAPLE_LEAVES.get().defaultBlockState()),new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, RED_MAPLE_TREE, FeatureRegistry.MAPLE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.MAPLE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.RED_MAPLE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.MAPLE_BRANCH.get().defaultBlockState()), 6, 4));
        register(context, BIG_RED_MAPLE_TREE, Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.MAPLE_LOG.get().defaultBlockState()),new FancyTrunkPlacer(8, 11, 0),BlockStateProvider.simple(RuBlocks.RED_MAPLE_LEAVES.get().defaultBlockState()),new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ORANGE_MAPLE_TREE, FeatureRegistry.MAPLE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.MAPLE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.ORANGE_MAPLE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.MAPLE_BRANCH.get().defaultBlockState()), 6, 4));
        register(context, BIG_ORANGE_MAPLE_TREE, Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.MAPLE_LOG.get().defaultBlockState()),new FancyTrunkPlacer(8, 11, 0),BlockStateProvider.simple(RuBlocks.ORANGE_MAPLE_LEAVES.get().defaultBlockState()),new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

        register(context, MAUVE_OAK_BEE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.MAUVE_LOG.get().defaultBlockState()), new StraightTrunkPlacer(5, 2, 0),BlockStateProvider.simple(RuBlocks.MAUVE_LEAVES.get().defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new BeehiveDecorator(1f))).ignoreVines().build());
        register(context, MAUVE_OAK, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.MAUVE_LOG.get().defaultBlockState()), new StraightTrunkPlacer(5, 2, 0),BlockStateProvider.simple(RuBlocks.MAUVE_LEAVES.get().defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new BeehiveDecorator(0.25f))).ignoreVines().build());
        register(context, BIG_MAUVE_OAK, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.MAUVE_LOG.get().defaultBlockState()), new FancyTrunkPlacer(8, 11, 0),BlockStateProvider.simple(RuBlocks.MAUVE_LEAVES.get().defaultBlockState()), new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

        register(context, OAK_TREE_WITH_FLOWERS, FeatureRegistry.ASPEN_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3).add(RuBlocks.FLOWERING_LEAVES.get().defaultBlockState(), 1)), BlockStateProvider.simple(RuBlocks.OAK_BRANCH.get().defaultBlockState()), 5, 5));

        register(context, OAK_TREE_WITH_BRANCH, FeatureRegistry.MAPLE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState()), BlockStateProvider.simple(RuBlocks.OAK_BRANCH.get().defaultBlockState()), 6, 4));
        register(context, OAK_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), new StraightTrunkPlacer(5, 3, 0),BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new BeehiveDecorator(0.005f))).ignoreVines().build());
        register(context, OAK_TREE_TALL, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), new StraightTrunkPlacer(6, 4, 0),BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new BeehiveDecorator(0.005f))).ignoreVines().build());
        register(context, BIG_OAK_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), new FancyTrunkPlacer(7, 10, 0),BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState()), new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, OAK_TREE_SHRUB, FeatureRegistry.TREE_SHRUB.get(), new RuTreeConfiguration(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState()), BlockStateProvider.simple(RuBlocks.OAK_BRANCH.get().defaultBlockState()), 1, 0));
        register(context, OAK_BUSH, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), new StraightTrunkPlacer(1, 0, 0), BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState()), new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2), new TwoLayersFeatureSize(0, 0, 0)).build());
        register(context, OAK_BUSH_WITH_FLOWERS, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), new StraightTrunkPlacer(1, 0, 0), new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3).add(RuBlocks.FLOWERING_LEAVES.get().defaultBlockState(), 1)), new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2), new TwoLayersFeatureSize(0, 0, 0)).build());

        register(context, PALM_TREE, FeatureRegistry.PALM_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PALM_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PALM_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PALM_BEARD.get().defaultBlockState()), 8, 5));
        register(context, TALL_PALM_TREE, FeatureRegistry.PALM_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PALM_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PALM_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PALM_BEARD.get().defaultBlockState()), 12, 5));
        register(context, PALM_TREE_SHRUB, FeatureRegistry.PALM_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PALM_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PALM_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PALM_BEARD.get().defaultBlockState()), 2, 1));

        register(context, PINE_TREE, FeatureRegistry.PINE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 10, 4));
        register(context, PINE_TREE_TALL, FeatureRegistry.PINE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 14, 5));
        register(context, STRIPPED_PINE_TREE, FeatureRegistry.STRIPPED_PINE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 10, 4));
        register(context, STRIPPED_PINE_TREE_TALL, FeatureRegistry.STRIPPED_PINE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 14, 5));
        register(context, STRIPPED_PINE_TREE_MOUNTAIN, FeatureRegistry.STRIPPED_PINE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 15, 7));
        register(context, PINE_TREE_SHRUB, FeatureRegistry.TREE_SHRUB.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 1, 2));

        register(context, LUSH_PINE_TREE, FeatureRegistry.LUSH_PINE_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PINE_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.PINE_BRANCH.get().defaultBlockState()), 19, 4));

        register(context, SAGUARO_CACTUS, FeatureRegistry.SAGUARO_CACTUS.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.SAGUARO_CACTUS.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.CACTUS_FLOWER.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.REDWOOD_BRANCH.get().defaultBlockState()), 7, 2));

        register(context, ICE_SPIRE, FeatureRegistry.SPIRE.get(), new RuTreeConfiguration(BlockStateProvider.simple(Blocks.PACKED_ICE.defaultBlockState()), BlockStateProvider.simple(Blocks.ICE.defaultBlockState()), BlockStateProvider.simple(Blocks.BLUE_ICE), 14, 9));

        register(context, SILVER_BIRCH_TREE, FeatureRegistry.ASPEN_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_BRANCH.get().defaultBlockState()), 4, 4));
        register(context, SILVER_BIRCH_TREE_TALL, FeatureRegistry.ASPEN_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_BRANCH.get().defaultBlockState()), 5, 5));

        register(context, ENCHANTED_BIRCH_TREE, FeatureRegistry.ASPEN_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.ENCHANTED_BIRCH_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_BRANCH.get().defaultBlockState()), 4, 4));
        register(context, ENCHANTED_BIRCH_TREE_TALL, FeatureRegistry.ASPEN_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.ENCHANTED_BIRCH_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_BRANCH.get().defaultBlockState()), 5, 5));

        register(context, SPRUCE_TREE_TALL, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.SPRUCE_LOG.defaultBlockState()), new StraightTrunkPlacer(13, 2, 2), BlockStateProvider.simple(Blocks.SPRUCE_LEAVES.defaultBlockState()), new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(2, 2), UniformInt.of(5, 5)), new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build());
        register(context, SPRUCE_TREE_SHRUB, FeatureRegistry.TREE_SHRUB.get(), new RuTreeConfiguration(BlockStateProvider.simple(Blocks.SPRUCE_LOG.defaultBlockState()), BlockStateProvider.simple(Blocks.SPRUCE_LEAVES.defaultBlockState()), BlockStateProvider.simple(RuBlocks.OAK_BRANCH.get().defaultBlockState()), 1, 0));

        register(context, SMALL_OAK_TREE, FeatureRegistry.SMALL_OAK_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.SMALL_OAK_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.SMALL_OAK_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.OAK_BRANCH.get().defaultBlockState()), 5, 4));

        register(context, LARGE_SOCOTRA_TREE, FeatureRegistry.LARGE_SOCOTRA_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.SOCOTRA_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.SOCOTRA_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.SOCOTRA_BRANCH.get()), 8, 5));
        register(context, SMALL_SOCOTRA_TREE, FeatureRegistry.SMALL_SOCOTRA_TREE.get(), FeatureConfiguration.NONE);

        register(context, REDWOOD_TREE, FeatureRegistry.REDWOOD_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.REDWOOD_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.REDWOOD_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.REDWOOD_BRANCH.get()), 21, 9));
        register(context, GIANT_REDWOOD_TREE, FeatureRegistry.SUPER_REDWOOD_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.REDWOOD_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.REDWOOD_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.REDWOOD_BRANCH.get()), 30, 14));
        register(context, ULTRA_REDWOOD_TREE, FeatureRegistry.ULTRA_REDWOOD_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.REDWOOD_LOG.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.REDWOOD_LEAVES.get().defaultBlockState()), BlockStateProvider.simple(RuBlocks.REDWOOD_BRANCH.get()), 45, 9));

        register(context, WILLOW_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.WILLOW_LOG.get().defaultBlockState()), new StraightTrunkPlacer(8, 2, 0),BlockStateProvider.simple(RuBlocks.WILLOW_LEAVES.get().defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).decorators(ImmutableList.of(ChanceWillowTrunkDecorator.INSTANCE)).build());
        register(context, BIG_WILLOW_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.WILLOW_LOG.get().defaultBlockState()), new FancyTrunkPlacer(9, 9, 0), BlockStateProvider.simple(RuBlocks.WILLOW_LEAVES.get().defaultBlockState()), new WillowFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().decorators(ImmutableList.of(ChanceWillowTrunkDecorator.INSTANCE)).build());
        register(context, WILLOW_TREE_VINES, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RuBlocks.WILLOW_LOG.get().defaultBlockState()), new StraightTrunkPlacer(8, 2, 0),BlockStateProvider.simple(RuBlocks.WILLOW_LEAVES.get().defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).decorators(ImmutableList.of(new LeaveVineDecorator(0.25f), WillowTrunkDecorator.INSTANCE)).build());


    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
