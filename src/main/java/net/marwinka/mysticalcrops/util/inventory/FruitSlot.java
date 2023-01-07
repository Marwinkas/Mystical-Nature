package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.init.ModBaseItems;
import net.marwinka.mysticalcrops.init.ModVanillaResources;
import net.marwinka.mysticalcrops.init.ModCompatResources;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class FruitSlot extends Slot {

    public FruitSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        if(stack.getItem() == ModVanillaResources.COAL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.COPPER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.DIAMOND.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.EMERALD.getFruits()){
            return true;
        }
        if(stack.getItem() == ModBaseItems.ESSENCE_FRUIT_TIER_1){
            return true;
        }
        if(stack.getItem() == ModBaseItems.ESSENCE_FRUIT_TIER_2){
            return true;
        }
        if(stack.getItem() == ModBaseItems.ESSENCE_FRUIT_TIER_3){
            return true;
        }
        if(stack.getItem() == ModBaseItems.ESSENCE_FRUIT_TIER_4){
            return true;
        }
        if(stack.getItem() == ModBaseItems.ESSENCE_FRUIT_TIER_5){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.IRON.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.GOLD.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.LAPIS.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.OBSIDIAN.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.QUARTZ.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.DIRT.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.STONE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.WOOD.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.GLOWSTONE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.FIRE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.REDSTONE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.NETHERITE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.STAR.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.WITHER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.GOBBER_GLOB.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.END_GOBBER_GLOB.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.ZINC.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.BRASS.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.FLUIX.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.CERTUS.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.TITANIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.NIKOLITE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.NICKEL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.TUNGSTEN.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.TUNGSTENSTEEL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.STEEL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.LEAD.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.TIN.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.ELECTRUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.CHROMIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.CALORITE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.ALUMINIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.INVAR.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.ADVANCED_ALLOY.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.REFINED_IRON.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.PLATINUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.IRIDIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.RUBBER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.WATER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.NETHER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.AMETHYST.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.SAND.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.GRAVEL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.SNOW.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.DYE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.ENDER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.END.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.CLAY.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.NATURE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.PRISMARINE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.ECHO.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.SHEEP.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.COW.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.CHICKEN.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.SOUL.getFruits()){
            return true;
        }
        if(stack.getItem() == ModVanillaResources.AIR.getFruits()){
            return true;
        }

        if(stack.getItem() == ModCompatResources.BRONZE.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.SILVER.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.DESH.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.OSTRUM.getFruits()){
            return true;
        }
        if(stack.getItem() == ModCompatResources.NETHER_GOBBER_GLOB.getFruits()){
            return true;
        }
        return false;
    }
}