package net.regions_unexplored.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.regions_unexplored.data.tags.RuTags;
import net.regions_unexplored.data.worldgen.biome.RuBiomes;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class RuBiomeTagProvider extends BiomeTagsProvider {

    public RuBiomeTagProvider(PackOutput p_255800_, CompletableFuture<HolderLookup.Provider> p_256205_, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_255800_, p_256205_, modId, existingFileHelper);
    }

    public void addTags(HolderLookup.Provider provider) {
        addWolfTags(provider);
        addStructureTags(provider);
        addForgeTags(provider);
        this.tag(BiomeTags.ALLOWS_SURFACE_SLIME_SPAWNS)
                .addOptional(RuBiomes.BAYOU.location())
                .addOptional(RuBiomes.FEN.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
                .addOptional(RuBiomes.MARSH.location())
                .addOptional(RuBiomes.OLD_GROWTH_BAYOU.location())
        ;
        this.tag(BiomeTags.ALLOWS_TROPICAL_FISH_SPAWNS_AT_ANY_HEIGHT)
                .addOptional(RuBiomes.ANCIENT_DELTA.location())
                .addOptional(RuBiomes.BIOSHROOM_CAVES.location())
        ;
        this.tag(BiomeTags.HAS_CLOSER_WATER_FOG)
                .addOptional(RuBiomes.BAYOU.location())
                .addOptional(RuBiomes.FEN.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
                .addOptional(RuBiomes.MARSH.location())
                .addOptional(RuBiomes.OLD_GROWTH_BAYOU.location())
        ;
        this.tag(BiomeTags.INCREASED_FIRE_BURNOUT)
                .addOptional(RuBiomes.BAYOU.location())
                .addOptional(RuBiomes.FEN.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
                .addOptional(RuBiomes.MARSH.location())
                .addOptional(RuBiomes.OLD_GROWTH_BAYOU.location())
                .addOptional(RuBiomes.REDWOODS.location())
                .addOptional(RuBiomes.SPARSE_REDWOODS.location())
                .addOptional(RuBiomes.BAMBOO_FOREST.location())
                .addOptional(RuBiomes.RAINFOREST.location())
                .addOptional(RuBiomes.SPARSE_RAINFOREST.location())
                .addOptional(RuBiomes.EUCALYPTUS_FOREST.location())
                .addOptional(RuBiomes.ROCKY_REEF.location())
        ;
        //this.tag(BiomeTags.IS_BADLANDS);
        this.tag(BiomeTags.IS_BEACH)
                .addOptional(RuBiomes.GRAVEL_BEACH.location())
                .addOptional(RuBiomes.GRASSY_BEACH.location())
        ;
        this.tag(BiomeTags.IS_DEEP_OCEAN)
                .addOptional(RuBiomes.HYACINTH_DEEPS.location())
        ;
        this.tag(BiomeTags.IS_END)
        ;
        this.tag(BiomeTags.IS_FOREST)
                .addOptional(RuBiomes.ALPHA_GROVE.location())
                .addOptional(RuBiomes.AUTUMNAL_MAPLE_FOREST.location())
                .addOptional(RuBiomes.BAMBOO_FOREST.location())
                .addOptional(RuBiomes.MAGNOLIA_WOODLAND.location())
                .addOptional(RuBiomes.DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.MAPLE_FOREST.location())
                .addOptional(RuBiomes.MAUVE_HILLS.location())
                .addOptional(RuBiomes.ORCHARD.location())
                .addOptional(RuBiomes.SILVER_BIRCH_FOREST.location())
                .addOptional(RuBiomes.TEMPERATE_GROVE.location())
                .addOptional(RuBiomes.WILLOW_FOREST.location())
        ;
        this.tag(BiomeTags.IS_HILL)
                .addOptional(RuBiomes.TOWERING_CLIFFS.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
        ;
        this.tag(BiomeTags.IS_JUNGLE)
                .addOptional(RuBiomes.RAINFOREST.location())
                .addOptional(RuBiomes.SPARSE_RAINFOREST.location())
                .addOptional(RuBiomes.EUCALYPTUS_FOREST.location())
        ;
        this.tag(BiomeTags.IS_MOUNTAIN)
                .addOptional(RuBiomes.TOWERING_CLIFFS.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
                .addOptional(RuBiomes.HIGHLAND_FIELDS.location())
                .addOptional(RuBiomes.MOUNTAINS.location())
                .addOptional(RuBiomes.ARID_MOUNTAINS.location())
        ;
        this.tag(BiomeTags.IS_NETHER)
                .addOptional(RuBiomes.MYCOTOXIC_UNDERGROWTH.location())
                .addOptional(RuBiomes.BLACKSTONE_BASIN.location())
                .addOptional(RuBiomes.INFERNAL_HOLT.location())
                .addOptional(RuBiomes.GLISTERING_MEADOW.location())
                .addOptional(RuBiomes.REDSTONE_ABYSS.location())
        ;
        this.tag(BiomeTags.IS_OCEAN)
                .addOptional(RuBiomes.ROCKY_REEF.location())
        ;
        this.tag(BiomeTags.IS_OVERWORLD)
                .addOptional(RuBiomes.AUTUMNAL_MAPLE_FOREST.location())
                .addOptional(RuBiomes.BAMBOO_FOREST.location())
                .addOptional(RuBiomes.MAGNOLIA_WOODLAND.location())
                .addOptional(RuBiomes.DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.MAPLE_FOREST.location())
                .addOptional(RuBiomes.MAUVE_HILLS.location())
                .addOptional(RuBiomes.ORCHARD.location())
                .addOptional(RuBiomes.SILVER_BIRCH_FOREST.location())
                .addOptional(RuBiomes.TEMPERATE_GROVE.location())
                .addOptional(RuBiomes.WILLOW_FOREST.location())
                //TAIGA
                .addOptional(RuBiomes.BLACKWOOD_TAIGA.location())
                .addOptional(RuBiomes.BOREAL_TAIGA.location())
                .addOptional(RuBiomes.GOLDEN_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.PINE_TAIGA.location())
                .addOptional(RuBiomes.REDWOODS.location())
                .addOptional(RuBiomes.SPARSE_REDWOODS.location())
                //PLAINS
                .addOptional(RuBiomes.BARLEY_FIELDS.location())
                .addOptional(RuBiomes.FLOWER_FIELDS.location())
                .addOptional(RuBiomes.GRASSLAND.location())
                .addOptional(RuBiomes.CLOVER_PLAINS.location())
                .addOptional(RuBiomes.ROCKY_MEADOW.location())
                .addOptional(RuBiomes.POPPY_FIELDS.location())
                .addOptional(RuBiomes.PRAIRIE.location())
                .addOptional(RuBiomes.PUMPKIN_FIELDS.location())
                .addOptional(RuBiomes.SHRUBLAND.location())
                //WET
                .addOptional(RuBiomes.BAYOU.location())
                .addOptional(RuBiomes.EUCALYPTUS_FOREST.location())
                .addOptional(RuBiomes.FEN.location())
                .addOptional(RuBiomes.MARSH.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
                .addOptional(RuBiomes.OLD_GROWTH_BAYOU.location())
                .addOptional(RuBiomes.SPARSE_RAINFOREST.location())
                .addOptional(RuBiomes.RAINFOREST.location())
                //ARID
                .addOptional(RuBiomes.BAOBAB_SAVANNA.location())
                .addOptional(RuBiomes.DRY_BUSHLAND.location())
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.OUTBACK.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
                .addOptional(RuBiomes.STEPPE.location())
                //MOUNTAIN
                .addOptional(RuBiomes.ARID_MOUNTAINS.location())
                .addOptional(RuBiomes.HIGHLAND_FIELDS.location())
                .addOptional(RuBiomes.MOUNTAINS.location())
                .addOptional(RuBiomes.PINE_SLOPES.location())
                .addOptional(RuBiomes.TOWERING_CLIFFS.location())
                //COASTAL
                .addOptional(RuBiomes.CHALK_CLIFFS.location())
                .addOptional(RuBiomes.GRASSY_BEACH.location())
                .addOptional(RuBiomes.GRAVEL_BEACH.location())
                //AQUATIC
                .addOptional(RuBiomes.ALPHA_GROVE.location())
                .addOptional(RuBiomes.COLD_RIVER.location())
                .addOptional(RuBiomes.HYACINTH_DEEPS.location())
                .addOptional(RuBiomes.MUDDY_RIVER.location())
                .addOptional(RuBiomes.TROPICAL_RIVER.location())
                .addOptional(RuBiomes.ROCKY_REEF.location())
                .addOptional(RuBiomes.ASHEN_WOODLAND.location())
                .addOptional(RuBiomes.TROPICS.location())
                //FROZEN
                .addOptional(RuBiomes.COLD_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.COLD_DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.FROZEN_PINE_TAIGA.location())
                .addOptional(RuBiomes.FROZEN_TUNDRA.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
                .addOptional(RuBiomes.SPIRES.location())
                //CAVE
                .addOptional(RuBiomes.BIOSHROOM_CAVES.location())
                .addOptional(RuBiomes.ANCIENT_DELTA.location())
                .addOptional(RuBiomes.PRISMACHASM.location())
                .addOptional(RuBiomes.REDSTONE_CAVES.location())
                .addOptional(RuBiomes.SCORCHING_CAVES.location())
        ;
        this.tag(BiomeTags.IS_RIVER)
                .addOptional(RuBiomes.COLD_RIVER.location())
                .addOptional(RuBiomes.MUDDY_RIVER.location())
                .addOptional(RuBiomes.TROPICAL_RIVER.location())
        ;
        this.tag(BiomeTags.IS_SAVANNA)
                .addOptional(RuBiomes.STEPPE.location())
                .addOptional(RuBiomes.BAOBAB_SAVANNA.location())
                .addOptional(RuBiomes.DRY_BUSHLAND.location())
        ;
        this.tag(BiomeTags.IS_TAIGA)
                .addOptional(RuBiomes.BLACKWOOD_TAIGA.location())
                .addOptional(RuBiomes.BOREAL_TAIGA.location())
                .addOptional(RuBiomes.GOLDEN_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.PINE_TAIGA.location())
                .addOptional(RuBiomes.REDWOODS.location())
                .addOptional(RuBiomes.SPARSE_REDWOODS.location())
        ;
        this.tag(BiomeTags.MINESHAFT_BLOCKING)
                .addOptional(RuBiomes.SCORCHING_CAVES.location())
        ;
        this.tag(BiomeTags.MORE_FREQUENT_DROWNED_SPAWNS)
        ;
        this.tag(BiomeTags.PLAYS_UNDERWATER_MUSIC)
        ;
        this.tag(BiomeTags.POLAR_BEARS_SPAWN_ON_ALTERNATE_BLOCKS)
                .addOptional(RuBiomes.FROZEN_TUNDRA.location())
        ;
        this.tag(BiomeTags.PRODUCES_CORALS_FROM_BONEMEAL)
                .addOptional(RuBiomes.TROPICS.location())
                .addOptional(RuBiomes.ROCKY_REEF.location())
        ;
        this.tag(BiomeTags.REDUCED_WATER_AMBIENT_SPAWNS)
        ;
        this.tag(BiomeTags.REQUIRED_OCEAN_MONUMENT_SURROUNDING)
        ;
        this.tag(BiomeTags.SNOW_GOLEM_MELTS)
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
                .addOptional(RuBiomes.OUTBACK.location())
                .addOptional(RuBiomes.ARID_MOUNTAINS.location())
                .addOptional(RuBiomes.STEPPE.location())
                .addOptional(RuBiomes.BAOBAB_SAVANNA.location())
                .addOptional(RuBiomes.DRY_BUSHLAND.location())
        ;
        this.tag(BiomeTags.SPAWNS_COLD_VARIANT_FROGS)
                .addOptional(RuBiomes.SPIRES.location())
                .addOptional(RuBiomes.COLD_DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.COLD_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
                .addOptional(RuBiomes.FROZEN_PINE_TAIGA.location())
                .addOptional(RuBiomes.FROZEN_TUNDRA.location())
        ;
        this.tag(BiomeTags.SPAWNS_GOLD_RABBITS)
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
                .addOptional(RuBiomes.OUTBACK.location())
        ;
        this.tag(BiomeTags.SPAWNS_SNOW_FOXES)
                .addOptional(RuBiomes.SPIRES.location())
                .addOptional(RuBiomes.COLD_DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.COLD_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
                .addOptional(RuBiomes.FROZEN_PINE_TAIGA.location())
                .addOptional(RuBiomes.FROZEN_TUNDRA.location())
        ;
        this.tag(BiomeTags.SPAWNS_WARM_VARIANT_FROGS)
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
                .addOptional(RuBiomes.OUTBACK.location())
                .addOptional(RuBiomes.TROPICS.location())
                .addOptional(RuBiomes.BAMBOO_FOREST.location())
                .addOptional(RuBiomes.OLD_GROWTH_BAYOU.location())
                .addOptional(RuBiomes.MARSH.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
        ;
        this.tag(BiomeTags.SPAWNS_WHITE_RABBITS)
                .addOptional(RuBiomes.SPIRES.location())
                .addOptional(RuBiomes.COLD_DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.COLD_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
                .addOptional(RuBiomes.FROZEN_PINE_TAIGA.location())
                .addOptional(RuBiomes.FROZEN_TUNDRA.location())
        ;
        this.tag(BiomeTags.STRONGHOLD_BIASED_TO)
                .addOptional(RuBiomes.AUTUMNAL_MAPLE_FOREST.location())
                .addOptional(RuBiomes.BAMBOO_FOREST.location())
                .addOptional(RuBiomes.MAGNOLIA_WOODLAND.location())
                .addOptional(RuBiomes.DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.MAPLE_FOREST.location())
                .addOptional(RuBiomes.MAUVE_HILLS.location())
                .addOptional(RuBiomes.ORCHARD.location())
                .addOptional(RuBiomes.SILVER_BIRCH_FOREST.location())
                .addOptional(RuBiomes.TEMPERATE_GROVE.location())
                .addOptional(RuBiomes.WILLOW_FOREST.location())
                //TAIGA
                .addOptional(RuBiomes.BLACKWOOD_TAIGA.location())
                .addOptional(RuBiomes.BOREAL_TAIGA.location())
                .addOptional(RuBiomes.GOLDEN_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.PINE_TAIGA.location())
                .addOptional(RuBiomes.REDWOODS.location())
                .addOptional(RuBiomes.SPARSE_REDWOODS.location())
                //PLAINS
                .addOptional(RuBiomes.BARLEY_FIELDS.location())
                .addOptional(RuBiomes.FLOWER_FIELDS.location())
                .addOptional(RuBiomes.GRASSLAND.location())
                .addOptional(RuBiomes.CLOVER_PLAINS.location())
                .addOptional(RuBiomes.ROCKY_MEADOW.location())
                .addOptional(RuBiomes.POPPY_FIELDS.location())
                .addOptional(RuBiomes.PRAIRIE.location())
                .addOptional(RuBiomes.PUMPKIN_FIELDS.location())
                .addOptional(RuBiomes.SHRUBLAND.location())
                //WET
                .addOptional(RuBiomes.EUCALYPTUS_FOREST.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
                .addOptional(RuBiomes.SPARSE_RAINFOREST.location())
                .addOptional(RuBiomes.RAINFOREST.location())
                //ARID
                .addOptional(RuBiomes.BAOBAB_SAVANNA.location())
                .addOptional(RuBiomes.DRY_BUSHLAND.location())
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.OUTBACK.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
                .addOptional(RuBiomes.STEPPE.location())
                //MOUNTAIN
                .addOptional(RuBiomes.ARID_MOUNTAINS.location())
                .addOptional(RuBiomes.HIGHLAND_FIELDS.location())
                .addOptional(RuBiomes.MOUNTAINS.location())
                .addOptional(RuBiomes.PINE_SLOPES.location())
                .addOptional(RuBiomes.TOWERING_CLIFFS.location())
                //AQUATIC
                .addOptional(RuBiomes.COLD_RIVER.location())
                .addOptional(RuBiomes.MUDDY_RIVER.location())
                .addOptional(RuBiomes.TROPICAL_RIVER.location())
                //FROZEN
                .addOptional(RuBiomes.COLD_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.COLD_DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.FROZEN_PINE_TAIGA.location())
                .addOptional(RuBiomes.FROZEN_TUNDRA.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
                .addOptional(RuBiomes.SPIRES.location())
                //CAVE
                .addOptional(RuBiomes.BIOSHROOM_CAVES.location())
                .addOptional(RuBiomes.ANCIENT_DELTA.location())
                .addOptional(RuBiomes.PRISMACHASM.location())
                .addOptional(RuBiomes.REDSTONE_CAVES.location())
        ;
        this.tag(BiomeTags.WATER_ON_MAP_OUTLINES)
                .addOptional(RuBiomes.BAYOU.location())
                .addOptional(RuBiomes.FEN.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
                .addOptional(RuBiomes.MARSH.location())
                .addOptional(RuBiomes.OLD_GROWTH_BAYOU.location())
        ;
        this.tag(BiomeTags.WITHOUT_PATROL_SPAWNS)
                .addOptional(RuBiomes.TROPICS.location())
                .addOptional(RuBiomes.ALPHA_GROVE.location())
                .addOptional(RuBiomes.ASHEN_WOODLAND.location())
        ;
        this.tag(BiomeTags.WITHOUT_WANDERING_TRADER_SPAWNS)
                .addOptional(RuBiomes.TROPICS.location())
                .addOptional(RuBiomes.ALPHA_GROVE.location())
                .addOptional(RuBiomes.ASHEN_WOODLAND.location())
        ;
        this.tag(BiomeTags.WITHOUT_ZOMBIE_SIEGES)
                .addOptional(RuBiomes.TROPICS.location())
                .addOptional(RuBiomes.ALPHA_GROVE.location())
                .addOptional(RuBiomes.ASHEN_WOODLAND.location())
        ;
    }

    public void addStructureTags(HolderLookup.Provider provider) {
        //this.tag(BiomeTags.HAS_ANCIENT_CITY);
        this.tag(BiomeTags.HAS_BASTION_REMNANT)
                .addOptional(RuBiomes.MYCOTOXIC_UNDERGROWTH.location())
                .addOptional(RuBiomes.BLACKSTONE_BASIN.location())
                .addOptional(RuBiomes.GLISTERING_MEADOW.location())
        ;
        this.tag(BiomeTags.HAS_BURIED_TREASURE)
                .addOptional(RuBiomes.TROPICS.location())
        ;
        this.tag(BiomeTags.HAS_DESERT_PYRAMID)
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
                .addOptional(RuBiomes.OUTBACK.location())
        ;
        //this.tag(BiomeTags.HAS_END_CITY);
        this.tag(BiomeTags.HAS_IGLOO)
                .addOptional(RuBiomes.COLD_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.FROZEN_TUNDRA.location())
                .addOptional(RuBiomes.SPIRES.location())
        ;
        this.tag(BiomeTags.HAS_JUNGLE_TEMPLE)
                .addOptional(RuBiomes.RAINFOREST.location())
                .addOptional(RuBiomes.SPARSE_RAINFOREST.location())
                .addOptional(RuBiomes.EUCALYPTUS_FOREST.location())
                .addOptional(RuBiomes.BAMBOO_FOREST.location())
        ;
        this.tag(BiomeTags.HAS_MINESHAFT)
                .addOptional(RuBiomes.REDSTONE_CAVES.location())
                .addOptional(RuBiomes.GRASSY_BEACH.location())
                .addOptional(RuBiomes.ORCHARD.location())
                .addOptional(RuBiomes.BAMBOO_FOREST.location())
                .addOptional(RuBiomes.BAOBAB_SAVANNA.location())
                .addOptional(RuBiomes.CLOVER_PLAINS.location())
                .addOptional(RuBiomes.FLOWER_FIELDS.location())
                .addOptional(RuBiomes.MAPLE_FOREST.location())
                .addOptional(RuBiomes.MAGNOLIA_WOODLAND.location())
                .addOptional(RuBiomes.CHALK_CLIFFS.location())
                .addOptional(RuBiomes.OLD_GROWTH_BAYOU.location())
                .addOptional(RuBiomes.TROPICS.location())
                .addOptional(RuBiomes.PUMPKIN_FIELDS.location())
                .addOptional(RuBiomes.WILLOW_FOREST.location())
                .addOptional(RuBiomes.RAINFOREST.location())
                .addOptional(RuBiomes.SPARSE_RAINFOREST.location())
                .addOptional(RuBiomes.FEN.location())
                .addOptional(RuBiomes.ALPHA_GROVE.location())
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.STEPPE.location())
                .addOptional(RuBiomes.AUTUMNAL_MAPLE_FOREST.location())
                .addOptional(RuBiomes.TEMPERATE_GROVE.location())
                .addOptional(RuBiomes.GRASSLAND.location())
                .addOptional(RuBiomes.BAYOU.location())
                .addOptional(RuBiomes.BLACKWOOD_TAIGA.location())
                .addOptional(RuBiomes.PRAIRIE.location())
                .addOptional(RuBiomes.BARLEY_FIELDS.location())
                .addOptional(RuBiomes.POPPY_FIELDS.location())
                .addOptional(RuBiomes.HIGHLAND_FIELDS.location())
                .addOptional(RuBiomes.GRAVEL_BEACH.location())
                .addOptional(RuBiomes.BOREAL_TAIGA.location())
                .addOptional(RuBiomes.PINE_TAIGA.location())
                .addOptional(RuBiomes.COLD_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.GOLDEN_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.SILVER_BIRCH_FOREST.location())
                .addOptional(RuBiomes.DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.SHRUBLAND.location())
                .addOptional(RuBiomes.PINE_SLOPES.location())
                .addOptional(RuBiomes.MOUNTAINS.location())
                .addOptional(RuBiomes.REDWOODS.location())
                .addOptional(RuBiomes.SPARSE_REDWOODS.location())
                .addOptional(RuBiomes.EUCALYPTUS_FOREST.location())
                .addOptional(RuBiomes.MAUVE_HILLS.location())
                .addOptional(RuBiomes.MARSH.location())
                .addOptional(RuBiomes.ROCKY_MEADOW.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
                .addOptional(RuBiomes.FROZEN_PINE_TAIGA.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
                .addOptional(RuBiomes.TOWERING_CLIFFS.location())
                .addOptional(RuBiomes.OUTBACK.location())
                .addOptional(RuBiomes.FROZEN_TUNDRA.location())
                .addOptional(RuBiomes.COLD_DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.DRY_BUSHLAND.location())
                .addOptional(RuBiomes.SPIRES.location())
                .addOptional(RuBiomes.ASHEN_WOODLAND.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
        ;
        //this.tag(BiomeTags.HAS_MINESHAFT_MESA);
        //this.tag(BiomeTags.HAS_NETHER_FORTRESS);
        //this.tag(BiomeTags.HAS_NETHER_FOSSIL);
        //this.tag(BiomeTags.HAS_OCEAN_MONUMENT);
        this.tag(BiomeTags.HAS_OCEAN_RUIN_COLD)
                .addOptional(RuBiomes.HYACINTH_DEEPS.location())
        ;
        this.tag(BiomeTags.HAS_OCEAN_RUIN_WARM)
                .addOptional(RuBiomes.ROCKY_REEF.location())
        ;
        this.tag(BiomeTags.HAS_PILLAGER_OUTPOST)
                .addOptional(RuBiomes.POPPY_FIELDS.location())
                .addOptional(RuBiomes.SHRUBLAND.location())
                .addOptional(RuBiomes.GRASSLAND.location())
                .addOptional(RuBiomes.STEPPE.location())
                .addOptional(RuBiomes.PRAIRIE.location())
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.OUTBACK.location())
                .addOptional(RuBiomes.BARLEY_FIELDS.location())
                .addOptional(RuBiomes.FLOWER_FIELDS.location())
                .addOptional(RuBiomes.TEMPERATE_GROVE.location())
                .addOptional(RuBiomes.DRY_BUSHLAND.location())
                .addOptional(RuBiomes.ROCKY_MEADOW.location())
        ;
        this.tag(BiomeTags.HAS_RUINED_PORTAL_DESERT)
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
        ;
        this.tag(BiomeTags.HAS_RUINED_PORTAL_JUNGLE)
                .addOptional(RuBiomes.BAMBOO_FOREST.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
        ;
        this.tag(BiomeTags.HAS_RUINED_PORTAL_MOUNTAIN)
                .addOptional(RuBiomes.CHALK_CLIFFS.location())
        ;
        //this.tag(BiomeTags.HAS_RUINED_PORTAL_NETHER);
        //this.tag(BiomeTags.HAS_RUINED_PORTAL_OCEAN);
        this.tag(BiomeTags.HAS_RUINED_PORTAL_STANDARD)
                .addOptional(RuBiomes.POPPY_FIELDS.location())
                .addOptional(RuBiomes.SHRUBLAND.location())
                .addOptional(RuBiomes.GRASSLAND.location())
                .addOptional(RuBiomes.STEPPE.location())
                .addOptional(RuBiomes.PRAIRIE.location())
                .addOptional(RuBiomes.BARLEY_FIELDS.location())
                .addOptional(RuBiomes.FLOWER_FIELDS.location())
                .addOptional(RuBiomes.ROCKY_MEADOW.location())
                .addOptional(RuBiomes.REDSTONE_CAVES.location())
                .addOptional(RuBiomes.ANCIENT_DELTA.location())
                .addOptional(RuBiomes.PRISMACHASM.location())
                .addOptional(RuBiomes.SCORCHING_CAVES.location())
                .addOptional(RuBiomes.BIOSHROOM_CAVES.location())
        ;
        this.tag(BiomeTags.HAS_RUINED_PORTAL_SWAMP)
                .addOptional(RuBiomes.BAYOU.location())
                .addOptional(RuBiomes.OLD_GROWTH_BAYOU.location())
                .addOptional(RuBiomes.FEN.location())
                .addOptional(RuBiomes.MARSH.location())
        ;
        //this.tag(BiomeTags.HAS_SHIPWRECK);
        //this.tag(BiomeTags.HAS_SHIPWRECK_BEACHED);
        //this.tag(BiomeTags.HAS_STRONGHOLD);
        this.tag(BiomeTags.HAS_SWAMP_HUT)
                .addOptional(RuBiomes.BAYOU.location())
                .addOptional(RuBiomes.FEN.location())
                .addOptional(RuBiomes.MARSH.location())
        ;
        this.tag(BiomeTags.HAS_VILLAGE_DESERT)
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
        ;
        this.tag(BiomeTags.HAS_VILLAGE_PLAINS)
                .addOptional(RuBiomes.GRASSLAND.location())
                .addOptional(RuBiomes.PRAIRIE.location())
                .addOptional(RuBiomes.WILLOW_FOREST.location())
                .addOptional(RuBiomes.TEMPERATE_GROVE.location())
                .addOptional(RuBiomes.HIGHLAND_FIELDS.location())
                .addOptional(RuBiomes.DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.ROCKY_MEADOW.location())
                .addOptional(RuBiomes.EUCALYPTUS_FOREST.location())
        ;
        this.tag(BiomeTags.HAS_VILLAGE_SAVANNA)
                .addOptional(RuBiomes.OUTBACK.location())
                .addOptional(RuBiomes.STEPPE.location())
                .addOptional(RuBiomes.DRY_BUSHLAND.location())
        ;
        this.tag(BiomeTags.HAS_VILLAGE_SNOWY)
                .addOptional(RuBiomes.FROZEN_TUNDRA.location())
                .addOptional(RuBiomes.COLD_BOREAL_TAIGA.location())
        ;
        this.tag(BiomeTags.HAS_VILLAGE_TAIGA)
                .addOptional(RuBiomes.SHRUBLAND.location())
                .addOptional(RuBiomes.BLACKWOOD_TAIGA.location())
                .addOptional(RuBiomes.BOREAL_TAIGA.location())
                .addOptional(RuBiomes.GOLDEN_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.SPARSE_REDWOODS.location())
        ;
        this.tag(BiomeTags.HAS_WOODLAND_MANSION)
                .addOptional(RuBiomes.BLACKWOOD_TAIGA.location())
                .addOptional(RuBiomes.REDWOODS.location())
        ;
    }

    public void addForgeTags(HolderLookup.Provider provider) {
        //is_cold
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_cold/end")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_cold/nether")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_cold/overworld")))
                .addOptional(RuBiomes.AUTUMNAL_MAPLE_FOREST.location())
                .addOptional(RuBiomes.PUMPKIN_FIELDS.location())
                .addOptional(RuBiomes.POPPY_FIELDS.location())
                .addOptional(RuBiomes.HYACINTH_DEEPS.location())
                .addOptional(RuBiomes.SILVER_BIRCH_FOREST.location())
                .addOptional(RuBiomes.BOREAL_TAIGA.location())
                .addOptional(RuBiomes.GOLDEN_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.SPIRES.location())
                .addOptional(RuBiomes.COLD_DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.COLD_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
                .addOptional(RuBiomes.FROZEN_PINE_TAIGA.location())
                .addOptional(RuBiomes.FROZEN_TUNDRA.location())
        ;
        //is_dense
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_dense/end")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_dense/nether")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_dense/overworld")))
                .addOptional(RuBiomes.BLACKWOOD_TAIGA.location())
                .addOptional(RuBiomes.BOREAL_TAIGA.location())
                .addOptional(RuBiomes.GOLDEN_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.REDWOODS.location())
                .addOptional(RuBiomes.BAMBOO_FOREST.location())
                .addOptional(RuBiomes.DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.RAINFOREST.location())
                .addOptional(RuBiomes.SPARSE_RAINFOREST.location())
                .addOptional(RuBiomes.BAYOU.location())
                .addOptional(RuBiomes.OLD_GROWTH_BAYOU.location())
        ;
        //is_dry
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_dry/end")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_dry/nether")))
                .addOptional(RuBiomes.MYCOTOXIC_UNDERGROWTH.location())
                .addOptional(RuBiomes.BLACKSTONE_BASIN.location())
                .addOptional(RuBiomes.INFERNAL_HOLT.location())
                .addOptional(RuBiomes.GLISTERING_MEADOW.location())
                .addOptional(RuBiomes.REDSTONE_ABYSS.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_dry/overworld")))
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
                .addOptional(RuBiomes.OUTBACK.location())
                .addOptional(RuBiomes.ARID_MOUNTAINS.location())
                .addOptional(RuBiomes.STEPPE.location())
                .addOptional(RuBiomes.BAOBAB_SAVANNA.location())
                .addOptional(RuBiomes.DRY_BUSHLAND.location())
        ;
        //is_hot
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_hot/end")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_hot/nether")))
                .addOptional(RuBiomes.MYCOTOXIC_UNDERGROWTH.location())
                .addOptional(RuBiomes.BLACKSTONE_BASIN.location())
                .addOptional(RuBiomes.INFERNAL_HOLT.location())
                .addOptional(RuBiomes.GLISTERING_MEADOW.location())
                .addOptional(RuBiomes.REDSTONE_ABYSS.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_hot/overworld")))
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
                .addOptional(RuBiomes.OUTBACK.location())
                .addOptional(RuBiomes.ARID_MOUNTAINS.location())
                .addOptional(RuBiomes.STEPPE.location())
                .addOptional(RuBiomes.BAOBAB_SAVANNA.location())
                .addOptional(RuBiomes.DRY_BUSHLAND.location())
                .addOptional(RuBiomes.RAINFOREST.location())
                .addOptional(RuBiomes.SPARSE_RAINFOREST.location())
                .addOptional(RuBiomes.GRASSLAND.location())
                .addOptional(RuBiomes.EUCALYPTUS_FOREST.location())
        ;
        //is_sparse
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_sparse/end")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_sparse/nether")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_sparse/overworld")))
                .addOptional(RuBiomes.BAOBAB_SAVANNA.location())
                .addOptional(RuBiomes.DRY_BUSHLAND.location())
                .addOptional(RuBiomes.TEMPERATE_GROVE.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
                .addOptional(RuBiomes.TOWERING_CLIFFS.location())
        ;
        //is_wet
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_wet/end")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_wet/nether")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_wet/overworld")))
                .addOptional(RuBiomes.RAINFOREST.location())
                .addOptional(RuBiomes.SPARSE_RAINFOREST.location())
                .addOptional(RuBiomes.REDWOODS.location())
                .addOptional(RuBiomes.SPARSE_REDWOODS.location())
                .addOptional(RuBiomes.EUCALYPTUS_FOREST.location())
                .addOptional(RuBiomes.BLACKWOOD_TAIGA.location())
        ;
        //other_forge_tags
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_cave")))
                .addOptional(RuBiomes.ANCIENT_DELTA.location())
                .addOptional(RuBiomes.REDSTONE_CAVES.location())
                .addOptional(RuBiomes.PRISMACHASM.location())
                .addOptional(RuBiomes.BIOSHROOM_CAVES.location())
                .addOptional(RuBiomes.SCORCHING_CAVES.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_cold")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_coniferous")))
                .addOptional(RuBiomes.BLACKWOOD_TAIGA.location())
                .addOptional(RuBiomes.BOREAL_TAIGA.location())
                .addOptional(RuBiomes.GOLDEN_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.PINE_TAIGA.location())
                .addOptional(RuBiomes.REDWOODS.location())
                .addOptional(RuBiomes.SPARSE_REDWOODS.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_dense")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_desert")))
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
                .addOptional(RuBiomes.OUTBACK.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_dry")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_hot")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_lush")))
                .addOptional(RuBiomes.ANCIENT_DELTA.location())
                .addOptional(RuBiomes.BIOSHROOM_CAVES.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_mountain")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_mushroom")))
                .addOptional(RuBiomes.BLACKWOOD_TAIGA.location())
                .addOptional(RuBiomes.BIOSHROOM_CAVES.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_peak")))
                .addOptional(RuBiomes.ARID_MOUNTAINS.location())
                .addOptional(RuBiomes.MOUNTAINS.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_plains")))
                .addOptional(RuBiomes.BARLEY_FIELDS.location())
                .addOptional(RuBiomes.FLOWER_FIELDS.location())
                .addOptional(RuBiomes.GRASSLAND.location())
                .addOptional(RuBiomes.CLOVER_PLAINS.location())
                .addOptional(RuBiomes.ROCKY_MEADOW.location())
                .addOptional(RuBiomes.POPPY_FIELDS.location())
                .addOptional(RuBiomes.PRAIRIE.location())
                .addOptional(RuBiomes.PUMPKIN_FIELDS.location())
                .addOptional(RuBiomes.SHRUBLAND.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_plateau")))
                .addOptional(RuBiomes.MAGNOLIA_WOODLAND.location())
                .addOptional(RuBiomes.HIGHLAND_FIELDS.location())
                .addOptional(RuBiomes.STEPPE.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_rare")))
                .addOptional(RuBiomes.ALPHA_GROVE.location())
                .addOptional(RuBiomes.TROPICS.location())
                .addOptional(RuBiomes.ASHEN_WOODLAND.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_sandy")))
                .addOptional(RuBiomes.JOSHUA_DESERT.location())
                .addOptional(RuBiomes.SAGUARO_DESERT.location())
                .addOptional(RuBiomes.OUTBACK.location())
                .addOptional(RuBiomes.GRASSY_BEACH.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_slope")))
                .addOptional(RuBiomes.PINE_SLOPES.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_snowy")))
                .addOptional(RuBiomes.SPIRES.location())
                .addOptional(RuBiomes.COLD_DECIDUOUS_FOREST.location())
                .addOptional(RuBiomes.COLD_BOREAL_TAIGA.location())
                .addOptional(RuBiomes.ICY_HEIGHTS.location())
                .addOptional(RuBiomes.FROZEN_PINE_TAIGA.location())
                .addOptional(RuBiomes.FROZEN_TUNDRA.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_sparse")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_spooky")))
                .addOptional(RuBiomes.BLACKWOOD_TAIGA.location())
                .addOptional(RuBiomes.ASHEN_WOODLAND.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_swamp")))
                .addOptional(RuBiomes.BAYOU.location())
                .addOptional(RuBiomes.FEN.location())
                .addOptional(RuBiomes.FUNGAL_FEN.location())
                .addOptional(RuBiomes.MARSH.location())
                .addOptional(RuBiomes.OLD_GROWTH_BAYOU.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_underground")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_void")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_wasteland")))
                .addOptional(RuBiomes.ASHEN_WOODLAND.location())
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_water")))
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "is_wet")))
        ;
    }

    public void addWolfTags(HolderLookup.Provider provider) {
        //ashen
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "has_wolf_variant/ashen")))
                .addTag(RuTags.HAS_ASHEN_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "has_wolf_variant/ashen")))
                .addTag(RuTags.HAS_ASHEN_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("minecraft", "has_wolf_variant/ashen")))
                .addTag(RuTags.HAS_ASHEN_WOLF)
        ;

        //black
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "has_wolf_variant/black")))
                .addTag(RuTags.HAS_BLACK_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "has_wolf_variant/black")))
                .addTag(RuTags.HAS_ASHEN_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("minecraft", "has_wolf_variant/black")))
                .addTag(RuTags.HAS_BLACK_WOLF)
        ;

        //chestnut
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "has_wolf_variant/chestnut")))
                .addTag(RuTags.HAS_CHESTNUT_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "has_wolf_variant/chestnut")))
                .addTag(RuTags.HAS_CHESTNUT_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("minecraft", "has_wolf_variant/chestnut")))
                .addTag(RuTags.HAS_CHESTNUT_WOLF)
        ;

        //pale
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "has_wolf_variant/pale")))
                .addTag(RuTags.HAS_PALE_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "has_wolf_variant/pale")))
                .addTag(RuTags.HAS_PALE_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("minecraft", "has_wolf_variant/pale")))
                .addTag(RuTags.HAS_PALE_WOLF)
        ;

        //rusty
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "has_wolf_variant/rusty")))
                .addTag(RuTags.HAS_RUSTY_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "has_wolf_variant/rusty")))
                .addTag(RuTags.HAS_RUSTY_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("minecraft", "has_wolf_variant/rusty")))
                .addTag(RuTags.HAS_RUSTY_WOLF)
        ;

        //snowy
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "has_wolf_variant/snowy")))
                .addTag(RuTags.HAS_SNOWY_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "has_wolf_variant/snowy")))
                .addTag(RuTags.HAS_SNOWY_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("minecraft", "has_wolf_variant/snowy")))
                .addTag(RuTags.HAS_SNOWY_WOLF)
        ;

        //spotted
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "has_wolf_variant/spotted")))
                .addTag(RuTags.HAS_SPOTTED_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "has_wolf_variant/spotted")))
                .addTag(RuTags.HAS_SPOTTED_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("minecraft", "has_wolf_variant/spotted")))
                .addTag(RuTags.HAS_SPOTTED_WOLF)
        ;

        //striped
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "has_wolf_variant/striped")))
                .addTag(RuTags.HAS_STRIPED_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "has_wolf_variant/striped")))
                .addTag(RuTags.HAS_STRIPED_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("minecraft", "has_wolf_variant/striped")))
                .addTag(RuTags.HAS_STRIPED_WOLF)
        ;

        //woods
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forge", "has_wolf_variant/woods")))
                .addTag(RuTags.HAS_WOODS_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "has_wolf_variant/woods")))
                .addTag(RuTags.HAS_WOODS_WOLF)
        ;
        this.tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("minecraft", "has_wolf_variant/woods")))
                .addTag(RuTags.HAS_WOODS_WOLF)
        ;


        //local wolf tags
        this.tag(RuTags.HAS_ASHEN_WOLF)
                .add(RuBiomes.CHALK_CLIFFS)
                .add(RuBiomes.COLD_BOREAL_TAIGA)
                .add(RuBiomes.FROZEN_PINE_TAIGA)
                .add(RuBiomes.MOUNTAINS)
                .add(RuBiomes.PINE_SLOPES)
                .add(RuBiomes.TOWERING_CLIFFS)
        ;
        this.tag(RuTags.HAS_BLACK_WOLF)
                .add(RuBiomes.ASHEN_WOODLAND)
                .add(RuBiomes.BLACKWOOD_TAIGA)
                .add(RuBiomes.MAGNOLIA_WOODLAND)
                .add(RuBiomes.PINE_TAIGA)
                .add(RuBiomes.SCORCHING_CAVES)
                .add(RuBiomes.TROPICS)
        ;
        this.tag(RuTags.HAS_CHESTNUT_WOLF)
                .add(RuBiomes.BARLEY_FIELDS)
                .add(RuBiomes.CLOVER_PLAINS)
                .add(RuBiomes.HIGHLAND_FIELDS)
                .add(RuBiomes.POPPY_FIELDS)
                .add(RuBiomes.PRAIRIE)
                .add(RuBiomes.WILLOW_FOREST)
        ;
        this.tag(RuTags.HAS_PALE_WOLF)
                .add(RuBiomes.ALPHA_GROVE)
                .add(RuBiomes.BOREAL_TAIGA)
                .add(RuBiomes.FLOWER_FIELDS)
                .add(RuBiomes.GRASSLAND)
                .add(RuBiomes.MARSH)
                .add(RuBiomes.ROCKY_MEADOW)
                .add(RuBiomes.TEMPERATE_GROVE)
        ;
        this.tag(RuTags.HAS_RUSTY_WOLF)
                .add(RuBiomes.ANCIENT_DELTA)
                .add(RuBiomes.AUTUMNAL_MAPLE_FOREST)
                .add(RuBiomes.BAMBOO_FOREST)
                .add(RuBiomes.BIOSHROOM_CAVES)
                .add(RuBiomes.EUCALYPTUS_FOREST)
                .add(RuBiomes.PUMPKIN_FIELDS)
                .add(RuBiomes.REDWOODS)
                .add(RuBiomes.SPARSE_REDWOODS)
        ;
        this.tag(RuTags.HAS_SNOWY_WOLF)
                .add(RuBiomes.COLD_DECIDUOUS_FOREST)
                .add(RuBiomes.FROZEN_TUNDRA)
                .add(RuBiomes.ICY_HEIGHTS)
                .add(RuBiomes.SHRUBLAND)
                .add(RuBiomes.SPIRES)
        ;
        this.tag(RuTags.HAS_SPOTTED_WOLF)
                .add(RuBiomes.BAOBAB_SAVANNA)
                .add(RuBiomes.FUNGAL_FEN)
                .add(RuBiomes.JOSHUA_DESERT)
                .add(RuBiomes.MAUVE_HILLS)
                .add(RuBiomes.PRISMACHASM)
                .add(RuBiomes.REDSTONE_CAVES)
                .add(RuBiomes.SAGUARO_DESERT)
        ;
        this.tag(RuTags.HAS_STRIPED_WOLF)
                .add(RuBiomes.ARID_MOUNTAINS)
                .add(RuBiomes.DRY_BUSHLAND)
                .add(RuBiomes.OUTBACK)
                .add(RuBiomes.RAINFOREST)
                .add(RuBiomes.ROCKY_REEF)
                .add(RuBiomes.SPARSE_RAINFOREST)
                .add(RuBiomes.STEPPE)
        ;
        this.tag(RuTags.HAS_WOODS_WOLF)
                .add(RuBiomes.BAYOU)
                .add(RuBiomes.DECIDUOUS_FOREST)
                .add(RuBiomes.FEN)
                .add(RuBiomes.GOLDEN_BOREAL_TAIGA)
                .add(RuBiomes.MAPLE_FOREST)
                .add(RuBiomes.OLD_GROWTH_BAYOU)
                .add(RuBiomes.ORCHARD)
                .add(RuBiomes.SILVER_BIRCH_FOREST)
        ;

    }
}
