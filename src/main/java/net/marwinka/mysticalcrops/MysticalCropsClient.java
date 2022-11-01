package net.marwinka.mysticalcrops;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.marwinka.mysticalcrops.blockentities.InfusionTableEntityRenderer;
import net.marwinka.mysticalcrops.blockentities.RitualTableEntityRenderer;
import net.marwinka.mysticalcrops.init.BlockEntities;
import net.marwinka.mysticalcrops.init.Crops;
import net.marwinka.mysticalcrops.init.itemfromothermods.OtherCrops;
import net.marwinka.mysticalcrops.networking.ModMessages;
import net.marwinka.mysticalcrops.screen.InfusionTableScreen;
import net.marwinka.mysticalcrops.screen.RitualTableScreen;
import net.marwinka.mysticalcrops.screen.BotanicalTableScreen;
import net.marwinka.mysticalcrops.screen.ModScreenHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class MysticalCropsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.ESSENCE_CROP_TIER_1, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.ESSENCE_CROP_TIER_2, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.ESSENCE_CROP_TIER_3, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.ESSENCE_CROP_TIER_4, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.ESSENCE_CROP_TIER_5, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.DIAMOND_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.IRON_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.REDSTONE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.GOLD_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.EMERALD_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.LAPIS_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.COAL_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.COPPER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.QUARTZ_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.OBSIDIAN_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.NETHERITE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.DIRT_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.STONE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.GLOWSTONE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.FIRE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.ECHO_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.STAR_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.WITHER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.WOOD_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.AIR.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.WATER.getCrop(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.NETHER.getCrop(), RenderLayer.getCutout());
        if(OtherCrops.END_GOBBER_GLOB.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.END_GOBBER_GLOB.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.RUBBER.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.RUBBER.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.GOBBER_GLOB.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.GOBBER_GLOB.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.NETHER_GOBBER_GLOB.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.NETHER_GOBBER_GLOB.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.ZINC.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.ZINC.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.BRASS.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.BRASS.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.CERTUS.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.CERTUS.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.FLUIX.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.FLUIX.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.NIKOLITE.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.NIKOLITE.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.NICKEL.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.NICKEL.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.REFINED_IRON.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.REFINED_IRON.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.TIN.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.TIN.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.LEAD.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.LEAD.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.ALUMINIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.ALUMINIUM.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.TITANIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.TITANIUM.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.STEEL.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.STEEL.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.ELECTRUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.ELECTRUM.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.SILVER.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.SILVER.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.INVAR.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.INVAR.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.ADVANCED_ALLOY.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.ADVANCED_ALLOY.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.PLATINUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.PLATINUM.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.BRONZE.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.BRONZE.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.CHROMIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.CHROMIUM.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.TUNGSTEN.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.TUNGSTEN.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.TUNGSTENSTEEL.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.TUNGSTENSTEEL.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.DESH.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.DESH.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.OSTRUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.OSTRUM.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.CALORITE.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.CALORITE.getCrop(), RenderLayer.getCutout());
        }
        if(OtherCrops.IRIDIUM.isEnabled()){
            BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.IRIDIUM.getCrop(), RenderLayer.getCutout());
        }
        HandledScreens.register(ModScreenHandler.BOTANICAL_TABLE_SCREEN_HANDLER, BotanicalTableScreen::new);

        HandledScreens.register(ModScreenHandler.INFUSION_TABLE_SCREEN_HANDLER, InfusionTableScreen::new);
        HandledScreens.register(ModScreenHandler.RITUAL_TABLE_SCREEN_HANDLER, RitualTableScreen::new);
        ModMessages.registerS2CPackets();
        BlockEntityRendererRegistry.register(BlockEntities.BOTANICAL_RITUAL_TABLE, RitualTableEntityRenderer::new);
        BlockEntityRendererRegistry.register(BlockEntities.INFUSION_TABLE, InfusionTableEntityRenderer::new);
    }
    }
