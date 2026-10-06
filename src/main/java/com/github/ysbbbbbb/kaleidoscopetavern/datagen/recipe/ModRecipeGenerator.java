package com.github.ysbbbbbb.kaleidoscopetavern.datagen.recipe;

import com.google.common.collect.Lists;

import net.minecraft.advancements.Advancement;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.MultiRegistryBootstrap;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.crafting.Recipe;

import java.util.List;
import java.util.Set;

public class ModRecipeGenerator extends ModRecipeProvider {
    private final List<ModRecipeProvider> providers = Lists.newArrayList();

    public ModRecipeGenerator(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(recipeOutput, advancementOutput);
        providers.add(new PressingTubRecipeProvider(recipeOutput, advancementOutput));
        providers.add(new BarrelRecipeProvider(recipeOutput, advancementOutput));
        providers.add(new ShapedRecipeProvider(recipeOutput, advancementOutput));
        providers.add(new ShapelessRecipeProvider(recipeOutput, advancementOutput));
    }

    @Override
    protected void buildRecipes() {
        for (ModRecipeProvider provider : providers) {
            provider.buildRecipes();
        }
    }

    public static MultiRegistryBootstrap create() {
        return new MultiRegistryBootstrap() {
            @Override
            public Set<ResourceKey<? extends Registry<?>>> requestedRegistries() {
                // Return the registries we are adding entries to.
                return Set.of(Registries.RECIPE, Registries.ADVANCEMENT);
            }

            @Override
            public void run(MultiRegistryBootstrap.BootstrapGetter registries) {
                // Run the recipe provider.
                new ModRecipeGenerator(registries.get(Registries.RECIPE), registries.get(Registries.ADVANCEMENT)).buildRecipes();
            }
        };
    }
}
