package net.regions_unexplored.util;

import com.mojang.serialization.Codec;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.mixin.access.BiomeSourceAccess;
import net.regions_unexplored.mixin.access.NoiseBasedChunkGeneratorAccess;
import net.regions_unexplored.mixin.access.NoiseGeneratorSettingsAccess;

/**
 * Credit goes Corgi and the original work from BYG.<br>
 * I (KirboSoftware) simply reworked the class/method to be in line with Regions Unexplored instead of BYG.<br>
 * <a href="https://github.com/AOCAWOL/BYG/blob/1.20.X-Rewrite/Common/src/main/java/potionstudios/byg/util/AddSurfaceRulesUtil.java">Link to original work</a>
 */
public class AddSurfaceRuleUtil {
    public static void appendSurfaceRule(RegistryAccess registryAccess, ResourceKey<LevelStem> levelStemKey, SurfaceRules.RuleSource ruleSource) {
        LevelStem levelStem = registryAccess.registryOrThrow(Registries.LEVEL_STEM).get(levelStemKey);
        if (levelStem == null) {
            RegionsUnexploredMod.LOGGER.info("Error, LevelStem is somehow empty. Fix this!! >:(");
            return;
        }
        ChunkGenerator chunkGenerator = levelStem.generator();

        boolean hasRegionsUnexploredBiome = chunkGenerator.getBiomeSource().possibleBiomes().stream().anyMatch(biomeHolder -> biomeHolder.unwrapKey().orElseThrow().location().getNamespace().equals(RegionsUnexploredMod.MOD_ID));
        if (hasRegionsUnexploredBiome) {
            if (chunkGenerator instanceof NoiseBasedChunkGenerator) {
                NoiseGeneratorSettings noiseGeneratorSettings = ((NoiseBasedChunkGeneratorAccess) chunkGenerator).regions_unexplored$getNoiseGeneratorSettings().value();
                if (levelStemKey == LevelStem.NETHER) {
                    ((NoiseGeneratorSettingsAccess) (Object) noiseGeneratorSettings).regions_unexplored$setSurfaceRule(SurfaceRules.sequence(ruleSource, RegionsUnexploredMod.getSurfaceRules(noiseGeneratorSettings.surfaceRule())));
                } else {
                    ((NoiseGeneratorSettingsAccess) (Object) noiseGeneratorSettings).regions_unexplored$setSurfaceRule(SurfaceRules.sequence(ruleSource, noiseGeneratorSettings.surfaceRule()));
                }
            } else {
                RegionsUnexploredMod.LOGGER.info(String.format("Ignoring Region Unexplored appended surface rule in dimension: \"%s\" because the chunk generator was not an instance of \"NoiseBasedChunkGenerator\".\nThe chunk generator was an instanceof \"%s\".", levelStemKey.location(), chunkGenerator.getClass().getName()));
            }
        }

        Codec<? extends BiomeSource> biomeSourceCodec = ((BiomeSourceAccess) chunkGenerator.getBiomeSource()).regions_unexplored$invokeCodec();
        RegionsUnexploredMod.LOGGER.info(String.format("Loading dimension \"%s\" with biome source: \"%s\".", levelStemKey.location(), BuiltInRegistries.BIOME_SOURCE.getKey(biomeSourceCodec).toString()));
    }
}