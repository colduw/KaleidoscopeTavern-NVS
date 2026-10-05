package com.github.ysbbbbbb.kaleidoscopetavern.datagen.recipe;

import com.github.ysbbbbbb.kaleidoscopetavern.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.function.Supplier;

public class ShapedRecipeProvider extends ModRecipeProvider {
    public ShapedRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        // 沙发
        sofa(ModItems.WHITE_SOFA, Items.WOOL.white());
        sofa(ModItems.ORANGE_SOFA, Items.WOOL.orange());
        sofa(ModItems.MAGENTA_SOFA, Items.WOOL.magenta());
        sofa(ModItems.LIGHT_BLUE_SOFA, Items.WOOL.lightBlue());
        sofa(ModItems.YELLOW_SOFA, Items.WOOL.yellow());
        sofa(ModItems.LIME_SOFA, Items.WOOL.lime());
        sofa(ModItems.PINK_SOFA, Items.WOOL.pink());
        sofa(ModItems.GRAY_SOFA, Items.WOOL.gray());
        sofa(ModItems.LIGHT_GRAY_SOFA, Items.WOOL.lightGray());
        sofa(ModItems.CYAN_SOFA, Items.WOOL.cyan());
        sofa(ModItems.PURPLE_SOFA, Items.WOOL.purple());
        sofa(ModItems.BLUE_SOFA, Items.WOOL.blue());
        sofa(ModItems.BROWN_SOFA, Items.WOOL.brown());
        sofa(ModItems.GREEN_SOFA, Items.WOOL.green());
        sofa(ModItems.BLACK_SOFA, Items.WOOL.black());
        sofa(ModItems.RED_SOFA, Items.WOOL.red());

        // 高脚凳
        barStool(ModItems.WHITE_BAR_STOOL, Items.WOOL.white());
        barStool(ModItems.ORANGE_BAR_STOOL, Items.WOOL.orange());
        barStool(ModItems.MAGENTA_BAR_STOOL, Items.WOOL.magenta());
        barStool(ModItems.LIGHT_BLUE_BAR_STOOL, Items.WOOL.lightBlue());
        barStool(ModItems.YELLOW_BAR_STOOL, Items.WOOL.yellow());
        barStool(ModItems.LIME_BAR_STOOL, Items.WOOL.lime());
        barStool(ModItems.PINK_BAR_STOOL, Items.WOOL.pink());
        barStool(ModItems.GRAY_BAR_STOOL, Items.WOOL.gray());
        barStool(ModItems.LIGHT_GRAY_BAR_STOOL, Items.WOOL.lightGray());
        barStool(ModItems.CYAN_BAR_STOOL, Items.WOOL.cyan());
        barStool(ModItems.PURPLE_BAR_STOOL, Items.WOOL.purple());
        barStool(ModItems.BLUE_BAR_STOOL, Items.WOOL.blue());
        barStool(ModItems.BROWN_BAR_STOOL, Items.WOOL.brown());
        barStool(ModItems.GREEN_BAR_STOOL, Items.WOOL.green());
        barStool(ModItems.BLACK_BAR_STOOL, Items.WOOL.black());
        barStool(ModItems.RED_BAR_STOOL, Items.WOOL.red());

        // 黑板
        this.shaped(RecipeCategory.DECORATIONS, ModItems.CHALKBOARD.get())
                .pattern("III")
                .pattern("ISI")
                .pattern("III")
                .define('I', Items.INK_SAC)
                .define('S', ItemTags.SIGNS)
                .unlockedBy("has_ink_sac", has(Items.INK_SAC))
                .save(this.output);

        // 展板
        this.shaped(RecipeCategory.DECORATIONS, ModItems.BASE_SANDWICH_BOARD.get())
                .pattern("I")
                .pattern("S")
                .define('I', Items.INK_SAC)
                .define('S', ItemTags.WOODEN_SLABS)
                .unlockedBy("has_ink_sac", has(Items.INK_SAC))
                .save(this.output);

        // 灯串
        // 无色的
        this.shaped(RecipeCategory.DECORATIONS, ModItems.STRING_LIGHTS_COLORLESS.get(), 8)
                .pattern("CCC")
                .pattern("LLL")
                .define('C', Items.IRON_CHAIN)
                .define('L', Items.LANTERN)
                .unlockedBy("has_chain", has(Items.IRON_CHAIN))
                .save(this.output);

        // 有色灯串
        stringLights(ModItems.STRING_LIGHTS_WHITE, Items.DYE.white());
        stringLights(ModItems.STRING_LIGHTS_ORANGE, Items.DYE.orange());
        stringLights(ModItems.STRING_LIGHTS_MAGENTA, Items.DYE.magenta());
        stringLights(ModItems.STRING_LIGHTS_LIGHT_BLUE, Items.DYE.lightBlue());
        stringLights(ModItems.STRING_LIGHTS_YELLOW, Items.DYE.yellow());
        stringLights(ModItems.STRING_LIGHTS_LIME, Items.DYE.lime());
        stringLights(ModItems.STRING_LIGHTS_PINK, Items.DYE.pink());
        stringLights(ModItems.STRING_LIGHTS_GRAY, Items.DYE.gray());
        stringLights(ModItems.STRING_LIGHTS_LIGHT_GRAY, Items.DYE.lightGray());
        stringLights(ModItems.STRING_LIGHTS_CYAN, Items.DYE.cyan());
        stringLights(ModItems.STRING_LIGHTS_PURPLE, Items.DYE.purple());
        stringLights(ModItems.STRING_LIGHTS_BLUE, Items.DYE.blue());
        stringLights(ModItems.STRING_LIGHTS_BROWN, Items.DYE.brown());
        stringLights(ModItems.STRING_LIGHTS_GREEN, Items.DYE.green());
        stringLights(ModItems.STRING_LIGHTS_BLACK, Items.DYE.black());
        stringLights(ModItems.STRING_LIGHTS_RED, Items.DYE.red());

        // 蒙德里安挂画是有序合成
        this.shaped(RecipeCategory.DECORATIONS, ModItems.MONDRIAN_PAINTING.get())
                .pattern(" B ")
                .pattern("WFY")
                .pattern(" R ")
                .define('F', Items.ITEM_FRAME)
                .define('B', Tags.Items.DYES_BLUE)
                .define('W', Tags.Items.DYES_WHITE)
                .define('Y', Tags.Items.DYES_YELLOW)
                .define('R', Tags.Items.DYES_RED)
                .unlockedBy("has_item_frame", has(Items.ITEM_FRAME))
                .save(this.output);

        // 吧台
        this.shaped(RecipeCategory.DECORATIONS, ModItems.BAR_COUNTER.get())
                .pattern("NNN")
                .pattern("WWW")
                .pattern("WWW")
                .define('N', Tags.Items.NUGGETS_GOLD)
                .define('W', ItemTags.PLANKS)
                .unlockedBy("has_nugget", has(Tags.Items.NUGGETS_GOLD))
                .save(this.output);

        // 人字梯
        this.shaped(RecipeCategory.DECORATIONS, ModItems.STEPLADDER.get())
                .pattern("L  ")
                .pattern("LL ")
                .pattern("LLL")
                .define('L', Items.LADDER)
                .unlockedBy("has_ladder", has(Items.LADDER))
                .save(this.output);

        // 藤架
        this.shaped(RecipeCategory.DECORATIONS, ModItems.TRELLIS.get(), 8)
                .pattern("G")
                .pattern("G")
                .pattern("G")
                .define('G', ModItems.GRAPEVINE.get())
                .unlockedBy("has_grapevine", has(ModItems.GRAPEVINE.get()))
                .save(this.output);

        // 龙头
        this.shaped(RecipeCategory.DECORATIONS, ModItems.TAP.get())
                .pattern("L")
                .pattern("H")
                .define('L', Items.LEVER)
                .define('H', Items.HOPPER)
                .unlockedBy("has_lever", has(Items.LEVER))
                .save(this.output);

        // 酒桶
        this.shaped(RecipeCategory.DECORATIONS, ModItems.BARREL.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.BARREL)
                .unlockedBy("has_barrel", has(Items.BARREL))
                .save(this.output);

        // 酒柜
        this.shaped(RecipeCategory.DECORATIONS, ModItems.BAR_CABINET.get())
                .pattern("GGG")
                .pattern("G G")
                .pattern("GGG")
                .define('G', ModItems.GRAPEVINE.get())
                .unlockedBy("has_grapevine", has(ModItems.GRAPEVINE.get()))
                .save(this.output);

        // 玻璃酒柜
        this.shaped(RecipeCategory.DECORATIONS, ModItems.GLASS_BAR_CABINET.get())
                .pattern("GGG")
                .pattern("GPG")
                .pattern("GGG")
                .define('G', ModItems.GRAPEVINE.get())
                .define('P', Tags.Items.GLASS_PANES)
                .unlockedBy("has_grapevine", has(ModItems.GRAPEVINE.get()))
                .save(this.output);

        // 桌子
        this.shaped(RecipeCategory.DECORATIONS, ModItems.TABLE.get())
                .pattern("WWW")
                .pattern(" F ")
                .pattern(" I ")
                .define('W', ItemTags.PLANKS)
                .define('F', ItemTags.WOODEN_FENCES)
                .define('I', Tags.Items.INGOTS_IRON)
                .unlockedBy("has_fence", has(ItemTags.WOODEN_FENCES))
                .save(this.output);
    }

    private void sofa(Supplier<? extends Item> item, Item wool) {
        this.shaped(RecipeCategory.DECORATIONS, item.get())
                .pattern("W W")
                .pattern("WWW")
                .pattern("L L")
                .define('W', wool)
                .define('L', Tags.Items.INGOTS_IRON)
                .unlockedBy("has_wool", has(wool))
                .save(this.output);
    }

    private void barStool(Supplier<? extends Item> item, Item wool) {
        this.shaped(RecipeCategory.DECORATIONS, item.get())
                .pattern("W")
                .pattern("C")
                .pattern("L")
                .define('W', wool)
                .define('C', Items.IRON_CHAIN)
                .define('L', Tags.Items.INGOTS_IRON)
                .unlockedBy("has_wool", has(wool))
                .save(this.output);
    }

    private void stringLights(Supplier<? extends Item> item, Item dye) {
        this.shaped(RecipeCategory.DECORATIONS, item.get(), 8)
                .pattern("CCC")
                .pattern("LLL")
                .pattern("DDD")
                .define('C', Items.IRON_CHAIN)
                .define('L', Items.LANTERN)
                .define('D', dye)
                .unlockedBy("has_dye", has(dye))
                .save(this.output);
    }
}

