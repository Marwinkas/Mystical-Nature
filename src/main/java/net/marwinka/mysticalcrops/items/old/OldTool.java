package net.marwinka.mysticalcrops.items.old;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

import static net.marwinka.mysticalcrops.MysticalCrops.ITEMGROUPCLASSIC;

public class OldTool extends SwordItem {
    public OldTool(ToolMaterial toolMaterial) {
        super(toolMaterial, 0, 0, new FabricItemSettings());
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.mysticalcrops.old") );
        super.appendTooltip(stack, world, tooltip, context);
    }
    @Override
    public boolean isDamageable() {
        return true;
    }
}
