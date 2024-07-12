package net.regions_unexplored.data.worldgen.features;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.registry.ConfiguredFeatureRegistry;
import net.regions_unexplored.registry.FeatureRegistry;
import net.regions_unexplored.world.features.treedecorators.BlackwoodBioshroom;
import net.regions_unexplored.world.level.block.plant.flower.GroundCoverBlock;
import net.regions_unexplored.world.level.block.plant.food.DuskmelonBlock;
import net.regions_unexplored.world.level.block.plant.food.SalmonBerryBushBlock;
import net.regions_unexplored.world.level.block.plant.grass.AshenGrassBlock;
import net.regions_unexplored.world.level.feature.configuration.ShrubConfiguration;

import java.util.List;

public class RuVegetationFeatures {
    //-----------------------KEYS-----------------------//
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_FROZEN_FLOWERS = ConfiguredFeatureRegistry.createKey("patch_frozen_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PINK_FLOWERS = ConfiguredFeatureRegistry.createKey("patch_pink_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKWOOD_BIOSHROOMS = ConfiguredFeatureRegistry.createKey("blackwood_bioshrooms");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKWOOD_DECORATION = ConfiguredFeatureRegistry.createKey("blackwood_decoration");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_LUPINE_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_lupine_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MEADOW_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_meadow_vegetation");
    //GRASS
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_FERNS = ConfiguredFeatureRegistry.createKey("patch_ferns");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GRASS = ConfiguredFeatureRegistry.createKey("patch_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SNOW_GRASS = ConfiguredFeatureRegistry.createKey("patch_snow_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TALL_GRASS = ConfiguredFeatureRegistry.createKey("patch_tall_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MEDIUM_GRASS = ConfiguredFeatureRegistry.createKey("patch_medium_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WINDSWEPT_GRASS = ConfiguredFeatureRegistry.createKey("patch_windswept_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_STONE_BUD = ConfiguredFeatureRegistry.createKey("patch_stone_bud");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ASHEN_GRASS = ConfiguredFeatureRegistry.createKey("patch_ashen_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLADED_GRASS = ConfiguredFeatureRegistry.createKey("patch_bladed_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_REDWOODS_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_redwoods_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLACKWOOD_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_blackwood_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_DECIDUOUS_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_deciduous_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_FEN_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_fen_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SHRUBLAND_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_shrubland_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MOUNTAIN_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_mountain_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_STEPPE_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_steppe_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SOCOTRA_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_socotra_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_OUTBACK_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_outback_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_JOSHUA_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_joshua_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SANDY_GRASS_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_sandy_grass_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BAYOU_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_bayou_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_DIRT_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_dirt_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GRASS_VEGETATION = ConfiguredFeatureRegistry.createKey("patch_grass_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_REDSTONE_BUD = ConfiguredFeatureRegistry.createKey("patch_redstone_bud");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PRISMOSS_SPROUT = ConfiguredFeatureRegistry.createKey("patch_prismoss_sprout");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLADED_GRASS_SINGLE = ConfiguredFeatureRegistry.createKey("bladed_grass_single");
    //FLOWERS
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASTER = ConfiguredFeatureRegistry.createKey("aster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TULIPS = ConfiguredFeatureRegistry.createKey("patch_tulips");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_CAVE_HYSSOP = ConfiguredFeatureRegistry.createKey("patch_cave_hyssop");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SMALL_FLOWERS = ConfiguredFeatureRegistry.createKey("patch_small_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TALL_FLOWERS = ConfiguredFeatureRegistry.createKey("patch_tall_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ALPHA_DANDELION = ConfiguredFeatureRegistry.createKey("patch_alpha_dandelion");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ALPHA_ROSE = ConfiguredFeatureRegistry.createKey("patch_alpha_rose");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WHITE_TRILLIUM = ConfiguredFeatureRegistry.createKey("patch_white_trillium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_AZURE_DAISY = ConfiguredFeatureRegistry.createKey("patch_azure_daisy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_DAISY = ConfiguredFeatureRegistry.createKey("patch_daisy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WARATAH = ConfiguredFeatureRegistry.createKey("patch_waratah");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_DAISIES = ConfiguredFeatureRegistry.createKey("patch_daisies");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WILTING_TRILLIUM = ConfiguredFeatureRegistry.createKey("patch_wilting_trillium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PRAIRIE_FLOWERS = ConfiguredFeatureRegistry.createKey("patch_prairie_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SHRUBLAND_FLOWERS = ConfiguredFeatureRegistry.createKey("patch_shrubland_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WILLOW_FLOWERS = ConfiguredFeatureRegistry.createKey("patch_willow_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_POPPIES = ConfiguredFeatureRegistry.createKey("patch_poppies");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TASSEL = ConfiguredFeatureRegistry.createKey("tassel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_SNOWBELLE = ConfiguredFeatureRegistry.createKey("white_snowbelle");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CORPSE_FLOWER = ConfiguredFeatureRegistry.createKey("corpse_flower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DUSKTRAP = ConfiguredFeatureRegistry.createKey("dusktrap");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DAY_LILY = ConfiguredFeatureRegistry.createKey("day_lily");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TSUBAKI = ConfiguredFeatureRegistry.createKey("patch_tsubaki");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_HIBISCUS = ConfiguredFeatureRegistry.createKey("patch_hibiscus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MALLOW = ConfiguredFeatureRegistry.createKey("patch_mallow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_HYSSOP = ConfiguredFeatureRegistry.createKey("patch_hyssop");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BARLEY = ConfiguredFeatureRegistry.createKey("patch_barley");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEADOW_SAGE = ConfiguredFeatureRegistry.createKey("meadow_sage");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BARREL_CACTUS = ConfiguredFeatureRegistry.createKey("barrel_cactus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SANDY_GRASS = ConfiguredFeatureRegistry.createKey("sandy_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_REDSTONE_BULB = ConfiguredFeatureRegistry.createKey("patch_redstone_bulb");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MAPLE_LEAF_PILE = ConfiguredFeatureRegistry.createKey("patch_maple_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_RED_MAPLE_LEAF_PILE = ConfiguredFeatureRegistry.createKey("patch_red_maple_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ORANGE_MAPLE_LEAF_PILE = ConfiguredFeatureRegistry.createKey("patch_orange_maple_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SILVER_BIRCH_LEAF_PILE = ConfiguredFeatureRegistry.createKey("patch_silver_birch_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ENCHANTED_BIRCH_LEAF_PILE = ConfiguredFeatureRegistry.createKey("patch_enchanted_birch_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ORANGE_CONEFLOWER = ConfiguredFeatureRegistry.createKey("patch_orange_coneflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PURPLE_CONEFLOWER = ConfiguredFeatureRegistry.createKey("patch_purple_coneflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MAGNOLIA_FLOWERS = ConfiguredFeatureRegistry.createKey("patch_magnolia_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_CLOVER = ConfiguredFeatureRegistry.createKey("patch_clover");
    //MULTIFACE FLOWERS
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_MAGNOLIA_FLOWERS = ConfiguredFeatureRegistry.createKey("pink_magnolia_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_MAGNOLIA_FLOWERS = ConfiguredFeatureRegistry.createKey("white_magnolia_flowers");
    //FOOD_PLANTS
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SALMONBERRY_BUSH = ConfiguredFeatureRegistry.createKey("patch_salmonberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DUSKMELON = ConfiguredFeatureRegistry.createKey("duskmelon");
    //BIOSHROOM
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLUE_BIOSHROOM = ConfiguredFeatureRegistry.createKey("patch_blue_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GREEN_BIOSHROOM = ConfiguredFeatureRegistry.createKey("patch_green_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PINK_BIOSHROOM = ConfiguredFeatureRegistry.createKey("patch_pink_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_YELLOW_BIOSHROOM = ConfiguredFeatureRegistry.createKey("patch_yellow_bioshroom");
    //OTHER
    public static final ResourceKey<ConfiguredFeature<?, ?>> BAMBOO = ConfiguredFeatureRegistry.createKey("bamboo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERING_LILY = ConfiguredFeatureRegistry.createKey("flowering_lily");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_LILY = ConfiguredFeatureRegistry.createKey("giant_lily");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ELEPHANT_EAR = ConfiguredFeatureRegistry.createKey("elephant_ear");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DROPLEAF = ConfiguredFeatureRegistry.createKey("dropleaf");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DUCKWEED = ConfiguredFeatureRegistry.createKey("duckweed");
    //SHRUBS
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASHEN_SHRUB = ConfiguredFeatureRegistry.createKey("ashen_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ACACIA_SHRUB = ConfiguredFeatureRegistry.createKey("acacia_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BAOBAB_SHRUB = ConfiguredFeatureRegistry.createKey("baobab_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIRCH_SHRUB = ConfiguredFeatureRegistry.createKey("birch_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKWOOD_SHRUB = ConfiguredFeatureRegistry.createKey("blackwood_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHERRY_SHRUB = ConfiguredFeatureRegistry.createKey("cherry_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGNOLIA_SHRUB = ConfiguredFeatureRegistry.createKey("magnolia_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_MAGNOLIA_SHRUB = ConfiguredFeatureRegistry.createKey("pink_magnolia_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_MAGNOLIA_SHRUB = ConfiguredFeatureRegistry.createKey("white_magnolia_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYPRESS_SHRUB = ConfiguredFeatureRegistry.createKey("cypress_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DARK_OAK_SHRUB = ConfiguredFeatureRegistry.createKey("dark_oak_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_SHRUB = ConfiguredFeatureRegistry.createKey("dead_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_PINE_SHRUB = ConfiguredFeatureRegistry.createKey("dead_pine_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EUCALYPTUS_SHRUB = ConfiguredFeatureRegistry.createKey("eucalyptus_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERING_SHRUB = ConfiguredFeatureRegistry.createKey("flowering_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JOSHUA_SHRUB = ConfiguredFeatureRegistry.createKey("joshua_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNGLE_SHRUB = ConfiguredFeatureRegistry.createKey("jungle_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARCH_SHRUB = ConfiguredFeatureRegistry.createKey("larch_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_LARCH_SHRUB = ConfiguredFeatureRegistry.createKey("golden_larch_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGROVE_SHRUB = ConfiguredFeatureRegistry.createKey("mangrove_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAPLE_SHRUB = ConfiguredFeatureRegistry.createKey("maple_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MAPLE_SHRUB = ConfiguredFeatureRegistry.createKey("red_maple_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_MAPLE_SHRUB = ConfiguredFeatureRegistry.createKey("orange_maple_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAUVE_SHRUB = ConfiguredFeatureRegistry.createKey("mauve_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_SHRUB = ConfiguredFeatureRegistry.createKey("oak_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALM_SHRUB = ConfiguredFeatureRegistry.createKey("palm_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_SHRUB = ConfiguredFeatureRegistry.createKey("pine_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDWOOD_SHRUB = ConfiguredFeatureRegistry.createKey("redwood_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_BIRCH_SHRUB = ConfiguredFeatureRegistry.createKey("silver_birch_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SOCOTRA_SHRUB = ConfiguredFeatureRegistry.createKey("socotra_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRUCE_SHRUB = ConfiguredFeatureRegistry.createKey("spruce_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_SHRUB = ConfiguredFeatureRegistry.createKey("willow_shrub");
    //mixes
    public static final ResourceKey<ConfiguredFeature<?, ?>> BAOBAB_ACACIA_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("baobab_acacia_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AUTUMNAL_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("autumnal_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIRCH_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("birch_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKWOOD_DARK_OAK_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("blackwood_dark_oak_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGNOLIA_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("magnolia_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("dead_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARCH_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("larch_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_LARCH_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("golden_larch_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAPLE_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("maple_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAUVE_ENCHANTED_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("mauve_enchanted_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALM_JUNGLE_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("palm_jungle_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_SPRUCE_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("pine_spruce_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_DEAD_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("pine_dead_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_CYPRESS_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("willow_cypress_shrub_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_MAGNOLIA_SHRUB_MIX = ConfiguredFeatureRegistry.createKey("willow_magnolia_shrub_mix");
    //trees
    public static final ResourceKey<ConfiguredFeature<?, ?>> PRAIRIE_TREE_MIX = ConfiguredFeatureRegistry.createKey("prairie_tree_mix");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> OAK_TREE = featureGetter.getOrThrow(RuTreeFeatures.OAK_TREE);
        Holder<ConfiguredFeature<?, ?>> BIG_OAK_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_OAK_TREE);
        HolderGetter<PlacedFeature> placedGetter = context.lookup(Registries.PLACED_FEATURE);
        //GroundCover Builders
        SimpleWeightedRandomList.Builder<BlockState> mapleLeafPileBuilder = SimpleWeightedRandomList.builder();
        SimpleWeightedRandomList.Builder<BlockState> redMapleLeafPileBuilder = SimpleWeightedRandomList.builder();
        SimpleWeightedRandomList.Builder<BlockState> orangeMapleLeafPileBuilder = SimpleWeightedRandomList.builder();
        SimpleWeightedRandomList.Builder<BlockState> silverBirchLeafPileBuilder = SimpleWeightedRandomList.builder();
        SimpleWeightedRandomList.Builder<BlockState> enchantedBirchLeafPileBuilder = SimpleWeightedRandomList.builder();
        //Petal-Like Builders
        SimpleWeightedRandomList.Builder<BlockState> orangeConeflowerBuilder = SimpleWeightedRandomList.builder();
        SimpleWeightedRandomList.Builder<BlockState> purpleConeflowerBuilder = SimpleWeightedRandomList.builder();
        SimpleWeightedRandomList.Builder<BlockState> magnoliaFlowerBuilder = SimpleWeightedRandomList.builder();
        SimpleWeightedRandomList.Builder<BlockState> cloverBuilder = SimpleWeightedRandomList.builder();
        //Other Builders
        SimpleWeightedRandomList.Builder<BlockState> duskMelon = SimpleWeightedRandomList.builder();
        duskMelon.add(RuBlocks.DUSKMELON.get().defaultBlockState().setValue(DuskmelonBlock.AGE, 1), 3).add(RuBlocks.DUSKMELON.get().defaultBlockState().setValue(DuskmelonBlock.AGE, 2), 2);
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                mapleLeafPileBuilder.add(RuBlocks.MAPLE_LEAF_PILE.get().defaultBlockState().setValue(GroundCoverBlock.AMOUNT, Integer.valueOf(i)).setValue(GroundCoverBlock.FACING, direction), 1);
                redMapleLeafPileBuilder.add(RuBlocks.RED_MAPLE_LEAF_PILE.get().defaultBlockState().setValue(GroundCoverBlock.AMOUNT, Integer.valueOf(i)).setValue(GroundCoverBlock.FACING, direction), 1);
                orangeMapleLeafPileBuilder.add(RuBlocks.ORANGE_MAPLE_LEAF_PILE.get().defaultBlockState().setValue(GroundCoverBlock.AMOUNT, Integer.valueOf(i)).setValue(GroundCoverBlock.FACING, direction), 1);
                silverBirchLeafPileBuilder.add(RuBlocks.SILVER_BIRCH_LEAF_PILE.get().defaultBlockState().setValue(GroundCoverBlock.AMOUNT, Integer.valueOf(i)).setValue(GroundCoverBlock.FACING, direction), 1);
                enchantedBirchLeafPileBuilder.add(RuBlocks.ENCHANTED_BIRCH_LEAF_PILE.get().defaultBlockState().setValue(GroundCoverBlock.AMOUNT, Integer.valueOf(i)).setValue(GroundCoverBlock.FACING, direction), 1);
                orangeConeflowerBuilder.add(RuBlocks.ORANGE_CONEFLOWER.get().defaultBlockState().setValue(GroundCoverBlock.AMOUNT, Integer.valueOf(i)).setValue(GroundCoverBlock.FACING, direction), 1);
                purpleConeflowerBuilder.add(RuBlocks.PURPLE_CONEFLOWER.get().defaultBlockState().setValue(GroundCoverBlock.AMOUNT, Integer.valueOf(i)).setValue(GroundCoverBlock.FACING, direction), 1);
                magnoliaFlowerBuilder.add(Blocks.PINK_PETALS.defaultBlockState().setValue(GroundCoverBlock.AMOUNT, Integer.valueOf(i)).setValue(GroundCoverBlock.FACING, direction), 1);
                cloverBuilder.add(RuBlocks.CLOVER.get().defaultBlockState().setValue(GroundCoverBlock.AMOUNT, Integer.valueOf(i)).setValue(GroundCoverBlock.FACING, direction), 1);
            }
        }


        //---------------------FEATURES---------------------//
        //SIMPLE_RANDOM_SELECTOR
        register(context, PATCH_TALL_FLOWERS, Feature.SIMPLE_RANDOM_SELECTOR, new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.TASSEL.get())))), PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.DAY_LILY.get())))),  PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.MEADOW_SAGE.get())))), PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILAC)))), PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.ROSE_BUSH)))), PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.PEONY)))), PlacementUtils.inlinePlaced(Feature.NO_BONEMEAL_FLOWER, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_OF_THE_VALLEY)))))));
        //SIMPLE_BLOCK
        register(context, ASTER, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.ASTER.get())));
        register(context, BLACKWOOD_DECORATION, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.BLUE_BIOSHROOM.get().defaultBlockState(), 3).add(RuBlocks.PINK_BIOSHROOM.get().defaultBlockState(), 3).add(RuBlocks.TALL_BLUE_BIOSHROOM.get().defaultBlockState(), 1).add(RuBlocks.TALL_PINK_BIOSHROOM.get().defaultBlockState(), 1))));
        register(context, BLADED_GRASS_SINGLE, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.BLADED_GRASS.get().defaultBlockState())));
        register(context, CORPSE_FLOWER, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.CORPSE_FLOWER.get())));
        register(context, DAY_LILY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.DAY_LILY.get())));
        register(context, DUSKTRAP, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.DUSKTRAP.get())));
        register(context, MEADOW_SAGE, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.MEADOW_SAGE.get())));
        register(context, BARREL_CACTUS, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.BARREL_CACTUS.get())));
        register(context, SANDY_GRASS, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.SANDY_GRASS.get())));
        register(context, TASSEL, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.TASSEL.get())));
        register(context, WHITE_SNOWBELLE, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.WHITE_SNOWBELLE.get())));
        //RANDOM_PATCH
        register(context, PATCH_ASHEN_GRASS, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.ASHEN_GRASS.get().defaultBlockState(), 4).add(RuBlocks.ASHEN_GRASS.get().defaultBlockState().setValue(AshenGrassBlock.SMOULDERING, true), 1)), 32));
        register(context, PATCH_BARLEY, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.BARLEY.get()))));
        register(context, PATCH_BAYOU_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.FERN.defaultBlockState(), 30).add(Blocks.SHORT_GRASS.defaultBlockState(), 15).add(Blocks.TALL_GRASS.defaultBlockState(), 3)), 32));
        register(context, PATCH_BLACKWOOD_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.FERN.defaultBlockState(), 15).add(Blocks.SHORT_GRASS.defaultBlockState(), 20).add(Blocks.TALL_GRASS.defaultBlockState(), 10).add(Blocks.LARGE_FERN.defaultBlockState(), 1)), 32));
        register(context, PATCH_BLADED_GRASS, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.BLADED_GRASS.get().defaultBlockState(), 4).add(RuBlocks.BLADED_TALL_GRASS.get().defaultBlockState(), 1).add(Blocks.SHORT_GRASS.defaultBlockState(), 4)), 32));
        register(context, PATCH_CAVE_HYSSOP, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.CAVE_HYSSOP.get().defaultBlockState()), 32));
        register(context, PATCH_CLOVER, Feature.RANDOM_PATCH, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(cloverBuilder)))));
        register(context, PATCH_DECIDUOUS_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.FERN.defaultBlockState(), 30).add(Blocks.SHORT_GRASS.defaultBlockState(), 15).add(Blocks.TALL_GRASS.defaultBlockState(), 10).add(Blocks.LARGE_FERN.defaultBlockState(), 3)), 32));
        register(context, PATCH_FEN_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.FERN.defaultBlockState(), 30).add(Blocks.SHORT_GRASS.defaultBlockState(), 15).add(Blocks.TALL_GRASS.defaultBlockState(), 10).add(Blocks.LARGE_FERN.defaultBlockState(), 5)), 32));
        register(context, PATCH_DIRT_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.FERN.defaultBlockState(), 30).add(Blocks.SHORT_GRASS.defaultBlockState(), 5).add(Blocks.LARGE_FERN.defaultBlockState(), 3)), 32));
        register(context, PATCH_ENCHANTED_BIRCH_LEAF_PILE, Feature.RANDOM_PATCH, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(enchantedBirchLeafPileBuilder)))));
        register(context, PATCH_FERNS, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.FERN.defaultBlockState(), 10).add(Blocks.FERN.defaultBlockState(), 1)), 32));
        register(context, PATCH_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.SHORT_GRASS.defaultBlockState()), 32));
        register(context, PATCH_GRASS_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.FERN.defaultBlockState(), 7).add(Blocks.SHORT_GRASS.defaultBlockState(), 15).add(Blocks.TALL_GRASS.defaultBlockState(), 2)), 32));
        register(context, PATCH_MAPLE_LEAF_PILE, Feature.RANDOM_PATCH, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(mapleLeafPileBuilder)))));
        register(context, PATCH_MEDIUM_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.MEDIUM_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_ORANGE_MAPLE_LEAF_PILE, Feature.RANDOM_PATCH, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(orangeMapleLeafPileBuilder)))));
        register(context, PATCH_PRISMOSS_SPROUT, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.PRISMOSS_SPROUT.get().defaultBlockState()), 32));
        register(context, PATCH_REDSTONE_BUD, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.REDSTONE_BUD.get().defaultBlockState()), 128));
        register(context, PATCH_REDSTONE_BULB, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.REDSTONE_BULB.get().defaultBlockState()), 64));
        register(context, PATCH_REDWOODS_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.FERN.defaultBlockState(), 30).add(Blocks.SHORT_GRASS.defaultBlockState(), 15).add(Blocks.LARGE_FERN.defaultBlockState(), 1)), 32));
        register(context, PATCH_RED_MAPLE_LEAF_PILE, Feature.RANDOM_PATCH, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(redMapleLeafPileBuilder)))));
        register(context, PATCH_SHRUBLAND_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.FERN.defaultBlockState(), 15).add(Blocks.SHORT_GRASS.defaultBlockState(), 30).add(Blocks.TALL_GRASS.defaultBlockState(), 15)), 32));
        register(context, PATCH_MOUNTAIN_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.FERN.defaultBlockState(), 30).add(Blocks.LARGE_FERN.defaultBlockState(), 15).add(Blocks.SHORT_GRASS.defaultBlockState(), 20).add(Blocks.TALL_GRASS.defaultBlockState(), 5)), 32));
        register(context, PATCH_STEPPE_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.STEPPE_GRASS.get().defaultBlockState(), 10).add(RuBlocks.STEPPE_SHRUB.get().defaultBlockState(), 10).add(RuBlocks.SMALL_DESERT_SHRUB.get().defaultBlockState(), 1).add(RuBlocks.STEPPE_TALL_GRASS.get().defaultBlockState(), 1).add(RuBlocks.DEAD_STEPPE_SHRUB.get().defaultBlockState(), 10)), 32));
        register(context, PATCH_SOCOTRA_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.STEPPE_SHRUB.get().defaultBlockState(), 10).add(Blocks.SHORT_GRASS.defaultBlockState(), 10).add(RuBlocks.SMALL_DESERT_SHRUB.get().defaultBlockState(), 5).add(Blocks.TALL_GRASS.defaultBlockState(), 1)), 32));
        register(context, PATCH_OUTBACK_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.STEPPE_GRASS.get().defaultBlockState(), 10).add(Blocks.SHORT_GRASS.defaultBlockState(), 10).add(RuBlocks.DEAD_STEPPE_SHRUB.get().defaultBlockState(), 5).add(RuBlocks.SMALL_DESERT_SHRUB.get().defaultBlockState(), 10)), 32));
        register(context, PATCH_JOSHUA_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.SHORT_GRASS.defaultBlockState(), 10).add(RuBlocks.SANDY_GRASS.get().defaultBlockState(), 8).add(RuBlocks.SMALL_DESERT_SHRUB.get().defaultBlockState(), 10)), 32));
        register(context, PATCH_SANDY_GRASS_VEGETATION, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.SANDY_GRASS.get().defaultBlockState(), 20).add(RuBlocks.SANDY_TALL_GRASS.get().defaultBlockState(), 1)), 32));
        register(context, PATCH_SILVER_BIRCH_LEAF_PILE, Feature.RANDOM_PATCH, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(silverBirchLeafPileBuilder)))));
        register(context, PATCH_SNOW_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.FROZEN_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_STONE_BUD, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.STONE_BUD.get().defaultBlockState()), 32));
        register(context, PATCH_TALL_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.TALL_GRASS.defaultBlockState()), 32));
        register(context, PATCH_WINDSWEPT_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.WINDSWEPT_GRASS.get().defaultBlockState()), 32));
        //FLOWER
        register(context, PATCH_FROZEN_FLOWERS, Feature.FLOWER, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.BLEEDING_HEART.get().defaultBlockState(), 3).add(Blocks.LILY_OF_THE_VALLEY.defaultBlockState(), 2)))));
        register(context, PATCH_PINK_FLOWERS, Feature.FLOWER, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.FIREWEED.get().defaultBlockState(), 3).add(RuBlocks.TSUBAKI.get().defaultBlockState(), 2).add(RuBlocks.PINK_LUPINE.get().defaultBlockState(), 3).add(Blocks.PINK_TULIP.defaultBlockState(), 3)))));
        register(context, PATCH_ALPHA_DANDELION, Feature.FLOWER, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.ALPHA_DANDELION.get().defaultBlockState())))));
        register(context, PATCH_ALPHA_ROSE, Feature.FLOWER, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.ALPHA_ROSE.get().defaultBlockState())))));
        register(context, PATCH_AZURE_DAISY, Feature.FLOWER, new RandomPatchConfiguration(32, 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZURE_BLUET.defaultBlockState(), 1).add(Blocks.OXEYE_DAISY.defaultBlockState(), 1).add(RuBlocks.FELICIA_DAISY.get().defaultBlockState(), 2))))));
        register(context, PATCH_DAISY, Feature.FLOWER, new RandomPatchConfiguration(8, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.DAISY.get())))));
        register(context, PATCH_WARATAH, Feature.FLOWER, new RandomPatchConfiguration(8, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.WARATAH.get())))));
        register(context, PATCH_DAISIES, Feature.FLOWER, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.DAISY.get().defaultBlockState(), 1).add(RuBlocks.FELICIA_DAISY.get().defaultBlockState(), 1)), 32));
        register(context, PATCH_LUPINE_VEGETATION, Feature.FLOWER, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.YELLOW_LUPINE.get().defaultBlockState(), 1).add(RuBlocks.RED_LUPINE.get().defaultBlockState(), 1).add(RuBlocks.BLUE_LUPINE.get().defaultBlockState(), 10).add(RuBlocks.PINK_LUPINE.get().defaultBlockState(), 10).add(RuBlocks.PURPLE_LUPINE.get().defaultBlockState(), 10))))));
        register(context, PATCH_MAGNOLIA_FLOWERS, Feature.FLOWER, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(magnoliaFlowerBuilder)))));
        register(context, PATCH_MEADOW_VEGETATION, Feature.FLOWER, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.HYSSOP.get().defaultBlockState(), 20).add(RuBlocks.FIREWEED.get().defaultBlockState(), 15).add(RuBlocks.DAISY.get().defaultBlockState(), 10).add(Blocks.SHORT_GRASS.defaultBlockState(), 40))))));
        register(context, PATCH_ORANGE_CONEFLOWER, Feature.FLOWER, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(orangeConeflowerBuilder)))));
        register(context, PATCH_POPPIES, Feature.FLOWER, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new NoiseProvider(2345L, new NormalNoise.NoiseParameters(0, 1.0D), 0.075F, List.of(RuBlocks.POPPY_BUSH.get().defaultBlockState(), RuBlocks.SALMON_POPPY_BUSH.get().defaultBlockState()))))));
        register(context, PATCH_PRAIRIE_FLOWERS, Feature.FLOWER, new RandomPatchConfiguration(32, 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.POPPY_BUSH.get().defaultBlockState(), 3).add(RuBlocks.RED_LUPINE.get().defaultBlockState(), 2).add(RuBlocks.YELLOW_LUPINE.get().defaultBlockState(), 1))))));
        register(context, PATCH_PURPLE_CONEFLOWER, Feature.FLOWER, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(purpleConeflowerBuilder)))));
        register(context, PATCH_SHRUBLAND_FLOWERS, Feature.FLOWER, new RandomPatchConfiguration(32, 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.RED_LUPINE.get().defaultBlockState(), 1).add(RuBlocks.BLUE_LUPINE.get().defaultBlockState(), 1))))));
        register(context, PATCH_WILLOW_FLOWERS, Feature.FLOWER, new RandomPatchConfiguration(32, 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.FELICIA_DAISY.get().defaultBlockState(), 2).add(RuBlocks.BLUE_LUPINE.get().defaultBlockState(), 2).add(Blocks.ALLIUM.defaultBlockState(), 1).add(Blocks.CORNFLOWER.defaultBlockState(), 2))))));
        register(context, PATCH_SMALL_FLOWERS, Feature.FLOWER, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new NoiseProvider(2345L, new NormalNoise.NoiseParameters(0, 1.0D), 0.075F, List.of(RuBlocks.MALLOW.get().defaultBlockState(), RuBlocks.YELLOW_LUPINE.get().defaultBlockState(), Blocks.PINK_TULIP.defaultBlockState(), RuBlocks.POPPY_BUSH.get().defaultBlockState(), Blocks.OXEYE_DAISY.defaultBlockState(), RuBlocks.RED_LUPINE.get().defaultBlockState(), Blocks.CORNFLOWER.defaultBlockState(), RuBlocks.PINK_LUPINE.get().defaultBlockState(), RuBlocks.TSUBAKI.get().defaultBlockState(), Blocks.ORANGE_TULIP.defaultBlockState(), RuBlocks.WARATAH.get().defaultBlockState(), Blocks.WHITE_TULIP.defaultBlockState(), RuBlocks.HYSSOP.get().defaultBlockState(), Blocks.ALLIUM.defaultBlockState(), RuBlocks.BLUE_LUPINE.get().defaultBlockState(), RuBlocks.BLEEDING_HEART.get().defaultBlockState(), RuBlocks.SALMON_POPPY_BUSH.get().defaultBlockState(), RuBlocks.WHITE_TRILLIUM.get().defaultBlockState(), Blocks.BLUE_ORCHID.defaultBlockState(), RuBlocks.FIREWEED.get().defaultBlockState(), RuBlocks.DAISY.get().defaultBlockState(), RuBlocks.PURPLE_LUPINE.get().defaultBlockState(), Blocks.RED_TULIP.defaultBlockState(), RuBlocks.FELICIA_DAISY.get().defaultBlockState(), Blocks.POPPY.defaultBlockState(), Blocks.LILY_OF_THE_VALLEY.defaultBlockState()))))));
        register(context, PATCH_TULIPS, Feature.FLOWER, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.WHITE_TULIP.defaultBlockState(), 4).add(Blocks.PINK_TULIP.defaultBlockState(), 2).add(Blocks.ORANGE_TULIP.defaultBlockState(), 2).add(Blocks.RED_TULIP.defaultBlockState(), 2)))));
        register(context, PATCH_WHITE_TRILLIUM, Feature.FLOWER, new RandomPatchConfiguration(32, 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.WHITE_TRILLIUM.get().defaultBlockState())))));
        register(context, PATCH_WILTING_TRILLIUM, Feature.FLOWER, new RandomPatchConfiguration(32, 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.WILTING_TRILLIUM.get().defaultBlockState())))));
        register(context, PATCH_TSUBAKI, Feature.FLOWER, new RandomPatchConfiguration(32, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.TSUBAKI.get())))));
        register(context, PATCH_HIBISCUS, Feature.FLOWER, new RandomPatchConfiguration(14, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.HIBISCUS.get())))));
        register(context, PATCH_MALLOW, Feature.FLOWER, new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.MALLOW.get())))));
        register(context, PATCH_HYSSOP, Feature.FLOWER, new RandomPatchConfiguration(16, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.HYSSOP.get())))));
        //TREE
        register(context, BLACKWOOD_BIOSHROOMS, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState()), new StraightTrunkPlacer(2, 1, 0), BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), 0), new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(BlackwoodBioshroom.INSTANCE)).ignoreVines().build());
        //MULTIFACE
        register(context, PINK_MAGNOLIA_FLOWERS, FeatureRegistry.AIR_MULTIFACE_GROWTH.get(), new MultifaceGrowthConfiguration((MultifaceBlock)RuBlocks.PINK_MAGNOLIA_FLOWERS.get(), 20, true, false, false, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.GRASS_BLOCK, RuBlocks.PEAT_GRASS_BLOCK.get(), RuBlocks.SILT_GRASS_BLOCK.get())));
        register(context, WHITE_MAGNOLIA_FLOWERS, FeatureRegistry.AIR_MULTIFACE_GROWTH.get(), new MultifaceGrowthConfiguration((MultifaceBlock)RuBlocks.WHITE_MAGNOLIA_FLOWERS.get(), 20, true, false, false, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.GRASS_BLOCK, RuBlocks.PEAT_GRASS_BLOCK.get(), RuBlocks.SILT_GRASS_BLOCK.get())));
        //FOOD_PLANTS
        register(context, PATCH_SALMONBERRY_BUSH, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.SALMONBERRY_BUSH.get().defaultBlockState().setValue(SalmonBerryBushBlock.AGE, Integer.valueOf(3)))), List.of(Blocks.GRASS_BLOCK, Blocks.PODZOL, RuBlocks.PEAT_GRASS_BLOCK.get(), RuBlocks.SILT_GRASS_BLOCK.get(), RuBlocks.PEAT_PODZOL.get(), RuBlocks.SILT_PODZOL.get())));
        register(context, DUSKMELON, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(duskMelon)));
        //BIOSHROOM
        register(context, PATCH_BLUE_BIOSHROOM, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.TALL_BLUE_BIOSHROOM.get().defaultBlockState(), 1).add(RuBlocks.BLUE_BIOSHROOM.get().defaultBlockState(), 10)), 16));
        register(context, PATCH_GREEN_BIOSHROOM, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.TALL_GREEN_BIOSHROOM.get().defaultBlockState(), 1).add(RuBlocks.GREEN_BIOSHROOM.get().defaultBlockState(), 10)), 16));
        register(context, PATCH_PINK_BIOSHROOM, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.TALL_PINK_BIOSHROOM.get().defaultBlockState(), 1).add(RuBlocks.PINK_BIOSHROOM.get().defaultBlockState(), 8)), 16));
        register(context, PATCH_YELLOW_BIOSHROOM, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.TALL_YELLOW_BIOSHROOM.get().defaultBlockState(), 1).add(RuBlocks.YELLOW_BIOSHROOM.get().defaultBlockState(), 6)), 6));
        //OTHER
        register(context, BAMBOO, Feature.BAMBOO, new ProbabilityFeatureConfiguration(0.25F));
        register(context, FLOWERING_LILY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(10, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.FLOWERING_LILY_PAD.get())))));
        register(context, GIANT_LILY, FeatureRegistry.GIANT_LILY.get(), FeatureConfiguration.NONE);
        register(context, ELEPHANT_EAR, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.ELEPHANT_EAR.get())));
        register(context, DROPLEAF, FeatureRegistry.DROPLEAF.get(), FeatureConfiguration.NONE);
        register(context, DUCKWEED, Feature.RANDOM_PATCH, new RandomPatchConfiguration(10, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RuBlocks.DUCKWEED.get())))));

        //SHRUBS
        register(context, ASHEN_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.ASHEN_SHRUB.get().defaultBlockState())));
        register(context, ACACIA_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.ACACIA_SHRUB.get().defaultBlockState())));
        register(context, BAOBAB_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.BAOBAB_SHRUB.get().defaultBlockState())));
        register(context, BIRCH_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.BIRCH_SHRUB.get().defaultBlockState())));
        register(context, BLACKWOOD_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.BLACKWOOD_SHRUB.get().defaultBlockState())));
        register(context, CHERRY_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.CHERRY_SHRUB.get().defaultBlockState())));
        register(context, MAGNOLIA_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.MAGNOLIA_SHRUB.get().defaultBlockState())));
        register(context, PINK_MAGNOLIA_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.PINK_MAGNOLIA_SHRUB.get().defaultBlockState())));
        register(context, WHITE_MAGNOLIA_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.WHITE_MAGNOLIA_SHRUB.get().defaultBlockState())));
        register(context, CYPRESS_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.CYPRESS_SHRUB.get().defaultBlockState())));
        register(context, DARK_OAK_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.DARK_OAK_SHRUB.get().defaultBlockState())));
        register(context, DEAD_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.DEAD_SHRUB.get().defaultBlockState())));
        register(context, DEAD_PINE_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.DEAD_PINE_SHRUB.get().defaultBlockState())));
        register(context, EUCALYPTUS_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.EUCALYPTUS_SHRUB.get().defaultBlockState())));
        register(context, FLOWERING_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.FLOWERING_SHRUB.get().defaultBlockState())));
        register(context, JOSHUA_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.JOSHUA_SHRUB.get().defaultBlockState())));
        register(context, JUNGLE_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.JUNGLE_SHRUB.get().defaultBlockState())));
        register(context, LARCH_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.LARCH_SHRUB.get().defaultBlockState())));
        register(context, GOLDEN_LARCH_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.GOLDEN_LARCH_SHRUB.get().defaultBlockState())));
        register(context, MANGROVE_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.MANGROVE_SHRUB.get().defaultBlockState())));
        register(context, MAPLE_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.MAPLE_SHRUB.get().defaultBlockState())));
        register(context, RED_MAPLE_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.RED_MAPLE_SHRUB.get().defaultBlockState())));
        register(context, ORANGE_MAPLE_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.ORANGE_MAPLE_SHRUB.get().defaultBlockState())));
        register(context, MAUVE_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.MAUVE_SHRUB.get().defaultBlockState())));
        register(context, OAK_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.OAK_SHRUB.get().defaultBlockState())));
        register(context, PALM_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.PALM_SHRUB.get().defaultBlockState())));
        register(context, PINE_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.PINE_SHRUB.get().defaultBlockState())));
        register(context, REDWOOD_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.REDWOOD_SHRUB.get().defaultBlockState())));
        register(context, SILVER_BIRCH_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.SILVER_BIRCH_SHRUB.get().defaultBlockState())));
        register(context, SOCOTRA_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.SOCOTRA_SHRUB.get().defaultBlockState())));
        register(context, SPRUCE_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.SPRUCE_SHRUB.get().defaultBlockState())));
        register(context, WILLOW_SHRUB, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(BlockStateProvider.simple(RuBlocks.WILLOW_SHRUB.get().defaultBlockState())));
        //mixes
        register(context, BAOBAB_ACACIA_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.BAOBAB_SHRUB.get().defaultBlockState(), 2).add(RuBlocks.ACACIA_SHRUB.get().defaultBlockState(), 1))));
        register(context, AUTUMNAL_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.MAPLE_SHRUB.get().defaultBlockState(), 2).add(RuBlocks.SILVER_BIRCH_SHRUB.get().defaultBlockState(), 4).add(RuBlocks.RED_MAPLE_SHRUB.get().defaultBlockState(), 4).add(RuBlocks.ORANGE_MAPLE_SHRUB.get().defaultBlockState(), 4))));
        register(context, BIRCH_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.SILVER_BIRCH_SHRUB.get().defaultBlockState(), 3).add(RuBlocks.BIRCH_SHRUB.get().defaultBlockState(), 1))));
        register(context, BLACKWOOD_DARK_OAK_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.BLACKWOOD_SHRUB.get().defaultBlockState(), 3).add(RuBlocks.DARK_OAK_SHRUB.get().defaultBlockState(), 1))));
        register(context, MAGNOLIA_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.MAGNOLIA_SHRUB.get().defaultBlockState(), 1).add(RuBlocks.PINK_MAGNOLIA_SHRUB.get().defaultBlockState(), 1).add(RuBlocks.WHITE_MAGNOLIA_SHRUB.get().defaultBlockState(), 1))));
        register(context, DEAD_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.DEAD_SHRUB.get().defaultBlockState(), 2).add(RuBlocks.DEAD_PINE_SHRUB.get().defaultBlockState(), 1))));
        register(context, LARCH_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.LARCH_SHRUB.get().defaultBlockState(), 3).add(RuBlocks.GOLDEN_LARCH_SHRUB.get().defaultBlockState(), 1))));
        register(context, GOLDEN_LARCH_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.LARCH_SHRUB.get().defaultBlockState(), 1).add(RuBlocks.GOLDEN_LARCH_SHRUB.get().defaultBlockState(), 3))));
        register(context, MAPLE_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.MAPLE_SHRUB.get().defaultBlockState(), 4).add(RuBlocks.RED_MAPLE_SHRUB.get().defaultBlockState(), 1))));
        register(context, MAUVE_ENCHANTED_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.MAUVE_SHRUB.get().defaultBlockState(), 3).add(RuBlocks.ENCHANTED_BIRCH_SHRUB.get().defaultBlockState(), 1))));
        register(context, PINE_SPRUCE_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.PINE_SHRUB.get().defaultBlockState(), 1).add(RuBlocks.SPRUCE_SHRUB.get().defaultBlockState(), 1))));
        register(context, PINE_DEAD_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.PINE_SHRUB.get().defaultBlockState(), 2).add(RuBlocks.DEAD_PINE_SHRUB.get().defaultBlockState(), 1))));
        register(context, PALM_JUNGLE_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.PALM_SHRUB.get().defaultBlockState(), 5).add(RuBlocks.JUNGLE_SHRUB.get().defaultBlockState(), 1))));
        register(context, WILLOW_CYPRESS_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.WILLOW_SHRUB.get().defaultBlockState(), 2).add(RuBlocks.CYPRESS_SHRUB.get().defaultBlockState(), 1))));
        register(context, WILLOW_MAGNOLIA_SHRUB_MIX, FeatureRegistry.SHRUB.get(), new ShrubConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RuBlocks.WILLOW_SHRUB.get().defaultBlockState(), 2).add(RuBlocks.BLUE_MAGNOLIA_SHRUB.get().defaultBlockState(), 1))));

        register(context, PRAIRIE_TREE_MIX, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(PlacementUtils.inlinePlaced(BIG_OAK_TREE), 0.33333334F)), PlacementUtils.inlinePlaced(OAK_TREE)));

    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int i) {
        return FeatureUtils.simpleRandomPatchConfiguration(i, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(stateProvider)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
