package net.marwinka.mysticalcrops.recipe;

import com.google.gson.JsonObject;
import net.marwinka.mysticalcrops.registry.ModRecipes;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BotanicalRecipe extends ModRecipe {

    public BotanicalRecipe(Identifier id, List<Ingredient> input, List<Integer> stackCounts, ItemStack output) {
        super(id, input,stackCounts, output);
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
        return ModRecipes.BOTANICAL_SERIALIZER;
    }
    @Override
    public RecipeType<?> getType() {
        return ModRecipes.BOTANICAL_RECIPE;
    }

    public static class Serializer implements RecipeSerializer<BotanicalRecipe> {
        @Override
        public BotanicalRecipe read(Identifier id, JsonObject json) {

            List<Ingredient> ingredients = new LinkedList<>();
            List<Integer> stackCounts = new LinkedList<>();
            json.getAsJsonArray("ingredients").forEach(element -> {
                JsonObject jsonObject = element.getAsJsonObject();
                ingredients.add(Ingredient.fromJson(jsonObject.get("ingredient").getAsJsonObject()));
                if (jsonObject.has("count")) {
                    stackCounts.add(jsonObject.get("count").getAsInt());
                } else {
                    stackCounts.add(1);
                }
            });

            Item item = Registry.ITEM.get(new Identifier(json.get("output").getAsJsonObject().get("item").getAsString()));
            short stackSize = json.get("output").getAsJsonObject().get("count").getAsShort();
            ItemStack output = new ItemStack(item, stackSize);

            return new BotanicalRecipe(id, ingredients, stackCounts, output);
        }
        @Override
        public BotanicalRecipe read(Identifier id, PacketByteBuf buf) {
            List<Ingredient> ingredients = buf.readList(buf2 -> {
                return Ingredient.fromPacket(buf2);
            });
            List<Integer> stackCounts = buf.readList(buf2 -> {
                return buf2.readInt();
            });
            ItemStack output = buf.readItemStack();
            return new BotanicalRecipe(id, ingredients, stackCounts, output);
        }

        @Override
        public void write(PacketByteBuf buf, BotanicalRecipe recipe) {
            buf.writeCollection(recipe.getIngredients(), (buf2, ingredient) -> {
                ingredient.write(buf2);
            });
            buf.writeCollection(recipe.getStackCounts(), (buf2, count) -> {
                buf2.writeInt(count);
            });
            buf.writeItemStack(recipe.getOutput());
        }
    }
}