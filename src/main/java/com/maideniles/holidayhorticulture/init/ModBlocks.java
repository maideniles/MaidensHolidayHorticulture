package com.maideniles.holidayhorticulture.init;

import com.maideniles.holidayhorticulture.HolidayHorticulture;
import com.maideniles.holidayhorticulture.blocks.flowers.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HolidayHorticulture.MOD_ID);


    //PLANTS//

    public static final RegistryObject<Block> CHRISTMAS_CACTUS = registerBlock("christmas_cactus",
            () -> new ChristmasCactusBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINSETTIA_PLANT = registerBlock("poinsettia_plant",
            () -> new FullFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINSETTIA_PLANT_WHITE = registerBlock("poinsettia_plant_white",
            () -> new FullFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHRISTMAS_ROSE = registerBlock("christmas_rose",
            () -> new SkinnyFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMARYLLIS = registerBlock("amaryllis",
            () -> new SkinnyFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WINTERGREEN = registerBlock("wintergreen",
            () -> new MedFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YULETIDE_CAMELLIA = registerBlock("camellia",
            () -> new TallFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WINTERBERRY = registerBlock("winterberry",
            () -> new MedFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWDROP = registerBlock("snowdrop",
            () -> new MedFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAPERWHITE = registerBlock("paperwhite",
            () -> new MedFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);


    //POTTED PLANTS//

    public static final RegistryObject<Block> POINSETTIA_POTTED_PLANT = registerBlock("poinsettia_potted_plant",
            () -> new FlowerPotBlock(POINSETTIA_PLANT.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> POINSETTIA_POTTED_PLANT_WHITE = registerBlock("poinsettia_potted_plant_white",
            () -> new FlowerPotBlock(POINSETTIA_PLANT_WHITE.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> CHRISTMAS_ROSE_POTTED = registerBlock("christmas_rose_potted",
            () -> new FlowerPotBlock(CHRISTMAS_ROSE.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> AMARYLLIS_POTTED = registerBlock("amaryllis_potted",
            () -> new FlowerPotBlock(AMARYLLIS.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> WINTERGREEN_POTTED = registerBlock("wintergreen_potted",
            () -> new FlowerPotBlock(WINTERGREEN.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> CAMELLIA_POTTED = registerBlock("camellia_potted",
            () -> new FlowerPotBlock(YULETIDE_CAMELLIA.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> WINTERBERRY_POTTED = registerBlock("winterberry_potted",
            () -> new FlowerPotBlock(WINTERBERRY.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> SNOWDROP_POTTED = registerBlock("snowdrop_potted",
            () -> new FlowerPotBlock(SNOWDROP.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> PAPERWHITE_POTTED = registerBlock("paperwhite_potted",
            () -> new FlowerPotBlock(PAPERWHITE.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> CHRISTMAS_CACTUS_POTTED = registerBlock("christmas_cactus_potted",
            () -> new FlowerPotBlock(CHRISTMAS_CACTUS.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)));


    //LEAVES//

    public static final RegistryObject<Block> YEW_LEAVES = registerBlock("yew_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2.0F).noOcclusion().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINSETTIA_LEAVES = registerBlock("poinsettia_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2.0F).noOcclusion().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINSETTIA_WHITE_LEAVES = registerBlock("poinsettia_white_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2.0F).noOcclusion().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MISTLETOE = registerBlock("mistletoe",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2.0F).noOcclusion().sound(SoundType.CROP)),ModTabs.MAIDENS_BLOCKS_GROUP);







    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModTabs.MAIDENS_BLOCKS_GROUP)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}