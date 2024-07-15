package net.regions_unexplored.data.worldgen.biome.builder;

import net.minecraft.core.HolderGetter;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.sounds.Musics;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.regions_unexplored.data.worldgen.RuBiomeDefaultFeatures;
import net.regions_unexplored.data.worldgen.placement.RuMiscOverworldPlacements;
import net.regions_unexplored.data.worldgen.placement.RuTreePlacements;
import net.regions_unexplored.data.worldgen.placement.RuVegetationPlacements;

public class FrozenBiomes {
    protected static final int NORMAL_WATER_COLOR = 4159204;
    protected static final int NORMAL_WATER_FOG_COLOR = 329011;
    private static final int OVERWORLD_FOG_COLOR = 12638463;

    protected static int calculateSkyColor(float color) {
        float $$1 = color / 3.0F;
        $$1 = Mth.clamp($$1, -1.0F, 1.0F);
        return Mth.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }

    private static MobSpawnSettings.Builder baseFrozenSpawning(boolean hasPolarBearSpawns, boolean hasWolfSpawns) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        if(hasWolfSpawns) spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 10, 2, 3));
        if(hasPolarBearSpawns) spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.POLAR_BEAR, 1, 1, 2));
        BiomeDefaultFeatures.caveSpawns(spawnBuilder);
        BiomeDefaultFeatures.monsters(spawnBuilder, 95, 5, 20, false);
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 80, 4, 4));
        return spawnBuilder;
    }

    private static BiomeGenerationSettings.Builder baseFrozenGeneration(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(featureGetter, carverGetter);
        RuBiomeDefaultFeatures.globalOverworldGeneration(biomeBuilder);
        RuBiomeDefaultFeatures.mediumGrass(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        RuBiomeDefaultFeatures.addDefaultSoftDisks(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);
        return biomeBuilder;
    }
    private static BiomeGenerationSettings.Builder baseFrozenTaigaGeneration(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(featureGetter, carverGetter);
        RuBiomeDefaultFeatures.globalOverworldGeneration(biomeBuilder);
        RuBiomeDefaultFeatures.mediumGrass(biomeBuilder);
        BiomeDefaultFeatures.addFerns(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        RuBiomeDefaultFeatures.addDefaultSoftDisks(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);
        BiomeDefaultFeatures.addCommonBerryBushes(biomeBuilder);
        return biomeBuilder;
    }

    public static Biome coldBorealTaiga(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeSpecialEffects.Builder effectBuilder = (new BiomeSpecialEffects.Builder())
                .skyColor(calculateSkyColor(0.0F))
                .fogColor(OVERWORLD_FOG_COLOR)
                .waterColor(NORMAL_WATER_COLOR)
                .waterFogColor(NORMAL_WATER_FOG_COLOR)
                .foliageColorOverride(-9922472)
                .grassColorOverride(-9917084)
                .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_GROVE));

        //add features
        BiomeGenerationSettings.Builder biomeBuilder = baseFrozenTaigaGeneration(featureGetter, carverGetter);

        //add RU features
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.LARCH_TREE_DENSE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.GOLDEN_LARCH_TREE_SPARSE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.BIRCH_TREE_ASPEN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.OAK_BUSH_SPARSE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuMiscOverworldPlacements.FALLEN_LARCH_TREE);

        RuBiomeDefaultFeatures.addTaigaFlowerPatch(biomeBuilder);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.SNOWBELLE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.LARCH_SHRUB);


        //add mob spawns
        MobSpawnSettings.Builder spawnBuilder = baseFrozenSpawning(false,true);

        return (new Biome.BiomeBuilder())
                .hasPrecipitation(true)
                .temperature(0.0f)
                .downfall(0.6f)
                .specialEffects(effectBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome coldDeciduousForest(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeSpecialEffects.Builder effectBuilder = (new BiomeSpecialEffects.Builder())
                .skyColor(calculateSkyColor(0.0F))
                .fogColor(OVERWORLD_FOG_COLOR)
                .waterColor(NORMAL_WATER_COLOR)
                .waterFogColor(NORMAL_WATER_FOG_COLOR)
                .foliageColorOverride(5614468)
                .grassColorOverride(6732196)
                .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SNOWY_SLOPES));

        //add features
        BiomeGenerationSettings.Builder biomeBuilder = baseFrozenGeneration(featureGetter, carverGetter);

        //add RU features
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.OAK_TREE_WITH_BRANCH);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.BIG_OAK_TREE_SPARSE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.BIG_RED_MAPLE_TREE_SPARSE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.SPRUCE_TREE_TALL_ON_SNOW);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuMiscOverworldPlacements.FALLEN_OAK_TREE_SPARSE);

        RuBiomeDefaultFeatures.bleedingHeart(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.SNOWBELLE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.FERNS);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.SPRUCE_SHRUB);


        //add mob spawns
        MobSpawnSettings.Builder spawnBuilder = baseFrozenSpawning(false, true);

        return (new Biome.BiomeBuilder())
                .hasPrecipitation(true)
                .temperature(-1.5f)
                .downfall(0.8f)
                .specialEffects(effectBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome frozenPineTaiga(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeSpecialEffects.Builder effectBuilder = (new BiomeSpecialEffects.Builder())
                .skyColor(calculateSkyColor(0.0F))
                .fogColor(OVERWORLD_FOG_COLOR)
                .waterColor(NORMAL_WATER_COLOR)
                .waterFogColor(NORMAL_WATER_FOG_COLOR)
                .foliageColorOverride(-9922472)
                .grassColorOverride(-9917084)
                .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_GROVE));

        //add features
        BiomeGenerationSettings.Builder biomeBuilder = baseFrozenTaigaGeneration(featureGetter, carverGetter);

        //add RU features
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.SCOTTS_PINE_TREE_ON_SNOW);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.SCOTTS_PINE_TREE_TALL_ON_SNOW);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.PINE_TREE_SHRUB_ON_SNOW);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuMiscOverworldPlacements.FALLEN_PINE_TREE_ON_DIRT);

        RuBiomeDefaultFeatures.bleedingHeart(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.SNOW_GRASS);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.PINE_SHRUB);


        //add mob spawns
        MobSpawnSettings.Builder spawnBuilder = baseFrozenSpawning(false, true);

        return (new Biome.BiomeBuilder())
                .hasPrecipitation(true)
                .temperature(-0.5f)
                .downfall(0.6f)
                .specialEffects(effectBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome frozenTundra(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeSpecialEffects.Builder effectBuilder = (new BiomeSpecialEffects.Builder())
                .skyColor(calculateSkyColor(0.0F))
                .fogColor(OVERWORLD_FOG_COLOR)
                .waterColor(NORMAL_WATER_COLOR)
                .waterFogColor(NORMAL_WATER_FOG_COLOR)
                .foliageColorOverride(-5207984)
                .grassColorOverride(-5215920)
                .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_GROVE));

        //add features
        BiomeGenerationSettings.Builder biomeBuilder = baseFrozenGeneration(featureGetter, carverGetter);

        //add RU features
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.SPRUCE_TREE_TALL_SPARSE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.OAK_TREE_SHRUB_DENSE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.OAK_BUSH_SINGLE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.SPRUCE_TREE_SHRUB_DENSE);

        RuBiomeDefaultFeatures.bleedingHeart(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.SNOWBELLE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.SNOW_GRASS);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.SPRUCE_SHRUB);


        //add mob spawns
        MobSpawnSettings.Builder spawnBuilder = baseFrozenSpawning(true, false);

        return (new Biome.BiomeBuilder())
                .hasPrecipitation(true)
                .temperature(-1f)
                .downfall(0.0f)
                .specialEffects(effectBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome icyHeights(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeSpecialEffects.Builder effectBuilder = (new BiomeSpecialEffects.Builder())
                .skyColor(calculateSkyColor(0.0F))
                .fogColor(OVERWORLD_FOG_COLOR)
                .waterColor(NORMAL_WATER_COLOR)
                .waterFogColor(NORMAL_WATER_FOG_COLOR)
                .foliageColorOverride(-9913745)
                .grassColorOverride(-9059189)
                .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_FROZEN_PEAKS));

        //add features
        BiomeGenerationSettings.Builder biomeBuilder = baseFrozenGeneration(featureGetter, carverGetter);

        //add RU features
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.SCOTTS_PINE_TREE_MOUNTAIN_ON_SNOW);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.DEAD_SCOTTS_PINE_TREE_MOUNTAIN_ON_SNOW);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.PINE_TREE_SHRUB_ON_SNOW_SPARSE);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuMiscOverworldPlacements.FALLEN_PINE_TREE_ON_SNOW);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuMiscOverworldPlacements.ROCK_ON_SNOW);

        RuBiomeDefaultFeatures.bleedingHeart(biomeBuilder);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.SNOW_GRASS);


        //add mob spawns
        MobSpawnSettings.Builder spawnBuilder = baseFrozenSpawning(false, true);

        return (new Biome.BiomeBuilder())
                .hasPrecipitation(true)
                .temperature(-1f)
                .downfall(0.7f)
                .specialEffects(effectBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome spires(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeSpecialEffects.Builder effectBuilder = (new BiomeSpecialEffects.Builder())
                .skyColor(calculateSkyColor(0.0F))
                .fogColor(OVERWORLD_FOG_COLOR)
                .waterColor(NORMAL_WATER_COLOR)
                .waterFogColor(NORMAL_WATER_FOG_COLOR)
                .foliageColorOverride(-11097502)
                .grassColorOverride(-11097488)
                .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SNOWY_SLOPES));

        //add features
        BiomeGenerationSettings.Builder biomeBuilder = baseFrozenGeneration(featureGetter, carverGetter);

        //add RU features
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuMiscOverworldPlacements.ICICLE_UP);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.ICE_SPIRE);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuTreePlacements.SPRUCE_TREE_TALL_ON_SNOW);

        RuBiomeDefaultFeatures.bleedingHeart(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuVegetationPlacements.SNOW_GRASS);

        //add mob spawns
        MobSpawnSettings.Builder spawnBuilder = baseFrozenSpawning(true, false);

        return (new Biome.BiomeBuilder())
                .hasPrecipitation(true)
                .temperature(-2f)
                .downfall(0.95f)
                .specialEffects(effectBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }
}
