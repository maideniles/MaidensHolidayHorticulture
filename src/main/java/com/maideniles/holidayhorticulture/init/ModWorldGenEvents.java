package com.maideniles.holidayhorticulture.init;

import com.maideniles.holidayhorticulture.HolidayHorticulture;
import com.maideniles.holidayhorticulture.world.gen.ModFlowerGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HolidayHorticulture.MOD_ID)
public class ModWorldGenEvents {
    @SubscribeEvent
    public static void ModModWorldGen(final BiomeLoadingEvent event) {

       ModFlowerGeneration.generateFlowers(event);
    }
}
