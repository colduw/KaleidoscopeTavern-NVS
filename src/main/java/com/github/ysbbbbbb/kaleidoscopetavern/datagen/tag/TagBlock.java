package com.github.ysbbbbbb.kaleidoscopetavern.datagen.tag;

import com.github.ysbbbbbb.kaleidoscopetavern.KaleidoscopeTavern;
import com.github.ysbbbbbb.kaleidoscopetavern.init.ModBlocks;
import com.github.ysbbbbbb.kaleidoscopetavern.init.tag.TagCommon;
import com.github.ysbbbbbb.kaleidoscopetavern.init.tag.TagMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class TagBlock extends BlockTagsProvider {
    public TagBlock(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, KaleidoscopeTavern.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(TagMod.SOFA)
        .add(ModBlocks.WHITE_SOFA.unwrapKey().get())
        .add(ModBlocks.LIGHT_GRAY_SOFA.unwrapKey().get())
        .add(ModBlocks.GRAY_SOFA.unwrapKey().get())
        .add(ModBlocks.BLACK_SOFA.unwrapKey().get())
        .add(ModBlocks.BROWN_SOFA.unwrapKey().get())
        .add(ModBlocks.RED_SOFA.unwrapKey().get())
        .add(ModBlocks.ORANGE_SOFA.unwrapKey().get())
        .add(ModBlocks.YELLOW_SOFA.unwrapKey().get())
        .add(ModBlocks.LIME_SOFA.unwrapKey().get())
        .add(ModBlocks.GREEN_SOFA.unwrapKey().get())
        .add(ModBlocks.CYAN_SOFA.unwrapKey().get())
        .add(ModBlocks.LIGHT_BLUE_SOFA.unwrapKey().get())
        .add(ModBlocks.BLUE_SOFA.unwrapKey().get())
        .add(ModBlocks.PURPLE_SOFA.unwrapKey().get())
        .add(ModBlocks.MAGENTA_SOFA.unwrapKey().get())
        .add(ModBlocks.PINK_SOFA.unwrapKey().get());

        this.tag(TagMod.BAR_STOOL)
        .add(ModBlocks.WHITE_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.LIGHT_GRAY_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.GRAY_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.BLACK_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.BROWN_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.RED_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.ORANGE_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.YELLOW_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.LIME_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.GREEN_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.CYAN_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.LIGHT_BLUE_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.BLUE_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.PURPLE_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.MAGENTA_BAR_STOOL.unwrapKey().get())
        .add(ModBlocks.PINK_BAR_STOOL.unwrapKey().get());

        this.tag(TagMod.SANDWICH_BOARD)
        .add(ModBlocks.BASE_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.GRASS_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.ALLIUM_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.AZURE_BLUET_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.CORNFLOWER_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.ORCHID_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.PEONY_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.PINK_PETALS_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.PITCHER_PLANT_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.POPPY_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.SUNFLOWER_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.TORCHFLOWER_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.TULIP_SANDWICH_BOARD.unwrapKey().get())
        .add(ModBlocks.WITHER_ROSE_SANDWICH_BOARD.unwrapKey().get());

        this.tag(TagMod.STRING_LIGHTS)
        .add(ModBlocks.STRING_LIGHTS_COLORLESS.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_WHITE.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_LIGHT_GRAY.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_GRAY.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_BLACK.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_BROWN.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_RED.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_ORANGE.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_YELLOW.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_LIME.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_GREEN.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_CYAN.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_LIGHT_BLUE.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_BLUE.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_PURPLE.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_MAGENTA.unwrapKey().get())
        .add(ModBlocks.STRING_LIGHTS_PINK.unwrapKey().get());


        this.tag(TagMod.PAINTING)
        .add(ModBlocks.YSBB_PAINTING.unwrapKey().get())
        .add(ModBlocks.TARTARIC_ACID_PAINTING.unwrapKey().get())
        .add(ModBlocks.CR019_PAINTING.unwrapKey().get())
        .add(ModBlocks.UNKNOWN_PAINTING.unwrapKey().get())
        .add(ModBlocks.MASTER_MARISA_PAINTING.unwrapKey().get())
        .add(ModBlocks.SON_OF_MAN_PAINTING.unwrapKey().get())
        .add(ModBlocks.DAVID_PAINTING.unwrapKey().get())
        .add(ModBlocks.GIRL_WITH_PEARL_EARRING_PAINTING.unwrapKey().get())
        .add(ModBlocks.STARRY_NIGHT_PAINTING.unwrapKey().get())
        .add(ModBlocks.VAN_GOGH_SELF_PORTRAIT_PAINTING.unwrapKey().get())
        .add(ModBlocks.FATHER_PAINTING.unwrapKey().get())
        .add(ModBlocks.GREAT_WAVE_PAINTING.unwrapKey().get())
        .add(ModBlocks.MONA_LISA_PAINTING.unwrapKey().get())
        .add(ModBlocks.MONDRIAN_PAINTING.unwrapKey().get());

        this.tag(TagMod.SITTABLE)
        .addTag(TagMod.SOFA)
        .addTag(TagMod.BAR_STOOL);

        this.tag(BlockTags.MINEABLE_WITH_AXE)
        .addTag(TagMod.SANDWICH_BOARD)
        .addTag(TagMod.PAINTING)
        .add(ModBlocks.CHALKBOARD.unwrapKey().get())
        .add(ModBlocks.TABLE.unwrapKey().get())
        .add(ModBlocks.BAR_COUNTER.unwrapKey().get())
        .add(ModBlocks.STEPLADDER.unwrapKey().get())
        .add(ModBlocks.TRELLIS.unwrapKey().get())
        .add(ModBlocks.GRAPEVINE_TRELLIS.unwrapKey().get())
        .add(ModBlocks.PRESSING_TUB.unwrapKey().get())
        .add(ModBlocks.BARREL.unwrapKey().get())
        .add(ModBlocks.BAR_CABINET.unwrapKey().get())
        .add(ModBlocks.GLASS_BAR_CABINET.unwrapKey().get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .addTag(TagMod.SOFA)
        .addTag(TagMod.BAR_STOOL)
        .addTag(TagMod.STRING_LIGHTS)
        .add(ModBlocks.TAP.unwrapKey().get());

        this.tag(BlockTags.CLIMBABLE)
        .add(ModBlocks.WILD_GRAPEVINE.unwrapKey().get())
        .add(ModBlocks.WILD_GRAPEVINE_PLANT.unwrapKey().get())
        .add(ModBlocks.GRAPEVINE_TRELLIS.unwrapKey().get());

        this.tag(TagMod.GRAPEVINE_TRELLISES)
        .add(ModBlocks.GRAPEVINE_TRELLIS.unwrapKey().get())
        .add(ModBlocks.ICE_GRAPEVINE_TRELLIS.unwrapKey().get())
        .add(ModBlocks.GOLD_GRAPEVINE_TRELLIS.unwrapKey().get());

        this.tag(TagMod.GRASS_STEALTH_PLANTS)
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.SHORT_GRASS).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.SHORT_DRY_GRASS).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.TALL_GRASS).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.TALL_DRY_GRASS).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.FIREFLY_BUSH).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.FERN).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.LARGE_FERN).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.DEAD_BUSH).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.NETHER_SPROUTS).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.CRIMSON_ROOTS).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.WARPED_ROOTS).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.LILAC).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.ROSE_BUSH).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.PEONY).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.PITCHER_PLANT).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.SUGAR_CANE).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.SWEET_BERRY_BUSH).get())
        .add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.SUNFLOWER).get());
        
        // 兼容静谧四季模组
        this.tag(TagCommon.SPRING_CROPS_BLOCK)
        .add(ModBlocks.GRAPEVINE_TRELLIS.unwrapKey().get());

        this.tag(TagCommon.SUMMER_CROPS_BLOCK)
        .add(ModBlocks.GRAPEVINE_TRELLIS.unwrapKey().get())
        .add(ModBlocks.GOLD_GRAPEVINE_TRELLIS.unwrapKey().get())
        .add(ModBlocks.GRAPE_CROP.unwrapKey().get())
        .add(ModBlocks.GOLD_GRAPE_CROP.unwrapKey().get());

        this.tag(TagCommon.AUTUMN_CROPS_BLOCK)
        .add(ModBlocks.GRAPE_CROP.unwrapKey().get());

        this.tag(TagCommon.WINTER_CROPS_BLOCK)
        .add(ModBlocks.ICE_GRAPEVINE_TRELLIS.unwrapKey().get())
        .add(ModBlocks.ICE_GRAPE_CROP.unwrapKey().get());

        // 节气模组：湿度
        this.tag(TagCommon.AVERAGE_MOIST)
        .add(ModBlocks.GRAPEVINE_TRELLIS.unwrapKey().get())
        .add(ModBlocks.ICE_GRAPEVINE_TRELLIS.unwrapKey().get())
        .add(ModBlocks.GOLD_GRAPEVINE_TRELLIS.unwrapKey().get())
        .add(ModBlocks.GRAPE_CROP.unwrapKey().get())
        .add(ModBlocks.ICE_GRAPE_CROP.unwrapKey().get())
        .add(ModBlocks.GOLD_GRAPE_CROP.unwrapKey().get());

        // Carry On 黑名单
        var blacklist = tag(TagCommon.CARRYON_BLOCK_BLACKLIST);
        BuiltInRegistries.BLOCK.keySet().stream()
        .filter(id -> id.getNamespace().equals(KaleidoscopeTavern.MOD_ID))
        .forEach(id -> blacklist.add(BuiltInRegistries.BLOCK.getResourceKey(BuiltInRegistries.BLOCK.getValue(id)).get()));
    }
}
