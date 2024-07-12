package net.regions_unexplored.mixin.access;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.biome.BiomeSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(BiomeSource.class)
public interface BiomeSourceAccess {
    @Invoker("codec")
    MapCodec<? extends BiomeSource> regions_unexplored$invokeCodec();
}