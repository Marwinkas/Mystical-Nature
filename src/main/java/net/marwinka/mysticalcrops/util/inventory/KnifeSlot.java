package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.init.Items;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class KnifeSlot extends Slot {

    public KnifeSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        if(stack.getItem() == Items.IRON_KNIFE){
            return true;
        }
        if(stack.getItem() == Items.DIAMOND_KNIFE){
            return true;
        }
        if(stack.getItem() == Items.NETHERITE_KNIFE){
            return true;
        }
        return false;
    }
}