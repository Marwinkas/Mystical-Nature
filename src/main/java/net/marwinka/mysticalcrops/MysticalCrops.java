package net.marwinka.mysticalcrops;

import net.fabricmc.api.ModInitializer;
import net.marwinka.mysticalcrops.block.ModBlockRegister;
import net.marwinka.mysticalcrops.entity.ModBlockEntityRegister;
import net.marwinka.mysticalcrops.item.ModItemRegister;
import net.marwinka.mysticalcrops.recipe.ModRecipes;
import net.marwinka.mysticalcrops.screen.ModScreenHandler;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysticalCrops implements ModInitializer {
	public static final String MOD_ID = "mysticalcrops";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlockEntityRegister.registerBlockEntities();
		ModBlockRegister.ModBlockregister();
		ModItemRegister.ModItemregister();
		ModScreenHandler.registerAllScreenHandlers();
		ModRecipes.registerRecipes();
	}
}
