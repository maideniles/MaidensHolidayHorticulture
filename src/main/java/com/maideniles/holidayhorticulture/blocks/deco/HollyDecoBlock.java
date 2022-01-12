package com.maideniles.holidayhorticulture.blocks.deco;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HollyDecoBlock extends FaceAttachedHorizontalDirectionalBlock {
        protected static final VoxelShape EAST_AABB = Block.box(0.0D, 4.0D, 3.0D, 3.0D, 14.0D, 13.0D);
    protected static final VoxelShape WEST_AABB = Block.box(12.0D, 4.0D, 3.0D, 16.0D, 14.0D, 13.0D);
    protected static final VoxelShape SOUTH_AABB = Block.box(3.0D, 4.0D, 0.0D, 13.0D, 14.0D, 3.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(3.0D, 4.0D, 12.0D, 13.0D, 14.0D, 16.0D);
    protected static final VoxelShape UP_AABB = Block.box(3.0D, 10.0D, 3.0D, 13.0D, 16.0D, 13.0D);
    protected static final VoxelShape DOWN_AABB = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);


    public HollyDecoBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.FLOOR));

    }
    public VoxelShape getShape(BlockState state, BlockGetter p_57511_, BlockPos p_57512_, CollisionContext p_57513_){
        Direction direction = state.getValue(FACING);
        switch(state.getValue(FACE)) {
            case FLOOR:
                if (direction != Direction.NORTH && direction != Direction.SOUTH) {
                    return DOWN_AABB;
                }

                return DOWN_AABB;
            case WALL:
                if (direction == Direction.NORTH) {
                    return NORTH_AABB;
                } else if (direction == Direction.SOUTH) {
                    return SOUTH_AABB;
                } else {
                    if (direction == Direction.EAST) {
                        return EAST_AABB;
                    }

                    return WEST_AABB;
                }
            case CEILING:
                if (direction != Direction.NORTH && direction != Direction.SOUTH) {
                    return UP_AABB;
                }

                return UP_AABB;
            default:
                return DOWN_AABB;
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_51101_) {
        p_51101_.add(FACING,FACE);
    }






}
