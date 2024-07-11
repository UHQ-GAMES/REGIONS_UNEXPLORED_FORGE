package net.regions_unexplored.mixin;

import net.minecraft.core.RegistryAccess;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.progress.ChunkProgressListener;
import net.minecraft.world.level.dimension.LevelStem;
import net.regions_unexplored.data.worldgen.biome.surface.RuSurfaceRuleData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.regions_unexplored.util.AddSurfaceRuleUtil.appendSurfaceRule;

@Mixin(MinecraftServer.class)
public abstract class MinecraftServerMixin {
    @Shadow
    public abstract RegistryAccess.Frozen registryAccess();
    @Inject(method = "createLevels", at = @At("RETURN"))
    private void regions_unexplored$hackyAddSurfaceRules(ChunkProgressListener chunkProgressListener, CallbackInfo ci) {
        appendSurfaceRule(registryAccess(), LevelStem.NETHER, RuSurfaceRuleData.nether());
    }
}