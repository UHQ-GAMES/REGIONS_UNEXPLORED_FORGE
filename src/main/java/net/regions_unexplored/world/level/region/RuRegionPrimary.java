package net.regions_unexplored.world.level.region;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.world.level.biome.RegionPrimaryBiomeBuilder;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class RuRegionPrimary extends Region {
    public static final ResourceLocation LOCATION = ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, "primary");

    public RuRegionPrimary(int weight) {
        super(LOCATION, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        new RegionPrimaryBiomeBuilder().addBiomes(mapper);
    }
}