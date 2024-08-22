package net.ultimatech.bountifulblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;

public class BBHorizontalFacingBlock extends net.minecraft.block.HorizontalFacingBlock {

    public static final MapCodec<BBHorizontalFacingBlock> CODEC = BBHorizontalFacingBlock.createCodec(BBHorizontalFacingBlock::new);

    public MapCodec<BBHorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    public BBHorizontalFacingBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder< Block, BlockState > builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
}
