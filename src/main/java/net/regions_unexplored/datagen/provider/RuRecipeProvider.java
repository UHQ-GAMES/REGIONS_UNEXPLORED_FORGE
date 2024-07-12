package net.regions_unexplored.datagen.provider;

import com.google.common.collect.ImmutableList;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.EnterBlockTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.data.tags.RuTags;
import net.regions_unexplored.item.RuItems;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class RuRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public static final ImmutableList<ItemLike> REDSTONE_SMELTABLES = ImmutableList.of(RuBlocks.RAW_REDSTONE_BLOCK.get(), RuBlocks.REDSTONE_BULB.get());
    public static final ImmutableList<ItemLike> MOSSY_STONE_SMELTABLES = ImmutableList.of(Blocks.MOSSY_COBBLESTONE);

    public RuRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> holder) {
        super(output, holder);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {
        /*-----------------CAVE_BLOCKS_DONE-----------------*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.PRISMOSS.get(), 1).define('#', Blocks.STONE).define('X', RuBlocks.PRISMOSS_SPROUT.get()).pattern("X").pattern("#").group("prismoss").unlockedBy("has_stone", has(Blocks.STONE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.DEEPSLATE_PRISMOSS.get(), 1).define('#', Blocks.DEEPSLATE).define('X', RuBlocks.PRISMOSS_SPROUT.get()).pattern("X").pattern("#").group("prismoss").unlockedBy("has_deepslate", has(Blocks.DEEPSLATE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.HANGING_PRISMARITE.get(), 1).define('#', RuBlocks.PRISMARITE_CLUSTER.get()).pattern("#").pattern("#").pattern("#").group("prismarite").unlockedBy("has_prismarite", has(RuBlocks.PRISMARITE_CLUSTER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.LARGE_PRISMARITE_CLUSTER.get(), 1).define('#', RuBlocks.PRISMARITE_CLUSTER.get()).pattern("#").pattern("#").group("prismarite").unlockedBy("has_prismarite", has(RuBlocks.PRISMARITE_CLUSTER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.PRISMAGLASS.get(), 2).define('#', TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "glass"))).define('X', RuTags.PRISMARITE_CRYSTALS_ITEM).pattern(" X ").pattern("X#X").pattern(" X ").group("stained_glass").unlockedBy("has_glass", has(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "glass")))).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, RuBlocks.RAW_REDSTONE_BLOCK.get(), 1).define('#', Items.REDSTONE).pattern("##").pattern("##").group("redstone").unlockedBy("has_redstone", has(Items.REDSTONE)).save(consumer);
        oreSmelting(consumer, REDSTONE_SMELTABLES, RecipeCategory.REDSTONE, Items.REDSTONE, 0.7F, 200, "redstone");
        oreBlasting(consumer, REDSTONE_SMELTABLES, RecipeCategory.REDSTONE, Items.REDSTONE, 0.7F, 100, "redstone");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, RuBlocks.REDSTONE_BUD.get(), 2).define('#', Items.REDSTONE).pattern("###").group("redstone").unlockedBy("has_redstone", has(Items.REDSTONE)).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.STONE_GRASS_BLOCK.get(), 1).define('#', Blocks.STONE).define('X', RuTags.GRASS_ITEM).pattern("X").pattern("#").group("stone_grass").unlockedBy("has_stone", has(Blocks.STONE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.DEEPSLATE_GRASS_BLOCK.get(), 1).define('#', Blocks.DEEPSLATE).define('X', RuTags.GRASS_ITEM).pattern("X").pattern("#").group("stone_grass").unlockedBy("has_deepslate", has(Blocks.DEEPSLATE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.VIRIDESCENT_NYLIUM.get(), 1).define('#', Blocks.STONE).define('X', TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "mushrooms"))).pattern("X").pattern("#").group("viridescent_nylium").unlockedBy("has_stone", has(Blocks.STONE)).unlockedBy("has_mushroom", has(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "mushrooms")))).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.DEEPSLATE_VIRIDESCENT_NYLIUM.get(), 1).define('#', Blocks.DEEPSLATE).define('X', TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "mushrooms"))).pattern("X").pattern("#").group("viridescent_nylium").unlockedBy("has_deepslate", has(Blocks.DEEPSLATE)).unlockedBy("has_mushroom", has(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "mushrooms")))).save(consumer);

        /*-----------------PLANTS-----------------*/
        oneToOneConversionRecipe(consumer, Items.BROWN_DYE, RuBlocks.DEAD_STEPPE_SHRUB.get(), "brown_dye");
        oneToOneConversionRecipe(consumer, Items.BROWN_DYE, RuBlocks.SMALL_DESERT_SHRUB.get(), "brown_dye");


        oneToOneConversionRecipe(consumer, Items.YELLOW_DYE, RuBlocks.ALPHA_DANDELION.get(), "yellow_dye");
        oneToOneConversionRecipe(consumer, Items.RED_DYE, RuBlocks.ALPHA_ROSE.get(), "red_dye");
        oneToOneConversionRecipe(consumer, Items.MAGENTA_DYE, RuBlocks.BLEEDING_HEART.get(), "magenta_dye");
        oneToOneConversionRecipe(consumer, Items.BLUE_DYE, RuBlocks.BLUE_LUPINE.get(), "blue_dye");
        oneToOneConversionRecipe(consumer, Items.LIGHT_GRAY_DYE, RuBlocks.DAISY.get(), "light_gray_dye");
        oneToOneConversionRecipe(consumer, Items.BLACK_DYE, RuBlocks.DORCEL.get(), "black_dye");
        oneToOneConversionRecipe(consumer, Items.LIGHT_BLUE_DYE, RuBlocks.FELICIA_DAISY.get(), "light_blue_dye");
        oneToOneConversionRecipe(consumer, Items.MAGENTA_DYE, RuBlocks.FIREWEED.get(), "magenta_dye");
        oneToOneConversionRecipe(consumer, Items.PINK_DYE, RuBlocks.GLISTERING_BLOOM.get(), "pink_dye");
        oneToOneConversionRecipe(consumer, Items.YELLOW_DYE, RuBlocks.HIBISCUS.get(), "yellow_dye");
        oneToOneConversionRecipe(consumer, Items.ORANGE_DYE, RuBlocks.MALLOW.get(), "orange_dye");
        oneToOneConversionRecipe(consumer, Items.PURPLE_DYE, RuBlocks.HYSSOP.get(), "purple_dye");
        oneToOneConversionRecipe(consumer, Items.PINK_DYE, RuBlocks.PINK_LUPINE.get(), "pink_dye");
        oneToOneConversionRecipe(consumer, Items.RED_DYE, RuBlocks.POPPY_BUSH.get(), "red_dye");
        oneToOneConversionRecipe(consumer, Items.PINK_DYE, RuBlocks.SALMON_POPPY_BUSH.get(), "pink_dye");
        oneToOneConversionRecipe(consumer, Items.PURPLE_DYE, RuBlocks.PURPLE_LUPINE.get(), "purple_dye");
        oneToOneConversionRecipe(consumer, Items.RED_DYE, RuBlocks.RED_LUPINE.get(), "red_dye");
        oneToOneConversionRecipe(consumer, Items.RED_DYE, RuBlocks.WARATAH.get(), "red_dye");
        oneToOneConversionRecipe(consumer, Items.WHITE_DYE, RuBlocks.WHITE_TRILLIUM.get(), "white_dye");
        oneToOneConversionRecipe(consumer, Items.BROWN_DYE, RuBlocks.WILTING_TRILLIUM.get(), "brown_dye");
        oneToOneConversionRecipe(consumer, Items.YELLOW_DYE, RuBlocks.YELLOW_LUPINE.get(), "yellow_dye");
        oneToOneConversionRecipe(consumer, Items.RED_DYE, RuBlocks.TSUBAKI.get(), "red_dye");

        //SNOWBELLE
        oneToOneConversionRecipe(consumer, Items.RED_DYE, RuBlocks.RED_SNOWBELLE.get(), "red_dye");
        snowbelle(consumer, RuBlocks.RED_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/red")));
        oneToOneConversionRecipe(consumer, Items.ORANGE_DYE, RuBlocks.ORANGE_SNOWBELLE.get(), "orange_dye");
        snowbelle(consumer, RuBlocks.ORANGE_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/orange")));
        oneToOneConversionRecipe(consumer, Items.YELLOW_DYE, RuBlocks.YELLOW_SNOWBELLE.get(), "yellow_dye");
        snowbelle(consumer, RuBlocks.YELLOW_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/yellow")));
        oneToOneConversionRecipe(consumer, Items.LIME_DYE, RuBlocks.LIME_SNOWBELLE.get(), "lime_dye");
        snowbelle(consumer, RuBlocks.LIME_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/lime")));
        oneToOneConversionRecipe(consumer, Items.GREEN_DYE, RuBlocks.GREEN_SNOWBELLE.get(), "green_dye");
        snowbelle(consumer, RuBlocks.GREEN_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/green")));
        oneToOneConversionRecipe(consumer, Items.CYAN_DYE, RuBlocks.CYAN_SNOWBELLE.get(), "cyan_dye");
        snowbelle(consumer, RuBlocks.CYAN_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/cyan")));
        oneToOneConversionRecipe(consumer, Items.LIGHT_BLUE_DYE, RuBlocks.LIGHT_BLUE_SNOWBELLE.get(), "light_blue_dye");
        snowbelle(consumer, RuBlocks.LIGHT_BLUE_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/light_blue")));
        oneToOneConversionRecipe(consumer, Items.BLUE_DYE, RuBlocks.BLUE_SNOWBELLE.get(), "blue_dye");
        snowbelle(consumer, RuBlocks.BLUE_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/blue")));
        oneToOneConversionRecipe(consumer, Items.PURPLE_DYE, RuBlocks.PURPLE_SNOWBELLE.get(), "purple_dye");
        snowbelle(consumer, RuBlocks.PURPLE_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/purple")));
        oneToOneConversionRecipe(consumer, Items.MAGENTA_DYE, RuBlocks.MAGENTA_SNOWBELLE.get(), "magenta_dye");
        snowbelle(consumer, RuBlocks.MAGENTA_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/magenta")));
        oneToOneConversionRecipe(consumer, Items.PINK_DYE, RuBlocks.PINK_SNOWBELLE.get(), "pink_dye");
        snowbelle(consumer, RuBlocks.PINK_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/pink")));
        oneToOneConversionRecipe(consumer, Items.BROWN_DYE, RuBlocks.BROWN_SNOWBELLE.get(), "brown_dye");
        snowbelle(consumer, RuBlocks.BROWN_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/brown")));
        oneToOneConversionRecipe(consumer, Items.WHITE_DYE, RuBlocks.WHITE_SNOWBELLE.get(), "white_dye");
        snowbelle(consumer, RuBlocks.WHITE_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/white")));
        oneToOneConversionRecipe(consumer, Items.LIGHT_GRAY_DYE, RuBlocks.LIGHT_GRAY_SNOWBELLE.get(), "light_gray_dye");
        snowbelle(consumer, RuBlocks.LIGHT_GRAY_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/light_gray")));
        oneToOneConversionRecipe(consumer, Items.GRAY_DYE, RuBlocks.GRAY_SNOWBELLE.get(), "gray_dye");
        snowbelle(consumer, RuBlocks.GRAY_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/gray")));
        oneToOneConversionRecipe(consumer, Items.BLACK_DYE, RuBlocks.BLACK_SNOWBELLE.get(), "black_dye");
        snowbelle(consumer, RuBlocks.BLACK_SNOWBELLE.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/black")));

        oneToOneConversionRecipe(consumer, Items.ORANGE_DYE, RuBlocks.ORANGE_CONEFLOWER.get(), "orange_dye");
        oneToOneConversionRecipe(consumer, Items.PURPLE_DYE, RuBlocks.PURPLE_CONEFLOWER.get(), "purple_dye");
        oneToOneConversionRecipe(consumer, Items.LIGHT_BLUE_DYE, RuBlocks.ASTER.get(), "light_blue_dye");

        oneToOneConversionRecipe(consumer, Items.LIGHT_BLUE_DYE, RuBlocks.BLUE_MAGNOLIA_FLOWERS.get(), "light_blue_dye");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.BLUE_MAGNOLIA_FLOWERS.get(), 6).define('#', RuBlocks.BLUE_MAGNOLIA_LEAVES.get()).pattern("###").group("multiface_flowers").unlockedBy("has_blue_magnolia_leaves", has(RuBlocks.BLUE_MAGNOLIA_LEAVES.get())).save(consumer);
        oneToOneConversionRecipe(consumer, Items.PINK_DYE, RuBlocks.PINK_MAGNOLIA_FLOWERS.get(), "pink_dye");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.PINK_MAGNOLIA_FLOWERS.get(), 6).define('#', RuBlocks.PINK_MAGNOLIA_LEAVES.get()).pattern("###").group("multiface_flowers").unlockedBy("has_pink_magnolia_leaves", has(RuBlocks.PINK_MAGNOLIA_LEAVES.get())).save(consumer);
        oneToOneConversionRecipe(consumer, Items.WHITE_DYE, RuBlocks.WHITE_MAGNOLIA_FLOWERS.get(), "white_dye");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.WHITE_MAGNOLIA_FLOWERS.get(), 6).define('#', RuBlocks.WHITE_MAGNOLIA_LEAVES.get()).pattern("###").group("multiface_flowers").unlockedBy("has_white_magnolia_leaves", has(RuBlocks.WHITE_MAGNOLIA_LEAVES.get())).save(consumer);

        oneToOneConversionRecipe(consumer, Items.BLUE_DYE, RuItems.MEADOW_SAGE.get(), "blue_dye");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RuBlocks.BARLEY.get()), RecipeCategory.FOOD, Items.BREAD, 0.35F, 200).unlockedBy("has_barley", has(RuBlocks.BARLEY.get())).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, "barley_smelting"));
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(RuBlocks.BARLEY.get()), RecipeCategory.FOOD, Items.BREAD, 0.35F, 100).unlockedBy("has_barley", has(RuBlocks.BARLEY.get())).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, "barley_smoking"));
        oneToOneConversionRecipe(consumer, Items.BROWN_DYE, RuBlocks.CATTAIL.get(), "brown_dye");
        oneToOneConversionRecipe(consumer, Items.LIGHT_GRAY_DYE, RuBlocks.TASSEL.get(), "light_gray_dye");
        oneToOneConversionRecipe(consumer, Items.ORANGE_DYE, RuBlocks.DAY_LILY.get(), "orange_dye");

        oneToOneConversionRecipe(consumer, RuBlocks.ASHEN_SAPLING.get(), RuBlocks.ASHEN_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, Blocks.ACACIA_SAPLING, RuBlocks.ACACIA_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, Blocks.BIRCH_SAPLING, RuBlocks.BIRCH_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.BAOBAB_SAPLING.get(), RuBlocks.BAOBAB_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.BLACKWOOD_SAPLING.get(), RuBlocks.BLACKWOOD_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.BRIMWOOD_SAPLING.get(), RuBlocks.BRIMWOOD_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, Blocks.CHERRY_SAPLING, RuBlocks.CHERRY_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, Items.MAGENTA_DYE, RuBlocks.CACTUS_FLOWER.get(), "magenta_dye");
        oneToOneConversionRecipe(consumer, RuBlocks.MAGNOLIA_SAPLING.get(), RuBlocks.MAGNOLIA_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.CYPRESS_SAPLING.get(), RuBlocks.CYPRESS_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, Blocks.DARK_OAK_SAPLING, RuBlocks.DARK_OAK_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.DEAD_PINE_SAPLING.get(), RuBlocks.DEAD_PINE_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.DEAD_SAPLING.get(), RuBlocks.DEAD_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.EUCALYPTUS_SAPLING.get(), RuBlocks.EUCALYPTUS_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.FLOWERING_SAPLING.get(), RuBlocks.FLOWERING_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.GOLDEN_LARCH_SAPLING.get(), RuBlocks.GOLDEN_LARCH_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.JOSHUA_SAPLING.get(), RuBlocks.JOSHUA_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.KAPOK_SAPLING.get(), RuBlocks.KAPOK_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, Blocks.JUNGLE_SAPLING, RuBlocks.JUNGLE_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.LARCH_SAPLING.get(), RuBlocks.LARCH_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, Blocks.MANGROVE_PROPAGULE, RuBlocks.MANGROVE_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.MAPLE_SAPLING.get(), RuBlocks.MAPLE_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.MAUVE_SAPLING.get(), RuBlocks.MAUVE_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, Blocks.OAK_SAPLING, RuBlocks.OAK_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.ORANGE_MAPLE_SAPLING.get(), RuBlocks.ORANGE_MAPLE_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.PALM_SAPLING.get(), RuBlocks.PALM_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.PINE_SAPLING.get(), RuBlocks.PINE_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.BLUE_MAGNOLIA_SAPLING.get(), RuBlocks.BLUE_MAGNOLIA_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.PINK_MAGNOLIA_SAPLING.get(), RuBlocks.PINK_MAGNOLIA_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.REDWOOD_SAPLING.get(), RuBlocks.REDWOOD_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.RED_MAPLE_SAPLING.get(), RuBlocks.RED_MAPLE_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.ENCHANTED_BIRCH_SAPLING.get(), RuBlocks.ENCHANTED_BIRCH_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.SILVER_BIRCH_SAPLING.get(), RuBlocks.SILVER_BIRCH_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.SOCOTRA_SAPLING.get(), RuBlocks.SOCOTRA_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, Blocks.SPRUCE_SAPLING, RuBlocks.SPRUCE_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.WHITE_MAGNOLIA_SAPLING.get(), RuBlocks.WHITE_MAGNOLIA_SHRUB.get(), "saplings", 2);
        oneToOneConversionRecipe(consumer, RuBlocks.WILLOW_SAPLING.get(), RuBlocks.WILLOW_SHRUB.get(), "saplings", 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.ASHEN_SHRUB.get(), 1).define('#', RuBlocks.ASHEN_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_ashen_sapling", has(RuBlocks.ASHEN_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.ACACIA_SHRUB.get(), 1).define('#', Blocks.ACACIA_SAPLING).pattern("#").pattern("#").group("shrubs").unlockedBy("has_acacia_sapling", has(Blocks.ACACIA_SAPLING)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.BAOBAB_SHRUB.get(), 1).define('#', RuBlocks.BAOBAB_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_baobab_sapling", has(RuBlocks.BAOBAB_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.BIRCH_SHRUB.get(), 1).define('#', Blocks.BIRCH_SAPLING).pattern("#").pattern("#").group("shrubs").unlockedBy("has_birch_sapling", has(Blocks.BIRCH_SAPLING)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.BLACKWOOD_SHRUB.get(), 1).define('#', RuBlocks.BLACKWOOD_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_blackwood_sapling", has(RuBlocks.BLACKWOOD_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.BRIMWOOD_SHRUB.get(), 1).define('#', RuBlocks.BRIMWOOD_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_brimwood_sapling", has(RuBlocks.BRIMWOOD_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.CHERRY_SHRUB.get(), 1).define('#', Blocks.CHERRY_SAPLING).pattern("#").pattern("#").group("shrubs").unlockedBy("has_cherry_sapling", has(Blocks.CHERRY_SAPLING)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.MAGNOLIA_SHRUB.get(), 1).define('#', RuBlocks.MAGNOLIA_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_magnolia_sapling", has(RuBlocks.MAGNOLIA_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.CYPRESS_SHRUB.get(), 1).define('#', RuBlocks.CYPRESS_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_cypress_sapling", has(RuBlocks.CYPRESS_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.DARK_OAK_SHRUB.get(), 1).define('#', Blocks.DARK_OAK_SAPLING).pattern("#").pattern("#").group("shrubs").unlockedBy("has_dark_oak_sapling", has(Blocks.DARK_OAK_SAPLING)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.DEAD_PINE_SHRUB.get(), 1).define('#', RuBlocks.DEAD_PINE_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_dead_pine_sapling", has(RuBlocks.DEAD_PINE_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.DEAD_SHRUB.get(), 1).define('#', RuBlocks.DEAD_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_dead_sapling", has(RuBlocks.DEAD_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.EUCALYPTUS_SHRUB.get(), 1).define('#', RuBlocks.EUCALYPTUS_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_eucalyptus_sapling", has(RuBlocks.EUCALYPTUS_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.FLOWERING_SHRUB.get(), 1).define('#', RuBlocks.FLOWERING_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_flowering_sapling", has(RuBlocks.FLOWERING_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.GOLDEN_LARCH_SHRUB.get(), 1).define('#', RuBlocks.GOLDEN_LARCH_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_golden_larch_sapling", has(RuBlocks.GOLDEN_LARCH_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.JOSHUA_SHRUB.get(), 1).define('#', RuBlocks.JOSHUA_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_joshua_sapling", has(RuBlocks.JOSHUA_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.KAPOK_SHRUB.get(), 1).define('#', RuBlocks.KAPOK_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_kapok_sapling", has(RuBlocks.KAPOK_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.JUNGLE_SHRUB.get(), 1).define('#', Blocks.JUNGLE_SAPLING).pattern("#").pattern("#").group("shrubs").unlockedBy("has_jungle_sapling", has(Blocks.JUNGLE_SAPLING)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.LARCH_SHRUB.get(), 1).define('#', RuBlocks.LARCH_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_larch_sapling", has(RuBlocks.LARCH_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.MANGROVE_SHRUB.get(), 1).define('#', Blocks.MANGROVE_PROPAGULE).pattern("#").pattern("#").group("shrubs").unlockedBy("has_mangrove_propagule", has(Blocks.MANGROVE_PROPAGULE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.MAPLE_SHRUB.get(), 1).define('#', RuBlocks.MAPLE_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_maple_sapling", has(RuBlocks.MAPLE_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.MAUVE_SHRUB.get(), 1).define('#', RuBlocks.MAUVE_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_mauve_sapling", has(RuBlocks.MAUVE_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.OAK_SHRUB.get(), 1).define('#', Blocks.OAK_SAPLING).pattern("#").pattern("#").group("shrubs").unlockedBy("has_oak_sapling", has(Blocks.OAK_SAPLING)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.ORANGE_MAPLE_SHRUB.get(), 1).define('#', RuBlocks.ORANGE_MAPLE_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_orange_maple_sapling", has(RuBlocks.ORANGE_MAPLE_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.PALM_SHRUB.get(), 1).define('#', RuBlocks.PALM_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_palm_sapling", has(RuBlocks.PALM_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.PINE_SHRUB.get(), 1).define('#', RuBlocks.PINE_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_pine_sapling", has(RuBlocks.PINE_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.BLUE_MAGNOLIA_SHRUB.get(), 1).define('#', RuBlocks.BLUE_MAGNOLIA_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_blue_magnolia_sapling", has(RuBlocks.BLUE_MAGNOLIA_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.PINK_MAGNOLIA_SHRUB.get(), 1).define('#', RuBlocks.PINK_MAGNOLIA_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_pink_magnolia_sapling", has(RuBlocks.PINK_MAGNOLIA_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.REDWOOD_SHRUB.get(), 1).define('#', RuBlocks.REDWOOD_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_redwood_sapling", has(RuBlocks.REDWOOD_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.RED_MAPLE_SHRUB.get(), 1).define('#', RuBlocks.RED_MAPLE_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_red_maple_sapling", has(RuBlocks.RED_MAPLE_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.ENCHANTED_BIRCH_SHRUB.get(), 1).define('#', RuBlocks.ENCHANTED_BIRCH_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_enchanted_birch_sapling", has(RuBlocks.ENCHANTED_BIRCH_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.SILVER_BIRCH_SHRUB.get(), 1).define('#', RuBlocks.SILVER_BIRCH_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_silver_birch_sapling", has(RuBlocks.SILVER_BIRCH_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.SOCOTRA_SHRUB.get(), 1).define('#', RuBlocks.SOCOTRA_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_socotra_sapling", has(RuBlocks.SOCOTRA_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.SPRUCE_SHRUB.get(), 1).define('#', Blocks.SPRUCE_SAPLING).pattern("#").pattern("#").group("shrubs").unlockedBy("has_spruce_sapling", has(Blocks.SPRUCE_SAPLING)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.WHITE_MAGNOLIA_SHRUB.get(), 1).define('#', RuBlocks.WHITE_MAGNOLIA_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_white_magnolia_sapling", has(RuBlocks.WHITE_MAGNOLIA_SAPLING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.WILLOW_SHRUB.get(), 1).define('#', RuBlocks.WILLOW_SAPLING.get()).pattern("#").pattern("#").group("shrubs").unlockedBy("has_willow_sapling", has(RuBlocks.WILLOW_SAPLING.get())).save(consumer);

        oneToOneConversionRecipe(consumer, RuBlocks.BLUE_BIOSHROOM.get(), RuBlocks.TALL_BLUE_BIOSHROOM.get(), "bioshrooms", 2);
        oneToOneConversionRecipe(consumer, Items.BLUE_DYE, RuBlocks.BLUE_BIOSHROOM.get(), "blue_dye");
        oneToOneConversionRecipe(consumer, RuBlocks.GREEN_BIOSHROOM.get(), RuBlocks.TALL_GREEN_BIOSHROOM.get(), "bioshrooms", 2);
        oneToOneConversionRecipe(consumer, Items.LIME_DYE, RuBlocks.GREEN_BIOSHROOM.get(), "lime_dye");
        oneToOneConversionRecipe(consumer, RuBlocks.PINK_BIOSHROOM.get(), RuBlocks.TALL_PINK_BIOSHROOM.get(), "bioshrooms", 2);
        oneToOneConversionRecipe(consumer, Items.PINK_DYE, RuBlocks.PINK_BIOSHROOM.get(), "pink_dye");
        oneToOneConversionRecipe(consumer, RuBlocks.YELLOW_BIOSHROOM.get(), RuBlocks.TALL_YELLOW_BIOSHROOM.get(), "bioshrooms", 2);
        oneToOneConversionRecipe(consumer, Items.YELLOW_DYE, RuBlocks.TALL_YELLOW_BIOSHROOM.get(), "yellow_dye");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.TALL_BLUE_BIOSHROOM.get(), 1).define('#', RuBlocks.BLUE_BIOSHROOM.get()).pattern("#").pattern("#").group("bioshrooms").unlockedBy("has_blue_bioshroom", has(RuBlocks.BLUE_BIOSHROOM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.TALL_GREEN_BIOSHROOM.get(), 1).define('#', RuBlocks.GREEN_BIOSHROOM.get()).pattern("#").pattern("#").group("bioshrooms").unlockedBy("has_green_bioshroom", has(RuBlocks.GREEN_BIOSHROOM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.TALL_PINK_BIOSHROOM.get(), 1).define('#', RuBlocks.PINK_BIOSHROOM.get()).pattern("#").pattern("#").group("bioshrooms").unlockedBy("has_pink_bioshroom", has(RuBlocks.PINK_BIOSHROOM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.TALL_YELLOW_BIOSHROOM.get(), 1).define('#', RuBlocks.YELLOW_BIOSHROOM.get()).pattern("#").pattern("#").group("bioshrooms").unlockedBy("has_yellow_bioshroom", has(RuBlocks.YELLOW_BIOSHROOM.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.ICE).define('#', RuBlocks.ICICLE.get()).pattern("##").pattern("##").group("ice").unlockedBy("has_icicle", has(RuBlocks.ICICLE.get())).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(Blocks.ICE,RuBlocks.ICICLE.get())));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RuBlocks.BARREL_CACTUS.get()), RecipeCategory.MISC, Items.GREEN_DYE, 1.0F, 200).group("cactus").unlockedBy("has_barrel_cactus", has(RuBlocks.BARREL_CACTUS.get())).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(Items.GREEN_DYE, RuBlocks.BARREL_CACTUS.get())));
        oneToOneConversionRecipe(consumer, Items.ORANGE_DYE, RuBlocks.CAVE_HYSSOP.get(), "orange_dye");

        /*-----------------PLANT_BLOCKS-----------------*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.BLUE_BIOSHROOM_BLOCK.get(), 1).define('#', RuBlocks.BLUE_BIOSHROOM.get()).pattern("##").pattern("##").group("bioshroom_blocks").unlockedBy("has_blue_bioshroom", has(RuBlocks.BLUE_BIOSHROOM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.GLOWING_BLUE_BIOSHROOM_BLOCK.get(), 4).define('#', RuBlocks.BLUE_BIOSHROOM_BLOCK.get()).define('X', Blocks.GLOWSTONE).pattern(" # ").pattern("#X#").pattern(" # ").group("bioshroom_blocks").unlockedBy("has_blue_bioshroom_block", has(RuBlocks.BLUE_BIOSHROOM_BLOCK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.GREEN_BIOSHROOM_BLOCK.get(), 1).define('#', RuBlocks.GREEN_BIOSHROOM.get()).pattern("##").pattern("##").group("bioshroom_blocks").unlockedBy("has_green_bioshroom", has(RuBlocks.GREEN_BIOSHROOM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.GLOWING_GREEN_BIOSHROOM_BLOCK.get(), 4).define('#', RuBlocks.GREEN_BIOSHROOM_BLOCK.get()).define('X', Blocks.GLOWSTONE).pattern(" # ").pattern("#X#").pattern(" # ").group("bioshroom_blocks").unlockedBy("has_green_bioshroom_block", has(RuBlocks.GREEN_BIOSHROOM_BLOCK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.PINK_BIOSHROOM_BLOCK.get(), 1).define('#', RuBlocks.PINK_BIOSHROOM.get()).pattern("##").pattern("##").group("bioshroom_blocks").unlockedBy("has_pink_bioshroom", has(RuBlocks.PINK_BIOSHROOM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.GLOWING_PINK_BIOSHROOM_BLOCK.get(), 4).define('#', RuBlocks.PINK_BIOSHROOM_BLOCK.get()).define('X', Blocks.GLOWSTONE).pattern(" # ").pattern("#X#").pattern(" # ").group("bioshroom_blocks").unlockedBy("has_pink_bioshroom_block", has(RuBlocks.PINK_BIOSHROOM_BLOCK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.YELLOW_BIOSHROOM_BLOCK.get(), 1).define('#', RuBlocks.YELLOW_BIOSHROOM.get()).pattern("##").pattern("##").group("bioshroom_blocks").unlockedBy("has_yellow_bioshroom", has(RuBlocks.YELLOW_BIOSHROOM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.GLOWING_YELLOW_BIOSHROOM_BLOCK.get(), 4).define('#', RuBlocks.YELLOW_BIOSHROOM_BLOCK.get()).define('X', Blocks.GLOWSTONE).pattern(" # ").pattern("#X#").pattern(" # ").group("bioshroom_blocks").unlockedBy("has_yellow_bioshroom_block", has(RuBlocks.YELLOW_BIOSHROOM_BLOCK.get())).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RuBlocks.SAGUARO_CACTUS.get()), RecipeCategory.MISC, Items.GREEN_DYE, 1.0F, 200).group("cactus").unlockedBy("has_saguaro_cactus", has(RuBlocks.SAGUARO_CACTUS.get())).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(Items.GREEN_DYE, RuBlocks.SAGUARO_CACTUS.get())));

        /*-----------------BRANCHES-----------------*/
        branchFromLog(consumer, RuBlocks.ACACIA_BRANCH.get(), Blocks.ACACIA_LOG);
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.ACACIA_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.BAOBAB_BRANCH.get(), RuBlocks.BAOBAB_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.BAOBAB_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.BIRCH_BRANCH.get(), Blocks.BIRCH_LOG);
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.BIRCH_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.BLACKWOOD_BRANCH.get(), RuBlocks.BLACKWOOD_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.BLACKWOOD_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.MAGNOLIA_BRANCH.get(), RuBlocks.MAGNOLIA_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.MAGNOLIA_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.CYPRESS_BRANCH.get(), RuBlocks.CYPRESS_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.CYPRESS_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.CHERRY_BRANCH.get(), Blocks.CHERRY_LOG);
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.CHERRY_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.DARK_OAK_BRANCH.get(), Blocks.DARK_OAK_LOG);
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.DARK_OAK_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.DEAD_BRANCH.get(), RuBlocks.DEAD_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.DEAD_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.EUCALYPTUS_BRANCH.get(), RuBlocks.EUCALYPTUS_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.EUCALYPTUS_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.JOSHUA_BEARD.get(), RuBlocks.JOSHUA_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.JOSHUA_BEARD.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.KAPOK_BRANCH.get(), RuBlocks.KAPOK_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.KAPOK_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.JUNGLE_BRANCH.get(), Blocks.JUNGLE_LOG);
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.JUNGLE_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.LARCH_BRANCH.get(), RuBlocks.LARCH_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.LARCH_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.MANGROVE_BRANCH.get(), Blocks.MANGROVE_LOG);
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.MANGROVE_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.MAPLE_BRANCH.get(), RuBlocks.MAPLE_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.MAPLE_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.MAUVE_BRANCH.get(), RuBlocks.MAUVE_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.MAUVE_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.OAK_BRANCH.get(), Blocks.OAK_LOG);
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.OAK_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.PALM_BEARD.get(), RuBlocks.PALM_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.PALM_BEARD.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.PINE_BRANCH.get(), RuBlocks.PINE_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.PINE_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.REDWOOD_BRANCH.get(), RuBlocks.REDWOOD_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.REDWOOD_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.SILVER_BIRCH_BRANCH.get(), RuBlocks.SILVER_BIRCH_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.SILVER_BIRCH_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.SOCOTRA_BRANCH.get(), RuBlocks.SOCOTRA_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.SOCOTRA_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.SPRUCE_BRANCH.get(), Blocks.SPRUCE_LOG);
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.SPRUCE_BRANCH.get(), "stick", 4);

        branchFromLog(consumer, RuBlocks.WILLOW_BRANCH.get(), RuBlocks.WILLOW_LOG.get());
        oneToOneConversionRecipe(consumer, Items.STICK, RuBlocks.WILLOW_BRANCH.get(), "stick", 4);

        /*-----------------DIRT_BLOCKS-----------------*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.PEAT_COARSE_DIRT.get(), 4).define('D', RuBlocks.PEAT_DIRT.get()).define('G', Blocks.GRAVEL).pattern("DG").pattern("GD").group("coarse_dirt").unlockedBy("has_gravel", has(Blocks.GRAVEL)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.SILT_COARSE_DIRT.get(), 4).define('D', RuBlocks.SILT_DIRT.get()).define('G', Blocks.GRAVEL).pattern("DG").pattern("GD").group("coarse_dirt").unlockedBy("has_gravel", has(Blocks.GRAVEL)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.ASHEN_DIRT.get(), 4).define('D', Blocks.DIRT).define('G', RuTags.ASH_ITEM).pattern("DG").pattern("GD").group("coarse_dirt").unlockedBy("has_ash", has(RuTags.ASH_ITEM)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(RuBlocks.ASHEN_DIRT.get(), Blocks.DIRT)));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.ASHEN_DIRT.get(), 4).define('D', RuBlocks.PEAT_DIRT.get()).define('G', RuTags.ASH_ITEM).pattern("DG").pattern("GD").group("coarse_dirt").unlockedBy("has_ash", has(RuTags.ASH_ITEM)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(RuBlocks.ASHEN_DIRT.get(), RuBlocks.PEAT_DIRT.get())));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.ASHEN_DIRT.get(), 4).define('D', RuBlocks.SILT_DIRT.get()).define('G', RuTags.ASH_ITEM).pattern("DG").pattern("GD").group("coarse_dirt").unlockedBy("has_ash", has(RuTags.ASH_ITEM)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(RuBlocks.ASHEN_DIRT.get(), RuBlocks.SILT_DIRT.get())));

        /*-----------------STONE_BLOCKS-----------------*/

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_SLAB.get(), Ingredient.of(RuBlocks.CHALK.get())).group("chalk").unlockedBy("has_chalk", has(RuBlocks.CHALK.get())).save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_SLAB.get(), RuBlocks.CHALK.get(), 2);

        stairBuilder(RuBlocks.CHALK_STAIRS.get(), Ingredient.of(RuBlocks.CHALK.get())).group("chalk").unlockedBy("has_chalk", has(RuBlocks.CHALK.get())).save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_STAIRS.get(), RuBlocks.CHALK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_GRASS_BLOCK.get(), 1).define('#', RuBlocks.CHALK.get()).define('X', RuTags.GRASS_ITEM).pattern("X").pattern("#").group("stone_grass").unlockedBy("has_chalk", has(RuBlocks.CHALK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_BRICKS.get(), 4).define('#', RuBlocks.POLISHED_CHALK.get()).pattern("##").pattern("##").group("chalk").unlockedBy("has_polished_chalk", has(RuBlocks.POLISHED_CHALK.get())).save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_BRICKS.get(), RuBlocks.CHALK.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_BRICKS.get(), RuBlocks.CHALK_GRASS_BLOCK.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_BRICKS.get(), RuBlocks.POLISHED_CHALK.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_BRICKS.get(), RuBlocks.CHALK_PILLAR.get());

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_BRICK_SLAB.get(), Ingredient.of(RuBlocks.CHALK_BRICKS.get())).group("chalk").unlockedBy("has_chalk_bricks", has(RuBlocks.CHALK_BRICKS.get())).save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_BRICK_SLAB.get(), RuBlocks.CHALK_BRICKS.get(), 2);

        stairBuilder(RuBlocks.CHALK_BRICK_STAIRS.get(), Ingredient.of(RuBlocks.CHALK_BRICKS.get())).group("chalk").unlockedBy("has_chalk_bricks", has(RuBlocks.CHALK_BRICKS.get())).save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_BRICK_STAIRS.get(), RuBlocks.CHALK_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_PILLAR.get(), 2).define('#', RuBlocks.CHALK.get()).pattern("#").pattern("#").group("chalk").unlockedBy("has_chalk", has(RuBlocks.CHALK.get())).save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_PILLAR.get(), RuBlocks.CHALK.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_PILLAR.get(), RuBlocks.CHALK_GRASS_BLOCK.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_PILLAR.get(), RuBlocks.POLISHED_CHALK.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.CHALK_PILLAR.get(), RuBlocks.CHALK_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.POLISHED_CHALK.get(), 4).define('#', RuBlocks.CHALK.get()).pattern("##").pattern("##").group("chalk").unlockedBy("has_chalk", has(RuBlocks.CHALK.get())).save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.POLISHED_CHALK.get(), RuBlocks.CHALK.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.POLISHED_CHALK.get(), RuBlocks.CHALK_GRASS_BLOCK.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.POLISHED_CHALK.get(), RuBlocks.CHALK_BRICKS.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.POLISHED_CHALK.get(), RuBlocks.CHALK_PILLAR.get());

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, RuBlocks.POLISHED_CHALK_SLAB.get(), Ingredient.of(RuBlocks.POLISHED_CHALK.get())).group("chalk").unlockedBy("has_polished_chalk", has(RuBlocks.POLISHED_CHALK.get())).save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.POLISHED_CHALK_SLAB.get(), RuBlocks.POLISHED_CHALK.get(), 2);

        stairBuilder(RuBlocks.POLISHED_CHALK_STAIRS.get(), Ingredient.of(RuBlocks.POLISHED_CHALK.get())).group("chalk").unlockedBy("has_polished_chalk", has(RuBlocks.POLISHED_CHALK.get())).save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, RuBlocks.POLISHED_CHALK_STAIRS.get(), RuBlocks.POLISHED_CHALK.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, RuBlocks.MOSSY_STONE.get(), 1).requires(Blocks.STONE).requires(Blocks.VINE).group("mossy").unlockedBy("has_stone", has(Blocks.STONE)).unlockedBy("has_vine", has(Blocks.VINE)).save(consumer);
        oreSmelting(consumer, MOSSY_STONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, RuBlocks.MOSSY_STONE.get(), 0.1F, 200, "mossy");
        oreBlasting(consumer, MOSSY_STONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, RuBlocks.MOSSY_STONE.get(), 0.1F, 100, "mossy");

        /*-----------------OCEAN_BLOCKS-----------------*/
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, RuBlocks.HYACINTH_LAMP.get()).define('#', Items.PRISMARINE_SLAB).define('X', RuTags.HYACINTH_BLOOMS_ITEM).pattern("X").pattern("#").group("hyacinth").unlockedBy("has_prismarine_slab", has(Items.PRISMARINE_SLAB)).unlockedBy("has_hyacinth", has(RuTags.HYACINTH_BLOOMS_ITEM)).save(consumer);

        /*-----------------OTHER_BLOCKS-----------------*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.ASH.get(), 1).define('#', Items.GUNPOWDER).pattern("##").pattern("##").group("ash").unlockedBy("has_gunpowder", has(Items.GUNPOWDER)).save(consumer);

        /*-----------------WOOD_TYPES-----------------*/
        //planksFromLogs(consumer, Blocks.BAMBOO_PLANKS, RuTags.BAMBOO_LOGS_ITEM, 4);
        //ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.BAMBOO, 1).define('#', RuTags.BAMBOO_LOGS_ITEM).pattern("#").pattern("#").group("bamboo").unlockedBy("has_bamboo_log", has(RuTags.BAMBOO_LOGS_ITEM)).save(consumer);
        //ASHEN_BLOCKS
        woodFromLogs(consumer, RuBlocks.ASHEN_WOOD.get(), RuBlocks.ASHEN_LOG.get());
        //SILVER_BIRCH_BLOCKS
        woodFromLogs(consumer, RuBlocks.SILVER_BIRCH_WOOD.get(), RuBlocks.SILVER_BIRCH_LOG.get());
        //ALPHA_BLOCKS
        planksFromOneLog(consumer, RuBlocks.ALPHA_PLANKS.get(), RuBlocks.ALPHA_LOG.get(), 4);
        woodenStairs(consumer, RuBlocks.ALPHA_STAIRS.get(), RuBlocks.ALPHA_PLANKS.get());
        woodenSlab(consumer, RuBlocks.ALPHA_SLAB.get(), RuBlocks.ALPHA_PLANKS.get());
        woodenFence(consumer, Items.OAK_FENCE, RuBlocks.ALPHA_PLANKS.get());
        woodenDoor(consumer, Items.OAK_DOOR, RuBlocks.ALPHA_PLANKS.get());
        woodenFenceGate(consumer, Items.OAK_FENCE_GATE, RuBlocks.ALPHA_PLANKS.get());
        woodenTrapdoor(consumer, Items.OAK_TRAPDOOR, RuBlocks.ALPHA_PLANKS.get());
        pressurePlate(consumer, Items.OAK_PRESSURE_PLATE, RuBlocks.ALPHA_PLANKS.get());
        woodenButton(consumer, Items.OAK_BUTTON, RuBlocks.ALPHA_PLANKS.get());
        woodenSign(consumer, Items.OAK_SIGN, RuBlocks.ALPHA_PLANKS.get());
        hangingSign(consumer, Items.OAK_HANGING_SIGN, RuBlocks.ALPHA_PLANKS.get());
        woodenBoat(consumer, Items.OAK_BOAT, RuBlocks.ALPHA_PLANKS.get());
        //BAOBAB_BLOCKS
        woodFromLogs(consumer, RuBlocks.BAOBAB_WOOD.get(), RuBlocks.BAOBAB_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_BAOBAB_WOOD.get(), RuBlocks.STRIPPED_BAOBAB_LOG.get());
        planksFromLogs(consumer, RuBlocks.BAOBAB_PLANKS.get(), RuTags.BAOBAB_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.BAOBAB_STAIRS.get(), RuBlocks.BAOBAB_PLANKS.get());
        woodenSlab(consumer, RuBlocks.BAOBAB_SLAB.get(), RuBlocks.BAOBAB_PLANKS.get());
        woodenFence(consumer, RuBlocks.BAOBAB_FENCE.get(), RuBlocks.BAOBAB_PLANKS.get());
        woodenDoor(consumer, RuBlocks.BAOBAB_DOOR.get(), RuBlocks.BAOBAB_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.BAOBAB_FENCE_GATE.get(), RuBlocks.BAOBAB_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.BAOBAB_TRAPDOOR.get(), RuBlocks.BAOBAB_PLANKS.get());
        pressurePlate(consumer, RuBlocks.BAOBAB_PRESSURE_PLATE.get(), RuBlocks.BAOBAB_PLANKS.get());
        woodenButton(consumer, RuBlocks.BAOBAB_BUTTON.get(), RuBlocks.BAOBAB_PLANKS.get());
        woodenSign(consumer, RuBlocks.BAOBAB_SIGN.get(), RuBlocks.BAOBAB_PLANKS.get());
        hangingSign(consumer, RuBlocks.BAOBAB_HANGING_SIGN.get(), RuBlocks.STRIPPED_BAOBAB_LOG.get());
        woodenBoat(consumer, RuItems.BAOBAB_BOAT.get(), RuBlocks.BAOBAB_PLANKS.get());
        chestBoat(consumer, RuItems.BAOBAB_CHEST_BOAT.get(), RuItems.BAOBAB_BOAT.get());
        //BRIMWOOD_BLOCKS
        woodFromLogs(consumer, RuBlocks.BRIMWOOD_WOOD.get(), RuBlocks.BRIMWOOD_LOG.get());
        woodFromOtherItem(consumer, RuBlocks.BRIMWOOD_WOOD.get(), RuBlocks.BRIMWOOD_LOG_MAGMA.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_BRIMWOOD_WOOD.get(), RuBlocks.STRIPPED_BRIMWOOD_LOG.get());
        planksFromLogs(consumer, RuBlocks.BRIMWOOD_PLANKS.get(), RuTags.BRIMWOOD_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.BRIMWOOD_STAIRS.get(), RuBlocks.BRIMWOOD_PLANKS.get());
        woodenSlab(consumer, RuBlocks.BRIMWOOD_SLAB.get(), RuBlocks.BRIMWOOD_PLANKS.get());
        woodenFence(consumer, RuBlocks.BRIMWOOD_FENCE.get(), RuBlocks.BRIMWOOD_PLANKS.get());
        woodenDoor(consumer, RuBlocks.BRIMWOOD_DOOR.get(), RuBlocks.BRIMWOOD_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.BRIMWOOD_FENCE_GATE.get(), RuBlocks.BRIMWOOD_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.BRIMWOOD_TRAPDOOR.get(), RuBlocks.BRIMWOOD_PLANKS.get());
        pressurePlate(consumer, RuBlocks.BRIMWOOD_PRESSURE_PLATE.get(), RuBlocks.BRIMWOOD_PLANKS.get());
        woodenButton(consumer, RuBlocks.BRIMWOOD_BUTTON.get(), RuBlocks.BRIMWOOD_PLANKS.get());
        woodenSign(consumer, RuBlocks.BRIMWOOD_SIGN.get(), RuBlocks.BRIMWOOD_PLANKS.get());
        hangingSign(consumer, RuBlocks.BRIMWOOD_HANGING_SIGN.get(), RuBlocks.STRIPPED_BRIMWOOD_LOG.get());
        //BLUE_BIOSHROOM_BLOCKS
        woodFromLogs(consumer, RuBlocks.BLUE_BIOSHROOM_HYPHAE.get(), RuBlocks.BLUE_BIOSHROOM_STEM.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_BLUE_BIOSHROOM_HYPHAE.get(), RuBlocks.STRIPPED_BLUE_BIOSHROOM_STEM.get());
        planksFromLogs(consumer, RuBlocks.BLUE_BIOSHROOM_PLANKS.get(), RuTags.BLUE_BIOSHROOM_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.BLUE_BIOSHROOM_STAIRS.get(), RuBlocks.BLUE_BIOSHROOM_PLANKS.get());
        woodenSlab(consumer, RuBlocks.BLUE_BIOSHROOM_SLAB.get(), RuBlocks.BLUE_BIOSHROOM_PLANKS.get());
        woodenFence(consumer, RuBlocks.BLUE_BIOSHROOM_FENCE.get(), RuBlocks.BLUE_BIOSHROOM_PLANKS.get());
        woodenDoor(consumer, RuBlocks.BLUE_BIOSHROOM_DOOR.get(), RuBlocks.BLUE_BIOSHROOM_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.BLUE_BIOSHROOM_FENCE_GATE.get(), RuBlocks.BLUE_BIOSHROOM_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.BLUE_BIOSHROOM_TRAPDOOR.get(), RuBlocks.BLUE_BIOSHROOM_PLANKS.get());
        pressurePlate(consumer, RuBlocks.BLUE_BIOSHROOM_PRESSURE_PLATE.get(), RuBlocks.BLUE_BIOSHROOM_PLANKS.get());
        woodenButton(consumer, RuBlocks.BLUE_BIOSHROOM_BUTTON.get(), RuBlocks.BLUE_BIOSHROOM_PLANKS.get());
        woodenSign(consumer, RuBlocks.BLUE_BIOSHROOM_SIGN.get(), RuBlocks.BLUE_BIOSHROOM_PLANKS.get());
        hangingSign(consumer, RuBlocks.BLUE_BIOSHROOM_HANGING_SIGN.get(), RuBlocks.STRIPPED_BLUE_BIOSHROOM_STEM.get());
        //BLACKWOOD_BLOCKS
        woodFromLogs(consumer, RuBlocks.BLACKWOOD_WOOD.get(), RuBlocks.BLACKWOOD_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_BLACKWOOD_WOOD.get(), RuBlocks.STRIPPED_BLACKWOOD_LOG.get());
        planksFromLogs(consumer, RuBlocks.BLACKWOOD_PLANKS.get(), RuTags.BLACKWOOD_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.BLACKWOOD_STAIRS.get(), RuBlocks.BLACKWOOD_PLANKS.get());
        woodenSlab(consumer, RuBlocks.BLACKWOOD_SLAB.get(), RuBlocks.BLACKWOOD_PLANKS.get());
        woodenFence(consumer, RuBlocks.BLACKWOOD_FENCE.get(), RuBlocks.BLACKWOOD_PLANKS.get());
        woodenDoor(consumer, RuBlocks.BLACKWOOD_DOOR.get(), RuBlocks.BLACKWOOD_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.BLACKWOOD_FENCE_GATE.get(), RuBlocks.BLACKWOOD_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.BLACKWOOD_TRAPDOOR.get(), RuBlocks.BLACKWOOD_PLANKS.get());
        pressurePlate(consumer, RuBlocks.BLACKWOOD_PRESSURE_PLATE.get(), RuBlocks.BLACKWOOD_PLANKS.get());
        woodenButton(consumer, RuBlocks.BLACKWOOD_BUTTON.get(), RuBlocks.BLACKWOOD_PLANKS.get());
        woodenSign(consumer, RuBlocks.BLACKWOOD_SIGN.get(), RuBlocks.BLACKWOOD_PLANKS.get());
        hangingSign(consumer, RuBlocks.BLACKWOOD_HANGING_SIGN.get(), RuBlocks.STRIPPED_BLACKWOOD_LOG.get());
        woodenBoat(consumer, RuItems.BLACKWOOD_BOAT.get(), RuBlocks.BLACKWOOD_PLANKS.get());
        chestBoat(consumer, RuItems.BLACKWOOD_CHEST_BOAT.get(), RuItems.BLACKWOOD_BOAT.get());
        //COBALT_BLOCKS
        woodFromLogs(consumer, RuBlocks.COBALT_WOOD.get(), RuBlocks.COBALT_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_COBALT_WOOD.get(), RuBlocks.STRIPPED_COBALT_LOG.get());
        planksFromLogs(consumer, RuBlocks.COBALT_PLANKS.get(), RuTags.COBALT_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.COBALT_STAIRS.get(), RuBlocks.COBALT_PLANKS.get());
        woodenSlab(consumer, RuBlocks.COBALT_SLAB.get(), RuBlocks.COBALT_PLANKS.get());
        woodenFence(consumer, RuBlocks.COBALT_FENCE.get(), RuBlocks.COBALT_PLANKS.get());
        woodenDoor(consumer, RuBlocks.COBALT_DOOR.get(), RuBlocks.COBALT_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.COBALT_FENCE_GATE.get(), RuBlocks.COBALT_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.COBALT_TRAPDOOR.get(), RuBlocks.COBALT_PLANKS.get());
        pressurePlate(consumer, RuBlocks.COBALT_PRESSURE_PLATE.get(), RuBlocks.COBALT_PLANKS.get());
        woodenButton(consumer, RuBlocks.COBALT_BUTTON.get(), RuBlocks.COBALT_PLANKS.get());
        woodenSign(consumer, RuBlocks.COBALT_SIGN.get(), RuBlocks.COBALT_PLANKS.get());
        hangingSign(consumer, RuBlocks.COBALT_HANGING_SIGN.get(), RuBlocks.STRIPPED_COBALT_LOG.get());
        //CYPRESS_BLOCKS
        woodFromLogs(consumer, RuBlocks.CYPRESS_WOOD.get(), RuBlocks.CYPRESS_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_CYPRESS_WOOD.get(), RuBlocks.STRIPPED_CYPRESS_LOG.get());
        planksFromLogs(consumer, RuBlocks.CYPRESS_PLANKS.get(), RuTags.CYPRESS_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.CYPRESS_STAIRS.get(), RuBlocks.CYPRESS_PLANKS.get());
        woodenSlab(consumer, RuBlocks.CYPRESS_SLAB.get(), RuBlocks.CYPRESS_PLANKS.get());
        woodenFence(consumer, RuBlocks.CYPRESS_FENCE.get(), RuBlocks.CYPRESS_PLANKS.get());
        woodenDoor(consumer, RuBlocks.CYPRESS_DOOR.get(), RuBlocks.CYPRESS_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.CYPRESS_FENCE_GATE.get(), RuBlocks.CYPRESS_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.CYPRESS_TRAPDOOR.get(), RuBlocks.CYPRESS_PLANKS.get());
        pressurePlate(consumer, RuBlocks.CYPRESS_PRESSURE_PLATE.get(), RuBlocks.CYPRESS_PLANKS.get());
        woodenButton(consumer, RuBlocks.CYPRESS_BUTTON.get(), RuBlocks.CYPRESS_PLANKS.get());
        woodenSign(consumer, RuBlocks.CYPRESS_SIGN.get(), RuBlocks.CYPRESS_PLANKS.get());
        hangingSign(consumer, RuBlocks.CYPRESS_HANGING_SIGN.get(), RuBlocks.STRIPPED_CYPRESS_LOG.get());
        woodenBoat(consumer, RuItems.CYPRESS_BOAT.get(), RuBlocks.CYPRESS_PLANKS.get());
        chestBoat(consumer, RuItems.CYPRESS_CHEST_BOAT.get(), RuItems.CYPRESS_BOAT.get());
        //DEAD_BLOCKS
        woodFromLogs(consumer, RuBlocks.DEAD_WOOD.get(), RuBlocks.DEAD_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_DEAD_WOOD.get(), RuBlocks.STRIPPED_DEAD_LOG.get());
        planksFromLogs(consumer, RuBlocks.DEAD_PLANKS.get(), RuTags.DEAD_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.DEAD_STAIRS.get(), RuBlocks.DEAD_PLANKS.get());
        woodenSlab(consumer, RuBlocks.DEAD_SLAB.get(), RuBlocks.DEAD_PLANKS.get());
        woodenFence(consumer, RuBlocks.DEAD_FENCE.get(), RuBlocks.DEAD_PLANKS.get());
        woodenDoor(consumer, RuBlocks.DEAD_DOOR.get(), RuBlocks.DEAD_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.DEAD_FENCE_GATE.get(), RuBlocks.DEAD_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.DEAD_TRAPDOOR.get(), RuBlocks.DEAD_PLANKS.get());
        pressurePlate(consumer, RuBlocks.DEAD_PRESSURE_PLATE.get(), RuBlocks.DEAD_PLANKS.get());
        woodenButton(consumer, RuBlocks.DEAD_BUTTON.get(), RuBlocks.DEAD_PLANKS.get());
        woodenSign(consumer, RuBlocks.DEAD_SIGN.get(), RuBlocks.DEAD_PLANKS.get());
        hangingSign(consumer, RuBlocks.DEAD_HANGING_SIGN.get(), RuBlocks.STRIPPED_DEAD_LOG.get());
        woodenBoat(consumer, RuItems.DEAD_BOAT.get(), RuBlocks.DEAD_PLANKS.get());
        chestBoat(consumer, RuItems.DEAD_CHEST_BOAT.get(), RuItems.DEAD_BOAT.get());
        //EUCALYPTUS_BLOCKS
        woodFromLogs(consumer, RuBlocks.EUCALYPTUS_WOOD.get(), RuBlocks.EUCALYPTUS_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_EUCALYPTUS_WOOD.get(), RuBlocks.STRIPPED_EUCALYPTUS_LOG.get());
        planksFromLogs(consumer, RuBlocks.EUCALYPTUS_PLANKS.get(), RuTags.EUCALYPTUS_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.EUCALYPTUS_STAIRS.get(), RuBlocks.EUCALYPTUS_PLANKS.get());
        woodenSlab(consumer, RuBlocks.EUCALYPTUS_SLAB.get(), RuBlocks.EUCALYPTUS_PLANKS.get());
        woodenFence(consumer, RuBlocks.EUCALYPTUS_FENCE.get(), RuBlocks.EUCALYPTUS_PLANKS.get());
        woodenDoor(consumer, RuBlocks.EUCALYPTUS_DOOR.get(), RuBlocks.EUCALYPTUS_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.EUCALYPTUS_FENCE_GATE.get(), RuBlocks.EUCALYPTUS_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.EUCALYPTUS_TRAPDOOR.get(), RuBlocks.EUCALYPTUS_PLANKS.get());
        pressurePlate(consumer, RuBlocks.EUCALYPTUS_PRESSURE_PLATE.get(), RuBlocks.EUCALYPTUS_PLANKS.get());
        woodenButton(consumer, RuBlocks.EUCALYPTUS_BUTTON.get(), RuBlocks.EUCALYPTUS_PLANKS.get());
        woodenSign(consumer, RuBlocks.EUCALYPTUS_SIGN.get(), RuBlocks.EUCALYPTUS_PLANKS.get());
        hangingSign(consumer, RuBlocks.EUCALYPTUS_HANGING_SIGN.get(), RuBlocks.STRIPPED_EUCALYPTUS_LOG.get());
        woodenBoat(consumer, RuItems.EUCALYPTUS_BOAT.get(), RuBlocks.EUCALYPTUS_PLANKS.get());
        chestBoat(consumer, RuItems.EUCALYPTUS_CHEST_BOAT.get(), RuItems.EUCALYPTUS_BOAT.get());
        //GREEN_BIOSHROOM_BLOCKS
        woodFromLogs(consumer, RuBlocks.GREEN_BIOSHROOM_HYPHAE.get(), RuBlocks.GREEN_BIOSHROOM_STEM.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_GREEN_BIOSHROOM_HYPHAE.get(), RuBlocks.STRIPPED_GREEN_BIOSHROOM_STEM.get());
        planksFromLogs(consumer, RuBlocks.GREEN_BIOSHROOM_PLANKS.get(), RuTags.GREEN_BIOSHROOM_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.GREEN_BIOSHROOM_STAIRS.get(), RuBlocks.GREEN_BIOSHROOM_PLANKS.get());
        woodenSlab(consumer, RuBlocks.GREEN_BIOSHROOM_SLAB.get(), RuBlocks.GREEN_BIOSHROOM_PLANKS.get());
        woodenFence(consumer, RuBlocks.GREEN_BIOSHROOM_FENCE.get(), RuBlocks.GREEN_BIOSHROOM_PLANKS.get());
        woodenDoor(consumer, RuBlocks.GREEN_BIOSHROOM_DOOR.get(), RuBlocks.GREEN_BIOSHROOM_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.GREEN_BIOSHROOM_FENCE_GATE.get(), RuBlocks.GREEN_BIOSHROOM_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.GREEN_BIOSHROOM_TRAPDOOR.get(), RuBlocks.GREEN_BIOSHROOM_PLANKS.get());
        pressurePlate(consumer, RuBlocks.GREEN_BIOSHROOM_PRESSURE_PLATE.get(), RuBlocks.GREEN_BIOSHROOM_PLANKS.get());
        woodenButton(consumer, RuBlocks.GREEN_BIOSHROOM_BUTTON.get(), RuBlocks.GREEN_BIOSHROOM_PLANKS.get());
        woodenSign(consumer, RuBlocks.GREEN_BIOSHROOM_SIGN.get(), RuBlocks.GREEN_BIOSHROOM_PLANKS.get());
        hangingSign(consumer, RuBlocks.GREEN_BIOSHROOM_HANGING_SIGN.get(), RuBlocks.STRIPPED_GREEN_BIOSHROOM_STEM.get());
        //JOSHUA_BLOCKS
        woodFromLogs(consumer, RuBlocks.JOSHUA_WOOD.get(), RuBlocks.JOSHUA_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_JOSHUA_WOOD.get(), RuBlocks.STRIPPED_JOSHUA_LOG.get());
        planksFromLogs(consumer, RuBlocks.JOSHUA_PLANKS.get(), RuTags.JOSHUA_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.JOSHUA_STAIRS.get(), RuBlocks.JOSHUA_PLANKS.get());
        woodenSlab(consumer, RuBlocks.JOSHUA_SLAB.get(), RuBlocks.JOSHUA_PLANKS.get());
        woodenFence(consumer, RuBlocks.JOSHUA_FENCE.get(), RuBlocks.JOSHUA_PLANKS.get());
        woodenDoor(consumer, RuBlocks.JOSHUA_DOOR.get(), RuBlocks.JOSHUA_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.JOSHUA_FENCE_GATE.get(), RuBlocks.JOSHUA_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.JOSHUA_TRAPDOOR.get(), RuBlocks.JOSHUA_PLANKS.get());
        pressurePlate(consumer, RuBlocks.JOSHUA_PRESSURE_PLATE.get(), RuBlocks.JOSHUA_PLANKS.get());
        woodenButton(consumer, RuBlocks.JOSHUA_BUTTON.get(), RuBlocks.JOSHUA_PLANKS.get());
        woodenSign(consumer, RuBlocks.JOSHUA_SIGN.get(), RuBlocks.JOSHUA_PLANKS.get());
        hangingSign(consumer, RuBlocks.JOSHUA_HANGING_SIGN.get(), RuBlocks.STRIPPED_JOSHUA_LOG.get());
        woodenBoat(consumer, RuItems.JOSHUA_BOAT.get(), RuBlocks.JOSHUA_PLANKS.get());
        chestBoat(consumer, RuItems.JOSHUA_CHEST_BOAT.get(), RuItems.JOSHUA_BOAT.get());
        //KAPOK_BLOCKS
        woodFromLogs(consumer, RuBlocks.KAPOK_WOOD.get(), RuBlocks.KAPOK_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_KAPOK_WOOD.get(), RuBlocks.STRIPPED_KAPOK_LOG.get());
        planksFromLogs(consumer, RuBlocks.KAPOK_PLANKS.get(), RuTags.KAPOK_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.KAPOK_STAIRS.get(), RuBlocks.KAPOK_PLANKS.get());
        woodenSlab(consumer, RuBlocks.KAPOK_SLAB.get(), RuBlocks.KAPOK_PLANKS.get());
        woodenFence(consumer, RuBlocks.KAPOK_FENCE.get(), RuBlocks.KAPOK_PLANKS.get());
        woodenDoor(consumer, RuBlocks.KAPOK_DOOR.get(), RuBlocks.KAPOK_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.KAPOK_FENCE_GATE.get(), RuBlocks.KAPOK_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.KAPOK_TRAPDOOR.get(), RuBlocks.KAPOK_PLANKS.get());
        pressurePlate(consumer, RuBlocks.KAPOK_PRESSURE_PLATE.get(), RuBlocks.KAPOK_PLANKS.get());
        woodenButton(consumer, RuBlocks.KAPOK_BUTTON.get(), RuBlocks.KAPOK_PLANKS.get());
        woodenSign(consumer, RuBlocks.KAPOK_SIGN.get(), RuBlocks.KAPOK_PLANKS.get());
        hangingSign(consumer, RuBlocks.KAPOK_HANGING_SIGN.get(), RuBlocks.STRIPPED_KAPOK_LOG.get());
        woodenBoat(consumer, RuItems.KAPOK_BOAT.get(), RuBlocks.KAPOK_PLANKS.get());
        chestBoat(consumer, RuItems.KAPOK_CHEST_BOAT.get(), RuItems.KAPOK_BOAT.get());
        //LARCH_BLOCKS
        woodFromLogs(consumer, RuBlocks.LARCH_WOOD.get(), RuBlocks.LARCH_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_LARCH_WOOD.get(), RuBlocks.STRIPPED_LARCH_LOG.get());
        planksFromLogs(consumer, RuBlocks.LARCH_PLANKS.get(), RuTags.LARCH_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.LARCH_STAIRS.get(), RuBlocks.LARCH_PLANKS.get());
        woodenSlab(consumer, RuBlocks.LARCH_SLAB.get(), RuBlocks.LARCH_PLANKS.get());
        woodenFence(consumer, RuBlocks.LARCH_FENCE.get(), RuBlocks.LARCH_PLANKS.get());
        woodenDoor(consumer, RuBlocks.LARCH_DOOR.get(), RuBlocks.LARCH_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.LARCH_FENCE_GATE.get(), RuBlocks.LARCH_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.LARCH_TRAPDOOR.get(), RuBlocks.LARCH_PLANKS.get());
        pressurePlate(consumer, RuBlocks.LARCH_PRESSURE_PLATE.get(), RuBlocks.LARCH_PLANKS.get());
        woodenButton(consumer, RuBlocks.LARCH_BUTTON.get(), RuBlocks.LARCH_PLANKS.get());
        woodenSign(consumer, RuBlocks.LARCH_SIGN.get(), RuBlocks.LARCH_PLANKS.get());
        hangingSign(consumer, RuBlocks.LARCH_HANGING_SIGN.get(), RuBlocks.STRIPPED_LARCH_LOG.get());
        woodenBoat(consumer, RuItems.LARCH_BOAT.get(), RuBlocks.LARCH_PLANKS.get());
        chestBoat(consumer, RuItems.LARCH_CHEST_BOAT.get(), RuItems.LARCH_BOAT.get());
        //MAGNOLIA_BLOCKS
        woodFromLogs(consumer, RuBlocks.MAGNOLIA_WOOD.get(), RuBlocks.MAGNOLIA_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_MAGNOLIA_WOOD.get(), RuBlocks.STRIPPED_MAGNOLIA_LOG.get());
        planksFromLogs(consumer, RuBlocks.MAGNOLIA_PLANKS.get(), RuTags.MAGNOLIA_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.MAGNOLIA_STAIRS.get(), RuBlocks.MAGNOLIA_PLANKS.get());
        woodenSlab(consumer, RuBlocks.MAGNOLIA_SLAB.get(), RuBlocks.MAGNOLIA_PLANKS.get());
        woodenFence(consumer, RuBlocks.MAGNOLIA_FENCE.get(), RuBlocks.MAGNOLIA_PLANKS.get());
        woodenDoor(consumer, RuBlocks.MAGNOLIA_DOOR.get(), RuBlocks.MAGNOLIA_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.MAGNOLIA_FENCE_GATE.get(), RuBlocks.MAGNOLIA_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.MAGNOLIA_TRAPDOOR.get(), RuBlocks.MAGNOLIA_PLANKS.get());
        pressurePlate(consumer, RuBlocks.MAGNOLIA_PRESSURE_PLATE.get(), RuBlocks.MAGNOLIA_PLANKS.get());
        woodenButton(consumer, RuBlocks.MAGNOLIA_BUTTON.get(), RuBlocks.MAGNOLIA_PLANKS.get());
        woodenSign(consumer, RuBlocks.MAGNOLIA_SIGN.get(), RuBlocks.MAGNOLIA_PLANKS.get());
        hangingSign(consumer, RuBlocks.MAGNOLIA_HANGING_SIGN.get(), RuBlocks.STRIPPED_MAGNOLIA_LOG.get());
        woodenBoat(consumer, RuItems.MAGNOLIA_BOAT.get(), RuBlocks.MAGNOLIA_PLANKS.get());
        chestBoat(consumer, RuItems.MAGNOLIA_CHEST_BOAT.get(), RuItems.MAGNOLIA_BOAT.get());
        //MAPLE_BLOCKS
        woodFromLogs(consumer, RuBlocks.MAPLE_WOOD.get(), RuBlocks.MAPLE_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_MAPLE_WOOD.get(), RuBlocks.STRIPPED_MAPLE_LOG.get());
        planksFromLogs(consumer, RuBlocks.MAPLE_PLANKS.get(), RuTags.MAPLE_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.MAPLE_STAIRS.get(), RuBlocks.MAPLE_PLANKS.get());
        woodenSlab(consumer, RuBlocks.MAPLE_SLAB.get(), RuBlocks.MAPLE_PLANKS.get());
        woodenFence(consumer, RuBlocks.MAPLE_FENCE.get(), RuBlocks.MAPLE_PLANKS.get());
        woodenDoor(consumer, RuBlocks.MAPLE_DOOR.get(), RuBlocks.MAPLE_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.MAPLE_FENCE_GATE.get(), RuBlocks.MAPLE_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.MAPLE_TRAPDOOR.get(), RuBlocks.MAPLE_PLANKS.get());
        pressurePlate(consumer, RuBlocks.MAPLE_PRESSURE_PLATE.get(), RuBlocks.MAPLE_PLANKS.get());
        woodenButton(consumer, RuBlocks.MAPLE_BUTTON.get(), RuBlocks.MAPLE_PLANKS.get());
        woodenSign(consumer, RuBlocks.MAPLE_SIGN.get(), RuBlocks.MAPLE_PLANKS.get());
        hangingSign(consumer, RuBlocks.MAPLE_HANGING_SIGN.get(), RuBlocks.STRIPPED_MAPLE_LOG.get());
        woodenBoat(consumer, RuItems.MAPLE_BOAT.get(), RuBlocks.MAPLE_PLANKS.get());
        chestBoat(consumer, RuItems.MAPLE_CHEST_BOAT.get(), RuItems.MAPLE_BOAT.get());
        //MAUVE_BLOCKS
        woodFromLogs(consumer, RuBlocks.MAUVE_WOOD.get(), RuBlocks.MAUVE_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_MAUVE_WOOD.get(), RuBlocks.STRIPPED_MAUVE_LOG.get());
        planksFromLogs(consumer, RuBlocks.MAUVE_PLANKS.get(), RuTags.MAUVE_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.MAUVE_STAIRS.get(), RuBlocks.MAUVE_PLANKS.get());
        woodenSlab(consumer, RuBlocks.MAUVE_SLAB.get(), RuBlocks.MAUVE_PLANKS.get());
        woodenFence(consumer, RuBlocks.MAUVE_FENCE.get(), RuBlocks.MAUVE_PLANKS.get());
        woodenDoor(consumer, RuBlocks.MAUVE_DOOR.get(), RuBlocks.MAUVE_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.MAUVE_FENCE_GATE.get(), RuBlocks.MAUVE_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.MAUVE_TRAPDOOR.get(), RuBlocks.MAUVE_PLANKS.get());
        pressurePlate(consumer, RuBlocks.MAUVE_PRESSURE_PLATE.get(), RuBlocks.MAUVE_PLANKS.get());
        woodenButton(consumer, RuBlocks.MAUVE_BUTTON.get(), RuBlocks.MAUVE_PLANKS.get());
        woodenSign(consumer, RuBlocks.MAUVE_SIGN.get(), RuBlocks.MAUVE_PLANKS.get());
        hangingSign(consumer, RuBlocks.MAUVE_HANGING_SIGN.get(), RuBlocks.STRIPPED_MAUVE_LOG.get());
        woodenBoat(consumer, RuItems.MAUVE_BOAT.get(), RuBlocks.MAUVE_PLANKS.get());
        chestBoat(consumer, RuItems.MAUVE_CHEST_BOAT.get(), RuItems.MAUVE_BOAT.get());
        //PALM_BLOCKS
        woodFromLogs(consumer, RuBlocks.PALM_WOOD.get(), RuBlocks.PALM_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_PALM_WOOD.get(), RuBlocks.STRIPPED_PALM_LOG.get());
        planksFromLogs(consumer, RuBlocks.PALM_PLANKS.get(), RuTags.PALM_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.PALM_STAIRS.get(), RuBlocks.PALM_PLANKS.get());
        woodenSlab(consumer, RuBlocks.PALM_SLAB.get(), RuBlocks.PALM_PLANKS.get());
        woodenFence(consumer, RuBlocks.PALM_FENCE.get(), RuBlocks.PALM_PLANKS.get());
        woodenDoor(consumer, RuBlocks.PALM_DOOR.get(), RuBlocks.PALM_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.PALM_FENCE_GATE.get(), RuBlocks.PALM_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.PALM_TRAPDOOR.get(), RuBlocks.PALM_PLANKS.get());
        pressurePlate(consumer, RuBlocks.PALM_PRESSURE_PLATE.get(), RuBlocks.PALM_PLANKS.get());
        woodenButton(consumer, RuBlocks.PALM_BUTTON.get(), RuBlocks.PALM_PLANKS.get());
        woodenSign(consumer, RuBlocks.PALM_SIGN.get(), RuBlocks.PALM_PLANKS.get());
        hangingSign(consumer, RuBlocks.PALM_HANGING_SIGN.get(), RuBlocks.STRIPPED_PALM_LOG.get());
        woodenBoat(consumer, RuItems.PALM_BOAT.get(), RuBlocks.PALM_PLANKS.get());
        chestBoat(consumer, RuItems.PALM_CHEST_BOAT.get(), RuItems.PALM_BOAT.get());
        //PINE_BLOCKS
        woodFromLogs(consumer, RuBlocks.PINE_WOOD.get(), RuBlocks.PINE_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_PINE_WOOD.get(), RuBlocks.STRIPPED_PINE_LOG.get());
        planksFromLogs(consumer, RuBlocks.PINE_PLANKS.get(), RuTags.PINE_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.PINE_STAIRS.get(), RuBlocks.PINE_PLANKS.get());
        woodenSlab(consumer, RuBlocks.PINE_SLAB.get(), RuBlocks.PINE_PLANKS.get());
        woodenFence(consumer, RuBlocks.PINE_FENCE.get(), RuBlocks.PINE_PLANKS.get());
        woodenDoor(consumer, RuBlocks.PINE_DOOR.get(), RuBlocks.PINE_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.PINE_FENCE_GATE.get(), RuBlocks.PINE_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.PINE_TRAPDOOR.get(), RuBlocks.PINE_PLANKS.get());
        pressurePlate(consumer, RuBlocks.PINE_PRESSURE_PLATE.get(), RuBlocks.PINE_PLANKS.get());
        woodenButton(consumer, RuBlocks.PINE_BUTTON.get(), RuBlocks.PINE_PLANKS.get());
        woodenSign(consumer, RuBlocks.PINE_SIGN.get(), RuBlocks.PINE_PLANKS.get());
        hangingSign(consumer, RuBlocks.PINE_HANGING_SIGN.get(), RuBlocks.STRIPPED_PINE_LOG.get());
        woodenBoat(consumer, RuItems.PINE_BOAT.get(), RuBlocks.PINE_PLANKS.get());
        chestBoat(consumer, RuItems.PINE_CHEST_BOAT.get(), RuItems.PINE_BOAT.get());
        //PINK_BIOSHROOM_BLOCKS
        woodFromLogs(consumer, RuBlocks.PINK_BIOSHROOM_HYPHAE.get(), RuBlocks.PINK_BIOSHROOM_STEM.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_PINK_BIOSHROOM_HYPHAE.get(), RuBlocks.STRIPPED_PINK_BIOSHROOM_STEM.get());
        planksFromLogs(consumer, RuBlocks.PINK_BIOSHROOM_PLANKS.get(), RuTags.PINK_BIOSHROOM_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.PINK_BIOSHROOM_STAIRS.get(), RuBlocks.PINK_BIOSHROOM_PLANKS.get());
        woodenSlab(consumer, RuBlocks.PINK_BIOSHROOM_SLAB.get(), RuBlocks.PINK_BIOSHROOM_PLANKS.get());
        woodenFence(consumer, RuBlocks.PINK_BIOSHROOM_FENCE.get(), RuBlocks.PINK_BIOSHROOM_PLANKS.get());
        woodenDoor(consumer, RuBlocks.PINK_BIOSHROOM_DOOR.get(), RuBlocks.PINK_BIOSHROOM_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.PINK_BIOSHROOM_FENCE_GATE.get(), RuBlocks.PINK_BIOSHROOM_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.PINK_BIOSHROOM_TRAPDOOR.get(), RuBlocks.PINK_BIOSHROOM_PLANKS.get());
        pressurePlate(consumer, RuBlocks.PINK_BIOSHROOM_PRESSURE_PLATE.get(), RuBlocks.PINK_BIOSHROOM_PLANKS.get());
        woodenButton(consumer, RuBlocks.PINK_BIOSHROOM_BUTTON.get(), RuBlocks.PINK_BIOSHROOM_PLANKS.get());
        woodenSign(consumer, RuBlocks.PINK_BIOSHROOM_SIGN.get(), RuBlocks.PINK_BIOSHROOM_PLANKS.get());
        hangingSign(consumer, RuBlocks.PINK_BIOSHROOM_HANGING_SIGN.get(), RuBlocks.STRIPPED_PINK_BIOSHROOM_STEM.get());
        //REDWOOD_BLOCKS
        woodFromLogs(consumer, RuBlocks.REDWOOD_WOOD.get(), RuBlocks.REDWOOD_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_REDWOOD_WOOD.get(), RuBlocks.STRIPPED_REDWOOD_LOG.get());
        planksFromLogs(consumer, RuBlocks.REDWOOD_PLANKS.get(), RuTags.REDWOOD_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.REDWOOD_STAIRS.get(), RuBlocks.REDWOOD_PLANKS.get());
        woodenSlab(consumer, RuBlocks.REDWOOD_SLAB.get(), RuBlocks.REDWOOD_PLANKS.get());
        woodenFence(consumer, RuBlocks.REDWOOD_FENCE.get(), RuBlocks.REDWOOD_PLANKS.get());
        woodenDoor(consumer, RuBlocks.REDWOOD_DOOR.get(), RuBlocks.REDWOOD_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.REDWOOD_FENCE_GATE.get(), RuBlocks.REDWOOD_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.REDWOOD_TRAPDOOR.get(), RuBlocks.REDWOOD_PLANKS.get());
        pressurePlate(consumer, RuBlocks.REDWOOD_PRESSURE_PLATE.get(), RuBlocks.REDWOOD_PLANKS.get());
        woodenButton(consumer, RuBlocks.REDWOOD_BUTTON.get(), RuBlocks.REDWOOD_PLANKS.get());
        woodenSign(consumer, RuBlocks.REDWOOD_SIGN.get(), RuBlocks.REDWOOD_PLANKS.get());
        hangingSign(consumer, RuBlocks.REDWOOD_HANGING_SIGN.get(), RuBlocks.STRIPPED_REDWOOD_LOG.get());
        woodenBoat(consumer, RuItems.REDWOOD_BOAT.get(), RuBlocks.REDWOOD_PLANKS.get());
        chestBoat(consumer, RuItems.REDWOOD_CHEST_BOAT.get(), RuItems.REDWOOD_BOAT.get());
        //SOCOTRA_BLOCKS
        woodFromLogs(consumer, RuBlocks.SOCOTRA_WOOD.get(), RuBlocks.SOCOTRA_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_SOCOTRA_WOOD.get(), RuBlocks.STRIPPED_SOCOTRA_LOG.get());
        planksFromLogs(consumer, RuBlocks.SOCOTRA_PLANKS.get(), RuTags.SOCOTRA_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.SOCOTRA_STAIRS.get(), RuBlocks.SOCOTRA_PLANKS.get());
        woodenSlab(consumer, RuBlocks.SOCOTRA_SLAB.get(), RuBlocks.SOCOTRA_PLANKS.get());
        woodenFence(consumer, RuBlocks.SOCOTRA_FENCE.get(), RuBlocks.SOCOTRA_PLANKS.get());
        woodenDoor(consumer, RuBlocks.SOCOTRA_DOOR.get(), RuBlocks.SOCOTRA_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.SOCOTRA_FENCE_GATE.get(), RuBlocks.SOCOTRA_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.SOCOTRA_TRAPDOOR.get(), RuBlocks.SOCOTRA_PLANKS.get());
        pressurePlate(consumer, RuBlocks.SOCOTRA_PRESSURE_PLATE.get(), RuBlocks.SOCOTRA_PLANKS.get());
        woodenButton(consumer, RuBlocks.SOCOTRA_BUTTON.get(), RuBlocks.SOCOTRA_PLANKS.get());
        woodenSign(consumer, RuBlocks.SOCOTRA_SIGN.get(), RuBlocks.SOCOTRA_PLANKS.get());
        hangingSign(consumer, RuBlocks.SOCOTRA_HANGING_SIGN.get(), RuBlocks.STRIPPED_SOCOTRA_LOG.get());
        woodenBoat(consumer, RuItems.SOCOTRA_BOAT.get(), RuBlocks.SOCOTRA_PLANKS.get());
        chestBoat(consumer, RuItems.SOCOTRA_CHEST_BOAT.get(), RuItems.SOCOTRA_BOAT.get());
        //WILLOW_BLOCKS
        woodFromLogs(consumer, RuBlocks.WILLOW_WOOD.get(), RuBlocks.WILLOW_LOG.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_WILLOW_WOOD.get(), RuBlocks.STRIPPED_WILLOW_LOG.get());
        planksFromLogs(consumer, RuBlocks.WILLOW_PLANKS.get(), RuTags.WILLOW_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.WILLOW_STAIRS.get(), RuBlocks.WILLOW_PLANKS.get());
        woodenSlab(consumer, RuBlocks.WILLOW_SLAB.get(), RuBlocks.WILLOW_PLANKS.get());
        woodenFence(consumer, RuBlocks.WILLOW_FENCE.get(), RuBlocks.WILLOW_PLANKS.get());
        woodenDoor(consumer, RuBlocks.WILLOW_DOOR.get(), RuBlocks.WILLOW_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.WILLOW_FENCE_GATE.get(), RuBlocks.WILLOW_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.WILLOW_TRAPDOOR.get(), RuBlocks.WILLOW_PLANKS.get());
        pressurePlate(consumer, RuBlocks.WILLOW_PRESSURE_PLATE.get(), RuBlocks.WILLOW_PLANKS.get());
        woodenButton(consumer, RuBlocks.WILLOW_BUTTON.get(), RuBlocks.WILLOW_PLANKS.get());
        woodenSign(consumer, RuBlocks.WILLOW_SIGN.get(), RuBlocks.WILLOW_PLANKS.get());
        hangingSign(consumer, RuBlocks.WILLOW_HANGING_SIGN.get(), RuBlocks.STRIPPED_WILLOW_LOG.get());
        woodenBoat(consumer, RuItems.WILLOW_BOAT.get(), RuBlocks.WILLOW_PLANKS.get());
        chestBoat(consumer, RuItems.WILLOW_CHEST_BOAT.get(), RuItems.WILLOW_BOAT.get());
        //YELLOW_BIOSHROOM_BLOCKS
        woodFromLogs(consumer, RuBlocks.YELLOW_BIOSHROOM_HYPHAE.get(), RuBlocks.YELLOW_BIOSHROOM_STEM.get());
        woodFromLogs(consumer, RuBlocks.STRIPPED_YELLOW_BIOSHROOM_HYPHAE.get(), RuBlocks.STRIPPED_YELLOW_BIOSHROOM_STEM.get());
        planksFromLogs(consumer, RuBlocks.YELLOW_BIOSHROOM_PLANKS.get(), RuTags.YELLOW_BIOSHROOM_LOGS_ITEM, 4);
        woodenStairs(consumer, RuBlocks.YELLOW_BIOSHROOM_STAIRS.get(), RuBlocks.YELLOW_BIOSHROOM_PLANKS.get());
        woodenSlab(consumer, RuBlocks.YELLOW_BIOSHROOM_SLAB.get(), RuBlocks.YELLOW_BIOSHROOM_PLANKS.get());
        woodenFence(consumer, RuBlocks.YELLOW_BIOSHROOM_FENCE.get(), RuBlocks.YELLOW_BIOSHROOM_PLANKS.get());
        woodenDoor(consumer, RuBlocks.YELLOW_BIOSHROOM_DOOR.get(), RuBlocks.YELLOW_BIOSHROOM_PLANKS.get());
        woodenFenceGate(consumer, RuBlocks.YELLOW_BIOSHROOM_FENCE_GATE.get(), RuBlocks.YELLOW_BIOSHROOM_PLANKS.get());
        woodenTrapdoor(consumer, RuBlocks.YELLOW_BIOSHROOM_TRAPDOOR.get(), RuBlocks.YELLOW_BIOSHROOM_PLANKS.get());
        pressurePlate(consumer, RuBlocks.YELLOW_BIOSHROOM_PRESSURE_PLATE.get(), RuBlocks.YELLOW_BIOSHROOM_PLANKS.get());
        woodenButton(consumer, RuBlocks.YELLOW_BIOSHROOM_BUTTON.get(), RuBlocks.YELLOW_BIOSHROOM_PLANKS.get());
        woodenSign(consumer, RuBlocks.YELLOW_BIOSHROOM_SIGN.get(), RuBlocks.YELLOW_BIOSHROOM_PLANKS.get());
        hangingSign(consumer, RuBlocks.YELLOW_BIOSHROOM_HANGING_SIGN.get(), RuBlocks.STRIPPED_YELLOW_BIOSHROOM_STEM.get());

        /*-----------------PAINTED PLANKS-----------------*/
        paintedPlanks(consumer, RuBlocks.RED_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/red")));
        paintedPlanks(consumer, RuBlocks.ORANGE_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/orange")));
        paintedPlanks(consumer, RuBlocks.YELLOW_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/yellow")));
        paintedPlanks(consumer, RuBlocks.LIME_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/lime")));
        paintedPlanks(consumer, RuBlocks.GREEN_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/green")));
        paintedPlanks(consumer, RuBlocks.CYAN_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/cyan")));
        paintedPlanks(consumer, RuBlocks.LIGHT_BLUE_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/light_blue")));
        paintedPlanks(consumer, RuBlocks.BLUE_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/blue")));
        paintedPlanks(consumer, RuBlocks.PURPLE_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/purple")));
        paintedPlanks(consumer, RuBlocks.MAGENTA_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/magenta")));
        paintedPlanks(consumer, RuBlocks.PINK_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/pink")));
        paintedPlanks(consumer, RuBlocks.BROWN_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/brown")));
        paintedPlanks(consumer, RuBlocks.WHITE_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/white")));
        paintedPlanks(consumer, RuBlocks.LIGHT_GRAY_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/light_gray")));
        paintedPlanks(consumer, RuBlocks.GRAY_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/gray")));
        paintedPlanks(consumer, RuBlocks.BLACK_PAINTED_PLANKS.get(), TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("forge", "dyes/black")));
        //STAIRS
        paintedStairs(consumer, RuBlocks.RED_PAINTED_STAIRS.get(), RuBlocks.RED_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.ORANGE_PAINTED_STAIRS.get(), RuBlocks.ORANGE_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.YELLOW_PAINTED_STAIRS.get(), RuBlocks.YELLOW_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.LIME_PAINTED_STAIRS.get(), RuBlocks.LIME_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.GREEN_PAINTED_STAIRS.get(), RuBlocks.GREEN_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.CYAN_PAINTED_STAIRS.get(), RuBlocks.CYAN_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.LIGHT_BLUE_PAINTED_STAIRS.get(), RuBlocks.LIGHT_BLUE_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.BLUE_PAINTED_STAIRS.get(), RuBlocks.BLUE_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.PURPLE_PAINTED_STAIRS.get(), RuBlocks.PURPLE_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.MAGENTA_PAINTED_STAIRS.get(), RuBlocks.MAGENTA_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.PINK_PAINTED_STAIRS.get(), RuBlocks.PINK_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.BROWN_PAINTED_STAIRS.get(), RuBlocks.BROWN_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.WHITE_PAINTED_STAIRS.get(), RuBlocks.WHITE_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.LIGHT_GRAY_PAINTED_STAIRS.get(), RuBlocks.LIGHT_GRAY_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.GRAY_PAINTED_STAIRS.get(), RuBlocks.GRAY_PAINTED_PLANKS.get());
        paintedStairs(consumer, RuBlocks.BLACK_PAINTED_STAIRS.get(), RuBlocks.BLACK_PAINTED_PLANKS.get());
        //SLABS
        paintedSlab(consumer, RuBlocks.RED_PAINTED_SLAB.get(), RuBlocks.RED_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.ORANGE_PAINTED_SLAB.get(), RuBlocks.ORANGE_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.YELLOW_PAINTED_SLAB.get(), RuBlocks.YELLOW_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.LIME_PAINTED_SLAB.get(), RuBlocks.LIME_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.GREEN_PAINTED_SLAB.get(), RuBlocks.GREEN_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.CYAN_PAINTED_SLAB.get(), RuBlocks.CYAN_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.LIGHT_BLUE_PAINTED_SLAB.get(), RuBlocks.LIGHT_BLUE_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.BLUE_PAINTED_SLAB.get(), RuBlocks.BLUE_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.PURPLE_PAINTED_SLAB.get(), RuBlocks.PURPLE_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.MAGENTA_PAINTED_SLAB.get(), RuBlocks.MAGENTA_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.PINK_PAINTED_SLAB.get(), RuBlocks.PINK_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.BROWN_PAINTED_SLAB.get(), RuBlocks.BROWN_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.WHITE_PAINTED_SLAB.get(), RuBlocks.WHITE_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.LIGHT_GRAY_PAINTED_SLAB.get(), RuBlocks.LIGHT_GRAY_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.GRAY_PAINTED_SLAB.get(), RuBlocks.GRAY_PAINTED_PLANKS.get());
        paintedSlab(consumer, RuBlocks.BLACK_PAINTED_SLAB.get(), RuBlocks.BLACK_PAINTED_PLANKS.get());

        /*-----------------NETHER_BLOCKS-----------------*/

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RuBlocks.BLACKSTONE_CLUSTER.get(), 2).define('#', Blocks.BLACKSTONE).pattern("##").pattern("##").group("blackstone").unlockedBy("has_blackstone", has(Blocks.BLACKSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.BLACKSTONE, 1).define('#', RuBlocks.BLACKSTONE_CLUSTER.get()).pattern("##").group("blackstone").unlockedBy("has_blackstone_cluster", has(RuBlocks.BLACKSTONE_CLUSTER.get())).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(Blocks.BLACKSTONE,RuBlocks.BLACKSTONE_CLUSTER.get())));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, RuBlocks.OVERGROWN_BONE_BLOCK.get(), 1).requires(Blocks.BONE_BLOCK).requires(RuBlocks.GLISTERING_NYLIUM.get()).group("overgrown_bone_block").unlockedBy("has_glistering_nylium", has(RuBlocks.GLISTERING_NYLIUM.get())).unlockedBy("has_bone_block", has(Blocks.BONE_BLOCK)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BONE_MEAL, 9).requires(RuBlocks.OVERGROWN_BONE_BLOCK.get()).group("bone_meal").unlockedBy("has_overgrown_bone_block", has(RuBlocks.OVERGROWN_BONE_BLOCK.get())).save(consumer , ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(Items.BONE_MEAL, RuBlocks.OVERGROWN_BONE_BLOCK.get())));
    }

    private static Criterion<EnterBlockTrigger.TriggerInstance> insideOf(Block p_125980_) {
        return CriteriaTriggers.ENTER_BLOCK.createCriterion(new EnterBlockTrigger.TriggerInstance(Optional.empty(), Optional.of(p_125980_.builtInRegistryHolder()), Optional.empty()));
    }

    protected static void branchFromLog(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, item, 2).define('#', item2).define('X', Items.STICK).pattern("#X").group("branches").unlockedBy("has_log", has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(item,item2)));
    }

    protected static void woodFromOtherItem(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, item, 3).define('#', item2).pattern("##").pattern("##").group("bark").unlockedBy("has_log", has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(item,item2)));
    }
    
    protected static void paintedSlab(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, item, Ingredient.of(item2)).group("painted_slab").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void paintedStairs(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        stairBuilder(item, Ingredient.of(item2)).group("painted_stairs").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void paintedPlanks(RecipeOutput consumer, ItemLike result, TagKey<Item> dye) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 8).define('X', dye).define('#', ItemTags.PLANKS).pattern("###").pattern("#X#").pattern("###").group("painted_planks").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
    }

    protected static void snowbelle(RecipeOutput consumer, ItemLike result, TagKey<Item> dye) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result).requires(dye).requires(RuTags.SNOWBELLE_ITEM).group("snowbelle").unlockedBy("has_snowbelle", has(RuTags.SNOWBELLE_ITEM)).save(consumer);
    }

    protected static void planksFromOneLog(RecipeOutput p_259712_, ItemLike p_259052_, ItemLike p_259045_, int i) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, p_259052_, i).requires(p_259045_).group("planks").unlockedBy("has_log", has(p_259045_)).save(p_259712_);
    }
    protected static void woodenButton(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        buttonBuilder(item, Ingredient.of(item2)).group("wooden_button").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void woodenSign(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        signBuilder(item, Ingredient.of(item2)).group("wooden_sign").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void hangingSign(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, item, 6).group("hanging_sign").define('#', item2).define('X', Items.CHAIN).pattern("X X").pattern("###").pattern("###").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void woodenBoat(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, item).define('#', item2).pattern("# #").pattern("###").group("boat").unlockedBy("in_water", insideOf(Blocks.WATER)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void woodenDoor(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        doorBuilder(item, Ingredient.of(item2)).group("wooden_door").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void woodenFenceGate(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        fenceGateBuilder(item, Ingredient.of(item2)).group("wooden_fence_gate").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void woodenFence(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        fenceBuilder(item, Ingredient.of(item2)).group("wooden_fence").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void woodenSlab(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, item, Ingredient.of(item2)).group("wooden_slab").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void woodenStairs(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        stairBuilder(item, Ingredient.of(item2)).group("wooden_stairs").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void woodenTrapdoor(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, item, 2).define('#', item2).pattern("###").pattern("###").group("wooden_trapdoor").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void pressurePlate(RecipeOutput consumer, ItemLike item, ItemLike item2) {
        pressurePlateBuilder(RecipeCategory.REDSTONE, item, Ingredient.of(item2)).group("wooden_pressure_plate").unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item)));
    }

    protected static void stonecutterResultFromBase(RecipeOutput consumer, RecipeCategory category, ItemLike item, ItemLike item2) {
        stonecutterResultFromBase(consumer, category, item, item2, 1);
    }

    protected static void stonecutterResultFromBase(RecipeOutput consumer, RecipeCategory category, ItemLike item, ItemLike item2, int i) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(item2), category, item, i).unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(item, item2) + "_stonecutting"));
    }

    protected static void oreSmelting(RecipeOutput consumer, List<ItemLike> itemLikes, RecipeCategory category, ItemLike item, float f, int i, String s) {
        oreCooking(consumer, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, itemLikes, category, item, f, i, s, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput consumer, List<ItemLike> itemLikes, RecipeCategory category, ItemLike item, float f, int i, String s) {
        oreCooking(consumer, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, itemLikes, category, item, f, i, s, "_from_blasting");
    }

    private static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput consumer, RecipeSerializer<T> serializer, AbstractCookingRecipe.Factory<T> factory, List<ItemLike> itemLikes, RecipeCategory category, ItemLike item, float f, int i, String s, String t) {
        for(ItemLike itemlike : itemLikes) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), category, item, f, i, serializer, factory).group(s).unlockedBy(getHasName(itemlike), has(itemlike)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getItemName(item) + t + "_" + getItemName(itemlike)));
        }

    }

    protected static void oneToOneConversionRecipe(RecipeOutput consumer, ItemLike item, ItemLike item2, @Nullable String group) {
        oneToOneConversionRecipe(consumer, item, item2, group, 1);
    }

    protected static void oneToOneConversionRecipe(RecipeOutput consumer, ItemLike item, ItemLike item2, @Nullable String group, int ammount) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, item, ammount).requires(item2).group(group).unlockedBy(getHasName(item2), has(item2)).save(consumer, ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getConversionRecipeName(item, item2)));
    }
}
