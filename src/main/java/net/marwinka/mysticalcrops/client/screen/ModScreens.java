package net.marwinka.mysticalcrops.client.screen;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.marwinka.mysticalcrops.registry.ModScreenHandler;
import net.marwinka.mysticalcrops.screenhandler.GenericChestHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

@Environment(EnvType.CLIENT)
public class ModScreens {

    public static void register() {
        HandledScreens.register(ModScreenHandler.BOTANICAL_HANDLER, BotanicalScreen::new);
        HandledScreens.register(ModScreenHandler.RITUAL_HANDLER, RitualScreen::new);
        HandledScreens.register(ModScreenHandler.INFUSION_HANDLER, InfusionScreen::new);

        ScreenRegistry.<GenericChestHandler, CottonInventoryScreen<GenericChestHandler>>register(ModScreenHandler.COMMON_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<GenericChestHandler, CottonInventoryScreen<GenericChestHandler>>register(ModScreenHandler.UNCOMMON_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<GenericChestHandler, CottonInventoryScreen<GenericChestHandler>>register(ModScreenHandler.WONDERFUL_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<GenericChestHandler, CottonInventoryScreen<GenericChestHandler>>register(ModScreenHandler.EXCELLENT_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<GenericChestHandler, CottonInventoryScreen<GenericChestHandler>>register(ModScreenHandler.PERFECT_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
    }
}