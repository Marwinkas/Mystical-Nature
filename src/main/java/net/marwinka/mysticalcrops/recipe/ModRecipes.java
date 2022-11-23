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

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MysticalCrops.MOD_ID, RitualTableRecipe.Serializer.ID),
                RitualTableRecipe.Serializer.GF);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MysticalCrops.MOD_ID, RitualTableRecipe.Type.ID),
                RitualTableRecipe.Type.GF);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MysticalCrops.MOD_ID, InfusionTableRecipe.Serializer.ID),
                InfusionTableRecipe.Serializer.INFUSION);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MysticalCrops.MOD_ID, InfusionTableRecipe.Type.ID),
                InfusionTableRecipe.Type.INFUSION);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MysticalCrops.MOD_ID, seedsfruit.Serializer.ID),
                seedsfruit.Serializer.FRUITS);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MysticalCrops.MOD_ID, seedsfruit.Type.ID),
                seedsfruit.Type.FRUITS);
    }
}
