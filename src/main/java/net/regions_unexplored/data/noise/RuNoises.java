package net.regions_unexplored.data.noise;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.regions_unexplored.registry.NoiseRegistry;

public class RuNoises {

    public static final ResourceKey<NormalNoise.NoiseParameters> WEIGHTED = NoiseRegistry.createKey("weighted");
    public static final ResourceKey<NormalNoise.NoiseParameters> SHIELD = NoiseRegistry.createKey("shield");

    public static void bootstrap(BootstrapContext<NormalNoise.NoiseParameters> context) {
        register(context, WEIGHTED, 0, 1.0D);
        register(context, SHIELD, -5, 1.0D, 1.0D, 1.0D);
    }
    private static void register(BootstrapContext<NormalNoise.NoiseParameters> context, ResourceKey<NormalNoise.NoiseParameters> key, int i, double v, double... doubles) {
        context.register(key, new NormalNoise.NoiseParameters(i, v, doubles));
    }
}
