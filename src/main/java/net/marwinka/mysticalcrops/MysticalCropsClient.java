package net.marwinka.mysticalcrops;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.marwinka.mysticalcrops.block.ModBlockRegister;
import net.marwinka.mysticalcrops.screen.BotanicalRitualTableScreen;
import net.marwinka.mysticalcrops.screen.BotanicalTableScreen;
import net.marwinka.mysticalcrops.screen.ModScreenHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MysticalCropsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.DIAMOND_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.IRON_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.ESSENCE_TIER_1_CROP, RenderLayer.getCutout());
        HandledScreens.register(ModScreenHandler.BOTANICAL_TABLE_SCREEN_HANDLER, BotanicalTableScreen::new);
        HandledScreens.register(ModScreenHandler.BOTANICAL_RITUAL_TABLE_SCREEN_HANDLER, BotanicalRitualTableScreen::new);
    }
}
