package net.regions_unexplored.data.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeManager;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.OverworldBiomeBuilder;
import net.minecraft.world.level.block.Block;
import net.regions_unexplored.RegionsUnexploredMod;

public class RuTags {
    public static final TagKey<Block> BRANCHES_CAN_SURVIVE_ON = createBlock("branches_can_survive_on");
    public static final TagKey<Block> BRIM_PLANT_CAN_SURVIVE_ON = createBlock("brim_plant_can_survive_on");
    public static final TagKey<Block> CATTAIL_CAN_SURVIVE_ON = createBlock("cattail_can_survive_on");
    public static final TagKey<Block> SANDY_PLANT_CAN_SURVIVE_ON = createBlock("sandy_plant_can_survive_on");
    public static final TagKey<Block> SHRUB_CAN_SURVIVE_ON = createBlock("shrub_can_survive_on");
    public static final TagKey<Block> SNOW_PLANT_CAN_SURVIVE_ON = createBlock("snow_plant_can_survive_on");
    public static final TagKey<Block> STONE_PLANT_CAN_SURVIVE_ON = createBlock("stone_plant_can_survive_on");
    public static final TagKey<Block> BIOSHROOM_GROW_BLOCK = createBlock("bioshroom_grow_block");
    public static final TagKey<Block> REPLACEABLE_BLOCKS = createBlock("replaceable_blocks");
    public static final TagKey<Block> PRISMARITE_CRYSTALS = createBlock("prismarite_crystals");
    public static final TagKey<Block> SNOWBELLE = createBlock("snowbelle");
    public static final TagKey<Block> GRASS = createBlock("grass");
    public static final TagKey<Block> SHRUBS = createBlock("shrubs");
    public static final TagKey<Block> TREE_GRASS_REPLACEABLES = createBlock("tree_grass_replaceables");
    public static final TagKey<Block> ASH = createBlock("ash");
    public static final TagKey<Block> BRANCHES = createBlock("branches");
    public static final TagKey<Block> CROP_PLANTABLE_BLOCKS = createBlock("crop_plantable_blocks");

    public static final TagKey<Block> HYACINTH_BLOOMS = createBlock("hyacinth_blooms");
    public static final TagKey<Block> BAMBOO_LOGS = createBlock("bamboo_logs");
    public static final TagKey<Block> BAOBAB_LOGS = createBlock("baobab_logs");
    public static final TagKey<Block> BLACKWOOD_LOGS = createBlock("blackwood_logs");
    public static final TagKey<Block> BLUE_BIOSHROOM_LOGS = createBlock("blue_bioshroom_logs");
    public static final TagKey<Block> BRIMWOOD_LOGS = createBlock("brimwood_logs");
    public static final TagKey<Block> COBALT_LOGS = createBlock("cobalt_logs");
    public static final TagKey<Block> CYPRESS_LOGS = createBlock("cypress_logs");
    public static final TagKey<Block> DEAD_LOGS = createBlock("dead_logs");
    public static final TagKey<Block> EUCALYPTUS_LOGS = createBlock("eucalyptus_logs");
    public static final TagKey<Block> GREEN_BIOSHROOM_LOGS = createBlock("green_bioshroom_logs");
    public static final TagKey<Block> JOSHUA_LOGS = createBlock("joshua_logs");
    public static final TagKey<Block> KAPOK_LOGS = createBlock("kapok_logs");
    public static final TagKey<Block> LARCH_LOGS = createBlock("larch_logs");
    public static final TagKey<Block> MAGNOLIA_LOGS = createBlock("magnolia_logs");
    public static final TagKey<Block> MAPLE_LOGS = createBlock("maple_logs");
    public static final TagKey<Block> MAUVE_LOGS = createBlock("mauve_logs");
    public static final TagKey<Block> PALM_LOGS = createBlock("palm_logs");
    public static final TagKey<Block> PINE_LOGS = createBlock("pine_logs");
    public static final TagKey<Block> PINK_BIOSHROOM_LOGS = createBlock("pink_bioshroom_logs");
    public static final TagKey<Block> REDWOOD_LOGS = createBlock("redwood_logs");
    public static final TagKey<Block> SOCOTRA_LOGS = createBlock("socotra_logs");
    public static final TagKey<Block> WILLOW_LOGS = createBlock("willow_logs");
    public static final TagKey<Block> YELLOW_BIOSHROOM_LOGS = createBlock("yellow_bioshroom_logs");
    //items
    public static final TagKey<Item> PRISMARITE_CRYSTALS_ITEM = createItem("prismarite_crystals");
    public static final TagKey<Item> BIOSHROOMS_ITEM = createItem("bioshrooms");
    public static final TagKey<Item> LOGS_ITEM = createItem("logs");
    public static final TagKey<Item> SNOWBELLE_ITEM = createItem("snowbelle");
    public static final TagKey<Item> GRASS_ITEM = createItem("grass");
    public static final TagKey<Item> SHRUBS_ITEM = createItem("shrubs");
    public static final TagKey<Item> ASH_ITEM = createItem("ash");
    public static final TagKey<Item> BRANCHES_ITEM = createItem("branches");

    public static final TagKey<Item> HYACINTH_BLOOMS_ITEM = createItem("hyacinth_blooms");
    public static final TagKey<Item> BAMBOO_LOGS_ITEM = createItem("bamboo_logs");
    public static final TagKey<Item> BAOBAB_LOGS_ITEM = createItem("baobab_logs");
    public static final TagKey<Item> BLACKWOOD_LOGS_ITEM = createItem("blackwood_logs");
    public static final TagKey<Item> BLUE_BIOSHROOM_LOGS_ITEM = createItem("blue_bioshroom_logs");
    public static final TagKey<Item> BRIMWOOD_LOGS_ITEM = createItem("brimwood_logs");
    public static final TagKey<Item> COBALT_LOGS_ITEM = createItem("cobalt_logs");
    public static final TagKey<Item> CYPRESS_LOGS_ITEM = createItem("cypress_logs");
    public static final TagKey<Item> DEAD_LOGS_ITEM = createItem("dead_logs");
    public static final TagKey<Item> EUCALYPTUS_LOGS_ITEM = createItem("eucalyptus_logs");
    public static final TagKey<Item> GREEN_BIOSHROOM_LOGS_ITEM = createItem("green_bioshroom_logs");
    public static final TagKey<Item> JOSHUA_LOGS_ITEM = createItem("joshua_logs");
    public static final TagKey<Item> KAPOK_LOGS_ITEM = createItem("kapok_logs");
    public static final TagKey<Item> LARCH_LOGS_ITEM = createItem("larch_logs");
    public static final TagKey<Item> MAGNOLIA_LOGS_ITEM = createItem("magnolia_logs_item");
    public static final TagKey<Item> MAPLE_LOGS_ITEM = createItem("maple_logs");
    public static final TagKey<Item> MAUVE_LOGS_ITEM = createItem("mauve_logs");
    public static final TagKey<Item> PALM_LOGS_ITEM = createItem("palm_logs");
    public static final TagKey<Item> PINE_LOGS_ITEM = createItem("pine_logs");
    public static final TagKey<Item> PINK_BIOSHROOM_LOGS_ITEM = createItem("pink_bioshroom_logs");
    public static final TagKey<Item> REDWOOD_LOGS_ITEM = createItem("redwood_logs");
    public static final TagKey<Item> SOCOTRA_LOGS_ITEM = createItem("socotra_logs");
    public static final TagKey<Item> WILLOW_LOGS_ITEM = createItem("willow_logs");
    public static final TagKey<Item> YELLOW_BIOSHROOM_LOGS_ITEM = createItem("yellow_bioshroom_logs");

    public static final TagKey<Biome> HAS_ASHEN_WOLF = createBiome("has_wolf_variant/ashen");
    public static final TagKey<Biome> HAS_BLACK_WOLF = createBiome("has_wolf_variant/black");
    public static final TagKey<Biome> HAS_CHESTNUT_WOLF = createBiome("has_wolf_variant/chestnut");
    public static final TagKey<Biome> HAS_PALE_WOLF = createBiome("has_wolf_variant/pale");
    public static final TagKey<Biome> HAS_RUSTY_WOLF = createBiome("has_wolf_variant/rusty");
    public static final TagKey<Biome> HAS_SNOWY_WOLF = createBiome("has_wolf_variant/snowy");
    public static final TagKey<Biome> HAS_SPOTTED_WOLF = createBiome("has_wolf_variant/spotted");
    public static final TagKey<Biome> HAS_STRIPED_WOLF = createBiome("has_wolf_variant/striped");
    public static final TagKey<Biome> HAS_WOODS_WOLF = createBiome("has_wolf_variant/woods");


    private RuTags() {
    }

    private static TagKey<Block> createBlock(String key) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, key));
    }
    public static TagKey<Block> createBlock(ResourceLocation name) {
        return TagKey.create(Registries.BLOCK, name);
    }

    private static TagKey<Item> createItem(String key) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, key));
    }
    public static TagKey<Item> createItem(ResourceLocation name) {
        return TagKey.create(Registries.ITEM, name);
    }

    private static TagKey<Biome> createBiome(String key) {
        return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, key));
    }
    public static TagKey<Biome> createBiome(ResourceLocation name) {
        return TagKey.create(Registries.BIOME, name);
    }
}
