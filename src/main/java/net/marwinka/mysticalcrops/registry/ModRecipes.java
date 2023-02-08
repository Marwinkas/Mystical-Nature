package net.marwinka.mysticalcrops.registry;

import net.marwinka.mysticalcrops.recipe.*;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static ModRecipeType<BotanicalRecipe> BOTANICAL_RECIPE;
    public static ModRecipeType<InfusionRecipe> INFUSE_RECIPE;
    public static ModRecipeType<RitualRecipe> RITUAL_RECIPE;
    public static RecipeSerializer<BotanicalRecipe> BOTANICAL_SERIALIZER;
    public static RecipeSerializer<InfusionRecipe> INFUSE_SERIALIZER;
    public static RecipeSerializer<RitualRecipe> RITUAL_SERIALIZER;

    public static void register() {
        BOTANICAL_RECIPE = register(new ModRecipeType<>(new ModIdentifier("cut")));
        INFUSE_RECIPE = register(new ModRecipeType<>(new ModIdentifier("infuse")));
        RITUAL_RECIPE = register(new ModRecipeType<>(new ModIdentifier("transform")));

        BOTANICAL_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, new ModIdentifier("cut"), new BotanicalRecipe.Serializer());
        INFUSE_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, new ModIdentifier("infuse"), new InfusionRecipe.Serializer());
        RITUAL_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, new ModIdentifier("transform"), new RitualRecipe.Serializer());
    }
    private static <T extends ModRecipeType<?>> T register(T recipe) {
        Registry.register(Registry.RECIPE_TYPE, recipe.getId(), recipe);
        return recipe;
    }
}