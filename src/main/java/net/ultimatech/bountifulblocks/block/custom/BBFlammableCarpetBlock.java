package net.ultimatech.bountifulblocks.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.state.BlockState;

public class BBFlammableCarpetBlock extends CarpetBlock {

	private final int burn;
	private final int spread;

	public BBFlammableCarpetBlock(Properties properties, int burn, int spread) {
		super(properties);
		this.burn = burn;
		this.spread = spread;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
		return burn;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
		return spread;
	}
}
