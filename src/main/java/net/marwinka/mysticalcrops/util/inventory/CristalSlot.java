package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.init.Items;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class CristalSlot extends Slot {

    public CristalSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        if(stack.getItem() == Items.BASIC_CRYSTAL){
            return true;
        }
        if(stack.getItem() == Items.UNCOMMON_CRYSTAL){
            return true;
        }
        if(stack.getItem() == Items.ADVANCE_CRYSTAL){
            return true;
        }
        if(stack.getItem() == Items.ULTRA_CRYSTAL){
            return true;
        }
        if(stack.getItem() == Items.ULTIMATE_CRYSTAL){
            return true;
        }
        if(stack.getItem() == Items.INFINITY_CRYSTAL){
            return true;
        }
        return false;
    }
}