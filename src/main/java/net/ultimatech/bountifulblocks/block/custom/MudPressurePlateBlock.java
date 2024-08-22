package net.ultimatech.bountifulblocks.block.custom;

import net.minecraft.block.PressurePlateBlock;
import net.ultimatech.bountifulblocks.block.BBBlockSetTypes;

public class MudPressurePlateBlock extends PressurePlateBlock {
    public MudPressurePlateBlock(Settings settings) {
        super(BBBlockSetTypes.MUD, settings);
    }

    @Override
    protected int getTickRate() {
        return 60;
    }
}
