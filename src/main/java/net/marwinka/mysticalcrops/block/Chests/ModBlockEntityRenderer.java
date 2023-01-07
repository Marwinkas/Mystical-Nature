package net.marwinka.mysticalcrops.block.Chests;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.marwinka.mysticalcrops.init.ModBlockEntities;

public class ModBlockEntityRenderer {
    public static void registerBlockEntityRenderer() {
        BlockEntityRendererRegistry.register(ModBlockEntities.COMMON_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.UNCOMMON_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.WONDERFUL_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.EXCELLENT_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.PERFECT_CHEST, ChestEntityRenderer::new);
    }
}