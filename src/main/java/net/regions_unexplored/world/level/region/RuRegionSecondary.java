package net.regions_unexplored.world.level.region;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.world.level.biome.RegionSecondaryBiomeBuilder;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class RuRegionSecondary extends Region {

    public static final ResourceLocation LOCATION = ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, "secondary");

    public RuRegionSecondary(int weight) {
        super(LOCATION, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper){
        new RegionSecondaryBiomeBuilder().addBiomes(mapper);
    }
}
