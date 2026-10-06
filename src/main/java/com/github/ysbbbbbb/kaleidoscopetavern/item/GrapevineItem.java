package com.github.ysbbbbbb.kaleidoscopetavern.item;

import com.github.ysbbbbbb.kaleidoscopetavern.init.ModBlocks;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.CookingFuel;
import net.minecraft.world.level.storage.loot.providers.number.floats.ResolvableFloat;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.minecraft.world.level.storage.loot.providers.number.ints.ResolvableInt;

public class GrapevineItem extends BlockItem {
    public GrapevineItem(Identifier id) {
        super(
            ModBlocks.WILD_GRAPEVINE.get(),
            new Item.Properties()
            .component(DataComponents.COOKING_FUEL, new CookingFuel(
                new ResolvableInt.Constant(200),
                new ResolvableFloat.Constant(1.0f)
            ))
            .compostable(ContextIntProviders.COMPOSTABLE_LOW)
            .setId(ResourceKey.create(Registries.ITEM, id))
        );
    }
}
