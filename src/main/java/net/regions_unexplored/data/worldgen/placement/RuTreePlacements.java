package net.regions_unexplored.data.worldgen.placement;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.data.worldgen.features.RuTreeFeatures;
import net.regions_unexplored.registry.PlacedFeatureRegistry;

import java.util.List;

public class RuTreePlacements {
    //-----------------------KEYS-----------------------//
    public static final ResourceKey<PlacedFeature> GIANT_BLUE_BIOSHROOM = PlacedFeatureRegistry.createKey("giant_blue_bioshroom");
    public static final ResourceKey<PlacedFeature> GIANT_GREEN_BIOSHROOM = PlacedFeatureRegistry.createKey("giant_green_bioshroom");
    public static final ResourceKey<PlacedFeature> GIANT_PINK_BIOSHROOM = PlacedFeatureRegistry.createKey("giant_pink_bioshroom");
    public static final ResourceKey<PlacedFeature> GIANT_YELLOW_BIOSHROOM = PlacedFeatureRegistry.createKey("giant_yellow_bioshroom");
    public static final ResourceKey<PlacedFeature> GIANT_RED_MUSHROOM = PlacedFeatureRegistry.createKey("giant_red_mushroom");
    public static final ResourceKey<PlacedFeature> GIANT_BROWN_MUSHROOM = PlacedFeatureRegistry.createKey("giant_brown_mushroom");

    public static final ResourceKey<PlacedFeature> ALPHA_TREE = PlacedFeatureRegistry.createKey("alpha_tree");

    public static final ResourceKey<PlacedFeature> ACACIA_TREE = PlacedFeatureRegistry.createKey("acacia_tree");
    public static final ResourceKey<PlacedFeature> ACACIA_TREE_SHRUB = PlacedFeatureRegistry.createKey("acacia_tree_shrub");

    public static final ResourceKey<PlacedFeature> APPLE_OAK_TREE = PlacedFeatureRegistry.createKey("apple_oak_tree");
    public static final ResourceKey<PlacedFeature> BIG_APPLE_OAK_TREE = PlacedFeatureRegistry.createKey("big_apple_oak_tree");

    public static final ResourceKey<PlacedFeature> ASHEN_TREE = PlacedFeatureRegistry.createKey("ashen_tree");
    public static final ResourceKey<PlacedFeature> ASHEN_PINE_TREE = PlacedFeatureRegistry.createKey("ashen_pine_tree");

    public static final ResourceKey<PlacedFeature> BAMBOO_TREE = PlacedFeatureRegistry.createKey("bamboo_tree");

    public static final ResourceKey<PlacedFeature> MEGA_BAOBAB_TREE = PlacedFeatureRegistry.createKey("mega_baobab_tree");
    public static final ResourceKey<PlacedFeature> ULTRA_BAOBAB_TREE = PlacedFeatureRegistry.createKey("ultra_baobab_tree");

    public static final ResourceKey<PlacedFeature> BRIM_WILLOW_TREE = PlacedFeatureRegistry.createKey("brim_willow_tree");
    public static final ResourceKey<PlacedFeature> TALL_BRIM_WILLOW_TREE = PlacedFeatureRegistry.createKey("tall_brim_willow_tree");

    public static final ResourceKey<PlacedFeature> BLACKWOOD_TREE = PlacedFeatureRegistry.createKey("blackwood_tree");
    public static final ResourceKey<PlacedFeature> TALL_BLACKWOOD_TREE = PlacedFeatureRegistry.createKey("tall_blackwood_tree");

    public static final ResourceKey<PlacedFeature> CYPRESS_TREE = PlacedFeatureRegistry.createKey("cypress_tree");
    public static final ResourceKey<PlacedFeature> GIANT_CYPRESS_TREE = PlacedFeatureRegistry.createKey("giant_cypress_tree");
    public static final ResourceKey<PlacedFeature> GIANT_CYPRESS_TREE_DEEP = PlacedFeatureRegistry.createKey("giant_cypress_tree_deep");

    public static final ResourceKey<PlacedFeature> COBALT_TREE = PlacedFeatureRegistry.createKey("cobalt_tree");

    public static final ResourceKey<PlacedFeature> CHERRY_TREE = PlacedFeatureRegistry.createKey("cherry_tree");

    public static final ResourceKey<PlacedFeature> DEAD_BOG_TREE_RARE = PlacedFeatureRegistry.createKey("dead_bog_tree_rare");
    public static final ResourceKey<PlacedFeature> DEAD_BOG_TREE = PlacedFeatureRegistry.createKey("dead_bog_tree");

    public static final ResourceKey<PlacedFeature> DEAD_SCOTTS_PINE_TREE = PlacedFeatureRegistry.createKey("dead_scotts_pine_tree");
    public static final ResourceKey<PlacedFeature> DEAD_SCOTTS_PINE_TREE_MOUNTAIN = PlacedFeatureRegistry.createKey("dead_scotts_pine_tree_mountain");
    public static final ResourceKey<PlacedFeature> DEAD_SCOTTS_PINE_TREE_MOUNTAIN_ON_SNOW = PlacedFeatureRegistry.createKey("dead_scotts_pine_tree_mountain_on_snow");

    public static final ResourceKey<PlacedFeature> BIRCH_TREE_ASPEN = PlacedFeatureRegistry.createKey("birch_tree_aspen");

    public static final ResourceKey<PlacedFeature> TALL_DARK_OAK = PlacedFeatureRegistry.createKey("tall_dark_oak");

    public static final ResourceKey<PlacedFeature> SMALL_EUCALYPTUS_TREE = PlacedFeatureRegistry.createKey("small_eucalyptus_tree");
    public static final ResourceKey<PlacedFeature> EUCALYPTUS_TREE = PlacedFeatureRegistry.createKey("eucalyptus_tree");

    public static final ResourceKey<PlacedFeature> LARGE_JOSHUA_TREE = PlacedFeatureRegistry.createKey("large_joshua_tree");
    public static final ResourceKey<PlacedFeature> MEDIUM_JOSHUA_TREE = PlacedFeatureRegistry.createKey("medium_joshua_tree");
    public static final ResourceKey<PlacedFeature> JOSHUA_TREE_SHRUB = PlacedFeatureRegistry.createKey("joshua_tree_shrub");

    public static final ResourceKey<PlacedFeature> JUNGLE_TREE_SPARSE = PlacedFeatureRegistry.createKey("jungle_tree_sparse");
    public static final ResourceKey<PlacedFeature> BIG_JUNGLE_TREE_SPARSE = PlacedFeatureRegistry.createKey("big_jungle_tree_sparse");
    public static final ResourceKey<PlacedFeature> JUNGLE_TREE_DENSE = PlacedFeatureRegistry.createKey("jungle_tree_dense");
    public static final ResourceKey<PlacedFeature> BIG_JUNGLE_TREE_DENSE = PlacedFeatureRegistry.createKey("big_jungle_tree_dense");

    public static final ResourceKey<PlacedFeature> KAPOK_TREE_SPARSE = PlacedFeatureRegistry.createKey("kapok_tree_sparse");
    public static final ResourceKey<PlacedFeature> KAPOK_TREE_DENSE = PlacedFeatureRegistry.createKey("kapok_tree_dense");

    public static final ResourceKey<PlacedFeature> LARCH_TREE_SPARSE = PlacedFeatureRegistry.createKey("larch_tree_sparse");
    public static final ResourceKey<PlacedFeature> LARCH_TREE_DENSE = PlacedFeatureRegistry.createKey("larch_tree_dense");
    public static final ResourceKey<PlacedFeature> GOLDEN_LARCH_TREE_SPARSE = PlacedFeatureRegistry.createKey("golden_larch_tree_sparse");
    public static final ResourceKey<PlacedFeature> GOLDEN_LARCH_TREE_DENSE = PlacedFeatureRegistry.createKey("golden_larch_tree_dense");

    public static final ResourceKey<PlacedFeature> MAPLE_TREE_DENSE = PlacedFeatureRegistry.createKey("maple_tree_dense");
    public static final ResourceKey<PlacedFeature> MAPLE_TREE_SPARSE = PlacedFeatureRegistry.createKey("maple_tree_sparse");
    public static final ResourceKey<PlacedFeature> RED_MAPLE_TREE_SPARSE = PlacedFeatureRegistry.createKey("red_maple_tree_sparse");
    public static final ResourceKey<PlacedFeature> BIG_MAPLE_TREE_SPARSE = PlacedFeatureRegistry.createKey("big_maple_tree_sparse");
    public static final ResourceKey<PlacedFeature> BIG_RED_MAPLE_TREE_SPARSE = PlacedFeatureRegistry.createKey("big_red_maple_tree_sparse");

    public static final ResourceKey<PlacedFeature> MAPLE_TREE_ON_GRASS = PlacedFeatureRegistry.createKey("maple_tree_on_grass");
    public static final ResourceKey<PlacedFeature> BIG_MAPLE_TREE_ON_GRASS = PlacedFeatureRegistry.createKey("big_maple_tree_on_grass");
    public static final ResourceKey<PlacedFeature> RED_MAPLE_TREE_ON_GRASS = PlacedFeatureRegistry.createKey("red_maple_tree_on_grass");
    public static final ResourceKey<PlacedFeature> BIG_RED_MAPLE_TREE_ON_GRASS = PlacedFeatureRegistry.createKey("big_red_maple_tree_on_grass");
    public static final ResourceKey<PlacedFeature> ORANGE_MAPLE_TREE_ON_GRASS = PlacedFeatureRegistry.createKey("orange_maple_tree_on_grass");
    public static final ResourceKey<PlacedFeature> BIG_ORANGE_MAPLE_TREE_ON_GRASS = PlacedFeatureRegistry.createKey("big_orange_maple_tree_on_grass");

    public static final ResourceKey<PlacedFeature> MAUVE_TREE_MEADOW = PlacedFeatureRegistry.createKey("mauve_tree_meadow");
    public static final ResourceKey<PlacedFeature> MAUVE_TREE_SPARSE = PlacedFeatureRegistry.createKey("mauve_tree_sparse");
    public static final ResourceKey<PlacedFeature> MAUVE_TREE_DENSE = PlacedFeatureRegistry.createKey("mauve_tree_dense");
    public static final ResourceKey<PlacedFeature> BIG_MAUVE_TREE = PlacedFeatureRegistry.createKey("big_mauve_tree");

    public static final ResourceKey<PlacedFeature> BIG_OAK_TREE_DENSE = PlacedFeatureRegistry.createKey("big_oak_tree_dense");
    public static final ResourceKey<PlacedFeature> BIG_OAK_TREE_SPARSE = PlacedFeatureRegistry.createKey("big_oak_tree_sparse");
    public static final ResourceKey<PlacedFeature> OAK_TREE_WITH_BRANCH = PlacedFeatureRegistry.createKey("oak_tree_with_branch");
    public static final ResourceKey<PlacedFeature> OAK_TREE_TALL = PlacedFeatureRegistry.createKey("oak_tree_tall");
    public static final ResourceKey<PlacedFeature> SMALL_OAK_TREE = PlacedFeatureRegistry.createKey("small_oak_tree");
    public static final ResourceKey<PlacedFeature> OAK_TREE_ON_DIRT= PlacedFeatureRegistry.createKey("oak_tree_on_dirt");
    public static final ResourceKey<PlacedFeature> OAK_TREE_SHRUB_ON_STONE= PlacedFeatureRegistry.createKey("oak_tree_shrub_on_stone");
    public static final ResourceKey<PlacedFeature> OAK_TREE_SHRUB_SPARSE = PlacedFeatureRegistry.createKey("oak_tree_shrub_sparse");
    public static final ResourceKey<PlacedFeature> OAK_TREE_SHRUB_DENSE = PlacedFeatureRegistry.createKey("oak_tree_shrub_dense");
    public static final ResourceKey<PlacedFeature> OAK_BUSH_SINGLE = PlacedFeatureRegistry.createKey("oak_bush_single");
    public static final ResourceKey<PlacedFeature> OAK_BUSH_SPARSE = PlacedFeatureRegistry.createKey("oak_bush_sparse");
    public static final ResourceKey<PlacedFeature> OAK_BUSH_DENSE = PlacedFeatureRegistry.createKey("oak_bush_dense");
    public static final ResourceKey<PlacedFeature> OAK_BUSH_WITH_FLOWERS_SPARSE = PlacedFeatureRegistry.createKey("oak_bush_with_flowers_sparse");
    public static final ResourceKey<PlacedFeature> OAK_BUSH_WITH_FLOWERS_DENSE = PlacedFeatureRegistry.createKey("oak_bush_with_flowers_dense");

    public static final ResourceKey<PlacedFeature> PALM_TREE_ON_SAND = PlacedFeatureRegistry.createKey("palm_tree_on_sand");
    public static final ResourceKey<PlacedFeature> PALM_TREE_SPARSE = PlacedFeatureRegistry.createKey("palm_tree_sparse");
    public static final ResourceKey<PlacedFeature> PALM_TREE_DENSE = PlacedFeatureRegistry.createKey("palm_tree_dense");
    public static final ResourceKey<PlacedFeature> PALM_TREE_DENSE_TALL = PlacedFeatureRegistry.createKey("palm_tree_dense_tall");
    public static final ResourceKey<PlacedFeature> PALM_TREE_SHRUB = PlacedFeatureRegistry.createKey("palm_tree_shrub");

    public static final ResourceKey<PlacedFeature> PINE_TREE = PlacedFeatureRegistry.createKey("pine_tree");
    public static final ResourceKey<PlacedFeature> PINE_TREE_ON_DIRT = PlacedFeatureRegistry.createKey("pine_tree_on_dirt");
    public static final ResourceKey<PlacedFeature> PINE_TREE_TALL_ON_DIRT = PlacedFeatureRegistry.createKey("pine_tree_tall_on_dirt");
    public static final ResourceKey<PlacedFeature> PINE_TREE_SHRUB_ON_GRASS = PlacedFeatureRegistry.createKey("pine_tree_shrub_on_grass");
    public static final ResourceKey<PlacedFeature> SCOTTS_PINE_TREE_MOUNTAIN = PlacedFeatureRegistry.createKey("scotts_pine_tree_mountain");
    public static final ResourceKey<PlacedFeature> SCOTTS_PINE_TREE_ON_SNOW = PlacedFeatureRegistry.createKey("scotts_pine_tree_on_snow");
    public static final ResourceKey<PlacedFeature> SCOTTS_PINE_TREE_ON_DIRT = PlacedFeatureRegistry.createKey("scotts_pine_tree_on_dirt");
    public static final ResourceKey<PlacedFeature> SCOTTS_PINE_TREE_TALL_ON_SNOW = PlacedFeatureRegistry.createKey("scotts_pine_tree_tall_on_snow");
    public static final ResourceKey<PlacedFeature> SCOTTS_PINE_TREE_MOUNTAIN_ON_SNOW = PlacedFeatureRegistry.createKey("scotts_pine_tree_mountain_on_snow");
    public static final ResourceKey<PlacedFeature> PINE_TREE_SHRUB_ON_SNOW = PlacedFeatureRegistry.createKey("pine_tree_shrub_on_snow");
    public static final ResourceKey<PlacedFeature> PINE_TREE_SHRUB_ON_SNOW_SPARSE = PlacedFeatureRegistry.createKey("pine_tree_shrub_on_snow_sparse");

    public static final ResourceKey<PlacedFeature> LUSH_PINE_TREE = PlacedFeatureRegistry.createKey("lush_pine_tree");

    public static final ResourceKey<PlacedFeature> ULTRA_REDWOOD_TREE = PlacedFeatureRegistry.createKey("ultra_redwood_tree");
    public static final ResourceKey<PlacedFeature> GIANT_REDWOOD_TREE_DENSE = PlacedFeatureRegistry.createKey("giant_redwood_tree_dense");
    public static final ResourceKey<PlacedFeature> GIANT_REDWOOD_TREE_SPARSE = PlacedFeatureRegistry.createKey("giant_redwood_tree_sparse");
    public static final ResourceKey<PlacedFeature> REDWOOD_TREE = PlacedFeatureRegistry.createKey("redwood_tree");

    public static final ResourceKey<PlacedFeature> MAGNOLIA_TREE = PlacedFeatureRegistry.createKey("magnolia_tree");
    public static final ResourceKey<PlacedFeature> BLUE_MAGNOLIA_TREE = PlacedFeatureRegistry.createKey("blue_magnolia_tree");
    public static final ResourceKey<PlacedFeature> PINK_MAGNOLIA_TREE = PlacedFeatureRegistry.createKey("pink_magnolia_tree");
    public static final ResourceKey<PlacedFeature> WHITE_MAGNOLIA_TREE = PlacedFeatureRegistry.createKey("white_magnolia_tree");
    public static final ResourceKey<PlacedFeature> BIG_MAGNOLIA_TREE = PlacedFeatureRegistry.createKey("big_magnolia_tree");
    public static final ResourceKey<PlacedFeature> BIG_PINK_MAGNOLIA_TREE = PlacedFeatureRegistry.createKey("big_pink_magnolia_tree");
    public static final ResourceKey<PlacedFeature> BIG_WHITE_MAGNOLIA_TREE = PlacedFeatureRegistry.createKey("big_white_magnolia_tree");

    public static final ResourceKey<PlacedFeature> SAGUARO_CACTUS = PlacedFeatureRegistry.createKey("saguaro_cactus");

    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_DENSE = PlacedFeatureRegistry.createKey("silver_birch_dense");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_SPARSE = PlacedFeatureRegistry.createKey("silver_birch_sparse");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_ON_DIRT = PlacedFeatureRegistry.createKey("silver_birch_on_dirt");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_ON_GRASS = PlacedFeatureRegistry.createKey("silver_birch_on_grass");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_TALL = PlacedFeatureRegistry.createKey("silver_birch_tall");

    public static final ResourceKey<PlacedFeature> LARGE_SOCOTRA_TREE = PlacedFeatureRegistry.createKey("large_socotra_tree");
    public static final ResourceKey<PlacedFeature> SMALL_SOCOTRA_TREE = PlacedFeatureRegistry.createKey("small_socotra_tree");

    public static final ResourceKey<PlacedFeature> ENCHANTED_BIRCH = PlacedFeatureRegistry.createKey("enchanted_birch");
    public static final ResourceKey<PlacedFeature> ENCHANTED_BIRCH_TALL = PlacedFeatureRegistry.createKey("enchanted_birch_tall");

    public static final ResourceKey<PlacedFeature> SPRUCE_TREE_TALL_SPARSE = PlacedFeatureRegistry.createKey("spruce_tree_tall_sparse");
    public static final ResourceKey<PlacedFeature> SPRUCE_TREE_TALL_DENSE = PlacedFeatureRegistry.createKey("spruce_tree_tall_dense");
    public static final ResourceKey<PlacedFeature> SPRUCE_TREE_TALL_ON_SNOW = PlacedFeatureRegistry.createKey("spruce_tree_tall_on_snow");
    public static final ResourceKey<PlacedFeature> SPRUCE_TREE_SHRUB_DENSE = PlacedFeatureRegistry.createKey("spruce_tree_shrub_dense");

    public static final ResourceKey<PlacedFeature> ICE_SPIRE = PlacedFeatureRegistry.createKey("ice_spire");

    public static final ResourceKey<PlacedFeature> WILLOW_TREE = PlacedFeatureRegistry.createKey("willow_tree");
    public static final ResourceKey<PlacedFeature> BIG_WILLOW_TREE = PlacedFeatureRegistry.createKey("big_willow_tree");
    public static final ResourceKey<PlacedFeature> WILLOW_TREE_VINES = PlacedFeatureRegistry.createKey("willow_tree_vines");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        //---------------------FEATURES---------------------//
        final Holder<ConfiguredFeature<?, ?>> GIANT_BLUE_BIOSHROOM = featureGetter.getOrThrow(RuTreeFeatures.GIANT_BLUE_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> GIANT_GREEN_BIOSHROOM = featureGetter.getOrThrow(RuTreeFeatures.GIANT_GREEN_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> GIANT_PINK_BIOSHROOM = featureGetter.getOrThrow(RuTreeFeatures.GIANT_PINK_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> GIANT_YELLOW_BIOSHROOM = featureGetter.getOrThrow(RuTreeFeatures.GIANT_YELLOW_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> GIANT_RED_MUSHROOM = featureGetter.getOrThrow(RuTreeFeatures.GIANT_RED_MUSHROOM);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BROWN_MUSHROOM = featureGetter.getOrThrow(RuTreeFeatures.GIANT_BROWN_MUSHROOM);

        final Holder<ConfiguredFeature<?, ?>> ALPHA_TREE = featureGetter.getOrThrow(RuTreeFeatures.ALPHA_OAK_TREE);

        final Holder<ConfiguredFeature<?, ?>> ACACIA_TREE = featureGetter.getOrThrow(RuTreeFeatures.ACACIA_TREE);
        final Holder<ConfiguredFeature<?, ?>> ACACIA_TREE_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.ACACIA_TREE_SHRUB);

        final Holder<ConfiguredFeature<?, ?>> APPLE_OAK_TREE = featureGetter.getOrThrow(RuTreeFeatures.APPLE_OAK_TREE);
        final Holder<ConfiguredFeature<?, ?>> BIG_APPLE_OAK_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_APPLE_OAK_TREE);

        final Holder<ConfiguredFeature<?, ?>> ASHEN_TREE = featureGetter.getOrThrow(RuTreeFeatures.ASHEN_TREE);
        final Holder<ConfiguredFeature<?, ?>> ASHEN_PINE_TREE = featureGetter.getOrThrow(RuTreeFeatures.ASHEN_PINE_TREE);

        final Holder<ConfiguredFeature<?, ?>> TALL_BLACKWOOD_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_BLACKWOOD_TREE);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_TREE = featureGetter.getOrThrow(RuTreeFeatures.BLACKWOOD_TREE);

        final Holder<ConfiguredFeature<?, ?>> BAMBOO_TREE = featureGetter.getOrThrow(RuTreeFeatures.BAMBOO_TREE);

        final Holder<ConfiguredFeature<?, ?>> MEGA_BAOBAB_TREE = featureGetter.getOrThrow(RuTreeFeatures.MEGA_BAOBAB_TREE);
        final Holder<ConfiguredFeature<?, ?>> ULTRA_BAOBAB_TREE = featureGetter.getOrThrow(RuTreeFeatures.ULTRA_BAOBAB_TREE);

        final Holder<ConfiguredFeature<?, ?>> BRIM_WILLOW_TREE = featureGetter.getOrThrow(RuTreeFeatures.BRIM_WILLOW_TREE);
        final Holder<ConfiguredFeature<?, ?>> TALL_BRIM_WILLOW_TREE = featureGetter.getOrThrow(RuTreeFeatures.TALL_BRIM_WILLOW_TREE);

        final Holder<ConfiguredFeature<?, ?>> BIRCH_TREE_ASPEN = featureGetter.getOrThrow(RuTreeFeatures.BIRCH_TREE_ASPEN);

        final Holder<ConfiguredFeature<?, ?>> CYPRESS_TREE = featureGetter.getOrThrow(RuTreeFeatures.CYPRESS_TREE);
        final Holder<ConfiguredFeature<?, ?>> GIANT_CYPRESS_TREE = featureGetter.getOrThrow(RuTreeFeatures.GIANT_CYPRESS_TREE);

        final Holder<ConfiguredFeature<?, ?>> COBALT_TREE = featureGetter.getOrThrow(RuTreeFeatures.COBALT_TREE);

        final Holder<ConfiguredFeature<?, ?>> CHERRY_TREE = featureGetter.getOrThrow(RuTreeFeatures.CHERRY_TREE);

        final Holder<ConfiguredFeature<?, ?>> DEAD_BOG_TREE = featureGetter.getOrThrow(RuTreeFeatures.DEAD_BOG_TREE);

        final Holder<ConfiguredFeature<?, ?>> DEAD_SCOTTS_PINE_TREE = featureGetter.getOrThrow(RuTreeFeatures.DEAD_STRIPPED_PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> DEAD_SCOTTS_PINE_TREE_MOUNTAIN = featureGetter.getOrThrow(RuTreeFeatures.DEAD_STRIPPED_PINE_TREE_MOUNTAIN);

        final Holder<ConfiguredFeature<?, ?>> TALL_DARK_OAK = featureGetter.getOrThrow(RuTreeFeatures.TALL_DARK_OAK);

        final Holder<ConfiguredFeature<?, ?>> SMALL_EUCALYPTUS_TREE = featureGetter.getOrThrow(RuTreeFeatures.SMALL_EUCALYPTUS_TREE);
        final Holder<ConfiguredFeature<?, ?>> EUCALYPTUS_TREE = featureGetter.getOrThrow(RuTreeFeatures.EUCALYPTUS_TREE);

        final Holder<ConfiguredFeature<?, ?>> LARGE_JOSHUA_TREE = featureGetter.getOrThrow(RuTreeFeatures.LARGE_JOSHUA_TREE);
        final Holder<ConfiguredFeature<?, ?>> MEDIUM_JOSHUA_TREE = featureGetter.getOrThrow(RuTreeFeatures.MEDIUM_JOSHUA_TREE);
        final Holder<ConfiguredFeature<?, ?>> JOSHUA_TREE_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.JOSHUA_TREE_SHRUB);

        final Holder<ConfiguredFeature<?, ?>> JUNGLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.JUNGLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> BIG_JUNGLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_JUNGLE_TREE);

        final Holder<ConfiguredFeature<?, ?>> KAPOK_TREE = featureGetter.getOrThrow(RuTreeFeatures.KAPOK_TREE);

        final Holder<ConfiguredFeature<?, ?>> LARCH_TREE = featureGetter.getOrThrow(RuTreeFeatures.LARCH_TREE);
        final Holder<ConfiguredFeature<?, ?>> GOLDEN_LARCH_TREE = featureGetter.getOrThrow(RuTreeFeatures.GOLDEN_LARCH_TREE);

        final Holder<ConfiguredFeature<?, ?>> MAPLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> BIG_MAPLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> RED_MAPLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.RED_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> BIG_RED_MAPLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_RED_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> ORANGE_MAPLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.ORANGE_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> BIG_ORANGE_MAPLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_ORANGE_MAPLE_TREE);

        final Holder<ConfiguredFeature<?, ?>> MAUVE_TREE = featureGetter.getOrThrow(RuTreeFeatures.MAUVE_OAK);
        final Holder<ConfiguredFeature<?, ?>> BIG_MAUVE_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_MAUVE_OAK);

        final Holder<ConfiguredFeature<?, ?>> BIG_OAK_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_OAK_TREE);
        final Holder<ConfiguredFeature<?, ?>> SMALL_OAK_TREE = featureGetter.getOrThrow(RuTreeFeatures.SMALL_OAK_TREE);
        final Holder<ConfiguredFeature<?, ?>> OAK_TREE_WITH_BRANCH = featureGetter.getOrThrow(RuTreeFeatures.OAK_TREE_WITH_BRANCH);
        final Holder<ConfiguredFeature<?, ?>> OAK_TREE = featureGetter.getOrThrow(RuTreeFeatures.OAK_TREE);
        final Holder<ConfiguredFeature<?, ?>> OAK_TREE_TALL = featureGetter.getOrThrow(RuTreeFeatures.OAK_TREE_TALL);
        final Holder<ConfiguredFeature<?, ?>> OAK_TREE_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_TREE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> OAK_BUSH_WITH_FLOWERS = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH_WITH_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> OAK_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);

        final Holder<ConfiguredFeature<?, ?>> PALM_TREE = featureGetter.getOrThrow(RuTreeFeatures.PALM_TREE);
        final Holder<ConfiguredFeature<?, ?>> PALM_TREE_TALL = featureGetter.getOrThrow(RuTreeFeatures.TALL_PALM_TREE);
        final Holder<ConfiguredFeature<?, ?>> PALM_TREE_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.PALM_TREE_SHRUB);

        final Holder<ConfiguredFeature<?, ?>> PINE_TREE = featureGetter.getOrThrow(RuTreeFeatures.PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> PINE_TREE_TALL = featureGetter.getOrThrow(RuTreeFeatures.PINE_TREE_TALL);
        final Holder<ConfiguredFeature<?, ?>> SCOTTS_PINE_TREE = featureGetter.getOrThrow(RuTreeFeatures.STRIPPED_PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> SCOTTS_PINE_TREE_TALL = featureGetter.getOrThrow(RuTreeFeatures.STRIPPED_PINE_TREE_TALL);
        final Holder<ConfiguredFeature<?, ?>> SCOTTS_PINE_TREE_MOUNTAIN = featureGetter.getOrThrow(RuTreeFeatures.STRIPPED_PINE_TREE_MOUNTAIN);
        final Holder<ConfiguredFeature<?, ?>> PINE_TREE_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.PINE_TREE_SHRUB);

        final Holder<ConfiguredFeature<?, ?>> LUSH_PINE_TREE = featureGetter.getOrThrow(RuTreeFeatures.LUSH_PINE_TREE);

        final Holder<ConfiguredFeature<?, ?>> ULTRA_REDWOOD_TREE = featureGetter.getOrThrow(RuTreeFeatures.ULTRA_REDWOOD_TREE);
        final Holder<ConfiguredFeature<?, ?>> GIANT_REDWOOD_TREE = featureGetter.getOrThrow(RuTreeFeatures.GIANT_REDWOOD_TREE);
        final Holder<ConfiguredFeature<?, ?>> REDWOOD_TREE = featureGetter.getOrThrow(RuTreeFeatures.REDWOOD_TREE);

        final Holder<ConfiguredFeature<?, ?>> MAGNOLIA_TREE = featureGetter.getOrThrow(RuTreeFeatures.MAGNOLIA_TREE);
        final Holder<ConfiguredFeature<?, ?>> BLUE_MAGNOLIA_TREE = featureGetter.getOrThrow(RuTreeFeatures.BLUE_MAGNOLIA_TREE);
        final Holder<ConfiguredFeature<?, ?>> PINK_MAGNOLIA_TREE = featureGetter.getOrThrow(RuTreeFeatures.PINK_MAGNOLIA_TREE);
        final Holder<ConfiguredFeature<?, ?>> WHITE_MAGNOLIA_TREE = featureGetter.getOrThrow(RuTreeFeatures.WHITE_MAGNOLIA_TREE);
        final Holder<ConfiguredFeature<?, ?>> BIG_MAGNOLIA_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_MAGNOLIA_TREE);
        final Holder<ConfiguredFeature<?, ?>> PINK_BIG_MAGNOLIA_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_PINK_MAGNOLIA_TREE);
        final Holder<ConfiguredFeature<?, ?>> WHITE_BIG_MAGNOLIA_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_WHITE_MAGNOLIA_TREE);

        final Holder<ConfiguredFeature<?, ?>> SAGUARO_CACTUS = featureGetter.getOrThrow(RuTreeFeatures.SAGUARO_CACTUS);

        final Holder<ConfiguredFeature<?, ?>> SPRUCE_TREE_TALL = featureGetter.getOrThrow(RuTreeFeatures.SPRUCE_TREE_TALL);
        final Holder<ConfiguredFeature<?, ?>> SPRUCE_TREE_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.SPRUCE_TREE_SHRUB);

        final Holder<ConfiguredFeature<?, ?>> LARGE_SOCOTRA_TREE = featureGetter.getOrThrow(RuTreeFeatures.LARGE_SOCOTRA_TREE);
        final Holder<ConfiguredFeature<?, ?>> SMALL_SOCOTRA_TREE = featureGetter.getOrThrow(RuTreeFeatures.SMALL_SOCOTRA_TREE);

        final Holder<ConfiguredFeature<?, ?>> ICE_SPIRE = featureGetter.getOrThrow(RuTreeFeatures.ICE_SPIRE);

        final Holder<ConfiguredFeature<?, ?>> SILVER_BIRCH = featureGetter.getOrThrow(RuTreeFeatures.SILVER_BIRCH_TREE);
        final Holder<ConfiguredFeature<?, ?>> SILVER_BIRCH_TALL = featureGetter.getOrThrow(RuTreeFeatures.SILVER_BIRCH_TREE_TALL);

        final Holder<ConfiguredFeature<?, ?>> ENCHANTED_BIRCH = featureGetter.getOrThrow(RuTreeFeatures.ENCHANTED_BIRCH_TREE);
        final Holder<ConfiguredFeature<?, ?>> ENCHANTED_BIRCH_TALL = featureGetter.getOrThrow(RuTreeFeatures.ENCHANTED_BIRCH_TREE_TALL);

        final Holder<ConfiguredFeature<?, ?>> WILLOW_TREE = featureGetter.getOrThrow(RuTreeFeatures.WILLOW_TREE);
        final Holder<ConfiguredFeature<?, ?>> BIG_WILLOW_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_WILLOW_TREE);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_TREE_VINES = featureGetter.getOrThrow(RuTreeFeatures.WILLOW_TREE_VINES);
        //--------------------PLACEMENTS--------------------//
        register(context, RuTreePlacements.GIANT_BLUE_BIOSHROOM, GIANT_BLUE_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(3), BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onViridescentNyliumPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.GIANT_GREEN_BIOSHROOM, GIANT_GREEN_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(3), BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onViridescentNyliumPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.GIANT_PINK_BIOSHROOM, GIANT_PINK_BIOSHROOM, List.of(PlacementUtils.countExtra(1, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.GIANT_YELLOW_BIOSHROOM, GIANT_YELLOW_BIOSHROOM, CountOnEveryLayerPlacement.of(3), PlacementUtils.filteredByBlockSurvival(Blocks.CRIMSON_ROOTS), BiomeFilter.biome());
        register(context, RuTreePlacements.GIANT_RED_MUSHROOM, GIANT_RED_MUSHROOM, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.GIANT_BROWN_MUSHROOM, GIANT_BROWN_MUSHROOM, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.ALPHA_TREE, ALPHA_TREE, List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.ACACIA_TREE, ACACIA_TREE, List.of(PlacementUtils.countExtra(1, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.ACACIA_TREE_SHRUB, ACACIA_TREE_SHRUB, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.APPLE_OAK_TREE, APPLE_OAK_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_APPLE_OAK_TREE, BIG_APPLE_OAK_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.ASHEN_TREE, ASHEN_TREE, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING),BiomeFilter.biome()));
        register(context, RuTreePlacements.ASHEN_PINE_TREE, ASHEN_PINE_TREE,   List.of(CountPlacement.of(10), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.BAMBOO_TREE, BAMBOO_TREE, List.of(CountPlacement.of(15), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.MEGA_BAOBAB_TREE, MEGA_BAOBAB_TREE, List.of(PlacementUtils.countExtra(2, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.ULTRA_BAOBAB_TREE, ULTRA_BAOBAB_TREE, List.of(PlacementUtils.countExtra(1, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.BRIM_WILLOW_TREE, BRIM_WILLOW_TREE, CountOnEveryLayerPlacement.of(2),  BiomeFilter.biome());
        register(context, RuTreePlacements.TALL_BRIM_WILLOW_TREE, TALL_BRIM_WILLOW_TREE, CountOnEveryLayerPlacement.of(2),  BiomeFilter.biome());

        register(context, RuTreePlacements.BIRCH_TREE_ASPEN, BIRCH_TREE_ASPEN, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.TALL_BLACKWOOD_TREE, TALL_BLACKWOOD_TREE, List.of(CountPlacement.of(6), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BLACKWOOD_TREE, BLACKWOOD_TREE, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.CYPRESS_TREE, CYPRESS_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(1), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.GIANT_CYPRESS_TREE, GIANT_CYPRESS_TREE, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(1), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.GIANT_CYPRESS_TREE_DEEP, GIANT_CYPRESS_TREE,   List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(2), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.COBALT_TREE, COBALT_TREE, CountOnEveryLayerPlacement.of(1), PlacementUtils.filteredByBlockSurvival(RuBlocks.COBALT_EARLIGHT.get()),  BiomeFilter.biome());

        register(context, RuTreePlacements.CHERRY_TREE, CHERRY_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(3), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.DEAD_BOG_TREE_RARE, DEAD_BOG_TREE, List.of(PlacementUtils.countExtra(0, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.DEAD_BOG_TREE, DEAD_BOG_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(2), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.DEAD_SCOTTS_PINE_TREE, DEAD_SCOTTS_PINE_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.DEAD_SCOTTS_PINE_TREE_MOUNTAIN, DEAD_SCOTTS_PINE_TREE_MOUNTAIN, List.of(PlacementUtils.countExtra(0, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.DEAD_SCOTTS_PINE_TREE_MOUNTAIN_ON_SNOW, DEAD_SCOTTS_PINE_TREE_MOUNTAIN, List.of(PlacementUtils.countExtra(0, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onSnowPredicate), BiomeFilter.biome()));

        register(context, RuTreePlacements.TALL_DARK_OAK, TALL_DARK_OAK, List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.SMALL_EUCALYPTUS_TREE, SMALL_EUCALYPTUS_TREE, List.of(CountPlacement.of(9), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.EUCALYPTUS_TREE, EUCALYPTUS_TREE, List.of(CountPlacement.of(9), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.LARGE_JOSHUA_TREE, LARGE_JOSHUA_TREE, List.of(PlacementUtils.countExtra(0, 0.1F, 3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RuBlocks.SMALL_DESERT_SHRUB.get()), BiomeFilter.biome()));
        register(context, RuTreePlacements.MEDIUM_JOSHUA_TREE, MEDIUM_JOSHUA_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RuBlocks.SMALL_DESERT_SHRUB.get()), BiomeFilter.biome()));
        register(context, RuTreePlacements.JOSHUA_TREE_SHRUB, JOSHUA_TREE_SHRUB, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RuBlocks.SMALL_DESERT_SHRUB.get()), BiomeFilter.biome()));

        register(context, RuTreePlacements.JUNGLE_TREE_SPARSE, JUNGLE_TREE, List.of(NoiseBasedCountPlacement.of(2, 55.0D, 0.0D), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_JUNGLE_TREE_SPARSE, BIG_JUNGLE_TREE, List.of(NoiseBasedCountPlacement.of(2, 50.0D, 0.0D), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.JUNGLE_TREE_DENSE, JUNGLE_TREE, List.of(CountPlacement.of(12), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_JUNGLE_TREE_DENSE, BIG_JUNGLE_TREE, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.KAPOK_TREE_SPARSE, KAPOK_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.KAPOK_TREE_DENSE, KAPOK_TREE, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.LARCH_TREE_DENSE, LARCH_TREE, List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.LARCH_TREE_SPARSE, LARCH_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.GOLDEN_LARCH_TREE_DENSE, GOLDEN_LARCH_TREE, List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.GOLDEN_LARCH_TREE_SPARSE, GOLDEN_LARCH_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.MAPLE_TREE_DENSE, MAPLE_TREE, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.MAPLE_TREE_SPARSE, MAPLE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.RED_MAPLE_TREE_SPARSE, RED_MAPLE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_MAPLE_TREE_SPARSE, BIG_MAPLE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_RED_MAPLE_TREE_SPARSE, BIG_RED_MAPLE_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.ORANGE_MAPLE_TREE_ON_GRASS, ORANGE_MAPLE_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onGrassBlockPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.RED_MAPLE_TREE_ON_GRASS, RED_MAPLE_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onGrassBlockPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.MAPLE_TREE_ON_GRASS, MAPLE_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onGrassBlockPredicate), BiomeFilter.biome()));

        register(context, RuTreePlacements.BIG_ORANGE_MAPLE_TREE_ON_GRASS, BIG_ORANGE_MAPLE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onGrassBlockPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_RED_MAPLE_TREE_ON_GRASS, BIG_RED_MAPLE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onGrassBlockPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_MAPLE_TREE_ON_GRASS, BIG_MAPLE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onGrassBlockPredicate), BiomeFilter.biome()));

        register(context, RuTreePlacements.MAUVE_TREE_MEADOW, MAUVE_TREE, NoiseBasedCountPlacement.of(70, 25.0D, -0.7D), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuTreePlacements.MAUVE_TREE_SPARSE, MAUVE_TREE,   List.of(PlacementUtils.countExtra(0, 0.1F, 2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.MAUVE_TREE_DENSE, MAUVE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_MAUVE_TREE, BIG_MAUVE_TREE, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.BIG_OAK_TREE_DENSE, BIG_OAK_TREE, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_OAK_TREE_SPARSE, BIG_OAK_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.OAK_TREE_TALL, OAK_TREE_TALL, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.SMALL_OAK_TREE, SMALL_OAK_TREE, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.OAK_TREE_WITH_BRANCH, OAK_TREE_WITH_BRANCH, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.OAK_TREE_ON_DIRT, OAK_TREE, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onDirtPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.OAK_TREE_SHRUB_ON_STONE, OAK_TREE_SHRUB, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RuBlocks.STONE_BUD.get()), BiomeFilter.biome()));
        register(context, RuTreePlacements.OAK_TREE_SHRUB_SPARSE, OAK_TREE_SHRUB, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.OAK_TREE_SHRUB_DENSE, OAK_TREE_SHRUB, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.OAK_BUSH_SINGLE, OAK_BUSH, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.OAK_BUSH_SPARSE, OAK_BUSH, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.OAK_BUSH_DENSE, OAK_BUSH, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.OAK_BUSH_WITH_FLOWERS_SPARSE, OAK_BUSH_WITH_FLOWERS, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.OAK_BUSH_WITH_FLOWERS_DENSE, OAK_BUSH_WITH_FLOWERS, List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.PALM_TREE_ON_SAND, PALM_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RuBlocks.SANDY_GRASS.get()), BiomeFilter.biome()));
        register(context, RuTreePlacements.PALM_TREE_SPARSE, PALM_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.PALM_TREE_DENSE, PALM_TREE, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.PALM_TREE_DENSE_TALL, PALM_TREE_TALL, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.PALM_TREE_SHRUB, PALM_TREE_SHRUB, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.PINE_TREE, PINE_TREE, List.of(CountPlacement.of(6), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.PINE_TREE_ON_DIRT, PINE_TREE, List.of(CountPlacement.of(13), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onDirtPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.PINE_TREE_TALL_ON_DIRT, PINE_TREE_TALL, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onDirtPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.SCOTTS_PINE_TREE_ON_DIRT, SCOTTS_PINE_TREE, List.of(CountPlacement.of(11), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onDirtPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.SCOTTS_PINE_TREE_MOUNTAIN, SCOTTS_PINE_TREE_MOUNTAIN, List.of(PlacementUtils.countExtra(2, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.PINE_TREE_SHRUB_ON_GRASS, PINE_TREE_SHRUB, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onGrassBlockPredicate), BiomeFilter.biome()));

        register(context, RuTreePlacements.SCOTTS_PINE_TREE_ON_SNOW, SCOTTS_PINE_TREE, List.of(CountPlacement.of(9), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onSnowPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.SCOTTS_PINE_TREE_TALL_ON_SNOW, SCOTTS_PINE_TREE_TALL, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onSnowPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.SCOTTS_PINE_TREE_MOUNTAIN_ON_SNOW, SCOTTS_PINE_TREE_MOUNTAIN, List.of(PlacementUtils.countExtra(2, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onSnowPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.PINE_TREE_SHRUB_ON_SNOW, PINE_TREE_SHRUB, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onSnowPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.PINE_TREE_SHRUB_ON_SNOW_SPARSE, PINE_TREE_SHRUB, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onSnowPredicate), BiomeFilter.biome()));

        register(context, RuTreePlacements.LUSH_PINE_TREE, LUSH_PINE_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.ULTRA_REDWOOD_TREE, ULTRA_REDWOOD_TREE, List.of(NoiseBasedCountPlacement.of(1, 80.0D, 0.3D), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.GIANT_REDWOOD_TREE_DENSE, GIANT_REDWOOD_TREE, List.of(CountPlacement.of(6), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.GIANT_REDWOOD_TREE_SPARSE, GIANT_REDWOOD_TREE, List.of(NoiseBasedCountPlacement.of(1, 80.0D, 0.3D), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.REDWOOD_TREE, REDWOOD_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.MAGNOLIA_TREE, MAGNOLIA_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BLUE_MAGNOLIA_TREE, BLUE_MAGNOLIA_TREE, List.of(PlacementUtils.countExtra(1, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.PINK_MAGNOLIA_TREE, PINK_MAGNOLIA_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.WHITE_MAGNOLIA_TREE, WHITE_MAGNOLIA_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_MAGNOLIA_TREE, BIG_MAGNOLIA_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_PINK_MAGNOLIA_TREE, PINK_BIG_MAGNOLIA_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_WHITE_MAGNOLIA_TREE, WHITE_BIG_MAGNOLIA_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.SAGUARO_CACTUS, SAGUARO_CACTUS, List.of(NoiseBasedCountPlacement.of(1, 75.0D, 0.0D), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RuBlocks.SANDY_GRASS.get()), BiomeFilter.biome()));

        register(context, RuTreePlacements.SPRUCE_TREE_TALL_SPARSE, SPRUCE_TREE_TALL, List.of(PlacementUtils.countExtra(0, 0.05F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.SPRUCE_TREE_TALL_DENSE, SPRUCE_TREE_TALL, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.SPRUCE_TREE_TALL_ON_SNOW, SPRUCE_TREE_TALL, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onSnowPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.SPRUCE_TREE_SHRUB_DENSE, SPRUCE_TREE_SHRUB, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.ICE_SPIRE, ICE_SPIRE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onSnowPredicate), BiomeFilter.biome()));

        register(context, RuTreePlacements.SILVER_BIRCH_DENSE, SILVER_BIRCH, List.of(CountPlacement.of(6), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.SILVER_BIRCH_SPARSE, SILVER_BIRCH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.SILVER_BIRCH_ON_DIRT, SILVER_BIRCH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onDirtPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.SILVER_BIRCH_ON_GRASS, SILVER_BIRCH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onGrassBlockPredicate), BiomeFilter.biome()));
        register(context, RuTreePlacements.SILVER_BIRCH_TALL, SILVER_BIRCH_TALL, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.LARGE_SOCOTRA_TREE, LARGE_SOCOTRA_TREE, List.of(NoiseBasedCountPlacement.of(1, 70.0D, 0.0D), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.SMALL_SOCOTRA_TREE, SMALL_SOCOTRA_TREE, List.of(PlacementUtils.countExtra(1, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.ENCHANTED_BIRCH, ENCHANTED_BIRCH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.ENCHANTED_BIRCH_TALL, ENCHANTED_BIRCH_TALL, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuTreePlacements.WILLOW_TREE, WILLOW_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.BIG_WILLOW_TREE, BIG_WILLOW_TREE, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuTreePlacements.WILLOW_TREE_VINES, WILLOW_TREE_VINES, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(3), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
    }

    protected static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}