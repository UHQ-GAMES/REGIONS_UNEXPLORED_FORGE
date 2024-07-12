package net.regions_unexplored.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.regions_unexplored.datagen.RuBlockLootTables;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class RuLootTableProvider {
    public static LootTableProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> holderLookup)
    {
        return new LootTableProvider(output, Set.of(), List.of(new LootTableProvider.SubProviderEntry(RuBlockLootTables::new, LootContextParamSets.BLOCK)), holderLookup);
    }
}
