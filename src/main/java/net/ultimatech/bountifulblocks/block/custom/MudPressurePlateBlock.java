package net.ultimatech.bountifulblocks.block.custom;

import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.ultimatech.bountifulblocks.block.BBBlockSetTypes;

public class MudPressurePlateBlock extends PressurePlateBlock {
    public MudPressurePlateBlock(BlockBehaviour.Properties settings) {
        super(Sensitivity.MOBS, settings, BBBlockSetTypes.MUD);
    }

    @Override
    protected int getPressedTime() {
        return 60;
    }
}
