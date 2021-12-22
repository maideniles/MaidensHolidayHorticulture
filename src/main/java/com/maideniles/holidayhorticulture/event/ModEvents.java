package com.maideniles.holidayhorticulture.event;

import com.maideniles.holidayhorticulture.HolidayHorticulture;
import com.maideniles.holidayhorticulture.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HolidayHorticulture.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public void flowerPotEvent(final PlayerInteractEvent.RightClickBlock event){
        BlockPos pos =  event.getPos();
        Level level = event.getWorld();
        Block block = event.getWorld().getBlockState(event.getPos()).getBlock();
        InteractionHand hand = event.getHand();
        ItemStack item = event.getPlayer().getItemInHand(hand);

        if(level.isClientSide() && block == Blocks.FLOWER_POT) {



            if(item.equals(new ItemStack(Item.byBlock(ModBlocks.CHRISTMAS_CACTUS.get())))){
                level.setBlock((BlockPos) pos,ModBlocks.CHRISTMAS_CACTUS_POTTED.get().defaultBlockState(),3);
            }

            if(item.equals(new ItemStack(Item.byBlock(ModBlocks.POINSETTIA_PLANT.get())))){
                level.setBlock((BlockPos) pos,ModBlocks.POINSETTIA_POTTED_PLANT.get().defaultBlockState(),3);
            }

            if(item.equals(new ItemStack(Item.byBlock(ModBlocks.POINSETTIA_PLANT_WHITE.get())))){
                level.setBlock((BlockPos) pos,ModBlocks.POINSETTIA_POTTED_PLANT_WHITE.get().defaultBlockState(),3);
            }

            if(item.equals(new ItemStack(Item.byBlock(ModBlocks.YULETIDE_CAMELLIA.get())))){
                level.setBlock((BlockPos) pos,ModBlocks.CAMELLIA_POTTED.get().defaultBlockState(),3);
            }

            if(item.equals(new ItemStack(Item.byBlock(ModBlocks.CHRISTMAS_ROSE.get())))){
                level.setBlock((BlockPos) pos,ModBlocks.CHRISTMAS_ROSE_POTTED.get().defaultBlockState(),3);
            }

            if (item.equals(new ItemStack(Item.byBlock(ModBlocks.AMARYLLIS.get())))) {
                level.setBlock((BlockPos) pos, ModBlocks.AMARYLLIS_POTTED.get().defaultBlockState(), 3);
            }

            if(item.equals(new ItemStack(Item.byBlock(ModBlocks.WINTERGREEN.get())))){
                level.setBlock((BlockPos) pos,ModBlocks.WINTERGREEN_POTTED.get().defaultBlockState(),3);
            }

            if(item.equals(new ItemStack(Item.byBlock(ModBlocks.WINTERBERRY.get())))){
                level.setBlock((BlockPos) pos,ModBlocks.WINTERBERRY_POTTED.get().defaultBlockState(),3);
            }

            if(item.equals(new ItemStack(Item.byBlock(ModBlocks.SNOWDROP.get())))){
                level.setBlock((BlockPos) pos,ModBlocks.SNOWDROP_POTTED.get().defaultBlockState(),3);
            }

            if(item.equals(new ItemStack(Item.byBlock(ModBlocks.PAPERWHITE.get())))){
                level.setBlock((BlockPos) pos,ModBlocks.PAPERWHITE_POTTED.get().defaultBlockState(),3);
            }


        }
    }
}
