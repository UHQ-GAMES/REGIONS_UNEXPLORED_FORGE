package net.regions_unexplored.datagen.provider;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.data.worldgen.biome.RuBiomes;
import net.regions_unexplored.entity.RuEntities;
import org.jetbrains.annotations.NotNull;

public class RuLanguageProvider extends LanguageProvider {
    public RuLanguageProvider(PackOutput output) {
        super(output, RegionsUnexploredMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Advancement translations
        this.add("advancements.regions_unexplored.title", "Regions Unexplored");
        this.add("advancements.regions_unexplored.description", "Discover the many biomes and explore the world!");

        this.add("advancements.regions_unexplored.pioneer.title", "Pioneer");
        this.add("advancements.regions_unexplored.pioneer.description", "Explore all Surface biomes from Regions Unexplored!");

        this.add("advancements.regions_unexplored.regions_explored.title", "Regions Explored");
        this.add("advancements.regions_unexplored.regions_explored.description", "You've explored all the biomes from Regions Unexplored");

        this.add("advancements.regions_unexplored.every_bit_of_the_rainbow.title", "Every Bit of the Rainbow");
        this.add("advancements.regions_unexplored.every_bit_of_the_rainbow.description", "Collect or craft every colour of the Snowbelle Flower.");

        this.add("advancements.regions_unexplored.from_the_tree_tops.title", "From the Tree Tops");
        this.add("advancements.regions_unexplored.from_the_tree_tops.description", "Hang from a Kapok tree's vines.");

        this.add("advancements.regions_unexplored.light_as_a_frog.title", "Light as a Frog");
        this.add("advancements.regions_unexplored.light_as_a_frog.description", "Walk or bounce on a Giant Lily Pad.");

        this.add("advancements.regions_unexplored.eternal_expedition.title", "Eternal Expedition");
        this.add("advancements.regions_unexplored.eternal_expedition.description", "Venture into all Nether biomes from Regions Unexplored!");

        this.add("advancements.regions_unexplored.downer.title", "Downer");
        this.add("advancements.regions_unexplored.downer.description", "Walk through and take damage from a Dorcel Flower.");

        this.add("advancements.regions_unexplored.light_snack.title", "Light Snack");
        this.add("advancements.regions_unexplored.light_snack.description", "Consume a Hanging Earlight Fruit.");

        this.add("advancements.regions_unexplored.spelunker.title", "Spelunker");
        this.add("advancements.regions_unexplored.spelunker.description", "Find all Cave biomes from Regions Unexplored!");

        this.add("advancements.regions_unexplored.blind_as_a_bat.title", "Blind as a Bat");
        this.add("advancements.regions_unexplored.blind_as_a_bat.description", "Consume a Duskmelon.");

        this.add("advancements.regions_unexplored.this_tree_bleeds_red.title", "This Tree Bleeds Red");
        this.add("advancements.regions_unexplored.this_tree_bleeds_red.description", "Chop down a Socotra tree.");

        this.add("advancements.regions_unexplored.got_wood.title", "Got Wood?");
        this.add("advancements.regions_unexplored.got_wood.description", "Collect every log from Regions Unexplored.");

        this.add("advancements.regions_unexplored.mycologist.title", "Mycologist");
        this.add("advancements.regions_unexplored.mycologist.description", "Collect every Bioshroom type.");

        this.add("advancements.regions_unexplored.ancient_specimens.title", "Ancient Specimens");
        this.add("advancements.regions_unexplored.ancient_specimens.description", "Collect every Bioshroom Stem type.");

        // Block translations
        RegionsUnexploredMod.BLOCK_REGISTRY.getEntries().forEach(blockRegistryObject -> {
            if(!blockRegistryObject.get().toString().contains("potted_")&&
                    !blockRegistryObject.get().toString().contains("hanging_earlight")&&
                    !blockRegistryObject.get().toString().contains("duskmelon")&&
                    !blockRegistryObject.get().toString().contains("salmonberry")&&
                    !blockRegistryObject.get().toString().contains("_wall_sign")&&
                    !blockRegistryObject.get().toString().contains("_wall_hanging_sign")){
                this.add(blockRegistryObject.get(), capitalizeString(filterBlockLang(blockRegistryObject.get())));
            }
        });
        //Misc block translations
        this.add(RuBlocks.DUSKMELON.get(), "Duskmelon Slice");
        this.add(RuBlocks.SALMONBERRY_BUSH.get(), "Salmonberry");
        this.add(RuBlocks.HANGING_EARLIGHT.get(), "Hanging Earlight Fruit");

        //Entity translations
        this.add(RuEntities.BOAT.get(), "Boat");
        this.add(RuEntities.CHEST_BOAT.get(), "Boat With Chest");

        this.add("death.attack.dorcel", "%s was dragged underground by Dorcel");
        this.add("death.attack.dorcel.player", "%s was dragged underground by Dorcel");

        this.add("death.attack.dusk_trap", "%s was eaten by a Dusktrap");
        this.add("death.attack.dusk_trap.player", "%s was eaten by a Dusktrap");

        // Item translations
        RegionsUnexploredMod.ITEM_REGISTRY.getEntries().forEach(itemRegistryObject -> {
            if(itemRegistryObject.get().toString().contains("boat")){
                if(itemRegistryObject.get().toString().contains("chest_boat")){
                    this.add(itemRegistryObject.get(), filterChestBoatLang(itemRegistryObject.get()));
                }
                else{
                    this.add(itemRegistryObject.get(), capitalizeString(filterItemLang(itemRegistryObject.get())));
                }
            }
        });

        // Biome Translations
        this.add(RuBiomes.ALPHA_GROVE, capitalizeString(filterBiomeLang(RuBiomes.ALPHA_GROVE)));
        this.add(RuBiomes.ANCIENT_DELTA, capitalizeString(filterBiomeLang(RuBiomes.ANCIENT_DELTA)));
        this.add(RuBiomes.ARID_MOUNTAINS, capitalizeString(filterBiomeLang(RuBiomes.ARID_MOUNTAINS)));
        this.add(RuBiomes.ASHEN_WOODLAND, capitalizeString(filterBiomeLang(RuBiomes.ASHEN_WOODLAND)));
        this.add(RuBiomes.AUTUMNAL_MAPLE_FOREST, capitalizeString(filterBiomeLang(RuBiomes.AUTUMNAL_MAPLE_FOREST)));
        this.add(RuBiomes.BAOBAB_SAVANNA, capitalizeString(filterBiomeLang(RuBiomes.BAOBAB_SAVANNA)));
        this.add(RuBiomes.BAMBOO_FOREST, capitalizeString(filterBiomeLang(RuBiomes.BAMBOO_FOREST)));
        this.add(RuBiomes.BARLEY_FIELDS, capitalizeString(filterBiomeLang(RuBiomes.BARLEY_FIELDS)));
        this.add(RuBiomes.BAYOU, capitalizeString(filterBiomeLang(RuBiomes.BAYOU)));
        this.add(RuBiomes.BIOSHROOM_CAVES, capitalizeString(filterBiomeLang(RuBiomes.BIOSHROOM_CAVES)));
        this.add(RuBiomes.BLACKSTONE_BASIN, capitalizeString(filterBiomeLang(RuBiomes.BLACKSTONE_BASIN)));
        this.add(RuBiomes.BLACKWOOD_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.BLACKWOOD_TAIGA)));
        this.add(RuBiomes.BOREAL_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.BOREAL_TAIGA)));
        this.add(RuBiomes.CHALK_CLIFFS, capitalizeString(filterBiomeLang(RuBiomes.CHALK_CLIFFS)));
        this.add(RuBiomes.COLD_BOREAL_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.COLD_BOREAL_TAIGA)));
        this.add(RuBiomes.COLD_DECIDUOUS_FOREST, capitalizeString(filterBiomeLang(RuBiomes.COLD_DECIDUOUS_FOREST)));
        this.add(RuBiomes.COLD_RIVER, capitalizeString(filterBiomeLang(RuBiomes.COLD_RIVER)));
        this.add(RuBiomes.DECIDUOUS_FOREST, capitalizeString(filterBiomeLang(RuBiomes.DECIDUOUS_FOREST)));
        this.add(RuBiomes.DRY_BUSHLAND, capitalizeString(filterBiomeLang(RuBiomes.DRY_BUSHLAND)));
        this.add(RuBiomes.EUCALYPTUS_FOREST, capitalizeString(filterBiomeLang(RuBiomes.EUCALYPTUS_FOREST)));
        this.add(RuBiomes.FEN, capitalizeString(filterBiomeLang(RuBiomes.FEN)));
        this.add(RuBiomes.FLOWER_FIELDS, capitalizeString(filterBiomeLang(RuBiomes.FLOWER_FIELDS)));
        this.add(RuBiomes.FROZEN_PINE_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.FROZEN_PINE_TAIGA)));
        this.add(RuBiomes.FROZEN_TUNDRA, capitalizeString(filterBiomeLang(RuBiomes.FROZEN_TUNDRA)));
        this.add(RuBiomes.FUNGAL_FEN, capitalizeString(filterBiomeLang(RuBiomes.FUNGAL_FEN)));
        this.add(RuBiomes.GLISTERING_MEADOW, capitalizeString(filterBiomeLang(RuBiomes.GLISTERING_MEADOW)));
        this.add(RuBiomes.GOLDEN_BOREAL_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.GOLDEN_BOREAL_TAIGA)));
        this.add(RuBiomes.GRASSLAND, capitalizeString(filterBiomeLang(RuBiomes.GRASSLAND)));
        this.add(RuBiomes.GRASSY_BEACH, capitalizeString(filterBiomeLang(RuBiomes.GRASSY_BEACH)));
        this.add(RuBiomes.GRAVEL_BEACH, capitalizeString(filterBiomeLang(RuBiomes.GRAVEL_BEACH)));
        this.add(RuBiomes.HIGHLAND_FIELDS, capitalizeString(filterBiomeLang(RuBiomes.HIGHLAND_FIELDS)));
        this.add(RuBiomes.HYACINTH_DEEPS, capitalizeString(filterBiomeLang(RuBiomes.HYACINTH_DEEPS)));
        this.add(RuBiomes.ICY_HEIGHTS, capitalizeString(filterBiomeLang(RuBiomes.ICY_HEIGHTS)));
        this.add(RuBiomes.INFERNAL_HOLT, capitalizeString(filterBiomeLang(RuBiomes.INFERNAL_HOLT)));
        this.add(RuBiomes.JOSHUA_DESERT, capitalizeString(filterBiomeLang(RuBiomes.JOSHUA_DESERT)));
        this.add(RuBiomes.MAGNOLIA_WOODLAND, capitalizeString(filterBiomeLang(RuBiomes.MAGNOLIA_WOODLAND)));
        this.add(RuBiomes.MARSH, capitalizeString(filterBiomeLang(RuBiomes.MARSH)));
        this.add(RuBiomes.MAPLE_FOREST, capitalizeString(filterBiomeLang(RuBiomes.MAPLE_FOREST)));
        this.add(RuBiomes.MOUNTAINS, capitalizeString(filterBiomeLang(RuBiomes.MOUNTAINS)));
        this.add(RuBiomes.MAUVE_HILLS, capitalizeString(filterBiomeLang(RuBiomes.MAUVE_HILLS)));
        this.add(RuBiomes.MUDDY_RIVER, capitalizeString(filterBiomeLang(RuBiomes.MUDDY_RIVER)));
        this.add(RuBiomes.MYCOTOXIC_UNDERGROWTH, capitalizeString(filterBiomeLang(RuBiomes.MYCOTOXIC_UNDERGROWTH)));
        this.add(RuBiomes.ORCHARD, capitalizeString(filterBiomeLang(RuBiomes.ORCHARD)));
        this.add(RuBiomes.OUTBACK, capitalizeString(filterBiomeLang(RuBiomes.OUTBACK)));
        this.add(RuBiomes.OLD_GROWTH_BAYOU, capitalizeString(filterBiomeLang(RuBiomes.OLD_GROWTH_BAYOU)));
        this.add(RuBiomes.PINE_SLOPES, capitalizeString(filterBiomeLang(RuBiomes.PINE_SLOPES)));
        this.add(RuBiomes.PINE_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.PINE_TAIGA)));
        this.add(RuBiomes.PRAIRIE, capitalizeString(filterBiomeLang(RuBiomes.PRAIRIE)));
        this.add(RuBiomes.PRISMACHASM, capitalizeString(filterBiomeLang(RuBiomes.PRISMACHASM)));
        this.add(RuBiomes.POPPY_FIELDS, capitalizeString(filterBiomeLang(RuBiomes.POPPY_FIELDS)));
        this.add(RuBiomes.PUMPKIN_FIELDS, capitalizeString(filterBiomeLang(RuBiomes.PUMPKIN_FIELDS)));
        this.add(RuBiomes.RAINFOREST, capitalizeString(filterBiomeLang(RuBiomes.RAINFOREST)));
        this.add(RuBiomes.REDWOODS, capitalizeString(filterBiomeLang(RuBiomes.REDWOODS)));
        this.add(RuBiomes.REDSTONE_ABYSS, capitalizeString(filterBiomeLang(RuBiomes.REDSTONE_ABYSS)));
        this.add(RuBiomes.REDSTONE_CAVES, capitalizeString(filterBiomeLang(RuBiomes.REDSTONE_CAVES)));
        this.add(RuBiomes.ROCKY_MEADOW, capitalizeString(filterBiomeLang(RuBiomes.ROCKY_MEADOW)));
        this.add(RuBiomes.ROCKY_REEF, capitalizeString(filterBiomeLang(RuBiomes.ROCKY_REEF)));
        this.add(RuBiomes.SAGUARO_DESERT, capitalizeString(filterBiomeLang(RuBiomes.SAGUARO_DESERT)));
        this.add(RuBiomes.SHRUBLAND, capitalizeString(filterBiomeLang(RuBiomes.SHRUBLAND)));
        this.add(RuBiomes.SCORCHING_CAVES, capitalizeString(filterBiomeLang(RuBiomes.SCORCHING_CAVES)));
        this.add(RuBiomes.SPIRES, capitalizeString(filterBiomeLang(RuBiomes.SPIRES)));
        this.add(RuBiomes.STEPPE, capitalizeString(filterBiomeLang(RuBiomes.STEPPE)));
        this.add(RuBiomes.SILVER_BIRCH_FOREST, capitalizeString(filterBiomeLang(RuBiomes.SILVER_BIRCH_FOREST)));
        this.add(RuBiomes.SPARSE_RAINFOREST, capitalizeString(filterBiomeLang(RuBiomes.SPARSE_RAINFOREST)));
        this.add(RuBiomes.SPARSE_REDWOODS, capitalizeString(filterBiomeLang(RuBiomes.SPARSE_REDWOODS)));
        this.add(RuBiomes.TEMPERATE_GROVE, capitalizeString(filterBiomeLang(RuBiomes.TEMPERATE_GROVE)));
        this.add(RuBiomes.TROPICS, capitalizeString(filterBiomeLang(RuBiomes.TROPICS)));
        this.add(RuBiomes.TROPICAL_RIVER, capitalizeString(filterBiomeLang(RuBiomes.TROPICAL_RIVER)));
        this.add(RuBiomes.TOWERING_CLIFFS, capitalizeString(filterBiomeLang(RuBiomes.TOWERING_CLIFFS)));
        this.add(RuBiomes.WILLOW_FOREST, capitalizeString(filterBiomeLang(RuBiomes.WILLOW_FOREST)));
        this.add(RuBiomes.CLOVER_PLAINS, capitalizeString(filterBiomeLang(RuBiomes.CLOVER_PLAINS)));

        this.add("itemGroup.regions_unexplored_main", "Regions Unexplored");
    }

    /**
     * A method to capitalize a string and remove anything what's between it.
     * <a href="https://stackoverflow.com/questions/1892765/how-to-capitalize-the-first-character-of-each-word-in-a-string">Source</a>
     * @param string the string you want to capitalize.
     * @return a capitalised string.
     */
    private static @NotNull String capitalizeString(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '_') {
                /*small change to fix chest boat lang
                if(string.contains("with")&&chars[i+1]!='w'){
                }*/
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    /**
     * Filters the block to get the name of the block.
     * @param key The block.
     * @return The name of the block
     */
    private static @NotNull String filterBlockLang(@NotNull Block key) {
        return key.getDescriptionId()
                .replace("block.regions_unexplored.", "")
                .replace("_plant", "")
                .replace("_", " ");
    }

    private static @NotNull String filterItemLang(@NotNull ItemLike key) {
        return key.asItem().getDescriptionId()
                .replace("item.regions_unexplored.", "")
                .replace("_", " ");
    }

    private static @NotNull String filterChestBoatLang(@NotNull ItemLike key) {
        String type = key.asItem().getDescriptionId()
                .replace("item.regions_unexplored.", "")
                .replace("chest_boat", "")
                .replace("_", "");

        String name = capitalizeString(type)+" Boat with Chest";

        return name;
    }


    private static String filterBiomeLang(ResourceKey<Biome> key) {
        return key.location().toLanguageKey()
                .replace("regions_unexplored.", "")
                .replace("_", " ");
    }

    // used to create a biome translation string
    private void add(ResourceKey<Biome> key, String translation) {
        this.add("biome." + key.location().toLanguageKey(), translation);
    }
}
