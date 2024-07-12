package net.regions_unexplored.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.data.noise.RuNoises;
import net.regions_unexplored.datagen.provider.*;
import net.regions_unexplored.entity.RuDamageTypes;
import net.regions_unexplored.registry.BiomeRegistry;
import net.regions_unexplored.registry.ConfiguredFeatureRegistry;
import net.regions_unexplored.registry.PlacedFeatureRegistry;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber( modid = RegionsUnexploredMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {

    private static final RegistrySetBuilder BOOTSTRAPS = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ConfiguredFeatureRegistry::bootstrap)
            .add(Registries.PLACED_FEATURE, PlacedFeatureRegistry::bootstrap)
            .add(Registries.BIOME, BiomeRegistry::bootstrap)
            .add(Registries.NOISE, RuNoises::bootstrap)
            .add(Registries.DAMAGE_TYPE, RuDamageTypes::bootstrap)
            ;

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> holder = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new DatapackBuiltinEntriesProvider(packOutput, event.getLookupProvider(), BOOTSTRAPS, Set.of(RegionsUnexploredMod.MOD_ID)));


        generator.addProvider(true, new RuAdvancementProvider(packOutput, event.getLookupProvider(), existingFileHelper));

        generator.addProvider(event.includeServer(), new RuBlockModelProvider(packOutput, RegionsUnexploredMod.MOD_ID, existingFileHelper));

        generator.addProvider(true, new RuRecipeProvider(packOutput, holder));
        generator.addProvider(true, RuLootTableProvider.create(packOutput, holder));
        generator.addProvider(true, new RuLanguageProvider(packOutput));

        //tags
        TagsProvider<Block> blockTagsProvider = generator.addProvider(event.includeServer(), new RuBlockTagProvider(packOutput, event.getLookupProvider(), RegionsUnexploredMod.MOD_ID, existingFileHelper));
        TagsProvider<Item> itemTagsProvider = generator.addProvider(event.includeServer(), new RuItemTagProvider(packOutput, event.getLookupProvider(), blockTagsProvider.contentsGetter(),  RegionsUnexploredMod.MOD_ID, existingFileHelper));
        TagsProvider<Biome> biomeTagsProvider = generator.addProvider(event.includeServer(), new RuBiomeTagProvider(packOutput, event.getLookupProvider(), RegionsUnexploredMod.MOD_ID, existingFileHelper));

    }
}
