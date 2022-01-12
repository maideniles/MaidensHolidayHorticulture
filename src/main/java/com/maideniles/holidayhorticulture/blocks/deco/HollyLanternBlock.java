package com.maideniles.holidayhorticulture.blocks.deco;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HollyLanternBlock extends FaceAttachedHorizontalDirectionalBlock {

    protected static final VoxelShape AABB = Shapes.or(Block.box(5.0D, 1.0D, 5.0D, 11.0D, 8.0D, 11.0D), Block.box(6.0D, 8.0D, 6.0D, 10.0D, 10.0D, 10.0D));


    public HollyLanternBlock(Properties properties) {
        super(properties);
        }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_51101_) {
        p_51101_.add(FACING, FACE);
    }

    @Override
    public boolean canSurvive(BlockState p_153479_, LevelReader p_153480_, BlockPos p_153481_) {
        Direction direction = getConnectedDirection(p_153479_).getOpposite();
        return Block.canSupportCenter(p_153480_, p_153481_.relative(direction), direction.getOpposite());
    }

    public VoxelShape getShape(BlockState p_153474_, BlockGetter p_153475_, BlockPos p_153476_, CollisionContext p_153477_) {
        return AABB;
    }
}
