package net.regions_unexplored.data.worldgen.placement;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ClampedInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.regions_unexplored.data.worldgen.features.RuVegetationFeatures;
import net.regions_unexplored.registry.PlacedFeatureRegistry;

import java.util.List;

public class RuVegetationPlacements {
    //-----------------------KEYS-----------------------//
    public static final ResourceKey<PlacedFeature> BLACKWOOD_MUSHROOMS = PlacedFeatureRegistry.createKey("blackwood_mushrooms");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_DECORATION = PlacedFeatureRegistry.createKey("blackwood_decoration");
    public static final ResourceKey<PlacedFeature> LUPINE_VEGETATION = PlacedFeatureRegistry.createKey("lupine_vegetation");
    public static final ResourceKey<PlacedFeature> MEADOW_VEGETATION = PlacedFeatureRegistry.createKey("meadow_vegetation");
    //GRASS
    public static final ResourceKey<PlacedFeature> SANDY_GRASS = PlacedFeatureRegistry.createKey("sandy_grass");
    public static final ResourceKey<PlacedFeature> FERNS = PlacedFeatureRegistry.createKey("ferns");
    public static final ResourceKey<PlacedFeature> GRASS = PlacedFeatureRegistry.createKey("grass");
    public static final ResourceKey<PlacedFeature> CAVE_GRASS = PlacedFeatureRegistry.createKey("cave_grass");
    public static final ResourceKey<PlacedFeature> TALL_GRASS = PlacedFeatureRegistry.createKey("tall_grass");
    public static final ResourceKey<PlacedFeature> CAVE_TALL_GRASS = PlacedFeatureRegistry.createKey("cave_tall_grass");
    public static final ResourceKey<PlacedFeature> SNOW_GRASS = PlacedFeatureRegistry.createKey("snow_grass");
    public static final ResourceKey<PlacedFeature> MEDIUM_GRASS = PlacedFeatureRegistry.createKey("medium_grass");
    public static final ResourceKey<PlacedFeature> WINDSWEPT_GRASS = PlacedFeatureRegistry.createKey("windswept_grass");
    public static final ResourceKey<PlacedFeature> STONE_BUD_DENSE = PlacedFeatureRegistry.createKey("stone_bud_dense");
    public static final ResourceKey<PlacedFeature> STONE_BUD_SPARSE = PlacedFeatureRegistry.createKey("stone_bud_sparse");
    public static final ResourceKey<PlacedFeature> ASHEN_GRASS = PlacedFeatureRegistry.createKey("ashen_grass");
    public static final ResourceKey<PlacedFeature> REDWOODS_VEGETATION = PlacedFeatureRegistry.createKey("redwoods_vegetation");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_VEGETATION = PlacedFeatureRegistry.createKey("blackwood_vegetation");
    public static final ResourceKey<PlacedFeature> DECIDUOUS_VEGETATION = PlacedFeatureRegistry.createKey("deciduous_vegetation");
    public static final ResourceKey<PlacedFeature> FEN_VEGETATION = PlacedFeatureRegistry.createKey("fen_vegetation");
    public static final ResourceKey<PlacedFeature> SHRUBLAND_VEGETATION = PlacedFeatureRegistry.createKey("shrubland_vegetation");
    public static final ResourceKey<PlacedFeature> MOUNTAIN_VEGETATION = PlacedFeatureRegistry.createKey("mountain_vegetation");
    public static final ResourceKey<PlacedFeature> OUTBACK_VEGETATION = PlacedFeatureRegistry.createKey("outback_vegetation");
    public static final ResourceKey<PlacedFeature> JOSHUA_VEGETATION = PlacedFeatureRegistry.createKey("joshua_vegetation");
    public static final ResourceKey<PlacedFeature> STEPPE_VEGETATION = PlacedFeatureRegistry.createKey("steppe_vegetation");
    public static final ResourceKey<PlacedFeature> SOCOTRA_VEGETATION = PlacedFeatureRegistry.createKey("socotra_vegetation");
    public static final ResourceKey<PlacedFeature> BAYOU_VEGETATION = PlacedFeatureRegistry.createKey("bayou_vegetation");
    public static final ResourceKey<PlacedFeature> DIRT_VEGETATION = PlacedFeatureRegistry.createKey("dirt_vegetation");
    public static final ResourceKey<PlacedFeature> SANDY_GRASS_VEGETATION = PlacedFeatureRegistry.createKey("sandy_grass_vegetation");
    public static final ResourceKey<PlacedFeature> GRASS_VEGETATION = PlacedFeatureRegistry.createKey("grass_vegetation");
    public static final ResourceKey<PlacedFeature> REDSTONE_BUD = PlacedFeatureRegistry.createKey("redstone_bud");
    public static final ResourceKey<PlacedFeature> PRISMOSS_SPROUT = PlacedFeatureRegistry.createKey("prismoss_sprout");
    public static final ResourceKey<PlacedFeature> BLADED_GRASS = PlacedFeatureRegistry.createKey("bladed_grass");
    public static final ResourceKey<PlacedFeature> BLADED_GRASS_BONEMEAL = PlacedFeatureRegistry.createKey("bladed_grass_bonemeal");
    //FLOWERS
    public static final ResourceKey<PlacedFeature> CAVE_HYSSOP = PlacedFeatureRegistry.createKey("cave_hyssop");
    public static final ResourceKey<PlacedFeature> ASTER = PlacedFeatureRegistry.createKey("aster");
    public static final ResourceKey<PlacedFeature> TULIPS = PlacedFeatureRegistry.createKey("tulips");
    public static final ResourceKey<PlacedFeature> SMALL_FLOWERS = PlacedFeatureRegistry.createKey("small_flowers");
    public static final ResourceKey<PlacedFeature> TALL_FLOWERS = PlacedFeatureRegistry.createKey("tall_flowers");
    public static final ResourceKey<PlacedFeature> ALPHA_DANDELION = PlacedFeatureRegistry.createKey("alpha_dandelion");
    public static final ResourceKey<PlacedFeature> ALPHA_ROSE = PlacedFeatureRegistry.createKey("alpha_rose");
    public static final ResourceKey<PlacedFeature> WILTING_TRILLIUM = PlacedFeatureRegistry.createKey("wilting_trillium");
    public static final ResourceKey<PlacedFeature> WHITE_TRILLIUM = PlacedFeatureRegistry.createKey("white_trillium");
    public static final ResourceKey<PlacedFeature> AZURE_DAISY = PlacedFeatureRegistry.createKey("azure_daisy");
    public static final ResourceKey<PlacedFeature> DAISY = PlacedFeatureRegistry.createKey("daisy");
    public static final ResourceKey<PlacedFeature> DAISIES = PlacedFeatureRegistry.createKey("daisies");
    public static final ResourceKey<PlacedFeature> WARATAH = PlacedFeatureRegistry.createKey("waratah");
    public static final ResourceKey<PlacedFeature> PRAIRIE_FLOWERS = PlacedFeatureRegistry.createKey("prairie_flowers");
    public static final ResourceKey<PlacedFeature> SHRUBLAND_FLOWERS = PlacedFeatureRegistry.createKey("shrubland_flowers");
    public static final ResourceKey<PlacedFeature> WILLOW_FLOWERS = PlacedFeatureRegistry.createKey("willow_flowers");
    public static final ResourceKey<PlacedFeature> POPPIES = PlacedFeatureRegistry.createKey("poppies");
    public static final ResourceKey<PlacedFeature> TASSEL_SPARSE = PlacedFeatureRegistry.createKey("tassel_sparse");
    public static final ResourceKey<PlacedFeature> TASSEL_DENSE = PlacedFeatureRegistry.createKey("tassel_dense");
    public static final ResourceKey<PlacedFeature> CORPSE_FLOWER = PlacedFeatureRegistry.createKey("corpse_flower");
    public static final ResourceKey<PlacedFeature> DUSKTRAP = PlacedFeatureRegistry.createKey("dusktrap");
    public static final ResourceKey<PlacedFeature> DAY_LILY = PlacedFeatureRegistry.createKey("day_lily");
    public static final ResourceKey<PlacedFeature> TSUBAKI = PlacedFeatureRegistry.createKey("tsubaki");
    public static final ResourceKey<PlacedFeature> HIBISCUS = PlacedFeatureRegistry.createKey("hibiscus");
    public static final ResourceKey<PlacedFeature> MALLOW = PlacedFeatureRegistry.createKey("mallow");
    public static final ResourceKey<PlacedFeature> HYSSOP = PlacedFeatureRegistry.createKey("hyssop");
    public static final ResourceKey<PlacedFeature> FROZEN_FLOWERS = PlacedFeatureRegistry.createKey("frozen_flowers");
    public static final ResourceKey<PlacedFeature> PINK_FLOWERS = PlacedFeatureRegistry.createKey("pink_flowers");
    public static final ResourceKey<PlacedFeature> SNOWBELLE = PlacedFeatureRegistry.createKey("snowbelle");
    public static final ResourceKey<PlacedFeature> BARLEY_SPARSE = PlacedFeatureRegistry.createKey("barley_sparse");
    public static final ResourceKey<PlacedFeature> BARLEY_DENSE = PlacedFeatureRegistry.createKey("barley_dense");
    public static final ResourceKey<PlacedFeature> MEADOW_SAGE = PlacedFeatureRegistry.createKey("meadow_sage");
    public static final ResourceKey<PlacedFeature> REDSTONE_BULB = PlacedFeatureRegistry.createKey("redstone_bulb");

    public static final ResourceKey<PlacedFeature> MAPLE_LEAF_PILE = PlacedFeatureRegistry.createKey("maple_leaf_pile");
    public static final ResourceKey<PlacedFeature> RED_MAPLE_LEAF_PILE = PlacedFeatureRegistry.createKey("red_maple_leaf_pile");
    public static final ResourceKey<PlacedFeature> ORANGE_MAPLE_LEAF_PILE = PlacedFeatureRegistry.createKey("orange_maple_leaf_pile");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_LEAF_PILE_SPARSE = PlacedFeatureRegistry.createKey("silver_birch_leaf_pile_sparse");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_LEAF_PILE_DENSE = PlacedFeatureRegistry.createKey("silver_birch_leaf_pile_dense");
    public static final ResourceKey<PlacedFeature> ENCHANTED_BIRCH_LEAF_PILE = PlacedFeatureRegistry.createKey("enchanted_birch_leaf_pile");
    public static final ResourceKey<PlacedFeature> ORANGE_CONEFLOWER = PlacedFeatureRegistry.createKey("orange_coneflower");
    public static final ResourceKey<PlacedFeature> SPARSE_ORANGE_CONEFLOWER = PlacedFeatureRegistry.createKey("sparse_orange_coneflower");
    public static final ResourceKey<PlacedFeature> PURPLE_CONEFLOWER = PlacedFeatureRegistry.createKey("purple_coneflower");
    public static final ResourceKey<PlacedFeature> MAGNOLIA_FLOWERS = PlacedFeatureRegistry.createKey("magnolia_flowers");
    public static final ResourceKey<PlacedFeature> CLOVER = PlacedFeatureRegistry.createKey("clover");
    public static final ResourceKey<PlacedFeature> CLOVER_SPARSE = PlacedFeatureRegistry.createKey("clover_sparse");
    //MULTIFACE FLOWERS
    public static final ResourceKey<PlacedFeature> PINK_MAGNOLIA_FLOWERS = PlacedFeatureRegistry.createKey("pink_magnolia_flowers");
    public static final ResourceKey<PlacedFeature> WHITE_MAGNOLIA_FLOWERS = PlacedFeatureRegistry.createKey("white_magnolia_flowers");
    //FOOD_PLANTS
    public static final ResourceKey<PlacedFeature> RARE_SALMONBERRY_BUSH = PlacedFeatureRegistry.createKey("rare_salmonberry_bush");
    public static final ResourceKey<PlacedFeature> COMMON_SALMONBERRY_BUSH = PlacedFeatureRegistry.createKey("common_salmonberry_bush");
    public static final ResourceKey<PlacedFeature> DUSKMELON = PlacedFeatureRegistry.createKey("duskmelon");
    //BIOSHROOM
    public static final ResourceKey<PlacedFeature> BLUE_BIOSHROOM = PlacedFeatureRegistry.createKey("blue_bioshroom");
    public static final ResourceKey<PlacedFeature> GREEN_BIOSHROOM = PlacedFeatureRegistry.createKey("green_bioshroom");
    public static final ResourceKey<PlacedFeature> PINK_BIOSHROOM = PlacedFeatureRegistry.createKey("pink_bioshroom");
    public static final ResourceKey<PlacedFeature> PINK_BIOSHROOM_DENSE = PlacedFeatureRegistry.createKey("pink_bioshroom_dense");
    //OTHER
    public static final ResourceKey<PlacedFeature> CACTUS_DENSE = PlacedFeatureRegistry.createKey("cactus_dense");
    public static final ResourceKey<PlacedFeature> BARREL_CACTUS = PlacedFeatureRegistry.createKey("barrel_cactus");
    public static final ResourceKey<PlacedFeature> BAMBOO = PlacedFeatureRegistry.createKey("bamboo");
    public static final ResourceKey<PlacedFeature> FLOWERING_LILY = PlacedFeatureRegistry.createKey("flowering_lily");
    public static final ResourceKey<PlacedFeature> GIANT_LILY = PlacedFeatureRegistry.createKey("giant_lily");
    public static final ResourceKey<PlacedFeature> ELEPHANT_EAR_SPARSE = PlacedFeatureRegistry.createKey("elephant_ear_sparse");
    public static final ResourceKey<PlacedFeature> ELEPHANT_EAR_DENSE = PlacedFeatureRegistry.createKey("elephant_ear_dense");
    public static final ResourceKey<PlacedFeature> DROPLEAF = PlacedFeatureRegistry.createKey("dropleaf");
    public static final ResourceKey<PlacedFeature> DUCKWEED = PlacedFeatureRegistry.createKey("duckweed");
    //SHRUBS
    public static final ResourceKey<PlacedFeature> ASHEN_SHRUB = PlacedFeatureRegistry.createKey("ashen_shrub");
    public static final ResourceKey<PlacedFeature> ACACIA_SHRUB = PlacedFeatureRegistry.createKey("acacia_shrub");
    public static final ResourceKey<PlacedFeature> BAOBAB_SHRUB = PlacedFeatureRegistry.createKey("baobab_shrub");
    public static final ResourceKey<PlacedFeature> BIRCH_SHRUB = PlacedFeatureRegistry.createKey("birch_shrub");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_SHRUB = PlacedFeatureRegistry.createKey("blackwood_shrub");
    public static final ResourceKey<PlacedFeature> CHERRY_SHRUB = PlacedFeatureRegistry.createKey("cherry_shrub");
    public static final ResourceKey<PlacedFeature> MAGNOLIA_SHRUB = PlacedFeatureRegistry.createKey("magnolia_shrub");
    public static final ResourceKey<PlacedFeature> PINK_MAGNOLIA_SHRUB = PlacedFeatureRegistry.createKey("pink_magnolia_shrub");
    public static final ResourceKey<PlacedFeature> WHITE_MAGNOLIA_SHRUB = PlacedFeatureRegistry.createKey("white_magnolia_shrub");
    public static final ResourceKey<PlacedFeature> CYPRESS_SHRUB = PlacedFeatureRegistry.createKey("cypress_shrub");
    public static final ResourceKey<PlacedFeature> DARK_OAK_SHRUB = PlacedFeatureRegistry.createKey("dark_oak_shrub");
    public static final ResourceKey<PlacedFeature> DEAD_SHRUB = PlacedFeatureRegistry.createKey("dead_shrub");
    public static final ResourceKey<PlacedFeature> DEAD_PINE_SHRUB = PlacedFeatureRegistry.createKey("dead_pine_shrub");
    public static final ResourceKey<PlacedFeature> EUCALYPTUS_SHRUB = PlacedFeatureRegistry.createKey("eucalyptus_shrub");
    public static final ResourceKey<PlacedFeature> FLOWERING_SHRUB = PlacedFeatureRegistry.createKey("flowering_shrub");
    public static final ResourceKey<PlacedFeature> JOSHUA_SHRUB = PlacedFeatureRegistry.createKey("joshua_shrub");
    public static final ResourceKey<PlacedFeature> JUNGLE_SHRUB = PlacedFeatureRegistry.createKey("jungle_shrub");
    public static final ResourceKey<PlacedFeature> LARCH_SHRUB = PlacedFeatureRegistry.createKey("larch_shrub");
    public static final ResourceKey<PlacedFeature> GOLDEN_LARCH_SHRUB = PlacedFeatureRegistry.createKey("golden_larch_shrub");
    public static final ResourceKey<PlacedFeature> MANGROVE_SHRUB = PlacedFeatureRegistry.createKey("mangrove_shrub");
    public static final ResourceKey<PlacedFeature> MAPLE_SHRUB = PlacedFeatureRegistry.createKey("maple_shrub");
    public static final ResourceKey<PlacedFeature> RED_MAPLE_SHRUB = PlacedFeatureRegistry.createKey("red_maple_shrub");
    public static final ResourceKey<PlacedFeature> ORANGE_MAPLE_SHRUB = PlacedFeatureRegistry.createKey("orange_maple_shrub");
    public static final ResourceKey<PlacedFeature> MAUVE_SHRUB = PlacedFeatureRegistry.createKey("mauve_shrub");
    public static final ResourceKey<PlacedFeature> OAK_SHRUB = PlacedFeatureRegistry.createKey("oak_shrub");
    public static final ResourceKey<PlacedFeature> PALM_SHRUB = PlacedFeatureRegistry.createKey("palm_shrub");
    public static final ResourceKey<PlacedFeature> PINE_SHRUB = PlacedFeatureRegistry.createKey("pine_shrub");
    public static final ResourceKey<PlacedFeature> REDWOOD_SHRUB = PlacedFeatureRegistry.createKey("redwood_shrub");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_SHRUB = PlacedFeatureRegistry.createKey("silver_birch_shrub");
    public static final ResourceKey<PlacedFeature> SOCOTRA_SHRUB = PlacedFeatureRegistry.createKey("socotra_shrub");
    public static final ResourceKey<PlacedFeature> SPRUCE_SHRUB = PlacedFeatureRegistry.createKey("spruce_shrub");
    public static final ResourceKey<PlacedFeature> WILLOW_SHRUB = PlacedFeatureRegistry.createKey("willow_shrub");
    //mixes
    public static final ResourceKey<PlacedFeature> BAOBAB_ACACIA_SHRUB_MIX = PlacedFeatureRegistry.createKey("baobab_acacia_shrub_mix");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_SHRUB_MIX = PlacedFeatureRegistry.createKey("autumnal_shrub_mix");
    public static final ResourceKey<PlacedFeature> BIRCH_SHRUB_MIX = PlacedFeatureRegistry.createKey("birch_shrub_mix");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_DARK_OAK_SHRUB_MIX = PlacedFeatureRegistry.createKey("blackwood_dark_oak_shrub_mix");
    public static final ResourceKey<PlacedFeature> MAGNOLIA_SHRUB_MIX = PlacedFeatureRegistry.createKey("magnolia_shrub_mix");
    public static final ResourceKey<PlacedFeature> DEAD_SHRUB_MIX = PlacedFeatureRegistry.createKey("dead_shrub_mix");
    public static final ResourceKey<PlacedFeature> LARCH_SHRUB_MIX = PlacedFeatureRegistry.createKey("larch_shrub_mix");
    public static final ResourceKey<PlacedFeature> GOLDEN_LARCH_SHRUB_MIX = PlacedFeatureRegistry.createKey("golden_larch_shrub_mix");
    public static final ResourceKey<PlacedFeature> MAPLE_SHRUB_MIX = PlacedFeatureRegistry.createKey("maple_shrub_mix");
    public static final ResourceKey<PlacedFeature> MAUVE_ENCHANTED_SHRUB_MIX = PlacedFeatureRegistry.createKey("mauve_enchanted_shrub_mix");
    public static final ResourceKey<PlacedFeature> PALM_JUNGLE_SHRUB_MIX = PlacedFeatureRegistry.createKey("palm_jungle_shrub_mix");
    public static final ResourceKey<PlacedFeature> PINE_SPRUCE_SHRUB_MIX = PlacedFeatureRegistry.createKey("pine_spruce_shrub_mix");
    public static final ResourceKey<PlacedFeature> PINE_DEAD_SHRUB_MIX = PlacedFeatureRegistry.createKey("pine_dead_shrub_mix");
    public static final ResourceKey<PlacedFeature> WILLOW_CYPRESS_SHRUB_MIX = PlacedFeatureRegistry.createKey("willow_cypress_shrub_mix");
    public static final ResourceKey<PlacedFeature> WILLOW_MAGNOLIA_SHRUB_MIX = PlacedFeatureRegistry.createKey("willow_magnolia_shrub_mix");

    public static final ResourceKey<PlacedFeature> PRAIRIE_TREES = PlacedFeatureRegistry.createKey("prairie_trees");


    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        //---------------------FEATURES---------------------//
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_MUSHROOMS = featureGetter.getOrThrow(RuVegetationFeatures.BLACKWOOD_BIOSHROOMS);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_DECORATION = featureGetter.getOrThrow(RuVegetationFeatures.BLACKWOOD_DECORATION);
        final Holder<ConfiguredFeature<?, ?>> LUPINE_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_LUPINE_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> MEADOW_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_MEADOW_VEGETATION);
        //GRASS
        final Holder<ConfiguredFeature<?, ?>> SANDY_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.SANDY_GRASS);
        final Holder<ConfiguredFeature<?, ?>> MEDIUM_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_MEDIUM_GRASS);
        final Holder<ConfiguredFeature<?, ?>> SNOW_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SNOW_GRASS);
        final Holder<ConfiguredFeature<?, ?>> FERNS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FERNS);
        final Holder<ConfiguredFeature<?, ?>> GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> TALL_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TALL_GRASS);
        final Holder<ConfiguredFeature<?, ?>> WINDSWEPT_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WINDSWEPT_GRASS);
        final Holder<ConfiguredFeature<?, ?>> STONE_BUD = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STONE_BUD);
        final Holder<ConfiguredFeature<?, ?>> ASHEN_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ASHEN_GRASS);
        final Holder<ConfiguredFeature<?, ?>> REDWOODS_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_REDWOODS_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLACKWOOD_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> DECIDUOUS_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DECIDUOUS_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> FEN_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FEN_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> SHRUBLAND_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SHRUBLAND_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> MOUNTAIN_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_MOUNTAIN_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> STEPPE_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STEPPE_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> SOCOTRA_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SOCOTRA_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> OUTBACK_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_OUTBACK_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> JOSHUA_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_JOSHUA_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> BAYOU_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BAYOU_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> SANDY_GRASS_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SANDY_GRASS_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> DIRT_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DIRT_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> GRASS_VEGETATION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GRASS_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>> REDSTONE_BUD = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_REDSTONE_BUD);
        final Holder<ConfiguredFeature<?, ?>> PRISMOSS_SPROUT = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PRISMOSS_SPROUT);
        final Holder<ConfiguredFeature<?, ?>> BLADED_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLADED_GRASS);
        final Holder<ConfiguredFeature<?, ?>> BLADED_GRASS_BONEMEAL = featureGetter.getOrThrow(RuVegetationFeatures.BLADED_GRASS_SINGLE);
       //FLOWERS
        final Holder<ConfiguredFeature<?, ?>> ASTER = featureGetter.getOrThrow(RuVegetationFeatures.ASTER);
        final Holder<ConfiguredFeature<?, ?>> TULIPS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TULIPS);
        final Holder<ConfiguredFeature<?, ?>> CAVE_HYSSOP = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_CAVE_HYSSOP);
        final Holder<ConfiguredFeature<?, ?>> SMALL_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SMALL_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> TALL_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TALL_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> ALPHA_DANDELION = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ALPHA_DANDELION);
        final Holder<ConfiguredFeature<?, ?>> ALPHA_ROSE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ALPHA_ROSE);
        final Holder<ConfiguredFeature<?, ?>> WILTING_TRILLIUM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WILTING_TRILLIUM);
        final Holder<ConfiguredFeature<?, ?>> WHITE_TRILLIUM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WHITE_TRILLIUM);
        final Holder<ConfiguredFeature<?, ?>> AZURE_DAISY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_AZURE_DAISY);
        final Holder<ConfiguredFeature<?, ?>> WARATAH = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WARATAH);
        final Holder<ConfiguredFeature<?, ?>> DAISY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DAISY);
        final Holder<ConfiguredFeature<?, ?>> DAISIES = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DAISIES);
        final Holder<ConfiguredFeature<?, ?>> PRAIRIE_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PRAIRIE_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> SHRUBLAND_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SHRUBLAND_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WILLOW_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> POPPIES = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_POPPIES);
        final Holder<ConfiguredFeature<?, ?>> TASSEL = featureGetter.getOrThrow(RuVegetationFeatures.TASSEL);
        final Holder<ConfiguredFeature<?, ?>> SNOWBELLE = featureGetter.getOrThrow(RuVegetationFeatures.WHITE_SNOWBELLE);
        final Holder<ConfiguredFeature<?, ?>> CORPSE_FLOWER = featureGetter.getOrThrow(RuVegetationFeatures.CORPSE_FLOWER);
        final Holder<ConfiguredFeature<?, ?>> DUSKTRAP = featureGetter.getOrThrow(RuVegetationFeatures.DUSKTRAP);
        final Holder<ConfiguredFeature<?, ?>> DAY_LILY = featureGetter.getOrThrow(RuVegetationFeatures.DAY_LILY);
        final Holder<ConfiguredFeature<?, ?>> TSUBAKI = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TSUBAKI);
        final Holder<ConfiguredFeature<?, ?>> HIBISCUS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_HIBISCUS);
        final Holder<ConfiguredFeature<?, ?>> MALLOW = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_MALLOW);
        final Holder<ConfiguredFeature<?, ?>> HYSSOP = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_HYSSOP);
        final Holder<ConfiguredFeature<?, ?>> FROZEN_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FROZEN_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> PINK_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> BARLEY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BARLEY);
        final Holder<ConfiguredFeature<?, ?>> MEADOW_SAGE = featureGetter.getOrThrow(RuVegetationFeatures.MEADOW_SAGE);
        final Holder<ConfiguredFeature<?, ?>> REDSTONE_BULB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_REDSTONE_BULB);

        final Holder<ConfiguredFeature<?, ?>> ORANGE_CONEFLOWER = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ORANGE_CONEFLOWER);
        final Holder<ConfiguredFeature<?, ?>> PURPLE_CONEFLOWER = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PURPLE_CONEFLOWER);
        final Holder<ConfiguredFeature<?, ?>> MAGNOLIA_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_MAGNOLIA_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> CLOVER = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_CLOVER);
        //MULTIFACE FLOWERS
        final Holder<ConfiguredFeature<?, ?>> MAPLE_LEAF_PILE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_MAPLE_LEAF_PILE);
        final Holder<ConfiguredFeature<?, ?>> RED_MAPLE_LEAF_PILE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_RED_MAPLE_LEAF_PILE);
        final Holder<ConfiguredFeature<?, ?>> ORANGE_MAPLE_LEAF_PILE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ORANGE_MAPLE_LEAF_PILE);
        final Holder<ConfiguredFeature<?, ?>> SILVER_BIRCH_LEAF_PILE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SILVER_BIRCH_LEAF_PILE);
        final Holder<ConfiguredFeature<?, ?>> ENCHANTED_BIRCH_LEAF_PILE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ENCHANTED_BIRCH_LEAF_PILE);
        final Holder<ConfiguredFeature<?, ?>> PINK_MAGNOLIA_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.PINK_MAGNOLIA_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> WHITE_MAGNOLIA_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.WHITE_MAGNOLIA_FLOWERS);
        //FOOD_PLANTS
        final Holder<ConfiguredFeature<?, ?>> SALMONBERRY_BUSH = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SALMONBERRY_BUSH);
        final Holder<ConfiguredFeature<?, ?>> DUSKMELON = featureGetter.getOrThrow(RuVegetationFeatures.DUSKMELON);
        //BIOSHROOM
        final Holder<ConfiguredFeature<?, ?>> BLUE_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLUE_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> GREEN_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GREEN_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> PINK_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_BIOSHROOM);
        //OTHER
        final Holder<ConfiguredFeature<?, ?>> CACTUS = featureGetter.getOrThrow(VegetationFeatures.PATCH_CACTUS);
        final Holder<ConfiguredFeature<?, ?>> BARREL_CACTUS = featureGetter.getOrThrow(RuVegetationFeatures.BARREL_CACTUS);
        final Holder<ConfiguredFeature<?, ?>> BAMBOO = featureGetter.getOrThrow(RuVegetationFeatures.BAMBOO);
        final Holder<ConfiguredFeature<?, ?>> FLOWERING_LILY = featureGetter.getOrThrow(RuVegetationFeatures.FLOWERING_LILY);
        final Holder<ConfiguredFeature<?, ?>> GIANT_LILY = featureGetter.getOrThrow(RuVegetationFeatures.GIANT_LILY);
        final Holder<ConfiguredFeature<?, ?>> ELEPHANT_EAR = featureGetter.getOrThrow(RuVegetationFeatures.ELEPHANT_EAR);
        final Holder<ConfiguredFeature<?, ?>> DROPLEAF = featureGetter.getOrThrow(RuVegetationFeatures.DROPLEAF);
        final Holder<ConfiguredFeature<?, ?>> DUCKWEED = featureGetter.getOrThrow(RuVegetationFeatures.DUCKWEED);
        //SHRUBS
        final Holder<ConfiguredFeature<?, ?>> ASHEN_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.ASHEN_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> ACACIA_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.ACACIA_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> BAOBAB_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.BAOBAB_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> BIRCH_SHRUB =  featureGetter.getOrThrow(RuVegetationFeatures.BIRCH_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.BLACKWOOD_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> CHERRY_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.CHERRY_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> MAGNOLIA_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.MAGNOLIA_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> PINK_MAGNOLIA_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PINK_MAGNOLIA_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> WHITE_MAGNOLIA_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.WHITE_MAGNOLIA_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> CYPRESS_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.CYPRESS_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> DARK_OAK_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.DARK_OAK_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> DEAD_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.DEAD_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> DEAD_PINE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.DEAD_PINE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> EUCALYPTUS_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.EUCALYPTUS_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> FLOWERING_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.FLOWERING_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> JOSHUA_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.JOSHUA_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> JUNGLE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.JUNGLE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> LARCH_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.LARCH_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> GOLDEN_LARCH_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.GOLDEN_LARCH_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> MANGROVE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.MANGROVE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> MAPLE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.MAPLE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> RED_MAPLE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.RED_MAPLE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> ORANGE_MAPLE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.ORANGE_MAPLE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> MAUVE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.MAUVE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> OAK_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.OAK_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> PALM_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PALM_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> PINE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PINE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> REDWOOD_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.REDWOOD_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> SILVER_BIRCH_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.SILVER_BIRCH_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> SOCOTRA_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.SOCOTRA_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> SPRUCE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.SPRUCE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.WILLOW_SHRUB);
        //mixes
        final Holder<ConfiguredFeature<?, ?>> BAOBAB_ACACIA_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.BAOBAB_ACACIA_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.AUTUMNAL_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> BIRCH_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.BIRCH_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_DARK_OAK_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.BLACKWOOD_DARK_OAK_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> MAGNOLIA_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.MAGNOLIA_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> DEAD_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.DEAD_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> LARCH_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.LARCH_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> GOLDEN_LARCH_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.GOLDEN_LARCH_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> MAPLE_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.MAPLE_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> MAUVE_ENCHANTED_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.MAUVE_ENCHANTED_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> PALM_JUNGLE_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.PALM_JUNGLE_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> PINE_SPRUCE_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.PINE_SPRUCE_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> PINE_DEAD_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.PINE_DEAD_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_CYPRESS_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.WILLOW_CYPRESS_SHRUB_MIX);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_MAGNOLIA_SHRUB_MIX = featureGetter.getOrThrow(RuVegetationFeatures.WILLOW_MAGNOLIA_SHRUB_MIX);

        final Holder<ConfiguredFeature<?, ?>> PRAIRIE_TREE_MIX = featureGetter.getOrThrow(RuVegetationFeatures.PRAIRIE_TREE_MIX);

        //--------------------PLACEMENTS--------------------//
        register(context, RuVegetationPlacements.PINK_FLOWERS, PINK_FLOWERS, RarityFilter.onAverageOnceEvery(6), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.FROZEN_FLOWERS, FROZEN_FLOWERS, RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.BLACKWOOD_MUSHROOMS, BLACKWOOD_MUSHROOMS, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuVegetationPlacements.BLACKWOOD_DECORATION, BLACKWOOD_DECORATION, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuVegetationPlacements.LUPINE_VEGETATION, LUPINE_VEGETATION, CountPlacement.of(16), RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.MEADOW_VEGETATION, MEADOW_VEGETATION, NoiseThresholdCountPlacement.of(-0.8D, 5, 8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        //GRASS
        register(context, RuVegetationPlacements.SANDY_GRASS, SANDY_GRASS, CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome());
        register(context, RuVegetationPlacements.FERNS, FERNS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.GRASS, GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 6), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.CAVE_GRASS, GRASS, List.of(CountOnEveryLayerPlacement.of(70), BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE),  BiomeFilter.biome()));
        register(context, RuVegetationPlacements.TALL_GRASS, TALL_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.CAVE_TALL_GRASS, TALL_GRASS, List.of(CountOnEveryLayerPlacement.of(15), BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome()));
        register(context, RuVegetationPlacements.MEDIUM_GRASS, MEDIUM_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.SNOW_GRASS, SNOW_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.WINDSWEPT_GRASS, WINDSWEPT_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 6), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.STONE_BUD_DENSE, STONE_BUD, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.STONE_BUD_SPARSE, STONE_BUD, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 6), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.ASHEN_GRASS, ASHEN_GRASS, CountPlacement.of(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
        register(context, RuVegetationPlacements.REDWOODS_VEGETATION, REDWOODS_VEGETATION, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 14), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.BLACKWOOD_VEGETATION, BLACKWOOD_VEGETATION, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.DECIDUOUS_VEGETATION, DECIDUOUS_VEGETATION, NoiseThresholdCountPlacement.of(-0.8D, 5, 24), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.FEN_VEGETATION, FEN_VEGETATION, NoiseThresholdCountPlacement.of(-0.8D, 5, 24), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.SHRUBLAND_VEGETATION, SHRUBLAND_VEGETATION, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.MOUNTAIN_VEGETATION, MOUNTAIN_VEGETATION, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.OUTBACK_VEGETATION, OUTBACK_VEGETATION, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.JOSHUA_VEGETATION, JOSHUA_VEGETATION, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 24), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.STEPPE_VEGETATION, STEPPE_VEGETATION, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 24), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.SOCOTRA_VEGETATION, SOCOTRA_VEGETATION, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 24), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.SANDY_GRASS_VEGETATION, SANDY_GRASS_VEGETATION, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.BAYOU_VEGETATION, BAYOU_VEGETATION, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 14), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.DIRT_VEGETATION, DIRT_VEGETATION, NoiseThresholdCountPlacement.of(-0.8D, 5, 10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onDirtPredicate), BiomeFilter.biome());
        register(context, RuVegetationPlacements.GRASS_VEGETATION, GRASS_VEGETATION, NoiseThresholdCountPlacement.of(-0.8D, 5, 10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onGrassBlockPredicate), BiomeFilter.biome());
        register(context, RuVegetationPlacements.REDSTONE_BUD, REDSTONE_BUD, List.of(CountPlacement.of(255), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.PRISMOSS_SPROUT, PRISMOSS_SPROUT, List.of(CountOnEveryLayerPlacement.of(25), BiomeFilter.biome()));
        register(context, RuVegetationPlacements.BLADED_GRASS, BLADED_GRASS, CountOnEveryLayerPlacement.of(155), BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome());
        //FLOWERS
        register(context, RuVegetationPlacements.ASTER, ASTER, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.TULIPS, TULIPS, List.of(RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.CAVE_HYSSOP, CAVE_HYSSOP, List.of(CountOnEveryLayerPlacement.of(2), BiomeFilter.biome()));
        register(context, RuVegetationPlacements.SMALL_FLOWERS, SMALL_FLOWERS, NoiseThresholdCountPlacement.of(-0.8D, 5, 6), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_FLOWERS, TALL_FLOWERS, RarityFilter.onAverageOnceEvery(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.ALPHA_DANDELION, ALPHA_DANDELION, List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.ALPHA_ROSE, ALPHA_ROSE, List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.WILTING_TRILLIUM, WILTING_TRILLIUM, List.of(RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.WHITE_TRILLIUM, WHITE_TRILLIUM, List.of(RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.AZURE_DAISY, AZURE_DAISY, List.of(RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.DAISY, DAISY, List.of(RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.WARATAH, WARATAH, List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.DAISIES, DAISIES, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 9), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.PRAIRIE_FLOWERS, PRAIRIE_FLOWERS, List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.SHRUBLAND_FLOWERS, SHRUBLAND_FLOWERS, List.of(RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.WILLOW_FLOWERS, WILLOW_FLOWERS, List.of(RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.POPPIES, POPPIES, NoiseThresholdCountPlacement.of(-0.8D, 5, 14), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.TASSEL_SPARSE, TASSEL, CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.TASSEL_DENSE, TASSEL, CountPlacement.of(8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.SNOWBELLE, SNOWBELLE, CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.CORPSE_FLOWER, CORPSE_FLOWER, CountOnEveryLayerPlacement.of(10), BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome());
        register(context, RuVegetationPlacements.DUSKTRAP, DUSKTRAP, CountOnEveryLayerPlacement.of(4), BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome());
        register(context, RuVegetationPlacements.DAY_LILY, DAY_LILY, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.TSUBAKI, TSUBAKI, List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.HIBISCUS, HIBISCUS, List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.MALLOW, MALLOW, List.of(RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.HYSSOP, HYSSOP, List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.BARLEY_SPARSE, BARLEY, RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(ClampedInt.of(UniformInt.of(-3, 1), 0, 1)), BiomeFilter.biome());
        register(context, RuVegetationPlacements.BARLEY_DENSE, BARLEY, NoiseBasedCountPlacement.of(155, 75.0D, 0.0D), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onGrassBlockPredicate), BiomeFilter.biome());
        register(context, RuVegetationPlacements.MEADOW_SAGE, MEADOW_SAGE, RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
        register(context, RuVegetationPlacements.REDSTONE_BULB, REDSTONE_BULB, List.of(CountPlacement.of(64), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome()));

        register(context, RuVegetationPlacements.MAPLE_LEAF_PILE, MAPLE_LEAF_PILE, NoiseThresholdCountPlacement.of(-0.8D, 5, 24), RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.RED_MAPLE_LEAF_PILE, RED_MAPLE_LEAF_PILE, NoiseThresholdCountPlacement.of(-0.8D, 5, 24), RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.ORANGE_MAPLE_LEAF_PILE, ORANGE_MAPLE_LEAF_PILE, NoiseThresholdCountPlacement.of(-0.8D, 5, 24), RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.SILVER_BIRCH_LEAF_PILE_SPARSE, SILVER_BIRCH_LEAF_PILE, NoiseThresholdCountPlacement.of(-0.8D, 5, 24), RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.SILVER_BIRCH_LEAF_PILE_DENSE, SILVER_BIRCH_LEAF_PILE, NoiseThresholdCountPlacement.of(-0.8D, 5, 15), RarityFilter.onAverageOnceEvery(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.ENCHANTED_BIRCH_LEAF_PILE, ENCHANTED_BIRCH_LEAF_PILE, NoiseThresholdCountPlacement.of(-0.8D, 5, 24), RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.ORANGE_CONEFLOWER, ORANGE_CONEFLOWER, NoiseThresholdCountPlacement.of(-0.8D, 5, 10), RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.SPARSE_ORANGE_CONEFLOWER, ORANGE_CONEFLOWER, NoiseThresholdCountPlacement.of(-0.8D, 5, 10), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.PURPLE_CONEFLOWER, PURPLE_CONEFLOWER, NoiseThresholdCountPlacement.of(-0.8D, 5, 10), RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.MAGNOLIA_FLOWERS, MAGNOLIA_FLOWERS, NoiseThresholdCountPlacement.of(-0.8D, 5, 10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.CLOVER, CLOVER, NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.CLOVER_SPARSE, CLOVER, List.of(RarityFilter.onAverageOnceEvery(2),  NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        //MULTIFACE FLOWERS
        register(context, RuVegetationPlacements.PINK_MAGNOLIA_FLOWERS, PINK_MAGNOLIA_FLOWERS, CountPlacement.of(15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuVegetationPlacements.WHITE_MAGNOLIA_FLOWERS, WHITE_MAGNOLIA_FLOWERS, CountPlacement.of(15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        //FOOD_PLANTS
        register(context, RuVegetationPlacements.RARE_SALMONBERRY_BUSH, SALMONBERRY_BUSH, RarityFilter.onAverageOnceEvery(64), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
        register(context, RuVegetationPlacements.COMMON_SALMONBERRY_BUSH, SALMONBERRY_BUSH, RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
        register(context, RuVegetationPlacements.DUSKMELON, DUSKMELON, CountOnEveryLayerPlacement.of(10), BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome());
        //BIOSHROOM
        register(context, RuVegetationPlacements.BLUE_BIOSHROOM, BLUE_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(5), BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome()));
        register(context, RuVegetationPlacements.GREEN_BIOSHROOM, GREEN_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(5), BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome()));
        register(context, RuVegetationPlacements.PINK_BIOSHROOM, PINK_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(2), BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome()));
        register(context, RuVegetationPlacements.PINK_BIOSHROOM_DENSE, PINK_BIOSHROOM, CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        //OTHER
        register(context, RuVegetationPlacements.CACTUS_DENSE, CACTUS, RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.BARREL_CACTUS, BARREL_CACTUS, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome());
        register(context, RuVegetationPlacements.BAMBOO, BAMBOO, NoiseBasedCountPlacement.of(30, -0.8D, 2.0D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
        register(context, RuVegetationPlacements.FLOWERING_LILY, FLOWERING_LILY, List.of(CountPlacement.of(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.GIANT_LILY, GIANT_LILY, CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
        register(context, RuVegetationPlacements.ELEPHANT_EAR_SPARSE, ELEPHANT_EAR, CountPlacement.of(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome());
        register(context, RuVegetationPlacements.ELEPHANT_EAR_DENSE, ELEPHANT_EAR, CountPlacement.of(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE), BiomeFilter.biome());
        register(context, RuVegetationPlacements.DROPLEAF, DROPLEAF, CountOnEveryLayerPlacement.of(255), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
        register(context, RuVegetationPlacements.DUCKWEED, DUCKWEED, List.of(CountPlacement.of(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        //SHRUBS
        register(context, RuVegetationPlacements.ASHEN_SHRUB, ASHEN_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.ACACIA_SHRUB, ACACIA_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.BAOBAB_SHRUB, BAOBAB_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.BIRCH_SHRUB, BIRCH_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.BLACKWOOD_SHRUB, BLACKWOOD_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.CHERRY_SHRUB, CHERRY_SHRUB, RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.MAGNOLIA_SHRUB, MAGNOLIA_SHRUB, RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.PINK_MAGNOLIA_SHRUB, PINK_MAGNOLIA_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.WHITE_MAGNOLIA_SHRUB, WHITE_MAGNOLIA_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.CYPRESS_SHRUB, CYPRESS_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.DARK_OAK_SHRUB, DARK_OAK_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.DEAD_SHRUB, DEAD_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.DEAD_PINE_SHRUB, DEAD_PINE_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.EUCALYPTUS_SHRUB, EUCALYPTUS_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.FLOWERING_SHRUB, FLOWERING_SHRUB, RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.JOSHUA_SHRUB, JOSHUA_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.JUNGLE_SHRUB, JUNGLE_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.LARCH_SHRUB, LARCH_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.GOLDEN_LARCH_SHRUB, GOLDEN_LARCH_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.MANGROVE_SHRUB, MANGROVE_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.MAPLE_SHRUB, MAPLE_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.RED_MAPLE_SHRUB, RED_MAPLE_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.ORANGE_MAPLE_SHRUB, ORANGE_MAPLE_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.MAUVE_SHRUB, MAUVE_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.OAK_SHRUB, OAK_SHRUB, RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.PALM_SHRUB, PALM_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.PINE_SHRUB, PINE_SHRUB, CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.REDWOOD_SHRUB, REDWOOD_SHRUB, CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.SILVER_BIRCH_SHRUB, SILVER_BIRCH_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.SOCOTRA_SHRUB, SOCOTRA_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.SPRUCE_SHRUB, SPRUCE_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.WILLOW_SHRUB, WILLOW_SHRUB, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        //mixes
        register(context, RuVegetationPlacements.BAOBAB_ACACIA_SHRUB_MIX, BAOBAB_ACACIA_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.AUTUMNAL_SHRUB_MIX, AUTUMNAL_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.BIRCH_SHRUB_MIX, BIRCH_SHRUB_MIX, CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.BLACKWOOD_DARK_OAK_SHRUB_MIX, BLACKWOOD_DARK_OAK_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.MAGNOLIA_SHRUB_MIX, MAGNOLIA_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.DEAD_SHRUB_MIX, DEAD_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.LARCH_SHRUB_MIX, LARCH_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.GOLDEN_LARCH_SHRUB_MIX, GOLDEN_LARCH_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.MAPLE_SHRUB_MIX, MAPLE_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.MAUVE_ENCHANTED_SHRUB_MIX, MAUVE_ENCHANTED_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.PALM_JUNGLE_SHRUB_MIX, PALM_JUNGLE_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.PINE_SPRUCE_SHRUB_MIX, PINE_SPRUCE_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.PINE_DEAD_SHRUB_MIX, PINE_DEAD_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.WILLOW_CYPRESS_SHRUB_MIX, WILLOW_CYPRESS_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.WILLOW_MAGNOLIA_SHRUB_MIX, WILLOW_MAGNOLIA_SHRUB_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());

        register(context, RuVegetationPlacements.PRAIRIE_TREES, PRAIRIE_TREE_MIX, NoiseBasedCountPlacement.of(60, 30.0D, -0.5D), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(PlacedFeatureRegistry.onGrassBlockPredicate), BiomeFilter.biome());
        //BONE MEALS
        register(context, RuVegetationPlacements.BLADED_GRASS_BONEMEAL, BLADED_GRASS_BONEMEAL, PlacementUtils.isEmpty());
    }

    protected static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}
