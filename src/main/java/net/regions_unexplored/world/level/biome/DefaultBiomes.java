package net.regions_unexplored.world.level.biome;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.regions_unexplored.config.RuCommonConfig;
import net.regions_unexplored.config.RuPrimaryRegionConfig;
import net.regions_unexplored.config.RuSecondaryRegionConfig;
import net.regions_unexplored.data.worldgen.biome.RuBiomes;

public class DefaultBiomes {
    //PRIMARY
    public static ResourceKey<Biome>[][] PRIMARY_MIDDLE_BIOMES = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {RuBiomes.FROZEN_TUNDRA,    RuBiomes.FROZEN_TUNDRA,         RuBiomes.FROZEN_PINE_TAIGA, RuBiomes.COLD_BOREAL_TAIGA, RuBiomes.COLD_BOREAL_TAIGA},
            /*COOL*/    {RuBiomes.PUMPKIN_FIELDS,   RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.MAPLE_FOREST,      RuBiomes.BOREAL_TAIGA,      RuBiomes.BOREAL_TAIGA},
            /*NEUTRAL*/ {RuBiomes.ORCHARD,          RuBiomes.SHRUBLAND,             RuBiomes.TEMPERATE_GROVE,   RuBiomes.PINE_TAIGA,        RuBiomes.BLACKWOOD_TAIGA},
            /*WARM*/    {RuBiomes.BARLEY_FIELDS,    RuBiomes.PRAIRIE,               RuBiomes.GRASSLAND,         RuBiomes.REDWOODS,          RuBiomes.REDWOODS},
            /*HOT*/     {RuBiomes.BAOBAB_SAVANNA,   RuBiomes.BAOBAB_SAVANNA,        RuBiomes.SAGUARO_DESERT,    RuBiomes.OUTBACK,           RuBiomes.EUCALYPTUS_FOREST}};

    public static ResourceKey<Biome>[][] PRIMARY_MIDDLE_BIOMES_VARIANT = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {RuBiomes.FROZEN_PINE_TAIGA,     RuBiomes.FROZEN_TUNDRA,         RuBiomes.FROZEN_TUNDRA,    RuBiomes.COLD_BOREAL_TAIGA, RuBiomes.SPIRES},
            /*COOL*/    {RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.MAPLE_FOREST,     RuBiomes.BOREAL_TAIGA,      RuBiomes.GOLDEN_BOREAL_TAIGA},
            /*NEUTRAL*/ {RuBiomes.ORCHARD,               RuBiomes.SHRUBLAND,             RuBiomes.TEMPERATE_GROVE,  RuBiomes.PINE_TAIGA,        RuBiomes.BLACKWOOD_TAIGA},
            /*WARM*/    {RuBiomes.PRAIRIE,               RuBiomes.DECIDUOUS_FOREST,      RuBiomes.GRASSLAND,        RuBiomes.REDWOODS,          RuBiomes.SPARSE_REDWOODS},
            /*HOT*/     {RuBiomes.BAOBAB_SAVANNA,        RuBiomes.BAOBAB_SAVANNA,        RuBiomes.SAGUARO_DESERT,   RuBiomes.OUTBACK,           RuBiomes.EUCALYPTUS_FOREST}};

    public static ResourceKey<Biome>[][] PRIMARY_PLATEAU_BIOMES = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {RuBiomes.ICY_HEIGHTS,           RuBiomes.ICY_HEIGHTS,           RuBiomes.ICY_HEIGHTS,      RuBiomes.ICY_HEIGHTS,       RuBiomes.COLD_BOREAL_TAIGA},
            /*COOL*/    {RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.MAPLE_FOREST,     RuBiomes.BOREAL_TAIGA,      RuBiomes.BOREAL_TAIGA},
            /*NEUTRAL*/ {RuBiomes.HIGHLAND_FIELDS,       RuBiomes.HIGHLAND_FIELDS,       RuBiomes.HIGHLAND_FIELDS,  RuBiomes.HIGHLAND_FIELDS,   RuBiomes.BLACKWOOD_TAIGA},
            /*WARM*/    {RuBiomes.BARLEY_FIELDS,         RuBiomes.DECIDUOUS_FOREST,      RuBiomes.DECIDUOUS_FOREST, RuBiomes.REDWOODS,          RuBiomes.REDWOODS},
            /*HOT*/     {RuBiomes.STEPPE,                RuBiomes.STEPPE,                RuBiomes.SAGUARO_DESERT,   RuBiomes.EUCALYPTUS_FOREST, RuBiomes.EUCALYPTUS_FOREST}};

    public static ResourceKey<Biome>[][] PRIMARY_PLATEAU_BIOMES_VARIANT = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {RuBiomes.ICY_HEIGHTS,           RuBiomes.ICY_HEIGHTS,           RuBiomes.ICY_HEIGHTS,      RuBiomes.ICY_HEIGHTS,       RuBiomes.SPIRES},
            /*COOL*/    {RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.MAPLE_FOREST,     RuBiomes.BOREAL_TAIGA,      RuBiomes.GOLDEN_BOREAL_TAIGA},
            /*NEUTRAL*/ {RuBiomes.ORCHARD,               RuBiomes.HIGHLAND_FIELDS,       RuBiomes.TEMPERATE_GROVE,  RuBiomes.PINE_TAIGA,        RuBiomes.BLACKWOOD_TAIGA},
            /*WARM*/    {RuBiomes.DECIDUOUS_FOREST,      RuBiomes.DECIDUOUS_FOREST,      RuBiomes.DECIDUOUS_FOREST, RuBiomes.REDWOODS,          RuBiomes.SPARSE_REDWOODS},
            /*HOT*/     {RuBiomes.STEPPE,                RuBiomes.STEPPE,                RuBiomes.SAGUARO_DESERT,   RuBiomes.EUCALYPTUS_FOREST, RuBiomes.EUCALYPTUS_FOREST}};

    public static ResourceKey<Biome>[][] PRIMARY_SHATTERED_BIOMES = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {RuBiomes.ICY_HEIGHTS,      RuBiomes.ICY_HEIGHTS,      RuBiomes.ICY_HEIGHTS,      RuBiomes.ICY_HEIGHTS,       RuBiomes.ICY_HEIGHTS},
            /*COOL*/    {RuBiomes.TOWERING_CLIFFS,  RuBiomes.TOWERING_CLIFFS,  RuBiomes.TOWERING_CLIFFS,  RuBiomes.TOWERING_CLIFFS,   RuBiomes.TOWERING_CLIFFS},
            /*NEUTRAL*/ {RuBiomes.TOWERING_CLIFFS,  RuBiomes.TOWERING_CLIFFS,  RuBiomes.TOWERING_CLIFFS,  RuBiomes.TOWERING_CLIFFS,   RuBiomes.TOWERING_CLIFFS},
            /*WARM*/    {RuBiomes.BARLEY_FIELDS,    RuBiomes.DECIDUOUS_FOREST, RuBiomes.DECIDUOUS_FOREST, RuBiomes.SPARSE_REDWOODS,   RuBiomes.SPARSE_REDWOODS},
            /*HOT*/     {RuBiomes.STEPPE,           RuBiomes.STEPPE,           RuBiomes.SAGUARO_DESERT,   RuBiomes.EUCALYPTUS_FOREST, RuBiomes.EUCALYPTUS_FOREST}};

    public static ResourceKey<Biome>[][] PRIMARY_RIVER_BIOMES = new ResourceKey[][]{
            //-----------ARID,                DRY,                 NEUTRAL,                 WET,                     HUMID
            /*ICY*/     {Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER,     Biomes.FROZEN_RIVER,     RuBiomes.COLD_RIVER},
            /*COOL*/    {RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.MUDDY_RIVER,    RuBiomes.MUDDY_RIVER,    RuBiomes.MUDDY_RIVER},
            /*NEUTRAL*/ {Biomes.RIVER,        Biomes.RIVER,        Biomes.RIVER,            Biomes.RIVER,            RuBiomes.BLACKWOOD_TAIGA},
            /*WARM*/    {Biomes.RIVER,        Biomes.RIVER,        Biomes.RIVER,            Biomes.RIVER,            Biomes.RIVER},
            /*HOT*/     {Biomes.RIVER,        Biomes.RIVER,        RuBiomes.TROPICAL_RIVER, RuBiomes.TROPICAL_RIVER, RuBiomes.TROPICAL_RIVER}};

    public static ResourceKey<Biome>[][] PRIMARY_RIVER_BIOMES_VARIANT = new ResourceKey[][]{
            //-----------ARID,                DRY,                 NEUTRAL,                 WET,                     HUMID
            /*ICY*/     {Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER,     Biomes.FROZEN_RIVER,     RuBiomes.COLD_RIVER},
            /*COOL*/    {RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.MUDDY_RIVER,    RuBiomes.MUDDY_RIVER,    RuBiomes.MUDDY_RIVER},
            /*NEUTRAL*/ {Biomes.RIVER,        Biomes.RIVER,        Biomes.RIVER,            Biomes.RIVER,            RuBiomes.BLACKWOOD_TAIGA},
            /*WARM*/    {Biomes.RIVER,        Biomes.RIVER,        Biomes.RIVER,            Biomes.RIVER,            Biomes.RIVER},
            /*HOT*/     {Biomes.RIVER,        Biomes.RIVER,        RuBiomes.TROPICAL_RIVER, RuBiomes.TROPICAL_RIVER, RuBiomes.TROPICAL_RIVER}};

    public static ResourceKey<Biome>[][] PRIMARY_SWAMP_BIOMES = new ResourceKey[][]{
            //-----------ARID,                      DRY,                 NEUTRAL,             WET,                 HUMID
            /*ICY*/     {RuBiomes.SPIRES,           RuBiomes.SPIRES,     RuBiomes.SPIRES,     RuBiomes.SPIRES,     RuBiomes.SPIRES},
            /*COOL*/    {RuBiomes.FEN,              RuBiomes.FEN,        RuBiomes.FEN,        RuBiomes.FEN,        RuBiomes.FEN},
            /*NEUTRAL*/ {RuBiomes.OLD_GROWTH_BAYOU, RuBiomes.BAYOU,      RuBiomes.BAYOU,      RuBiomes.BAYOU,      RuBiomes.OLD_GROWTH_BAYOU},
            /*WARM*/    {RuBiomes.MARSH,            RuBiomes.MARSH,      RuBiomes.MARSH,      RuBiomes.MARSH,      RuBiomes.MARSH},
            /*HOT*/     {RuBiomes.FUNGAL_FEN,       RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN}};


    public static ResourceKey<Biome>[][] PRIMARY_OCEAN_BIOMES = new ResourceKey[][]{
            //----------- ARID,                    DRY,                    NEUTRAL,           WET,                        HUMID
            /*DEEP*/     {RuBiomes.HYACINTH_DEEPS, Biomes.DEEP_COLD_OCEAN, Biomes.DEEP_OCEAN, RuBiomes.CHARGED_DEPTHS, Biomes.WARM_OCEAN},
            /*NORM*/     {Biomes.FROZEN_OCEAN,     Biomes.COLD_OCEAN,      Biomes.OCEAN,      Biomes.LUKEWARM_OCEAN,      RuBiomes.ROCKY_REEF}};

    public static ResourceKey<Biome>[] PRIMARY_ISLAND_BIOMES = new ResourceKey[]       {RuBiomes.ALPHA_GROVE, RuBiomes.ALPHA_GROVE, RuBiomes.ASHEN_WOODLAND, RuBiomes.TROPICS, RuBiomes.TROPICS};

    public static ResourceKey<Biome>[] PRIMARY_BEACH_BIOMES = new ResourceKey[]        {Biomes.SNOWY_BEACH, RuBiomes.GRAVEL_BEACH, RuBiomes.GRASSY_BEACH, RuBiomes.GRASSY_BEACH, Biomes.BEACH};

    public static ResourceKey<Biome>[] PRIMARY_STONE_SHORE_BIOMES = new ResourceKey[]  {Biomes.STONY_SHORE, RuBiomes.CHALK_CLIFFS};

    public static ResourceKey<Biome> PRIMARY_SHATTERED_CLIFF_BIOME =                    RuBiomes.TOWERING_CLIFFS;

    public static ResourceKey<Biome>[] PRIMARY_CAVE_BIOMES = new ResourceKey[]         {Biomes.LUSH_CAVES, Biomes.DRIPSTONE_CAVES, Biomes.DEEP_DARK, RuBiomes.BIOSHROOM_CAVES, RuBiomes.ANCIENT_DELTA, RuBiomes.PRISMACHASM, RuBiomes.REDSTONE_CAVES, RuBiomes.SCORCHING_CAVES};

    public static ResourceKey<Biome>[] PRIMARY_PEAK_BIOMES = new ResourceKey[]         {Biomes.FROZEN_PEAKS, Biomes.JAGGED_PEAKS, RuBiomes.MOUNTAINS, Biomes.STONY_PEAKS, RuBiomes.ARID_MOUNTAINS};

    public static ResourceKey<Biome>[] PRIMARY_PEAK_BIOMES_VARIANT = new ResourceKey[] {Biomes.JAGGED_PEAKS, RuBiomes.MOUNTAINS, RuBiomes.MOUNTAINS, Biomes.STONY_PEAKS, RuBiomes.ARID_MOUNTAINS};

    public static ResourceKey<Biome>[] PRIMARY_SLOPE_BIOMES = new ResourceKey[]        {Biomes.SNOWY_SLOPES, Biomes.GROVE, RuBiomes.PINE_SLOPES, RuBiomes.DECIDUOUS_FOREST, RuBiomes.EUCALYPTUS_FOREST};

    public static ResourceKey<Biome>[] PRIMARY_SLOPE_BIOMES_VARIANT = new ResourceKey[]{RuBiomes.COLD_DECIDUOUS_FOREST, RuBiomes.PINE_SLOPES, RuBiomes.PINE_SLOPES, RuBiomes.DECIDUOUS_FOREST, RuBiomes.EUCALYPTUS_FOREST};




    //SECONDARY
    public static ResourceKey<Biome>[][] SECONDARY_MIDDLE_BIOMES = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {RuBiomes.FROZEN_TUNDRA, RuBiomes.FROZEN_TUNDRA,       RuBiomes.FROZEN_PINE_TAIGA, RuBiomes.COLD_BOREAL_TAIGA, RuBiomes.COLD_BOREAL_TAIGA},
            /*COOL*/    {RuBiomes.POPPY_FIELDS,  RuBiomes.SILVER_BIRCH_FOREST, RuBiomes.MAPLE_FOREST,      RuBiomes.BOREAL_TAIGA,      RuBiomes.BOREAL_TAIGA},
            /*NEUTRAL*/ {RuBiomes.FLOWER_FIELDS, RuBiomes.ROCKY_MEADOW,        RuBiomes.WILLOW_FOREST,     RuBiomes.CLOVER_PLAINS,     RuBiomes.BLACKWOOD_TAIGA},
            /*WARM*/    {RuBiomes.MAUVE_HILLS,   RuBiomes.ROCKY_MEADOW,        RuBiomes.BAMBOO_FOREST,     RuBiomes.REDWOODS,          RuBiomes.REDWOODS},
            /*HOT*/     {RuBiomes.DRY_BUSHLAND,  RuBiomes.DRY_BUSHLAND,        RuBiomes.JOSHUA_DESERT,     RuBiomes.RAINFOREST,        RuBiomes.RAINFOREST}};

    public static ResourceKey<Biome>[][] SECONDARY_MIDDLE_BIOMES_VARIANT = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {RuBiomes.FROZEN_PINE_TAIGA, RuBiomes.FROZEN_TUNDRA,       RuBiomes.FROZEN_TUNDRA,     RuBiomes.COLD_BOREAL_TAIGA, RuBiomes.SPIRES},
            /*COOL*/    {RuBiomes.POPPY_FIELDS,      RuBiomes.SILVER_BIRCH_FOREST, RuBiomes.MAPLE_FOREST,      RuBiomes.BOREAL_TAIGA,      RuBiomes.GOLDEN_BOREAL_TAIGA},
            /*NEUTRAL*/ {RuBiomes.FLOWER_FIELDS,     RuBiomes.ROCKY_MEADOW,        RuBiomes.MAGNOLIA_WOODLAND, RuBiomes.CLOVER_PLAINS,     RuBiomes.BLACKWOOD_TAIGA},
            /*WARM*/    {RuBiomes.MAUVE_HILLS,       RuBiomes.ROCKY_MEADOW,        RuBiomes.BAMBOO_FOREST,     RuBiomes.REDWOODS,          RuBiomes.SPARSE_REDWOODS},
            /*HOT*/     {RuBiomes.DRY_BUSHLAND,      RuBiomes.DRY_BUSHLAND,        RuBiomes.JOSHUA_DESERT,     RuBiomes.RAINFOREST,        RuBiomes.SPARSE_RAINFOREST}};

    public static ResourceKey<Biome>[][] SECONDARY_PLATEAU_BIOMES = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {RuBiomes.ICY_HEIGHTS,     RuBiomes.ICY_HEIGHTS,         RuBiomes.ICY_HEIGHTS,       RuBiomes.ICY_HEIGHTS,       RuBiomes.COLD_BOREAL_TAIGA},
            /*COOL*/    {RuBiomes.POPPY_FIELDS,    RuBiomes.SILVER_BIRCH_FOREST, RuBiomes.MAPLE_FOREST,      RuBiomes.BOREAL_TAIGA,      RuBiomes.BOREAL_TAIGA},
            /*NEUTRAL*/ {RuBiomes.HIGHLAND_FIELDS, RuBiomes.HIGHLAND_FIELDS,     RuBiomes.HIGHLAND_FIELDS,   RuBiomes.HIGHLAND_FIELDS,   RuBiomes.BLACKWOOD_TAIGA},
            /*WARM*/    {RuBiomes.MAUVE_HILLS,     RuBiomes.MAGNOLIA_WOODLAND,   RuBiomes.MAGNOLIA_WOODLAND, RuBiomes.MAGNOLIA_WOODLAND, RuBiomes.REDWOODS},
            /*HOT*/     {RuBiomes.STEPPE,          RuBiomes.STEPPE,              RuBiomes.JOSHUA_DESERT,     RuBiomes.RAINFOREST,        RuBiomes.RAINFOREST}};

    public static ResourceKey<Biome>[][] SECONDARY_PLATEAU_BIOMES_VARIANT = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {RuBiomes.ICY_HEIGHTS,     RuBiomes.ICY_HEIGHTS,         RuBiomes.ICY_HEIGHTS,       RuBiomes.ICY_HEIGHTS,       RuBiomes.SPIRES},
            /*COOL*/    {RuBiomes.POPPY_FIELDS,    RuBiomes.SILVER_BIRCH_FOREST, RuBiomes.MAPLE_FOREST,      RuBiomes.BOREAL_TAIGA,      RuBiomes.GOLDEN_BOREAL_TAIGA},
            /*NEUTRAL*/ {RuBiomes.HIGHLAND_FIELDS, RuBiomes.HIGHLAND_FIELDS,     RuBiomes.MAGNOLIA_WOODLAND, RuBiomes.CLOVER_PLAINS,     RuBiomes.BLACKWOOD_TAIGA},
            /*WARM*/    {RuBiomes.MAUVE_HILLS,     RuBiomes.MAGNOLIA_WOODLAND,   RuBiomes.MAGNOLIA_WOODLAND, RuBiomes.MAGNOLIA_WOODLAND, RuBiomes.SPARSE_REDWOODS},
            /*HOT*/     {RuBiomes.STEPPE,          RuBiomes.STEPPE,              RuBiomes.JOSHUA_DESERT,     RuBiomes.RAINFOREST,        RuBiomes.SPARSE_RAINFOREST}};

    public static ResourceKey<Biome>[][] SECONDARY_SHATTERED_BIOMES = new ResourceKey[][]{
            //-----------ARID,                        DRY,                         NEUTRAL,                     WET,                        HUMID
            /*ICY*/     {RuBiomes.ICY_HEIGHTS,        RuBiomes.ICY_HEIGHTS,        RuBiomes.ICY_HEIGHTS,        RuBiomes.ICY_HEIGHTS,        RuBiomes.ICY_HEIGHTS},
            /*COOL*/    {RuBiomes.TOWERING_CLIFFS,    RuBiomes.TOWERING_CLIFFS,    RuBiomes.TOWERING_CLIFFS,    RuBiomes.TOWERING_CLIFFS,    RuBiomes.TOWERING_CLIFFS},
            /*NEUTRAL*/ {RuBiomes.TOWERING_CLIFFS,    RuBiomes.TOWERING_CLIFFS,    RuBiomes.TOWERING_CLIFFS,    RuBiomes.TOWERING_CLIFFS,    RuBiomes.TOWERING_CLIFFS},
            /*WARM*/    {RuBiomes.MAGNOLIA_WOODLAND,  RuBiomes.MAGNOLIA_WOODLAND,  RuBiomes.MAGNOLIA_WOODLAND,  RuBiomes.MAGNOLIA_WOODLAND,  RuBiomes.SPARSE_REDWOODS},
            /*HOT*/     {RuBiomes.STEPPE,             RuBiomes.STEPPE,             RuBiomes.JOSHUA_DESERT,      RuBiomes.SPARSE_RAINFOREST,  RuBiomes.SPARSE_RAINFOREST}};

    public static ResourceKey<Biome>[][] SECONDARY_RIVER_BIOMES = new ResourceKey[][]{
            //-----------ARID,                DRY,                 NEUTRAL,                 WET,                     HUMID
            /*ICY*/     {Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER,     Biomes.FROZEN_RIVER,     Biomes.FROZEN_RIVER},
            /*COOL*/    {RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER,     RuBiomes.MUDDY_RIVER,    RuBiomes.MUDDY_RIVER},
            /*NEUTRAL*/ {Biomes.RIVER,        Biomes.RIVER,        Biomes.RIVER,            Biomes.RIVER,            Biomes.RIVER},
            /*WARM*/    {Biomes.RIVER,        Biomes.RIVER,        Biomes.RIVER,            Biomes.RIVER,            Biomes.RIVER},
            /*HOT*/     {Biomes.RIVER,        Biomes.RIVER,        RuBiomes.TROPICAL_RIVER, RuBiomes.TROPICAL_RIVER, RuBiomes.TROPICAL_RIVER}};

    public static ResourceKey<Biome>[][] SECONDARY_RIVER_BIOMES_VARIANT = new ResourceKey[][]{
            //-----------ARID,                DRY,                 NEUTRAL,                 WET,                     HUMID
            /*ICY*/     {Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER,     Biomes.FROZEN_RIVER,     Biomes.FROZEN_RIVER},
            /*COOL*/    {RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER,     RuBiomes.MUDDY_RIVER,    RuBiomes.MUDDY_RIVER},
            /*NEUTRAL*/ {Biomes.RIVER,        Biomes.RIVER,        Biomes.RIVER,            Biomes.RIVER,            Biomes.RIVER},
            /*WARM*/    {Biomes.RIVER,        Biomes.RIVER,        Biomes.RIVER,            Biomes.RIVER,            Biomes.RIVER},
            /*HOT*/     {Biomes.RIVER,        Biomes.RIVER,        RuBiomes.TROPICAL_RIVER, RuBiomes.TROPICAL_RIVER, RuBiomes.TROPICAL_RIVER}};

    public static ResourceKey<Biome>[][] SECONDARY_SWAMP_BIOMES = new ResourceKey[][]{
            //-----------ARID,                      DRY,                 NEUTRAL,             WET,                 HUMID
            /*ICY*/     {RuBiomes.SPIRES,           RuBiomes.SPIRES,     RuBiomes.SPIRES,     RuBiomes.SPIRES,     RuBiomes.SPIRES},
            /*COOL*/    {RuBiomes.FEN,              RuBiomes.FEN,        RuBiomes.FEN,        RuBiomes.FEN,        RuBiomes.FEN},
            /*NEUTRAL*/ {RuBiomes.OLD_GROWTH_BAYOU, RuBiomes.BAYOU,      RuBiomes.BAYOU,      RuBiomes.BAYOU,      RuBiomes.OLD_GROWTH_BAYOU},
            /*WARM*/    {RuBiomes.MARSH,            RuBiomes.MARSH,      RuBiomes.MARSH,      RuBiomes.MARSH,      RuBiomes.MARSH},
            /*HOT*/     {RuBiomes.FUNGAL_FEN,       RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN}};


    public static ResourceKey<Biome>[][] SECONDARY_OCEAN_BIOMES = new ResourceKey[][]{
            //-----------ARID,                     DRY,                    NEUTRAL,           WET,                        HUMID
            /*DEEP*/     {RuBiomes.HYACINTH_DEEPS, Biomes.DEEP_COLD_OCEAN, Biomes.DEEP_OCEAN, RuBiomes.CHARGED_DEPTHS, Biomes.WARM_OCEAN},
            /*NORM*/     {Biomes.FROZEN_OCEAN,     Biomes.COLD_OCEAN,      Biomes.OCEAN,      Biomes.LUKEWARM_OCEAN,      RuBiomes.ROCKY_REEF}};

    public static ResourceKey<Biome>[] SECONDARY_ISLAND_BIOMES = new ResourceKey[]       {RuBiomes.ALPHA_GROVE, RuBiomes.ALPHA_GROVE, RuBiomes.ASHEN_WOODLAND, RuBiomes.TROPICS, RuBiomes.TROPICS};

    public static ResourceKey<Biome>[] SECONDARY_BEACH_BIOMES = new ResourceKey[]        {Biomes.SNOWY_BEACH, RuBiomes.GRAVEL_BEACH, RuBiomes.GRASSY_BEACH, RuBiomes.GRASSY_BEACH, Biomes.BEACH};

    public static ResourceKey<Biome>[] SECONDARY_STONE_SHORE_BIOMES = new ResourceKey[]  {Biomes.STONY_SHORE, RuBiomes.CHALK_CLIFFS};

    public static ResourceKey<Biome>   SECONDARY_SHATTERED_CLIFF_BIOME =                    RuBiomes.TOWERING_CLIFFS;

    public static ResourceKey<Biome>[] SECONDARY_CAVE_BIOMES = new ResourceKey[]         {Biomes.LUSH_CAVES, Biomes.DRIPSTONE_CAVES, Biomes.DEEP_DARK, RuBiomes.BIOSHROOM_CAVES, RuBiomes.ANCIENT_DELTA, RuBiomes.PRISMACHASM, RuBiomes.REDSTONE_CAVES, RuBiomes.SCORCHING_CAVES};

    public static ResourceKey<Biome>[] SECONDARY_PEAK_BIOMES = new ResourceKey[]         {Biomes.FROZEN_PEAKS, Biomes.JAGGED_PEAKS, RuBiomes.MOUNTAINS, Biomes.STONY_PEAKS, RuBiomes.ARID_MOUNTAINS};

    public static ResourceKey<Biome>[] SECONDARY_PEAK_BIOMES_VARIANT = new ResourceKey[] {Biomes.JAGGED_PEAKS, RuBiomes.MOUNTAINS, RuBiomes.MOUNTAINS, Biomes.STONY_PEAKS, RuBiomes.ARID_MOUNTAINS};

    public static ResourceKey<Biome>[] SECONDARY_SLOPE_BIOMES = new ResourceKey[]        {Biomes.SNOWY_SLOPES, Biomes.GROVE, RuBiomes.PINE_SLOPES, RuBiomes.MAGNOLIA_WOODLAND, RuBiomes.RAINFOREST};

    public static ResourceKey<Biome>[] SECONDARY_SLOPE_BIOMES_VARIANT = new ResourceKey[]{RuBiomes.COLD_DECIDUOUS_FOREST, RuBiomes.PINE_SLOPES, RuBiomes.PINE_SLOPES, RuBiomes.MAGNOLIA_WOODLAND, RuBiomes.RAINFOREST};

    public static ResourceKey<Biome>[][] getPrimaryMiddleBiome(){
        ResourceKey<Biome>[][] PRIMARY_MIDDLE_BIOMES_CUSTOM = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {getBiome(RuPrimaryRegionConfig.MID_ICY_ARID.get()), getBiome(RuPrimaryRegionConfig.MID_ICY_DRY.get()), getBiome(RuPrimaryRegionConfig.MID_ICY_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.MID_ICY_WET.get()), getBiome(RuPrimaryRegionConfig.MID_ICY_HUMID.get())},
            /*COOL*/    {getBiome(RuPrimaryRegionConfig.MID_COOL_ARID.get()), getBiome(RuPrimaryRegionConfig.MID_COOL_DRY.get()), getBiome(RuPrimaryRegionConfig.MID_COOL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.MID_COOL_WET.get()), getBiome(RuPrimaryRegionConfig.MID_COOL_HUMID.get())},
            /*NEUTRAL*/ {getBiome(RuPrimaryRegionConfig.MID_NEUTRAL_ARID.get()), getBiome(RuPrimaryRegionConfig.MID_NEUTRAL_DRY.get()), getBiome(RuPrimaryRegionConfig.MID_NEUTRAL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.MID_NEUTRAL_WET.get()), getBiome(RuPrimaryRegionConfig.MID_NEUTRAL_HUMID.get())},
            /*WARM*/    {getBiome(RuPrimaryRegionConfig.MID_WARM_ARID.get()), getBiome(RuPrimaryRegionConfig.MID_WARM_DRY.get()), getBiome(RuPrimaryRegionConfig.MID_WARM_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.MID_WARM_WET.get()), getBiome(RuPrimaryRegionConfig.MID_WARM_HUMID.get())},
            /*HOT*/     {getBiome(RuPrimaryRegionConfig.MID_HOT_ARID.get()), getBiome(RuPrimaryRegionConfig.MID_HOT_DRY.get()), getBiome(RuPrimaryRegionConfig.MID_HOT_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.MID_HOT_WET.get()), getBiome(RuPrimaryRegionConfig.MID_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_MIDDLE_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_MIDDLE_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryMiddleBiomeVariant(){
        ResourceKey<Biome>[][] PRIMARY_MIDDLE_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuPrimaryRegionConfig.MID_VAR_ICY_ARID.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_ICY_DRY.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_ICY_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_ICY_WET.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuPrimaryRegionConfig.MID_VAR_COOL_ARID.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_COOL_DRY.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_COOL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_COOL_WET.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuPrimaryRegionConfig.MID_VAR_NEUTRAL_ARID.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_NEUTRAL_DRY.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_NEUTRAL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_NEUTRAL_WET.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuPrimaryRegionConfig.MID_VAR_WARM_ARID.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_WARM_DRY.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_WARM_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_WARM_WET.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuPrimaryRegionConfig.MID_VAR_HOT_ARID.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_HOT_DRY.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_HOT_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_HOT_WET.get()), getBiome(RuPrimaryRegionConfig.MID_VAR_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_MIDDLE_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return PRIMARY_MIDDLE_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryPlateauBiome(){
        ResourceKey<Biome>[][] PRIMARY_PLATEAU_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuPrimaryRegionConfig.PLT_ICY_ARID.get()), getBiome(RuPrimaryRegionConfig.PLT_ICY_DRY.get()), getBiome(RuPrimaryRegionConfig.PLT_ICY_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.PLT_ICY_WET.get()), getBiome(RuPrimaryRegionConfig.PLT_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuPrimaryRegionConfig.PLT_COOL_ARID.get()), getBiome(RuPrimaryRegionConfig.PLT_COOL_DRY.get()), getBiome(RuPrimaryRegionConfig.PLT_COOL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.PLT_COOL_WET.get()), getBiome(RuPrimaryRegionConfig.PLT_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuPrimaryRegionConfig.PLT_NEUTRAL_ARID.get()), getBiome(RuPrimaryRegionConfig.PLT_NEUTRAL_DRY.get()), getBiome(RuPrimaryRegionConfig.PLT_NEUTRAL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.PLT_NEUTRAL_WET.get()), getBiome(RuPrimaryRegionConfig.PLT_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuPrimaryRegionConfig.PLT_WARM_ARID.get()), getBiome(RuPrimaryRegionConfig.PLT_WARM_DRY.get()), getBiome(RuPrimaryRegionConfig.PLT_WARM_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.PLT_WARM_WET.get()), getBiome(RuPrimaryRegionConfig.PLT_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuPrimaryRegionConfig.PLT_HOT_ARID.get()), getBiome(RuPrimaryRegionConfig.PLT_HOT_DRY.get()), getBiome(RuPrimaryRegionConfig.PLT_HOT_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.PLT_HOT_WET.get()), getBiome(RuPrimaryRegionConfig.PLT_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_PLATEAU_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_PLATEAU_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryPlateauBiomeVariant(){
        ResourceKey<Biome>[][] PRIMARY_PLATEAU_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuPrimaryRegionConfig.PLT_VAR_ICY_ARID.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_ICY_DRY.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_ICY_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_ICY_WET.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuPrimaryRegionConfig.PLT_VAR_COOL_ARID.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_COOL_DRY.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_COOL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_COOL_WET.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuPrimaryRegionConfig.PLT_VAR_NEUTRAL_ARID.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_NEUTRAL_DRY.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_NEUTRAL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_NEUTRAL_WET.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuPrimaryRegionConfig.PLT_VAR_WARM_ARID.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_WARM_DRY.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_WARM_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_WARM_WET.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuPrimaryRegionConfig.PLT_VAR_HOT_ARID.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_HOT_DRY.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_HOT_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_HOT_WET.get()), getBiome(RuPrimaryRegionConfig.PLT_VAR_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_PLATEAU_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return PRIMARY_PLATEAU_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryShatteredBiome(){
        ResourceKey<Biome>[][] PRIMARY_SHATTERED_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuPrimaryRegionConfig.SHT_ICY_ARID.get()), getBiome(RuPrimaryRegionConfig.SHT_ICY_DRY.get()), getBiome(RuPrimaryRegionConfig.SHT_ICY_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.SHT_ICY_WET.get()), getBiome(RuPrimaryRegionConfig.SHT_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuPrimaryRegionConfig.SHT_COOL_ARID.get()), getBiome(RuPrimaryRegionConfig.SHT_COOL_DRY.get()), getBiome(RuPrimaryRegionConfig.SHT_COOL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.SHT_COOL_WET.get()), getBiome(RuPrimaryRegionConfig.SHT_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuPrimaryRegionConfig.SHT_NEUTRAL_ARID.get()), getBiome(RuPrimaryRegionConfig.SHT_NEUTRAL_DRY.get()), getBiome(RuPrimaryRegionConfig.SHT_NEUTRAL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.SHT_NEUTRAL_WET.get()), getBiome(RuPrimaryRegionConfig.SHT_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuPrimaryRegionConfig.SHT_WARM_ARID.get()), getBiome(RuPrimaryRegionConfig.SHT_WARM_DRY.get()), getBiome(RuPrimaryRegionConfig.SHT_WARM_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.SHT_WARM_WET.get()), getBiome(RuPrimaryRegionConfig.SHT_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuPrimaryRegionConfig.SHT_HOT_ARID.get()), getBiome(RuPrimaryRegionConfig.SHT_HOT_DRY.get()), getBiome(RuPrimaryRegionConfig.SHT_HOT_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.SHT_HOT_WET.get()), getBiome(RuPrimaryRegionConfig.SHT_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_SHATTERED_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_SHATTERED_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryRiverBiome(){
        ResourceKey<Biome>[][] PRIMARY_RIVER_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuPrimaryRegionConfig.RVR_ICY_ARID.get()), getBiome(RuPrimaryRegionConfig.RVR_ICY_DRY.get()), getBiome(RuPrimaryRegionConfig.RVR_ICY_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.RVR_ICY_WET.get()), getBiome(RuPrimaryRegionConfig.RVR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuPrimaryRegionConfig.RVR_COOL_ARID.get()), getBiome(RuPrimaryRegionConfig.RVR_COOL_DRY.get()), getBiome(RuPrimaryRegionConfig.RVR_COOL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.RVR_COOL_WET.get()), getBiome(RuPrimaryRegionConfig.RVR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuPrimaryRegionConfig.RVR_NEUTRAL_ARID.get()), getBiome(RuPrimaryRegionConfig.RVR_NEUTRAL_DRY.get()), getBiome(RuPrimaryRegionConfig.RVR_NEUTRAL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.RVR_NEUTRAL_WET.get()), getBiome(RuPrimaryRegionConfig.RVR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuPrimaryRegionConfig.RVR_WARM_ARID.get()), getBiome(RuPrimaryRegionConfig.RVR_WARM_DRY.get()), getBiome(RuPrimaryRegionConfig.RVR_WARM_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.RVR_WARM_WET.get()), getBiome(RuPrimaryRegionConfig.RVR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuPrimaryRegionConfig.RVR_HOT_ARID.get()), getBiome(RuPrimaryRegionConfig.RVR_HOT_DRY.get()), getBiome(RuPrimaryRegionConfig.RVR_HOT_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.RVR_HOT_WET.get()), getBiome(RuPrimaryRegionConfig.RVR_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_RIVER_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_RIVER_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryRiverBiomeVariant(){
        ResourceKey<Biome>[][] PRIMARY_RIVER_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuPrimaryRegionConfig.RVR_ICY_ARID.get()), getBiome(RuPrimaryRegionConfig.RVR_ICY_DRY.get()), getBiome(RuPrimaryRegionConfig.RVR_ICY_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.RVR_ICY_WET.get()), getBiome(RuPrimaryRegionConfig.RVR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuPrimaryRegionConfig.RVR_COOL_ARID.get()), getBiome(RuPrimaryRegionConfig.RVR_COOL_DRY.get()), getBiome(RuPrimaryRegionConfig.RVR_COOL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.RVR_COOL_WET.get()), getBiome(RuPrimaryRegionConfig.RVR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuPrimaryRegionConfig.RVR_NEUTRAL_ARID.get()), getBiome(RuPrimaryRegionConfig.RVR_NEUTRAL_DRY.get()), getBiome(RuPrimaryRegionConfig.RVR_NEUTRAL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.RVR_NEUTRAL_WET.get()), getBiome(RuPrimaryRegionConfig.RVR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuPrimaryRegionConfig.RVR_WARM_ARID.get()), getBiome(RuPrimaryRegionConfig.RVR_WARM_DRY.get()), getBiome(RuPrimaryRegionConfig.RVR_WARM_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.RVR_WARM_WET.get()), getBiome(RuPrimaryRegionConfig.RVR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuPrimaryRegionConfig.RVR_HOT_ARID.get()), getBiome(RuPrimaryRegionConfig.RVR_HOT_DRY.get()), getBiome(RuPrimaryRegionConfig.RVR_HOT_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.RVR_HOT_WET.get()), getBiome(RuPrimaryRegionConfig.RVR_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_RIVER_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return PRIMARY_RIVER_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getPrimarySwampBiome(){
        ResourceKey<Biome>[][] PRIMARY_SWAMP_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuPrimaryRegionConfig.SMP_ICY_ARID.get()), getBiome(RuPrimaryRegionConfig.SMP_ICY_DRY.get()), getBiome(RuPrimaryRegionConfig.SMP_ICY_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.SMP_ICY_WET.get()), getBiome(RuPrimaryRegionConfig.SMP_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuPrimaryRegionConfig.SMP_COOL_ARID.get()), getBiome(RuPrimaryRegionConfig.SMP_COOL_DRY.get()), getBiome(RuPrimaryRegionConfig.SMP_COOL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.SMP_COOL_WET.get()), getBiome(RuPrimaryRegionConfig.SMP_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuPrimaryRegionConfig.SMP_NEUTRAL_ARID.get()), getBiome(RuPrimaryRegionConfig.SMP_NEUTRAL_DRY.get()), getBiome(RuPrimaryRegionConfig.SMP_NEUTRAL_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.SMP_NEUTRAL_WET.get()), getBiome(RuPrimaryRegionConfig.SMP_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuPrimaryRegionConfig.SMP_WARM_ARID.get()), getBiome(RuPrimaryRegionConfig.SMP_WARM_DRY.get()), getBiome(RuPrimaryRegionConfig.SMP_WARM_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.SMP_WARM_WET.get()), getBiome(RuPrimaryRegionConfig.SMP_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuPrimaryRegionConfig.SMP_HOT_ARID.get()), getBiome(RuPrimaryRegionConfig.SMP_HOT_DRY.get()), getBiome(RuPrimaryRegionConfig.SMP_HOT_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.SMP_HOT_WET.get()), getBiome(RuPrimaryRegionConfig.SMP_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_SWAMP_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_SWAMP_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryOceanBiome(){
        ResourceKey<Biome>[][] PRIMARY_OCEAN_BIOMES_CUSTOM = new ResourceKey[][]{
                /*DEEP*/    {getBiome(RuPrimaryRegionConfig.OCA_DEP_ICY.get()), getBiome(RuPrimaryRegionConfig.OCA_DEP_COOL.get()), getBiome(RuPrimaryRegionConfig.OCA_DEP_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.OCA_DEP_WARM.get()), getBiome(RuPrimaryRegionConfig.OCA_DEP_HOT.get())},
                /*NORM*/    {getBiome(RuPrimaryRegionConfig.OCA_ICY.get()), getBiome(RuPrimaryRegionConfig.OCA_COOL.get()), getBiome(RuPrimaryRegionConfig.OCA_NEUTRAL.get()), getBiome(RuPrimaryRegionConfig.OCA_WARM.get()), getBiome(RuPrimaryRegionConfig.OCA_HOT.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_OCEAN_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_OCEAN_BIOMES;
        }
    }
    public static ResourceKey<Biome> getPrimaryIslandBiome(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.ICY_ISLAND.get());
            }
            else{
                return PRIMARY_ISLAND_BIOMES[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.COOL_ISLAND.get());
            }
            else{
                return PRIMARY_ISLAND_BIOMES[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.NEUTRAL_ISLAND.get());
            }
            else{
                return PRIMARY_ISLAND_BIOMES[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.WARM_ISLAND.get());
            }
            else{
                return PRIMARY_ISLAND_BIOMES[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.HOT_ISLAND.get());
            }
            else{
                return PRIMARY_ISLAND_BIOMES[4];
            }
        }
    }
    public static ResourceKey<Biome> getPrimaryBeachBiome(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.ICY_BEACH.get());
            }
            else{
                return PRIMARY_BEACH_BIOMES[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.COOL_BEACH.get());
            }
            else{
                return PRIMARY_BEACH_BIOMES[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.NEUTRAL_BEACH.get());
            }
            else{
                return PRIMARY_BEACH_BIOMES[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.WARM_BEACH.get());
            }
            else{
                return PRIMARY_BEACH_BIOMES[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.HOT_BEACH.get());
            }
            else{
                return PRIMARY_BEACH_BIOMES[4];
            }
        }
    }
    public static ResourceKey<Biome> getPrimaryStoneShoreBiome(boolean isCold){
        if(isCold){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.COLD_STONE_BEACH.get());
            }
            else{
                return PRIMARY_STONE_SHORE_BIOMES[0];
            }
        }
        else{
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.HOT_STONE_BEACH.get());
            }
            else{
                return PRIMARY_STONE_SHORE_BIOMES[1];
            }
        }
    }
    public static ResourceKey<Biome> getPrimaryShatteredCliffBiome(){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.SHA_CLI.get());
            }
            else{
                return PRIMARY_SHATTERED_CLIFF_BIOME;
            }
    }
    public static ResourceKey<Biome> getPrimaryCaveBiome(int type){
        if(type==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.CAVE_1.get());
            }
            else{
                return PRIMARY_CAVE_BIOMES[0];
            }
        }
        else if(type==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.CAVE_2.get());
            }
            else{
                return PRIMARY_CAVE_BIOMES[1];
            }
        }
        else if(type==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.CAVE_3.get());
            }
            else{
                return PRIMARY_CAVE_BIOMES[2];
            }
        }
        else if(type==4){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.CAVE_4.get());
            }
            else{
                return PRIMARY_CAVE_BIOMES[3];
            }
        }
        else if(type==5){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.CAVE_5.get());
            }
            else{
                return PRIMARY_CAVE_BIOMES[4];
            }
        }
        else if(type==6){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.CAVE_6.get());
            }
            else{
                return PRIMARY_CAVE_BIOMES[5];
            }
        }
        else if(type==7){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.CAVE_7.get());
            }
            else{
                return PRIMARY_CAVE_BIOMES[6];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.CAVE_8.get());
            }
            else{
                return PRIMARY_CAVE_BIOMES[7];
            }
        }
    }
    public static ResourceKey<Biome> getPrimaryPeakBiome(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.ICY_PEAK.get());
            }
            else{
                return PRIMARY_PEAK_BIOMES[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.COOL_PEAK.get());
            }
            else{
                return PRIMARY_PEAK_BIOMES[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.NEUTRAL_PEAK.get());
            }
            else{
                return PRIMARY_PEAK_BIOMES[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.WARM_PEAK.get());
            }
            else{
                return PRIMARY_PEAK_BIOMES[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.HOT_PEAK.get());
            }
            else{
                return PRIMARY_PEAK_BIOMES[4];
            }
        }
    }
    public static ResourceKey<Biome> getPrimaryPeakBiomeVariant(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.ICY_PEAK_VAR.get());
            }
            else{
                return PRIMARY_PEAK_BIOMES_VARIANT[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.COOL_PEAK_VAR.get());
            }
            else{
                return PRIMARY_PEAK_BIOMES_VARIANT[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.NEUTRAL_PEAK_VAR.get());
            }
            else{
                return PRIMARY_PEAK_BIOMES_VARIANT[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.WARM_PEAK_VAR.get());
            }
            else{
                return PRIMARY_PEAK_BIOMES_VARIANT[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.HOT_PEAK_VAR.get());
            }
            else{
                return PRIMARY_PEAK_BIOMES_VARIANT[4];
            }
        }
    }
    public static ResourceKey<Biome> getPrimarySlopeBiome(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.ICY_SLOPE.get());
            }
            else{
                return PRIMARY_SLOPE_BIOMES[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.COOL_SLOPE.get());
            }
            else{
                return PRIMARY_SLOPE_BIOMES[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.NEUTRAL_SLOPE.get());
            }
            else{
                return PRIMARY_SLOPE_BIOMES[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.WARM_SLOPE.get());
            }
            else{
                return PRIMARY_SLOPE_BIOMES[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.HOT_SLOPE.get());
            }
            else{
                return PRIMARY_SLOPE_BIOMES[4];
            }
        }
    }
    public static ResourceKey<Biome> getPrimarySlopeBiomeVariant(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.ICY_SLOPE_VAR.get());
            }
            else{
                return PRIMARY_SLOPE_BIOMES_VARIANT[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.COOL_SLOPE_VAR.get());
            }
            else{
                return PRIMARY_SLOPE_BIOMES_VARIANT[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.NEUTRAL_SLOPE_VAR.get());
            }
            else{
                return PRIMARY_SLOPE_BIOMES_VARIANT[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.WARM_SLOPE_VAR.get());
            }
            else{
                return PRIMARY_SLOPE_BIOMES_VARIANT[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuPrimaryRegionConfig.HOT_SLOPE_VAR.get());
            }
            else{
                return PRIMARY_SLOPE_BIOMES_VARIANT[4];
            }
        }
    }
    //SECONDARY_REGION
    public static ResourceKey<Biome>[][] getSecondaryMiddleBiome(){
        ResourceKey<Biome>[][] SECONDARY_MIDDLE_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuSecondaryRegionConfig.MID_ICY_ARID.get()), getBiome(RuSecondaryRegionConfig.MID_ICY_DRY.get()), getBiome(RuSecondaryRegionConfig.MID_ICY_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.MID_ICY_WET.get()), getBiome(RuSecondaryRegionConfig.MID_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuSecondaryRegionConfig.MID_COOL_ARID.get()), getBiome(RuSecondaryRegionConfig.MID_COOL_DRY.get()), getBiome(RuSecondaryRegionConfig.MID_COOL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.MID_COOL_WET.get()), getBiome(RuSecondaryRegionConfig.MID_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuSecondaryRegionConfig.MID_NEUTRAL_ARID.get()), getBiome(RuSecondaryRegionConfig.MID_NEUTRAL_DRY.get()), getBiome(RuSecondaryRegionConfig.MID_NEUTRAL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.MID_NEUTRAL_WET.get()), getBiome(RuSecondaryRegionConfig.MID_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuSecondaryRegionConfig.MID_WARM_ARID.get()), getBiome(RuSecondaryRegionConfig.MID_WARM_DRY.get()), getBiome(RuSecondaryRegionConfig.MID_WARM_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.MID_WARM_WET.get()), getBiome(RuSecondaryRegionConfig.MID_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuSecondaryRegionConfig.MID_HOT_ARID.get()), getBiome(RuSecondaryRegionConfig.MID_HOT_DRY.get()), getBiome(RuSecondaryRegionConfig.MID_HOT_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.MID_HOT_WET.get()), getBiome(RuSecondaryRegionConfig.MID_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_MIDDLE_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_MIDDLE_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryMiddleBiomeVariant(){
        ResourceKey<Biome>[][] SECONDARY_MIDDLE_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuSecondaryRegionConfig.MID_VAR_ICY_ARID.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_ICY_DRY.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_ICY_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_ICY_WET.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuSecondaryRegionConfig.MID_VAR_COOL_ARID.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_COOL_DRY.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_COOL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_COOL_WET.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuSecondaryRegionConfig.MID_VAR_NEUTRAL_ARID.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_NEUTRAL_DRY.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_NEUTRAL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_NEUTRAL_WET.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuSecondaryRegionConfig.MID_VAR_WARM_ARID.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_WARM_DRY.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_WARM_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_WARM_WET.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuSecondaryRegionConfig.MID_VAR_HOT_ARID.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_HOT_DRY.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_HOT_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_HOT_WET.get()), getBiome(RuSecondaryRegionConfig.MID_VAR_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_MIDDLE_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return SECONDARY_MIDDLE_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryPlateauBiome(){
        ResourceKey<Biome>[][] SECONDARY_PLATEAU_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuSecondaryRegionConfig.PLT_ICY_ARID.get()), getBiome(RuSecondaryRegionConfig.PLT_ICY_DRY.get()), getBiome(RuSecondaryRegionConfig.PLT_ICY_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.PLT_ICY_WET.get()), getBiome(RuSecondaryRegionConfig.PLT_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuSecondaryRegionConfig.PLT_COOL_ARID.get()), getBiome(RuSecondaryRegionConfig.PLT_COOL_DRY.get()), getBiome(RuSecondaryRegionConfig.PLT_COOL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.PLT_COOL_WET.get()), getBiome(RuSecondaryRegionConfig.PLT_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuSecondaryRegionConfig.PLT_NEUTRAL_ARID.get()), getBiome(RuSecondaryRegionConfig.PLT_NEUTRAL_DRY.get()), getBiome(RuSecondaryRegionConfig.PLT_NEUTRAL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.PLT_NEUTRAL_WET.get()), getBiome(RuSecondaryRegionConfig.PLT_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuSecondaryRegionConfig.PLT_WARM_ARID.get()), getBiome(RuSecondaryRegionConfig.PLT_WARM_DRY.get()), getBiome(RuSecondaryRegionConfig.PLT_WARM_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.PLT_WARM_WET.get()), getBiome(RuSecondaryRegionConfig.PLT_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuSecondaryRegionConfig.PLT_HOT_ARID.get()), getBiome(RuSecondaryRegionConfig.PLT_HOT_DRY.get()), getBiome(RuSecondaryRegionConfig.PLT_HOT_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.PLT_HOT_WET.get()), getBiome(RuSecondaryRegionConfig.PLT_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_PLATEAU_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_PLATEAU_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryPlateauBiomeVariant(){
        ResourceKey<Biome>[][] SECONDARY_PLATEAU_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuSecondaryRegionConfig.PLT_VAR_ICY_ARID.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_ICY_DRY.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_ICY_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_ICY_WET.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuSecondaryRegionConfig.PLT_VAR_COOL_ARID.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_COOL_DRY.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_COOL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_COOL_WET.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuSecondaryRegionConfig.PLT_VAR_NEUTRAL_ARID.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_NEUTRAL_DRY.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_NEUTRAL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_NEUTRAL_WET.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuSecondaryRegionConfig.PLT_VAR_WARM_ARID.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_WARM_DRY.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_WARM_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_WARM_WET.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuSecondaryRegionConfig.PLT_VAR_HOT_ARID.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_HOT_DRY.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_HOT_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_HOT_WET.get()), getBiome(RuSecondaryRegionConfig.PLT_VAR_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_PLATEAU_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return SECONDARY_PLATEAU_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryShatteredBiome(){
        ResourceKey<Biome>[][] SECONDARY_SHATTERED_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuSecondaryRegionConfig.SHT_ICY_ARID.get()), getBiome(RuSecondaryRegionConfig.SHT_ICY_DRY.get()), getBiome(RuSecondaryRegionConfig.SHT_ICY_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.SHT_ICY_WET.get()), getBiome(RuSecondaryRegionConfig.SHT_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuSecondaryRegionConfig.SHT_COOL_ARID.get()), getBiome(RuSecondaryRegionConfig.SHT_COOL_DRY.get()), getBiome(RuSecondaryRegionConfig.SHT_COOL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.SHT_COOL_WET.get()), getBiome(RuSecondaryRegionConfig.SHT_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuSecondaryRegionConfig.SHT_NEUTRAL_ARID.get()), getBiome(RuSecondaryRegionConfig.SHT_NEUTRAL_DRY.get()), getBiome(RuSecondaryRegionConfig.SHT_NEUTRAL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.SHT_NEUTRAL_WET.get()), getBiome(RuSecondaryRegionConfig.SHT_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuSecondaryRegionConfig.SHT_WARM_ARID.get()), getBiome(RuSecondaryRegionConfig.SHT_WARM_DRY.get()), getBiome(RuSecondaryRegionConfig.SHT_WARM_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.SHT_WARM_WET.get()), getBiome(RuSecondaryRegionConfig.SHT_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuSecondaryRegionConfig.SHT_HOT_ARID.get()), getBiome(RuSecondaryRegionConfig.SHT_HOT_DRY.get()), getBiome(RuSecondaryRegionConfig.SHT_HOT_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.SHT_HOT_WET.get()), getBiome(RuSecondaryRegionConfig.SHT_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_SHATTERED_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_SHATTERED_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryRiverBiome(){
        ResourceKey<Biome>[][] SECONDARY_RIVER_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuSecondaryRegionConfig.RVR_ICY_ARID.get()), getBiome(RuSecondaryRegionConfig.RVR_ICY_DRY.get()), getBiome(RuSecondaryRegionConfig.RVR_ICY_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.RVR_ICY_WET.get()), getBiome(RuSecondaryRegionConfig.RVR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuSecondaryRegionConfig.RVR_COOL_ARID.get()), getBiome(RuSecondaryRegionConfig.RVR_COOL_DRY.get()), getBiome(RuSecondaryRegionConfig.RVR_COOL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.RVR_COOL_WET.get()), getBiome(RuSecondaryRegionConfig.RVR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuSecondaryRegionConfig.RVR_NEUTRAL_ARID.get()), getBiome(RuSecondaryRegionConfig.RVR_NEUTRAL_DRY.get()), getBiome(RuSecondaryRegionConfig.RVR_NEUTRAL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.RVR_NEUTRAL_WET.get()), getBiome(RuSecondaryRegionConfig.RVR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuSecondaryRegionConfig.RVR_WARM_ARID.get()), getBiome(RuSecondaryRegionConfig.RVR_WARM_DRY.get()), getBiome(RuSecondaryRegionConfig.RVR_WARM_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.RVR_WARM_WET.get()), getBiome(RuSecondaryRegionConfig.RVR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuSecondaryRegionConfig.RVR_HOT_ARID.get()), getBiome(RuSecondaryRegionConfig.RVR_HOT_DRY.get()), getBiome(RuSecondaryRegionConfig.RVR_HOT_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.RVR_HOT_WET.get()), getBiome(RuSecondaryRegionConfig.RVR_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_RIVER_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_RIVER_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryRiverBiomeVariant(){
        ResourceKey<Biome>[][] SECONDARY_RIVER_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuSecondaryRegionConfig.RVR_ICY_ARID.get()), getBiome(RuSecondaryRegionConfig.RVR_ICY_DRY.get()), getBiome(RuSecondaryRegionConfig.RVR_ICY_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.RVR_ICY_WET.get()), getBiome(RuSecondaryRegionConfig.RVR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuSecondaryRegionConfig.RVR_COOL_ARID.get()), getBiome(RuSecondaryRegionConfig.RVR_COOL_DRY.get()), getBiome(RuSecondaryRegionConfig.RVR_COOL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.RVR_COOL_WET.get()), getBiome(RuSecondaryRegionConfig.RVR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuSecondaryRegionConfig.RVR_NEUTRAL_ARID.get()), getBiome(RuSecondaryRegionConfig.RVR_NEUTRAL_DRY.get()), getBiome(RuSecondaryRegionConfig.RVR_NEUTRAL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.RVR_NEUTRAL_WET.get()), getBiome(RuSecondaryRegionConfig.RVR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuSecondaryRegionConfig.RVR_WARM_ARID.get()), getBiome(RuSecondaryRegionConfig.RVR_WARM_DRY.get()), getBiome(RuSecondaryRegionConfig.RVR_WARM_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.RVR_WARM_WET.get()), getBiome(RuSecondaryRegionConfig.RVR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuSecondaryRegionConfig.RVR_HOT_ARID.get()), getBiome(RuSecondaryRegionConfig.RVR_HOT_DRY.get()), getBiome(RuSecondaryRegionConfig.RVR_HOT_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.RVR_HOT_WET.get()), getBiome(RuSecondaryRegionConfig.RVR_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_RIVER_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return SECONDARY_RIVER_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getSecondarySwampBiome(){
        ResourceKey<Biome>[][] SECONDARY_SWAMP_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RuSecondaryRegionConfig.SMP_ICY_ARID.get()), getBiome(RuSecondaryRegionConfig.SMP_ICY_DRY.get()), getBiome(RuSecondaryRegionConfig.SMP_ICY_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.SMP_ICY_WET.get()), getBiome(RuSecondaryRegionConfig.SMP_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RuSecondaryRegionConfig.SMP_COOL_ARID.get()), getBiome(RuSecondaryRegionConfig.SMP_COOL_DRY.get()), getBiome(RuSecondaryRegionConfig.SMP_COOL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.SMP_COOL_WET.get()), getBiome(RuSecondaryRegionConfig.SMP_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RuSecondaryRegionConfig.SMP_NEUTRAL_ARID.get()), getBiome(RuSecondaryRegionConfig.SMP_NEUTRAL_DRY.get()), getBiome(RuSecondaryRegionConfig.SMP_NEUTRAL_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.SMP_NEUTRAL_WET.get()), getBiome(RuSecondaryRegionConfig.SMP_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RuSecondaryRegionConfig.SMP_WARM_ARID.get()), getBiome(RuSecondaryRegionConfig.SMP_WARM_DRY.get()), getBiome(RuSecondaryRegionConfig.SMP_WARM_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.SMP_WARM_WET.get()), getBiome(RuSecondaryRegionConfig.SMP_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RuSecondaryRegionConfig.SMP_HOT_ARID.get()), getBiome(RuSecondaryRegionConfig.SMP_HOT_DRY.get()), getBiome(RuSecondaryRegionConfig.SMP_HOT_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.SMP_HOT_WET.get()), getBiome(RuSecondaryRegionConfig.SMP_HOT_HUMID.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_SWAMP_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_SWAMP_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryOceanBiome(){
        ResourceKey<Biome>[][] SECONDARY_OCEAN_BIOMES_CUSTOM = new ResourceKey[][]{
                /*DEEP*/    {getBiome(RuSecondaryRegionConfig.OCA_DEP_ICY.get()), getBiome(RuSecondaryRegionConfig.OCA_DEP_COOL.get()), getBiome(RuSecondaryRegionConfig.OCA_DEP_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.OCA_DEP_WARM.get()), getBiome(RuSecondaryRegionConfig.OCA_DEP_HOT.get())},
                /*NORM*/    {getBiome(RuSecondaryRegionConfig.OCA_ICY.get()), getBiome(RuSecondaryRegionConfig.OCA_COOL.get()), getBiome(RuSecondaryRegionConfig.OCA_NEUTRAL.get()), getBiome(RuSecondaryRegionConfig.OCA_WARM.get()), getBiome(RuSecondaryRegionConfig.OCA_HOT.get())}};

        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_OCEAN_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_OCEAN_BIOMES;
        }
    }
    public static ResourceKey<Biome> getSecondaryIslandBiome(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.ICY_ISLAND.get());
            }
            else{
                return SECONDARY_ISLAND_BIOMES[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.COOL_ISLAND.get());
            }
            else{
                return SECONDARY_ISLAND_BIOMES[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.NEUTRAL_ISLAND.get());
            }
            else{
                return SECONDARY_ISLAND_BIOMES[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.WARM_ISLAND.get());
            }
            else{
                return SECONDARY_ISLAND_BIOMES[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.HOT_ISLAND.get());
            }
            else{
                return SECONDARY_ISLAND_BIOMES[4];
            }
        }
    }
    public static ResourceKey<Biome> getSecondaryBeachBiome(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.ICY_BEACH.get());
            }
            else{
                return SECONDARY_BEACH_BIOMES[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.COOL_BEACH.get());
            }
            else{
                return SECONDARY_BEACH_BIOMES[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.NEUTRAL_BEACH.get());
            }
            else{
                return SECONDARY_BEACH_BIOMES[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.WARM_BEACH.get());
            }
            else{
                return SECONDARY_BEACH_BIOMES[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.HOT_BEACH.get());
            }
            else{
                return SECONDARY_BEACH_BIOMES[4];
            }
        }
    }
    public static ResourceKey<Biome> getSecondaryStoneShoreBiome(boolean isCold){
        if(isCold){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.COLD_STONE_BEACH.get());
            }
            else{
                return SECONDARY_STONE_SHORE_BIOMES[0];
            }
        }
        else{
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.HOT_STONE_BEACH.get());
            }
            else{
                return SECONDARY_STONE_SHORE_BIOMES[1];
            }
        }
    }
    public static ResourceKey<Biome> getSecondaryShatteredCliffBiome(){
        if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
            return getBiome(RuSecondaryRegionConfig.SHA_CLI.get());
        }
        else{
            return SECONDARY_SHATTERED_CLIFF_BIOME;
        }
    }
    public static ResourceKey<Biome> getSecondaryCaveBiome(int type){
        if(type==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.CAVE_1.get());
            }
            else{
                return SECONDARY_CAVE_BIOMES[0];
            }
        }
        else if(type==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.CAVE_2.get());
            }
            else{
                return SECONDARY_CAVE_BIOMES[1];
            }
        }
        else if(type==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.CAVE_3.get());
            }
            else{
                return SECONDARY_CAVE_BIOMES[2];
            }
        }
        else if(type==4){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.CAVE_4.get());
            }
            else{
                return SECONDARY_CAVE_BIOMES[3];
            }
        }
        else if(type==5){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.CAVE_5.get());
            }
            else{
                return SECONDARY_CAVE_BIOMES[4];
            }
        }
        else if(type==6){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.CAVE_6.get());
            }
            else{
                return SECONDARY_CAVE_BIOMES[5];
            }
        }
        else if(type==7){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.CAVE_7.get());
            }
            else{
                return SECONDARY_CAVE_BIOMES[6];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.CAVE_8.get());
            }
            else{
                return SECONDARY_CAVE_BIOMES[7];
            }
        }
    }
    public static ResourceKey<Biome> getSecondaryPeakBiome(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.ICY_PEAK.get());
            }
            else{
                return SECONDARY_PEAK_BIOMES[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.COOL_PEAK.get());
            }
            else{
                return SECONDARY_PEAK_BIOMES[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.NEUTRAL_PEAK.get());
            }
            else{
                return SECONDARY_PEAK_BIOMES[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.WARM_PEAK.get());
            }
            else{
                return SECONDARY_PEAK_BIOMES[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.HOT_PEAK.get());
            }
            else{
                return SECONDARY_PEAK_BIOMES[4];
            }
        }
    }
    public static ResourceKey<Biome> getSecondaryPeakBiomeVariant(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.ICY_PEAK_VAR.get());
            }
            else{
                return SECONDARY_PEAK_BIOMES_VARIANT[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.COOL_PEAK_VAR.get());
            }
            else{
                return SECONDARY_PEAK_BIOMES_VARIANT[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.NEUTRAL_PEAK_VAR.get());
            }
            else{
                return SECONDARY_PEAK_BIOMES_VARIANT[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.WARM_PEAK_VAR.get());
            }
            else{
                return SECONDARY_PEAK_BIOMES_VARIANT[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.HOT_PEAK_VAR.get());
            }
            else{
                return SECONDARY_PEAK_BIOMES_VARIANT[4];
            }
        }
    }
    public static ResourceKey<Biome> getSecondarySlopeBiome(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.ICY_SLOPE.get());
            }
            else{
                return SECONDARY_SLOPE_BIOMES[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.COOL_SLOPE.get());
            }
            else{
                return SECONDARY_SLOPE_BIOMES[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.NEUTRAL_SLOPE.get());
            }
            else{
                return SECONDARY_SLOPE_BIOMES[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.WARM_SLOPE.get());
            }
            else{
                return SECONDARY_SLOPE_BIOMES[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.HOT_SLOPE.get());
            }
            else{
                return SECONDARY_SLOPE_BIOMES[4];
            }
        }
    }
    public static ResourceKey<Biome> getSecondarySlopeBiomeVariant(int temperature){
        if(temperature==0){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.ICY_SLOPE_VAR.get());
            }
            else{
                return SECONDARY_SLOPE_BIOMES_VARIANT[0];
            }
        }
        else if(temperature==1){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.COOL_SLOPE_VAR.get());
            }
            else{
                return SECONDARY_SLOPE_BIOMES_VARIANT[1];
            }
        }
        else if(temperature==2){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.NEUTRAL_SLOPE_VAR.get());
            }
            else{
                return SECONDARY_SLOPE_BIOMES_VARIANT[2];
            }
        }
        else if(temperature==3){
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.WARM_SLOPE_VAR.get());
            }
            else{
                return SECONDARY_SLOPE_BIOMES_VARIANT[3];
            }
        }
        else {
            if(RuCommonConfig.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RuSecondaryRegionConfig.HOT_SLOPE_VAR.get());
            }
            else{
                return SECONDARY_SLOPE_BIOMES_VARIANT[4];
            }
        }
    }

    public static boolean isBiomeEnabled(ResourceKey<Biome> biome){
        if(biome== RuBiomes.ALPHA_GROVE){
            return RuCommonConfig.TOGGLE_ALPHA_GROVE.get();
        }
        if(biome== RuBiomes.ARID_MOUNTAINS){
            return RuCommonConfig.TOGGLE_ARID_MOUNTAINS.get();
        }
        if(biome== RuBiomes.AUTUMNAL_MAPLE_FOREST){
            return RuCommonConfig.TOGGLE_AUTUMNAL_MAPLE_FOREST.get();
        }
        if(biome== RuBiomes.BAMBOO_FOREST){
            return RuCommonConfig.TOGGLE_BAMBOO_FOREST.get();
        }
        if(biome== RuBiomes.BAOBAB_SAVANNA){
            return RuCommonConfig.TOGGLE_BAOBAB_SAVANNA.get();
        }
        if(biome== RuBiomes.BARLEY_FIELDS){
            return RuCommonConfig.TOGGLE_BARLEY_FIELDS.get();
        }
        if(biome== RuBiomes.BAYOU){
            return RuCommonConfig.TOGGLE_BAYOU.get();
        }
        if(biome== RuBiomes.BLACKSTONE_BASIN){
            return RuCommonConfig.TOGGLE_BLACKSTONE_BASIN.get();
        }
        if(biome== RuBiomes.BLACKWOOD_TAIGA){
            return RuCommonConfig.TOGGLE_BLACKWOOD_TAIGA.get();
        }
        if(biome== RuBiomes.MAGNOLIA_WOODLAND){
            return RuCommonConfig.TOGGLE_MAGNOLIA_WOODLAND.get();
        }
        if(biome== RuBiomes.BOREAL_TAIGA){
            return RuCommonConfig.TOGGLE_BOREAL_TAIGA.get();
        }
        if(biome== RuBiomes.CHALK_CLIFFS){
            return RuCommonConfig.TOGGLE_CHALK_CLIFFS.get();
        }
        if(biome== RuBiomes.COLD_BOREAL_TAIGA){
            return RuCommonConfig.TOGGLE_COLD_BOREAL_TAIGA.get();
        }
        if(biome== RuBiomes.COLD_DECIDUOUS_FOREST){
            return RuCommonConfig.TOGGLE_COLD_DECIDUOUS_FOREST.get();
        }
        if(biome== RuBiomes.COLD_RIVER){
            return RuCommonConfig.TOGGLE_COLD_RIVER.get();
        }
        if(biome== RuBiomes.DECIDUOUS_FOREST){
            return RuCommonConfig.TOGGLE_DECIDUOUS_FOREST.get();
        }
        if(biome== RuBiomes.DRY_BUSHLAND){
            return RuCommonConfig.TOGGLE_DRY_BUSHLAND.get();
        }
        if(biome== RuBiomes.EUCALYPTUS_FOREST){
            return RuCommonConfig.TOGGLE_EUCALYPTUS_FOREST.get();
        }
        if(biome== RuBiomes.FEN){
            return RuCommonConfig.TOGGLE_FEN.get();
        }
        if(biome== RuBiomes.MARSH){
            return RuCommonConfig.TOGGLE_MARSH.get();
        }
        if(biome== RuBiomes.FLOWER_FIELDS){
            return RuCommonConfig.TOGGLE_FLOWER_FIELDS.get();
        }
        if(biome== RuBiomes.FROZEN_PINE_TAIGA){
            return RuCommonConfig.TOGGLE_FROZEN_PINE_TAIGA.get();
        }
        if(biome== RuBiomes.FROZEN_TUNDRA){
            return RuCommonConfig.TOGGLE_FROZEN_TUNDRA.get();
        }
        if(biome== RuBiomes.FUNGAL_FEN){
            return RuCommonConfig.TOGGLE_FUNGAL_FEN.get();
        }
        if(biome== RuBiomes.OLD_GROWTH_BAYOU){
            return RuCommonConfig.TOGGLE_OLD_GROWTH_BAYOU.get();
        }
        if(biome== RuBiomes.GOLDEN_BOREAL_TAIGA){
            return RuCommonConfig.TOGGLE_GOLDEN_BOREAL_TAIGA.get();
        }
        if(biome== RuBiomes.GRASSLAND){
            return RuCommonConfig.TOGGLE_GRASSLAND.get();
        }
        if(biome== RuBiomes.GRASSY_BEACH){
            return RuCommonConfig.TOGGLE_GRASSY_BEACH.get();
        }
        if(biome== RuBiomes.GRAVEL_BEACH){
            return RuCommonConfig.TOGGLE_GRAVEL_BEACH.get();
        }
        if(biome== RuBiomes.HIGHLAND_FIELDS){
            return RuCommonConfig.TOGGLE_HIGHLAND_FIELDS.get();
        }
        if(biome== RuBiomes.HYACINTH_DEEPS){
            return RuCommonConfig.TOGGLE_HYACINTH_DEEPS.get();
        }
        if(biome== RuBiomes.ICY_HEIGHTS){
            return RuCommonConfig.TOGGLE_ICY_HEIGHTS.get();
        }
        if(biome== RuBiomes.JOSHUA_DESERT){
            return RuCommonConfig.TOGGLE_JOSHUA_DESERT.get();
        }
        if(biome== RuBiomes.CLOVER_PLAINS){
            return RuCommonConfig.TOGGLE_CLOVER_PLAINS.get();
        }
        if(biome== RuBiomes.MAPLE_FOREST){
            return RuCommonConfig.TOGGLE_MAPLE_FOREST.get();
        }
        if(biome== RuBiomes.MAUVE_HILLS){
            return RuCommonConfig.TOGGLE_MAUVE_HILLS.get();
        }
        if(biome== RuBiomes.ROCKY_MEADOW){
            return RuCommonConfig.TOGGLE_MEADOW.get();
        }
        if(biome== RuBiomes.MOUNTAINS){
            return RuCommonConfig.TOGGLE_MOUNTAINS.get();
        }
        if(biome== RuBiomes.MUDDY_RIVER){
            return RuCommonConfig.TOGGLE_MUDDY_RIVER.get();
        }
        if(biome== RuBiomes.SPARSE_RAINFOREST){
            return RuCommonConfig.TOGGLE_SPARSE_RAINFOREST.get();
        }
        if(biome== RuBiomes.ORCHARD){
            return RuCommonConfig.TOGGLE_ORCHARD.get();
        }
        if(biome== RuBiomes.OUTBACK){
            return RuCommonConfig.TOGGLE_OUTBACK.get();
        }
        if(biome== RuBiomes.PINE_TAIGA){
            return RuCommonConfig.TOGGLE_PINE_TAIGA.get();
        }
        if(biome== RuBiomes.PINE_SLOPES){
            return RuCommonConfig.TOGGLE_PINE_SLOPES.get();
        }
        if(biome== RuBiomes.POPPY_FIELDS){
            return RuCommonConfig.TOGGLE_POPPY_FIELDS.get();
        }
        if(biome== RuBiomes.PRAIRIE){
            return RuCommonConfig.TOGGLE_PRAIRIE.get();
        }
        if(biome== RuBiomes.PUMPKIN_FIELDS){
            return RuCommonConfig.TOGGLE_PUMPKIN_FIELDS.get();
        }
        if(biome== RuBiomes.RAINFOREST){
            return RuCommonConfig.TOGGLE_RAINFOREST.get();
        }
        if(biome== RuBiomes.REDWOODS){
            return RuCommonConfig.TOGGLE_REDWOODS.get();
        }
        if(biome== RuBiomes.ROCKY_REEF){
            return RuCommonConfig.TOGGLE_ROCKY_REEF.get();
        }
        if(biome== RuBiomes.SAGUARO_DESERT){
            return RuCommonConfig.TOGGLE_SAGUARO_DESERT.get();
        }
        if(biome== RuBiomes.SHRUBLAND){
            return RuCommonConfig.TOGGLE_SHRUBLAND.get();
        }
        if(biome== RuBiomes.SILVER_BIRCH_FOREST){
            return RuCommonConfig.TOGGLE_SILVER_BIRCH_FOREST.get();
        }
        if(biome== RuBiomes.ASHEN_WOODLAND){
            return RuCommonConfig.TOGGLE_ASHEN_WOODLAND.get();
        }
        if(biome== RuBiomes.SPARSE_REDWOODS){
            return RuCommonConfig.TOGGLE_SPARSE_REDWOODS.get();
        }
        if(biome== RuBiomes.SPIRES){
            return RuCommonConfig.TOGGLE_SPIRES.get();
        }
        if(biome== RuBiomes.STEPPE){
            return RuCommonConfig.TOGGLE_STEPPE.get();
        }
        if(biome== RuBiomes.TEMPERATE_GROVE){
            return RuCommonConfig.TOGGLE_TEMPERATE_GROVE.get();
        }
        if(biome== RuBiomes.TOWERING_CLIFFS){
            return RuCommonConfig.TOGGLE_TOWERING_CLIFFS.get();
        }
        if(biome== RuBiomes.TROPICS){
            return RuCommonConfig.TOGGLE_TROPICS.get();
        }
        if(biome== RuBiomes.TROPICAL_RIVER){
            return RuCommonConfig.TOGGLE_TROPICAL_RIVER.get();
        }
        if(biome== RuBiomes.WILLOW_FOREST){
            return RuCommonConfig.TOGGLE_WILLOW_FOREST.get();
        }

        // Nether
        if (biome==RuBiomes.BLACKSTONE_BASIN) {
            return RuCommonConfig.TOGGLE_BLACKSTONE_BASIN.get();
        }
        if (biome==RuBiomes.INFERNAL_HOLT) {
            return RuCommonConfig.TOGGLE_INFERNAL_HOLT.get();
        }
        if (biome==RuBiomes.GLISTERING_MEADOW) {
            return RuCommonConfig.TOGGLE_GLISTERING_MEADOW.get();
        }
        if (biome==RuBiomes.MYCOTOXIC_UNDERGROWTH) {
            return RuCommonConfig.TOGGLE_MYCOTOXIC_UNDERGROWTH.get();
        }
        if (biome==RuBiomes.REDSTONE_ABYSS) {
            return RuCommonConfig.TOGGLE_REDSTONE_ABYSS.get();
        }

        // Caves
        if(biome== RuBiomes.ANCIENT_DELTA){
            return RuCommonConfig.TOGGLE_ANCIENT_DELTA.get();
        }
        if(biome== RuBiomes.BIOSHROOM_CAVES){
            return RuCommonConfig.TOGGLE_BIOSHROOM_CAVES.get();
        }
        if(biome== RuBiomes.PRISMACHASM){
            return RuCommonConfig.TOGGLE_PRISMACHASM.get();
        }
        if(biome== RuBiomes.REDSTONE_CAVES){
            return RuCommonConfig.TOGGLE_REDSTONE_CAVES.get();
        }
        if(biome== RuBiomes.SCORCHING_CAVES){
            return RuCommonConfig.TOGGLE_SCORCHING_CAVES.get();
        }

        return true;
    }

    public static ResourceKey<Biome> getBiome(String id){
        return ResourceKey.create(Registries.BIOME, ResourceLocation.tryParse(id));
    }
}
