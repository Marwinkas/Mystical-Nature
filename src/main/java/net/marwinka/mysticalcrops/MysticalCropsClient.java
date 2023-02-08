package net.marwinka.mysticalcrops;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.marwinka.mysticalcrops.client.screen.ModScreens;
import net.marwinka.mysticalcrops.registry.*;
import net.marwinka.mysticalcrops.block.chest.ModTextures;
import net.minecraft.client.render.RenderLayer;

public class MysticalCropsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registercrops();
        ModScreens.register();
        ModBlockEntityRenderer.registerBlockEntityRenderer();
        ModTextures.registerTextures();
    }

    public void registercrops(){
        BlockRenderLayerMap.INSTANCE.putBlock(ModCrops.ESSENCE_TIER_1.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModCrops.ESSENCE_TIER_2.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModCrops.ESSENCE_TIER_3.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModCrops.ESSENCE_TIER_4.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModCrops.ESSENCE_TIER_5.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OldCrops.ESSENCE_CROP_TIER_1, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OldCrops.ESSENCE_CROP_TIER_2, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OldCrops.ESSENCE_CROP_TIER_3, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OldCrops.ESSENCE_CROP_TIER_4, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OldCrops.ESSENCE_CROP_TIER_5, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.DIAMOND.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.IRON.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.REDSTONE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.GOLD.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.EMERALD.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.LAPIS.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.COAL.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.COPPER.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.QUARTZ.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.OBSIDIAN.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.NETHERITE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.DIRT.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.STONE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.GLOWSTONE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.FIRE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.STAR.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.WITHER.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.WOOD.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.AIR.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.WATER.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.NETHER.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.AMETHYST.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.SAND.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.GRAVEL.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.SNOW.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.DYE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.END.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.ENDER.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.CLAY.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.NATURE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.SOUL.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.SHEEP.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.COW.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.CHICKEN.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaItems.PRISMARINE.getCrop(), RenderLayer.getCutout());
        if(ModOtherItems.END_GOBBER_GLOB.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.END_GOBBER_GLOB.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.RUBBER.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.RUBBER.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.GOBBER_GLOB.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.GOBBER_GLOB.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.NETHER_GOBBER_GLOB.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.NETHER_GOBBER_GLOB.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.ZINC.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.ZINC.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.BRASS.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.BRASS.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.CERTUS.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.CERTUS.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.FLUIX.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.FLUIX.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.NIKOLITE.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.NIKOLITE.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.NICKEL.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.NICKEL.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.REFINED_IRON.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.REFINED_IRON.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.TIN.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.TIN.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.LEAD.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.LEAD.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.ALUMINIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.ALUMINIUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.TITANIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.TITANIUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.STEEL.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.STEEL.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.ELECTRUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.ELECTRUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.SILVER.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.SILVER.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.INVAR.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.INVAR.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.ADVANCED_ALLOY.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.ADVANCED_ALLOY.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.PLATINUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.PLATINUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.BRONZE.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.BRONZE.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.CHROMIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.CHROMIUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.TUNGSTEN.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.TUNGSTEN.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.TUNGSTENSTEEL.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.TUNGSTENSTEEL.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.DESH.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.DESH.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.OSTRUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.OSTRUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.CALORITE.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.CALORITE.getCrop(), RenderLayer.getCutout());
        }
        if(ModOtherItems.IRIDIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModOtherItems.IRIDIUM.getCrop(), RenderLayer.getCutout());
        }
    }
}
