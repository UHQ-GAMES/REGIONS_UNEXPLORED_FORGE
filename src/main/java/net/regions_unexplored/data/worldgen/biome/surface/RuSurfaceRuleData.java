package net.regions_unexplored.data.worldgen.biome.surface;

import com.google.common.collect.ImmutableList;
import net.minecraft.data.worldgen.SurfaceRuleData;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.config.RuCommonConfig;
import net.regions_unexplored.data.noise.RuNoises;
import net.regions_unexplored.data.noise.RuleWeight;
import net.regions_unexplored.data.worldgen.biome.RuBiomes;

public class RuSurfaceRuleData {
    //FILL_BLOCKS
    private static final SurfaceRules.RuleSource AIR = makeStateRule(Blocks.CAVE_AIR);
    private static final SurfaceRules.RuleSource WATER = makeStateRule(Blocks.WATER);
    private static final SurfaceRules.RuleSource LAVA = makeStateRule(Blocks.LAVA);

    //PEAT_BLOCKS
    private static final SurfaceRules.RuleSource PEAT_GRASS_BLOCK = makeStateRule(RuCommonConfig.TOGGLE_CUSTOM_DIRTS.get() ? RuBlocks.PEAT_GRASS_BLOCK.get() : Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource PEAT_COARSE_DIRT = makeStateRule(RuCommonConfig.TOGGLE_CUSTOM_DIRTS.get() ? RuBlocks.PEAT_COARSE_DIRT.get() : Blocks.COARSE_DIRT);
    private static final SurfaceRules.RuleSource PEAT_PODZOL = makeStateRule(RuCommonConfig.TOGGLE_CUSTOM_DIRTS.get() ? RuBlocks.PEAT_PODZOL.get() : Blocks.PODZOL);
    private static final SurfaceRules.RuleSource PEAT_DIRT = makeStateRule(RuCommonConfig.TOGGLE_CUSTOM_DIRTS.get() ? RuBlocks.PEAT_DIRT.get() : Blocks.DIRT);
    private static final SurfaceRules.RuleSource PEAT_MUD = makeStateRule(RuCommonConfig.TOGGLE_CUSTOM_DIRTS.get() ? RuBlocks.PEAT_MUD.get() : Blocks.MUD);

    //SILT_BLOCKS
    private static final SurfaceRules.RuleSource SILT_GRASS_BLOCK = makeStateRule(RuCommonConfig.TOGGLE_CUSTOM_DIRTS.get() ? RuBlocks.SILT_GRASS_BLOCK.get() : Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource SILT_COARSE_DIRT = makeStateRule(RuCommonConfig.TOGGLE_CUSTOM_DIRTS.get() ? RuBlocks.SILT_COARSE_DIRT.get() : Blocks.COARSE_DIRT);
    private static final SurfaceRules.RuleSource SILT_PODZOL = makeStateRule(RuCommonConfig.TOGGLE_CUSTOM_DIRTS.get() ? RuBlocks.SILT_PODZOL.get() : Blocks.PODZOL);
    private static final SurfaceRules.RuleSource SILT_DIRT = makeStateRule(RuCommonConfig.TOGGLE_CUSTOM_DIRTS.get() ? RuBlocks.SILT_DIRT.get() : Blocks.DIRT);
    private static final SurfaceRules.RuleSource SILT_MUD = makeStateRule(RuCommonConfig.TOGGLE_CUSTOM_DIRTS.get() ? RuBlocks.SILT_MUD.get() : Blocks.MUD);

    //DIRT_BLOCKS
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource MOSS_BLOCK = makeStateRule(Blocks.MOSS_BLOCK);
    private static final SurfaceRules.RuleSource MYCELIUM = makeStateRule(Blocks.MYCELIUM);
    private static final SurfaceRules.RuleSource COARSE_DIRT = makeStateRule(Blocks.COARSE_DIRT);
    private static final SurfaceRules.RuleSource PODZOL = makeStateRule(Blocks.PODZOL);
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource MUD = makeStateRule(Blocks.MUD);

    //ASHEN_BLOCKS
    private static final SurfaceRules.RuleSource ASHEN_DIRT = makeStateRule(RuBlocks.ASHEN_DIRT.get());
    private static final SurfaceRules.RuleSource ASH_VENT = makeStateRule(RuBlocks.ASH_VENT.get());

    //ALPHA_BLOCKS
    private static final SurfaceRules.RuleSource ALPHA_GRASS = makeStateRule(RuBlocks.ALPHA_GRASS_BLOCK.get());

    //STONE_BLOCKS
    private static final SurfaceRules.RuleSource ARGILLITE_GRASS_BLOCK = makeStateRule(RuBlocks.ARGILLITE_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource CHALK_GRASS_BLOCK = makeStateRule(RuBlocks.CHALK_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource PRISMOSS = makeStateRule(RuBlocks.PRISMOSS.get());
    private static final SurfaceRules.RuleSource VIRIDESCENT_NYLIUM = makeStateRule(RuBlocks.VIRIDESCENT_NYLIUM.get());
    private static final SurfaceRules.RuleSource DEEPSLATE_PRISMOSS = makeStateRule(RuBlocks.DEEPSLATE_PRISMOSS.get());
    private static final SurfaceRules.RuleSource DEEPSLATE_VIRIDESCENT_NYLIUM = makeStateRule(RuBlocks.DEEPSLATE_VIRIDESCENT_NYLIUM.get());
    private static final SurfaceRules.RuleSource ARGILLITE = makeStateRule(RuBlocks.ARGILLITE.get());
    private static final SurfaceRules.RuleSource CHALK = makeStateRule(RuBlocks.CHALK.get());
    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);
    private static final SurfaceRules.RuleSource CALCITE = makeStateRule(Blocks.STONE);
    private static final SurfaceRules.RuleSource DEEPSLATE = makeStateRule(Blocks.DEEPSLATE);
    private static final SurfaceRules.RuleSource NETHERRACK = makeStateRule(Blocks.NETHERRACK);
    private static final SurfaceRules.RuleSource BLACKSTONE = makeStateRule(Blocks.BLACKSTONE);
    private static final SurfaceRules.RuleSource END_STONE = makeStateRule(Blocks.END_STONE);
    private static final SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);

    //OTHER_STONE_BLOCKS
    private static final SurfaceRules.RuleSource RAW_REDSTONE = makeStateRule(RuBlocks.RAW_REDSTONE_BLOCK.get());
    private static final SurfaceRules.RuleSource TERRACOTTA = makeStateRule(Blocks.TERRACOTTA);
    private static final SurfaceRules.RuleSource ORANGE_TERRACOTTA = makeStateRule(Blocks.ORANGE_TERRACOTTA);
    private static final SurfaceRules.RuleSource WHITE_TERRACOTTA = makeStateRule(Blocks.ORANGE_TERRACOTTA);
    private static final SurfaceRules.RuleSource COBBLESTONE = makeStateRule(Blocks.COBBLESTONE);
    private static final SurfaceRules.RuleSource MOSSY_STONE = makeStateRule(RuBlocks.MOSSY_STONE.get());
    private static final SurfaceRules.RuleSource SANDSTONE = makeStateRule(Blocks.SANDSTONE);
    private static final SurfaceRules.RuleSource RED_SANDSTONE = makeStateRule(Blocks.RED_SANDSTONE);

    //GRAVITY_BLOCKS
    private static final SurfaceRules.RuleSource SAND = makeStateRule(Blocks.SAND);
    private static final SurfaceRules.RuleSource RED_SAND = makeStateRule(Blocks.RED_SAND);
    private static final SurfaceRules.RuleSource GRAVEL = makeStateRule(Blocks.GRAVEL);
    private static final SurfaceRules.RuleSource ASH = makeStateRule(RuBlocks.ASH.get());

    //COLD_BLOCKS
    private static final SurfaceRules.RuleSource SNOW_BLOCK = makeStateRule(Blocks.SNOW_BLOCK);
    private static final SurfaceRules.RuleSource POWDER_SNOW = makeStateRule(Blocks.POWDER_SNOW);
    private static final SurfaceRules.RuleSource ICE = makeStateRule(Blocks.PACKED_ICE);
    private static final SurfaceRules.RuleSource PACKED_ICE = makeStateRule(Blocks.PACKED_ICE);

    //NETHER_BLOCKS
    private static final SurfaceRules.RuleSource BRIMSPROUT_NYLIUM = makeStateRule(RuBlocks.BRIMSPROUT_NYLIUM.get());
    private static final SurfaceRules.RuleSource MYCOTOXIC_NYLIUM = makeStateRule(RuBlocks.MYCOTOXIC_NYLIUM.get());
    private static final SurfaceRules.RuleSource GLISTERING_NYLIUM = makeStateRule(RuBlocks.GLISTERING_NYLIUM.get());
    private static final SurfaceRules.RuleSource GLISTERING_WART = makeStateRule(RuBlocks.GLISTERING_WART.get());
    private static final SurfaceRules.RuleSource COBALT_NYLIUM = makeStateRule(RuBlocks.COBALT_NYLIUM.get());
    private static final SurfaceRules.RuleSource SOUL_SAND = makeStateRule(Blocks.SOUL_SAND);
    private static final SurfaceRules.RuleSource SOUL_SOIL = makeStateRule(Blocks.SOUL_SOIL);
    private static final SurfaceRules.RuleSource BASALT = makeStateRule(Blocks.BASALT);
    private static final SurfaceRules.RuleSource WARPED_WART_BLOCK = makeStateRule(Blocks.WARPED_WART_BLOCK);
    private static final SurfaceRules.RuleSource WARPED_NYLIUM = makeStateRule(Blocks.WARPED_NYLIUM);
    private static final SurfaceRules.RuleSource NETHER_WART_BLOCK = makeStateRule(Blocks.NETHER_WART_BLOCK);
    private static final SurfaceRules.RuleSource CRIMSON_NYLIUM = makeStateRule(Blocks.CRIMSON_NYLIUM);

    //stateRule Method
    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }

    public static SurfaceRules.RuleSource cave() {
        return overworldLike(false, false, true);
    }

    public static SurfaceRules.RuleSource overworld() {
        return overworldLike(true, false, true);
    }

    public static SurfaceRules.RuleSource overworldLike(boolean isSurface, boolean bedrockRoof, boolean bedrockFloor) {
        SurfaceRules.ConditionSource deepslateLevel = SurfaceRules.verticalGradient("deepslate", VerticalAnchor.absolute(0), VerticalAnchor.absolute(8));

        SurfaceRules.ConditionSource yStart63 = SurfaceRules.yStartCheck(VerticalAnchor.absolute(63), -1);
        SurfaceRules.ConditionSource yStart74 = SurfaceRules.yStartCheck(VerticalAnchor.absolute(74), 1);

        SurfaceRules.ConditionSource y60 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(60), 0);
        SurfaceRules.ConditionSource y62 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(62), 0);
        SurfaceRules.ConditionSource y63 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(63), 0);
        SurfaceRules.ConditionSource y97 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(97), 2);
        SurfaceRules.ConditionSource y256 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(256), 0);

        SurfaceRules.ConditionSource surfaceNoise1 = SurfaceRules.noiseCondition(Noises.SURFACE, -0.909D, -0.5454D);
        SurfaceRules.ConditionSource surfaceNoise2 = SurfaceRules.noiseCondition(Noises.SURFACE, -0.1818D, 0.1818D);
        SurfaceRules.ConditionSource surfaceNoise3 = SurfaceRules.noiseCondition(Noises.SURFACE, 0.5454D, 0.909D);

        SurfaceRules.ConditionSource waterBlockCheck = SurfaceRules.waterBlockCheck(0, 0);
        SurfaceRules.ConditionSource waterBlockCheck1 = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.ConditionSource oceanGravelCheck = SurfaceRules.waterStartCheck(-6, -1);

        SurfaceRules.ConditionSource holeCondition = SurfaceRules.hole();
        SurfaceRules.ConditionSource steepCondition = SurfaceRules.steep();

        SurfaceRules.ConditionSource isSandBiome = SurfaceRules.isBiome(RuBiomes.ROCKY_REEF, RuBiomes.TROPICAL_RIVER, RuBiomes.GRASSY_BEACH);
        SurfaceRules.ConditionSource isPeatBiome = SurfaceRules.isBiome(RuBiomes.BAYOU, RuBiomes.FEN, RuBiomes.PINE_TAIGA, RuBiomes.BLACKWOOD_TAIGA, RuBiomes.BOREAL_TAIGA, RuBiomes.COLD_BOREAL_TAIGA, RuBiomes.GOLDEN_BOREAL_TAIGA);
        SurfaceRules.ConditionSource isSiltBiome = SurfaceRules.isBiome(RuBiomes.PUMPKIN_FIELDS, RuBiomes.POPPY_FIELDS, RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.SILVER_BIRCH_FOREST, RuBiomes.TROPICS, RuBiomes.DRY_BUSHLAND, RuBiomes.JOSHUA_DESERT, RuBiomes.BARLEY_FIELDS, RuBiomes.PRAIRIE, RuBiomes.ORCHARD, RuBiomes.STEPPE);
        SurfaceRules.ConditionSource isGrassBiome = SurfaceRules.isBiome(RuBiomes.ANCIENT_DELTA, RuBiomes.BAOBAB_SAVANNA, RuBiomes.BIOSHROOM_CAVES, RuBiomes.DECIDUOUS_FOREST, RuBiomes.FROZEN_TUNDRA, RuBiomes.FUNGAL_FEN, RuBiomes.PRISMACHASM, RuBiomes.REDSTONE_CAVES, RuBiomes.SCORCHING_CAVES);

        SurfaceRules.RuleSource AlphaGrassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(waterBlockCheck, ALPHA_GRASS), DIRT);
        SurfaceRules.RuleSource GrassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(waterBlockCheck, GRASS_BLOCK), DIRT);
        SurfaceRules.RuleSource PeatGrassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(waterBlockCheck, PEAT_GRASS_BLOCK), PEAT_DIRT);
        SurfaceRules.RuleSource SiltGrassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(waterBlockCheck, SILT_GRASS_BLOCK), SILT_DIRT);
        SurfaceRules.RuleSource ChalkSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(waterBlockCheck, CHALK_GRASS_BLOCK), CHALK);
        SurfaceRules.RuleSource ArgilliteSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(waterBlockCheck, ARGILLITE_GRASS_BLOCK), ARGILLITE);
        SurfaceRules.RuleSource ViridescentSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(waterBlockCheck, VIRIDESCENT_NYLIUM), STONE);
        SurfaceRules.RuleSource DeepslateViridescentSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(waterBlockCheck, DEEPSLATE_VIRIDESCENT_NYLIUM), DEEPSLATE);
        SurfaceRules.RuleSource PrismossSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(waterBlockCheck, PRISMOSS), STONE);
        SurfaceRules.RuleSource DeepslatePrismossSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(waterBlockCheck, DEEPSLATE_PRISMOSS), DEEPSLATE);

        SurfaceRules.RuleSource sandWithSandstoneOverhang = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, SANDSTONE), SAND);
        SurfaceRules.RuleSource redSandWithSandstoneOverhang = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, RED_SANDSTONE), RED_SAND);
        SurfaceRules.RuleSource gravelWithStoneOverhang = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, STONE), GRAVEL);

        SurfaceRules.RuleSource powderSnowPatch1 = SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.POWDER_SNOW, 0.45D, 0.58D), SurfaceRules.ifTrue(waterBlockCheck, POWDER_SNOW));
        SurfaceRules.RuleSource powderSnowPatch2 = SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.POWDER_SNOW, 0.35D, 0.6D), SurfaceRules.ifTrue(waterBlockCheck, POWDER_SNOW));


        SurfaceRules.RuleSource deepSurfaceBlocks = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.CHALK_CLIFFS), CHALK),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.ARID_MOUNTAINS, RuBiomes.BAOBAB_SAVANNA), TERRACOTTA)
        );

        SurfaceRules.RuleSource CaveRules = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.sequence(
                        SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.REDSTONE_CAVES), SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D), SurfaceRules.ifTrue(SurfaceRules.noiseCondition(RuNoises.WEIGHTED, RuleWeight.getPercent(40)),RAW_REDSTONE))),

                        SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.BIOSHROOM_CAVES), SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(SurfaceRules.ifTrue(deepslateLevel, DeepslateViridescentSurface), ViridescentSurface))),

                        SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.ANCIENT_DELTA), SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(SurfaceRules.noiseCondition(RuNoises.SHIELD, -0.95D),ArgilliteSurface)), ARGILLITE)),

                        SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.PRISMACHASM),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(
                                        SurfaceRules.ifTrue(deepslateLevel, SurfaceRules.sequence(SurfaceRules.ifTrue(surfaceNoiseAbove(0.5D), DeepslatePrismossSurface), SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, RuleWeight.getPercent(30)), DeepslatePrismossSurface))),
                                        SurfaceRules.sequence(SurfaceRules.ifTrue(surfaceNoiseAbove(0.5D), PrismossSurface), SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, RuleWeight.getPercent(30)), PrismossSurface))))))),

                SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.ANCIENT_DELTA), ARGILLITE))
        );

        SurfaceRules.RuleSource underSurfaceNoTop = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.MOUNTAINS),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(138), 0)),DIRT),
                                SurfaceRules.ifTrue(SurfaceRules.yStartCheck(VerticalAnchor.absolute(186), 0),SNOW_BLOCK),
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.CALCITE, -0.0125D, 0.0125D), CALCITE), STONE)),


                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.ICY_HEIGHTS, RuBiomes.SPIRES), SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0),SNOW_BLOCK)),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.ARID_MOUNTAINS), TERRACOTTA),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.BAOBAB_SAVANNA),
                        SurfaceRules.ifTrue(surfaceNoiseAbove(1.9D), TERRACOTTA)),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.JOSHUA_DESERT), SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D), sandWithSandstoneOverhang)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.SAGUARO_DESERT), sandWithSandstoneOverhang),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.OUTBACK), SurfaceRules.sequence(SurfaceRules.ifTrue(
                                SurfaceRules.noiseCondition(RuNoises.WEIGHTED, RuleWeight.getPercent(20)), TERRACOTTA),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(RuNoises.WEIGHTED, RuleWeight.getPercent(60)), redSandWithSandstoneOverhang))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.ALPHA_GROVE),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(66), 0)),gravelWithStoneOverhang), SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, AlphaGrassSurface), DIRT)),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.TROPICS), SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(64), 0)), sandWithSandstoneOverhang)),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.MUDDY_RIVER),PEAT_MUD),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.COLD_RIVER, RuBiomes.GRAVEL_BEACH), gravelWithStoneOverhang),

                SurfaceRules.ifTrue(isSandBiome, sandWithSandstoneOverhang)
        );

        SurfaceRules.RuleSource underSurface = SurfaceRules.sequence(

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.ICY_HEIGHTS, RuBiomes.SPIRES, RuBiomes.FROZEN_PINE_TAIGA), powderSnowPatch1),

                underSurfaceNoTop,

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.TOWERING_CLIFFS), SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D), STONE)),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.MAPLE_FOREST), SurfaceRules.ifTrue(shieldNoise(1.65D), STONE)),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.HYACINTH_DEEPS), STONE),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.ASHEN_WOODLAND), ASHEN_DIRT),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.OLD_GROWTH_BAYOU), SurfaceRules.sequence(
                        SurfaceRules.ifTrue(surfaceNoiseAbove(-0.95D), MUD),
                        SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(64), 0)),
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D), MUD)))),

                SurfaceRules.ifTrue(isPeatBiome, PEAT_DIRT),
                SurfaceRules.ifTrue(isSiltBiome, SILT_DIRT),
                SurfaceRules.ifTrue(isGrassBiome, DIRT)
        );

        SurfaceRules.RuleSource onSurface = SurfaceRules.sequence(

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.FROZEN_PINE_TAIGA),
                        SurfaceRules.sequence(powderSnowPatch2,
                                SurfaceRules.ifTrue(waterBlockCheck, SNOW_BLOCK))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.FROZEN_TUNDRA),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D), SNOW_BLOCK)),

                underSurfaceNoTop,

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.TOWERING_CLIFFS),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D), SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.25D), COBBLESTONE),
                                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D), GRAVEL),STONE)),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(-0.5D), SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.25D), GRASS_BLOCK),
                                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, -0.25D), COARSE_DIRT),
                                        COBBLESTONE)))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.MAPLE_FOREST),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(shieldNoise(1.65D), SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.25D), STONE),
                                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D), MOSSY_STONE),STONE)),
                                SurfaceRules.ifTrue(shieldNoise(0.0D), SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.25D), GRASS_BLOCK),
                                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, -0.25D), COARSE_DIRT),MOSSY_STONE)))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.DECIDUOUS_FOREST),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D), COARSE_DIRT),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(-0.95D), PODZOL))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.PINE_TAIGA),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D), PEAT_COARSE_DIRT),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(-0.95D), PEAT_PODZOL))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.PUMPKIN_FIELDS), SurfaceRules.ifTrue(surfaceNoiseAbove(-1.75D), SILT_PODZOL)),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.POPPY_FIELDS),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(RuNoises.WEIGHTED, RuleWeight.getPercent(50)), SILT_COARSE_DIRT)),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.DRY_BUSHLAND),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, RuleWeight.getPercent(30)), SILT_COARSE_DIRT)),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.FEN),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(surfaceNoiseAbove(1.1D), PEAT_COARSE_DIRT))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.FUNGAL_FEN),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D), MYCELIUM),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(-0.5D), SurfaceRules.ifTrue(SurfaceRules.noiseCondition(RuNoises.WEIGHTED, 0.1D), MYCELIUM)))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.ASHEN_WOODLAND),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, -0.25D), ASHEN_DIRT),
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(RuNoises.WEIGHTED, RuleWeight.getPercent(4)), ASH_VENT), ASH)),//BA

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.BAYOU),
                        SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(64), 0)), SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D), PEAT_MUD))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.OLD_GROWTH_BAYOU),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(surfaceNoiseAbove(-0.95D), MUD), SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D), MUD))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.TROPICS),
                        SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(65), 0)),
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D), sandWithSandstoneOverhang))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.BAOBAB_SAVANNA), SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D), COARSE_DIRT)),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.PINE_SLOPES), COARSE_DIRT),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.REDWOODS), PODZOL),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.CHALK_CLIFFS), ChalkSurface),
                SurfaceRules.ifTrue(isPeatBiome, PeatGrassSurface),
                SurfaceRules.ifTrue(isSiltBiome, SiltGrassSurface),
                SurfaceRules.ifTrue(isGrassBiome, GrassSurface)
        );

        SurfaceRules.RuleSource buildSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(

                        SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.FEN),
                                SurfaceRules.ifTrue(y62,
                                        SurfaceRules.ifTrue(SurfaceRules.not(y63), SurfaceRules.ifTrue(SurfaceRules.noiseCondition(RuNoises.WEIGHTED, 0.0D), WATER))))

                )),

                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(
                        SurfaceRules.ifTrue(waterBlockCheck1, onSurface),

                        SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.HYACINTH_DEEPS),
                                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, RuleWeight.getPercent(30)), MOSSY_STONE), GRAVEL))
                )),

                SurfaceRules.ifTrue(oceanGravelCheck, SurfaceRules.sequence(
                        //Comment Out for future Use
                        /*SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(*ocean biome here*, SurfaceRules.ifTrue(holeCondition, WATER))),*/

                        SurfaceRules.ifTrue(SurfaceRules.VERY_DEEP_UNDER_FLOOR, deepSurfaceBlocks),

                        SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, underSurface),

                        SurfaceRules.ifTrue(SurfaceRules.DEEP_UNDER_FLOOR, SurfaceRules.ifTrue(isSandBiome, SANDSTONE)),

                        SurfaceRules.ifTrue(SurfaceRules.VERY_DEEP_UNDER_FLOOR, SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.SAGUARO_DESERT), SANDSTONE),
                                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.ICY_HEIGHTS, RuBiomes.SPIRES), PACKED_ICE))))),

                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(
                        SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.FROZEN_PEAKS, Biomes.JAGGED_PEAKS), STONE),

                        SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.ROCKY_REEF), sandWithSandstoneOverhang)))
        );

        ImmutableList.Builder<SurfaceRules.RuleSource> builder = ImmutableList.builder();

        if (bedrockRoof) {
            builder.add(SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.verticalGradient("bedrock_roof", VerticalAnchor.belowTop(5), VerticalAnchor.top())), BEDROCK));
        }

        if (bedrockFloor) {
            builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), BEDROCK));
        }

        SurfaceRules.RuleSource surfaceBlocks = SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(), buildSurface);

        builder.add(isSurface ? surfaceBlocks : buildSurface);
        builder.add(CaveRules);
        builder.add(SurfaceRules.ifTrue(deepslateLevel, DEEPSLATE));

        return SurfaceRules.sequence(builder.build().toArray((rules) -> {
            return new SurfaceRules.RuleSource[rules];
        }));
    }

    public static SurfaceRules.RuleSource nether() {
        SurfaceRules.ConditionSource above31 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(31), 0);
        SurfaceRules.ConditionSource above32 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(32), 0);
        SurfaceRules.ConditionSource start30 = SurfaceRules.yStartCheck(VerticalAnchor.absolute(30), 0);
        SurfaceRules.ConditionSource end35 = SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(35), 0));
        SurfaceRules.ConditionSource belowTop5 = SurfaceRules.yBlockCheck(VerticalAnchor.belowTop(5), 0);
        SurfaceRules.ConditionSource hole = SurfaceRules.hole();
        SurfaceRules.ConditionSource soulSandLayerNoise = SurfaceRules.noiseCondition(Noises.SOUL_SAND_LAYER, -0.012D);
        SurfaceRules.ConditionSource gravelLayerNoise = SurfaceRules.noiseCondition(Noises.GRAVEL_LAYER, -0.012D);
        SurfaceRules.ConditionSource patchNoise = SurfaceRules.noiseCondition(Noises.PATCH, -0.012D);
        SurfaceRules.ConditionSource netherrackNoise = SurfaceRules.noiseCondition(Noises.NETHERRACK, 0.54D);
        SurfaceRules.ConditionSource wartNoise = SurfaceRules.noiseCondition(Noises.NETHER_WART, 1.17D);
        SurfaceRules.ConditionSource stateSelectorNoise = SurfaceRules.noiseCondition(Noises.NETHER_STATE_SELECTOR, 0.0D);
        SurfaceRules.RuleSource gravelPatch =
                SurfaceRules.ifTrue(patchNoise,
                        SurfaceRules.ifTrue(start30,
                                SurfaceRules.ifTrue(end35, GRAVEL)));

        return SurfaceRules.sequence(
                //Nether Roof/Floor
                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), BEDROCK),
                SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.verticalGradient("bedrock_roof", VerticalAnchor.belowTop(5), VerticalAnchor.top())), BEDROCK),
                SurfaceRules.ifTrue(belowTop5, NETHERRACK),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.INFERNAL_HOLT), SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, SurfaceRules.ifTrue(stateSelectorNoise, SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.UNDER_FLOOR), BLACKSTONE))), SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.ifTrue(netherrackNoise, BLACKSTONE)))),

                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                        SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.not(above32), SurfaceRules.ifTrue(hole, LAVA)),

                                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.BLACKSTONE_BASIN), SurfaceRules.sequence(SurfaceRules.ifTrue(netherrackNoise, BLACKSTONE), SurfaceRules.ifTrue(above31, COBALT_NYLIUM))),

                                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.GLISTERING_MEADOW), SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.noiseCondition(Noises.NETHERRACK, 0.45D)), SurfaceRules.ifTrue(above31, SurfaceRules.sequence(SurfaceRules.ifTrue(wartNoise, GLISTERING_WART), GLISTERING_NYLIUM)))),

                                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.MYCOTOXIC_UNDERGROWTH), SurfaceRules.ifTrue(SurfaceRules.not(netherrackNoise), SurfaceRules.ifTrue(above31, SurfaceRules.sequence(SurfaceRules.ifTrue(wartNoise, NETHERRACK), MYCOTOXIC_NYLIUM)))),

                                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.INFERNAL_HOLT), SurfaceRules.sequence(SurfaceRules.ifTrue(netherrackNoise, BLACKSTONE), SurfaceRules.ifTrue(above31, BRIMSPROUT_NYLIUM))))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.BLACKSTONE_BASIN), SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, SurfaceRules.ifTrue(stateSelectorNoise, BLACKSTONE)), SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, BLACKSTONE))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(RuBiomes.REDSTONE_ABYSS), SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.ifTrue(soulSandLayerNoise, SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.not(hole), SurfaceRules.ifTrue(start30, SurfaceRules.ifTrue(end35, SOUL_SAND))), NETHERRACK))), SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(above31, SurfaceRules.ifTrue(end35, SurfaceRules.ifTrue(gravelLayerNoise, SurfaceRules.sequence(SurfaceRules.ifTrue(above32, GRAVEL), SurfaceRules.ifTrue(SurfaceRules.not(hole), GRAVEL)))))))));
    }

    public static SurfaceRules.RuleSource end() {return END_STONE;}

    public static SurfaceRules.RuleSource air() {
        return AIR;
    }

    private static SurfaceRules.ConditionSource surfaceNoiseAbove(double p_194809_) {
        return SurfaceRules.noiseCondition(Noises.SURFACE, p_194809_ / 8.25D, Double.MAX_VALUE);
    }

    private static SurfaceRules.ConditionSource shieldNoise(double noise) {
        return SurfaceRules.noiseCondition(RuNoises.SHIELD, noise / 8.25D, Double.MAX_VALUE);
    }

}