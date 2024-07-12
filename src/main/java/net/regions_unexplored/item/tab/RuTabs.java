package net.regions_unexplored.item.tab;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.item.RuItems;

public class RuTabs {
    public static RegistryObject<CreativeModeTab> REGIONS_UNEXPLORED_MAIN_TAB;

    public static void addTabs() {
        REGIONS_UNEXPLORED_MAIN_TAB = RegionsUnexploredMod.CREATIVE_TAB_REGISTRY.register("ru_main", () ->
                CreativeModeTab.builder().icon(() -> new ItemStack(RuBlocks.PRISMARITE_CLUSTER.get()))
                        .title(Component.translatable("itemGroup.regions_unexplored_main"))
                        .hideTitle()
                        .backgroundTexture(ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, "textures/gui/container/creative_inventory/tab_item_search.png"))
                        .withSearchBar(58)
                        .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                        .displayItems((featureFlags, output) -> {

                            output.accept(new ItemStack(RuBlocks.PRISMOSS.get()));
                            output.accept(new ItemStack(RuBlocks.DEEPSLATE_PRISMOSS.get()));
                            output.accept(new ItemStack(RuBlocks.PRISMARITE_CLUSTER.get()));
                            output.accept(new ItemStack(RuBlocks.LARGE_PRISMARITE_CLUSTER.get()));
                            output.accept(new ItemStack(RuBlocks.HANGING_PRISMARITE.get()));
                            output.accept(new ItemStack(RuBlocks.PRISMOSS_SPROUT.get()));
                            output.accept(new ItemStack(RuBlocks.PRISMAGLASS.get()));
                            //REDSTONE_BLOCKS
                            output.accept(new ItemStack(RuBlocks.REDSTONE_BUD.get()));
                            output.accept(new ItemStack(RuBlocks.REDSTONE_BULB.get()));
                            output.accept(new ItemStack(RuBlocks.POINTED_REDSTONE.get()));
                            output.accept(new ItemStack(RuBlocks.RAW_REDSTONE_BLOCK.get()));
                            //ANCIENT_DELTA
                            output.accept(new ItemStack(RuBlocks.CORPSE_FLOWER.get()));
                            output.accept(new ItemStack(RuBlocks.DROPLEAF.get()));
                            output.accept(new ItemStack(RuBlocks.DUSKMELON.get()));
                            output.accept(new ItemStack(RuBlocks.DUSKTRAP.get()));
                            //OTHER_CAVE_BLOCKS
                            output.accept(new ItemStack(RuBlocks.STONE_GRASS_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.DEEPSLATE_GRASS_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.VIRIDESCENT_NYLIUM.get()));
                            output.accept(new ItemStack(RuBlocks.DEEPSLATE_VIRIDESCENT_NYLIUM.get()));
                            /*-----------------PLANTS-----------------*/
                            //GRASS_BLOCKS
                            output.accept(new ItemStack(RuBlocks.ASHEN_GRASS.get()));
                            output.accept(new ItemStack(RuBlocks.BLADED_GRASS.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_STEPPE_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.FROZEN_GRASS.get()));
                            output.accept(new ItemStack(RuBlocks.MEDIUM_GRASS.get()));
                            output.accept(new ItemStack(RuBlocks.SANDY_GRASS.get()));
                            output.accept(new ItemStack(RuBlocks.SMALL_DESERT_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.STEPPE_GRASS.get()));
                            output.accept(new ItemStack(RuBlocks.STEPPE_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.STONE_BUD.get()));

                            output.accept(new ItemStack(RuBlocks.BRIMSPROUT.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_ROOTS.get()));
                            output.accept(new ItemStack(RuBlocks.GLISTERING_SPROUT.get()));
                            output.accept(new ItemStack(RuBlocks.GLISTERING_FERN.get()));
                            output.accept(new ItemStack(RuBlocks.MYCOTOXIC_GRASS.get()));

                            output.accept(new ItemStack(RuBlocks.BLADED_TALL_GRASS.get()));
                            output.accept(new ItemStack(RuBlocks.ELEPHANT_EAR.get()));
                            output.accept(new ItemStack(RuBlocks.SANDY_TALL_GRASS.get()));
                            output.accept(new ItemStack(RuBlocks.STEPPE_TALL_GRASS.get()));
                            output.accept(new ItemStack(RuBlocks.WINDSWEPT_GRASS.get()));

                            output.accept(new ItemStack(RuBlocks.CLOVER.get()));
                            //FLOWERS
                            output.accept(new ItemStack(RuBlocks.ALPHA_DANDELION.get()));
                            output.accept(new ItemStack(RuBlocks.ALPHA_ROSE.get()));
                            output.accept(new ItemStack(RuBlocks.ASTER.get()));
                            output.accept(new ItemStack(RuBlocks.BLEEDING_HEART.get()));
                            output.accept(new ItemStack(RuBlocks.DAISY.get()));
                            output.accept(new ItemStack(RuBlocks.DORCEL.get()));
                            output.accept(new ItemStack(RuBlocks.FELICIA_DAISY.get()));
                            output.accept(new ItemStack(RuBlocks.FIREWEED.get()));
                            output.accept(new ItemStack(RuBlocks.GLISTERING_BLOOM.get()));
                            output.accept(new ItemStack(RuBlocks.HIBISCUS.get()));
                            output.accept(new ItemStack(RuBlocks.HYSSOP.get()));
                            output.accept(new ItemStack(RuBlocks.MALLOW.get()));
                            output.accept(new ItemStack(RuBlocks.POPPY_BUSH.get()));
                            output.accept(new ItemStack(RuBlocks.SALMON_POPPY_BUSH.get()));
                            output.accept(new ItemStack(RuBlocks.TSUBAKI.get()));
                            output.accept(new ItemStack(RuBlocks.WARATAH.get()));
                            output.accept(new ItemStack(RuBlocks.WHITE_TRILLIUM.get()));
                            output.accept(new ItemStack(RuBlocks.WILTING_TRILLIUM.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_LUPINE.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_LUPINE.get()));
                            output.accept(new ItemStack(RuBlocks.PURPLE_LUPINE.get()));
                            output.accept(new ItemStack(RuBlocks.RED_LUPINE.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_LUPINE.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_EARLIGHT.get()));

                            output.accept(new ItemStack(RuBlocks.ORANGE_CONEFLOWER.get()));
                            output.accept(new ItemStack(RuBlocks.PURPLE_CONEFLOWER.get()));
                            //SNOWBELLE
                            output.accept(new ItemStack(RuBlocks.WHITE_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.LIGHT_GRAY_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.GRAY_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.RED_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.ORANGE_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.LIME_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.CYAN_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.LIGHT_BLUE_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.PURPLE_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.MAGENTA_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.BROWN_SNOWBELLE.get()));
                            output.accept(new ItemStack(RuBlocks.BLACK_SNOWBELLE.get()));

                            output.accept(new ItemStack(RuBlocks.HYACINTH_FLOWERS.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_MAGNOLIA_FLOWERS.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_MAGNOLIA_FLOWERS.get()));
                            output.accept(new ItemStack(RuBlocks.WHITE_MAGNOLIA_FLOWERS.get()));

                            output.accept(new ItemStack(RuBlocks.MAPLE_LEAF_PILE.get()));
                            output.accept(new ItemStack(RuBlocks.RED_MAPLE_LEAF_PILE.get()));
                            output.accept(new ItemStack(RuBlocks.ORANGE_MAPLE_LEAF_PILE.get()));
                            output.accept(new ItemStack(RuBlocks.ENCHANTED_BIRCH_LEAF_PILE.get()));
                            output.accept(new ItemStack(RuBlocks.SILVER_BIRCH_LEAF_PILE.get()));

                            //TALL_PLANTS
                            output.accept(new ItemStack(RuBlocks.BARLEY.get()));
                            output.accept(new ItemStack(RuBlocks.CATTAIL.get()));
                            output.accept(new ItemStack(RuBlocks.DAY_LILY.get()));
                            output.accept(new ItemStack(RuBlocks.MEADOW_SAGE.get()));
                            output.accept(new ItemStack(RuBlocks.TASSEL.get()));
                            output.accept(new ItemStack(RuBlocks.GLISTER_BULB.get()));
                            output.accept(new ItemStack(RuBlocks.GLISTER_SPIRE.get()));
                            output.accept(new ItemStack(RuBlocks.MYCOTOXIC_DAISY.get()));
                            output.accept(new ItemStack(RuBlocks.TALL_COBALT_EARLIGHT.get()));
                            //HYACINTH_BLOCKS
                            output.accept(new ItemStack(RuBlocks.HYACINTH_BLOOM.get()));
                            output.accept(new ItemStack(RuBlocks.TALL_HYACINTH_STOCK.get()));
                            output.accept(new ItemStack(RuBlocks.HYACINTH_LAMP.get()));
                            //SAPLINGS
                            output.accept(new ItemStack(RuBlocks.ALPHA_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.APPLE_OAK_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.ASHEN_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.BAMBOO_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.CACTUS_FLOWER.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_PINE_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.FLOWERING_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.GOLDEN_LARCH_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_MAGNOLIA_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_MAGNOLIA_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.WHITE_MAGNOLIA_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.ORANGE_MAPLE_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.RED_MAPLE_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.SILVER_BIRCH_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.ENCHANTED_BIRCH_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.SMALL_OAK_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_SAPLING.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_SAPLING.get()));
                            //SHRUBS
                            output.accept(new ItemStack(RuBlocks.ACACIA_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.ASHEN_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.BIRCH_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.CHERRY_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.DARK_OAK_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_PINE_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.FLOWERING_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.JUNGLE_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.GOLDEN_LARCH_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_MAGNOLIA_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_MAGNOLIA_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.WHITE_MAGNOLIA_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.MANGROVE_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.ORANGE_MAPLE_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.RED_MAPLE_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.OAK_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.SILVER_BIRCH_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.ENCHANTED_BIRCH_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.SPRUCE_SHRUB.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_SHRUB.get()));
                            //MUSHROOMS
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM.get()));
                            output.accept(new ItemStack(RuBlocks.TALL_BLUE_BIOSHROOM.get()));
                            output.accept(new ItemStack(RuBlocks.TALL_GREEN_BIOSHROOM.get()));
                            output.accept(new ItemStack(RuBlocks.TALL_PINK_BIOSHROOM.get()));
                            output.accept(new ItemStack(RuBlocks.TALL_YELLOW_BIOSHROOM.get()));
                            //OTHER_PLANT_BLOCKS
                            output.accept(new ItemStack(RuBlocks.BARREL_CACTUS.get()));
                            output.accept(new ItemStack(RuBlocks.CAVE_HYSSOP.get()));
                            output.accept(new ItemStack(RuBlocks.DUCKWEED.get()));
                            output.accept(new ItemStack(RuBlocks.FLOWERING_LILY_PAD.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_VINES.get()));
                            output.accept(new ItemStack(RuBlocks.SPANISH_MOSS.get()));
                            output.accept(new ItemStack(RuBlocks.GLISTERING_IVY.get()));
                            //FOOD_PLANT_BLOCKS
                            output.accept(new ItemStack(RuItems.SALMONBERRY.get()));
                            output.accept(new ItemStack(RuBlocks.HANGING_EARLIGHT.get()));
                            /*-----------------PLANT_BLOCKS-----------------*/
                            //MUSHROOMS
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.GLOWING_BLUE_BIOSHROOM_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.GLOWING_GREEN_BIOSHROOM_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.GLOWING_PINK_BIOSHROOM_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.GLOWING_YELLOW_BIOSHROOM_BLOCK.get()));
                            //CACTUS
                            output.accept(new ItemStack(RuBlocks.SAGUARO_CACTUS.get()));

                            /*-----------------LEAVES-----------------*/
                            output.accept(new ItemStack(RuBlocks.ALPHA_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.APPLE_OAK_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.ASHEN_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.BAMBOO_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_WEBBING.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_PINE_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.FLOWERING_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.GOLDEN_LARCH_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_MAGNOLIA_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_MAGNOLIA_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.WHITE_MAGNOLIA_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.ORANGE_MAPLE_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.RED_MAPLE_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.SILVER_BIRCH_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.ENCHANTED_BIRCH_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.SMALL_OAK_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_LEAVES.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_LEAVES.get()));

                            /*-----------------BRANCHES-----------------*/
                            output.accept(new ItemStack(RuBlocks.ACACIA_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.BIRCH_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.CHERRY_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.DARK_OAK_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_BEARD.get()));
                            output.accept(new ItemStack(RuBlocks.JUNGLE_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.MANGROVE_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.OAK_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_BEARD.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.SILVER_BIRCH_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.SPRUCE_BRANCH.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_BRANCH.get()));

                            /*-----------------DIRT_BLOCKS-----------------*/
                            //OTHER_DIRT_BLOCKS
                            output.accept(new ItemStack(RuBlocks.ALPHA_GRASS_BLOCK.get()));
                            //ASHEN_BLOCKS
                            output.accept(new ItemStack(RuBlocks.ASHEN_DIRT.get()));
                            //FOREST_DIRT_BLOCKS
                            output.accept(new ItemStack(RuBlocks.PEAT_GRASS_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.PEAT_DIRT.get()));
                            output.accept(new ItemStack(RuBlocks.PEAT_DIRT_PATH.get()));
                            output.accept(new ItemStack(RuBlocks.PEAT_COARSE_DIRT.get()));
                            output.accept(new ItemStack(RuBlocks.PEAT_PODZOL.get()));
                            output.accept(new ItemStack(RuBlocks.PEAT_MUD.get()));
                            output.accept(new ItemStack(RuBlocks.PEAT_FARMLAND.get()));
                            //PLAINS_DIRT_BLOCKS
                            output.accept(new ItemStack(RuBlocks.SILT_GRASS_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.SILT_DIRT.get()));
                            output.accept(new ItemStack(RuBlocks.SILT_DIRT_PATH.get()));
                            output.accept(new ItemStack(RuBlocks.SILT_COARSE_DIRT.get()));
                            output.accept(new ItemStack(RuBlocks.SILT_PODZOL.get()));
                            output.accept(new ItemStack(RuBlocks.SILT_MUD.get()));
                            output.accept(new ItemStack(RuBlocks.SILT_FARMLAND.get()));
                            //NETHER
                            output.accept(new ItemStack(RuBlocks.BRIMSPROUT_NYLIUM.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_NYLIUM.get()));
                            output.accept(new ItemStack(RuBlocks.GLISTERING_NYLIUM.get()));
                            output.accept(new ItemStack(RuBlocks.GLISTERING_WART.get()));
                            output.accept(new ItemStack(RuBlocks.OVERGROWN_BONE_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.MYCOTOXIC_NYLIUM.get()));
                            /*-----------------STONE_BLOCKS-----------------*/
                            //CHALKS
                            output.accept(new ItemStack(RuBlocks.CHALK_GRASS_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.CHALK.get()));
                            output.accept(new ItemStack(RuBlocks.CHALK_BRICKS.get()));
                            output.accept(new ItemStack(RuBlocks.CHALK_BRICK_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.CHALK_BRICK_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.CHALK_PILLAR.get()));
                            output.accept(new ItemStack(RuBlocks.CHALK_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.CHALK_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.POLISHED_CHALK.get()));
                            output.accept(new ItemStack(RuBlocks.POLISHED_CHALK_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.POLISHED_CHALK_STAIRS.get()));
                            //STONES
                            output.accept(new ItemStack(RuBlocks.ARGILLITE_GRASS_BLOCK.get()));
                            output.accept(new ItemStack(RuBlocks.ARGILLITE.get()));

                            output.accept(new ItemStack(RuBlocks.BLACKSTONE_CLUSTER.get()));

                            output.accept(new ItemStack(RuBlocks.COBALT_OBSIDIAN.get()));

                            output.accept(new ItemStack(RuBlocks.MOSSY_STONE.get()));

                            /*-----------------OTHER_BLOCKS-----------------*/
                            output.accept(new ItemStack(RuBlocks.ASH.get()));
                            output.accept(new ItemStack(RuBlocks.VOLCANIC_ASH.get()));
                            output.accept(new ItemStack(RuBlocks.ASH_VENT.get()));
                            output.accept(new ItemStack(RuBlocks.ICICLE.get()));

                            /*-----------------WOOD_TYPES-----------------*/
                            //ALPHA_BLOCKS
                            output.accept(new ItemStack(RuBlocks.ALPHA_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.ALPHA_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.ALPHA_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.ALPHA_SLAB.get()));
                            //ASHEN_BLOCKS
                            output.accept(new ItemStack(RuBlocks.ASHEN_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.ASHEN_WOOD.get()));
                            //BAMBOO
                            output.accept(new ItemStack(RuBlocks.BAMBOO_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_BAMBOO_LOG.get()));
                            //SILVER_BIRCH_BLOCKS
                            output.accept(new ItemStack(RuBlocks.SILVER_BIRCH_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.SILVER_BIRCH_WOOD.get()));
                            //OAK
                            output.accept(new ItemStack(RuBlocks.SMALL_OAK_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_SMALL_OAK_LOG.get()));
                            //BAOBAB_BLOCKS
                            output.accept(new ItemStack(RuBlocks.BAOBAB_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_BAOBAB_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_BAOBAB_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.BAOBAB_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.BAOBAB_BOAT.get()));
                            output.accept(new ItemStack(RuItems.BAOBAB_CHEST_BOAT.get()));
                            //BLACKWOOD_BLOCKS
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_BLACKWOOD_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_BLACKWOOD_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.BLACKWOOD_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.BLACKWOOD_BOAT.get()));
                            output.accept(new ItemStack(RuItems.BLACKWOOD_CHEST_BOAT.get()));
                            //BLUE_BIOSHROOM_BLOCKS
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_STEM.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_BLUE_BIOSHROOM_STEM.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_HYPHAE.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_BLUE_BIOSHROOM_HYPHAE.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_BIOSHROOM_HANGING_SIGN.get()));
                            //BRIMWOOD_BLOCKS
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_LOG_MAGMA.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_BRIMWOOD_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_BRIMWOOD_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.BRIMWOOD_HANGING_SIGN.get()));
                            //COBALT_BLOCKS
                            output.accept(new ItemStack(RuBlocks.COBALT_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_COBALT_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_COBALT_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.COBALT_HANGING_SIGN.get()));
                            //CYPRESS_BLOCKS
                            output.accept(new ItemStack(RuBlocks.CYPRESS_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_CYPRESS_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_CYPRESS_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.CYPRESS_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.CYPRESS_BOAT.get()));
                            output.accept(new ItemStack(RuItems.CYPRESS_CHEST_BOAT.get()));
                            //DEAD_BLOCKS
                            output.accept(new ItemStack(RuBlocks.DEAD_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_DEAD_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_DEAD_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.DEAD_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.DEAD_BOAT.get()));
                            output.accept(new ItemStack(RuItems.DEAD_CHEST_BOAT.get()));
                            //EUCALYPTUS_BLOCKS
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_EUCALYPTUS_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_EUCALYPTUS_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.EUCALYPTUS_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.EUCALYPTUS_BOAT.get()));
                            output.accept(new ItemStack(RuItems.EUCALYPTUS_CHEST_BOAT.get()));
                            //GREEN_BIOSHROOM_BLOCKS
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_STEM.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_GREEN_BIOSHROOM_STEM.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_HYPHAE.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_GREEN_BIOSHROOM_HYPHAE.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_BIOSHROOM_HANGING_SIGN.get()));
                            //JOSHUA_BLOCKS
                            output.accept(new ItemStack(RuBlocks.JOSHUA_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_JOSHUA_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_JOSHUA_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.JOSHUA_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.JOSHUA_BOAT.get()));
                            output.accept(new ItemStack(RuItems.JOSHUA_CHEST_BOAT.get()));
                            //KAPOK_BLOCKS
                            output.accept(new ItemStack(RuBlocks.KAPOK_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_KAPOK_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_KAPOK_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.KAPOK_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.KAPOK_BOAT.get()));
                            output.accept(new ItemStack(RuItems.KAPOK_CHEST_BOAT.get()));
                            //LARCH_BLOCKS
                            output.accept(new ItemStack(RuBlocks.LARCH_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_LARCH_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_LARCH_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.LARCH_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.LARCH_BOAT.get()));
                            output.accept(new ItemStack(RuItems.LARCH_CHEST_BOAT.get()));
                            //MAGNOLIA_BLOCKS
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_MAGNOLIA_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_MAGNOLIA_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.MAGNOLIA_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.MAGNOLIA_BOAT.get()));
                            output.accept(new ItemStack(RuItems.MAGNOLIA_CHEST_BOAT.get()));
                            //MAPLE_BLOCKS
                            output.accept(new ItemStack(RuBlocks.MAPLE_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_MAPLE_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_MAPLE_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.MAPLE_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.MAPLE_BOAT.get()));
                            output.accept(new ItemStack(RuItems.MAPLE_CHEST_BOAT.get()));
                            //MAUVE_BLOCKS
                            output.accept(new ItemStack(RuBlocks.MAUVE_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_MAUVE_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_MAUVE_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.MAUVE_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.MAUVE_BOAT.get()));
                            output.accept(new ItemStack(RuItems.MAUVE_CHEST_BOAT.get()));
                            //PALM_BLOCKS
                            output.accept(new ItemStack(RuBlocks.PALM_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_PALM_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_PALM_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.PALM_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.PALM_BOAT.get()));
                            output.accept(new ItemStack(RuItems.PALM_CHEST_BOAT.get()));
                            //PINE_BLOCKS
                            output.accept(new ItemStack(RuBlocks.PINE_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_PINE_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_PINE_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.PINE_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.PINE_BOAT.get()));
                            output.accept(new ItemStack(RuItems.PINE_CHEST_BOAT.get()));
                            //PINK_BIOSHROOM_BLOCKS
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_STEM.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_PINK_BIOSHROOM_STEM.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_HYPHAE.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_PINK_BIOSHROOM_HYPHAE.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_BIOSHROOM_HANGING_SIGN.get()));
                            //REDWOOD_BLOCKS
                            output.accept(new ItemStack(RuBlocks.REDWOOD_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_REDWOOD_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_REDWOOD_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.REDWOOD_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.REDWOOD_BOAT.get()));
                            output.accept(new ItemStack(RuItems.REDWOOD_CHEST_BOAT.get()));
                            //SOCOTRA_BLOCKS
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_SOCOTRA_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_SOCOTRA_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.SOCOTRA_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.SOCOTRA_BOAT.get()));
                            output.accept(new ItemStack(RuItems.SOCOTRA_CHEST_BOAT.get()));
                            //WILLOW_BLOCKS
                            output.accept(new ItemStack(RuBlocks.WILLOW_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_WILLOW_LOG.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_WILLOW_WOOD.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.WILLOW_HANGING_SIGN.get()));
                            output.accept(new ItemStack(RuItems.WILLOW_BOAT.get()));
                            output.accept(new ItemStack(RuItems.WILLOW_CHEST_BOAT.get()));
                            //YELLOW_BIOSHROOM_BLOCKS
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_STEM.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_YELLOW_BIOSHROOM_STEM.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_HYPHAE.get()));
                            output.accept(new ItemStack(RuBlocks.STRIPPED_YELLOW_BIOSHROOM_HYPHAE.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_FENCE.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_DOOR.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_FENCE_GATE.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_TRAPDOOR.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_PRESSURE_PLATE.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_BUTTON.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_SIGN.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_BIOSHROOM_HANGING_SIGN.get()));

                            /*-----------------PAINTED PLANKS-----------------*/
                            //PLANKS
                            output.accept(new ItemStack(RuBlocks.RED_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.ORANGE_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.LIME_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.CYAN_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.LIGHT_BLUE_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.PURPLE_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.MAGENTA_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.BROWN_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.WHITE_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.LIGHT_GRAY_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.GRAY_PAINTED_PLANKS.get()));
                            output.accept(new ItemStack(RuBlocks.BLACK_PAINTED_PLANKS.get()));
                            //STAIRS
                            output.accept(new ItemStack(RuBlocks.RED_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.ORANGE_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.LIME_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.CYAN_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.LIGHT_BLUE_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.PURPLE_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.MAGENTA_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.BROWN_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.WHITE_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.LIGHT_GRAY_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.GRAY_PAINTED_STAIRS.get()));
                            output.accept(new ItemStack(RuBlocks.BLACK_PAINTED_STAIRS.get()));
                            //SLABS
                            output.accept(new ItemStack(RuBlocks.RED_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.ORANGE_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.YELLOW_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.LIME_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.GREEN_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.CYAN_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.LIGHT_BLUE_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.BLUE_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.PURPLE_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.MAGENTA_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.PINK_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.BROWN_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.WHITE_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.LIGHT_GRAY_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.GRAY_PAINTED_SLAB.get()));
                            output.accept(new ItemStack(RuBlocks.BLACK_PAINTED_SLAB.get()));

                        }).build());
    }
}