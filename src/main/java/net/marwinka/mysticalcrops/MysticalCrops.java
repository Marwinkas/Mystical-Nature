package net.marwinka.mysticalcrops;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.marwinka.mysticalcrops.registry.*;
import net.marwinka.mysticalcrops.registry.ModOtherItems;

import net.marwinka.mysticalcrops.util.generation.ModConfiguredFeatures;
import net.marwinka.mysticalcrops.util.generation.ModOreGeneration;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysticalCrops implements ModInitializer {
	public static final String MOD_ID = "mysticalcrops";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup ITEMGROUPCLASSIC = FabricItemGroupBuilder.build(
			new ModIdentifier("mysticalcropsclassic"), () -> new ItemStack(ModItems.PERFECT_ESSENCE));
	public static final ItemGroup ITEMGROUPVANILLA = FabricItemGroupBuilder.build(
			new ModIdentifier("mysticalcropsminecraft"), () -> new ItemStack(ModVanillaItems.DYE.getEssence()));
	public static final ItemGroup ITEMGROUPOTHER = FabricItemGroupBuilder.build(
			new ModIdentifier("mysticalcropsothermods"), () -> new ItemStack(ModVanillaItems.EMERALD.getFruits()));
	@Override
	public void onInitialize() {

		ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register((world, entity, killedEntity) -> {
			if(killedEntity instanceof PathAwareEntity && Math.random() < 0.25) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModItems.COMMON_ESSENCE)));
			}
			if(killedEntity instanceof PathAwareEntity && Math.random() < 0.15) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModItems.CRYSTAL_FRAGMENTS)));
			}
			if(killedEntity instanceof WitherSkeletonEntity && Math.random() < 0.07) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModItems.WITHER_SOUL)));
			}
			if(killedEntity instanceof CowEntity && Math.random() < 0.07) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModItems.COW_SOUL)));
			}
			if(killedEntity instanceof ChickenEntity && Math.random() < 0.07) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModItems.CHICKEN_SOUL)));
			}
			if(killedEntity instanceof SheepEntity && Math.random() < 0.07) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(ModItems.SHEEP_SOUL)));
			}});

		ModBlockEntities.register();
		ModBlocks.registerBlocks();
		ModItems.registerItems();
		ModOtherItems.registerBlocks();
		ModOtherItems.registerItems();
		ModVanillaItems.registerBlocks();
		ModVanillaItems.registerItems();
		ModCrops.registerBlocks();
		ModRecipes.register();
		OldCrops.registerCrops();
		ModCrops.registerItems();
		ModFuel.register();
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModOreGeneration.generateOres();
		ModScreenHandler.register();
		ModItems2.registerItems();
	}
}