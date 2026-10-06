package com.github.ysbbbbbb.kaleidoscopetavern.datagen;

import com.github.ysbbbbbb.kaleidoscopetavern.KaleidoscopeTavern;
import com.github.ysbbbbbb.kaleidoscopetavern.datagen.datamap.DrinkEffectDataProvider;
import com.github.ysbbbbbb.kaleidoscopetavern.datagen.loottable.LootTableGenerator;
import com.github.ysbbbbbb.kaleidoscopetavern.datagen.misc.ParticleDescriptionGenerator;
import com.github.ysbbbbbb.kaleidoscopetavern.datagen.misc.SoundDefinitionsGenerator;
import com.github.ysbbbbbb.kaleidoscopetavern.datagen.model.ModModelProvider;
import com.github.ysbbbbbb.kaleidoscopetavern.datagen.recipe.ModRecipeGenerator;
import com.github.ysbbbbbb.kaleidoscopetavern.datagen.tag.TagBlock;
import com.github.ysbbbbbb.kaleidoscopetavern.datagen.tag.TagItem;
import com.github.ysbbbbbb.kaleidoscopetavern.init.ModDatapackRegistries;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = KaleidoscopeTavern.MOD_ID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherDataClient(GatherDataEvent.Client event) {
        var generator = event.getGenerator();
        var registries = new RegistrySetBuilder();
        var pack = generator.getPackOutput();

        generator.addProvider(true, new ModModelProvider(pack));
        registries.add(Registries.LOOT_TABLE, new LootTableGenerator());

        event.createProvider(ParticleDescriptionGenerator::new);
        event.createProvider(SoundDefinitionsGenerator::new);

        registries.add(ModRecipeGenerator.create());
        registries.add(ModDatapackRegistries.DRINK_EFFECT, DrinkEffectDataProvider::bootstrap);
        event.createReloadableRegistryObjects(registries);
        event.createBlockAndItemTags(TagBlock::new, TagItem::new);
    }
}
