package net.marwinka.mysticalcrops.recipe;

import net.marwinka.mysticalcrops.util.inventory.ImplementedInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class ModRecipe implements Recipe<Inventory>, Predicate<ItemStack> {
    protected Identifier id;
    protected final List<Ingredient> inputs = new ArrayList<>();
    protected List<Integer> stackCounts;
    private final ItemStack output;
    public ModRecipe(Identifier id, List<Ingredient> inputs, List<Integer> stackCounts, ItemStack output) {
        this.id = id;
        this.output = output;
        this.inputs.addAll(inputs);
        this.stackCounts = stackCounts;
    }
    public ModRecipe(Identifier id, List<Ingredient> inputs, ItemStack output) {
        this.id = id;
        this.output = output;
        this.inputs.addAll(inputs);
    }
    @Override
    public boolean fits(int width, int height) {
        // Unused.
        return true;
    }
    public List<Integer> getStackCounts() {
        return this.stackCounts;
    }
    @Override
    public boolean test(ItemStack itemStack) {
        for (Ingredient input : this.inputs) {
            if (input.test(itemStack)) {
                return true;
            }
        }
        return false;
    }

    // Tests if everything in the inventory matches the recipe in the correct order.
    public boolean test(ImplementedInventory inventory) {

        for (int i = 0; i < this.inputs.size(); i++) {
            if (!inputs.get(i).test(inventory.getItems().get(i))) {
                return false;
            }
        }

        return true;
    }
    @Override
    public Identifier getId() {
        return this.id;
    }
    @Override
    public ItemStack craft(Inventory inventory) {
        return output;
    }

    @Override
    public ItemStack getOutput() {
        return this.output.copy();
    }
    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> defaultedList = DefaultedList.of();
        defaultedList.addAll(this.inputs);
        return defaultedList;
    }

}
