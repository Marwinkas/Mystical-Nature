package net.marwinka.mysticalcrops;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.marwinka.mysticalcrops.init.Blocks;
import net.marwinka.mysticalcrops.init.Crops;
import net.marwinka.mysticalcrops.screen.BotanicalRitualTableScreen;
import net.marwinka.mysticalcrops.screen.BotanicalTableScreen;
import net.marwinka.mysticalcrops.screen.ModScreenHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class MysticalCropsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.DIAMOND_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.IRON_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.REDSTONE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.GOLD_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.EMERALD_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.LAPIS_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.ESSENCE_CROP_TIER_1, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandler.BOTANICAL_TABLE_SCREEN_HANDLER, BotanicalTableScreen::new);
        HandledScreens.register(ModScreenHandler.BOTANICAL_RITUAL_TABLE_SCREEN_HANDLER, BotanicalRitualTableScreen::new);
    }
}
