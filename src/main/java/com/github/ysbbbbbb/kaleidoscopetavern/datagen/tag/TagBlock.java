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
        .add(ModBlocks.WHITE_SOFA.getKey())
        .add(ModBlocks.LIGHT_GRAY_SOFA.getKey())
        .add(ModBlocks.GRAY_SOFA.getKey())
        .add(ModBlocks.BLACK_SOFA.getKey())
        .add(ModBlocks.BROWN_SOFA.getKey())
        .add(ModBlocks.RED_SOFA.getKey())
        .add(ModBlocks.ORANGE_SOFA.getKey())
        .add(ModBlocks.YELLOW_SOFA.getKey())
        .add(ModBlocks.LIME_SOFA.getKey())
        .add(ModBlocks.GREEN_SOFA.getKey())
        .add(ModBlocks.CYAN_SOFA.getKey())
        .add(ModBlocks.LIGHT_BLUE_SOFA.getKey())
        .add(ModBlocks.BLUE_SOFA.getKey())
        .add(ModBlocks.PURPLE_SOFA.getKey())
        .add(ModBlocks.MAGENTA_SOFA.getKey())
        .add(ModBlocks.PINK_SOFA.getKey());

        this.tag(TagMod.BAR_STOOL)
        .add(ModBlocks.WHITE_BAR_STOOL.getKey())
        .add(ModBlocks.LIGHT_GRAY_BAR_STOOL.getKey())
        .add(ModBlocks.GRAY_BAR_STOOL.getKey())
        .add(ModBlocks.BLACK_BAR_STOOL.getKey())
        .add(ModBlocks.BROWN_BAR_STOOL.getKey())
        .add(ModBlocks.RED_BAR_STOOL.getKey())
        .add(ModBlocks.ORANGE_BAR_STOOL.getKey())
        .add(ModBlocks.YELLOW_BAR_STOOL.getKey())
        .add(ModBlocks.LIME_BAR_STOOL.getKey())
        .add(ModBlocks.GREEN_BAR_STOOL.getKey())
        .add(ModBlocks.CYAN_BAR_STOOL.getKey())
        .add(ModBlocks.LIGHT_BLUE_BAR_STOOL.getKey())
        .add(ModBlocks.BLUE_BAR_STOOL.getKey())
        .add(ModBlocks.PURPLE_BAR_STOOL.getKey())
        .add(ModBlocks.MAGENTA_BAR_STOOL.getKey())
        .add(ModBlocks.PINK_BAR_STOOL.getKey());

        this.tag(TagMod.SANDWICH_BOARD)
        .add(ModBlocks.BASE_SANDWICH_BOARD.getKey())
        .add(ModBlocks.GRASS_SANDWICH_BOARD.getKey())
        .add(ModBlocks.ALLIUM_SANDWICH_BOARD.getKey())
        .add(ModBlocks.AZURE_BLUET_SANDWICH_BOARD.getKey())
        .add(ModBlocks.CORNFLOWER_SANDWICH_BOARD.getKey())
        .add(ModBlocks.ORCHID_SANDWICH_BOARD.getKey())
        .add(ModBlocks.PEONY_SANDWICH_BOARD.getKey())
        .add(ModBlocks.PINK_PETALS_SANDWICH_BOARD.getKey())
        .add(ModBlocks.PITCHER_PLANT_SANDWICH_BOARD.getKey())
        .add(ModBlocks.POPPY_SANDWICH_BOARD.getKey())
        .add(ModBlocks.SUNFLOWER_SANDWICH_BOARD.getKey())
        .add(ModBlocks.TORCHFLOWER_SANDWICH_BOARD.getKey())
        .add(ModBlocks.TULIP_SANDWICH_BOARD.getKey())
        .add(ModBlocks.WITHER_ROSE_SANDWICH_BOARD.getKey());

        this.tag(TagMod.STRING_LIGHTS)
        .add(ModBlocks.STRING_LIGHTS_COLORLESS.getKey())
        .add(ModBlocks.STRING_LIGHTS_WHITE.getKey())
        .add(ModBlocks.STRING_LIGHTS_LIGHT_GRAY.getKey())
        .add(ModBlocks.STRING_LIGHTS_GRAY.getKey())
        .add(ModBlocks.STRING_LIGHTS_BLACK.getKey())
        .add(ModBlocks.STRING_LIGHTS_BROWN.getKey())
        .add(ModBlocks.STRING_LIGHTS_RED.getKey())
        .add(ModBlocks.STRING_LIGHTS_ORANGE.getKey())
        .add(ModBlocks.STRING_LIGHTS_YELLOW.getKey())
        .add(ModBlocks.STRING_LIGHTS_LIME.getKey())
        .add(ModBlocks.STRING_LIGHTS_GREEN.getKey())
        .add(ModBlocks.STRING_LIGHTS_CYAN.getKey())
        .add(ModBlocks.STRING_LIGHTS_LIGHT_BLUE.getKey())
        .add(ModBlocks.STRING_LIGHTS_BLUE.getKey())
        .add(ModBlocks.STRING_LIGHTS_PURPLE.getKey())
        .add(ModBlocks.STRING_LIGHTS_MAGENTA.getKey())
        .add(ModBlocks.STRING_LIGHTS_PINK.getKey());


        this.tag(TagMod.PAINTING)
        .add(ModBlocks.YSBB_PAINTING.getKey())
        .add(ModBlocks.TARTARIC_ACID_PAINTING.getKey())
        .add(ModBlocks.CR019_PAINTING.getKey())
        .add(ModBlocks.UNKNOWN_PAINTING.getKey())
        .add(ModBlocks.MASTER_MARISA_PAINTING.getKey())
        .add(ModBlocks.SON_OF_MAN_PAINTING.getKey())
        .add(ModBlocks.DAVID_PAINTING.getKey())
        .add(ModBlocks.GIRL_WITH_PEARL_EARRING_PAINTING.getKey())
        .add(ModBlocks.STARRY_NIGHT_PAINTING.getKey())
        .add(ModBlocks.VAN_GOGH_SELF_PORTRAIT_PAINTING.getKey())
        .add(ModBlocks.FATHER_PAINTING.getKey())
        .add(ModBlocks.GREAT_WAVE_PAINTING.getKey())
        .add(ModBlocks.MONA_LISA_PAINTING.getKey())
        .add(ModBlocks.MONDRIAN_PAINTING.getKey());

        this.tag(TagMod.SITTABLE)
        .addTag(TagMod.SOFA)
        .addTag(TagMod.BAR_STOOL);

        this.tag(BlockTags.MINEABLE_WITH_AXE)
        .addTag(TagMod.SANDWICH_BOARD)
        .addTag(TagMod.PAINTING)
        .add(ModBlocks.CHALKBOARD.getKey())
        .add(ModBlocks.TABLE.getKey())
        .add(ModBlocks.BAR_COUNTER.getKey())
        .add(ModBlocks.STEPLADDER.getKey())
        .add(ModBlocks.TRELLIS.getKey())
        .add(ModBlocks.GRAPEVINE_TRELLIS.getKey())
        .add(ModBlocks.PRESSING_TUB.getKey())
        .add(ModBlocks.BARREL.getKey())
        .add(ModBlocks.BAR_CABINET.getKey())
        .add(ModBlocks.GLASS_BAR_CABINET.getKey());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .addTag(TagMod.SOFA)
        .addTag(TagMod.BAR_STOOL)
        .addTag(TagMod.STRING_LIGHTS)
        .add(ModBlocks.TAP.getKey());

        this.tag(BlockTags.CLIMBABLE)
        .add(ModBlocks.WILD_GRAPEVINE.getKey())
        .add(ModBlocks.WILD_GRAPEVINE_PLANT.getKey())
        .add(ModBlocks.GRAPEVINE_TRELLIS.getKey());

        this.tag(TagMod.GRAPEVINE_TRELLISES)
        .add(ModBlocks.GRAPEVINE_TRELLIS.getKey())
        .add(ModBlocks.ICE_GRAPEVINE_TRELLIS.getKey())
        .add(ModBlocks.GOLD_GRAPEVINE_TRELLIS.getKey());

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
        .add(ModBlocks.GRAPEVINE_TRELLIS.getKey());

        this.tag(TagCommon.SUMMER_CROPS_BLOCK)
        .add(ModBlocks.GRAPEVINE_TRELLIS.getKey())
        .add(ModBlocks.GOLD_GRAPEVINE_TRELLIS.getKey())
        .add(ModBlocks.GRAPE_CROP.getKey())
        .add(ModBlocks.GOLD_GRAPE_CROP.getKey());

        this.tag(TagCommon.AUTUMN_CROPS_BLOCK)
        .add(ModBlocks.GRAPE_CROP.getKey());

        this.tag(TagCommon.WINTER_CROPS_BLOCK)
        .add(ModBlocks.ICE_GRAPEVINE_TRELLIS.getKey())
        .add(ModBlocks.ICE_GRAPE_CROP.getKey());

        // 节气模组：湿度
        this.tag(TagCommon.AVERAGE_MOIST)
        .add(ModBlocks.GRAPEVINE_TRELLIS.getKey())
        .add(ModBlocks.ICE_GRAPEVINE_TRELLIS.getKey())
        .add(ModBlocks.GOLD_GRAPEVINE_TRELLIS.getKey())
        .add(ModBlocks.GRAPE_CROP.getKey())
        .add(ModBlocks.ICE_GRAPE_CROP.getKey())
        .add(ModBlocks.GOLD_GRAPE_CROP.getKey());

        // Carry On 黑名单
        var blacklist = tag(TagCommon.CARRYON_BLOCK_BLACKLIST);
        BuiltInRegistries.BLOCK.keySet().stream()
        .filter(id -> id.getNamespace().equals(KaleidoscopeTavern.MOD_ID))
        .forEach(id -> blacklist.add(BuiltInRegistries.BLOCK.getResourceKey(BuiltInRegistries.BLOCK.getValue(id)).get()));
    }
}
