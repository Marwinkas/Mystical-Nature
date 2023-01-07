package net.marwinka.mysticalcrops.items.tools;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ExcellentKnife extends SwordItem {
    public ExcellentKnife(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.mysticalcrops.essence_tier_4.tooltip") );
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.mysticalcrops.knife.tooltip.shift"));
        } else {
            tooltip.add(new TranslatableText("item.mysticalcrops.knife.tooltip") );
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
