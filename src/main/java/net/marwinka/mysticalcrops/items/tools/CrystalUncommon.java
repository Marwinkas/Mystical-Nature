package net.marwinka.mysticalcrops.items.tools;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class CrystalUncommon extends SwordItem {
    public CrystalUncommon(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.mysticalcrops.tier_2.tooltip") );
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.mysticalcrops.crystal.tooltip.shift"));
        } else {
            tooltip.add(Text.translatable("item.mysticalcrops.crystal.tooltip"));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
