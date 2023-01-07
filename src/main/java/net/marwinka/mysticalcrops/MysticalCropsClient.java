package net.marwinka.mysticalcrops;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.marwinka.mysticalcrops.block.Chests.ModBlockEntityRenderer;
import net.marwinka.mysticalcrops.block.Chests.ModTextures;
import net.marwinka.mysticalcrops.init.ModCompatResources;
import net.marwinka.mysticalcrops.init.ModCrops;
import net.marwinka.mysticalcrops.init.ModVanillaResources;
import net.marwinka.mysticalcrops.networking.ModMessages;
import net.marwinka.mysticalcrops.screen.*;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class MysticalCropsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModCrops.ESSENCE_CROP_TIER_1, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModCrops.ESSENCE_CROP_TIER_2, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModCrops.ESSENCE_CROP_TIER_3, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModCrops.ESSENCE_CROP_TIER_4, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModCrops.ESSENCE_CROP_TIER_5, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.DIAMOND.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.IRON.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.REDSTONE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.GOLD.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.EMERALD.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.LAPIS.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.COAL.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.COPPER.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.QUARTZ.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.OBSIDIAN.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.NETHERITE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.DIRT.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.STONE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.GLOWSTONE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.FIRE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.STAR.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.WITHER.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.WOOD.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.AIR.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.WATER.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.NETHER.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.AMETHYST.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.SAND.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.GRAVEL.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.SNOW.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.DYE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.END.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.ENDER.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.CLAY.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.ECHO.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.NATURE.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.SOUL.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.SHEEP.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.COW.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.CHICKEN.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVanillaResources.PRISMARINE.getCrop(), RenderLayer.getCutout());
        if(ModCompatResources.END_GOBBER_GLOB.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.END_GOBBER_GLOB.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.RUBBER.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.RUBBER.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.GOBBER_GLOB.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.GOBBER_GLOB.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.NETHER_GOBBER_GLOB.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.NETHER_GOBBER_GLOB.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.ZINC.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.ZINC.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.BRASS.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.BRASS.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.CERTUS.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.CERTUS.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.FLUIX.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.FLUIX.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.NIKOLITE.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.NIKOLITE.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.NICKEL.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.NICKEL.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.REFINED_IRON.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.REFINED_IRON.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.TIN.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.TIN.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.LEAD.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.LEAD.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.ALUMINIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.ALUMINIUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.TITANIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.TITANIUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.STEEL.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.STEEL.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.ELECTRUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.ELECTRUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.SILVER.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.SILVER.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.INVAR.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.INVAR.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.ADVANCED_ALLOY.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.ADVANCED_ALLOY.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.PLATINUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.PLATINUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.BRONZE.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.BRONZE.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.CHROMIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.CHROMIUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.TUNGSTEN.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.TUNGSTEN.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.TUNGSTENSTEEL.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.TUNGSTENSTEEL.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.DESH.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.DESH.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.OSTRUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.OSTRUM.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.CALORITE.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.CALORITE.getCrop(), RenderLayer.getCutout());
        }
        if(ModCompatResources.IRIDIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(ModCompatResources.IRIDIUM.getCrop(), RenderLayer.getCutout());
        }
        HandledScreens.register(ModScreenHandler.INFUSION_TABLE_SCREEN_HANDLER, InfusionTableScreen::new);
        HandledScreens.register(ModScreenHandler.RITUAL_TABLE_SCREEN_HANDLER, RitualTableScreen::new);
        HandledScreens.register(ModScreenHandler.BOTANICAL_TABLE_SCREEN_HANDLER, BotanicalTableScreen::new);
        ModScreenHandler.registerAllScreenHandlers();
        ModMessages.registerS2CPackets();
        ModBlockEntityRenderer.registerBlockEntityRenderer();
        ModTextures.registerTextures();
    }
}
