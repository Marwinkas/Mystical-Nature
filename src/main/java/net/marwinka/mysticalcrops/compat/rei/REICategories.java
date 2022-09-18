package net.marwinka.mysticalcrops.compat.rei;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import net.marwinka.mysticalcrops.compat.rei.ritual_table.BotanicalTableDisplay;
import net.marwinka.mysticalcrops.compat.rei.ritual_table.RitualTableDisplay;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;

public class REICategories {
    public static final CategoryIdentifier<BotanicalTableDisplay> BOTANICAL_TABLE_CATEGORY = CategoryIdentifier.of(new ModIdentifier("botanical_table"));
    public static final CategoryIdentifier<RitualTableDisplay> BOTANICAL_RITUAL_TABLE_CATEGORY = CategoryIdentifier.of(new ModIdentifier("botanical_ritual_table"));
}