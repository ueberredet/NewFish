package net.ueberredet.newfish.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.ueberredet.newfish.setup.ModItems;

public class ModCreativeModeTab {
    public static final CreativeModeTab FISH_TAB = new CreativeModeTab("fishtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TUNA.get());
        }
    };
}
