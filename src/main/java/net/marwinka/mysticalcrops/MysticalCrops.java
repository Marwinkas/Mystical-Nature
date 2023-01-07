package net.marwinka.mysticalcrops;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.marwinka.mysticalcrops.block.Chests.ChestBlockItem;
import net.marwinka.mysticalcrops.init.*;
import net.marwinka.mysticalcrops.init.ModCompatResources;
import net.marwinka.mysticalcrops.recipe.ModRecipes;
import net.marwinka.mysticalcrops.screen.ModScreenHandlerType;
import net.marwinka.mysticalcrops.util.generation.ModConfiguredFeatures;
import net.marwinka.mysticalcrops.util.generation.ModOreGeneration;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysticalCrops implements ModInitializer {
	public static final String MOD_ID = "mysticalcrops";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register((world, entity, killedEntity) -> {
			if(killedEntity instanceof PathAwareEntity && Math.random() < 0.25) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModBaseItems.BASIC_ESSENCE)));
			}
			if(killedEntity instanceof PathAwareEntity && Math.random() < 0.15) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModBaseItems.CRYSTAL_FRAGMENTS)));
			}
			if(killedEntity instanceof WitherSkeletonEntity && Math.random() < 0.07) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModBaseItems.WITHER_SOUL)));
			}
			if(killedEntity instanceof CowEntity && Math.random() < 0.07) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModBaseItems.COW_SOUL)));
			}
			if(killedEntity instanceof ChickenEntity && Math.random() < 0.07) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModBaseItems.CHICKEN_SOUL)));
			}
			if(killedEntity instanceof SheepEntity && Math.random() < 0.07) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModBaseItems.SHEEP_SOUL)));
			}
			if (entity instanceof ServerPlayerEntity) {
				ServerPlayerEntity player = (ServerPlayerEntity) entity;
				Item item = player.getMainHandStack().getItem();
			}});

		ModBlockEntities.registerBlockEntities();
		ModBlocks.registerBlocks();
		ModCrops.registerCrops();
		ModItems.registerItems();
		ModBaseItems.registerItems();
		ModCompatResources.registerBlocks();
		ModCompatResources.registerItems();
		ModVanillaResources.registerBlocks();
		ModVanillaResources.registerItems();
		ModRecipes.registerRecipes();
		ModFuels.registerModStuffs();
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModOreGeneration.generateOres();
		ModBlockChest.registerBlocks();
		ModScreenHandlerType.registerScreenHandlers();
		ChestBlockItem.registerItems();
	}
}