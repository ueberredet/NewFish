package net.ueberredet.newfish.setup;



import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ueberredet.newfish.NewFish;
import net.ueberredet.newfish.item.FilletKnifeItem;
import net.ueberredet.newfish.item.ModCreativeModeTab;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NewFish.MOD_ID);

    public static final RegistryObject<Item> TUNA = ITEMS.register("tuna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

    public static final RegistryObject<Item> TROUT = ITEMS.register("trout",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

    public static final RegistryObject<Item> TROUTFILLET = ITEMS.register("troutfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(3).build())));

    public static final RegistryObject<Item> TUNAFILLET = ITEMS.register("tunafillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(3).build())));

    public static final RegistryObject<Item> FRIEDTUNAFILLET = ITEMS.register("friedtunafillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(7).build())));

    public static final RegistryObject<Item> FRIEDTROUTFILLET = ITEMS.register("friedtroutfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(7).build())));

    public static final RegistryObject<Item> SMOKEDTUNAFILLET = ITEMS.register("smokedtunafillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(7).build())));

    public static final RegistryObject<Item> SMOKEDTROUTFILLET = ITEMS.register("smokedtroutfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(7).build())));

    public static final RegistryObject<Item> STURGEON = ITEMS.register("sturgeon",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

    public static final RegistryObject<Item> HALIBUT = ITEMS.register("halibut",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

    public static final RegistryObject<Item> CARP = ITEMS.register("carp",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

    public static final RegistryObject<Item> BREAM = ITEMS.register("bream",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

    public static final RegistryObject<Item> STURGEONFILLET = ITEMS.register("sturgeonfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(3).build())));

    public static final RegistryObject<Item> CODFILLET = ITEMS.register("codfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(3).build())));

    public static final RegistryObject<Item> HALIBUTFILLET = ITEMS.register("halibutfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(3).build())));

    public static final RegistryObject<Item> CARPFILLET = ITEMS.register("carpfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(3).build())));

    public static final RegistryObject<Item> BREAMFILLET = ITEMS.register("breamfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(3).build())));

    public static final RegistryObject<Item> FRIEDSTURGEONFILLET = ITEMS.register("friedsturgeonfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(6).build())));

    public static final RegistryObject<Item> FRIEDHALIBUTFILLET = ITEMS.register("friedhalibutfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(6).build())));

    public static final RegistryObject<Item> FRIEDCARPFILLET = ITEMS.register("friedcarpfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(6).build())));

    public static final RegistryObject<Item> FRIEDBREAMFILLET = ITEMS.register("friedbreamfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(6).build())));

    public static final RegistryObject<Item> SMOKEDSTURGEONFILLET = ITEMS.register("smokedsturgeonfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(6).build())));

    public static final RegistryObject<Item> SMOKEDHALIBUTFILLET = ITEMS.register("smokedhalibutfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(6).build())));

    public static final RegistryObject<Item> SMOKEDCARPFILLET = ITEMS.register("smokedcarpfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(6).build())));

    public static final RegistryObject<Item> SMOKEDBREAMFILLET = ITEMS.register("smokedbreamfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(6).build())));

    public static final RegistryObject<Item> SMOKEDCODFILLET = ITEMS.register("smokedcodfillet",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(6).build())));

    public static final RegistryObject<FilletKnifeItem> FILLETKNIFE = ITEMS.register("filletknife",
            () -> new FilletKnifeItem(new Item.Properties().tab(ModCreativeModeTab.FISH_TAB).durability(128)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


