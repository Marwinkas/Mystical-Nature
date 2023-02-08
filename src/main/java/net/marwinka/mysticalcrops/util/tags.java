package net.marwinka.mysticalcrops.util;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class tags {
    public static final TagKey<Item> KNIVES = TagKey.of(Registry.ITEM_KEY, new Identifier("c", "knives"));
    public static final TagKey<Item> ESSENCE = TagKey.of(Registry.ITEM_KEY, new Identifier("c", "essence"));
    public static final TagKey<Item> CRAFT_SEEDS = TagKey.of(Registry.ITEM_KEY, new Identifier("c", "craft_seeds"));
    public static final TagKey<Item> SEEDS = TagKey.of(Registry.ITEM_KEY, new Identifier("minecraft", "seeds"));
    public static final TagKey<Item> CRYSTAL = TagKey.of(Registry.ITEM_KEY, new Identifier("c", "crystals"));
}
