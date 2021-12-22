package com.maideniles.holidayhorticulture.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class ModTabs {

    public static final CreativeModeTab MAIDENS_BLOCKS_GROUP = new CreativeModeTab("maidens_blocks_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.SPORE_BLOSSOM);
        }
    };

    public static final CreativeModeTab MAIDENS_ITEMS_GROUP = new CreativeModeTab("maidens_items_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.BONE_MEAL);
        }
    };

}