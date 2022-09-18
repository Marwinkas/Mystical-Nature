package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.init.Items;
import net.marwinka.mysticalcrops.init.itemfromothermods.OtherItems;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class FruitSlot extends Slot {

    public FruitSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        if(stack.getItem() == Items.COAL_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.COPPER_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.DIAMOND_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.EMERALD_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_FRUIT_TIER_1){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_FRUIT_TIER_2){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_FRUIT_TIER_3){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_FRUIT_TIER_4){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_FRUIT_TIER_5){
            return true;
        }
        if(stack.getItem() == Items.IRON_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.GOLD_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.LAPIS_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.OBSIDIAN_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.QUARTZ_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.DIRT_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.STONE_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.ECHO_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.WOOD_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.GLOWSTONE_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.FIRE_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.REDSTONE_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.NETHERITE_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.STAR_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.WITHER_FRUIT){
            return true;
        }
        if(stack.getItem() == OtherItems.GOBBER_GLOB_FRUIT){
            return true;
        }
        if(stack.getItem() == OtherItems.END_GOBBER_GLOB_FRUIT){
            return true;
        }
        if(stack.getItem() == OtherItems.NETHER_GOBBER_GLOB_FRUIT){
            return true;
        }
        return false;
    }
}