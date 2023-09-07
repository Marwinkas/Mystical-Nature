package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.MysticalCrops;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class FruitSlot extends Slot {
    public FruitSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
      Identifier id = Registry.ITEM.getId(stack.getItem());

      // NOTE: All fruits are dynamically created and therefore no predefined set exists
      // Hence matching by id is the easiest option until the registration is refactored
      if (id.getNamespace() == MysticalCrops.MOD_ID && id.getPath().endsWith("_fruit")) {
        return true;
      }
      return false;
    }
}
