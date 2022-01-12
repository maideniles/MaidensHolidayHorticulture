package com.maideniles.holidayhorticulture.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class ModTabs {

    public static final CreativeModeTab HH_GROUP = new CreativeModeTab("hh_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.AMARYLLIS.get());
        }
    };



}