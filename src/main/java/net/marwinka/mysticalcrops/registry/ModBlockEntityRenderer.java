package net.marwinka.mysticalcrops.registry;

import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.marwinka.mysticalcrops.block.chest.ChestEntityRenderer;

public class ModBlockEntityRenderer {
    public static void registerBlockEntityRenderer() {
        BlockEntityRendererRegistry.register(ModBlockEntities.COMMON_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.UNCOMMON_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.WONDERFUL_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.EXCELLENT_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.PERFECT_CHEST, ChestEntityRenderer::new);
    }
}