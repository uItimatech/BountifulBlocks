package net.ultimatech.bountifulblocks.block.custom;

import com.mojang.serialization.MapCodec;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import net.minecraft.world.level.block.state.StateDefinition;
import org.jetbrains.annotations.Nullable;

public class BBHorizontalDirectionalBlock extends HorizontalDirectionalBlock {


    public static final MapCodec<BBHorizontalDirectionalBlock> CODEC = simpleCodec(BBHorizontalDirectionalBlock::new);

    @Override
    public MapCodec<BBHorizontalDirectionalBlock> codec() {
        return CODEC;
    }


    public BBHorizontalDirectionalBlock(BlockBehaviour.Properties settings) {
        super(settings);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }
}
