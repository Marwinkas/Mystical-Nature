package net.marwinka.mysticalcrops.util.block;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Function;

public class MysticalSeedItem extends AliasedBlockItem {
    private final Crop crop;
    public MysticalSeedItem(Crop crop, Function<Settings, Settings> settings) {
        super(crop.getCrop(), settings.apply(new Settings()));
        this.crop = crop;
    }
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.mysticalcrops.tier_"+ this.crop.getTier() + ".tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
    public Crop getCrop() {
        return this.crop;
    }
}