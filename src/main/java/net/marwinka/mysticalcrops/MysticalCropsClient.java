package net.marwinka.mysticalcrops;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.marwinka.mysticalcrops.blockentities.BotanicalRitualTableEntityRenderer;
import net.marwinka.mysticalcrops.init.BlockEntities;
import net.marwinka.mysticalcrops.init.Crops;
import net.marwinka.mysticalcrops.init.itemfromothermods.OtherCrops;
import net.marwinka.mysticalcrops.networking.ModMessages;
import net.marwinka.mysticalcrops.screen.BotanicalRitualTableScreen;
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
        BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.GOBBER_GLOB_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.END_GOBBER_GLOB_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OtherCrops.NETHER_GOBBER_GLOB_CROP, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandler.BOTANICAL_TABLE_SCREEN_HANDLER, BotanicalTableScreen::new);
        HandledScreens.register(ModScreenHandler.BOTANICAL_RITUAL_TABLE_SCREEN_HANDLER, BotanicalRitualTableScreen::new);
        ModMessages.registerS2CPackets();
        BlockEntityRendererRegistry.register(BlockEntities.BOTANICAL_RITUAL_TABLE, BotanicalRitualTableEntityRenderer::new);
    }
    }
