package net.marwinka.mysticalcrops.item;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class EssenceTier1Fruit extends Item {
    public EssenceTier1Fruit(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.mysticalcrops.essence_tier_1_fruit.tooltip.shift"));
        } else {
            tooltip.add(Text.translatable("item.mysticalcrops.essence_tier_1_fruit.tooltip") );
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
