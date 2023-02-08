package net.marwinka.mysticalcrops.compat.rei;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import net.marwinka.mysticalcrops.compat.rei.display.*;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;

public class REICategories {
    public static final CategoryIdentifier<BotanicalDisplay> BOTANICAL_CATEGORY = CategoryIdentifier.of(new ModIdentifier("botanical_table"));
    public static final CategoryIdentifier<RitualDisplay> RITUAL_CATEGORY = CategoryIdentifier.of(new ModIdentifier("ritual_table"));
    public static final CategoryIdentifier<InfusionDisplay> INFUSION_CATEGORY = CategoryIdentifier.of(new ModIdentifier("infusion_table"));
}