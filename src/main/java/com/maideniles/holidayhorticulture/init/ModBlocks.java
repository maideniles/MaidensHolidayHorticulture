package com.maideniles.holidayhorticulture.init;

import com.maideniles.holidayhorticulture.HolidayHorticulture;
import com.maideniles.holidayhorticulture.blocks.deco.*;
import com.maideniles.holidayhorticulture.blocks.flowers.ChristmasCactusBlock;
import com.maideniles.holidayhorticulture.blocks.flowers.HHFlowerBlock;
import com.maideniles.holidayhorticulture.world.gen.MistletoeBirch;
import com.maideniles.holidayhorticulture.world.gen.MistletoeOak;
import com.maideniles.holidayhorticulture.world.gen.YewTree;
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
            () -> new ChristmasCactusBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().instabreak().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> POINSETTIA_PLANT = registerBlock("poinsettia_plant",
            () -> new HHFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().instabreak().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> POINSETTIA_PLANT_WHITE = registerBlock("poinsettia_plant_white",
            () -> new HHFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().instabreak().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> CHRISTMAS_ROSE = registerBlock("christmas_rose",
            () -> new HHFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().instabreak().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> AMARYLLIS = registerBlock("amaryllis",
            () -> new HHFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().instabreak().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> WINTERGREEN = registerBlock("wintergreen",
            () -> new HHFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().instabreak().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> YULETIDE_CAMELLIA = registerBlock("camellia",
            () -> new TallFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().instabreak().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> WINTERBERRY = registerBlock("winterberry",
            () -> new HHFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().instabreak().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> SNOWDROP = registerBlock("snowdrop",
            () -> new HHFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().instabreak().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> PAPERWHITE = registerBlock("paperwhite",
            () -> new HHFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().noCollission().instabreak().sound(SoundType.CROP)),ModTabs.HH_GROUP);


    //POTTED PLANTS//

    public static final RegistryObject<Block> POINSETTIA_POTTED_PLANT = registerBlock("poinsettia_potted_plant",
            () -> new FlowerPotBlock(POINSETTIA_PLANT.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)),null);

    public static final RegistryObject<Block> POINSETTIA_POTTED_PLANT_WHITE = registerBlock("poinsettia_potted_plant_white",
            () -> new FlowerPotBlock(POINSETTIA_PLANT_WHITE.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)),null);

    public static final RegistryObject<Block> CHRISTMAS_ROSE_POTTED = registerBlock("christmas_rose_potted",
            () -> new FlowerPotBlock(CHRISTMAS_ROSE.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)),null);

    public static final RegistryObject<Block> AMARYLLIS_POTTED = registerBlock("amaryllis_potted",
            () -> new FlowerPotBlock(AMARYLLIS.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)),null);

    public static final RegistryObject<Block> WINTERGREEN_POTTED = registerBlock("wintergreen_potted",
            () -> new FlowerPotBlock(WINTERGREEN.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)),null);

    public static final RegistryObject<Block> CAMELLIA_POTTED = registerBlock("camellia_potted",
            () -> new FlowerPotBlock(YULETIDE_CAMELLIA.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)),null);

    public static final RegistryObject<Block> WINTERBERRY_POTTED = registerBlock("winterberry_potted",
            () -> new FlowerPotBlock(WINTERBERRY.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)),null);

    public static final RegistryObject<Block> SNOWDROP_POTTED = registerBlock("snowdrop_potted",
            () -> new FlowerPotBlock(SNOWDROP.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)),null);

    public static final RegistryObject<Block> PAPERWHITE_POTTED = registerBlock("paperwhite_potted",
            () -> new FlowerPotBlock(PAPERWHITE.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)),null);

    public static final RegistryObject<Block> CHRISTMAS_CACTUS_POTTED = registerBlock("christmas_cactus_potted",
            () -> new FlowerPotBlock(CHRISTMAS_CACTUS.get(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().instabreak().sound(SoundType.BONE_BLOCK)),null);


    //LEAVES//

    public static final RegistryObject<Block> YEW_LEAVES = registerBlock("yew_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.5F).noOcclusion().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> POINSETTIA_LEAVES = registerBlock("poinsettia_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.5F).noOcclusion().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> POINSETTIA_WHITE_LEAVES = registerBlock("poinsettia_white_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.5F).noOcclusion().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> MISTLETOE_OAK_LEAVES = registerBlock("mistletoe_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.5F).noOcclusion().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> MISTLETOE_BIRCH_LEAVES = registerBlock("mistletoe_birch_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.5F).noOcclusion().sound(SoundType.CROP)),ModTabs.HH_GROUP);


    //SAPLING FOR MISTLETOE-LADEN TREE//
    public static final RegistryObject<Block> MISTLETOE_OAK_SAPLING = registerBlock("mistletoe_oak_sapling",
            () -> new SaplingBlock(new MistletoeOak(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> MISTLETOE_BIRCH_SAPLING = registerBlock("mistletoe_birch_sapling",
            () -> new SaplingBlock(new MistletoeBirch(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).instabreak().noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.HH_GROUP);
//SAPLING FOR YEW TREE//
public static final RegistryObject<Block> YEW_SAPLING = registerBlock("yew_sapling",
        () -> new SaplingBlock(new YewTree(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),ModTabs.HH_GROUP);



    public static final RegistryObject<Block> HOLLY_LANTERN= registerBlock("holly_lantern",
            () -> new HollyLanternBlock(BlockBehaviour.Properties.of(Material.METAL).strength(0.50F).noOcclusion().sound(SoundType.LANTERN)
                    .lightLevel((p_50828_) -> { return 12; })), ModTabs.HH_GROUP);

    public static final RegistryObject<Block> MISTLETOE_DECO = registerBlock("mistletoe_deco",
            () -> new HangingMistletoeBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).instabreak().noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.HH_GROUP);


    public static final RegistryObject<Block> HOLLY_CANDLE = registerBlock("holly_candle",
            () -> new HollyCandleBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(0.5F).noOcclusion().sound(SoundType.GLASS)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> HOLLY_CANDLE_LIT = registerBlock("holly_candle_lit",
            () -> new HollyCandleBlockLit(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion()
                     .lightLevel((p_50828_) -> { return 12; }).sound(SoundType.GLASS)),null);

    public static final RegistryObject<Block> HOLLY_WREATH = registerBlock("holly_wreath",
            () -> new WreathBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),ModTabs.HH_GROUP);

    public static final RegistryObject<Block> HOLLY_SPRIG = registerBlock("holly_sprig",
            () -> new HollyDecoBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).instabreak().noOcclusion().noCollission().sound(SoundType.CROP)),ModTabs.HH_GROUP);



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
                new Item.Properties().tab(ModTabs.HH_GROUP)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}