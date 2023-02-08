package net.marwinka.mysticalcrops.items.tools;

import net.marwinka.mysticalcrops.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ToolMaterials implements ToolMaterial {
    COMMON_CRYSTAL(0, 750, 2, 0, 15, () -> {
        return Ingredient.ofItems(ModItems.COMMON_ESSENCE);
    }),
    UNCOMMON_CRYSTAL(1, 1500, 2, 0, 15, () -> {
        return Ingredient.ofItems(ModItems.UNCOMMON_ESSENCE);
    }),
    WONDERFUL_CRYSTAL(2, 3000, 2, 0, 15, () -> {
        return Ingredient.ofItems(ModItems.WONDERFUL_ESSENCE);
    }),
    EXCELLENT_CRYSTAL(3, 6000, 2, 0, 15, () -> {
        return Ingredient.ofItems(ModItems.EXCELLENT_ESSENCE);
    }),
    PERFECT_CRYSTAL(4, 11000, 2, 0, 15, () -> {
        return Ingredient.ofItems(ModItems.PERFECT_ESSENCE);
    }),
    COMMON_KNIFE(0, 750, 2, 0, 15, () -> {
        return Ingredient.ofItems(ModItems.COMMON_INGOT);
    }),
    UNCOMMON_KNIFE(1, 1500, 2, 0, 15, () -> {
        return Ingredient.ofItems(ModItems.UNCOMMON_INGOT);
    }),
    WONDERFUL_KNIFE(2, 3000, 2, 0, 15, () -> Ingredient.ofItems(ModItems.WONDERFUL_INGOT)),
    EXCELLENT_KNIFE(3, 6000, 2, 0, 15, () -> {
        return Ingredient.ofItems(ModItems.EXCELLENT_INGOT);
    }),
    PERFECT_KNIFE(4, 11000, 2, 0, 15, () -> {
        return Ingredient.ofItems(ModItems.PERFECT_INGOT);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
