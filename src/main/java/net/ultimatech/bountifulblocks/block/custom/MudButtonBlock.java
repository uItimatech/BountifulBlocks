package net.ultimatech.bountifulblocks.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.ultimatech.bountifulblocks.block.BBBlockSetTypes;

public class MudButtonBlock extends ButtonBlock {

    protected static final VoxelShape CEILING_X_SHAPE = Block.box(5.0, 14.0, 5.0, 11.0, 16.0, 11.0);
    protected static final VoxelShape CEILING_Z_SHAPE = Block.box(5.0, 14.0, 5.0, 11.0, 16.0, 11.0);
    protected static final VoxelShape CEILING_X_PRESSED_SHAPE = Block.box(5.0, 15.0, 5.0, 11.0, 16.0, 11.0);
    protected static final VoxelShape CEILING_Z_PRESSED_SHAPE = Block.box(5.0, 15.0, 5.0, 11.0, 16.0, 11.0);
    protected static final VoxelShape FLOOR_X_SHAPE = Block.box(5.0, 0.0, 5.0, 11.0, 2.0, 11.0);
    protected static final VoxelShape FLOOR_Z_SHAPE = Block.box(5.0, 0.0, 5.0, 11.0, 2.0, 11.0);
    protected static final VoxelShape FLOOR_X_PRESSED_SHAPE = Block.box(5.0, 0.0, 5.0, 11.0, 1.0, 11.0);
    protected static final VoxelShape FLOOR_Z_PRESSED_SHAPE = Block.box(5.0, 0.0, 5.0, 11.0, 1.0, 11.0);
    protected static final VoxelShape NORTH_SHAPE = Block.box(5.0, 5.0, 14.0, 11.0, 11.0, 16.0);
    protected static final VoxelShape NORTH_PRESSED_SHAPE = Block.box(5.0, 5.0, 15.0, 11.0, 11.0, 16.0);
    protected static final VoxelShape SOUTH_SHAPE = Block.box(5.0, 5.0, 0.0, 11.0, 11.0, 2.0);
    protected static final VoxelShape SOUTH_PRESSED_SHAPE = Block.box(5.0, 5.0, 0.0, 11.0, 11.0, 1.0);
    protected static final VoxelShape WEST_SHAPE = Block.box(14.0, 5.0, 5.0, 16.0, 11.0, 11.0);
    protected static final VoxelShape WEST_PRESSED_SHAPE = Block.box(15.0, 5.0, 5.0, 16.0, 11.0, 11.0);
    protected static final VoxelShape EAST_SHAPE = Block.box(0.0, 5.0, 5.0, 2.0, 11.0, 11.0);
    protected static final VoxelShape EAST_PRESSED_SHAPE = Block.box(0.0, 5.0, 5.0, 1.0, 11.0, 11.0);

    public MudButtonBlock(BlockBehaviour.Properties settings) {
        super(settings, BBBlockSetTypes.MUD, 60, false);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext ctx) {

        Direction direction = state.getValue(FACING);
        boolean bl = state.getValue(POWERED);
        switch (state.getValue(FACE)) {
            case FLOOR: {
                if (direction.getAxis() == Direction.Axis.X) {
                    return bl ? FLOOR_X_PRESSED_SHAPE : FLOOR_X_SHAPE;
                }
                return bl ? FLOOR_Z_PRESSED_SHAPE : FLOOR_Z_SHAPE;
            }
            case WALL: {
                return switch (direction) {
                    default -> throw new IncompatibleClassChangeError();
                    case EAST -> {
                        if (bl) {
                            yield EAST_PRESSED_SHAPE;
                        }
                        yield EAST_SHAPE;
                    }
                    case WEST -> {
                        if (bl) {
                            yield WEST_PRESSED_SHAPE;
                        }
                        yield WEST_SHAPE;
                    }
                    case SOUTH -> {
                        if (bl) {
                            yield SOUTH_PRESSED_SHAPE;
                        }
                        yield SOUTH_SHAPE;
                    }
                    case NORTH, UP, DOWN -> bl ? NORTH_PRESSED_SHAPE : NORTH_SHAPE;
                };
            }
        }
        if (direction.getAxis() == Direction.Axis.X) {
            return bl ? CEILING_X_PRESSED_SHAPE : CEILING_X_SHAPE;
        }
        return bl ? CEILING_Z_PRESSED_SHAPE : CEILING_Z_SHAPE;
    }
}
