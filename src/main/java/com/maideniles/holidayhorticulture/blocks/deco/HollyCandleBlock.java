package com.maideniles.holidayhorticulture.blocks.deco;

import com.maideniles.holidayhorticulture.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class HollyCandleBlock extends Block {
    public static final BooleanProperty LIT = BooleanProperty.create("lit");


    protected static final VoxelShape SHAPE = Block.box(6.0D, 0.0D, 6.0D, 10.0D, 10.0D, 10.0D);


    public HollyCandleBlock(Properties p_49795_) {
        super(p_49795_);

        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, Boolean.valueOf(false)));

    }

    public VoxelShape getShape(BlockState p_153474_, BlockGetter p_153475_, BlockPos p_153476_, CollisionContext p_153477_) {
        return SHAPE;
    }

    @SuppressWarnings("deprecation")
    @Override
    public RenderShape getRenderShape(BlockState iBlockState) {
        return RenderShape.MODEL;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult pHit) {
        Random random = level.getRandom();


        ItemStack stack = player.getItemInHand(hand);
        double d0 = (double)pos.getX() + 0.625D;
        double d1 = (double)pos.getY() + 0.8D;
        double d2 = (double)pos.getZ() + 0.625D;

        if (!level.isClientSide()) {
            if(stack.getItem() == Items.FLINT_AND_STEEL){
                System.out.println("LIT HOLLY_CANDLE");
                level.setBlock(pos, ModBlocks.HOLLY_CANDLE_LIT.get().defaultBlockState(), 3);
                stack.setDamageValue(1);
                player.getItemInHand(hand).hurtAndBreak(1, player, (p_41303_) -> {
                    p_41303_.broadcastBreakEvent(player.getUsedItemHand());
                });


                return InteractionResult.PASS;

            }


        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_152840_) {
        p_152840_.add( LIT);
    }


    @Override
    public boolean canSurvive(BlockState p_57499_, LevelReader p_57500_, BlockPos p_57501_) {
        return canSupportCenter(p_57500_, p_57501_.below(), Direction.UP);
    }

    @Override
    public BlockState updateShape(BlockState p_57503_, Direction p_57504_, BlockState p_57505_, LevelAccessor p_57506_, BlockPos p_57507_, BlockPos p_57508_) {
        return p_57504_ == Direction.DOWN && !this.canSurvive(p_57503_, p_57506_, p_57507_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_57503_, p_57504_, p_57505_, p_57506_, p_57507_, p_57508_);
    }

    }