package net.ueberredet.newfish.item;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.ueberredet.newfish.setup.ModItems;

import java.util.Random;

public class FilletKnifeItem extends Item {

    public FilletKnifeItem(Properties properties) {
        super(properties);
        properties.craftingRemainingItem = this;
    }


    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        ItemStack itemStack1 = itemStack.copy();
        if (!itemStack1.hurt(1, RandomSource.create(), null))
            return itemStack1;
        return ItemStack.EMPTY;
    }

    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }
}
