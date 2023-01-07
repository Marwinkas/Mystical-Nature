package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.util.tags;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class SeedSlot extends Slot {

    public SeedSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        if(stack.isIn(tags.SEEDSS)){
            return true;
        }
        if(stack.isIn(tags.CRAFT_SEEDS)){
            return true;
        }
        return false;
    }
}