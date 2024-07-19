package net.regions_unexplored.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.block.sapling.RuTreeGrowers;
import net.regions_unexplored.data.block.RuBlockSetType;
import net.regions_unexplored.data.block.RuWoodTypes;
import net.regions_unexplored.data.worldgen.features.RuNetherFeatures;
import net.regions_unexplored.registry.BlockRegistry;
import net.regions_unexplored.world.level.block.alpha.AlphaGrassBlock;
import net.regions_unexplored.world.level.block.aquatic.*;
import net.regions_unexplored.world.level.block.cave.*;
import net.regions_unexplored.world.level.block.forest_dirt.PeatDirtPathBlock;
import net.regions_unexplored.world.level.block.forest_dirt.PeatFarmBlock;
import net.regions_unexplored.world.level.block.forest_dirt.PeatGrassBlock;
import net.regions_unexplored.world.level.block.nether.RuBlackstoneNyliumBlock;
import net.regions_unexplored.world.level.block.nether.RuNyliumBlock;
import net.regions_unexplored.world.level.block.other.*;
import net.regions_unexplored.world.level.block.other_dirt.*;
import net.regions_unexplored.world.level.block.plains_dirt.SiltDirtPathBlock;
import net.regions_unexplored.world.level.block.plains_dirt.SiltFarmBlock;
import net.regions_unexplored.world.level.block.plains_dirt.SiltGrassBlock;
import net.regions_unexplored.world.level.block.plant.branch.BranchBlock;
import net.regions_unexplored.world.level.block.plant.dusktrap.DuskTrapBlock;
import net.regions_unexplored.world.level.block.plant.flower.CaveFlowerBlock;
import net.regions_unexplored.world.level.block.plant.flower.GroundCoverBlock;
import net.regions_unexplored.world.level.block.plant.flower.RuFlowerBlock;
import net.regions_unexplored.world.level.block.plant.flower.RuSnowFlowerBlock;
import net.regions_unexplored.world.level.block.plant.food.DuskmelonBlock;
import net.regions_unexplored.world.level.block.plant.food.SalmonBerryBushBlock;
import net.regions_unexplored.world.level.block.plant.grass.*;
import net.regions_unexplored.world.level.block.plant.nether.*;
import net.regions_unexplored.world.level.block.plant.other.*;
import net.regions_unexplored.world.level.block.plant.sapling.*;
import net.regions_unexplored.world.level.block.plant.tall.*;
import net.regions_unexplored.world.level.block.wood.BambooLogBlock;
import net.regions_unexplored.world.level.block.wood.SmallOakLogBlock;
import net.regions_unexplored.world.level.block.wood.StrippedBambooLogBlock;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class RuBlocks {
    //0.6.0
    public static RegistryObject<Block> FLOURAMINE;
    public static RegistryObject<Block> FLOURAMINE_PLANT;

    /*-----------------CAVE_BLOCKS-----------------*/
    //PRISMA_BLOCKS
    public static RegistryObject<Block> PRISMOSS;
    public static RegistryObject<Block> DEEPSLATE_PRISMOSS;
    public static RegistryObject<Block> HANGING_PRISMARITE;
    public static RegistryObject<Block> LARGE_PRISMARITE_CLUSTER;
    public static RegistryObject<Block> PRISMAGLASS;
    public static RegistryObject<Block> PRISMARITE_CLUSTER;
    public static RegistryObject<Block> PRISMOSS_SPROUT;
    //REDSTONE_BLOCKS
    public static RegistryObject<Block> POINTED_REDSTONE;
    public static RegistryObject<Block> RAW_REDSTONE_BLOCK;
    public static RegistryObject<Block> REDSTONE_BUD;
    public static RegistryObject<Block> REDSTONE_BULB;
    //OTHER_CAVE_BLOCKS
    public static RegistryObject<Block> ARGILLITE_GRASS_BLOCK;
    public static RegistryObject<Block> STONE_GRASS_BLOCK;
    public static RegistryObject<Block> DEEPSLATE_GRASS_BLOCK;
    public static RegistryObject<Block> VIRIDESCENT_NYLIUM;
    public static RegistryObject<Block> DEEPSLATE_VIRIDESCENT_NYLIUM;

    public static RegistryObject<Block> CORPSE_FLOWER;
    public static RegistryObject<Block> BLADED_GRASS;
    public static RegistryObject<Block> BLADED_TALL_GRASS;
    public static RegistryObject<Block> DROPLEAF;
    public static RegistryObject<Block> DROPLEAF_PLANT;
    public static RegistryObject<Block> DUSKMELON;
    public static RegistryObject<Block> DUSKTRAP;
    /*-----------------PLANTS-----------------*/
    //GRASS_BLOCKS
    public static RegistryObject<Block> DEAD_STEPPE_SHRUB;
    public static RegistryObject<Block> FROZEN_GRASS;
    public static RegistryObject<Block> MEDIUM_GRASS;
    public static RegistryObject<Block> SANDY_GRASS;
    public static RegistryObject<Block> SMALL_DESERT_SHRUB;
    public static RegistryObject<Block> STEPPE_GRASS;
    public static RegistryObject<Block> STEPPE_SHRUB;
    public static RegistryObject<Block> STONE_BUD;
    //TALL_GRASS_BLOCKS
    public static RegistryObject<Block> ELEPHANT_EAR;
    public static RegistryObject<Block> SANDY_TALL_GRASS;
    public static RegistryObject<Block> STEPPE_TALL_GRASS;
    public static RegistryObject<Block> WINDSWEPT_GRASS;
    //FLOWERS
    public static RegistryObject<Block> ALPHA_DANDELION;
    public static RegistryObject<Block> ALPHA_ROSE;
    public static RegistryObject<Block> ASTER;
    public static RegistryObject<Block> BLEEDING_HEART;
    public static RegistryObject<Block> BLUE_LUPINE;
    public static RegistryObject<Block> DAISY;
    public static RegistryObject<Block> DORCEL;
    public static RegistryObject<Block> FELICIA_DAISY;
    public static RegistryObject<Block> FIREWEED;
    public static RegistryObject<Block> HIBISCUS;
    public static RegistryObject<Block> HYSSOP;
    public static RegistryObject<Block> MALLOW;
    public static RegistryObject<Block> PINK_LUPINE;
    public static RegistryObject<Block> POPPY_BUSH;
    public static RegistryObject<Block> SALMON_POPPY_BUSH;
    public static RegistryObject<Block> PURPLE_LUPINE;
    public static RegistryObject<Block> RED_LUPINE;
    public static RegistryObject<Block> WARATAH;
    public static RegistryObject<Block> WHITE_TRILLIUM;
    public static RegistryObject<Block> WILTING_TRILLIUM;
    public static RegistryObject<Block> YELLOW_LUPINE;

    public static RegistryObject<Block> ORANGE_CONEFLOWER;
    public static RegistryObject<Block> PURPLE_CONEFLOWER;
    public static RegistryObject<Block> CLOVER;

    public static RegistryObject<Block> BLUE_MAGNOLIA_FLOWERS;
    public static RegistryObject<Block> PINK_MAGNOLIA_FLOWERS;
    public static RegistryObject<Block> WHITE_MAGNOLIA_FLOWERS;
    //SNOWBELLE
    public static RegistryObject<Block> RED_SNOWBELLE;
    public static RegistryObject<Block> ORANGE_SNOWBELLE;
    public static RegistryObject<Block> YELLOW_SNOWBELLE;
    public static RegistryObject<Block> LIME_SNOWBELLE;
    public static RegistryObject<Block> GREEN_SNOWBELLE;
    public static RegistryObject<Block> CYAN_SNOWBELLE;
    public static RegistryObject<Block> LIGHT_BLUE_SNOWBELLE;
    public static RegistryObject<Block> BLUE_SNOWBELLE;
    public static RegistryObject<Block> PURPLE_SNOWBELLE;
    public static RegistryObject<Block> MAGENTA_SNOWBELLE;
    public static RegistryObject<Block> PINK_SNOWBELLE;
    public static RegistryObject<Block> BROWN_SNOWBELLE;
    public static RegistryObject<Block> WHITE_SNOWBELLE;
    public static RegistryObject<Block> LIGHT_GRAY_SNOWBELLE;
    public static RegistryObject<Block> GRAY_SNOWBELLE;
    public static RegistryObject<Block> BLACK_SNOWBELLE;

    public static RegistryObject<Block> MAPLE_LEAF_PILE;
    public static RegistryObject<Block> RED_MAPLE_LEAF_PILE;
    public static RegistryObject<Block> ORANGE_MAPLE_LEAF_PILE;
    public static RegistryObject<Block> SILVER_BIRCH_LEAF_PILE;
    public static RegistryObject<Block> ENCHANTED_BIRCH_LEAF_PILE;
    //TALL_PLANTS
    public static RegistryObject<Block> MEADOW_SAGE;
    public static RegistryObject<Block> BARLEY;
    public static RegistryObject<Block> CATTAIL;
    public static RegistryObject<Block> TASSEL;
    public static RegistryObject<Block> TSUBAKI;
    public static RegistryObject<Block> DAY_LILY;
    //SAPLINGS
    public static RegistryObject<Block> ASHEN_SAPLING;
    public static RegistryObject<Block> ALPHA_SAPLING;
    public static RegistryObject<Block> APPLE_OAK_SAPLING;
    public static RegistryObject<Block> BAMBOO_SAPLING;
    public static RegistryObject<Block> BAOBAB_SAPLING;
    public static RegistryObject<Block> BLACKWOOD_SAPLING;
    public static RegistryObject<Block> BRIMWOOD_SAPLING;
    public static RegistryObject<Block> COBALT_SAPLING;
    public static RegistryObject<Block> CACTUS_FLOWER;
    public static RegistryObject<Block> CYPRESS_SAPLING;
    public static RegistryObject<Block> DEAD_PINE_SAPLING;
    public static RegistryObject<Block> DEAD_SAPLING;
    public static RegistryObject<Block> EUCALYPTUS_SAPLING;
    public static RegistryObject<Block> FLOWERING_SAPLING;
    public static RegistryObject<Block> GOLDEN_LARCH_SAPLING;
    public static RegistryObject<Block> JOSHUA_SAPLING;
    public static RegistryObject<Block> KAPOK_SAPLING;
    public static RegistryObject<Block> LARCH_SAPLING;
    public static RegistryObject<Block> MAGNOLIA_SAPLING;
    public static RegistryObject<Block> MAPLE_SAPLING;
    public static RegistryObject<Block> MAUVE_SAPLING;
    public static RegistryObject<Block> ORANGE_MAPLE_SAPLING;
    public static RegistryObject<Block> PALM_SAPLING;
    public static RegistryObject<Block> PINE_SAPLING;
    public static RegistryObject<Block> BLUE_MAGNOLIA_SAPLING;
    public static RegistryObject<Block> PINK_MAGNOLIA_SAPLING;
    public static RegistryObject<Block> REDWOOD_SAPLING;
    public static RegistryObject<Block> RED_MAPLE_SAPLING;
    public static RegistryObject<Block> ENCHANTED_BIRCH_SAPLING;
    public static RegistryObject<Block> SILVER_BIRCH_SAPLING;
    public static RegistryObject<Block> SMALL_OAK_SAPLING;
    public static RegistryObject<Block> SOCOTRA_SAPLING;
    public static RegistryObject<Block> WHITE_MAGNOLIA_SAPLING;
    public static RegistryObject<Block> WILLOW_SAPLING;
    //SHRUBS
    public static RegistryObject<Block> ACACIA_SHRUB;
    public static RegistryObject<Block> BAOBAB_SHRUB;
    public static RegistryObject<Block> BIRCH_SHRUB;
    public static RegistryObject<Block> BLACKWOOD_SHRUB;
    public static RegistryObject<Block> BRIMWOOD_SHRUB;
    public static RegistryObject<Block> CHERRY_SHRUB;
    public static RegistryObject<Block> CYPRESS_SHRUB;
    public static RegistryObject<Block> DARK_OAK_SHRUB;
    public static RegistryObject<Block> DEAD_PINE_SHRUB;
    public static RegistryObject<Block> DEAD_SHRUB;
    public static RegistryObject<Block> EUCALYPTUS_SHRUB;
    public static RegistryObject<Block> FLOWERING_SHRUB;
    public static RegistryObject<Block> GOLDEN_LARCH_SHRUB;
    public static RegistryObject<Block> JOSHUA_SHRUB;
    public static RegistryObject<Block> JUNGLE_SHRUB;
    public static RegistryObject<Block> KAPOK_SHRUB;
    public static RegistryObject<Block> LARCH_SHRUB;
    public static RegistryObject<Block> MAGNOLIA_SHRUB;
    public static RegistryObject<Block> MANGROVE_SHRUB;
    public static RegistryObject<Block> MAPLE_SHRUB;
    public static RegistryObject<Block> MAUVE_SHRUB;
    public static RegistryObject<Block> OAK_SHRUB;
    public static RegistryObject<Block> ORANGE_MAPLE_SHRUB;
    public static RegistryObject<Block> PALM_SHRUB;
    public static RegistryObject<Block> PINE_SHRUB;
    public static RegistryObject<Block> BLUE_MAGNOLIA_SHRUB;
    public static RegistryObject<Block> PINK_MAGNOLIA_SHRUB;
    public static RegistryObject<Block> REDWOOD_SHRUB;
    public static RegistryObject<Block> RED_MAPLE_SHRUB;
    public static RegistryObject<Block> ENCHANTED_BIRCH_SHRUB;
    public static RegistryObject<Block> SILVER_BIRCH_SHRUB;
    public static RegistryObject<Block> SOCOTRA_SHRUB;
    public static RegistryObject<Block> SPRUCE_SHRUB;
    public static RegistryObject<Block> WHITE_MAGNOLIA_SHRUB;
    public static RegistryObject<Block> WILLOW_SHRUB;
    //MUSHROOMS
    public static RegistryObject<Block> BLUE_BIOSHROOM;
    public static RegistryObject<Block> GREEN_BIOSHROOM;
    public static RegistryObject<Block> PINK_BIOSHROOM;
    public static RegistryObject<Block> YELLOW_BIOSHROOM;
    public static RegistryObject<Block> TALL_BLUE_BIOSHROOM;
    public static RegistryObject<Block> TALL_GREEN_BIOSHROOM;
    public static RegistryObject<Block> TALL_PINK_BIOSHROOM;
    public static RegistryObject<Block> TALL_YELLOW_BIOSHROOM;
    //OTHER_PLANT_BLOCKS
    public static RegistryObject<Block> ICICLE;
    public static RegistryObject<Block> BARREL_CACTUS;
    public static RegistryObject<Block> CAVE_HYSSOP;
    public static RegistryObject<Block> DUCKWEED;
    public static RegistryObject<Block> SPANISH_MOSS;
    public static RegistryObject<Block> SPANISH_MOSS_PLANT;
    public static RegistryObject<Block> KAPOK_VINES;
    public static RegistryObject<Block> KAPOK_VINES_PLANT;
    //public static RegistryObject<Block> WILLOW_VINES;
    public static RegistryObject<Block> FLOWERING_LILY_PAD;
    public static RegistryObject<Block> GIANT_LILY_PAD;
    //FOOD_PLANT_BLOCKS
    public static RegistryObject<Block> SALMONBERRY_BUSH;

    /*-----------------POTTED_PLANTS-----------------*/
    //POTTED_FLOWERS
    public static RegistryObject<Block> POTTED_ALPHA_DANDELION;
    public static RegistryObject<Block> POTTED_ALPHA_ROSE;
    public static RegistryObject<Block> POTTED_ASTER;
    public static RegistryObject<Block> POTTED_BLEEDING_HEART;
    public static RegistryObject<Block> POTTED_BLUE_LUPINE;
    public static RegistryObject<Block> POTTED_DAISY;
    public static RegistryObject<Block> POTTED_DORCEL;
    public static RegistryObject<Block> POTTED_FELICIA_DAISY;
    public static RegistryObject<Block> POTTED_FIREWEED;
    public static RegistryObject<Block> POTTED_GLISTERING_BLOOM;
    public static RegistryObject<Block> POTTED_HIBISCUS;
    public static RegistryObject<Block> POTTED_HYSSOP;
    public static RegistryObject<Block> POTTED_MALLOW;
    public static RegistryObject<Block> POTTED_PINK_LUPINE;
    public static RegistryObject<Block> POTTED_POPPY_BUSH;
    public static RegistryObject<Block> POTTED_SALMON_POPPY_BUSH;
    public static RegistryObject<Block> POTTED_PURPLE_LUPINE;
    public static RegistryObject<Block> POTTED_RED_LUPINE;
    public static RegistryObject<Block> POTTED_TSUBAKI;
    public static RegistryObject<Block> POTTED_ORANGE_CONEFLOWER;
    public static RegistryObject<Block> POTTED_PURPLE_CONEFLOWER;
    public static RegistryObject<Block> POTTED_WARATAH;
    public static RegistryObject<Block> POTTED_WHITE_TRILLIUM;
    public static RegistryObject<Block> POTTED_WILTING_TRILLIUM;
    public static RegistryObject<Block> POTTED_YELLOW_LUPINE;
    //OTHER_POTS
    public static RegistryObject<Block> POTTED_DAY_LILY;
    public static RegistryObject<Block> POTTED_MEADOW_SAGE;
    public static RegistryObject<Block> POTTED_DUSKTRAP;
    public static RegistryObject<Block> POTTED_CORPSE_FLOWER;
    public static RegistryObject<Block> POTTED_COBALT_EARLIGHT;
    public static RegistryObject<Block> POTTED_TALL_COBALT_EARLIGHT;
    public static RegistryObject<Block> POTTED_MYCOTOXIC_DAISY;
    public static RegistryObject<Block> POTTED_GLISTER_SPIRE;
    //POTTED_SAPLINGS
    public static RegistryObject<Block> POTTED_ASHEN_SAPLING;
    public static RegistryObject<Block> POTTED_ALPHA_SAPLING;
    public static RegistryObject<Block> POTTED_APPLE_OAK_SAPLING;
    public static RegistryObject<Block> POTTED_BAMBOO_SAPLING;
    public static RegistryObject<Block> POTTED_BAOBAB_SAPLING;
    public static RegistryObject<Block> POTTED_BLACKWOOD_SAPLING;
    public static RegistryObject<Block> POTTED_BRIMWOOD_SAPLING;
    public static RegistryObject<Block> POTTED_COBALT_SAPLING;
    public static RegistryObject<Block> POTTED_CACTUS_FLOWER;
    public static RegistryObject<Block> POTTED_MAGNOLIA_SAPLING;
    public static RegistryObject<Block> POTTED_CYPRESS_SAPLING;
    public static RegistryObject<Block> POTTED_DEAD_PINE_SAPLING;
    public static RegistryObject<Block> POTTED_DEAD_SAPLING;
    public static RegistryObject<Block> POTTED_EUCALYPTUS_SAPLING;
    public static RegistryObject<Block> POTTED_FLOWERING_SAPLING;
    public static RegistryObject<Block> POTTED_GOLDEN_LARCH_SAPLING;
    public static RegistryObject<Block> POTTED_JOSHUA_SAPLING;
    public static RegistryObject<Block> POTTED_KAPOK_SAPLING;
    public static RegistryObject<Block> POTTED_LARCH_SAPLING;
    public static RegistryObject<Block> POTTED_MAPLE_SAPLING;
    public static RegistryObject<Block> POTTED_MAUVE_SAPLING;
    public static RegistryObject<Block> POTTED_ORANGE_MAPLE_SAPLING;
    public static RegistryObject<Block> POTTED_PALM_SAPLING;
    public static RegistryObject<Block> POTTED_PINE_SAPLING;
    public static RegistryObject<Block> POTTED_BLUE_MAGNOLIA_SAPLING;
    public static RegistryObject<Block> POTTED_PINK_MAGNOLIA_SAPLING;
    public static RegistryObject<Block> POTTED_REDWOOD_SAPLING;
    public static RegistryObject<Block> POTTED_RED_MAPLE_SAPLING;
    public static RegistryObject<Block> POTTED_ENCHANTED_BIRCH_SAPLING;
    public static RegistryObject<Block> POTTED_SILVER_BIRCH_SAPLING;
    public static RegistryObject<Block> POTTED_SMALL_OAK_SAPLING;
    public static RegistryObject<Block> POTTED_SOCOTRA_SAPLING;
    public static RegistryObject<Block> POTTED_WHITE_MAGNOLIA_SAPLING;
    public static RegistryObject<Block> POTTED_WILLOW_SAPLING;
    //POTTED_MUSHROOMS
    public static RegistryObject<Block> POTTED_BLUE_BIOSHROOM;
    public static RegistryObject<Block> POTTED_GREEN_BIOSHROOM;
    public static RegistryObject<Block> POTTED_PINK_BIOSHROOM;
    public static RegistryObject<Block> POTTED_YELLOW_BIOSHROOM;
    public static RegistryObject<Block> POTTED_TALL_BLUE_BIOSHROOM;
    public static RegistryObject<Block> POTTED_TALL_GREEN_BIOSHROOM;
    public static RegistryObject<Block> POTTED_TALL_PINK_BIOSHROOM;
    public static RegistryObject<Block> POTTED_TALL_YELLOW_BIOSHROOM;
    //OTHER_POTTED_PLANTS
    public static RegistryObject<Block> POTTED_BARREL_CACTUS;
    public static RegistryObject<Block> POTTED_CAVE_HYSSOP;
    //POTTED_SNOWBELLE
    public static RegistryObject<Block> POTTED_RED_SNOWBELLE;
    public static RegistryObject<Block> POTTED_ORANGE_SNOWBELLE;
    public static RegistryObject<Block> POTTED_YELLOW_SNOWBELLE;
    public static RegistryObject<Block> POTTED_LIME_SNOWBELLE;
    public static RegistryObject<Block> POTTED_GREEN_SNOWBELLE;
    public static RegistryObject<Block> POTTED_CYAN_SNOWBELLE;
    public static RegistryObject<Block> POTTED_LIGHT_BLUE_SNOWBELLE;
    public static RegistryObject<Block> POTTED_BLUE_SNOWBELLE;
    public static RegistryObject<Block> POTTED_PURPLE_SNOWBELLE;
    public static RegistryObject<Block> POTTED_MAGENTA_SNOWBELLE;
    public static RegistryObject<Block> POTTED_PINK_SNOWBELLE;
    public static RegistryObject<Block> POTTED_BROWN_SNOWBELLE;
    public static RegistryObject<Block> POTTED_WHITE_SNOWBELLE;
    public static RegistryObject<Block> POTTED_LIGHT_GRAY_SNOWBELLE;
    public static RegistryObject<Block> POTTED_GRAY_SNOWBELLE;
    public static RegistryObject<Block> POTTED_BLACK_SNOWBELLE;

    /*-----------------PLANT_BLOCKS-----------------*/
    //MUSHROOMS
    public static RegistryObject<Block> BLUE_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> GLOWING_BLUE_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> GREEN_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> GLOWING_GREEN_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> PINK_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> GLOWING_PINK_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> GLOWING_YELLOW_BIOSHROOM_BLOCK;
    //BAMBOO
    public static RegistryObject<Block> BAMBOO_LOG;
    public static RegistryObject<Block> STRIPPED_BAMBOO_LOG;
    //OAK_LOG
    public static RegistryObject<Block> SMALL_OAK_LOG;
    public static RegistryObject<Block> STRIPPED_SMALL_OAK_LOG;
    //CACTUS
    public static RegistryObject<Block> SAGUARO_CACTUS;

    /*-----------------LEAVES-----------------*/
    public static RegistryObject<Block> ALPHA_LEAVES;
    public static RegistryObject<Block> APPLE_OAK_LEAVES;
    public static RegistryObject<Block> BAMBOO_LEAVES;
    public static RegistryObject<Block> BAOBAB_LEAVES;
    public static RegistryObject<Block> BLACKWOOD_LEAVES;
    public static RegistryObject<Block> BRIMWOOD_LEAVES;
    public static RegistryObject<Block> COBALT_WEBBING;
    public static RegistryObject<Block> MAGNOLIA_LEAVES;
    public static RegistryObject<Block> CYPRESS_LEAVES;
    public static RegistryObject<Block> DEAD_LEAVES;
    public static RegistryObject<Block> DEAD_PINE_LEAVES;
    public static RegistryObject<Block> EUCALYPTUS_LEAVES;
    public static RegistryObject<Block> FLOWERING_LEAVES;
    public static RegistryObject<Block> GOLDEN_LARCH_LEAVES;
    public static RegistryObject<Block> JOSHUA_LEAVES;
    public static RegistryObject<Block> KAPOK_LEAVES;
    public static RegistryObject<Block> LARCH_LEAVES;
    public static RegistryObject<Block> MAPLE_LEAVES;
    public static RegistryObject<Block> MAUVE_LEAVES;
    public static RegistryObject<Block> ORANGE_MAPLE_LEAVES;
    public static RegistryObject<Block> PALM_LEAVES;
    public static RegistryObject<Block> PINE_LEAVES;
    public static RegistryObject<Block> BLUE_MAGNOLIA_LEAVES;
    public static RegistryObject<Block> PINK_MAGNOLIA_LEAVES;
    public static RegistryObject<Block> REDWOOD_LEAVES;
    public static RegistryObject<Block> RED_MAPLE_LEAVES;
    public static RegistryObject<Block> SMALL_OAK_LEAVES;
    public static RegistryObject<Block> SILVER_BIRCH_LEAVES;
    public static RegistryObject<Block> SOCOTRA_LEAVES;
    public static RegistryObject<Block> ENCHANTED_BIRCH_LEAVES;
    public static RegistryObject<Block> WHITE_MAGNOLIA_LEAVES;
    public static RegistryObject<Block> WILLOW_LEAVES;

    /*-----------------BRANCHES-----------------*/
    public static RegistryObject<Block> ACACIA_BRANCH;
    public static RegistryObject<Block> BAOBAB_BRANCH;
    public static RegistryObject<Block> BIRCH_BRANCH;
    public static RegistryObject<Block> BLACKWOOD_BRANCH;
    public static RegistryObject<Block> MAGNOLIA_BRANCH;
    public static RegistryObject<Block> CYPRESS_BRANCH;
    public static RegistryObject<Block> CHERRY_BRANCH;
    public static RegistryObject<Block> DARK_OAK_BRANCH;
    public static RegistryObject<Block> DEAD_BRANCH;
    public static RegistryObject<Block> EUCALYPTUS_BRANCH;
    public static RegistryObject<Block> JOSHUA_BEARD;
    public static RegistryObject<Block> JUNGLE_BRANCH;
    public static RegistryObject<Block> KAPOK_BRANCH;
    public static RegistryObject<Block> LARCH_BRANCH;
    public static RegistryObject<Block> MANGROVE_BRANCH;
    public static RegistryObject<Block> MAPLE_BRANCH;
    public static RegistryObject<Block> MAUVE_BRANCH;
    public static RegistryObject<Block> OAK_BRANCH;
    public static RegistryObject<Block> PALM_BEARD;
    public static RegistryObject<Block> PINE_BRANCH;
    public static RegistryObject<Block> REDWOOD_BRANCH;
    public static RegistryObject<Block> SILVER_BIRCH_BRANCH;
    public static RegistryObject<Block> SOCOTRA_BRANCH;
    public static RegistryObject<Block> SPRUCE_BRANCH;
    public static RegistryObject<Block> WILLOW_BRANCH;

    /*-----------------DIRT_BLOCKS-----------------*/
    //FOREST_DIRT_BLOCKS
    public static RegistryObject<Block> PEAT_GRASS_BLOCK;
    public static RegistryObject<Block> PEAT_DIRT;
    public static RegistryObject<Block> PEAT_DIRT_PATH;
    public static RegistryObject<Block> PEAT_COARSE_DIRT;
    public static RegistryObject<Block> PEAT_PODZOL;
    public static RegistryObject<Block> PEAT_MUD;
    public static RegistryObject<Block> PEAT_FARMLAND;
    //PLAINS_DIRT_BLOCKS
    public static RegistryObject<Block> SILT_GRASS_BLOCK;
    public static RegistryObject<Block> SILT_DIRT;
    public static RegistryObject<Block> SILT_DIRT_PATH;
    public static RegistryObject<Block> SILT_COARSE_DIRT;
    public static RegistryObject<Block> SILT_PODZOL;
    public static RegistryObject<Block> SILT_MUD;
    public static RegistryObject<Block> SILT_FARMLAND;
    //OTHER_DIRT_BLOCKS
    public static RegistryObject<Block> ALPHA_GRASS_BLOCK;

    /*-----------------STONE_BLOCKS-----------------*/
    //CHALKS
    public static RegistryObject<Block> CHALK;
    public static RegistryObject<Block> CHALK_GRASS_BLOCK;
    public static RegistryObject<Block> CHALK_BRICKS;
    public static RegistryObject<Block> CHALK_BRICK_SLAB;
    public static RegistryObject<Block> CHALK_BRICK_STAIRS;
    public static RegistryObject<Block> CHALK_PILLAR;
    public static RegistryObject<Block> CHALK_SLAB;
    public static RegistryObject<Block> CHALK_STAIRS;
    public static RegistryObject<Block> POLISHED_CHALK;
    public static RegistryObject<Block> POLISHED_CHALK_SLAB;
    public static RegistryObject<Block> POLISHED_CHALK_STAIRS;
    //MOSSY_STONES
    public static RegistryObject<Block> ARGILLITE;
    public static RegistryObject<Block> MOSSY_STONE;

    /*-----------------OCEAN_BLOCKS-----------------*/
    //HYACINTH_BLOCKS
    public static RegistryObject<Block> HYACINTH_LAMP;
    public static RegistryObject<Block> HYACINTH_BLOOM;
    public static RegistryObject<Block> HYACINTH_FLOWERS;
    public static RegistryObject<Block> TALL_HYACINTH_STOCK;
    //ASHEN_BLOCKS
    public static RegistryObject<Block> ASHEN_DIRT;
    public static RegistryObject<Block> ASHEN_SHRUB;
    public static RegistryObject<Block> ASHEN_LEAVES;
    public static RegistryObject<Block> ASHEN_GRASS;

    /*-----------------OTHER_BLOCKS-----------------*/
    public static RegistryObject<Block> ASH;
    public static RegistryObject<Block> VOLCANIC_ASH;
    public static RegistryObject<Block> ASH_VENT;

    /*-----------------WOOD_TYPES-----------------*/
    //ASHEN_BLOCKS
    public static RegistryObject<Block> ASHEN_LOG;
    public static RegistryObject<Block> ASHEN_WOOD;
    //SILVER_BIRCH_BLOCKS
    public static RegistryObject<Block> SILVER_BIRCH_LOG;
    public static RegistryObject<Block> SILVER_BIRCH_WOOD;
    //ALPHA_BLOCKS
    public static RegistryObject<Block> ALPHA_LOG;
    public static RegistryObject<Block> ALPHA_PLANKS;
    public static RegistryObject<Block> ALPHA_STAIRS;
    public static RegistryObject<Block> ALPHA_SLAB;
    //BAOBAB_BLOCKS
    public static RegistryObject<Block> BAOBAB_LOG;
    public static RegistryObject<Block> STRIPPED_BAOBAB_LOG;
    public static RegistryObject<Block> BAOBAB_WOOD;
    public static RegistryObject<Block> STRIPPED_BAOBAB_WOOD;
    public static RegistryObject<Block> BAOBAB_PLANKS;
    public static RegistryObject<Block> BAOBAB_STAIRS;
    public static RegistryObject<Block> BAOBAB_SLAB;
    public static RegistryObject<Block> BAOBAB_FENCE;
    public static RegistryObject<Block> BAOBAB_DOOR;
    public static RegistryObject<Block> BAOBAB_FENCE_GATE;
    public static RegistryObject<Block> BAOBAB_TRAPDOOR;
    public static RegistryObject<Block> BAOBAB_PRESSURE_PLATE;
    public static RegistryObject<Block> BAOBAB_BUTTON;
    public static RegistryObject<Block> BAOBAB_SIGN;
    public static RegistryObject<Block> BAOBAB_WALL_SIGN;
    public static RegistryObject<Block> BAOBAB_HANGING_SIGN;
    public static RegistryObject<Block> BAOBAB_WALL_HANGING_SIGN;
    //BLACKWOOD_BLOCKS
    public static RegistryObject<Block> BLACKWOOD_LOG;
    public static RegistryObject<Block> STRIPPED_BLACKWOOD_LOG;
    public static RegistryObject<Block> BLACKWOOD_WOOD;
    public static RegistryObject<Block> STRIPPED_BLACKWOOD_WOOD;
    public static RegistryObject<Block> BLACKWOOD_PLANKS;
    public static RegistryObject<Block> BLACKWOOD_STAIRS;
    public static RegistryObject<Block> BLACKWOOD_SLAB;
    public static RegistryObject<Block> BLACKWOOD_FENCE;
    public static RegistryObject<Block> BLACKWOOD_DOOR;
    public static RegistryObject<Block> BLACKWOOD_FENCE_GATE;
    public static RegistryObject<Block> BLACKWOOD_TRAPDOOR;
    public static RegistryObject<Block> BLACKWOOD_PRESSURE_PLATE;
    public static RegistryObject<Block> BLACKWOOD_BUTTON;
    public static RegistryObject<Block> BLACKWOOD_SIGN;
    public static RegistryObject<Block> BLACKWOOD_WALL_SIGN;
    public static RegistryObject<Block> BLACKWOOD_HANGING_SIGN;
    public static RegistryObject<Block> BLACKWOOD_WALL_HANGING_SIGN;
    //BLUE_BIOSHROOM_BLOCKS
    public static RegistryObject<Block> BLUE_BIOSHROOM_STEM;
    public static RegistryObject<Block> STRIPPED_BLUE_BIOSHROOM_STEM;
    public static RegistryObject<Block> BLUE_BIOSHROOM_HYPHAE;
    public static RegistryObject<Block> STRIPPED_BLUE_BIOSHROOM_HYPHAE;
    public static RegistryObject<Block> BLUE_BIOSHROOM_PLANKS;
    public static RegistryObject<Block> BLUE_BIOSHROOM_STAIRS;
    public static RegistryObject<Block> BLUE_BIOSHROOM_SLAB;
    public static RegistryObject<Block> BLUE_BIOSHROOM_FENCE;
    public static RegistryObject<Block> BLUE_BIOSHROOM_DOOR;
    public static RegistryObject<Block> BLUE_BIOSHROOM_FENCE_GATE;
    public static RegistryObject<Block> BLUE_BIOSHROOM_TRAPDOOR;
    public static RegistryObject<Block> BLUE_BIOSHROOM_PRESSURE_PLATE;
    public static RegistryObject<Block> BLUE_BIOSHROOM_BUTTON;
    public static RegistryObject<Block> BLUE_BIOSHROOM_SIGN;
    public static RegistryObject<Block> BLUE_BIOSHROOM_WALL_SIGN;
    public static RegistryObject<Block> BLUE_BIOSHROOM_HANGING_SIGN;
    public static RegistryObject<Block> BLUE_BIOSHROOM_WALL_HANGING_SIGN;
    //BRIMWOOD_BLOCKS
    public static RegistryObject<Block> BRIMWOOD_LOG;
    public static RegistryObject<Block> BRIMWOOD_LOG_MAGMA;
    public static RegistryObject<Block> STRIPPED_BRIMWOOD_LOG;
    public static RegistryObject<Block> BRIMWOOD_WOOD;
    public static RegistryObject<Block> STRIPPED_BRIMWOOD_WOOD;
    public static RegistryObject<Block> BRIMWOOD_PLANKS;
    public static RegistryObject<Block> BRIMWOOD_STAIRS;
    public static RegistryObject<Block> BRIMWOOD_SLAB;
    public static RegistryObject<Block> BRIMWOOD_FENCE;
    public static RegistryObject<Block> BRIMWOOD_DOOR;
    public static RegistryObject<Block> BRIMWOOD_FENCE_GATE;
    public static RegistryObject<Block> BRIMWOOD_TRAPDOOR;
    public static RegistryObject<Block> BRIMWOOD_PRESSURE_PLATE;
    public static RegistryObject<Block> BRIMWOOD_BUTTON;
    public static RegistryObject<Block> BRIMWOOD_SIGN;
    public static RegistryObject<Block> BRIMWOOD_WALL_SIGN;
    public static RegistryObject<Block> BRIMWOOD_HANGING_SIGN;
    public static RegistryObject<Block> BRIMWOOD_WALL_HANGING_SIGN;
    //COBALT_BLOCKS
    public static RegistryObject<Block> COBALT_LOG;
    public static RegistryObject<Block> STRIPPED_COBALT_LOG;
    public static RegistryObject<Block> COBALT_WOOD;
    public static RegistryObject<Block> STRIPPED_COBALT_WOOD;
    public static RegistryObject<Block> COBALT_PLANKS;
    public static RegistryObject<Block> COBALT_STAIRS;
    public static RegistryObject<Block> COBALT_SLAB;
    public static RegistryObject<Block> COBALT_FENCE;
    public static RegistryObject<Block> COBALT_DOOR;
    public static RegistryObject<Block> COBALT_FENCE_GATE;
    public static RegistryObject<Block> COBALT_TRAPDOOR;
    public static RegistryObject<Block> COBALT_PRESSURE_PLATE;
    public static RegistryObject<Block> COBALT_BUTTON;
    public static RegistryObject<Block> COBALT_SIGN;
    public static RegistryObject<Block> COBALT_WALL_SIGN;
    public static RegistryObject<Block> COBALT_HANGING_SIGN;
    public static RegistryObject<Block> COBALT_WALL_HANGING_SIGN;
    //CYPRESS_BLOCKS
    public static RegistryObject<Block> CYPRESS_LOG;
    public static RegistryObject<Block> STRIPPED_CYPRESS_LOG;
    public static RegistryObject<Block> CYPRESS_WOOD;
    public static RegistryObject<Block> STRIPPED_CYPRESS_WOOD;
    public static RegistryObject<Block> CYPRESS_PLANKS;
    public static RegistryObject<Block> CYPRESS_STAIRS;
    public static RegistryObject<Block> CYPRESS_SLAB;
    public static RegistryObject<Block> CYPRESS_FENCE;
    public static RegistryObject<Block> CYPRESS_DOOR;
    public static RegistryObject<Block> CYPRESS_FENCE_GATE;
    public static RegistryObject<Block> CYPRESS_TRAPDOOR;
    public static RegistryObject<Block> CYPRESS_PRESSURE_PLATE;
    public static RegistryObject<Block> CYPRESS_BUTTON;
    public static RegistryObject<Block> CYPRESS_SIGN;
    public static RegistryObject<Block> CYPRESS_WALL_SIGN;
    public static RegistryObject<Block> CYPRESS_HANGING_SIGN;
    public static RegistryObject<Block> CYPRESS_WALL_HANGING_SIGN;
    //DEAD_BLOCKS
    public static RegistryObject<Block> DEAD_LOG;
    public static RegistryObject<Block> STRIPPED_DEAD_LOG;
    public static RegistryObject<Block> DEAD_WOOD;
    public static RegistryObject<Block> STRIPPED_DEAD_WOOD;
    public static RegistryObject<Block> DEAD_PLANKS;
    public static RegistryObject<Block> DEAD_STAIRS;
    public static RegistryObject<Block> DEAD_SLAB;
    public static RegistryObject<Block> DEAD_FENCE;
    public static RegistryObject<Block> DEAD_DOOR;
    public static RegistryObject<Block> DEAD_FENCE_GATE;
    public static RegistryObject<Block> DEAD_TRAPDOOR;
    public static RegistryObject<Block> DEAD_PRESSURE_PLATE;
    public static RegistryObject<Block> DEAD_BUTTON;
    public static RegistryObject<Block> DEAD_SIGN;
    public static RegistryObject<Block> DEAD_WALL_SIGN;
    public static RegistryObject<Block> DEAD_HANGING_SIGN;
    public static RegistryObject<Block> DEAD_WALL_HANGING_SIGN;
    //EUCALYPTUS_BLOCKS
    public static RegistryObject<Block> EUCALYPTUS_LOG;
    public static RegistryObject<Block> STRIPPED_EUCALYPTUS_LOG;
    public static RegistryObject<Block> EUCALYPTUS_WOOD;
    public static RegistryObject<Block> STRIPPED_EUCALYPTUS_WOOD;
    public static RegistryObject<Block> EUCALYPTUS_PLANKS;
    public static RegistryObject<Block> EUCALYPTUS_STAIRS;
    public static RegistryObject<Block> EUCALYPTUS_SLAB;
    public static RegistryObject<Block> EUCALYPTUS_FENCE;
    public static RegistryObject<Block> EUCALYPTUS_DOOR;
    public static RegistryObject<Block> EUCALYPTUS_FENCE_GATE;
    public static RegistryObject<Block> EUCALYPTUS_TRAPDOOR;
    public static RegistryObject<Block> EUCALYPTUS_PRESSURE_PLATE;
    public static RegistryObject<Block> EUCALYPTUS_BUTTON;
    public static RegistryObject<Block> EUCALYPTUS_SIGN;
    public static RegistryObject<Block> EUCALYPTUS_WALL_SIGN;
    public static RegistryObject<Block> EUCALYPTUS_HANGING_SIGN;
    public static RegistryObject<Block> EUCALYPTUS_WALL_HANGING_SIGN;
    //GREEN_BIOSHROOM_BLOCKS
    public static RegistryObject<Block> GREEN_BIOSHROOM_STEM;
    public static RegistryObject<Block> STRIPPED_GREEN_BIOSHROOM_STEM;
    public static RegistryObject<Block> GREEN_BIOSHROOM_HYPHAE;
    public static RegistryObject<Block> STRIPPED_GREEN_BIOSHROOM_HYPHAE;
    public static RegistryObject<Block> GREEN_BIOSHROOM_PLANKS;
    public static RegistryObject<Block> GREEN_BIOSHROOM_STAIRS;
    public static RegistryObject<Block> GREEN_BIOSHROOM_SLAB;
    public static RegistryObject<Block> GREEN_BIOSHROOM_FENCE;
    public static RegistryObject<Block> GREEN_BIOSHROOM_DOOR;
    public static RegistryObject<Block> GREEN_BIOSHROOM_FENCE_GATE;
    public static RegistryObject<Block> GREEN_BIOSHROOM_TRAPDOOR;
    public static RegistryObject<Block> GREEN_BIOSHROOM_PRESSURE_PLATE;
    public static RegistryObject<Block> GREEN_BIOSHROOM_BUTTON;
    public static RegistryObject<Block> GREEN_BIOSHROOM_SIGN;
    public static RegistryObject<Block> GREEN_BIOSHROOM_WALL_SIGN;
    public static RegistryObject<Block> GREEN_BIOSHROOM_HANGING_SIGN;
    public static RegistryObject<Block> GREEN_BIOSHROOM_WALL_HANGING_SIGN;
    //JOSHUA_BLOCKS
    public static RegistryObject<Block> JOSHUA_LOG;
    public static RegistryObject<Block> STRIPPED_JOSHUA_LOG;
    public static RegistryObject<Block> JOSHUA_WOOD;
    public static RegistryObject<Block> STRIPPED_JOSHUA_WOOD;
    public static RegistryObject<Block> JOSHUA_PLANKS;
    public static RegistryObject<Block> JOSHUA_STAIRS;
    public static RegistryObject<Block> JOSHUA_SLAB;
    public static RegistryObject<Block> JOSHUA_FENCE;
    public static RegistryObject<Block> JOSHUA_DOOR;
    public static RegistryObject<Block> JOSHUA_FENCE_GATE;
    public static RegistryObject<Block> JOSHUA_TRAPDOOR;
    public static RegistryObject<Block> JOSHUA_PRESSURE_PLATE;
    public static RegistryObject<Block> JOSHUA_BUTTON;
    public static RegistryObject<Block> JOSHUA_SIGN;
    public static RegistryObject<Block> JOSHUA_WALL_SIGN;
    public static RegistryObject<Block> JOSHUA_HANGING_SIGN;
    public static RegistryObject<Block> JOSHUA_WALL_HANGING_SIGN;
    //KAPOK_BLOCKS
    public static RegistryObject<Block> KAPOK_LOG;
    public static RegistryObject<Block> STRIPPED_KAPOK_LOG;
    public static RegistryObject<Block> KAPOK_WOOD;
    public static RegistryObject<Block> STRIPPED_KAPOK_WOOD;
    public static RegistryObject<Block> KAPOK_PLANKS;
    public static RegistryObject<Block> KAPOK_STAIRS;
    public static RegistryObject<Block> KAPOK_SLAB;
    public static RegistryObject<Block> KAPOK_FENCE;
    public static RegistryObject<Block> KAPOK_DOOR;
    public static RegistryObject<Block> KAPOK_FENCE_GATE;
    public static RegistryObject<Block> KAPOK_TRAPDOOR;
    public static RegistryObject<Block> KAPOK_PRESSURE_PLATE;
    public static RegistryObject<Block> KAPOK_BUTTON;
    public static RegistryObject<Block> KAPOK_SIGN;
    public static RegistryObject<Block> KAPOK_WALL_SIGN;
    public static RegistryObject<Block> KAPOK_HANGING_SIGN;
    public static RegistryObject<Block> KAPOK_WALL_HANGING_SIGN;
    //LARCH_BLOCKS
    public static RegistryObject<Block> LARCH_LOG;
    public static RegistryObject<Block> STRIPPED_LARCH_LOG;
    public static RegistryObject<Block> LARCH_WOOD;
    public static RegistryObject<Block> STRIPPED_LARCH_WOOD;
    public static RegistryObject<Block> LARCH_PLANKS;
    public static RegistryObject<Block> LARCH_STAIRS;
    public static RegistryObject<Block> LARCH_SLAB;
    public static RegistryObject<Block> LARCH_FENCE;
    public static RegistryObject<Block> LARCH_DOOR;
    public static RegistryObject<Block> LARCH_FENCE_GATE;
    public static RegistryObject<Block> LARCH_TRAPDOOR;
    public static RegistryObject<Block> LARCH_PRESSURE_PLATE;
    public static RegistryObject<Block> LARCH_BUTTON;
    public static RegistryObject<Block> LARCH_SIGN;
    public static RegistryObject<Block> LARCH_WALL_SIGN;
    public static RegistryObject<Block> LARCH_HANGING_SIGN;
    public static RegistryObject<Block> LARCH_WALL_HANGING_SIGN;
    //MAGNOLIA_BLOCKS
    public static RegistryObject<Block> MAGNOLIA_LOG;
    public static RegistryObject<Block> STRIPPED_MAGNOLIA_LOG;
    public static RegistryObject<Block> MAGNOLIA_WOOD;
    public static RegistryObject<Block> STRIPPED_MAGNOLIA_WOOD;
    public static RegistryObject<Block> MAGNOLIA_PLANKS;
    public static RegistryObject<Block> MAGNOLIA_STAIRS;
    public static RegistryObject<Block> MAGNOLIA_SLAB;
    public static RegistryObject<Block> MAGNOLIA_FENCE;
    public static RegistryObject<Block> MAGNOLIA_DOOR;
    public static RegistryObject<Block> MAGNOLIA_FENCE_GATE;
    public static RegistryObject<Block> MAGNOLIA_TRAPDOOR;
    public static RegistryObject<Block> MAGNOLIA_PRESSURE_PLATE;
    public static RegistryObject<Block> MAGNOLIA_BUTTON;
    public static RegistryObject<Block> MAGNOLIA_SIGN;
    public static RegistryObject<Block> MAGNOLIA_WALL_SIGN;
    public static RegistryObject<Block> MAGNOLIA_HANGING_SIGN;
    public static RegistryObject<Block> MAGNOLIA_WALL_HANGING_SIGN;
    //MAPLE_BLOCKS
    public static RegistryObject<Block> MAPLE_LOG;
    public static RegistryObject<Block> STRIPPED_MAPLE_LOG;
    public static RegistryObject<Block> MAPLE_WOOD;
    public static RegistryObject<Block> STRIPPED_MAPLE_WOOD;
    public static RegistryObject<Block> MAPLE_PLANKS;
    public static RegistryObject<Block> MAPLE_STAIRS;
    public static RegistryObject<Block> MAPLE_SLAB;
    public static RegistryObject<Block> MAPLE_FENCE;
    public static RegistryObject<Block> MAPLE_DOOR;
    public static RegistryObject<Block> MAPLE_FENCE_GATE;
    public static RegistryObject<Block> MAPLE_TRAPDOOR;
    public static RegistryObject<Block> MAPLE_PRESSURE_PLATE;
    public static RegistryObject<Block> MAPLE_BUTTON;
    public static RegistryObject<Block> MAPLE_SIGN;
    public static RegistryObject<Block> MAPLE_WALL_SIGN;
    public static RegistryObject<Block> MAPLE_HANGING_SIGN;
    public static RegistryObject<Block> MAPLE_WALL_HANGING_SIGN;
    //MAUVE_BLOCKS
    public static RegistryObject<Block> MAUVE_LOG;
    public static RegistryObject<Block> STRIPPED_MAUVE_LOG;
    public static RegistryObject<Block> MAUVE_WOOD;
    public static RegistryObject<Block> STRIPPED_MAUVE_WOOD;
    public static RegistryObject<Block> MAUVE_PLANKS;
    public static RegistryObject<Block> MAUVE_STAIRS;
    public static RegistryObject<Block> MAUVE_SLAB;
    public static RegistryObject<Block> MAUVE_FENCE;
    public static RegistryObject<Block> MAUVE_DOOR;
    public static RegistryObject<Block> MAUVE_FENCE_GATE;
    public static RegistryObject<Block> MAUVE_TRAPDOOR;
    public static RegistryObject<Block> MAUVE_PRESSURE_PLATE;
    public static RegistryObject<Block> MAUVE_BUTTON;
    public static RegistryObject<Block> MAUVE_SIGN;
    public static RegistryObject<Block> MAUVE_WALL_SIGN;
    public static RegistryObject<Block> MAUVE_HANGING_SIGN;
    public static RegistryObject<Block> MAUVE_WALL_HANGING_SIGN;
    //PALM_BLOCKS
    public static RegistryObject<Block> PALM_LOG;
    public static RegistryObject<Block> STRIPPED_PALM_LOG;
    public static RegistryObject<Block> PALM_WOOD;
    public static RegistryObject<Block> STRIPPED_PALM_WOOD;
    public static RegistryObject<Block> PALM_PLANKS;
    public static RegistryObject<Block> PALM_STAIRS;
    public static RegistryObject<Block> PALM_SLAB;
    public static RegistryObject<Block> PALM_FENCE;
    public static RegistryObject<Block> PALM_DOOR;
    public static RegistryObject<Block> PALM_FENCE_GATE;
    public static RegistryObject<Block> PALM_TRAPDOOR;
    public static RegistryObject<Block> PALM_PRESSURE_PLATE;
    public static RegistryObject<Block> PALM_BUTTON;
    public static RegistryObject<Block> PALM_SIGN;
    public static RegistryObject<Block> PALM_WALL_SIGN;
    public static RegistryObject<Block> PALM_HANGING_SIGN;
    public static RegistryObject<Block> PALM_WALL_HANGING_SIGN;
    //PINE_BLOCKS
    public static RegistryObject<Block> PINE_LOG;
    public static RegistryObject<Block> STRIPPED_PINE_LOG;
    public static RegistryObject<Block> PINE_WOOD;
    public static RegistryObject<Block> STRIPPED_PINE_WOOD;
    public static RegistryObject<Block> PINE_PLANKS;
    public static RegistryObject<Block> PINE_STAIRS;
    public static RegistryObject<Block> PINE_SLAB;
    public static RegistryObject<Block> PINE_FENCE;
    public static RegistryObject<Block> PINE_DOOR;
    public static RegistryObject<Block> PINE_FENCE_GATE;
    public static RegistryObject<Block> PINE_TRAPDOOR;
    public static RegistryObject<Block> PINE_PRESSURE_PLATE;
    public static RegistryObject<Block> PINE_BUTTON;
    public static RegistryObject<Block> PINE_SIGN;
    public static RegistryObject<Block> PINE_WALL_SIGN;
    public static RegistryObject<Block> PINE_HANGING_SIGN;
    public static RegistryObject<Block> PINE_WALL_HANGING_SIGN;
    //PINK_BIOSHROOM_BLOCKS
    public static RegistryObject<Block> PINK_BIOSHROOM_STEM;
    public static RegistryObject<Block> STRIPPED_PINK_BIOSHROOM_STEM;
    public static RegistryObject<Block> PINK_BIOSHROOM_HYPHAE;
    public static RegistryObject<Block> STRIPPED_PINK_BIOSHROOM_HYPHAE;
    public static RegistryObject<Block> PINK_BIOSHROOM_PLANKS;
    public static RegistryObject<Block> PINK_BIOSHROOM_STAIRS;
    public static RegistryObject<Block> PINK_BIOSHROOM_SLAB;
    public static RegistryObject<Block> PINK_BIOSHROOM_FENCE;
    public static RegistryObject<Block> PINK_BIOSHROOM_DOOR;
    public static RegistryObject<Block> PINK_BIOSHROOM_FENCE_GATE;
    public static RegistryObject<Block> PINK_BIOSHROOM_TRAPDOOR;
    public static RegistryObject<Block> PINK_BIOSHROOM_PRESSURE_PLATE;
    public static RegistryObject<Block> PINK_BIOSHROOM_BUTTON;
    public static RegistryObject<Block> PINK_BIOSHROOM_SIGN;
    public static RegistryObject<Block> PINK_BIOSHROOM_WALL_SIGN;
    public static RegistryObject<Block> PINK_BIOSHROOM_HANGING_SIGN;
    public static RegistryObject<Block> PINK_BIOSHROOM_WALL_HANGING_SIGN;
    //REDWOOD_BLOCKS
    public static RegistryObject<Block> REDWOOD_LOG;
    public static RegistryObject<Block> STRIPPED_REDWOOD_LOG;
    public static RegistryObject<Block> REDWOOD_WOOD;
    public static RegistryObject<Block> STRIPPED_REDWOOD_WOOD;
    public static RegistryObject<Block> REDWOOD_PLANKS;
    public static RegistryObject<Block> REDWOOD_STAIRS;
    public static RegistryObject<Block> REDWOOD_SLAB;
    public static RegistryObject<Block> REDWOOD_FENCE;
    public static RegistryObject<Block> REDWOOD_DOOR;
    public static RegistryObject<Block> REDWOOD_FENCE_GATE;
    public static RegistryObject<Block> REDWOOD_TRAPDOOR;
    public static RegistryObject<Block> REDWOOD_PRESSURE_PLATE;
    public static RegistryObject<Block> REDWOOD_BUTTON;
    public static RegistryObject<Block> REDWOOD_SIGN;
    public static RegistryObject<Block> REDWOOD_WALL_SIGN;
    public static RegistryObject<Block> REDWOOD_HANGING_SIGN;
    public static RegistryObject<Block> REDWOOD_WALL_HANGING_SIGN;
    //SOCOTRA_BLOCKS
    public static RegistryObject<Block> SOCOTRA_LOG;
    public static RegistryObject<Block> STRIPPED_SOCOTRA_LOG;
    public static RegistryObject<Block> SOCOTRA_WOOD;
    public static RegistryObject<Block> STRIPPED_SOCOTRA_WOOD;
    public static RegistryObject<Block> SOCOTRA_PLANKS;
    public static RegistryObject<Block> SOCOTRA_STAIRS;
    public static RegistryObject<Block> SOCOTRA_SLAB;
    public static RegistryObject<Block> SOCOTRA_FENCE;
    public static RegistryObject<Block> SOCOTRA_DOOR;
    public static RegistryObject<Block> SOCOTRA_FENCE_GATE;
    public static RegistryObject<Block> SOCOTRA_TRAPDOOR;
    public static RegistryObject<Block> SOCOTRA_PRESSURE_PLATE;
    public static RegistryObject<Block> SOCOTRA_BUTTON;
    public static RegistryObject<Block> SOCOTRA_SIGN;
    public static RegistryObject<Block> SOCOTRA_WALL_SIGN;
    public static RegistryObject<Block> SOCOTRA_HANGING_SIGN;
    public static RegistryObject<Block> SOCOTRA_WALL_HANGING_SIGN;
    //WILLOW_BLOCKS
    public static RegistryObject<Block> WILLOW_LOG;
    public static RegistryObject<Block> STRIPPED_WILLOW_LOG;
    public static RegistryObject<Block> WILLOW_WOOD;
    public static RegistryObject<Block> STRIPPED_WILLOW_WOOD;
    public static RegistryObject<Block> WILLOW_PLANKS;
    public static RegistryObject<Block> WILLOW_STAIRS;
    public static RegistryObject<Block> WILLOW_SLAB;
    public static RegistryObject<Block> WILLOW_FENCE;
    public static RegistryObject<Block> WILLOW_DOOR;
    public static RegistryObject<Block> WILLOW_FENCE_GATE;
    public static RegistryObject<Block> WILLOW_TRAPDOOR;
    public static RegistryObject<Block> WILLOW_PRESSURE_PLATE;
    public static RegistryObject<Block> WILLOW_BUTTON;
    public static RegistryObject<Block> WILLOW_SIGN;
    public static RegistryObject<Block> WILLOW_WALL_SIGN;
    public static RegistryObject<Block> WILLOW_HANGING_SIGN;
    public static RegistryObject<Block> WILLOW_WALL_HANGING_SIGN;
    //YELLOW_BIOSHROOM_BLOCKS
    public static RegistryObject<Block> YELLOW_BIOSHROOM_STEM;
    public static RegistryObject<Block> STRIPPED_YELLOW_BIOSHROOM_STEM;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_HYPHAE;
    public static RegistryObject<Block> STRIPPED_YELLOW_BIOSHROOM_HYPHAE;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_PLANKS;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_STAIRS;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_SLAB;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_FENCE;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_DOOR;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_FENCE_GATE;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_TRAPDOOR;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_PRESSURE_PLATE;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_BUTTON;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_SIGN;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_WALL_SIGN;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_HANGING_SIGN;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_WALL_HANGING_SIGN;

    /*-----------------PAINTED PLANKS-----------------*/
    //PLANKS
    public static RegistryObject<Block> RED_PAINTED_PLANKS;
    public static RegistryObject<Block> ORANGE_PAINTED_PLANKS;
    public static RegistryObject<Block> YELLOW_PAINTED_PLANKS;
    public static RegistryObject<Block> LIME_PAINTED_PLANKS;
    public static RegistryObject<Block> GREEN_PAINTED_PLANKS;
    public static RegistryObject<Block> CYAN_PAINTED_PLANKS;
    public static RegistryObject<Block> LIGHT_BLUE_PAINTED_PLANKS;
    public static RegistryObject<Block> BLUE_PAINTED_PLANKS;
    public static RegistryObject<Block> PURPLE_PAINTED_PLANKS;
    public static RegistryObject<Block> MAGENTA_PAINTED_PLANKS;
    public static RegistryObject<Block> PINK_PAINTED_PLANKS;
    public static RegistryObject<Block> BROWN_PAINTED_PLANKS;
    public static RegistryObject<Block> WHITE_PAINTED_PLANKS;
    public static RegistryObject<Block> LIGHT_GRAY_PAINTED_PLANKS;
    public static RegistryObject<Block> GRAY_PAINTED_PLANKS;
    public static RegistryObject<Block> BLACK_PAINTED_PLANKS;
    //STAIRS
    public static RegistryObject<Block> RED_PAINTED_STAIRS;
    public static RegistryObject<Block> ORANGE_PAINTED_STAIRS;
    public static RegistryObject<Block> YELLOW_PAINTED_STAIRS;
    public static RegistryObject<Block> LIME_PAINTED_STAIRS;
    public static RegistryObject<Block> GREEN_PAINTED_STAIRS;
    public static RegistryObject<Block> CYAN_PAINTED_STAIRS;
    public static RegistryObject<Block> LIGHT_BLUE_PAINTED_STAIRS;
    public static RegistryObject<Block> BLUE_PAINTED_STAIRS;
    public static RegistryObject<Block> PURPLE_PAINTED_STAIRS;
    public static RegistryObject<Block> MAGENTA_PAINTED_STAIRS;
    public static RegistryObject<Block> PINK_PAINTED_STAIRS;
    public static RegistryObject<Block> BROWN_PAINTED_STAIRS;
    public static RegistryObject<Block> WHITE_PAINTED_STAIRS;
    public static RegistryObject<Block> LIGHT_GRAY_PAINTED_STAIRS;
    public static RegistryObject<Block> GRAY_PAINTED_STAIRS;
    public static RegistryObject<Block> BLACK_PAINTED_STAIRS;
    //SLABS
    public static RegistryObject<Block> RED_PAINTED_SLAB;
    public static RegistryObject<Block> ORANGE_PAINTED_SLAB;
    public static RegistryObject<Block> YELLOW_PAINTED_SLAB;
    public static RegistryObject<Block> LIME_PAINTED_SLAB;
    public static RegistryObject<Block> GREEN_PAINTED_SLAB;
    public static RegistryObject<Block> CYAN_PAINTED_SLAB;
    public static RegistryObject<Block> LIGHT_BLUE_PAINTED_SLAB;
    public static RegistryObject<Block> BLUE_PAINTED_SLAB;
    public static RegistryObject<Block> PURPLE_PAINTED_SLAB;
    public static RegistryObject<Block> MAGENTA_PAINTED_SLAB;
    public static RegistryObject<Block> PINK_PAINTED_SLAB;
    public static RegistryObject<Block> BROWN_PAINTED_SLAB;
    public static RegistryObject<Block> WHITE_PAINTED_SLAB;
    public static RegistryObject<Block> LIGHT_GRAY_PAINTED_SLAB;
    public static RegistryObject<Block> GRAY_PAINTED_SLAB;
    public static RegistryObject<Block> BLACK_PAINTED_SLAB;

    /*-----------------NETHER_BLOCKS-----------------*/
    //NETHER_STONES
    public static RegistryObject<Block> BLACKSTONE_CLUSTER;
    public static RegistryObject<Block> OVERGROWN_BONE_BLOCK;
    //BRIMSPROUT_BLOCKS
    public static RegistryObject<Block> BRIMSPROUT_NYLIUM;
    public static RegistryObject<Block> BRIMSPROUT;
    //COBALT_BLOCKS
    public static RegistryObject<Block> COBALT_EARLIGHT;
    public static RegistryObject<Block> TALL_COBALT_EARLIGHT;
    public static RegistryObject<Block> COBALT_NYLIUM;
    public static RegistryObject<Block> COBALT_OBSIDIAN;
    public static RegistryObject<Block> COBALT_ROOTS;
    public static RegistryObject<Block> HANGING_EARLIGHT;
    public static RegistryObject<Block> HANGING_EARLIGHT_PLANT;
    //GLISTERING_BLOCKS
    public static RegistryObject<Block> GLISTERING_IVY;
    public static RegistryObject<Block> GLISTERING_IVY_PLANT;
    public static RegistryObject<Block> GLISTERING_NYLIUM;
    public static RegistryObject<Block> GLISTERING_SPROUT;
    public static RegistryObject<Block> GLISTERING_FERN;
    public static RegistryObject<Block> GLISTERING_BLOOM;
    public static RegistryObject<Block> GLISTERING_WART;
    public static RegistryObject<Block> GLISTER_BULB;
    public static RegistryObject<Block> GLISTER_SPIRE;
    //MYCOTOXIC_BLOCKS
    public static RegistryObject<Block> MYCOTOXIC_MUSHROOMS;
    public static RegistryObject<Block> MYCOTOXIC_DAISY;
    public static RegistryObject<Block> MYCOTOXIC_GRASS;
    public static RegistryObject<Block> MYCOTOXIC_NYLIUM;

    public static void addBlocks() {
        //0.6.0
        FLOURAMINE = BlockRegistry.registerDefaultBlock("flouramine", () -> new FlouramineBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollission().strength(0.5f, 0f).randomTicks().sound(SoundType.WET_GRASS).pushReaction(PushReaction.DESTROY).lightLevel((state) -> {return FlouramineBlock.isActive(state) ? 12 : 0;})));
        FLOURAMINE_PLANT = RegionsUnexploredMod.BLOCK_REGISTRY.register("flouramine_plant", () -> new FlouraminePlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollission().strength(0.5f, 0f).sound(SoundType.WET_GRASS).pushReaction(PushReaction.DESTROY)));
        /*-----------------CAVE_BLOCKS-----------------*/
        //PRISMA_BLOCKS
        PRISMOSS = BlockRegistry.registerDefaultBlock("prismoss", () -> new PrismossBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.STONE).randomTicks().strength(1.5f, 6f).requiresCorrectToolForDrops()));
        DEEPSLATE_PRISMOSS = BlockRegistry.registerDefaultBlock("deepslate_prismoss", () -> new PrismossBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.DEEPSLATE).randomTicks().strength(3f, 6f).requiresCorrectToolForDrops()));
        HANGING_PRISMARITE = BlockRegistry.registerDefaultBlock("hanging_prismarite", () -> new HangingPrismariteBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).sound(SoundType.AMETHYST).dynamicShape().offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        LARGE_PRISMARITE_CLUSTER = BlockRegistry.registerDefaultBlock("large_prismarite_cluster", () -> new PrismariteDoubleBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().sound(SoundType.AMETHYST).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        PRISMAGLASS = BlockRegistry.registerDefaultBlock("prismaglass", () -> new TransparentBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(BlockRegistry::never).isRedstoneConductor(BlockRegistry::never).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never)));
        PRISMARITE_CLUSTER = BlockRegistry.registerDefaultBlock("prismarite_cluster", () -> new PrismariteBlock(BlockBehaviour.Properties.of().noCollission().noOcclusion().instabreak().sound(SoundType.AMETHYST_CLUSTER).pushReaction(PushReaction.DESTROY).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        PRISMOSS_SPROUT = BlockRegistry.registerDefaultBlock("prismoss_sprout", () -> new PrismossSproutBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        //REDSTONE_BLOCKS
        POINTED_REDSTONE = BlockRegistry.registerDefaultBlock("pointed_redstone", () -> new PointedRedstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noOcclusion().sound(SoundType.POINTED_DRIPSTONE).randomTicks().strength(1.5F, 3.0F).dynamicShape().offsetType(BlockBehaviour.OffsetType.XZ).lightLevel(s -> 1).isRedstoneConductor(BlockRegistry::always)));
        RAW_REDSTONE_BLOCK = BlockRegistry.registerDefaultBlock("raw_redstone_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).strength(1.5f).requiresCorrectToolForDrops().isRedstoneConductor(BlockRegistry::always)));
        REDSTONE_BUD = BlockRegistry.registerDefaultBlock("redstone_bud", () -> new RedstoneBudBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).replaceable().mapColor(MapColor.COLOR_RED).noCollission().sound(SoundType.TUFF).offsetType(BlockBehaviour.OffsetType.XZ)));
        REDSTONE_BULB = BlockRegistry.registerDefaultBlock("redstone_bulb", () -> new RedstoneBulbBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().sound(SoundType.AMETHYST).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 12).isRedstoneConductor(BlockRegistry::never)));
        //OTHER_CAVE_BLOCKS
        ARGILLITE_GRASS_BLOCK = BlockRegistry.registerDefaultBlock("argillite_grass_block", () -> new ArgilliteGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).sound(SoundType.STONE).randomTicks().strength(1.5f, 6f).requiresCorrectToolForDrops()));
        STONE_GRASS_BLOCK = BlockRegistry.registerDefaultBlock("stone_grass_block", () -> new StoneGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).sound(SoundType.STONE).randomTicks().strength(1.5f, 6f).requiresCorrectToolForDrops()));
        DEEPSLATE_GRASS_BLOCK = BlockRegistry.registerDefaultBlock("deepslate_grass_block", () -> new DeepslateGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).sound(SoundType.DEEPSLATE).randomTicks().strength(3f, 6f).requiresCorrectToolForDrops()));
        VIRIDESCENT_NYLIUM = BlockRegistry.registerDefaultBlock("viridescent_nylium", () -> new ViridescentNyliumBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).sound(SoundType.NYLIUM).strength(1.5f, 6f).requiresCorrectToolForDrops()));
        DEEPSLATE_VIRIDESCENT_NYLIUM = BlockRegistry.registerDefaultBlock("deepslate_viridescent_nylium", () -> new ViridescentNyliumBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).sound(SoundType.NYLIUM).strength(3f, 6f).requiresCorrectToolForDrops()));

        CORPSE_FLOWER = BlockRegistry.registerDefaultBlock("corpse_flower", () -> new CorpseFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER).sound(SoundType.FLOWERING_AZALEA)));
        BLADED_GRASS = BlockRegistry.registerDefaultBlock("bladed_grass", () -> new RuPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS).sound(SoundType.AZALEA)));
        BLADED_TALL_GRASS = BlockRegistry.registerDefaultBlock("bladed_tall_grass", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).sound(SoundType.AZALEA)));
        DROPLEAF = BlockRegistry.registerDefaultBlock("dropleaf", () -> new DropleafBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).randomTicks().noCollission().instabreak().sound(SoundType.WEEPING_VINES).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 14)));
        DROPLEAF_PLANT = RegionsUnexploredMod.BLOCK_REGISTRY.register("dropleaf_plant", () -> new DropleafPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).noCollission().instabreak().sound(SoundType.WEEPING_VINES).offsetType(BlockBehaviour.OffsetType.XZ)));
        DUSKMELON = RegionsUnexploredMod.BLOCK_REGISTRY.register("duskmelon", () -> new DuskmelonBlock(BlockBehaviour.Properties.of().noCollission().instabreak().sound(SoundType.AZALEA)));
        DUSKTRAP = BlockRegistry.registerDefaultBlock("dusktrap", () -> new DuskTrapBlock(DuskTrapBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).noCollission().instabreak().sound(SoundType.TWISTING_VINES)));
        /*-----------------PLANTS-----------------*/
        //GRASS_BLOCKS
        DEAD_STEPPE_SHRUB = BlockRegistry.registerDefaultBlock("dead_steppe_shrub", () -> new DeadShrubBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).ignitedByLava().replaceable().mapColor(MapColor.WOOD).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        FROZEN_GRASS = BlockRegistry.registerDefaultBlock("frozen_grass", () -> new RuSnowyPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS)));
        MEDIUM_GRASS = BlockRegistry.registerDefaultBlock("medium_grass", () -> new RuPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS)));
        SANDY_GRASS = BlockRegistry.registerDefaultBlock("sandy_grass", () -> new RuSandyPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS)));
        SMALL_DESERT_SHRUB = BlockRegistry.registerDefaultBlock("small_desert_shrub", () -> new DeadShrubBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_BUSH)));
        STEPPE_GRASS = BlockRegistry.registerDefaultBlock("steppe_grass", () -> new RuPlantBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).ignitedByLava().replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        STEPPE_SHRUB = BlockRegistry.registerDefaultBlock("steppe_shrub", () -> new RuPlantBlock(BlockBehaviour.Properties.ofFullCopy(STEPPE_GRASS.get())));
        STONE_BUD = BlockRegistry.registerDefaultBlock("stone_bud", () -> new RuStonePlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS)));
        //TALL_GRASS_BLOCKS
        ELEPHANT_EAR = BlockRegistry.registerDefaultBlock("elephant_ear", () -> new ElephantEarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));
        SANDY_TALL_GRASS = BlockRegistry.registerDefaultBlock("sandy_tall_grass", () -> new RuSandyDoublePlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));
        STEPPE_TALL_GRASS = BlockRegistry.registerDefaultBlock("steppe_tall_grass", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));
        WINDSWEPT_GRASS = BlockRegistry.registerDefaultBlock("windswept_grass", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));
        //FLOWERS
        ALPHA_DANDELION = BlockRegistry.registerDefaultBlock("alpha_dandelion", () -> new RuFlowerBlock(MobEffects.JUMP, 5, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        ALPHA_ROSE = BlockRegistry.registerDefaultBlock("alpha_rose", () -> new RuFlowerBlock(MobEffects.JUMP, 5, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        ASTER = BlockRegistry.registerDefaultBlock("aster", () -> new RuFlowerBlock(MobEffects.CONFUSION, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 13)));
        BLEEDING_HEART = BlockRegistry.registerDefaultBlock("bleeding_heart", () -> new RuSnowFlowerBlock(MobEffects.POISON, 9, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        BLUE_LUPINE = BlockRegistry.registerDefaultBlock("blue_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        DAISY = BlockRegistry.registerDefaultBlock("daisy", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SPEED, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        DORCEL = BlockRegistry.registerDefaultBlock("dorcel", () -> new DorcelPlantBlock(MobEffects.WITHER, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION).speedFactor(0.5F)));
        FELICIA_DAISY = BlockRegistry.registerDefaultBlock("felicia_daisy", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SPEED, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        FIREWEED = BlockRegistry.registerDefaultBlock("fireweed", () -> new RuFlowerBlock(MobEffects.GLOWING, 2, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        HIBISCUS = BlockRegistry.registerDefaultBlock("hibiscus", () -> new RuFlowerBlock(MobEffects.JUMP, 6, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        HYSSOP = BlockRegistry.registerDefaultBlock("hyssop", () -> new RuFlowerBlock(MobEffects.LUCK, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        MALLOW = BlockRegistry.registerDefaultBlock("mallow", () -> new RuFlowerBlock(MobEffects.DIG_SLOWDOWN, 4, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        PINK_LUPINE = BlockRegistry.registerDefaultBlock("pink_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        POPPY_BUSH = BlockRegistry.registerDefaultBlock("poppy_bush", () -> new RuFlowerBlock(MobEffects.WEAKNESS, 3, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
        SALMON_POPPY_BUSH = BlockRegistry.registerDefaultBlock("salmon_poppy_bush", () -> new RuFlowerBlock(MobEffects.WEAKNESS, 3, BlockBehaviour.Properties.ofFullCopy(POPPY_BUSH.get())));
        PURPLE_LUPINE = BlockRegistry.registerDefaultBlock("purple_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        RED_LUPINE = BlockRegistry.registerDefaultBlock("red_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        WARATAH = BlockRegistry.registerDefaultBlock("waratah", () -> new RuFlowerBlock(MobEffects.JUMP, 5, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        TSUBAKI = BlockRegistry.registerDefaultBlock("tsubaki", () -> new RuFlowerBlock(MobEffects.HEAL, 3, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        WHITE_TRILLIUM = BlockRegistry.registerDefaultBlock("white_trillium", () -> new RuFlowerBlock(MobEffects.DIG_SPEED, 7, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        WILTING_TRILLIUM = BlockRegistry.registerDefaultBlock("wilting_trillium", () -> new RuFlowerBlock(MobEffects.DIG_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        YELLOW_LUPINE = BlockRegistry.registerDefaultBlock("yellow_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));

        ORANGE_CONEFLOWER = BlockRegistry.registerDefaultBlock("orange_coneflower", () -> new GroundCoverBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).ignitedByLava().noCollission().sound(SoundType.PINK_PETALS)));
        PURPLE_CONEFLOWER = BlockRegistry.registerDefaultBlock("purple_coneflower", () -> new GroundCoverBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).ignitedByLava().noCollission().sound(SoundType.PINK_PETALS)));
        CLOVER = BlockRegistry.registerDefaultBlock("clover", () -> new GroundCoverBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).replaceable().ignitedByLava().noCollission().sound(SoundType.PINK_PETALS)));

        BLUE_MAGNOLIA_FLOWERS = BlockRegistry.registerDefaultBlock("blue_magnolia_flowers", () -> new GlowLichenBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).ignitedByLava().replaceable().noCollission().strength(0.1F).sound(SoundType.GLOW_LICHEN)));
        PINK_MAGNOLIA_FLOWERS = BlockRegistry.registerDefaultBlock("pink_magnolia_flowers", () -> new GlowLichenBlock(BlockBehaviour.Properties.ofFullCopy(BLUE_MAGNOLIA_FLOWERS.get())));
        WHITE_MAGNOLIA_FLOWERS = BlockRegistry.registerDefaultBlock("white_magnolia_flowers", () -> new GlowLichenBlock(BlockBehaviour.Properties.ofFullCopy(BLUE_MAGNOLIA_FLOWERS.get())));
        //SNOWBELLE
        RED_SNOWBELLE = BlockRegistry.registerDefaultBlock("red_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        ORANGE_SNOWBELLE = BlockRegistry.registerDefaultBlock("orange_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        YELLOW_SNOWBELLE = BlockRegistry.registerDefaultBlock("yellow_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        LIME_SNOWBELLE = BlockRegistry.registerDefaultBlock("lime_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        GREEN_SNOWBELLE = BlockRegistry.registerDefaultBlock("green_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        CYAN_SNOWBELLE = BlockRegistry.registerDefaultBlock("cyan_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        LIGHT_BLUE_SNOWBELLE = BlockRegistry.registerDefaultBlock("light_blue_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        BLUE_SNOWBELLE = BlockRegistry.registerDefaultBlock("blue_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        PURPLE_SNOWBELLE = BlockRegistry.registerDefaultBlock("purple_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        MAGENTA_SNOWBELLE = BlockRegistry.registerDefaultBlock("magenta_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        PINK_SNOWBELLE = BlockRegistry.registerDefaultBlock("pink_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        BROWN_SNOWBELLE = BlockRegistry.registerDefaultBlock("brown_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        WHITE_SNOWBELLE = BlockRegistry.registerDefaultBlock("white_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        LIGHT_GRAY_SNOWBELLE = BlockRegistry.registerDefaultBlock("light_gray_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        GRAY_SNOWBELLE = BlockRegistry.registerDefaultBlock("gray_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
        BLACK_SNOWBELLE = BlockRegistry.registerDefaultBlock("black_snowbelle", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));

        MAPLE_LEAF_PILE = BlockRegistry.registerDefaultBlock("maple_leaf_pile", () -> new GroundCoverBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).replaceable().ignitedByLava().noCollission().sound(SoundType.AZALEA_LEAVES)));
        RED_MAPLE_LEAF_PILE = BlockRegistry.registerDefaultBlock("red_maple_leaf_pile", () -> new GroundCoverBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).replaceable().ignitedByLava().noCollission().sound(SoundType.AZALEA_LEAVES)));
        ORANGE_MAPLE_LEAF_PILE = BlockRegistry.registerDefaultBlock("orange_maple_leaf_pile", () -> new GroundCoverBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).replaceable().ignitedByLava().noCollission().sound(SoundType.AZALEA_LEAVES)));
        SILVER_BIRCH_LEAF_PILE = BlockRegistry.registerDefaultBlock("silver_birch_leaf_pile", () -> new GroundCoverBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).replaceable().ignitedByLava().noCollission().sound(SoundType.AZALEA_LEAVES)));
        ENCHANTED_BIRCH_LEAF_PILE = BlockRegistry.registerDefaultBlock("enchanted_birch_leaf_pile", () -> new GroundCoverBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).replaceable().ignitedByLava().noCollission().sound(SoundType.AZALEA_LEAVES)));
        //TALL_PLANTS
        MEADOW_SAGE = RegionsUnexploredMod.BLOCK_REGISTRY.register("meadow_sage", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH)));
        BARLEY = BlockRegistry.registerDefaultBlock("barley", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER)));
        CATTAIL = BlockRegistry.registerDefaultBlock("cattail", () -> new CattailBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER)));
        TASSEL = BlockRegistry.registerDefaultBlock("tassel", () -> new RuDoubleFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER)));
        DAY_LILY = BlockRegistry.registerDefaultBlock("day_lily", () -> new RuDoubleFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER)));
        //SAPLINGS
        ASHEN_SAPLING = BlockRegistry.registerDefaultBlock("ashen_sapling", () -> new SaplingBlock(RuTreeGrowers.ASHEN, BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().instabreak().sound(SoundType.GRASS).randomTicks()));
        ALPHA_SAPLING = BlockRegistry.registerDefaultBlock("alpha_sapling", () -> new SaplingBlock(RuTreeGrowers.ALPHA_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        APPLE_OAK_SAPLING = BlockRegistry.registerDefaultBlock("apple_oak_sapling", () -> new SaplingBlock(RuTreeGrowers.APPLE_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        BAMBOO_SAPLING = BlockRegistry.registerDefaultBlock("bamboo_sapling", () -> new SaplingBlock(RuTreeGrowers.BAMBOO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        BAOBAB_SAPLING = BlockRegistry.registerDefaultBlock("baobab_sapling", () -> new RuUltraFromMegaSaplingBlock(RuTreeGrowers.BAOBAB, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        BLACKWOOD_SAPLING = BlockRegistry.registerDefaultBlock("blackwood_sapling", () -> new SaplingBlock(RuTreeGrowers.BLACKWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        CACTUS_FLOWER = BlockRegistry.registerDefaultBlock("cactus_flower", () -> new RuCactusSaplingBlock(RuTreeGrowers.SAGUARO_CACTUS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        CYPRESS_SAPLING = BlockRegistry.registerDefaultBlock("cypress_sapling", () -> new SaplingBlock(RuTreeGrowers.CYPRESS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        DEAD_PINE_SAPLING = BlockRegistry.registerDefaultBlock("dead_pine_sapling", () -> new SaplingBlock(RuTreeGrowers.DEAD_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        DEAD_SAPLING = BlockRegistry.registerDefaultBlock("dead_sapling", () -> new SaplingBlock(RuTreeGrowers.DEAD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        EUCALYPTUS_SAPLING = BlockRegistry.registerDefaultBlock("eucalyptus_sapling", () -> new SaplingBlock(RuTreeGrowers.EUCALYPTUS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        FLOWERING_SAPLING = BlockRegistry.registerDefaultBlock("flowering_sapling", () -> new SaplingBlock(RuTreeGrowers.FLOWERING_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        GOLDEN_LARCH_SAPLING = BlockRegistry.registerDefaultBlock("golden_larch_sapling", () -> new SaplingBlock(RuTreeGrowers.GOLDEN_LARCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        JOSHUA_SAPLING = BlockRegistry.registerDefaultBlock("joshua_sapling", () -> new SaplingBlock(RuTreeGrowers.JOSHUA, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        KAPOK_SAPLING = BlockRegistry.registerDefaultBlock("kapok_sapling", () -> new RuUltraFromSuperSaplingBlock(RuTreeGrowers.KAPOK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        LARCH_SAPLING = BlockRegistry.registerDefaultBlock("larch_sapling", () -> new SaplingBlock(RuTreeGrowers.LARCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        MAPLE_SAPLING = BlockRegistry.registerDefaultBlock("maple_sapling", () -> new SaplingBlock(RuTreeGrowers.MAPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        MAUVE_SAPLING = BlockRegistry.registerDefaultBlock("mauve_sapling", () -> new SaplingBlock(RuTreeGrowers.MAUVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        ORANGE_MAPLE_SAPLING = BlockRegistry.registerDefaultBlock("orange_maple_sapling", () -> new SaplingBlock(RuTreeGrowers.ORANGE_MAPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        PALM_SAPLING = BlockRegistry.registerDefaultBlock("palm_sapling", () -> new SaplingBlock(RuTreeGrowers.PALM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        PINE_SAPLING = BlockRegistry.registerDefaultBlock("pine_sapling", () -> new SaplingBlock(RuTreeGrowers.PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        MAGNOLIA_SAPLING = BlockRegistry.registerDefaultBlock("magnolia_sapling", () -> new SaplingBlock(RuTreeGrowers.MAGNOLIA, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        WHITE_MAGNOLIA_SAPLING = BlockRegistry.registerDefaultBlock("white_magnolia_sapling", () -> new SaplingBlock(RuTreeGrowers.WHITE_MAGNOLIA, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        PINK_MAGNOLIA_SAPLING = BlockRegistry.registerDefaultBlock("pink_magnolia_sapling", () -> new SaplingBlock(RuTreeGrowers.PINK_MAGNOLIA, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        BLUE_MAGNOLIA_SAPLING = BlockRegistry.registerDefaultBlock("blue_magnolia_sapling", () -> new SaplingBlock(RuTreeGrowers.BLUE_MAGNOLIA, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        REDWOOD_SAPLING = BlockRegistry.registerDefaultBlock("redwood_sapling", () -> new RuUltraFromSuperSaplingBlock(RuTreeGrowers.REDWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        RED_MAPLE_SAPLING = BlockRegistry.registerDefaultBlock("red_maple_sapling", () -> new SaplingBlock(RuTreeGrowers.RED_MAPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        BRIMWOOD_SAPLING = BlockRegistry.registerDefaultBlock("brimwood_sapling", () -> new RuBrimSaplingBlock(RuTreeGrowers.BRIMWOOD, BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).randomTicks()));
        COBALT_SAPLING = BlockRegistry.registerDefaultBlock("cobalt_sapling", () -> new RuNetherSaplingBlock(RuTreeGrowers.COBALT, BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).randomTicks()));
        ENCHANTED_BIRCH_SAPLING = BlockRegistry.registerDefaultBlock("enchanted_birch_sapling", () -> new SaplingBlock(RuTreeGrowers.ENCHANTED_BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        SMALL_OAK_SAPLING = BlockRegistry.registerDefaultBlock("small_oak_sapling", () -> new SaplingBlock(RuTreeGrowers.SMALL_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        SILVER_BIRCH_SAPLING = BlockRegistry.registerDefaultBlock("silver_birch_sapling", () -> new SaplingBlock(RuTreeGrowers.SILVER_BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        SOCOTRA_SAPLING = BlockRegistry.registerDefaultBlock("socotra_sapling", () -> new SaplingBlock(RuTreeGrowers.SOCOTRA, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        WILLOW_SAPLING = BlockRegistry.registerDefaultBlock("willow_sapling", () -> new SaplingBlock(RuTreeGrowers.WILLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        //SHRUBS
        ACACIA_SHRUB = BlockRegistry.registerDefaultBlock("acacia_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).ignitedByLava().noCollission().instabreak().sound(SoundType.AZALEA).offsetType(BlockBehaviour.OffsetType.XZ)));
        BAOBAB_SHRUB = BlockRegistry.registerDefaultBlock("baobab_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        BIRCH_SHRUB = BlockRegistry.registerDefaultBlock("birch_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        BLACKWOOD_SHRUB = BlockRegistry.registerDefaultBlock("blackwood_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        BRIMWOOD_SHRUB = BlockRegistry.registerDefaultBlock("brimwood_shrub", () -> new BrimwoodShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        MAGNOLIA_SHRUB = BlockRegistry.registerDefaultBlock("magnolia_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        CHERRY_SHRUB = BlockRegistry.registerDefaultBlock("cherry_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        CYPRESS_SHRUB = BlockRegistry.registerDefaultBlock("cypress_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        DARK_OAK_SHRUB = BlockRegistry.registerDefaultBlock("dark_oak_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        DEAD_PINE_SHRUB = BlockRegistry.registerDefaultBlock("dead_pine_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        DEAD_SHRUB = BlockRegistry.registerDefaultBlock("dead_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        EUCALYPTUS_SHRUB = BlockRegistry.registerDefaultBlock("eucalyptus_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        FLOWERING_SHRUB = BlockRegistry.registerDefaultBlock("flowering_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        GOLDEN_LARCH_SHRUB = BlockRegistry.registerDefaultBlock("golden_larch_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        JOSHUA_SHRUB = BlockRegistry.registerDefaultBlock("joshua_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        JUNGLE_SHRUB = BlockRegistry.registerDefaultBlock("jungle_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        KAPOK_SHRUB = BlockRegistry.registerDefaultBlock("kapok_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        LARCH_SHRUB = BlockRegistry.registerDefaultBlock("larch_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        MANGROVE_SHRUB = BlockRegistry.registerDefaultBlock("mangrove_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        MAPLE_SHRUB = BlockRegistry.registerDefaultBlock("maple_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        MAUVE_SHRUB = BlockRegistry.registerDefaultBlock("mauve_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        OAK_SHRUB = BlockRegistry.registerDefaultBlock("oak_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        ORANGE_MAPLE_SHRUB = BlockRegistry.registerDefaultBlock("orange_maple_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        PALM_SHRUB = BlockRegistry.registerDefaultBlock("palm_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        PINE_SHRUB = BlockRegistry.registerDefaultBlock("pine_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        BLUE_MAGNOLIA_SHRUB = BlockRegistry.registerDefaultBlock("blue_magnolia_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        PINK_MAGNOLIA_SHRUB = BlockRegistry.registerDefaultBlock("pink_magnolia_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        REDWOOD_SHRUB = BlockRegistry.registerDefaultBlock("redwood_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        RED_MAPLE_SHRUB = BlockRegistry.registerDefaultBlock("red_maple_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        ENCHANTED_BIRCH_SHRUB = BlockRegistry.registerDefaultBlock("enchanted_birch_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        SILVER_BIRCH_SHRUB = BlockRegistry.registerDefaultBlock("silver_birch_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        SOCOTRA_SHRUB = BlockRegistry.registerDefaultBlock("socotra_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        SPRUCE_SHRUB = BlockRegistry.registerDefaultBlock("spruce_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        WHITE_MAGNOLIA_SHRUB = BlockRegistry.registerDefaultBlock("white_magnolia_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        WILLOW_SHRUB = BlockRegistry.registerDefaultBlock("willow_shrub", () -> new ShrubBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SHRUB.get())));
        //MUSHROOMS
        BLUE_BIOSHROOM = BlockRegistry.registerDefaultBlock("blue_bioshroom", () -> new BioshroomBlock(RuTreeGrowers.BLUE_BIOSHROOM, MobEffects.POISON, 10, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).pushReaction(PushReaction.DESTROY).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        GREEN_BIOSHROOM = BlockRegistry.registerDefaultBlock("green_bioshroom", () -> new BioshroomBlock(RuTreeGrowers.GREEN_BIOSHROOM, MobEffects.POISON, 10, BlockBehaviour.Properties.ofFullCopy(BLUE_BIOSHROOM.get()).mapColor(MapColor.COLOR_LIGHT_GREEN)));
        PINK_BIOSHROOM = BlockRegistry.registerDefaultBlock("pink_bioshroom", () -> new BioshroomBlock(RuTreeGrowers.PINK_BIOSHROOM, MobEffects.POISON, 10, BlockBehaviour.Properties.ofFullCopy(BLUE_BIOSHROOM.get()).mapColor(MapColor.COLOR_PINK)));
        YELLOW_BIOSHROOM = BlockRegistry.registerDefaultBlock("yellow_bioshroom", () -> new BioshroomBlock(RuTreeGrowers.YELLOW_BIOSHROOM, MobEffects.POISON, 10, BlockBehaviour.Properties.ofFullCopy(BLUE_BIOSHROOM.get()).mapColor(MapColor.COLOR_YELLOW)));
        TALL_BLUE_BIOSHROOM = BlockRegistry.registerDefaultBlock("tall_blue_bioshroom", () -> new DoubleBioshroomBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        TALL_GREEN_BIOSHROOM = BlockRegistry.registerDefaultBlock("tall_green_bioshroom", () -> new DoubleBioshroomBlock(BlockBehaviour.Properties.ofFullCopy(TALL_BLUE_BIOSHROOM.get())));
        TALL_PINK_BIOSHROOM = BlockRegistry.registerDefaultBlock("tall_pink_bioshroom", () -> new DoubleBioshroomBlock(BlockBehaviour.Properties.ofFullCopy(TALL_BLUE_BIOSHROOM.get())));
        TALL_YELLOW_BIOSHROOM = BlockRegistry.registerDefaultBlock("tall_yellow_bioshroom", () -> new DoubleBioshroomBlock(BlockBehaviour.Properties.ofFullCopy(TALL_BLUE_BIOSHROOM.get())));
        //OTHER_PLANT_BLOCKS
        ICICLE = BlockRegistry.registerDefaultBlock("icicle", () -> new IcicleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).noOcclusion().sound(SoundType.GLASS).strength(1F, 0.6F).dynamicShape().offsetType(BlockBehaviour.OffsetType.XZ)));
        BARREL_CACTUS = BlockRegistry.registerDefaultBlock("barrel_cactus", () -> new BarrelCactusBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).ignitedByLava().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        CAVE_HYSSOP = BlockRegistry.registerDefaultBlock("cave_hyssop", () -> new CaveFlowerBlock(MobEffects.LUCK, 10, BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        DUCKWEED = BlockRegistry.registerDuckweedBlock("duckweed", DuckweedBlock::new);
        SPANISH_MOSS = BlockRegistry.registerDefaultBlock("spanish_moss", () -> new SpanishMossBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).ignitedByLava().randomTicks().noCollission().instabreak().sound(SoundType.LILY_PAD)));
        SPANISH_MOSS_PLANT = RegionsUnexploredMod.BLOCK_REGISTRY.register("spanish_moss_plant", () -> new SpanishMossPlantBlock(BlockBehaviour.Properties.ofFullCopy(SPANISH_MOSS.get())));
        KAPOK_VINES = BlockRegistry.registerDefaultBlock("kapok_vines", () -> new KapokVinesBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).ignitedByLava().randomTicks().noCollission().instabreak().sound(SoundType.LILY_PAD)));
        KAPOK_VINES_PLANT = RegionsUnexploredMod.BLOCK_REGISTRY.register("kapok_vines_plant", () -> new KapokVinesPlantBlock(BlockBehaviour.Properties.ofFullCopy(KAPOK_VINES.get())));
        FLOWERING_LILY_PAD = BlockRegistry.registerLilyBlock("flowering_lily_pad", () -> new FloweringLilyBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LILY_PAD)));
        GIANT_LILY_PAD = RegionsUnexploredMod.BLOCK_REGISTRY.register("giant_lily_pad", () -> new GiantLilyBlock(BlockBehaviour.Properties.ofFullCopy(FLOWERING_LILY_PAD.get())));

        //FOOD_PLANT_BLOCKS
        SALMONBERRY_BUSH = RegionsUnexploredMod.BLOCK_REGISTRY.register("salmonberry_bush", () -> new SalmonBerryBushBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.BLOCK).ignitedByLava().randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
        /*-----------------POTTED_PLANTS-----------------*/
        //POTTED_FLOWERS
        POTTED_ALPHA_DANDELION = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_alpha_dandelion", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ALPHA_DANDELION, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_ALPHA_ROSE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_alpha_rose", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ALPHA_ROSE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_ASTER = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_aster", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ASTER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_BLEEDING_HEART = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_bleeding_heart", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLEEDING_HEART, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_BLUE_LUPINE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_blue_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLUE_LUPINE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_DAISY = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_daisy", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, DAISY, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_DORCEL = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_dorcel", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, DORCEL, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_FELICIA_DAISY = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_felicia_daisy", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FELICIA_DAISY, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_FIREWEED = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_fireweed", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FIREWEED, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_GLISTERING_BLOOM = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_glistering_bloom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GLISTERING_BLOOM, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_HIBISCUS = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_hibiscus", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, HIBISCUS, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_HYSSOP = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_hyssop", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, HYSSOP, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_MALLOW = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_mallow", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MALLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_PINK_LUPINE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_pink_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PINK_LUPINE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_POPPY_BUSH = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_poppy_bush", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, POPPY_BUSH, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_SALMON_POPPY_BUSH = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_salmon_poppy_bush", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, SALMON_POPPY_BUSH, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_PURPLE_LUPINE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_purple_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PURPLE_LUPINE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_RED_LUPINE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_red_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RED_LUPINE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_TSUBAKI = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_tsubaki", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, TSUBAKI, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_ORANGE_CONEFLOWER = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_orange_coneflower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ORANGE_CONEFLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_PURPLE_CONEFLOWER = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_purple_coneflower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PURPLE_CONEFLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_WARATAH = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_waratah", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WARATAH, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_WHITE_TRILLIUM = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_white_trillium", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WHITE_TRILLIUM, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_WILTING_TRILLIUM = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_wilting_trillium", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WILTING_TRILLIUM, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_YELLOW_LUPINE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_yellow_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, YELLOW_LUPINE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        //OTHER_POTS
        POTTED_DAY_LILY = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_day_lily", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, DAY_LILY, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_MEADOW_SAGE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_meadow_sage", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MEADOW_SAGE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_DUSKTRAP = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_dusktrap", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, DUSKTRAP, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_CORPSE_FLOWER = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_corpse_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, CORPSE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_COBALT_EARLIGHT = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_cobalt_earlight", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, COBALT_EARLIGHT, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM).lightLevel(s -> 8)));
        POTTED_TALL_COBALT_EARLIGHT = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_tall_cobalt_earlight", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, TALL_COBALT_EARLIGHT, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM).lightLevel(s -> 8)));
        POTTED_MYCOTOXIC_DAISY = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_mycotoxic_daisy", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MYCOTOXIC_DAISY, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM).lightLevel(s -> 8)));
        POTTED_GLISTER_SPIRE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_glister_spire", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GLISTER_SPIRE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM).lightLevel(s -> 8)));
        //POTTED_SAPLINGS
        POTTED_ASHEN_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_ashen_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ASHEN_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_ALPHA_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_alpha_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ALPHA_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_APPLE_OAK_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_apple_oak_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, APPLE_OAK_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_BAMBOO_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_bamboo_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BAMBOO_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_BAOBAB_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_baobab_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BAOBAB_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_BLACKWOOD_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_blackwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLACKWOOD_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_CACTUS_FLOWER = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_cactus_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, CACTUS_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_MAGNOLIA_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_magnolia_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAGNOLIA_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_CYPRESS_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_cypress_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, CYPRESS_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_DEAD_PINE_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_dead_pine_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, DEAD_PINE_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_DEAD_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_dead_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, DEAD_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_EUCALYPTUS_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_eucalyptus_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, EUCALYPTUS_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_FLOWERING_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_flowering_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FLOWERING_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_GOLDEN_LARCH_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_golden_larch_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GOLDEN_LARCH_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_JOSHUA_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_joshua_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, JOSHUA_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_KAPOK_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_kapok_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, KAPOK_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_LARCH_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_larch_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LARCH_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_MAPLE_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_maple_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAPLE_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_MAUVE_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_mauve_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAUVE_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_ORANGE_MAPLE_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_orange_maple_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ORANGE_MAPLE_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_PALM_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_palm_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PALM_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_PINE_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_pine_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PINE_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_BLUE_MAGNOLIA_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_blue_magnolia_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLUE_MAGNOLIA_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_PINK_MAGNOLIA_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_pink_magnolia_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PINK_MAGNOLIA_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_REDWOOD_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_redwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, REDWOOD_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_RED_MAPLE_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_red_maple_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RED_MAPLE_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_BRIMWOOD_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_brimwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BRIMWOOD_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_COBALT_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_cobalt_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, COBALT_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_ENCHANTED_BIRCH_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_enchanted_birch_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ENCHANTED_BIRCH_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_SMALL_OAK_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_small_oak_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, SMALL_OAK_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_SILVER_BIRCH_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_silver_birch_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, SILVER_BIRCH_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_SOCOTRA_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_socotra_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, SOCOTRA_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_WHITE_MAGNOLIA_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_white_magnolia_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WHITE_MAGNOLIA_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        POTTED_WILLOW_SAPLING = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_willow_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WILLOW_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));
        //POTTED_MUSHROOMS
        POTTED_BLUE_BIOSHROOM = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_blue_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLUE_BIOSHROOM, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_BROWN_MUSHROOM).lightLevel(s -> 10)));
        POTTED_GREEN_BIOSHROOM = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_green_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GREEN_BIOSHROOM, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_BROWN_MUSHROOM).lightLevel(s -> 10)));
        POTTED_PINK_BIOSHROOM = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_pink_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PINK_BIOSHROOM, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_BROWN_MUSHROOM).lightLevel(s -> 10)));
        POTTED_YELLOW_BIOSHROOM = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_yellow_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, YELLOW_BIOSHROOM, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_BROWN_MUSHROOM).lightLevel(s -> 10)));
        POTTED_TALL_BLUE_BIOSHROOM = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_tall_blue_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, TALL_BLUE_BIOSHROOM, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_BROWN_MUSHROOM).lightLevel(s -> 10)));
        POTTED_TALL_GREEN_BIOSHROOM = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_tall_green_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, TALL_GREEN_BIOSHROOM, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_BROWN_MUSHROOM).lightLevel(s -> 10)));
        POTTED_TALL_PINK_BIOSHROOM = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_tall_pink_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, TALL_PINK_BIOSHROOM, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_BROWN_MUSHROOM).lightLevel(s -> 10)));
        POTTED_TALL_YELLOW_BIOSHROOM = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_tall_yellow_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, TALL_YELLOW_BIOSHROOM, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_BROWN_MUSHROOM).lightLevel(s -> 10)));
        //OTHER_POTTED_PLANTS
        POTTED_BARREL_CACTUS = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_barrel_cactus", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BARREL_CACTUS, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_CACTUS)));
        POTTED_CAVE_HYSSOP = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_cave_hyssop", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, CAVE_HYSSOP, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        //POTTED_SNOWBELLE
        POTTED_RED_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_red_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RED_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_ORANGE_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_orange_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ORANGE_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_YELLOW_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_yellow_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, YELLOW_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_LIME_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_lime_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIME_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_GREEN_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_green_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GREEN_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_CYAN_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_cyan_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, CYAN_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_LIGHT_BLUE_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_light_blue_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_BLUE_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_BLUE_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_blue_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLUE_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_PURPLE_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_purple_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PURPLE_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_MAGENTA_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_magenta_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAGENTA_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_PINK_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_pink_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PINK_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_BROWN_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_brown_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BROWN_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_WHITE_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_white_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WHITE_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_LIGHT_GRAY_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_light_gray_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_GRAY_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_GRAY_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_gray_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GRAY_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        POTTED_BLACK_SNOWBELLE = RegionsUnexploredMod.BLOCK_REGISTRY.register("potted_black_snowbelle", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLACK_SNOWBELLE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
        /*-----------------PLANT_BLOCKS-----------------*/
        //MUSHROOMS
        BLUE_BIOSHROOM_BLOCK = BlockRegistry.registerDefaultBlock("blue_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).instrument(NoteBlockInstrument.BASS).sound(SoundType.WART_BLOCK).strength(0.6f)));
        GREEN_BIOSHROOM_BLOCK = BlockRegistry.registerDefaultBlock("green_bioshroom_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(BLUE_BIOSHROOM_BLOCK.get()).mapColor(MapColor.COLOR_GREEN)));
        PINK_BIOSHROOM_BLOCK = BlockRegistry.registerDefaultBlock("pink_bioshroom_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(BLUE_BIOSHROOM_BLOCK.get()).mapColor(MapColor.COLOR_PINK)));
        YELLOW_BIOSHROOM_BLOCK = BlockRegistry.registerDefaultBlock("yellow_bioshroom_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(BLUE_BIOSHROOM_BLOCK.get()).mapColor(MapColor.COLOR_YELLOW)));
        GLOWING_BLUE_BIOSHROOM_BLOCK = BlockRegistry.registerDefaultBlock("glowing_blue_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(SoundType.WART_BLOCK).instrument(NoteBlockInstrument.BASS).strength(0.6f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15)));
        GLOWING_GREEN_BIOSHROOM_BLOCK = BlockRegistry.registerDefaultBlock("glowing_green_bioshroom_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(GLOWING_BLUE_BIOSHROOM_BLOCK.get()).mapColor(MapColor.COLOR_GREEN)));
        GLOWING_PINK_BIOSHROOM_BLOCK = BlockRegistry.registerDefaultBlock("glowing_pink_bioshroom_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(GLOWING_BLUE_BIOSHROOM_BLOCK.get()).mapColor(MapColor.COLOR_PINK)));
        GLOWING_YELLOW_BIOSHROOM_BLOCK = BlockRegistry.registerDefaultBlock("glowing_yellow_bioshroom_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(GLOWING_BLUE_BIOSHROOM_BLOCK.get()).mapColor(MapColor.COLOR_YELLOW)));
        //BAMBOO
        BAMBOO_LOG = BlockRegistry.registerDefaultBlock("bamboo_log", BambooLogBlock::new);
        STRIPPED_BAMBOO_LOG = BlockRegistry.registerDefaultBlock("stripped_bamboo_log", StrippedBambooLogBlock::new);
        //OAK
        SMALL_OAK_LOG = BlockRegistry.registerDefaultBlock("small_oak_log", SmallOakLogBlock::new);
        STRIPPED_SMALL_OAK_LOG = BlockRegistry.registerDefaultBlock("stripped_small_oak_log", SmallOakLogBlock::new);
        //CACTUS
        SAGUARO_CACTUS = BlockRegistry.registerDefaultBlock("saguaro_cactus", () -> new SaguaroCactusBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).instrument(NoteBlockInstrument.GUITAR).sound(SoundType.WOOL).strength(2f)));

        /*-----------------LEAVES-----------------*/
        ALPHA_LEAVES = BlockRegistry.registerDefaultBlock("alpha_leaves", () -> BlockRegistry.leaves(MapColor.COLOR_LIGHT_GREEN));
        APPLE_OAK_LEAVES = BlockRegistry.registerDefaultBlock("apple_oak_leaves", () -> BlockRegistry.appleLeaves(MapColor.PLANT));
        BAMBOO_LEAVES = BlockRegistry.registerDefaultBlock("bamboo_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        BAOBAB_LEAVES = BlockRegistry.registerDefaultBlock("baobab_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        BLACKWOOD_LEAVES = BlockRegistry.registerDefaultBlock("blackwood_leaves", () -> BlockRegistry.leaves(MapColor.TERRACOTTA_GREEN));
        MAGNOLIA_LEAVES = BlockRegistry.registerDefaultBlock("magnolia_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        CYPRESS_LEAVES = BlockRegistry.registerDefaultBlock("cypress_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        DEAD_LEAVES = BlockRegistry.registerDefaultBlock("dead_leaves", () -> BlockRegistry.leaves(MapColor.TERRACOTTA_GRAY));
        DEAD_PINE_LEAVES = BlockRegistry.registerDefaultBlock("dead_pine_leaves", () -> BlockRegistry.leaves(MapColor.TERRACOTTA_GRAY));
        EUCALYPTUS_LEAVES = BlockRegistry.registerDefaultBlock("eucalyptus_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        FLOWERING_LEAVES = BlockRegistry.registerDefaultBlock("flowering_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        GOLDEN_LARCH_LEAVES = BlockRegistry.registerDefaultBlock("golden_larch_leaves", () -> BlockRegistry.leaves(MapColor.COLOR_YELLOW));
        JOSHUA_LEAVES = BlockRegistry.registerDefaultBlock("joshua_leaves", () -> BlockRegistry.joshuaLeaves(MapColor.PLANT));
        KAPOK_LEAVES = BlockRegistry.registerDefaultBlock("kapok_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        LARCH_LEAVES = BlockRegistry.registerDefaultBlock("larch_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        MAPLE_LEAVES = BlockRegistry.registerDefaultBlock("maple_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        MAUVE_LEAVES = BlockRegistry.registerDefaultBlock("mauve_leaves", () -> BlockRegistry.mauveLeaves(MapColor.COLOR_PURPLE));
        ORANGE_MAPLE_LEAVES = BlockRegistry.registerDefaultBlock("orange_maple_leaves", () -> BlockRegistry.orangeMapleLeaves(MapColor.COLOR_ORANGE));
        PALM_LEAVES = BlockRegistry.registerDefaultBlock("palm_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        PINE_LEAVES = BlockRegistry.registerDefaultBlock("pine_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        BLUE_MAGNOLIA_LEAVES = BlockRegistry.registerDefaultBlock("blue_magnolia_leaves", () -> BlockRegistry.blueMagnoliaLeaves(MapColor.COLOR_LIGHT_BLUE));
        PINK_MAGNOLIA_LEAVES = BlockRegistry.registerDefaultBlock("pink_magnolia_leaves", () -> BlockRegistry.pinkMagnoliaLeaves(MapColor.COLOR_PINK));
        REDWOOD_LEAVES = BlockRegistry.registerDefaultBlock("redwood_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        RED_MAPLE_LEAVES = BlockRegistry.registerDefaultBlock("red_maple_leaves", () -> BlockRegistry.redMapleLeaves(MapColor.COLOR_RED));
        BRIMWOOD_LEAVES = BlockRegistry.registerDefaultBlock("brimwood_leaves", () -> BlockRegistry.brimLeaves(MapColor.COLOR_BROWN));
        COBALT_WEBBING = BlockRegistry.registerDefaultBlock("cobalt_webbing", () -> BlockRegistry.fireproofLeaves(MapColor.COLOR_BLUE));
        ENCHANTED_BIRCH_LEAVES = BlockRegistry.registerDefaultBlock("enchanted_birch_leaves", () -> BlockRegistry.enchantedBirchLeaves(MapColor.COLOR_LIGHT_BLUE));
        SMALL_OAK_LEAVES = BlockRegistry.registerDefaultBlock("small_oak_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        SILVER_BIRCH_LEAVES = BlockRegistry.registerDefaultBlock("silver_birch_leaves", () -> BlockRegistry.silverBirchLeaves(MapColor.COLOR_YELLOW));
        SOCOTRA_LEAVES = BlockRegistry.registerDefaultBlock("socotra_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));
        WHITE_MAGNOLIA_LEAVES = BlockRegistry.registerDefaultBlock("white_magnolia_leaves", () -> BlockRegistry.whiteMagnoliaLeaves(MapColor.TERRACOTTA_WHITE));
        WILLOW_LEAVES = BlockRegistry.registerDefaultBlock("willow_leaves", () -> BlockRegistry.leaves(MapColor.PLANT));

        /*-----------------BRANCHES-----------------*/
        ACACIA_BRANCH = BlockRegistry.registerDefaultBlock("acacia_branch", () -> new BranchBlock(BlockBehaviour.Properties.of().noOcclusion().sound(SoundType.MANGROVE_ROOTS).strength(1.0F, 1.5F).dynamicShape(), BranchBlock.BranchType.BRANCH));
        BAOBAB_BRANCH = BlockRegistry.registerDefaultBlock("baobab_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        BIRCH_BRANCH = BlockRegistry.registerDefaultBlock("birch_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        BLACKWOOD_BRANCH = BlockRegistry.registerDefaultBlock("blackwood_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        MAGNOLIA_BRANCH = BlockRegistry.registerDefaultBlock("magnolia_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        CYPRESS_BRANCH = BlockRegistry.registerDefaultBlock("cypress_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        CHERRY_BRANCH = BlockRegistry.registerDefaultBlock("cherry_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        DARK_OAK_BRANCH = BlockRegistry.registerDefaultBlock("dark_oak_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        DEAD_BRANCH = BlockRegistry.registerDefaultBlock("dead_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        EUCALYPTUS_BRANCH = BlockRegistry.registerDefaultBlock("eucalyptus_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        JOSHUA_BEARD = BlockRegistry.registerDefaultBlock("joshua_beard", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BEARD));
        JUNGLE_BRANCH = BlockRegistry.registerDefaultBlock("jungle_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        KAPOK_BRANCH = BlockRegistry.registerDefaultBlock("kapok_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        LARCH_BRANCH = BlockRegistry.registerDefaultBlock("larch_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        MANGROVE_BRANCH = BlockRegistry.registerDefaultBlock("mangrove_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        MAPLE_BRANCH = BlockRegistry.registerDefaultBlock("maple_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        MAUVE_BRANCH = BlockRegistry.registerDefaultBlock("mauve_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        OAK_BRANCH = BlockRegistry.registerDefaultBlock("oak_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        PALM_BEARD = BlockRegistry.registerDefaultBlock("palm_beard", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BEARD));
        PINE_BRANCH = BlockRegistry.registerDefaultBlock("pine_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        REDWOOD_BRANCH = BlockRegistry.registerDefaultBlock("redwood_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        SILVER_BIRCH_BRANCH = BlockRegistry.registerDefaultBlock("silver_birch_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        SOCOTRA_BRANCH = BlockRegistry.registerDefaultBlock("socotra_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        SPRUCE_BRANCH = BlockRegistry.registerDefaultBlock("spruce_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));
        WILLOW_BRANCH = BlockRegistry.registerDefaultBlock("willow_branch", () -> new BranchBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_BRANCH.get()), BranchBlock.BranchType.BRANCH));

        /*-----------------DIRT_BLOCKS-----------------*/
        //FOREST_DIRT_BLOCKS
        PEAT_GRASS_BLOCK = BlockRegistry.registerDefaultBlock("peat_grass_block", () -> new PeatGrassBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
        PEAT_DIRT = BlockRegistry.registerDefaultBlock("peat_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));
        PEAT_DIRT_PATH = BlockRegistry.registerDefaultBlock("peat_dirt_path", () -> new PeatDirtPathBlock(BlockBehaviour.Properties.of().strength(0.65F).sound(SoundType.GRASS).isViewBlocking(BlockRegistry::always).isSuffocating(BlockRegistry::always)));
        PEAT_COARSE_DIRT = BlockRegistry.registerDefaultBlock("peat_coarse_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COARSE_DIRT)));
        PEAT_PODZOL = BlockRegistry.registerDefaultBlock("peat_podzol", () -> new SnowyDirtBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PODZOL)));
        PEAT_MUD = BlockRegistry.registerDefaultBlock("peat_mud", () -> new RuMudBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).mapColor(MapColor.TERRACOTTA_BROWN).randomTicks().isValidSpawn(BlockRegistry::always).isRedstoneConductor(BlockRegistry::always).isViewBlocking(BlockRegistry::always).isSuffocating(BlockRegistry::always).sound(SoundType.MUD)));
        PEAT_FARMLAND = BlockRegistry.registerDefaultBlock("peat_farmland", () -> new PeatFarmBlock(BlockBehaviour.Properties.of().randomTicks().strength(0.6F).sound(SoundType.GRAVEL).isViewBlocking(BlockRegistry::always).isSuffocating(BlockRegistry::always)));
        //PLAINS_DIRT_BLOCKS
        SILT_GRASS_BLOCK = BlockRegistry.registerDefaultBlock("silt_grass_block", () -> new SiltGrassBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
        SILT_DIRT = BlockRegistry.registerDefaultBlock("silt_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));
        SILT_DIRT_PATH = BlockRegistry.registerDefaultBlock("silt_dirt_path", () -> new SiltDirtPathBlock(BlockBehaviour.Properties.of().strength(0.65F).sound(SoundType.GRASS).isViewBlocking(BlockRegistry::always).isSuffocating(BlockRegistry::always)));
        SILT_COARSE_DIRT = BlockRegistry.registerDefaultBlock("silt_coarse_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COARSE_DIRT)));
        SILT_PODZOL = BlockRegistry.registerDefaultBlock("silt_podzol", () -> new SnowyDirtBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PODZOL)));
        SILT_MUD = BlockRegistry.registerDefaultBlock("silt_mud", () -> new RuMudBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).mapColor(MapColor.TERRACOTTA_YELLOW).randomTicks().isValidSpawn(BlockRegistry::always).isRedstoneConductor(BlockRegistry::always).isViewBlocking(BlockRegistry::always).isSuffocating(BlockRegistry::always).sound(SoundType.MUD)));
        SILT_FARMLAND = BlockRegistry.registerDefaultBlock("silt_farmland", () -> new SiltFarmBlock(BlockBehaviour.Properties.of().randomTicks().strength(0.6F).sound(SoundType.GRAVEL).isViewBlocking(BlockRegistry::always).isSuffocating(BlockRegistry::always)));
        //OTHER_DIRT_BLOCKS
        ALPHA_GRASS_BLOCK = BlockRegistry.registerDefaultBlock("alpha_grass_block", () -> new AlphaGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).randomTicks().strength(0.6F).sound(SoundType.GRAVEL)));

        /*-----------------STONE_BLOCKS-----------------*/
        //CHALKS
        CHALK = BlockRegistry.registerDefaultBlock("chalk", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
        CHALK_GRASS_BLOCK = BlockRegistry.registerDefaultBlock("chalk_grass_block", () -> new ChalkGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).randomTicks().strength(0.6f).requiresCorrectToolForDrops()));
        CHALK_BRICKS = BlockRegistry.registerDefaultBlock("chalk_bricks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).strength(0.6f).requiresCorrectToolForDrops()));
        CHALK_BRICK_SLAB = BlockRegistry.registerDefaultBlock("chalk_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).strength(0.6f).requiresCorrectToolForDrops()));
        CHALK_BRICK_STAIRS = BlockRegistry.registerDefaultBlock("chalk_brick_stairs", () -> new StairBlock(CHALK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CHALK_BRICKS.get())));
        CHALK_PILLAR = BlockRegistry.registerDefaultBlock("chalk_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).strength(0.6f).requiresCorrectToolForDrops()));
        CHALK_SLAB = BlockRegistry.registerDefaultBlock("chalk_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
        CHALK_STAIRS = BlockRegistry.registerDefaultBlock("chalk_stairs", () -> new StairBlock(CHALK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CHALK.get())));
        POLISHED_CHALK = BlockRegistry.registerDefaultBlock("polished_chalk", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
        POLISHED_CHALK_SLAB = BlockRegistry.registerDefaultBlock("polished_chalk_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
        POLISHED_CHALK_STAIRS = BlockRegistry.registerDefaultBlock("polished_chalk_stairs", () -> new StairBlock(CHALK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(POLISHED_CHALK.get())));
        //STONES
        ARGILLITE = BlockRegistry.registerDefaultBlock("argillite", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.CALCITE)));
        MOSSY_STONE = BlockRegistry.registerDefaultBlock("mossy_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

        /*-----------------OCEAN_BLOCKS-----------------*/
        //HYACINTH_BLOCKS
        HYACINTH_LAMP = BlockRegistry.registerDefaultBlock("hyacinth_lamp", () -> new HyacinthLampBlock(BlockBehaviour.Properties.of().noOcclusion().instabreak().sound(SoundType.DECORATED_POT).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 14)));
        HYACINTH_BLOOM = BlockRegistry.registerDefaultBlock("hyacinth_bloom", () -> new SeagrassBlock(BlockBehaviour.Properties.of().replaceable().noCollission().instabreak().sound(SoundType.WET_GRASS).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 9)));
        HYACINTH_FLOWERS = BlockRegistry.registerDefaultBlock("hyacinth_flowers", () -> new GlowLichenBlock(BlockBehaviour.Properties.of().replaceable().mapColor(MapColor.GLOW_LICHEN).noCollission().strength(0.2F).sound(SoundType.GLOW_LICHEN).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 8)));
        TALL_HYACINTH_STOCK = BlockRegistry.registerDefaultBlock("tall_hyacinth_stock", () -> new TallHyacinthStockBlock(BlockBehaviour.Properties.of().noCollission().instabreak().sound(SoundType.WET_GRASS).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 12)));
        //SMOULDERING_WOODLAND_BLOCKS
        ASHEN_DIRT = BlockRegistry.registerDefaultBlock("ashen_dirt", () -> new AshenDirtBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(0.5F).sound(SoundType.GRAVEL).randomTicks().lightLevel((bs) -> AshenDirtBlock.isSmouldering(bs) ? 7 : 0)));
        ASHEN_SHRUB = BlockRegistry.registerDefaultBlock("ashen_shrub", () -> new AshenShrubBlock(BlockBehaviour.Properties.of().replaceable().noCollission().instabreak().sound(SoundType.ROOTED_DIRT).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
        ASHEN_LEAVES = BlockRegistry.registerDefaultBlock("ashen_leaves", () -> BlockRegistry.leaves(MapColor.COLOR_LIGHT_GRAY));
        ASHEN_GRASS = BlockRegistry.registerDefaultBlock("ashen_grass", () -> new AshenGrassBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> AshenGrassBlock.isSmouldering(bs)).emissiveRendering((bs, br, bp) -> AshenGrassBlock.isSmouldering(bs)).lightLevel((bs) -> AshenGrassBlock.isSmouldering(bs) ? 5 : 0)));

        /*-----------------OTHER_BLOCKS-----------------*/
        ASH = BlockRegistry.registerDefaultBlock("ash", () -> new AshBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.GRAVEL).randomTicks()));
        ASH_VENT = BlockRegistry.registerDefaultBlock("ash_vent", () -> new AshVentBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).strength(1.6F).sound(SoundType.BASALT).randomTicks().requiresCorrectToolForDrops()));
        VOLCANIC_ASH = BlockRegistry.registerDefaultBlock("volcanic_ash", () -> new AshBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.GRAVEL).randomTicks()));

        /*-----------------WOOD_TYPES-----------------*/
        //ALPHA_BLOCKS
        ALPHA_LOG = BlockRegistry.registerDefaultBlock("alpha_log", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).ignitedByLava().sound(SoundType.WOOD)));
        ALPHA_PLANKS = BlockRegistry.registerDefaultBlock("alpha_planks", () -> BlockRegistry.woodPlanks(MapColor.WOOD, SoundType.WOOD));
        ALPHA_STAIRS = BlockRegistry.registerDefaultBlock("alpha_stairs", () -> BlockRegistry.woodStairs(MapColor.WOOD, SoundType.WOOD));
        ALPHA_SLAB = BlockRegistry.registerDefaultBlock("alpha_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.5F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
        //ASHEN_BLOCKS
        ASHEN_LOG = BlockRegistry.registerDefaultBlock("ashen_log", () -> BlockRegistry.fireproofLog(MapColor.COLOR_LIGHT_GRAY, MapColor.COLOR_GRAY, SoundType.NETHER_WOOD));
        ASHEN_WOOD = BlockRegistry.registerDefaultBlock("ashen_wood", () -> BlockRegistry.fireproofLog(MapColor.COLOR_LIGHT_GRAY, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHER_WOOD));
        //BAOBAB_BLOCKS
        BAOBAB_LOG = BlockRegistry.registerDefaultBlock("baobab_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.TERRACOTTA_LIGHT_GRAY, SoundType.CHERRY_WOOD));
        STRIPPED_BAOBAB_LOG = BlockRegistry.registerDefaultBlock("stripped_baobab_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.CHERRY_WOOD));
        BAOBAB_WOOD = BlockRegistry.registerDefaultBlock("baobab_wood", () -> BlockRegistry.woodBlock(MapColor.TERRACOTTA_LIGHT_GRAY, SoundType.CHERRY_WOOD));
        STRIPPED_BAOBAB_WOOD = BlockRegistry.registerDefaultBlock("stripped_baobab_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.CHERRY_WOOD));
        BAOBAB_PLANKS = BlockRegistry.registerDefaultBlock("baobab_planks", () -> BlockRegistry.woodPlanks(MapColor.WOOD, SoundType.CHERRY_WOOD));
        BAOBAB_STAIRS = BlockRegistry.registerDefaultBlock("baobab_stairs", () -> BlockRegistry.woodStairs(MapColor.WOOD, SoundType.CHERRY_WOOD));
        BAOBAB_SLAB = BlockRegistry.registerDefaultBlock("baobab_slab", () -> BlockRegistry.woodSlab(MapColor.WOOD, SoundType.CHERRY_WOOD));
        BAOBAB_FENCE = BlockRegistry.registerDefaultBlock("baobab_fence", () -> BlockRegistry.woodFence(MapColor.WOOD, SoundType.CHERRY_WOOD));
        BAOBAB_DOOR = BlockRegistry.registerDefaultBlock("baobab_door", () -> BlockRegistry.woodDoor(MapColor.WOOD, SoundType.CHERRY_WOOD, RuBlockSetType.BAOBAB));
        BAOBAB_FENCE_GATE = BlockRegistry.registerDefaultBlock("baobab_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.WOOD, RuWoodTypes.BAOBAB, SoundType.CHERRY_WOOD));
        BAOBAB_TRAPDOOR = BlockRegistry.registerDefaultBlock("baobab_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.WOOD, SoundType.CHERRY_WOOD, RuBlockSetType.BAOBAB));
        BAOBAB_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("baobab_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.WOOD, SoundType.CHERRY_WOOD, RuBlockSetType.BAOBAB));
        BAOBAB_BUTTON = BlockRegistry.registerDefaultBlock("baobab_button", () -> BlockRegistry.woodButton(SoundType.CHERRY_WOOD, RuBlockSetType.BAOBAB));
        BAOBAB_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("baobab_sign", () -> BlockRegistry.sign(SoundType.CHERRY_WOOD, RuWoodTypes.BAOBAB));
        BAOBAB_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("baobab_wall_sign", () -> BlockRegistry.wallSign(SoundType.CHERRY_WOOD, BAOBAB_SIGN.get(), RuWoodTypes.BAOBAB));
        BAOBAB_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("baobab_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.WOOD, SoundType.CHERRY_WOOD, RuWoodTypes.BAOBAB));
        BAOBAB_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("baobab_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.WOOD, SoundType.CHERRY_WOOD, BAOBAB_HANGING_SIGN.get(), RuWoodTypes.BAOBAB));
        //BLACKWOOD_BLOCKS
        BLACKWOOD_LOG = BlockRegistry.registerDefaultBlock("blackwood_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_BLACK, MapColor.TERRACOTTA_BROWN, SoundType.NETHER_WOOD));
        STRIPPED_BLACKWOOD_LOG = BlockRegistry.registerDefaultBlock("stripped_blackwood_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_BLACK, MapColor.TERRACOTTA_BLACK, SoundType.NETHER_WOOD));
        BLACKWOOD_WOOD = BlockRegistry.registerDefaultBlock("blackwood_wood", () -> BlockRegistry.woodBlock(MapColor.TERRACOTTA_BROWN, SoundType.NETHER_WOOD));
        STRIPPED_BLACKWOOD_WOOD = BlockRegistry.registerDefaultBlock("stripped_blackwood_wood", () -> BlockRegistry.woodBlock(MapColor.TERRACOTTA_BLACK, SoundType.NETHER_WOOD));
        BLACKWOOD_PLANKS = BlockRegistry.registerDefaultBlock("blackwood_planks", () -> BlockRegistry.woodPlanks(MapColor.TERRACOTTA_BLACK, SoundType.NETHER_WOOD));
        BLACKWOOD_STAIRS = BlockRegistry.registerDefaultBlock("blackwood_stairs", () -> BlockRegistry.woodStairs(MapColor.TERRACOTTA_BLACK, SoundType.NETHER_WOOD));
        BLACKWOOD_SLAB = BlockRegistry.registerDefaultBlock("blackwood_slab", () -> BlockRegistry.woodSlab(MapColor.TERRACOTTA_BLACK, SoundType.NETHER_WOOD));
        BLACKWOOD_FENCE = BlockRegistry.registerDefaultBlock("blackwood_fence", () -> BlockRegistry.woodFence(MapColor.TERRACOTTA_BLACK, SoundType.NETHER_WOOD));
        BLACKWOOD_DOOR = BlockRegistry.registerDefaultBlock("blackwood_door", () -> BlockRegistry.woodDoor(MapColor.TERRACOTTA_BLACK, SoundType.NETHER_WOOD, RuBlockSetType.BLACKWOOD));
        BLACKWOOD_FENCE_GATE = BlockRegistry.registerDefaultBlock("blackwood_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.TERRACOTTA_BLACK, RuWoodTypes.BLACKWOOD, SoundType.NETHER_WOOD));
        BLACKWOOD_TRAPDOOR = BlockRegistry.registerDefaultBlock("blackwood_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.TERRACOTTA_BLACK, SoundType.NETHER_WOOD, RuBlockSetType.BLACKWOOD));
        BLACKWOOD_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("blackwood_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.TERRACOTTA_BLACK, SoundType.NETHER_WOOD, RuBlockSetType.BLACKWOOD));
        BLACKWOOD_BUTTON = BlockRegistry.registerDefaultBlock("blackwood_button", () -> BlockRegistry.woodButton(SoundType.NETHER_WOOD, RuBlockSetType.BLACKWOOD));
        BLACKWOOD_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("blackwood_sign", () -> BlockRegistry.sign(SoundType.NETHER_WOOD, RuWoodTypes.BLACKWOOD));
        BLACKWOOD_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("blackwood_wall_sign", () -> BlockRegistry.wallSign(SoundType.NETHER_WOOD, BLACKWOOD_SIGN.get(), RuWoodTypes.BLACKWOOD));
        BLACKWOOD_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("blackwood_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.TERRACOTTA_BLACK, SoundType.NETHER_WOOD, RuWoodTypes.BLACKWOOD));
        BLACKWOOD_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("blackwood_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.TERRACOTTA_BLACK, SoundType.NETHER_WOOD, BLACKWOOD_HANGING_SIGN.get(), RuWoodTypes.BLACKWOOD));
        //BLUE_BIOSHROOM_BLOCKS
        BLUE_BIOSHROOM_STEM = BlockRegistry.registerDefaultBlock("blue_bioshroom_stem", () -> BlockRegistry.log(MapColor.COLOR_LIGHT_BLUE, MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD));
        STRIPPED_BLUE_BIOSHROOM_STEM = BlockRegistry.registerDefaultBlock("stripped_blue_bioshroom_stem", () -> BlockRegistry.log(MapColor.COLOR_LIGHT_BLUE, MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD));
        BLUE_BIOSHROOM_HYPHAE = BlockRegistry.registerDefaultBlock("blue_bioshroom_hyphae", () -> BlockRegistry.woodBlock(MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD));
        STRIPPED_BLUE_BIOSHROOM_HYPHAE = BlockRegistry.registerDefaultBlock("stripped_blue_bioshroom_hyphae", () -> BlockRegistry.woodBlock(MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD));
        BLUE_BIOSHROOM_PLANKS = BlockRegistry.registerDefaultBlock("blue_bioshroom_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD));
        BLUE_BIOSHROOM_STAIRS = BlockRegistry.registerDefaultBlock("blue_bioshroom_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD));
        BLUE_BIOSHROOM_SLAB = BlockRegistry.registerDefaultBlock("blue_bioshroom_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD));
        BLUE_BIOSHROOM_FENCE = BlockRegistry.registerDefaultBlock("blue_bioshroom_fence", () -> BlockRegistry.woodFence(MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD));
        BLUE_BIOSHROOM_DOOR = BlockRegistry.registerDefaultBlock("blue_bioshroom_door", () -> BlockRegistry.woodDoor(MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD, RuBlockSetType.BLUE_BIOSHROOM));
        BLUE_BIOSHROOM_FENCE_GATE = BlockRegistry.registerDefaultBlock("blue_bioshroom_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.COLOR_LIGHT_BLUE, RuWoodTypes.BLUE_BIOSHROOM, SoundType.CHERRY_WOOD));
        BLUE_BIOSHROOM_TRAPDOOR = BlockRegistry.registerDefaultBlock("blue_bioshroom_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD, RuBlockSetType.BLUE_BIOSHROOM));
        BLUE_BIOSHROOM_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("blue_bioshroom_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD, RuBlockSetType.BLUE_BIOSHROOM));
        BLUE_BIOSHROOM_BUTTON = BlockRegistry.registerDefaultBlock("blue_bioshroom_button", () -> BlockRegistry.woodButton(SoundType.CHERRY_WOOD, RuBlockSetType.BLUE_BIOSHROOM));
        BLUE_BIOSHROOM_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("blue_bioshroom_sign", () -> BlockRegistry.sign(SoundType.CHERRY_WOOD, RuWoodTypes.BLUE_BIOSHROOM));
        BLUE_BIOSHROOM_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("blue_bioshroom_wall_sign", () -> BlockRegistry.wallSign(SoundType.CHERRY_WOOD, BLUE_BIOSHROOM_SIGN.get(), RuWoodTypes.BLUE_BIOSHROOM));
        BLUE_BIOSHROOM_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("blue_bioshroom_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD, RuWoodTypes.BLUE_BIOSHROOM));
        BLUE_BIOSHROOM_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("blue_bioshroom_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.COLOR_LIGHT_BLUE, SoundType.CHERRY_WOOD, BLUE_BIOSHROOM_HANGING_SIGN.get(), RuWoodTypes.BLUE_BIOSHROOM));
        //BRIMWOOD_BLOCKS
        BRIMWOOD_LOG = BlockRegistry.registerDefaultBlock("brimwood_log", () -> BlockRegistry.fireproofLog(MapColor.COLOR_ORANGE, MapColor.COLOR_BROWN, SoundType.NETHER_WOOD));
        BRIMWOOD_LOG_MAGMA = BlockRegistry.registerDefaultBlock("brimwood_log_magma", () -> BlockRegistry.fireproofMagmaLog(MapColor.COLOR_ORANGE, SoundType.NETHER_WOOD));
        STRIPPED_BRIMWOOD_LOG = BlockRegistry.registerDefaultBlock("stripped_brimwood_log", () -> BlockRegistry.fireproofLog(MapColor.COLOR_ORANGE, MapColor.COLOR_BROWN, SoundType.NETHER_WOOD));
        BRIMWOOD_WOOD = BlockRegistry.registerDefaultBlock("brimwood_wood", () -> BlockRegistry.fireproofWoodBlock(MapColor.COLOR_BROWN, SoundType.NETHER_WOOD));
        STRIPPED_BRIMWOOD_WOOD = BlockRegistry.registerDefaultBlock("stripped_brimwood_wood", () -> BlockRegistry.fireproofWoodBlock(MapColor.COLOR_BROWN, SoundType.NETHER_WOOD));
        BRIMWOOD_PLANKS = BlockRegistry.registerDefaultBlock("brimwood_planks", () -> BlockRegistry.fireproofWoodPlanks(MapColor.COLOR_BROWN, SoundType.NETHER_WOOD));
        BRIMWOOD_STAIRS = BlockRegistry.registerDefaultBlock("brimwood_stairs", () -> BlockRegistry.fireproofWoodStairs(MapColor.COLOR_BROWN, SoundType.NETHER_WOOD));
        BRIMWOOD_SLAB = BlockRegistry.registerDefaultBlock("brimwood_slab", () -> BlockRegistry.fireproofWoodSlab(MapColor.COLOR_BROWN, SoundType.NETHER_WOOD));
        BRIMWOOD_FENCE = BlockRegistry.registerDefaultBlock("brimwood_fence", () -> BlockRegistry.fireproofWoodFence(MapColor.COLOR_BROWN, SoundType.NETHER_WOOD));
        BRIMWOOD_DOOR = BlockRegistry.registerDefaultBlock("brimwood_door", () -> BlockRegistry.fireproofWoodDoor(MapColor.COLOR_BROWN, SoundType.NETHER_WOOD, RuBlockSetType.BRIMWOOD));
        BRIMWOOD_FENCE_GATE = BlockRegistry.registerDefaultBlock("brimwood_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.COLOR_BROWN, RuWoodTypes.BRIMWOOD, SoundType.NETHER_WOOD));
        BRIMWOOD_TRAPDOOR = BlockRegistry.registerDefaultBlock("brimwood_trapdoor", () -> BlockRegistry.fireproofWoodTrapDoor(MapColor.COLOR_BROWN, SoundType.NETHER_WOOD, RuBlockSetType.BRIMWOOD));
        BRIMWOOD_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("brimwood_pressure_plate", () -> BlockRegistry.fireproofWoodPressurePlate(MapColor.COLOR_BROWN, SoundType.NETHER_WOOD, RuBlockSetType.BRIMWOOD));
        BRIMWOOD_BUTTON = BlockRegistry.registerDefaultBlock("brimwood_button", () -> BlockRegistry.fireproofWoodButton(SoundType.NETHER_WOOD, RuBlockSetType.BRIMWOOD));
        BRIMWOOD_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("brimwood_sign", () -> BlockRegistry.fireproofSign(SoundType.NETHER_WOOD, RuWoodTypes.BRIMWOOD));
        BRIMWOOD_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("brimwood_wall_sign", () -> BlockRegistry.fireproofWallSign(SoundType.NETHER_WOOD, BRIMWOOD_SIGN.get(), RuWoodTypes.BRIMWOOD));
        BRIMWOOD_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("brimwood_hanging_sign", () -> BlockRegistry.fireproofHangingSign(MapColor.COLOR_BROWN, SoundType.NETHER_WOOD, RuWoodTypes.BRIMWOOD));
        BRIMWOOD_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("brimwood_wall_hanging_sign", () -> BlockRegistry.fireproofWallHangingSign(MapColor.COLOR_BROWN, SoundType.NETHER_WOOD, BRIMWOOD_HANGING_SIGN.get(), RuWoodTypes.BRIMWOOD));
        //COBALT_BLOCKS
        COBALT_LOG = BlockRegistry.registerDefaultBlock("cobalt_log", () -> BlockRegistry.fireproofLog(MapColor.COLOR_BLUE, MapColor.COLOR_BLACK, SoundType.NETHER_WOOD));
        STRIPPED_COBALT_LOG = BlockRegistry.registerDefaultBlock("stripped_cobalt_log", () -> BlockRegistry.fireproofLog(MapColor.COLOR_BLUE, MapColor.COLOR_BLUE, SoundType.NETHER_WOOD));
        COBALT_WOOD = BlockRegistry.registerDefaultBlock("cobalt_wood", () -> BlockRegistry.fireproofWoodBlock(MapColor.COLOR_BLACK, SoundType.NETHER_WOOD));
        STRIPPED_COBALT_WOOD = BlockRegistry.registerDefaultBlock("stripped_cobalt_wood", () -> BlockRegistry.fireproofWoodBlock(MapColor.COLOR_BLUE, SoundType.NETHER_WOOD));
        COBALT_PLANKS = BlockRegistry.registerDefaultBlock("cobalt_planks", () -> BlockRegistry.fireproofWoodPlanks(MapColor.COLOR_BLUE, SoundType.NETHER_WOOD));
        COBALT_STAIRS = BlockRegistry.registerDefaultBlock("cobalt_stairs", () -> BlockRegistry.fireproofWoodStairs(MapColor.COLOR_BLUE, SoundType.NETHER_WOOD));
        COBALT_SLAB = BlockRegistry.registerDefaultBlock("cobalt_slab", () -> BlockRegistry.fireproofWoodSlab(MapColor.COLOR_BLUE, SoundType.NETHER_WOOD));
        COBALT_FENCE = BlockRegistry.registerDefaultBlock("cobalt_fence", () -> BlockRegistry.fireproofWoodFence(MapColor.COLOR_BLUE, SoundType.NETHER_WOOD));
        COBALT_DOOR = BlockRegistry.registerDefaultBlock("cobalt_door", () -> BlockRegistry.fireproofWoodDoor(MapColor.COLOR_BLUE, SoundType.NETHER_WOOD, RuBlockSetType.COBALT));
        COBALT_FENCE_GATE = BlockRegistry.registerDefaultBlock("cobalt_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.COLOR_BLUE, RuWoodTypes.COBALT, SoundType.NETHER_WOOD));
        COBALT_TRAPDOOR = BlockRegistry.registerDefaultBlock("cobalt_trapdoor", () -> BlockRegistry.fireproofWoodTrapDoor(MapColor.COLOR_BLUE, SoundType.NETHER_WOOD, RuBlockSetType.COBALT));
        COBALT_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("cobalt_pressure_plate", () -> BlockRegistry.fireproofWoodPressurePlate(MapColor.COLOR_BLUE, SoundType.NETHER_WOOD, RuBlockSetType.COBALT));
        COBALT_BUTTON = BlockRegistry.registerDefaultBlock("cobalt_button", () -> BlockRegistry.fireproofWoodButton(SoundType.NETHER_WOOD, RuBlockSetType.COBALT));
        COBALT_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("cobalt_sign", () -> BlockRegistry.fireproofSign(SoundType.NETHER_WOOD, RuWoodTypes.COBALT));
        COBALT_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("cobalt_wall_sign", () -> BlockRegistry.fireproofWallSign(SoundType.NETHER_WOOD, COBALT_SIGN.get(), RuWoodTypes.COBALT));
        COBALT_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("cobalt_hanging_sign", () -> BlockRegistry.fireproofHangingSign(MapColor.COLOR_BLUE, SoundType.NETHER_WOOD, RuWoodTypes.COBALT));
        COBALT_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("cobalt_wall_hanging_sign", () -> BlockRegistry.fireproofWallHangingSign(MapColor.COLOR_BLUE, SoundType.NETHER_WOOD, COBALT_HANGING_SIGN.get(), RuWoodTypes.COBALT));
        //CYPRESS_BLOCKS
        CYPRESS_LOG = BlockRegistry.registerDefaultBlock("cypress_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.BAMBOO_WOOD));
        STRIPPED_CYPRESS_LOG = BlockRegistry.registerDefaultBlock("stripped_cypress_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.BAMBOO_WOOD));
        CYPRESS_WOOD = BlockRegistry.registerDefaultBlock("cypress_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        STRIPPED_CYPRESS_WOOD = BlockRegistry.registerDefaultBlock("stripped_cypress_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        CYPRESS_PLANKS = BlockRegistry.registerDefaultBlock("cypress_planks", () -> BlockRegistry.woodPlanks(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        CYPRESS_STAIRS = BlockRegistry.registerDefaultBlock("cypress_stairs", () -> BlockRegistry.woodStairs(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        CYPRESS_SLAB = BlockRegistry.registerDefaultBlock("cypress_slab", () -> BlockRegistry.woodSlab(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        CYPRESS_FENCE = BlockRegistry.registerDefaultBlock("cypress_fence", () -> BlockRegistry.woodFence(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        CYPRESS_DOOR = BlockRegistry.registerDefaultBlock("cypress_door", () -> BlockRegistry.woodDoor(MapColor.WOOD, SoundType.BAMBOO_WOOD, RuBlockSetType.CYPRESS));
        CYPRESS_FENCE_GATE = BlockRegistry.registerDefaultBlock("cypress_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.WOOD, RuWoodTypes.CYPRESS, SoundType.BAMBOO_WOOD));
        CYPRESS_TRAPDOOR = BlockRegistry.registerDefaultBlock("cypress_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.WOOD, SoundType.BAMBOO_WOOD, RuBlockSetType.CYPRESS));
        CYPRESS_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("cypress_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.WOOD, SoundType.BAMBOO_WOOD, RuBlockSetType.CYPRESS));
        CYPRESS_BUTTON = BlockRegistry.registerDefaultBlock("cypress_button", () -> BlockRegistry.woodButton(SoundType.BAMBOO_WOOD, RuBlockSetType.CYPRESS));
        CYPRESS_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("cypress_sign", () -> BlockRegistry.sign(SoundType.BAMBOO_WOOD, RuWoodTypes.CYPRESS));
        CYPRESS_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("cypress_wall_sign", () -> BlockRegistry.wallSign(SoundType.BAMBOO_WOOD, CYPRESS_SIGN.get(), RuWoodTypes.CYPRESS));
        CYPRESS_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("cypress_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, RuWoodTypes.CYPRESS));
        CYPRESS_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("cypress_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, CYPRESS_HANGING_SIGN.get(), RuWoodTypes.CYPRESS));
        //DEAD_BLOCKS
        DEAD_LOG = BlockRegistry.registerDefaultBlock("dead_log", () -> BlockRegistry.fireproofLog(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        STRIPPED_DEAD_LOG = BlockRegistry.registerDefaultBlock("stripped_dead_log", () -> BlockRegistry.fireproofLog(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        DEAD_WOOD = BlockRegistry.registerDefaultBlock("dead_wood", () -> BlockRegistry.fireproofWoodBlock(MapColor.WOOD, SoundType.WOOD));
        STRIPPED_DEAD_WOOD = BlockRegistry.registerDefaultBlock("stripped_dead_wood", () -> BlockRegistry.fireproofWoodBlock(MapColor.WOOD, SoundType.WOOD));
        DEAD_PLANKS = BlockRegistry.registerDefaultBlock("dead_planks", () -> BlockRegistry.fireproofWoodPlanks(MapColor.WOOD, SoundType.WOOD));
        DEAD_STAIRS = BlockRegistry.registerDefaultBlock("dead_stairs", () -> BlockRegistry.fireproofWoodStairs(MapColor.WOOD, SoundType.WOOD));
        DEAD_SLAB = BlockRegistry.registerDefaultBlock("dead_slab", () -> BlockRegistry.fireproofWoodSlab(MapColor.WOOD, SoundType.WOOD));
        DEAD_FENCE = BlockRegistry.registerDefaultBlock("dead_fence", () -> BlockRegistry.fireproofWoodFence(MapColor.WOOD, SoundType.WOOD));
        DEAD_DOOR = BlockRegistry.registerDefaultBlock("dead_door", () -> BlockRegistry.fireproofWoodDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.DEAD));
        DEAD_FENCE_GATE = BlockRegistry.registerDefaultBlock("dead_fence_gate", () -> BlockRegistry.fireproofWoodFenceGate(MapColor.WOOD, RuWoodTypes.DEAD, SoundType.WOOD));
        DEAD_TRAPDOOR = BlockRegistry.registerDefaultBlock("dead_trapdoor", () -> BlockRegistry.fireproofWoodTrapDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.DEAD));
        DEAD_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("dead_pressure_plate", () -> BlockRegistry.fireproofWoodPressurePlate(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.DEAD));
        DEAD_BUTTON = BlockRegistry.registerDefaultBlock("dead_button", () -> BlockRegistry.fireproofWoodButton(SoundType.WOOD, RuBlockSetType.DEAD));
        DEAD_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("dead_sign", () -> BlockRegistry.fireproofSign(SoundType.WOOD, RuWoodTypes.DEAD));
        DEAD_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("dead_wall_sign", () -> BlockRegistry.fireproofWallSign(SoundType.WOOD, DEAD_SIGN.get(), RuWoodTypes.DEAD));
        DEAD_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("dead_hanging_sign", () -> BlockRegistry.fireproofHangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, RuWoodTypes.DEAD));
        DEAD_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("dead_wall_hanging_sign", () -> BlockRegistry.fireproofWallHangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, DEAD_HANGING_SIGN.get(), RuWoodTypes.DEAD));
        //EUCALYPTUS_BLOCKS
        EUCALYPTUS_LOG = BlockRegistry.registerDefaultBlock("eucalyptus_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        STRIPPED_EUCALYPTUS_LOG = BlockRegistry.registerDefaultBlock("stripped_eucalyptus_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        EUCALYPTUS_WOOD = BlockRegistry.registerDefaultBlock("eucalyptus_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.WOOD));
        STRIPPED_EUCALYPTUS_WOOD = BlockRegistry.registerDefaultBlock("stripped_eucalyptus_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.WOOD));
        EUCALYPTUS_PLANKS = BlockRegistry.registerDefaultBlock("eucalyptus_planks", () -> BlockRegistry.woodPlanks(MapColor.WOOD, SoundType.WOOD));
        EUCALYPTUS_STAIRS = BlockRegistry.registerDefaultBlock("eucalyptus_stairs", () -> BlockRegistry.woodStairs(MapColor.WOOD, SoundType.WOOD));
        EUCALYPTUS_SLAB = BlockRegistry.registerDefaultBlock("eucalyptus_slab", () -> BlockRegistry.woodSlab(MapColor.WOOD, SoundType.WOOD));
        EUCALYPTUS_FENCE = BlockRegistry.registerDefaultBlock("eucalyptus_fence", () -> BlockRegistry.woodFence(MapColor.WOOD, SoundType.WOOD));
        EUCALYPTUS_DOOR = BlockRegistry.registerDefaultBlock("eucalyptus_door", () -> BlockRegistry.woodDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.EUCALYPTUS));
        EUCALYPTUS_FENCE_GATE = BlockRegistry.registerDefaultBlock("eucalyptus_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.WOOD, RuWoodTypes.EUCALYPTUS, SoundType.WOOD));
        EUCALYPTUS_TRAPDOOR = BlockRegistry.registerDefaultBlock("eucalyptus_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.EUCALYPTUS));
        EUCALYPTUS_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("eucalyptus_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.EUCALYPTUS));
        EUCALYPTUS_BUTTON = BlockRegistry.registerDefaultBlock("eucalyptus_button", () -> BlockRegistry.woodButton(SoundType.WOOD, RuBlockSetType.EUCALYPTUS));
        EUCALYPTUS_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("eucalyptus_sign", () -> BlockRegistry.sign(SoundType.WOOD, RuWoodTypes.EUCALYPTUS));
        EUCALYPTUS_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("eucalyptus_wall_sign", () -> BlockRegistry.wallSign(SoundType.WOOD, EUCALYPTUS_SIGN.get(), RuWoodTypes.EUCALYPTUS));
        EUCALYPTUS_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("eucalyptus_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, RuWoodTypes.EUCALYPTUS));
        EUCALYPTUS_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("eucalyptus_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, EUCALYPTUS_HANGING_SIGN.get(), RuWoodTypes.EUCALYPTUS));
        //GREEN_BIOSHROOM_BLOCKS
        GREEN_BIOSHROOM_STEM = BlockRegistry.registerDefaultBlock("green_bioshroom_stem", () -> BlockRegistry.log(MapColor.COLOR_LIGHT_GREEN, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD));
        STRIPPED_GREEN_BIOSHROOM_STEM = BlockRegistry.registerDefaultBlock("stripped_green_bioshroom_stem", () -> BlockRegistry.log(MapColor.COLOR_LIGHT_GREEN, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD));
        GREEN_BIOSHROOM_HYPHAE = BlockRegistry.registerDefaultBlock("green_bioshroom_hyphae", () -> BlockRegistry.woodBlock(MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD));
        STRIPPED_GREEN_BIOSHROOM_HYPHAE = BlockRegistry.registerDefaultBlock("stripped_green_bioshroom_hyphae", () -> BlockRegistry.woodBlock(MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD));
        GREEN_BIOSHROOM_PLANKS = BlockRegistry.registerDefaultBlock("green_bioshroom_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD));
        GREEN_BIOSHROOM_STAIRS = BlockRegistry.registerDefaultBlock("green_bioshroom_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD));
        GREEN_BIOSHROOM_SLAB = BlockRegistry.registerDefaultBlock("green_bioshroom_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD));
        GREEN_BIOSHROOM_FENCE = BlockRegistry.registerDefaultBlock("green_bioshroom_fence", () -> BlockRegistry.woodFence(MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD));
        GREEN_BIOSHROOM_DOOR = BlockRegistry.registerDefaultBlock("green_bioshroom_door", () -> BlockRegistry.woodDoor(MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD, RuBlockSetType.GREEN_BIOSHROOM));
        GREEN_BIOSHROOM_FENCE_GATE = BlockRegistry.registerDefaultBlock("green_bioshroom_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.COLOR_LIGHT_GREEN, RuWoodTypes.GREEN_BIOSHROOM, SoundType.NETHER_WOOD));
        GREEN_BIOSHROOM_TRAPDOOR = BlockRegistry.registerDefaultBlock("green_bioshroom_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD, RuBlockSetType.GREEN_BIOSHROOM));
        GREEN_BIOSHROOM_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("green_bioshroom_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD, RuBlockSetType.GREEN_BIOSHROOM));
        GREEN_BIOSHROOM_BUTTON = BlockRegistry.registerDefaultBlock("green_bioshroom_button", () -> BlockRegistry.woodButton(SoundType.NETHER_WOOD, RuBlockSetType.GREEN_BIOSHROOM));
        GREEN_BIOSHROOM_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("green_bioshroom_sign", () -> BlockRegistry.sign(SoundType.NETHER_WOOD, RuWoodTypes.GREEN_BIOSHROOM));
        GREEN_BIOSHROOM_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("green_bioshroom_wall_sign", () -> BlockRegistry.wallSign(SoundType.NETHER_WOOD, GREEN_BIOSHROOM_SIGN.get(), RuWoodTypes.GREEN_BIOSHROOM));
        GREEN_BIOSHROOM_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("green_bioshroom_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD, RuWoodTypes.GREEN_BIOSHROOM));
        GREEN_BIOSHROOM_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("green_bioshroom_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.COLOR_LIGHT_GREEN, SoundType.NETHER_WOOD, GREEN_BIOSHROOM_HANGING_SIGN.get(), RuWoodTypes.GREEN_BIOSHROOM));
        //JOSHUA_BLOCKS
        JOSHUA_LOG = BlockRegistry.registerDefaultBlock("joshua_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        STRIPPED_JOSHUA_LOG = BlockRegistry.registerDefaultBlock("stripped_joshua_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        JOSHUA_WOOD = BlockRegistry.registerDefaultBlock("joshua_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.WOOD));
        STRIPPED_JOSHUA_WOOD = BlockRegistry.registerDefaultBlock("stripped_joshua_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.WOOD));
        JOSHUA_PLANKS = BlockRegistry.registerDefaultBlock("joshua_planks", () -> BlockRegistry.woodPlanks(MapColor.WOOD, SoundType.WOOD));
        JOSHUA_STAIRS = BlockRegistry.registerDefaultBlock("joshua_stairs", () -> BlockRegistry.woodStairs(MapColor.WOOD, SoundType.WOOD));
        JOSHUA_SLAB = BlockRegistry.registerDefaultBlock("joshua_slab", () -> BlockRegistry.woodSlab(MapColor.WOOD, SoundType.WOOD));
        JOSHUA_FENCE = BlockRegistry.registerDefaultBlock("joshua_fence", () -> BlockRegistry.woodFence(MapColor.WOOD, SoundType.WOOD));
        JOSHUA_DOOR = BlockRegistry.registerDefaultBlock("joshua_door", () -> BlockRegistry.woodDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.JOSHUA));
        JOSHUA_FENCE_GATE = BlockRegistry.registerDefaultBlock("joshua_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.WOOD, RuWoodTypes.JOSHUA, SoundType.WOOD));
        JOSHUA_TRAPDOOR = BlockRegistry.registerDefaultBlock("joshua_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.JOSHUA));
        JOSHUA_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("joshua_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.JOSHUA));
        JOSHUA_BUTTON = BlockRegistry.registerDefaultBlock("joshua_button", () -> BlockRegistry.woodButton(SoundType.WOOD, RuBlockSetType.JOSHUA));
        JOSHUA_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("joshua_sign", () -> BlockRegistry.sign(SoundType.WOOD, RuWoodTypes.JOSHUA));
        JOSHUA_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("joshua_wall_sign", () -> BlockRegistry.wallSign(SoundType.WOOD, JOSHUA_SIGN.get(), RuWoodTypes.JOSHUA));
        JOSHUA_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("joshua_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, RuWoodTypes.JOSHUA));
        JOSHUA_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("joshua_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, JOSHUA_HANGING_SIGN.get(), RuWoodTypes.JOSHUA));
        //KAPOK_BLOCKS
        KAPOK_LOG = BlockRegistry.registerDefaultBlock("kapok_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_GREEN, MapColor.WOOD, SoundType.NETHER_WOOD));
        STRIPPED_KAPOK_LOG = BlockRegistry.registerDefaultBlock("stripped_kapok_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_GREEN, MapColor.TERRACOTTA_GREEN, SoundType.NETHER_WOOD));
        KAPOK_WOOD = BlockRegistry.registerDefaultBlock("kapok_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.NETHER_WOOD));
        STRIPPED_KAPOK_WOOD = BlockRegistry.registerDefaultBlock("stripped_kapok_wood", () -> BlockRegistry.woodBlock(MapColor.TERRACOTTA_GREEN, SoundType.NETHER_WOOD));
        KAPOK_PLANKS = BlockRegistry.registerDefaultBlock("kapok_planks", () -> BlockRegistry.woodPlanks(MapColor.TERRACOTTA_GREEN, SoundType.NETHER_WOOD));
        KAPOK_STAIRS = BlockRegistry.registerDefaultBlock("kapok_stairs", () -> BlockRegistry.woodStairs(MapColor.TERRACOTTA_GREEN, SoundType.NETHER_WOOD));
        KAPOK_SLAB = BlockRegistry.registerDefaultBlock("kapok_slab", () -> BlockRegistry.woodSlab(MapColor.TERRACOTTA_GREEN, SoundType.NETHER_WOOD));
        KAPOK_FENCE = BlockRegistry.registerDefaultBlock("kapok_fence", () -> BlockRegistry.woodFence(MapColor.TERRACOTTA_GREEN, SoundType.NETHER_WOOD));
        KAPOK_DOOR = BlockRegistry.registerDefaultBlock("kapok_door", () -> BlockRegistry.woodDoor(MapColor.TERRACOTTA_GREEN, SoundType.NETHER_WOOD, RuBlockSetType.KAPOK));
        KAPOK_FENCE_GATE = BlockRegistry.registerDefaultBlock("kapok_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.TERRACOTTA_GREEN, RuWoodTypes.KAPOK, SoundType.NETHER_WOOD));
        KAPOK_TRAPDOOR = BlockRegistry.registerDefaultBlock("kapok_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.TERRACOTTA_GREEN, SoundType.NETHER_WOOD, RuBlockSetType.KAPOK));
        KAPOK_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("kapok_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.TERRACOTTA_GREEN, SoundType.NETHER_WOOD, RuBlockSetType.KAPOK));
        KAPOK_BUTTON = BlockRegistry.registerDefaultBlock("kapok_button", () -> BlockRegistry.woodButton(SoundType.NETHER_WOOD, RuBlockSetType.KAPOK));
        KAPOK_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("kapok_sign", () -> BlockRegistry.sign(SoundType.NETHER_WOOD, RuWoodTypes.KAPOK));
        KAPOK_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("kapok_wall_sign", () -> BlockRegistry.wallSign(SoundType.NETHER_WOOD, KAPOK_SIGN.get(), RuWoodTypes.KAPOK));
        KAPOK_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("kapok_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.TERRACOTTA_GREEN, SoundType.NETHER_WOOD, RuWoodTypes.KAPOK));
        KAPOK_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("kapok_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.TERRACOTTA_GREEN, SoundType.NETHER_WOOD, KAPOK_HANGING_SIGN.get(), RuWoodTypes.KAPOK));
        //LARCH_BLOCKS
        LARCH_LOG = BlockRegistry.registerDefaultBlock("larch_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        STRIPPED_LARCH_LOG = BlockRegistry.registerDefaultBlock("stripped_larch_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        LARCH_WOOD = BlockRegistry.registerDefaultBlock("larch_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.WOOD));
        STRIPPED_LARCH_WOOD = BlockRegistry.registerDefaultBlock("stripped_larch_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.WOOD));
        LARCH_PLANKS = BlockRegistry.registerDefaultBlock("larch_planks", () -> BlockRegistry.woodPlanks(MapColor.WOOD, SoundType.WOOD));
        LARCH_STAIRS = BlockRegistry.registerDefaultBlock("larch_stairs", () -> BlockRegistry.woodStairs(MapColor.WOOD, SoundType.WOOD));
        LARCH_SLAB = BlockRegistry.registerDefaultBlock("larch_slab", () -> BlockRegistry.woodSlab(MapColor.WOOD, SoundType.WOOD));
        LARCH_FENCE = BlockRegistry.registerDefaultBlock("larch_fence", () -> BlockRegistry.woodFence(MapColor.WOOD, SoundType.WOOD));
        LARCH_DOOR = BlockRegistry.registerDefaultBlock("larch_door", () -> BlockRegistry.woodDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.LARCH));
        LARCH_FENCE_GATE = BlockRegistry.registerDefaultBlock("larch_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.WOOD, RuWoodTypes.LARCH, SoundType.WOOD));
        LARCH_TRAPDOOR = BlockRegistry.registerDefaultBlock("larch_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.LARCH));
        LARCH_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("larch_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.LARCH));
        LARCH_BUTTON = BlockRegistry.registerDefaultBlock("larch_button", () -> BlockRegistry.woodButton(SoundType.WOOD, RuBlockSetType.LARCH));
        LARCH_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("larch_sign", () -> BlockRegistry.sign(SoundType.WOOD, RuWoodTypes.LARCH));
        LARCH_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("larch_wall_sign", () -> BlockRegistry.wallSign(SoundType.WOOD, LARCH_SIGN.get(), RuWoodTypes.LARCH));
        LARCH_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("larch_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, RuWoodTypes.LARCH));
        LARCH_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("larch_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, LARCH_HANGING_SIGN.get(), RuWoodTypes.LARCH));
        //MAGNOLIA_BLOCKS
        MAGNOLIA_LOG = BlockRegistry.registerDefaultBlock("magnolia_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_PINK, MapColor.STONE, SoundType.CHERRY_WOOD));
        STRIPPED_MAGNOLIA_LOG = BlockRegistry.registerDefaultBlock("stripped_magnolia_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_PINK, MapColor.TERRACOTTA_PINK, SoundType.CHERRY_WOOD));
        MAGNOLIA_WOOD = BlockRegistry.registerDefaultBlock("magnolia_wood", () -> BlockRegistry.woodBlock(MapColor.STONE, SoundType.CHERRY_WOOD));
        STRIPPED_MAGNOLIA_WOOD = BlockRegistry.registerDefaultBlock("stripped_magnolia_wood", () -> BlockRegistry.woodBlock(MapColor.TERRACOTTA_PINK, SoundType.CHERRY_WOOD));
        MAGNOLIA_PLANKS = BlockRegistry.registerDefaultBlock("magnolia_planks", () -> BlockRegistry.woodPlanks(MapColor.TERRACOTTA_PINK, SoundType.CHERRY_WOOD));
        MAGNOLIA_STAIRS = BlockRegistry.registerDefaultBlock("magnolia_stairs", () -> BlockRegistry.woodStairs(MapColor.TERRACOTTA_PINK, SoundType.CHERRY_WOOD));
        MAGNOLIA_SLAB = BlockRegistry.registerDefaultBlock("magnolia_slab", () -> BlockRegistry.woodSlab(MapColor.TERRACOTTA_PINK, SoundType.CHERRY_WOOD));
        MAGNOLIA_FENCE = BlockRegistry.registerDefaultBlock("magnolia_fence", () -> BlockRegistry.woodFence(MapColor.TERRACOTTA_PINK, SoundType.CHERRY_WOOD));
        MAGNOLIA_DOOR = BlockRegistry.registerDefaultBlock("magnolia_door", () -> BlockRegistry.woodDoor(MapColor.TERRACOTTA_PINK, SoundType.CHERRY_WOOD, RuBlockSetType.MAGNOLIA));
        MAGNOLIA_FENCE_GATE = BlockRegistry.registerDefaultBlock("magnolia_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.TERRACOTTA_PINK, RuWoodTypes.MAGNOLIA, SoundType.CHERRY_WOOD));
        MAGNOLIA_TRAPDOOR = BlockRegistry.registerDefaultBlock("magnolia_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.TERRACOTTA_PINK, SoundType.CHERRY_WOOD, RuBlockSetType.MAGNOLIA));
        MAGNOLIA_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("magnolia_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.TERRACOTTA_PINK, SoundType.CHERRY_WOOD, RuBlockSetType.MAGNOLIA));
        MAGNOLIA_BUTTON = BlockRegistry.registerDefaultBlock("magnolia_button", () -> BlockRegistry.woodButton(SoundType.CHERRY_WOOD, RuBlockSetType.MAGNOLIA));
        MAGNOLIA_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("magnolia_sign", () -> BlockRegistry.sign(SoundType.CHERRY_WOOD, RuWoodTypes.MAGNOLIA));
        MAGNOLIA_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("magnolia_wall_sign", () -> BlockRegistry.wallSign(SoundType.CHERRY_WOOD, MAGNOLIA_SIGN.get(), RuWoodTypes.MAGNOLIA));
        MAGNOLIA_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("magnolia_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.TERRACOTTA_PINK, SoundType.NETHER_WOOD, RuWoodTypes.MAGNOLIA));
        MAGNOLIA_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("magnolia_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.TERRACOTTA_PINK, SoundType.NETHER_WOOD, MAGNOLIA_HANGING_SIGN.get(), RuWoodTypes.MAGNOLIA));
        //MAPLE_BLOCKS
        MAPLE_LOG = BlockRegistry.registerDefaultBlock("maple_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        STRIPPED_MAPLE_LOG = BlockRegistry.registerDefaultBlock("stripped_maple_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        MAPLE_WOOD = BlockRegistry.registerDefaultBlock("maple_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.WOOD));
        STRIPPED_MAPLE_WOOD = BlockRegistry.registerDefaultBlock("stripped_maple_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.WOOD));
        MAPLE_PLANKS = BlockRegistry.registerDefaultBlock("maple_planks", () -> BlockRegistry.woodPlanks(MapColor.WOOD, SoundType.WOOD));
        MAPLE_STAIRS = BlockRegistry.registerDefaultBlock("maple_stairs", () -> BlockRegistry.woodStairs(MapColor.WOOD, SoundType.WOOD));
        MAPLE_SLAB = BlockRegistry.registerDefaultBlock("maple_slab", () -> BlockRegistry.woodSlab(MapColor.WOOD, SoundType.WOOD));
        MAPLE_FENCE = BlockRegistry.registerDefaultBlock("maple_fence", () -> BlockRegistry.woodFence(MapColor.WOOD, SoundType.WOOD));
        MAPLE_DOOR = BlockRegistry.registerDefaultBlock("maple_door", () -> BlockRegistry.woodDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.MAPLE));
        MAPLE_FENCE_GATE = BlockRegistry.registerDefaultBlock("maple_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.WOOD, RuWoodTypes.MAPLE, SoundType.WOOD));
        MAPLE_TRAPDOOR = BlockRegistry.registerDefaultBlock("maple_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.MAPLE));
        MAPLE_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("maple_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.MAPLE));
        MAPLE_BUTTON = BlockRegistry.registerDefaultBlock("maple_button", () -> BlockRegistry.woodButton(SoundType.WOOD, RuBlockSetType.MAPLE));
        MAPLE_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("maple_sign", () -> BlockRegistry.sign(SoundType.WOOD, RuWoodTypes.MAPLE));
        MAPLE_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("maple_wall_sign", () -> BlockRegistry.wallSign(SoundType.WOOD, MAPLE_SIGN.get(), RuWoodTypes.MAPLE));
        MAPLE_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("maple_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, RuWoodTypes.MAPLE));
        MAPLE_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("maple_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, MAPLE_HANGING_SIGN.get(), RuWoodTypes.MAPLE));
        //MAUVE_BLOCKS
        MAUVE_LOG = BlockRegistry.registerDefaultBlock("mauve_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_PURPLE, MapColor.PODZOL, SoundType.CHERRY_WOOD));
        STRIPPED_MAUVE_LOG = BlockRegistry.registerDefaultBlock("stripped_mauve_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_PURPLE, MapColor.TERRACOTTA_PURPLE, SoundType.CHERRY_WOOD));
        MAUVE_WOOD = BlockRegistry.registerDefaultBlock("mauve_wood", () -> BlockRegistry.woodBlock(MapColor.PODZOL, SoundType.CHERRY_WOOD));
        STRIPPED_MAUVE_WOOD = BlockRegistry.registerDefaultBlock("stripped_mauve_wood", () -> BlockRegistry.woodBlock(MapColor.TERRACOTTA_PURPLE, SoundType.CHERRY_WOOD));
        MAUVE_PLANKS = BlockRegistry.registerDefaultBlock("mauve_planks", () -> BlockRegistry.woodPlanks(MapColor.TERRACOTTA_PURPLE, SoundType.CHERRY_WOOD));
        MAUVE_STAIRS = BlockRegistry.registerDefaultBlock("mauve_stairs", () -> BlockRegistry.woodStairs(MapColor.TERRACOTTA_PURPLE, SoundType.CHERRY_WOOD));
        MAUVE_SLAB = BlockRegistry.registerDefaultBlock("mauve_slab", () -> BlockRegistry.woodSlab(MapColor.TERRACOTTA_PURPLE, SoundType.CHERRY_WOOD));
        MAUVE_FENCE = BlockRegistry.registerDefaultBlock("mauve_fence", () -> BlockRegistry.woodFence(MapColor.TERRACOTTA_PURPLE, SoundType.CHERRY_WOOD));
        MAUVE_DOOR = BlockRegistry.registerDefaultBlock("mauve_door", () -> BlockRegistry.woodDoor(MapColor.TERRACOTTA_PURPLE, SoundType.CHERRY_WOOD, RuBlockSetType.MAUVE));
        MAUVE_FENCE_GATE = BlockRegistry.registerDefaultBlock("mauve_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.TERRACOTTA_PURPLE, RuWoodTypes.MAUVE, SoundType.CHERRY_WOOD));
        MAUVE_TRAPDOOR = BlockRegistry.registerDefaultBlock("mauve_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.TERRACOTTA_PURPLE, SoundType.CHERRY_WOOD, RuBlockSetType.MAUVE));
        MAUVE_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("mauve_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.TERRACOTTA_PURPLE, SoundType.CHERRY_WOOD, RuBlockSetType.MAUVE));
        MAUVE_BUTTON = BlockRegistry.registerDefaultBlock("mauve_button", () -> BlockRegistry.woodButton(SoundType.CHERRY_WOOD, RuBlockSetType.MAUVE));
        MAUVE_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("mauve_sign", () -> BlockRegistry.sign(SoundType.CHERRY_WOOD, RuWoodTypes.MAUVE));
        MAUVE_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("mauve_wall_sign", () -> BlockRegistry.wallSign(SoundType.CHERRY_WOOD, MAUVE_SIGN.get(), RuWoodTypes.MAUVE));
        MAUVE_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("mauve_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.TERRACOTTA_PURPLE, SoundType.NETHER_WOOD, RuWoodTypes.MAUVE));
        MAUVE_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("mauve_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.TERRACOTTA_PURPLE, SoundType.NETHER_WOOD, MAUVE_HANGING_SIGN.get(), RuWoodTypes.MAUVE));
        //PALM_BLOCKS
        PALM_LOG = BlockRegistry.registerDefaultBlock("palm_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.BAMBOO_WOOD));
        STRIPPED_PALM_LOG = BlockRegistry.registerDefaultBlock("stripped_palm_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PALM_WOOD = BlockRegistry.registerDefaultBlock("palm_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        STRIPPED_PALM_WOOD = BlockRegistry.registerDefaultBlock("stripped_palm_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PALM_PLANKS = BlockRegistry.registerDefaultBlock("palm_planks", () -> BlockRegistry.woodPlanks(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PALM_STAIRS = BlockRegistry.registerDefaultBlock("palm_stairs", () -> BlockRegistry.woodStairs(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PALM_SLAB = BlockRegistry.registerDefaultBlock("palm_slab", () -> BlockRegistry.woodSlab(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PALM_FENCE = BlockRegistry.registerDefaultBlock("palm_fence", () -> BlockRegistry.woodFence(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PALM_DOOR = BlockRegistry.registerDefaultBlock("palm_door", () -> BlockRegistry.woodDoor(MapColor.WOOD, SoundType.BAMBOO_WOOD, RuBlockSetType.PALM));
        PALM_FENCE_GATE = BlockRegistry.registerDefaultBlock("palm_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.WOOD, RuWoodTypes.PALM, SoundType.BAMBOO_WOOD));
        PALM_TRAPDOOR = BlockRegistry.registerDefaultBlock("palm_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.WOOD, SoundType.BAMBOO_WOOD, RuBlockSetType.PALM));
        PALM_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("palm_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.WOOD, SoundType.BAMBOO_WOOD, RuBlockSetType.PALM));
        PALM_BUTTON = BlockRegistry.registerDefaultBlock("palm_button", () -> BlockRegistry.woodButton(SoundType.BAMBOO_WOOD, RuBlockSetType.PALM));
        PALM_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("palm_sign", () -> BlockRegistry.sign(SoundType.BAMBOO_WOOD, RuWoodTypes.PALM));
        PALM_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("palm_wall_sign", () -> BlockRegistry.wallSign(SoundType.BAMBOO_WOOD, PALM_SIGN.get(), RuWoodTypes.PALM));
        PALM_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("palm_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, RuWoodTypes.PALM));
        PALM_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("palm_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, PALM_HANGING_SIGN.get(), RuWoodTypes.PALM));
        //PINE_BLOCKS
        PINE_LOG = BlockRegistry.registerDefaultBlock("pine_log", () -> BlockRegistry.pineLog(MapColor.WOOD, MapColor.WOOD, SoundType.BAMBOO_WOOD));
        STRIPPED_PINE_LOG = BlockRegistry.registerDefaultBlock("stripped_pine_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PINE_WOOD = BlockRegistry.registerDefaultBlock("pine_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        STRIPPED_PINE_WOOD = BlockRegistry.registerDefaultBlock("stripped_pine_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PINE_PLANKS = BlockRegistry.registerDefaultBlock("pine_planks", () -> BlockRegistry.woodPlanks(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PINE_STAIRS = BlockRegistry.registerDefaultBlock("pine_stairs", () -> BlockRegistry.woodStairs(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PINE_SLAB = BlockRegistry.registerDefaultBlock("pine_slab", () -> BlockRegistry.woodSlab(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PINE_FENCE = BlockRegistry.registerDefaultBlock("pine_fence", () -> BlockRegistry.woodFence(MapColor.WOOD, SoundType.BAMBOO_WOOD));
        PINE_DOOR = BlockRegistry.registerDefaultBlock("pine_door", () -> BlockRegistry.woodDoor(MapColor.WOOD, SoundType.BAMBOO_WOOD, RuBlockSetType.PINE));
        PINE_FENCE_GATE = BlockRegistry.registerDefaultBlock("pine_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.WOOD, RuWoodTypes.PINE, SoundType.BAMBOO_WOOD));
        PINE_TRAPDOOR = BlockRegistry.registerDefaultBlock("pine_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.WOOD, SoundType.BAMBOO_WOOD, RuBlockSetType.PINE));
        PINE_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("pine_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.WOOD, SoundType.BAMBOO_WOOD, RuBlockSetType.PINE));
        PINE_BUTTON = BlockRegistry.registerDefaultBlock("pine_button", () -> BlockRegistry.woodButton(SoundType.BAMBOO_WOOD, RuBlockSetType.PINE));
        PINE_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("pine_sign", () -> BlockRegistry.sign(SoundType.BAMBOO_WOOD, RuWoodTypes.PINE));
        PINE_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("pine_wall_sign", () -> BlockRegistry.wallSign(SoundType.BAMBOO_WOOD, PINE_SIGN.get(), RuWoodTypes.PINE));
        PINE_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("pine_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, RuWoodTypes.PINE));
        PINE_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("pine_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, PINE_HANGING_SIGN.get(), RuWoodTypes.PINE));
        //PINK_BIOSHROOM_BLOCKS
        PINK_BIOSHROOM_STEM = BlockRegistry.registerDefaultBlock("pink_bioshroom_stem", () -> BlockRegistry.log(MapColor.COLOR_PINK, MapColor.COLOR_PINK, SoundType.NETHER_WOOD));
        STRIPPED_PINK_BIOSHROOM_STEM = BlockRegistry.registerDefaultBlock("stripped_pink_bioshroom_stem", () -> BlockRegistry.log(MapColor.COLOR_PINK, MapColor.COLOR_PINK, SoundType.NETHER_WOOD));
        PINK_BIOSHROOM_HYPHAE = BlockRegistry.registerDefaultBlock("pink_bioshroom_hyphae", () -> BlockRegistry.woodBlock(MapColor.COLOR_PINK, SoundType.NETHER_WOOD));
        STRIPPED_PINK_BIOSHROOM_HYPHAE = BlockRegistry.registerDefaultBlock("stripped_pink_bioshroom_hyphae", () -> BlockRegistry.woodBlock(MapColor.COLOR_PINK, SoundType.NETHER_WOOD));
        PINK_BIOSHROOM_PLANKS = BlockRegistry.registerDefaultBlock("pink_bioshroom_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_PINK, SoundType.NETHER_WOOD));
        PINK_BIOSHROOM_STAIRS = BlockRegistry.registerDefaultBlock("pink_bioshroom_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_PINK, SoundType.NETHER_WOOD));
        PINK_BIOSHROOM_SLAB = BlockRegistry.registerDefaultBlock("pink_bioshroom_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_PINK, SoundType.NETHER_WOOD));
        PINK_BIOSHROOM_FENCE = BlockRegistry.registerDefaultBlock("pink_bioshroom_fence", () -> BlockRegistry.woodFence(MapColor.COLOR_PINK, SoundType.NETHER_WOOD));
        PINK_BIOSHROOM_DOOR = BlockRegistry.registerDefaultBlock("pink_bioshroom_door", () -> BlockRegistry.woodDoor(MapColor.COLOR_PINK, SoundType.NETHER_WOOD, RuBlockSetType.PINK_BIOSHROOM));
        PINK_BIOSHROOM_FENCE_GATE = BlockRegistry.registerDefaultBlock("pink_bioshroom_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.COLOR_PINK, RuWoodTypes.PINK_BIOSHROOM, SoundType.NETHER_WOOD));
        PINK_BIOSHROOM_TRAPDOOR = BlockRegistry.registerDefaultBlock("pink_bioshroom_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.COLOR_PINK, SoundType.NETHER_WOOD, RuBlockSetType.PINK_BIOSHROOM));
        PINK_BIOSHROOM_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("pink_bioshroom_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.COLOR_PINK, SoundType.NETHER_WOOD, RuBlockSetType.PINK_BIOSHROOM));
        PINK_BIOSHROOM_BUTTON = BlockRegistry.registerDefaultBlock("pink_bioshroom_button", () -> BlockRegistry.woodButton(SoundType.NETHER_WOOD, RuBlockSetType.PINK_BIOSHROOM));
        PINK_BIOSHROOM_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("pink_bioshroom_sign", () -> BlockRegistry.sign(SoundType.NETHER_WOOD, RuWoodTypes.PINK_BIOSHROOM));
        PINK_BIOSHROOM_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("pink_bioshroom_wall_sign", () -> BlockRegistry.wallSign(SoundType.NETHER_WOOD, PINK_BIOSHROOM_SIGN.get(), RuWoodTypes.PINK_BIOSHROOM));
        PINK_BIOSHROOM_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("pink_bioshroom_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.COLOR_PINK, SoundType.NETHER_WOOD, RuWoodTypes.PINK_BIOSHROOM));
        PINK_BIOSHROOM_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("pink_bioshroom_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.COLOR_PINK, SoundType.NETHER_WOOD, PINK_BIOSHROOM_HANGING_SIGN.get(), RuWoodTypes.PINK_BIOSHROOM));
        //REDWOOD_BLOCKS
        REDWOOD_LOG = BlockRegistry.registerDefaultBlock("redwood_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_RED, MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD));
        STRIPPED_REDWOOD_LOG = BlockRegistry.registerDefaultBlock("stripped_redwood_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_RED, MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD));
        REDWOOD_WOOD = BlockRegistry.registerDefaultBlock("redwood_wood", () -> BlockRegistry.woodBlock(MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD));
        STRIPPED_REDWOOD_WOOD = BlockRegistry.registerDefaultBlock("stripped_redwood_wood", () -> BlockRegistry.woodBlock(MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD));
        REDWOOD_PLANKS = BlockRegistry.registerDefaultBlock("redwood_planks", () -> BlockRegistry.woodPlanks(MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD));
        REDWOOD_STAIRS = BlockRegistry.registerDefaultBlock("redwood_stairs", () -> BlockRegistry.woodStairs(MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD));
        REDWOOD_SLAB = BlockRegistry.registerDefaultBlock("redwood_slab", () -> BlockRegistry.woodSlab(MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD));
        REDWOOD_FENCE = BlockRegistry.registerDefaultBlock("redwood_fence", () -> BlockRegistry.woodFence(MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD));
        REDWOOD_DOOR = BlockRegistry.registerDefaultBlock("redwood_door", () -> BlockRegistry.woodDoor(MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD, RuBlockSetType.REDWOOD));
        REDWOOD_FENCE_GATE = BlockRegistry.registerDefaultBlock("redwood_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.TERRACOTTA_RED, RuWoodTypes.REDWOOD, SoundType.CHERRY_WOOD));
        REDWOOD_TRAPDOOR = BlockRegistry.registerDefaultBlock("redwood_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD, RuBlockSetType.REDWOOD));
        REDWOOD_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("redwood_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD, RuBlockSetType.REDWOOD));
        REDWOOD_BUTTON = BlockRegistry.registerDefaultBlock("redwood_button", () -> BlockRegistry.woodButton(SoundType.CHERRY_WOOD, RuBlockSetType.REDWOOD));
        REDWOOD_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("redwood_sign", () -> BlockRegistry.sign(SoundType.CHERRY_WOOD, RuWoodTypes.REDWOOD));
        REDWOOD_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("redwood_wall_sign", () -> BlockRegistry.wallSign(SoundType.CHERRY_WOOD, REDWOOD_SIGN.get(), RuWoodTypes.REDWOOD));
        REDWOOD_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("redwood_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.TERRACOTTA_RED, SoundType.NETHER_WOOD, RuWoodTypes.REDWOOD));
        REDWOOD_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("redwood_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.TERRACOTTA_RED, SoundType.NETHER_WOOD, REDWOOD_HANGING_SIGN.get(), RuWoodTypes.REDWOOD));
        //SILVER_BIRCH
        SILVER_BIRCH_LOG = BlockRegistry.registerDefaultBlock("silver_birch_log", () -> BlockRegistry.aspenLogBlock(MapColor.SAND, MapColor.QUARTZ, SoundType.BAMBOO_WOOD));
        SILVER_BIRCH_WOOD = BlockRegistry.registerDefaultBlock("silver_birch_wood", () -> BlockRegistry.log(MapColor.QUARTZ, MapColor.QUARTZ, SoundType.BAMBOO_WOOD));
        //SOCOTRA_BLOCKS
        SOCOTRA_LOG = BlockRegistry.registerDefaultBlock("socotra_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_ORANGE, MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD));
        STRIPPED_SOCOTRA_LOG = BlockRegistry.registerDefaultBlock("stripped_socotra_log", () -> BlockRegistry.log(MapColor.TERRACOTTA_ORANGE, MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD));
        SOCOTRA_WOOD = BlockRegistry.registerDefaultBlock("socotra_wood", () -> BlockRegistry.woodBlock(MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD));
        STRIPPED_SOCOTRA_WOOD = BlockRegistry.registerDefaultBlock("stripped_socotra_wood", () -> BlockRegistry.woodBlock(MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD));
        SOCOTRA_PLANKS = BlockRegistry.registerDefaultBlock("socotra_planks", () -> BlockRegistry.woodPlanks(MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD));
        SOCOTRA_STAIRS = BlockRegistry.registerDefaultBlock("socotra_stairs", () -> BlockRegistry.woodStairs(MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD));
        SOCOTRA_SLAB = BlockRegistry.registerDefaultBlock("socotra_slab", () -> BlockRegistry.woodSlab(MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD));
        SOCOTRA_FENCE = BlockRegistry.registerDefaultBlock("socotra_fence", () -> BlockRegistry.woodFence(MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD));
        SOCOTRA_DOOR = BlockRegistry.registerDefaultBlock("socotra_door", () -> BlockRegistry.woodDoor(MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD, RuBlockSetType.SOCOTRA));
        SOCOTRA_FENCE_GATE = BlockRegistry.registerDefaultBlock("socotra_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.TERRACOTTA_ORANGE, RuWoodTypes.SOCOTRA, SoundType.CHERRY_WOOD));
        SOCOTRA_TRAPDOOR = BlockRegistry.registerDefaultBlock("socotra_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD, RuBlockSetType.SOCOTRA));
        SOCOTRA_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("socotra_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD, RuBlockSetType.SOCOTRA));
        SOCOTRA_BUTTON = BlockRegistry.registerDefaultBlock("socotra_button", () -> BlockRegistry.woodButton(SoundType.CHERRY_WOOD, RuBlockSetType.SOCOTRA));
        SOCOTRA_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("socotra_sign", () -> BlockRegistry.sign(SoundType.CHERRY_WOOD, RuWoodTypes.SOCOTRA));
        SOCOTRA_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("socotra_wall_sign", () -> BlockRegistry.wallSign(SoundType.CHERRY_WOOD, SOCOTRA_SIGN.get(), RuWoodTypes.SOCOTRA));
        SOCOTRA_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("socotra_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.TERRACOTTA_ORANGE, SoundType.NETHER_WOOD, RuWoodTypes.SOCOTRA));
        SOCOTRA_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("socotra_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.TERRACOTTA_ORANGE, SoundType.NETHER_WOOD, SOCOTRA_HANGING_SIGN.get(), RuWoodTypes.SOCOTRA));
        //WILLOW_BLOCKS

        WILLOW_LOG = BlockRegistry.registerDefaultBlock("willow_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        STRIPPED_WILLOW_LOG = BlockRegistry.registerDefaultBlock("stripped_willow_log", () -> BlockRegistry.log(MapColor.WOOD, MapColor.WOOD, SoundType.WOOD));
        WILLOW_WOOD = BlockRegistry.registerDefaultBlock("willow_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.WOOD));
        STRIPPED_WILLOW_WOOD = BlockRegistry.registerDefaultBlock("stripped_willow_wood", () -> BlockRegistry.woodBlock(MapColor.WOOD, SoundType.WOOD));
        WILLOW_PLANKS = BlockRegistry.registerDefaultBlock("willow_planks", () -> BlockRegistry.woodPlanks(MapColor.WOOD, SoundType.WOOD));
        WILLOW_STAIRS = BlockRegistry.registerDefaultBlock("willow_stairs", () -> BlockRegistry.woodStairs(MapColor.WOOD, SoundType.WOOD));
        WILLOW_SLAB = BlockRegistry.registerDefaultBlock("willow_slab", () -> BlockRegistry.woodSlab(MapColor.WOOD, SoundType.WOOD));
        WILLOW_FENCE = BlockRegistry.registerDefaultBlock("willow_fence", () -> BlockRegistry.woodFence(MapColor.WOOD, SoundType.WOOD));
        WILLOW_DOOR = BlockRegistry.registerDefaultBlock("willow_door", () -> BlockRegistry.woodDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.WILLOW));
        WILLOW_FENCE_GATE = BlockRegistry.registerDefaultBlock("willow_fence_gate", () -> BlockRegistry.woodFenceGate(MapColor.WOOD, RuWoodTypes.WILLOW, SoundType.WOOD));
        WILLOW_TRAPDOOR = BlockRegistry.registerDefaultBlock("willow_trapdoor", () -> BlockRegistry.woodTrapDoor(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.WILLOW));
        WILLOW_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("willow_pressure_plate", () -> BlockRegistry.woodPressurePlate(MapColor.WOOD, SoundType.WOOD, RuBlockSetType.WILLOW));
        WILLOW_BUTTON = BlockRegistry.registerDefaultBlock("willow_button", () -> BlockRegistry.woodButton(SoundType.WOOD, RuBlockSetType.WILLOW));
        WILLOW_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("willow_sign", () -> BlockRegistry.sign(SoundType.WOOD, RuWoodTypes.WILLOW));
        WILLOW_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("willow_wall_sign", () -> BlockRegistry.wallSign(SoundType.WOOD, WILLOW_SIGN.get(), RuWoodTypes.WILLOW));
        WILLOW_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("willow_hanging_sign", () -> BlockRegistry.hangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, RuWoodTypes.WILLOW));
        WILLOW_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("willow_wall_hanging_sign", () -> BlockRegistry.wallHangingSign(MapColor.WOOD, SoundType.NETHER_WOOD, WILLOW_HANGING_SIGN.get(), RuWoodTypes.WILLOW));
        //YELLOW_BIOSHROOM_BLOCKS
        YELLOW_BIOSHROOM_STEM = BlockRegistry.registerDefaultBlock("yellow_bioshroom_stem", () -> BlockRegistry.fireproofLog(MapColor.COLOR_YELLOW, MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD));
        STRIPPED_YELLOW_BIOSHROOM_STEM = BlockRegistry.registerDefaultBlock("stripped_yellow_bioshroom_stem", () -> BlockRegistry.fireproofLog(MapColor.COLOR_YELLOW, MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD));
        YELLOW_BIOSHROOM_HYPHAE = BlockRegistry.registerDefaultBlock("yellow_bioshroom_hyphae", () -> BlockRegistry.fireproofWoodBlock(MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD));
        STRIPPED_YELLOW_BIOSHROOM_HYPHAE = BlockRegistry.registerDefaultBlock("stripped_yellow_bioshroom_hyphae", () -> BlockRegistry.fireproofWoodBlock(MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD));
        YELLOW_BIOSHROOM_PLANKS = BlockRegistry.registerDefaultBlock("yellow_bioshroom_planks", () -> BlockRegistry.fireproofWoodPlanks(MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD));
        YELLOW_BIOSHROOM_STAIRS = BlockRegistry.registerDefaultBlock("yellow_bioshroom_stairs", () -> BlockRegistry.fireproofWoodStairs(MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD));
        YELLOW_BIOSHROOM_SLAB = BlockRegistry.registerDefaultBlock("yellow_bioshroom_slab", () -> BlockRegistry.fireproofWoodSlab(MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD));
        YELLOW_BIOSHROOM_FENCE = BlockRegistry.registerDefaultBlock("yellow_bioshroom_fence", () -> BlockRegistry.fireproofWoodFence(MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD));
        YELLOW_BIOSHROOM_DOOR = BlockRegistry.registerDefaultBlock("yellow_bioshroom_door", () -> BlockRegistry.fireproofWoodDoor(MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD, RuBlockSetType.YELLOW_BIOSHROOM));
        YELLOW_BIOSHROOM_FENCE_GATE = BlockRegistry.registerDefaultBlock("yellow_bioshroom_fence_gate", () -> BlockRegistry.fireproofWoodFenceGate(MapColor.COLOR_YELLOW, RuWoodTypes.YELLOW_BIOSHROOM, SoundType.NETHER_WOOD));
        YELLOW_BIOSHROOM_TRAPDOOR = BlockRegistry.registerDefaultBlock("yellow_bioshroom_trapdoor", () -> BlockRegistry.fireproofWoodTrapDoor(MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD, RuBlockSetType.YELLOW_BIOSHROOM));
        YELLOW_BIOSHROOM_PRESSURE_PLATE = BlockRegistry.registerDefaultBlock("yellow_bioshroom_pressure_plate", () -> BlockRegistry.fireproofWoodPressurePlate(MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD, RuBlockSetType.YELLOW_BIOSHROOM));
        YELLOW_BIOSHROOM_BUTTON = BlockRegistry.registerDefaultBlock("yellow_bioshroom_button", () -> BlockRegistry.fireproofWoodButton(SoundType.NETHER_WOOD, RuBlockSetType.YELLOW_BIOSHROOM));
        YELLOW_BIOSHROOM_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("yellow_bioshroom_sign", () -> BlockRegistry.fireproofSign(SoundType.NETHER_WOOD, RuWoodTypes.YELLOW_BIOSHROOM));
        YELLOW_BIOSHROOM_WALL_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("yellow_bioshroom_wall_sign", () -> BlockRegistry.fireproofWallSign(SoundType.NETHER_WOOD, YELLOW_BIOSHROOM_SIGN.get(), RuWoodTypes.YELLOW_BIOSHROOM));
        YELLOW_BIOSHROOM_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("yellow_bioshroom_hanging_sign", () -> BlockRegistry.fireproofHangingSign(MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD, RuWoodTypes.YELLOW_BIOSHROOM));
        YELLOW_BIOSHROOM_WALL_HANGING_SIGN = RegionsUnexploredMod.BLOCK_REGISTRY.register("yellow_bioshroom_wall_hanging_sign", () -> BlockRegistry.fireproofWallHangingSign(MapColor.COLOR_YELLOW, SoundType.NETHER_WOOD, YELLOW_BIOSHROOM_HANGING_SIGN.get(), RuWoodTypes.YELLOW_BIOSHROOM));

        /*-----------------PAINTED PLANKS-----------------*/
        //PLANKS
        RED_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("red_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_RED, SoundType.WOOD));
        ORANGE_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("orange_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_ORANGE, SoundType.WOOD));
        YELLOW_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("yellow_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_YELLOW, SoundType.WOOD));
        LIME_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("lime_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_LIGHT_GREEN, SoundType.WOOD));
        GREEN_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("green_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_GREEN, SoundType.WOOD));
        CYAN_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("cyan_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_CYAN, SoundType.WOOD));
        LIGHT_BLUE_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("light_blue_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_LIGHT_BLUE, SoundType.WOOD));
        BLUE_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("blue_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_BLUE, SoundType.WOOD));
        PURPLE_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("purple_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_PURPLE, SoundType.WOOD));
        MAGENTA_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("magenta_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_MAGENTA, SoundType.WOOD));
        PINK_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("pink_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_PINK, SoundType.WOOD));
        BROWN_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("brown_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_BROWN, SoundType.WOOD));
        WHITE_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("white_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.SNOW, SoundType.WOOD));
        LIGHT_GRAY_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("light_gray_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_LIGHT_GRAY, SoundType.WOOD));
        GRAY_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("gray_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_GRAY, SoundType.WOOD));
        BLACK_PAINTED_PLANKS = BlockRegistry.registerDefaultBlock("black_painted_planks", () -> BlockRegistry.woodPlanks(MapColor.COLOR_BLACK, SoundType.WOOD));
        //STAIRS
        RED_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("red_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_RED, SoundType.WOOD));
        ORANGE_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("orange_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_ORANGE, SoundType.WOOD));
        YELLOW_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("yellow_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_YELLOW, SoundType.WOOD));
        LIME_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("lime_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_LIGHT_GREEN, SoundType.WOOD));
        GREEN_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("green_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_GREEN, SoundType.WOOD));
        CYAN_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("cyan_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_CYAN, SoundType.WOOD));
        LIGHT_BLUE_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("light_blue_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_LIGHT_BLUE, SoundType.WOOD));
        BLUE_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("blue_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_BLUE, SoundType.WOOD));
        PURPLE_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("purple_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_PURPLE, SoundType.WOOD));
        MAGENTA_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("magenta_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_MAGENTA, SoundType.WOOD));
        PINK_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("pink_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_PINK, SoundType.WOOD));
        BROWN_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("brown_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_BROWN, SoundType.WOOD));
        WHITE_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("white_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.SNOW, SoundType.WOOD));
        LIGHT_GRAY_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("light_gray_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_LIGHT_GRAY, SoundType.WOOD));
        GRAY_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("gray_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_GRAY, SoundType.WOOD));
        BLACK_PAINTED_STAIRS = BlockRegistry.registerDefaultBlock("black_painted_stairs", () -> BlockRegistry.woodStairs(MapColor.COLOR_BLACK, SoundType.WOOD));
        //SLABS
        RED_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("red_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_RED, SoundType.WOOD));
        ORANGE_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("orange_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_ORANGE, SoundType.WOOD));
        YELLOW_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("yellow_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_YELLOW, SoundType.WOOD));
        LIME_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("lime_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_LIGHT_GREEN, SoundType.WOOD));
        GREEN_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("green_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_GREEN, SoundType.WOOD));
        CYAN_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("cyan_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_CYAN, SoundType.WOOD));
        LIGHT_BLUE_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("light_blue_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_LIGHT_BLUE, SoundType.WOOD));
        BLUE_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("blue_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_BLUE, SoundType.WOOD));
        PURPLE_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("purple_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_PURPLE, SoundType.WOOD));
        MAGENTA_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("magenta_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_MAGENTA, SoundType.WOOD));
        PINK_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("pink_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_PINK, SoundType.WOOD));
        BROWN_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("brown_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_BROWN, SoundType.WOOD));
        WHITE_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("white_painted_slab", () -> BlockRegistry.woodSlab(MapColor.SNOW, SoundType.WOOD));
        LIGHT_GRAY_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("light_gray_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_LIGHT_GRAY, SoundType.WOOD));
        GRAY_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("gray_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_GRAY, SoundType.WOOD));
        BLACK_PAINTED_SLAB = BlockRegistry.registerDefaultBlock("black_painted_slab", () -> BlockRegistry.woodSlab(MapColor.COLOR_BLACK, SoundType.WOOD));

        /*-----------------NETHER_BLOCKS-----------------*/
        //NETHER_STONES
        BLACKSTONE_CLUSTER = BlockRegistry.registerDefaultBlock("blackstone_cluster", () -> new RockPileBlock(BlockBehaviour.Properties.of().strength(0.6F).sound(SoundType.NETHERRACK)));
        OVERGROWN_BONE_BLOCK = BlockRegistry.registerDefaultBlock("overgrown_bone_block", () ->  new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BONE_BLOCK)));
        //BRIMSPROUT_BLOCKS
        BRIMSPROUT_NYLIUM = BlockRegistry.registerDefaultBlock("brimsprout_nylium", () -> new RuNyliumBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.SCULK_SENSOR), RuNetherFeatures.BRIMSPROUT_NYLIUM_BONEMEAL));
        BRIMSPROUT = BlockRegistry.registerDefaultBlock("brimsprout", () -> new BrimPlantBlock(BlockBehaviour.Properties.of().replaceable().noCollission().instabreak().sound(SoundType.SCULK).offsetType(BlockBehaviour.OffsetType.XYZ)));
        //COBALT_BLOCKS
        COBALT_EARLIGHT = BlockRegistry.registerDefaultBlock("cobalt_earlight", () -> new RuNetherPlantBlock(BlockBehaviour.Properties.of().replaceable().noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 9)));
        TALL_COBALT_EARLIGHT = BlockRegistry.registerDefaultBlock("tall_cobalt_earlight", () -> new RuNetherDoublePlantBlock(BlockBehaviour.Properties.of().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 13)));
        COBALT_NYLIUM = BlockRegistry.registerDefaultBlock("cobalt_nylium", () -> new RuBlackstoneNyliumBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM), RuNetherFeatures.COBALT_NYLIUM_BONEMEAL));
        COBALT_OBSIDIAN = BlockRegistry.registerDefaultBlock("cobalt_obsidian", () -> new CobaltObsidianBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
        COBALT_ROOTS = BlockRegistry.registerDefaultBlock("cobalt_roots", () -> new RuCobaltPlantBlock(BlockBehaviour.Properties.of().replaceable().noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        HANGING_EARLIGHT = RegionsUnexploredMod.BLOCK_REGISTRY.register("hanging_earlight", () -> new HangingEarlightBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).randomTicks().noCollission().instabreak().sound(SoundType.WEEPING_VINES).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 14)));
        HANGING_EARLIGHT_PLANT = RegionsUnexploredMod.BLOCK_REGISTRY.register("hanging_earlight_plant", () -> new HangingEarlightPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).noCollission().instabreak().sound(SoundType.WEEPING_VINES)));
        //GLISTERING_BLOCKS
        GLISTERING_IVY = BlockRegistry.registerDefaultBlock("glistering_ivy", () -> new GlisteringIvyBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).randomTicks().noCollission().instabreak().sound(SoundType.WEEPING_VINES).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15)));
        GLISTERING_IVY_PLANT = RegionsUnexploredMod.BLOCK_REGISTRY.register("glistering_ivy_plant", () -> new GlisteringIvyPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).noCollission().instabreak().sound(SoundType.WEEPING_VINES)));
        GLISTERING_NYLIUM = BlockRegistry.registerDefaultBlock("glistering_nylium", () -> new RuNyliumBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM), RuNetherFeatures.GLISTERING_NYLIUM_BONEMEAL));
        GLISTERING_SPROUT = BlockRegistry.registerDefaultBlock("glistering_sprout", () -> new RuNetherPlantBlock(BlockBehaviour.Properties.of().replaceable().noCollission().instabreak().sound(SoundType.TWISTING_VINES).offsetType(BlockBehaviour.OffsetType.XZ)));
        GLISTERING_FERN = BlockRegistry.registerDefaultBlock("glistering_fern", () -> new RuNetherPlantBlock(BlockBehaviour.Properties.ofFullCopy(GLISTERING_SPROUT.get())));
        GLISTERING_BLOOM = BlockRegistry.registerDefaultBlock("glistering_bloom", () -> new RuNetherPlantBlock(BlockBehaviour.Properties.ofFullCopy(GLISTERING_SPROUT.get())));
        GLISTERING_WART = BlockRegistry.registerDefaultBlock("glistering_wart", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM)));
        GLISTER_BULB = BlockRegistry.registerDefaultBlock("glister_bulb", () -> new RuNetherDoublePlantBlock(BlockBehaviour.Properties.of().replaceable().noCollission().instabreak().sound(SoundType.NETHER_WART).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 13)));
        GLISTER_SPIRE = BlockRegistry.registerDefaultBlock("glister_spire", () -> new RuNetherDoublePlantBlock(BlockBehaviour.Properties.of().replaceable().noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 5)));
        //MYCOTOXIC_BLOCKS
        MYCOTOXIC_MUSHROOMS = BlockRegistry.registerDefaultBlock("mycotoxic_mushrooms", () -> new NetherGroundCoverBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).noCollission().sound(SoundType.SHROOMLIGHT).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel((state) -> 3 + 3 * state.getValue(NetherGroundCoverBlock.AMOUNT))));
        MYCOTOXIC_DAISY = BlockRegistry.registerDefaultBlock("mycotoxic_daisy", () -> new RuNetherDoublePlantBlock(BlockBehaviour.Properties.of().replaceable().noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 4)));
        MYCOTOXIC_GRASS = BlockRegistry.registerDefaultBlock("mycotoxic_grass", () -> new RuNetherPlantBlock(BlockBehaviour.Properties.of().replaceable().noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        MYCOTOXIC_NYLIUM = BlockRegistry.registerDefaultBlock("mycotoxic_moss", () -> new RuNyliumBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM), RuNetherFeatures.MYCOTOXIC_NYLIUM_BONEMEAL));
    }
}
