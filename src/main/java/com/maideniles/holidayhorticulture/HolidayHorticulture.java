package com.maideniles.holidayhorticulture;

import com.maideniles.holidayhorticulture.client.RenderLayers;
import com.maideniles.holidayhorticulture.init.ModBlocks;
import com.maideniles.holidayhorticulture.init.ModItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HolidayHorticulture.MOD_ID)
public class HolidayHorticulture {
    public static final String MOD_ID = "holidayhorticulture";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();




    public HolidayHorticulture() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        RenderLayers.safeRunClient();





        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    // add a comment

    private void setup(final FMLCommonSetupEvent event) {


        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }


}
