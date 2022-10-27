package net.marwinka.mysticalcrops.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RitualTableRecipe implements Recipe<SimpleInventory> {
    private final Identifier id;
    private final ItemStack output;
    private final List<Ingredient> recipeItems = new ArrayList<>();
    protected List<Integer> stackCounts;
    public RitualTableRecipe(Identifier id, List<Ingredient> recipeItems, List<Integer> stackCounts, ItemStack output) {
        this.id = id;
        this.output = output;
        this.recipeItems.addAll(recipeItems);
        this.stackCounts = stackCounts;
    }
    public Ingredient getInputIngredient() {
        return this.recipeItems.get(0);
    }
    public List<Integer> getStackCounts() {
        return this.stackCounts;
    }
    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        for (int i = 0; i < this.recipeItems.size(); i++) {
            if (!recipeItems.get(i).test(inventory.getStack(i))) {
                return false;
            }
        }

        return true;
    }
    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> defaultedList = DefaultedList.of();
        defaultedList.addAll(this.recipeItems);
        return defaultedList;
    }
    public boolean matches(ItemStack itemStack) {
        for (Ingredient input : this.recipeItems) {
            if (input.test(itemStack)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ItemStack craft(SimpleInventory inventory) {
        return output;
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getOutput() {
        return output.copy();
    }
    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.GF;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.GF;
    }
    public static class Type implements RecipeType<RitualTableRecipe> {
        private Type() { }
        public static final Type GF = new Type();
        public static final String ID = "botanical_ritual_table_craft";
    }

    public static class Serializer implements RecipeSerializer<RitualTableRecipe> {
        public static final Serializer GF = new Serializer();
        public static final String ID = "botanical_ritual_table_craft";
        // this is the name given in the json file

        @Override
        public RitualTableRecipe read(Identifier id, JsonObject json) {

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

            return new RitualTableRecipe(id, ingredients, stackCounts, output);
        }
        @Override
        public RitualTableRecipe read(Identifier id, PacketByteBuf buf) {
            List<Ingredient> ingredients = buf.readList(buf2 -> {
                return Ingredient.fromPacket(buf2);
            });
            List<Integer> stackCounts = buf.readList(buf2 -> {
                return buf2.readInt();
            });
            ItemStack output = buf.readItemStack();
            return new RitualTableRecipe(id, ingredients, stackCounts, output);
        }

        @Override
        public void write(PacketByteBuf buf, RitualTableRecipe recipe) {
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