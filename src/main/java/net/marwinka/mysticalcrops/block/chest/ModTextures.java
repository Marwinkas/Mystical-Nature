package net.marwinka.mysticalcrops.block.chest;

import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.TexturedRenderLayers;

public class ModTextures {
    public static void registerTextures() {
        ClientSpriteRegistryCallback.event(TexturedRenderLayers.CHEST_ATLAS_TEXTURE).register((texture, registry) -> {
            registry.register(ChestTypes.WOOD.texture);
            registry.register(ChestTypes.COMMON.texture);
            registry.register(ChestTypes.UNCOMMON.texture);
            registry.register(ChestTypes.WONDERFUL.texture);
            registry.register(ChestTypes.EXCELLENT.texture);
            registry.register(ChestTypes.PERFECT.texture);
        });
    }
}