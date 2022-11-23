package net.marwinka.mysticalcrops.util.block;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Function;

public class MysticalFruitItem extends BaseItem {
    private final Crop crop;

    public MysticalFruitItem(Crop crop, Function<Settings, Settings> settings) {
        super(settings);
        this.crop = crop;
    }


    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(this.crop.getTier() == "2"){
            tooltip.add(new TranslatableText("item.mysticalcrops.essence_tier_2.tooltip") );
        }
        else if(this.crop.getTier() == "3"){
            tooltip.add(new TranslatableText("item.mysticalcrops.essence_tier_3.tooltip") );
        }
        else if(this.crop.getTier() == "4"){
            tooltip.add(new TranslatableText("item.mysticalcrops.essence_tier_4.tooltip") );
        }
        else if(this.crop.getTier() == "5"){
            tooltip.add(new TranslatableText("item.mysticalcrops.essence_tier_5.tooltip") );
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
    public Crop getCrop() {
        return this.crop;
    }

}