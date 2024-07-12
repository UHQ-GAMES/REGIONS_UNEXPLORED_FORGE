package net.regions_unexplored.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.data.worldgen.features.*;

public class ConfiguredFeatureRegistry {
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuAquaticFeatures.bootstrap(context);
        RuMiscOverworldFeatures.bootstrap(context);
        RuNetherFeatures.bootstrap(context);
        RuTreeFeatures.bootstrap(context);
        RuVegetationFeatures.bootstrap(context);
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, name));
    }
}
