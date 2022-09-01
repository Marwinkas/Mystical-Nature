package net.marwinka.mysticalcrops.recipe;

import net.marwinka.mysticalcrops.MysticalCrops;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MysticalCrops.MOD_ID, BotanicalTableRecipe.Serializer.ID),
                BotanicalTableRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MysticalCrops.MOD_ID, BotanicalTableRecipe.Type.ID),
                BotanicalTableRecipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MysticalCrops.MOD_ID, BotanicalRitualTableRecipe.Serializer.ID),
                BotanicalRitualTableRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MysticalCrops.MOD_ID, BotanicalRitualTableRecipe.Type.ID),
                BotanicalRitualTableRecipe.Type.INSTANCE);
    }
}
