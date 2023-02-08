package net.marwinka.mysticalcrops.recipe;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;

public class ModRecipeType<T extends Recipe<Inventory>> implements RecipeType<T> {
    private final Identifier id;
    public ModRecipeType(Identifier id) {
        this.id = id;
    }
    public Identifier getId() {
        return this.id;
    }

}
