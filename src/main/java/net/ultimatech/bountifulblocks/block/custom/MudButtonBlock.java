package net.ultimatech.bountifulblocks.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.enums.BlockFace;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.ultimatech.bountifulblocks.block.BBBlockSetTypes;

public class MudButtonBlock extends ButtonBlock {

    protected static final VoxelShape CEILING_X_SHAPE = Block.createCuboidShape(5.0, 14.0, 5.0, 11.0, 16.0, 11.0);
    protected static final VoxelShape CEILING_Z_SHAPE = Block.createCuboidShape(5.0, 14.0, 5.0, 11.0, 16.0, 11.0);
    protected static final VoxelShape CEILING_X_PRESSED_SHAPE = Block.createCuboidShape(5.0, 15.0, 5.0, 11.0, 16.0, 11.0);
    protected static final VoxelShape CEILING_Z_PRESSED_SHAPE = Block.createCuboidShape(5.0, 15.0, 5.0, 11.0, 16.0, 11.0);
    protected static final VoxelShape FLOOR_X_SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 2.0, 11.0);
    protected static final VoxelShape FLOOR_Z_SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 2.0, 11.0);
    protected static final VoxelShape FLOOR_X_PRESSED_SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 1.0, 11.0);
    protected static final VoxelShape FLOOR_Z_PRESSED_SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 1.0, 11.0);
    protected static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(5.0, 5.0, 14.0, 11.0, 11.0, 16.0);
    protected static final VoxelShape NORTH_PRESSED_SHAPE = Block.createCuboidShape(5.0, 5.0, 15.0, 11.0, 11.0, 16.0);
    protected static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(5.0, 5.0, 0.0, 11.0, 11.0, 2.0);
    protected static final VoxelShape SOUTH_PRESSED_SHAPE = Block.createCuboidShape(5.0, 5.0, 0.0, 11.0, 11.0, 1.0);
    protected static final VoxelShape WEST_SHAPE = Block.createCuboidShape(14.0, 5.0, 5.0, 16.0, 11.0, 11.0);
    protected static final VoxelShape WEST_PRESSED_SHAPE = Block.createCuboidShape(15.0, 5.0, 5.0, 16.0, 11.0, 11.0);
    protected static final VoxelShape EAST_SHAPE = Block.createCuboidShape(0.0, 5.0, 5.0, 2.0, 11.0, 11.0);
    protected static final VoxelShape EAST_PRESSED_SHAPE = Block.createCuboidShape(0.0, 5.0, 5.0, 1.0, 11.0, 11.0);

    public MudButtonBlock(Settings settings) {
        super(BBBlockSetTypes.MUD, 60, settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        boolean bl = state.get(POWERED);
        switch ((BlockFace)state.get(FACE)) {
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
