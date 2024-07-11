package net.regions_unexplored.world.level.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.OverworldBiomeBuilder;

import java.util.function.Consumer;

public class RegionSecondaryBiomeBuilder {
    public final Climate.Parameter[] temperatures = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.45F),
            Climate.Parameter.span(-0.45F, -0.15F),
            Climate.Parameter.span(-0.15F, 0.2F),
            Climate.Parameter.span(0.2F, 0.55F),
            Climate.Parameter.span(0.55F, 1.0F)
    };

    public final Climate.Parameter[] humidities = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.35F),
            Climate.Parameter.span(-0.35F, -0.1F),
            Climate.Parameter.span(-0.1F, 0.1F),
            Climate.Parameter.span(0.1F, 0.3F),
            Climate.Parameter.span(0.3F, 1.0F)
    };

    public final Climate.Parameter[] erosions = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.78F),
            Climate.Parameter.span(-0.78F, -0.375F),
            Climate.Parameter.span(-0.375F, -0.2225F),
            Climate.Parameter.span(-0.2225F, 0.05F),
            Climate.Parameter.span(0.05F, 0.45F),
            Climate.Parameter.span(0.45F, 0.55F),
            Climate.Parameter.span(0.55F, 1.0F)
    };

    public final Climate.Parameter FULL_RANGE = Climate.Parameter.span(-1.0F, 1.0F);
    public final Climate.Parameter FROZEN_RANGE = this.temperatures[0];
    public final Climate.Parameter UNFROZEN_RANGE = Climate.Parameter.span(this.temperatures[1], this.temperatures[4]);

    public final Climate.Parameter mushroomFieldsContinentalness = Climate.Parameter.span(-1.2F, -1.05F);
    public final Climate.Parameter deepOceanContinentalness = Climate.Parameter.span(-1.05F, -0.455F);
    public final Climate.Parameter oceanContinentalness = Climate.Parameter.span(-0.455F, -0.19F);
    public final Climate.Parameter coastContinentalness = Climate.Parameter.span(-0.19F, -0.11F);
    public final Climate.Parameter inlandContinentalness = Climate.Parameter.span(-0.11F, 0.55F);
    public final Climate.Parameter nearInlandContinentalness = Climate.Parameter.span(-0.11F, 0.03F);
    public final Climate.Parameter midInlandContinentalness = Climate.Parameter.span(0.03F, 0.3F);
    public final Climate.Parameter farInlandContinentalness = Climate.Parameter.span(0.3F, 1.0F);

    public final ResourceKey<Biome>[][] MIDDLE_BIOMES = DefaultBiomes.getSecondaryMiddleBiome();
    public final ResourceKey<Biome>[][] MIDDLE_BIOMES_VARIANT = DefaultBiomes.getSecondaryMiddleBiomeVariant();
    public final ResourceKey<Biome>[][] PLATEAU_BIOMES = DefaultBiomes.getSecondaryPlateauBiome();
    public final ResourceKey<Biome>[][] PLATEAU_BIOMES_VARIANT = DefaultBiomes.getSecondaryPlateauBiomeVariant();
    public final ResourceKey<Biome>[][] SHATTERED_BIOMES = DefaultBiomes.getSecondaryShatteredBiome();
    public final ResourceKey<Biome>[][] RIVER_BIOMES = DefaultBiomes.getSecondaryRiverBiome();
    public final ResourceKey<Biome>[][] RIVER_BIOMES_VARIANT = DefaultBiomes.getSecondaryRiverBiomeVariant();
    public final ResourceKey<Biome>[][] SWAMP_BIOMES = DefaultBiomes.getSecondarySwampBiome();
    public final ResourceKey<Biome>[][] OCEANS = DefaultBiomes.getSecondaryOceanBiome();

    public void addBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder) {
        this.addOffCoastBiomes(builder);
        this.addInlandBiomes(builder);
        this.addUndergroundBiomes(builder);
    }

    public void addOffCoastBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder) {
        this.addSurfaceBiome(builder, this.temperatures[0], this.FULL_RANGE, this.mushroomFieldsContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryIslandBiome(0)) ? DefaultBiomes.getSecondaryIslandBiome(0) :Biomes.MUSHROOM_FIELDS);
        this.addSurfaceBiome(builder, this.temperatures[1], this.FULL_RANGE, this.mushroomFieldsContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryIslandBiome(1)) ? DefaultBiomes.getSecondaryIslandBiome(1) :Biomes.MUSHROOM_FIELDS);
        this.addSurfaceBiome(builder, this.temperatures[2], this.FULL_RANGE, this.mushroomFieldsContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryIslandBiome(2)) ? DefaultBiomes.getSecondaryIslandBiome(2) :Biomes.MUSHROOM_FIELDS);
        this.addSurfaceBiome(builder, this.temperatures[3], this.FULL_RANGE, this.mushroomFieldsContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryIslandBiome(3)) ? DefaultBiomes.getSecondaryIslandBiome(3) :Biomes.MUSHROOM_FIELDS);
        this.addSurfaceBiome(builder, this.temperatures[4], this.FULL_RANGE, this.mushroomFieldsContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryIslandBiome(4)) ? DefaultBiomes.getSecondaryIslandBiome(4) :Biomes.MUSHROOM_FIELDS);

        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter climate$parameter = this.temperatures[i];
            this.addSurfaceBiome(builder, climate$parameter, this.FULL_RANGE, this.deepOceanContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, DefaultBiomes.isBiomeEnabled(this.OCEANS[0][i]) ? this.OCEANS[0][i] : VanillaFallbackBiome.VANILLA_OCEANS[0][i]);
            this.addSurfaceBiome(builder, climate$parameter, this.FULL_RANGE, this.oceanContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, DefaultBiomes.isBiomeEnabled(this.OCEANS[1][i]) ? this.OCEANS[1][i] : VanillaFallbackBiome.VANILLA_OCEANS[0][i]);
        }

    }

    public void addInlandBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder) {
        this.addMidSlice(builder, Climate.Parameter.span(-1.0F, -0.93333334F));
        this.addHighSlice(builder, Climate.Parameter.span(-0.93333334F, -0.7666667F));
        this.addPeaks(builder, Climate.Parameter.span(-0.7666667F, -0.56666666F));
        this.addHighSlice(builder, Climate.Parameter.span(-0.56666666F, -0.4F));
        this.addMidSlice(builder, Climate.Parameter.span(-0.4F, -0.26666668F));
        this.addLowSlice(builder, Climate.Parameter.span(-0.26666668F, -0.05F));
        this.addValleys(builder, Climate.Parameter.span(-0.05F, 0.05F));
        this.addLowSlice(builder, Climate.Parameter.span(0.05F, 0.26666668F));
        this.addMidSlice(builder, Climate.Parameter.span(0.26666668F, 0.4F));
        this.addHighSlice(builder, Climate.Parameter.span(0.4F, 0.56666666F));
        this.addPeaks(builder, Climate.Parameter.span(0.56666666F, 0.7666667F));
        this.addHighSlice(builder, Climate.Parameter.span(0.7666667F, 0.93333334F));
        this.addMidSlice(builder, Climate.Parameter.span(0.93333334F, 1.0F));
    }

    public void addPeaks(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter weirdness) {
        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for(int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrCold = this.pickMiddleBiomeOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> plateauBiome = this.pickPlateauBiome(i, j, weirdness);
                ResourceKey<Biome> shatteredBiome = this.pickShatteredBiome(i, j, weirdness);
                ResourceKey<Biome> maybePickToweringCliffs = this.maybePickToweringCliffsBiome(i, j, weirdness, shatteredBiome);
                ResourceKey<Biome> peakBiomes = this.pickPeakBiome(i, j, weirdness);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[0], weirdness, 0.0F, peakBiomes);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[1], weirdness, 0.0F, middleBiomeOrCold);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[1], weirdness, 0.0F, peakBiomes);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[2], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.midInlandContinentalness, this.erosions[3], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.farInlandContinentalness, this.erosions[3], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[5], weirdness, 0.0F, maybePickToweringCliffs);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, shatteredBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, middleBiome);
            }
        }

    }

    public void addHighSlice(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter weirdness) {
        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for(int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrCold = this.pickMiddleBiomeOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> plateauBiome = this.pickPlateauBiome(i, j, weirdness);
                ResourceKey<Biome> shatteredBiome = this.pickShatteredBiome(i, j, weirdness);
                ResourceKey<Biome> maybePickToweringCliffs = this.maybePickToweringCliffsBiome(i, j, weirdness, middleBiome);
                ResourceKey<Biome> slopeBiome = this.pickSlopeBiome(i, j, weirdness);
                ResourceKey<Biome> peakBiome = this.pickPeakBiome(i, j, weirdness);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, this.erosions[0], weirdness, 0.0F, slopeBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[0], weirdness, 0.0F, peakBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, this.erosions[1], weirdness, 0.0F, middleBiomeOrCold);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[1], weirdness, 0.0F, slopeBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[2], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.midInlandContinentalness, this.erosions[3], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.farInlandContinentalness, this.erosions[3], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[5], weirdness, 0.0F, maybePickToweringCliffs);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, shatteredBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, middleBiome);
            }
        }

    }

    public void addMidSlice(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter weirdness) {
        ResourceKey<Biome> stoneBeachCold = DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryStoneShoreBiome(true)) ? DefaultBiomes.getSecondaryStoneShoreBiome(true) : Biomes.STONY_SHORE;
        ResourceKey<Biome> stoneBeachHot = DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryStoneShoreBiome(false)) ? DefaultBiomes.getSecondaryStoneShoreBiome(false) : Biomes.STONY_SHORE;
        this.addSurfaceBiome(builder, Climate.Parameter.span(this.temperatures[0], this.temperatures[2]), this.FULL_RANGE, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[2]), weirdness, 0.0F, stoneBeachCold);
        this.addSurfaceBiome(builder, Climate.Parameter.span(this.temperatures[3], this.temperatures[4]), this.FULL_RANGE, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[2]), weirdness, 0.0F, stoneBeachHot);

        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for(int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrCold = this.pickMiddleBiomeOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> plateauBiome = this.pickPlateauBiome(i, j, weirdness);
                ResourceKey<Biome> shatteredBiome = this.pickShatteredBiome(i, j, weirdness);
                ResourceKey<Biome> swampBiome = this.pickSwampBiome(i, j);
                ResourceKey<Biome> beachBiome = this.pickBeachBiome(i);
                ResourceKey<Biome> maybePickToweringCliffs = this.maybePickToweringCliffsBiome(i, j, weirdness, middleBiome);
                ResourceKey<Biome> shatteredCoastBiome = this.pickShatteredCoastBiome(i, j, weirdness);
                ResourceKey<Biome> slopeBiome = this.pickSlopeBiome(i, j, weirdness);

                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[0], weirdness, 0.0F, slopeBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.midInlandContinentalness), this.erosions[1], weirdness, 0.0F, middleBiomeOrCold);
                this.addSurfaceBiome(builder, temperature, humidity, this.farInlandContinentalness, this.erosions[1], weirdness, 0.0F, i == 0 ? slopeBiome : plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, this.erosions[2], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.midInlandContinentalness, this.erosions[2], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.farInlandContinentalness, this.erosions[2], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[3], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[3], weirdness, 0.0F, middleBiome);
                if (weirdness.max() < 0L) {
                    this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[4], weirdness, 0.0F, beachBiome);
                    this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                } else {
                    this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                }
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[5], weirdness, 0.0F, shatteredCoastBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, this.erosions[5], weirdness, 0.0F, maybePickToweringCliffs);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, shatteredBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, swampBiome);
                if (weirdness.max() < 0L) {
                    this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, beachBiome);
                } else {
                    this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, middleBiome);
                }
            }
        }

    }

    public void addLowSlice(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter weirdness) {
        ResourceKey<Biome> stoneBeachCold = DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryStoneShoreBiome(true)) ? DefaultBiomes.getSecondaryStoneShoreBiome(true) : Biomes.STONY_SHORE;
        ResourceKey<Biome> stoneBeachHot = DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryStoneShoreBiome(false)) ? DefaultBiomes.getSecondaryStoneShoreBiome(false) : Biomes.STONY_SHORE;
        this.addSurfaceBiome(builder, Climate.Parameter.span(this.temperatures[0], this.temperatures[2]), this.FULL_RANGE, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[2]), weirdness, 0.0F, stoneBeachCold);
        this.addSurfaceBiome(builder, Climate.Parameter.span(this.temperatures[3], this.temperatures[4]), this.FULL_RANGE, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[2]), weirdness, 0.0F, stoneBeachHot);
        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for(int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrCold = this.pickMiddleBiomeOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> swampBiome = this.pickSwampBiome(i, j);
                ResourceKey<Biome> beachBiome = this.pickBeachBiome(i);
                ResourceKey<Biome> maybePickToweringCliffs = this.maybePickToweringCliffsBiome(i, j, weirdness, middleBiome);
                ResourceKey<Biome> shatteredCoastBiome = this.pickShatteredCoastBiome(i, j, weirdness);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiomeOrCold);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, Climate.Parameter.span(this.erosions[3], this.erosions[4]), weirdness, 0.0F, beachBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[5], weirdness, 0.0F, shatteredCoastBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, this.erosions[5], weirdness, 0.0F, maybePickToweringCliffs);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, swampBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, beachBiome);
            }
        }

    }

    public void addValleys(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter weirdness) {
        ResourceKey<Biome> stoneBeachCold = DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryStoneShoreBiome(true)) ? DefaultBiomes.getSecondaryStoneShoreBiome(true) : Biomes.STONY_SHORE;
        ResourceKey<Biome> stoneBeachHot = DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryStoneShoreBiome(false)) ? DefaultBiomes.getSecondaryStoneShoreBiome(false) : Biomes.STONY_SHORE;
        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for(int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> swampBiome = this.pickSwampBiome(i, j);
                ResourceKey<Biome> riverBiome = this.pickRiverBiome(i, j, weirdness);
                ResourceKey<Biome> cliffBiome = this.temperatures[i].max() <= -0.45F ? stoneBeachCold: stoneBeachHot;
                ResourceKey<Biome> maybePickCliff = weirdness.max() < 0L ? cliffBiome : riverBiome;
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, maybePickCliff);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, riverBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[5]), weirdness, 0.0F, riverBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.inlandContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, swampBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, riverBiome);
            }
        }

    }

    public void addUndergroundBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder) {
        this.addUndergroundBiome(builder, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(-1.0F, -0.9F), this.FULL_RANGE, Climate.Parameter.span(-1.0F, 0.0F), 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryCaveBiome(2)) ? DefaultBiomes.getSecondaryCaveBiome(2) : Biomes.LUSH_CAVES);
        this.addUndergroundBiome(builder, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(-1.0F, -0.9F), this.FULL_RANGE, Climate.Parameter.span(0.0F, 1.0F), 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryCaveBiome(7)) ? DefaultBiomes.getSecondaryCaveBiome(7) : Biomes.DRIPSTONE_CAVES);

        this.addUndergroundBiome(builder, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(0.94F, 1.0F), this.FULL_RANGE, Climate.Parameter.span(-1.0F, 0.0F), 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryCaveBiome(6)) ? DefaultBiomes.getSecondaryCaveBiome(6) : Biomes.DRIPSTONE_CAVES);
        this.addUndergroundBiome(builder, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(0.9F, 1.0F), this.FULL_RANGE, Climate.Parameter.span(0.0F, 1.0F), 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryCaveBiome(7)) ? DefaultBiomes.getSecondaryCaveBiome(7) : Biomes.DRIPSTONE_CAVES);

        this.addUndergroundBiome(builder, this.FULL_RANGE, Climate.Parameter.span(-1.0F, -0.8F), this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(-1.0F, 0.0F), 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryCaveBiome(1)) ? DefaultBiomes.getSecondaryCaveBiome(1) : Biomes.LUSH_CAVES);
        this.addUndergroundBiome(builder, this.FULL_RANGE, Climate.Parameter.span(-1.0F, -0.8F), this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(0.0F, 1.0F), 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryCaveBiome(5)) ? DefaultBiomes.getSecondaryCaveBiome(5) :  Biomes.LUSH_CAVES);

        this.addUndergroundBiome(builder, this.FULL_RANGE, Climate.Parameter.span(0.8F, 1.0F), this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(-1.0F, 0.0F), 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryCaveBiome(4)) ? DefaultBiomes.getSecondaryCaveBiome(4) : Biomes.LUSH_CAVES);
        this.addUndergroundBiome(builder, this.FULL_RANGE, Climate.Parameter.span(0.8F, 1.0F), this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(0.0F, 1.0F), 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryCaveBiome(5)) ? DefaultBiomes.getSecondaryCaveBiome(5) : Biomes.LUSH_CAVES);

        this.addBottomBiome(builder, this.FULL_RANGE, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(this.erosions[0], this.erosions[1]), this.FULL_RANGE, 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryCaveBiome(3)) ? DefaultBiomes.getSecondaryCaveBiome(3) : Biomes.DEEP_DARK);
        this.addBottomBiome(builder, this.FULL_RANGE, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(this.erosions[2], this.erosions[3]), this.FULL_RANGE, 0.0F, DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryCaveBiome(8)) ? DefaultBiomes.getSecondaryCaveBiome(8) : Biomes.DEEP_DARK);
    }

    public ResourceKey<Biome> pickMiddleBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        if (weirdness.max() < 0L) {
            if(DefaultBiomes.isBiomeEnabled(this.MIDDLE_BIOMES[temperature][humidity])){
                return this.MIDDLE_BIOMES[temperature][humidity];
            }
            else{
                return VanillaFallbackBiome.VANILLA_MIDDLE_BIOMES[temperature][humidity];
            }
        } else {
            if(this.MIDDLE_BIOMES_VARIANT[temperature][humidity]==null){
                if(DefaultBiomes.isBiomeEnabled(this.MIDDLE_BIOMES[temperature][humidity])){
                    return this.MIDDLE_BIOMES[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_MIDDLE_BIOMES[temperature][humidity];
                }
            }
            else{
                if(DefaultBiomes.isBiomeEnabled(this.MIDDLE_BIOMES_VARIANT[temperature][humidity])){
                    return this.MIDDLE_BIOMES_VARIANT[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_MIDDLE_BIOMES_VARIANT[temperature][humidity];
                }
            }
        }
    }

    public ResourceKey<Biome> pickMiddleBiomeOrSlopeIfCold(int temperature, int humidity, Climate.Parameter weirdness) {
        return temperature == 0 ? this.pickSlopeBiome(temperature, humidity, weirdness) : this.pickMiddleBiome(temperature, humidity, weirdness);
    }

    public ResourceKey<Biome> maybePickToweringCliffsBiome(int temperature, int humidity, Climate.Parameter weirdness, ResourceKey<Biome> fallbackBiome) {
        ResourceKey<Biome> resourceKey = DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryShatteredCliffBiome()) ? DefaultBiomes.getSecondaryShatteredCliffBiome() : Biomes.WINDSWEPT_SAVANNA;
        return temperature > 1 && humidity < 4 && weirdness.max() >= 0L ? resourceKey : fallbackBiome;
    }

    public ResourceKey<Biome> pickShatteredCoastBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        ResourceKey<Biome> resourceKey = weirdness.max() >= 0L ? this.pickMiddleBiome(temperature, humidity, weirdness) : this.pickBeachBiome(temperature);
        return this.maybePickToweringCliffsBiome(temperature, humidity, weirdness, resourceKey);
    }

    public ResourceKey<Biome> pickBeachBiome(int temperature) {
        if (temperature == 0) {
            return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryBeachBiome(temperature)) ? DefaultBiomes.getSecondaryBeachBiome(temperature) : Biomes.SNOWY_BEACH;
        }
        else if (temperature == 1) {
            return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryBeachBiome(temperature)) ? DefaultBiomes.getSecondaryBeachBiome(temperature) : Biomes.BEACH;
        }
        else if (temperature == 2) {
            return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryBeachBiome(temperature)) ? DefaultBiomes.getSecondaryBeachBiome(temperature) : Biomes.BEACH;
        }
        else if (temperature == 3) {
            return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryBeachBiome(temperature)) ? DefaultBiomes.getSecondaryBeachBiome(temperature) : Biomes.BEACH;
        }
        else{
            return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryBeachBiome(temperature)) ? DefaultBiomes.getSecondaryBeachBiome(temperature) : Biomes.BEACH;
        }
    }

    public ResourceKey<Biome> pickPlateauBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        if (weirdness.max() < 0L) {
            if(DefaultBiomes.isBiomeEnabled(this.PLATEAU_BIOMES[temperature][humidity])){
                return this.PLATEAU_BIOMES[temperature][humidity];
            }
            else{
                return VanillaFallbackBiome.VANILLA_PLATEAU_BIOMES[temperature][humidity];
            }
        } else {
            if(this.PLATEAU_BIOMES_VARIANT[temperature][humidity]==null){
                if(DefaultBiomes.isBiomeEnabled(this.PLATEAU_BIOMES[temperature][humidity])){
                    return this.PLATEAU_BIOMES[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_PLATEAU_BIOMES[temperature][humidity];
                }
            }
            else{
                if(DefaultBiomes.isBiomeEnabled(this.PLATEAU_BIOMES_VARIANT[temperature][humidity])){
                    return this.PLATEAU_BIOMES_VARIANT[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_PLATEAU_BIOMES_VARIANT[temperature][humidity];
                }
            }
        }
    }

    public ResourceKey<Biome> pickPeakBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        if (temperature == 0) {
            if(weirdness.max() < 0L) {
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryPeakBiome(temperature)) ? DefaultBiomes.getSecondaryPeakBiome(temperature) : Biomes.JAGGED_PEAKS;
            }
            else{
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryPeakBiomeVariant(temperature)) ? DefaultBiomes.getSecondaryPeakBiomeVariant(temperature) : Biomes.FROZEN_PEAKS;
            }
        }
        else if (temperature == 1) {
            if(weirdness.max() < 0L) {
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryPeakBiome(temperature)) ? DefaultBiomes.getSecondaryPeakBiome(temperature) : Biomes.JAGGED_PEAKS;
            }
            else{
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryPeakBiomeVariant(temperature)) ? DefaultBiomes.getSecondaryPeakBiomeVariant(temperature) : Biomes.FROZEN_PEAKS;
            }
        }
        else if (temperature == 2) {
            if(weirdness.max() < 0L) {
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryPeakBiome(temperature)) ? DefaultBiomes.getSecondaryPeakBiome(temperature) : Biomes.JAGGED_PEAKS;
            }
            else{
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryPeakBiomeVariant(temperature)) ? DefaultBiomes.getSecondaryPeakBiomeVariant(temperature) : Biomes.FROZEN_PEAKS;
            }
        }
        else if (temperature == 3) {
            if(weirdness.max() < 0L) {
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryPeakBiome(temperature)) ? DefaultBiomes.getSecondaryPeakBiome(temperature) : Biomes.STONY_PEAKS;
            }
            else{
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryPeakBiomeVariant(temperature)) ? DefaultBiomes.getSecondaryPeakBiomeVariant(temperature) : Biomes.STONY_PEAKS;
            }
        }
        else{
            if(weirdness.max() < 0L) {
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryPeakBiome(temperature)) ? DefaultBiomes.getSecondaryPeakBiome(temperature) : Biomes.BADLANDS;
            }
            else{
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondaryPeakBiomeVariant(temperature)) ? DefaultBiomes.getSecondaryPeakBiomeVariant(temperature) : Biomes.WOODED_BADLANDS;
            }
        }
    }

    public ResourceKey<Biome> pickSlopeBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        if (temperature == 0) {
            if(weirdness.max() < 0L) {
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondarySlopeBiome(temperature)) ? DefaultBiomes.getSecondarySlopeBiome(temperature) : Biomes.SNOWY_SLOPES;
            }
            else{
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondarySlopeBiomeVariant(temperature)) ? DefaultBiomes.getSecondarySlopeBiomeVariant(temperature) : Biomes.GROVE;
            }
        }
        else if (temperature == 1) {
            if(weirdness.max() < 0L) {
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondarySlopeBiome(temperature)) ? DefaultBiomes.getSecondarySlopeBiome(temperature) : Biomes.GROVE;
            }
            else{
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondarySlopeBiomeVariant(temperature)) ? DefaultBiomes.getSecondarySlopeBiomeVariant(temperature) : Biomes.SNOWY_SLOPES;
            }
        }
        else if (temperature == 2) {
            if(weirdness.max() < 0L) {
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondarySlopeBiome(temperature)) ? DefaultBiomes.getSecondarySlopeBiome(temperature) : Biomes.GROVE;
            }
            else{
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondarySlopeBiomeVariant(temperature)) ? DefaultBiomes.getSecondarySlopeBiomeVariant(temperature) : Biomes.SNOWY_SLOPES;
            }
        }
        else if (temperature == 3) {
            if(weirdness.max() < 0L) {
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondarySlopeBiome(temperature)) ? DefaultBiomes.getSecondarySlopeBiome(temperature) : Biomes.STONY_PEAKS;
            }
            else{
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondarySlopeBiomeVariant(temperature)) ? DefaultBiomes.getSecondarySlopeBiomeVariant(temperature) : Biomes.STONY_PEAKS;
            }
        }
        else{
            if(weirdness.max() < 0L) {
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondarySlopeBiome(temperature)) ? DefaultBiomes.getSecondarySlopeBiome(temperature) : Biomes.SAVANNA;
            }
            else{
                return DefaultBiomes.isBiomeEnabled(DefaultBiomes.getSecondarySlopeBiomeVariant(temperature)) ? DefaultBiomes.getSecondarySlopeBiomeVariant(temperature) : Biomes.SAVANNA;
            }
        }
    }

    public ResourceKey<Biome> pickShatteredBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        ResourceKey<Biome> resourceKey = DefaultBiomes.isBiomeEnabled(this.SHATTERED_BIOMES[temperature][humidity]) ? this.SHATTERED_BIOMES[temperature][humidity] : VanillaFallbackBiome.VANILLA_SHATTERED_BIOMES[temperature][humidity];
        return resourceKey == null ? this.pickMiddleBiome(temperature, humidity, weirdness) : resourceKey;
    }

    public ResourceKey<Biome> pickRiverBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        if (weirdness.max() < 0L) {
            if(DefaultBiomes.isBiomeEnabled(this.RIVER_BIOMES[temperature][humidity])){
                return this.RIVER_BIOMES[temperature][humidity];
            }
            else{
                return VanillaFallbackBiome.VANILLA_RIVER_BIOMES[temperature][humidity];
            }
        } else {
            if(this.RIVER_BIOMES_VARIANT[temperature][humidity]==null){
                if(DefaultBiomes.isBiomeEnabled(this.RIVER_BIOMES[temperature][humidity])){
                    return this.RIVER_BIOMES[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_RIVER_BIOMES[temperature][humidity];
                }
            }
            else{
                if(DefaultBiomes.isBiomeEnabled(this.RIVER_BIOMES_VARIANT[temperature][humidity])){
                    return this.RIVER_BIOMES_VARIANT[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_RIVER_BIOMES_VARIANT[temperature][humidity];
                }
            }
        }
    }

    public ResourceKey<Biome> pickSwampBiome(int temperature, int humidity) {
        if(DefaultBiomes.isBiomeEnabled(this.SWAMP_BIOMES[temperature][humidity])){
            return this.SWAMP_BIOMES[temperature][humidity];
        }
        else{
            return VanillaFallbackBiome.VANILLA_SWAMP_BIOMES[temperature][humidity];
        }
    }

    public void addSurfaceBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome) {
        builder.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(0.0F), weirdness, offset), biome));
        builder.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(1.0F), weirdness, offset), biome));
    }

    public void addUndergroundBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome) {
        builder.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.span(0.24F, 0.9F), weirdness, offset), biome));
    }

    public void addBottomBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome) {
        builder.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(1.1F), weirdness, offset), biome));
    }
}