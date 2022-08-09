package net.ueberredet.newfish;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.ueberredet.newfish.setup.ModItems;
import net.ueberredet.newfish.setup.ModLootTables;
import org.slf4j.Logger;

@Mod(NewFish.MOD_ID)
public class NewFish {
    public static final String MOD_ID = "newfish";
    public static final Logger LOGGER = LogUtils.getLogger();

    public NewFish() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            System.out.println("---------");
            BuiltInLootTables.all().forEach((x) -> {
                System.out.println(x.toString());
            });
        }
    }
}
