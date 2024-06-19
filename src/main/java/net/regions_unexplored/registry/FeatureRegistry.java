package net.regions_unexplored.registry;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.world.level.feature.*;
import net.regions_unexplored.world.level.feature.bioshroom.GiantBlueBioshroomFeature;
import net.regions_unexplored.world.level.feature.bioshroom.GiantGreenBioshroomFeature;
import net.regions_unexplored.world.level.feature.bioshroom.GiantPinkBioshroomFeature;
import net.regions_unexplored.world.level.feature.bioshroom.GiantYellowBioshroomFeature;
import net.regions_unexplored.world.level.feature.configuration.*;
import net.regions_unexplored.world.level.feature.tree.*;
import net.regions_unexplored.world.level.feature.tree.nether.BrimWillowFeature;
import net.regions_unexplored.world.level.feature.tree.nether.TallBrimWillowFeature;

public class FeatureRegistry {
    //BIOSHROOMS
    public static RegistryObject<Feature> GIANT_BLUE_BIOSHROOM;
    public static RegistryObject<Feature> GIANT_GREEN_BIOSHROOM;
    public static RegistryObject<Feature> GIANT_PINK_BIOSHROOM;
    public static RegistryObject<Feature> GIANT_YELLOW_BIOSHROOM;
    public static RegistryObject<Feature> SMALL_YELLOW_BIOSHROOM;
    //TREES
    public static RegistryObject<Feature> ASHEN_TREE;
    public static RegistryObject<Feature> ASPEN_TREE;
    public static RegistryObject<Feature> BAMBOO_TREE;
    public static RegistryObject<Feature> MEGA_BAOBAB_TREE;
    public static RegistryObject<Feature> ULTRA_BAOBAB_TREE;
    public static RegistryObject<Feature> BLACKWOOD_TREE;
    public static RegistryObject<Feature> COBALT_TREE;
    public static RegistryObject<Feature> CYPRESS_TREE;
    public static RegistryObject<Feature> DEAD_TREE;
    public static RegistryObject<Feature> SMALL_EUCALYPTUS_TREE;
    public static RegistryObject<Feature> EUCALYPTUS_TREE;
    public static RegistryObject<Feature> GIANT_CYPRESS_TREE;
    public static RegistryObject<Feature> LARCH_TREE;
    public static RegistryObject<Feature> LARGE_JOSHUA_TREE;
    public static RegistryObject<Feature> KAPOK_TREE;
    public static RegistryObject<Feature> MAPLE_TREE;
    public static RegistryObject<Feature> MEDIUM_JOSHUA_TREE;
    public static RegistryObject<Feature> PALM_TREE;
    public static RegistryObject<Feature> LUSH_PINE_TREE;
    public static RegistryObject<Feature> PINE_TREE;
    public static RegistryObject<Feature> SMALL_JOSHUA_TREE;
    public static RegistryObject<Feature> SMALL_OAK_TREE;
    public static RegistryObject<Feature> STRIPPED_PINE_TREE;
    public static RegistryObject<Feature> REDWOOD_TREE;
    public static RegistryObject<Feature> SAGUARO_CACTUS;
    public static RegistryObject<Feature> SAKURA_TREE;
    public static RegistryObject<Feature> LARGE_SOCOTRA_TREE;
    public static RegistryObject<Feature> SMALL_SOCOTRA_TREE;
    public static RegistryObject<Feature> SUPER_REDWOOD_TREE;
    public static RegistryObject<Feature> ULTRA_REDWOOD_TREE;
    //CAVE
    public static RegistryObject<Feature> POINTED_REDSTONE;
    public static RegistryObject<Feature> LARGE_POINTED_REDSTONE;
    public static RegistryObject<Feature> POINTED_REDSTONE_CLUSTER;
    public static RegistryObject<Feature> HANGING_PRISMARITE;
    public static RegistryObject<Feature> DROPLEAF;
    public static RegistryObject<Feature> BASALT_BLOB;
    public static RegistryObject<Feature> ASH_VENT;
    public static RegistryObject<Feature> LAVA_FALL;
    public static RegistryObject<Feature> OVERWORLD_LAVA_DELTA;
    //NETHER
    public static RegistryObject<Feature> BRIM_WILLOW;
    public static RegistryObject<Feature> TALL_BRIM_WILLOW;
    //VEGETATION
    public static RegistryObject<Feature> SHRUB;
    public static RegistryObject<Feature> TREE_SHRUB;
    public static RegistryObject<Feature> GIANT_LILY;
    //DECORATION
    public static RegistryObject<Feature> ICICLE_UP;
    public static RegistryObject<Feature> AIR_MULTIFACE_GROWTH;
    public static RegistryObject<Feature> FALLEN_BLOB_TREE;
    public static RegistryObject<Feature> FALLEN_SNOW_TREE;
    public static RegistryObject<Feature> SMOULDERING_DIRT;
    public static RegistryObject<Feature> MEADOW_ROCK;
    public static RegistryObject<Feature> ROCK;
    public static RegistryObject<Feature> SPIRE;
    //AQUATIC
    public static RegistryObject<Feature> MARSH;
    public static RegistryObject<Feature> WATER_EDGE;
    public static RegistryObject<Feature> FEN_CATTAIL;
    public static RegistryObject<Feature> WATER_CATTAIL;
    public static RegistryObject<Feature> ROCK_PILLAR;
    public static RegistryObject<Feature> TALL_HYACINTH_STOCK;

    public static RegistryObject<Feature> FLOURAMINE;
    public static RegistryObject<Feature> FLOURAGRASS;

    public static RegistryObject<Feature> HYACINTH_PLANTS;
    public static RegistryObject<Feature> OCEAN_ROCK;
    //NETHER
    public static RegistryObject<Feature> NETHER_ROCK;
    public static RegistryObject<Feature> GLISTERING_IVY;
    public static RegistryObject<Feature> HANGING_EARLIGHT;
    public static RegistryObject<Feature> OBSIDIAN_SPIRE;

    public static void addFeatures() {
        //BIOSHROOMS
        GIANT_BLUE_BIOSHROOM = RegionsUnexploredMod.FEATURE_REGISTRY.register("giant_blue_bioshroom", () -> new GiantBlueBioshroomFeature(GiantBioshroomConfiguration.CODEC));
        GIANT_GREEN_BIOSHROOM = RegionsUnexploredMod.FEATURE_REGISTRY.register("giant_green_bioshroom", () -> new GiantGreenBioshroomFeature(GiantBioshroomConfiguration.CODEC));
        GIANT_PINK_BIOSHROOM = RegionsUnexploredMod.FEATURE_REGISTRY.register("giant_pink_bioshroom", () -> new GiantPinkBioshroomFeature(GiantBioshroomConfiguration.CODEC));
        GIANT_YELLOW_BIOSHROOM = RegionsUnexploredMod.FEATURE_REGISTRY.register("giant_yellow_bioshroom", () -> new GiantYellowBioshroomFeature(GiantBioshroomConfiguration.CODEC));
        SMALL_YELLOW_BIOSHROOM = RegionsUnexploredMod.FEATURE_REGISTRY.register("small_yellow_bioshroom", () -> new YellowBioshroomShrubFeature(NoneFeatureConfiguration.CODEC));
        //TREES
        ASHEN_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("ashen_tree", () -> new AshenTreeFeature(RuTreeConfiguration.CODEC));
        ASPEN_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("aspen_tree", () -> new AspenTreeFeature(RuTreeConfiguration.CODEC));
        BAMBOO_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("bamboo_tree", () -> new BambooTreeFeature(RuTreeConfiguration.CODEC));
        BLACKWOOD_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("blackwood_tree", () -> new BlackwoodTreeFeature(RuTreeConfiguration.CODEC));
        COBALT_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("cobalt_tree", () -> new CobaltShrubFeature(NoneFeatureConfiguration.CODEC));
        CYPRESS_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("cypress_tree", () -> new CypressTreeFeature(RuTreeConfiguration.CODEC));
        DEAD_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("dead_tree", () -> new DeadTreeFeature(RuTreeConfiguration.CODEC));
        SMALL_EUCALYPTUS_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("small_eucalyptus_tree", () -> new SmallEucalyptusTreeFeature(RuTreeConfiguration.CODEC));
        EUCALYPTUS_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("eucalyptus_tree", () -> new EucalyptusTreeFeature(RuTreeConfiguration.CODEC));
        GIANT_CYPRESS_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("giant_cypress_tree", () -> new GiantCypressTreeFeature(RuTreeConfiguration.CODEC));
        LARCH_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("larch_tree", () -> new LarchTreeFeature(RuTreeConfiguration.CODEC));
        LARGE_JOSHUA_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("large_joshua_tree", () -> new LargeJoshuaTreeFeature(NoneFeatureConfiguration.CODEC));
        KAPOK_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("kapok_tree", () -> new KapokTreeFeature(RuTreeConfiguration.CODEC));
        MAPLE_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("maple_tree", () -> new MapleTreeFeature(RuTreeConfiguration.CODEC));
        MEDIUM_JOSHUA_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("medium_joshua_tree", () -> new MediumJoshuaTreeFeature(NoneFeatureConfiguration.CODEC));
        PALM_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("palm_tree", () -> new PalmTreeFeature(RuTreeConfiguration.CODEC));
        LUSH_PINE_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("lush_pine_tree", () -> new LushPineTreeFeature(RuTreeConfiguration.CODEC));
        PINE_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("pine_tree", () -> new PineTreeFeature(RuTreeConfiguration.CODEC));
        SMALL_JOSHUA_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("small_joshua_tree", () -> new SmallJoshuaTreeFeature(RuTreeConfiguration.CODEC));
        SMALL_OAK_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("small_oak_tree", () -> new SmallOakTreeFeature(RuTreeConfiguration.CODEC));
        STRIPPED_PINE_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("stripped_pine_tree", () -> new StrippedPineTreeFeature(RuTreeConfiguration.CODEC));
        REDWOOD_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("redwood_tree", () -> new RedwoodTreeFeature(RuTreeConfiguration.CODEC));
        SAGUARO_CACTUS = RegionsUnexploredMod.FEATURE_REGISTRY.register("saguaro_cactus", () -> new SaguaroCactusFeature(RuTreeConfiguration.CODEC));
        SAKURA_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("sakura_tree", () -> new SakuraTreeFeature(RuTreeConfiguration.CODEC));
        LARGE_SOCOTRA_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("large_socotra_tree", () -> new LargeSocotraTreeFeature(RuTreeConfiguration.CODEC));
        SMALL_SOCOTRA_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("small_socotra_tree", () -> new SmallSocotraTreeFeature(NoneFeatureConfiguration.CODEC));
        SUPER_REDWOOD_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("super_redwood_tree", () -> new SuperRedwoodTreeFeature(RuTreeConfiguration.CODEC));
        ULTRA_REDWOOD_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("ultra_redwood_tree", () -> new UltraRedwoodTreeFeature(RuTreeConfiguration.CODEC));
        MEGA_BAOBAB_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("mega_baobab_tree", () -> new MegaBaobabTreeFeature(RuTreeConfiguration.CODEC));
        ULTRA_BAOBAB_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("ultra_baobab_tree", () -> new UltraBaobabTreeFeature(RuTreeConfiguration.CODEC));
        //CAVE
        POINTED_REDSTONE = RegionsUnexploredMod.FEATURE_REGISTRY.register("pointed_redstone", () -> new PointedRedstoneFeature(PointedRedstoneConfiguration.CODEC));
        LARGE_POINTED_REDSTONE = RegionsUnexploredMod.FEATURE_REGISTRY.register("large_pointed_redstone", () -> new LargePointedRedstoneFeature(LargePointedRedstoneConfiguration.CODEC));
        POINTED_REDSTONE_CLUSTER = RegionsUnexploredMod.FEATURE_REGISTRY.register("pointed_redstone_cluster", () -> new PointedRedstoneClusterFeature(PointedRedstoneClusterConfiguration.CODEC));
        HANGING_PRISMARITE = RegionsUnexploredMod.FEATURE_REGISTRY.register("hanging_prismarite", () -> new HangingPrismariteFeature(NoneFeatureConfiguration.CODEC));
        DROPLEAF = RegionsUnexploredMod.FEATURE_REGISTRY.register("dropleaf", () -> new DropleafFeature(NoneFeatureConfiguration.CODEC));
        BASALT_BLOB = RegionsUnexploredMod.FEATURE_REGISTRY.register("basalt_blob", () -> new BasaltBlobFeature(ColumnFeatureConfiguration.CODEC));
        ASH_VENT = RegionsUnexploredMod.FEATURE_REGISTRY.register("scorch_vent", () -> new AshVentFeature(NoneFeatureConfiguration.CODEC));
        LAVA_FALL = RegionsUnexploredMod.FEATURE_REGISTRY.register("lava_fall", () -> new LavaFallFeature(NoneFeatureConfiguration.CODEC));
        OVERWORLD_LAVA_DELTA = RegionsUnexploredMod.FEATURE_REGISTRY.register("overworld_lava_delta", () -> new LavaDeltaFeature(VegetationPatchConfiguration.CODEC));
        //NETHER
        BRIM_WILLOW = RegionsUnexploredMod.FEATURE_REGISTRY.register("brim_willow", () -> new BrimWillowFeature(NoneFeatureConfiguration.CODEC));
        TALL_BRIM_WILLOW = RegionsUnexploredMod.FEATURE_REGISTRY.register("tall_brim_willow", () -> new TallBrimWillowFeature(NoneFeatureConfiguration.CODEC));
        //VEGETATION
        SHRUB = RegionsUnexploredMod.FEATURE_REGISTRY.register("shrub", () -> new ShrubFeature(ShrubConfiguration.CODEC));
        TREE_SHRUB = RegionsUnexploredMod.FEATURE_REGISTRY.register("tree_shrub", () -> new TreeShrubFeature(RuTreeConfiguration.CODEC));
        GIANT_LILY = RegionsUnexploredMod.FEATURE_REGISTRY.register("giant_lily", () -> new GiantLilyPadFeature(NoneFeatureConfiguration.CODEC));
        //DECORATION
        ICICLE_UP = RegionsUnexploredMod.FEATURE_REGISTRY.register("icicle_up", () -> new FloorIcicleFeature(NoneFeatureConfiguration.CODEC));
        AIR_MULTIFACE_GROWTH = RegionsUnexploredMod.FEATURE_REGISTRY.register("air_multiface_growth", () -> new AirMultifaceGrowthFeature(MultifaceGrowthConfiguration.CODEC));
        FALLEN_BLOB_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("fallen_blob_tree", () -> new FallenBlobTreeFeature(FallenTreeConfiguration.CODEC));
        FALLEN_SNOW_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("fallen_snow_tree", () -> new FallenSnowTreeFeature(FallenTreeConfiguration.CODEC));
        SMOULDERING_DIRT = RegionsUnexploredMod.FEATURE_REGISTRY.register("smouldering_dirt", () -> new SmoulderingDirtFeature(NoneFeatureConfiguration.CODEC));
        MEADOW_ROCK = RegionsUnexploredMod.FEATURE_REGISTRY.register("meadow_rock", () -> new MeadowRockFeature(NoneFeatureConfiguration.CODEC));
        ROCK = RegionsUnexploredMod.FEATURE_REGISTRY.register("rock", () -> new RockFeature(NoneFeatureConfiguration.CODEC));
        SPIRE = RegionsUnexploredMod.FEATURE_REGISTRY.register("spire", () -> new IceSpireFeature(RuTreeConfiguration.CODEC));
        //AQUATIC
        MARSH = RegionsUnexploredMod.FEATURE_REGISTRY.register("marsh", () -> new MarshFeature(NoneFeatureConfiguration.CODEC));
        WATER_EDGE = RegionsUnexploredMod.FEATURE_REGISTRY.register("water_edge", () -> new WaterEdgeFeature(NoneFeatureConfiguration.CODEC));
        FEN_CATTAIL = RegionsUnexploredMod.FEATURE_REGISTRY.register("fen_cattail", () -> new FenCattailFeature(NoneFeatureConfiguration.CODEC));
        WATER_CATTAIL = RegionsUnexploredMod.FEATURE_REGISTRY.register("water_cattail", () -> new WaterCattailFeature(NoneFeatureConfiguration.CODEC));
        ROCK_PILLAR = RegionsUnexploredMod.FEATURE_REGISTRY.register("rock_pillar", () -> new RockPillarFeature(NoneFeatureConfiguration.CODEC));
        TALL_HYACINTH_STOCK = RegionsUnexploredMod.FEATURE_REGISTRY.register("tall_hyacinth_stock", () -> new HyacinthStockFeature(HyacinthStockConfiguration.CODEC));
        FLOURAMINE = RegionsUnexploredMod.FEATURE_REGISTRY.register("flouramine", () -> new FlouramineFeature(NoneFeatureConfiguration.CODEC));
        FLOURAGRASS = RegionsUnexploredMod.FEATURE_REGISTRY.register("flouragrass", () -> new FlouragrassFeature(ProbabilityFeatureConfiguration.CODEC));
        HYACINTH_PLANTS = RegionsUnexploredMod.FEATURE_REGISTRY.register("hyacinth_plants", () -> new HyacinthPlantsFeature(ProbabilityFeatureConfiguration.CODEC));
        OCEAN_ROCK = RegionsUnexploredMod.FEATURE_REGISTRY.register("ocean_rock", () -> new SeaRockFeature(SeaRockConfiguration.CODEC));
        //NETHER
        NETHER_ROCK = RegionsUnexploredMod.FEATURE_REGISTRY.register("nether_rock", () -> new NetherRockFeature(NoneFeatureConfiguration.CODEC));
        GLISTERING_IVY = RegionsUnexploredMod.FEATURE_REGISTRY.register("glistering_ivy", () -> new GlisteringIvyFeature(NoneFeatureConfiguration.CODEC));
        HANGING_EARLIGHT = RegionsUnexploredMod.FEATURE_REGISTRY.register("hanging_earlight", () -> new HangingEarlightFeature(NoneFeatureConfiguration.CODEC));
        OBSIDIAN_SPIRE = RegionsUnexploredMod.FEATURE_REGISTRY.register("obsidian_spire", () -> new ObsidianSpireFeature(NoneFeatureConfiguration.CODEC));
    }
}
