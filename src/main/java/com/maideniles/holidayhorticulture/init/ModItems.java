package com.maideniles.holidayhorticulture.init;

import com.maideniles.holidayhorticulture.HolidayHorticulture;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HolidayHorticulture.MOD_ID);

    public static final RegistryObject<Item> MISTLETOE_BALL = ITEMS.register("mistletoe_ball",
            () -> new Item(new Item.Properties().tab(ModTabs.HH_GROUP)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}