package net.marwinka.mysticalcrops;

import net.fabricmc.api.ModInitializer;
import net.marwinka.mysticalcrops.init.Blocks;
import net.marwinka.mysticalcrops.init.BlockEntities;
import net.marwinka.mysticalcrops.init.Crops;
import net.marwinka.mysticalcrops.init.Items;
import net.marwinka.mysticalcrops.recipe.ModRecipes;
import net.marwinka.mysticalcrops.screen.ModScreenHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysticalCrops implements ModInitializer {
	public static final String MOD_ID = "mysticalcrops";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockEntities.registerBlockEntities();
		Blocks.registerBlocks();
		Crops.registerCrops();
		Items.registerItems();
		ModScreenHandler.registerAllScreenHandlers();
		ModRecipes.registerRecipes();
	}
}
