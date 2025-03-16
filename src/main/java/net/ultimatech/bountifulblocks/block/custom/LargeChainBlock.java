package net.ultimatech.bountifulblocks.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LargeChainBlock extends ChainBlock {

    public LargeChainBlock(BlockBehaviour.Properties settings) {
        super(settings);
    }

    protected static final VoxelShape Y_SHAPE = Block.box(4.5, 0.0, 4.5, 11.5, 16.0, 11.5);
    protected static final VoxelShape Z_SHAPE = Block.box(4.5, 4.5, 0.0, 11.5, 11.5, 16.0);
    protected static final VoxelShape X_SHAPE = Block.box(0.0, 4.5, 4.5, 16.0, 11.5, 11.5);


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext ctx) {
        switch (state.getValue(AXIS)) {
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
