package net.marwinka.mysticalcrops.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class EssenceFruitTier1 extends Item {
    public EssenceFruitTier1(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.mysticalcrops.essence_fruit_tier_1.tooltip.shift"));
        } else {
            tooltip.add(Text.translatable("item.mysticalcrops.essence_fruit_tier_1.tooltip") );
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
