package net.ultimatech.bountifulblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LargeChainBlock extends ChainBlock {
    public LargeChainBlock(Settings settings) {
        super(settings);
    }

    protected static final VoxelShape Y_SHAPE = Block.createCuboidShape(4.5, 0.0, 4.5, 11.5, 16.0, 11.5);
    protected static final VoxelShape Z_SHAPE = Block.createCuboidShape(4.5, 4.5, 0.0, 11.5, 11.5, 16.0);
    protected static final VoxelShape X_SHAPE = Block.createCuboidShape(0.0, 4.5, 4.5, 16.0, 11.5, 11.5);


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(AXIS)) {
            default: {
                return X_SHAPE;
            }
            case Z: {
                return Z_SHAPE;
            }
            case Y:
        }
        return Y_SHAPE;
    }
}
