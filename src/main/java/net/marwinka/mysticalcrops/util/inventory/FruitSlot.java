package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.init.ModItems;
import net.marwinka.mysticalcrops.init.ModOtherItems;
import net.marwinka.mysticalcrops.init.ModVanillaItems;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class FruitSlot extends Slot {

    public FruitSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        if(stack.getItem() == ModVanillaItems.COAL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.COPPER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.DIAMOND.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.EMERALD.getFruits()){
            return true;
        }
        if(stack.getItem() == ModItems.ESSENCE_FRUIT_TIER_1){
            return true;
        }
        if(stack.getItem() == ModItems.ESSENCE_FRUIT_TIER_2){
            return true;
        }
        if(stack.getItem() == ModItems.ESSENCE_FRUIT_TIER_3){
            return true;
        }
        if(stack.getItem() == ModItems.ESSENCE_FRUIT_TIER_4){
            return true;
        }
        if(stack.getItem() == ModItems.ESSENCE_FRUIT_TIER_5){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.IRON.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.GOLD.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.LAPIS.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.OBSIDIAN.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.QUARTZ.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.DIRT.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.STONE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.WOOD.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.GLOWSTONE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.FIRE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.REDSTONE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.NETHERITE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.STAR.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.WITHER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.GOBBER_GLOB.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.END_GOBBER_GLOB.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.ZINC.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.BRASS.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.FLUIX.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.CERTUS.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.TITANIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.NIKOLITE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.NICKEL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.TUNGSTEN.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.TUNGSTENSTEEL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.STEEL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.LEAD.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.TIN.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.ELECTRUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.CHROMIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.CALORITE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.ALUMINIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.INVAR.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.ADVANCED_ALLOY.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.REFINED_IRON.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.PLATINUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.IRIDIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.RUBBER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.WATER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.NETHER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.AMETHYST.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.SAND.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.GRAVEL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.SNOW.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.DYE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.ENDER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.END.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.CLAY.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.NATURE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.COW.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.CHICKEN.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.SHEEP.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.PRISMARINE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.SOUL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaItems.AIR.getFruits()){
            return true;
        }

        if(stack.getItem() == ModOtherItems.BRONZE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.SILVER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.DESH.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.OSTRUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModOtherItems.NETHER_GOBBER_GLOB.getFruits()){
            return true;
        }
        return false;
    }
}