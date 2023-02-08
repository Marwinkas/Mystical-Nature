package net.marwinka.mysticalcrops.recipe;

import com.google.gson.JsonObject;
import net.marwinka.mysticalcrops.registry.ModRecipes;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InfusionRecipe  extends ModRecipe {

    public InfusionRecipe(Identifier id, List<Ingredient> input, ItemStack output) {
        super(id, input, output);
    }

    @Override
    public boolean matches(Inventory inventory, World world) {
        for (int i = 0; i < this.inputs.size(); i++) {
            if (!inputs.get(i).test(inventory.getStack(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.INFUSE_SERIALIZER;
    }
    @Override
    public RecipeType<?> getType() {
        return ModRecipes.INFUSE_RECIPE;
    }

    public static class Serializer implements RecipeSerializer<InfusionRecipe> {
        @Override
        public InfusionRecipe read(Identifier id, JsonObject json) {

            List<Ingredient> ingredients = new LinkedList<>();
            json.getAsJsonArray("ingredients").forEach(element -> {
                JsonObject jsonObject = element.getAsJsonObject();
                ingredients.add(Ingredient.fromJson(jsonObject.get("ingredient").getAsJsonObject()));
            });

            Item item = Registry.ITEM.get(new Identifier(json.get("output").getAsJsonObject().get("item").getAsString()));
            ItemStack output = new ItemStack(item);

            return new InfusionRecipe(id, ingredients, output);
        }
        @Override
        public InfusionRecipe read(Identifier id, PacketByteBuf buf) {
            List<Ingredient> ingredients = buf.readList(buf2 -> {
                return Ingredient.fromPacket(buf2);
            });
            ItemStack output = buf.readItemStack();
            return new InfusionRecipe(id, ingredients, output);
        }

        @Override
        public void write(PacketByteBuf buf, InfusionRecipe recipe) {
            buf.writeCollection(recipe.getIngredients(), (buf2, ingredient) -> {
                ingredient.write(buf2);
            });
            buf.writeItemStack(recipe.getOutput());
        }
    }
}