package net.ultimatech.bountifulblocks.block;


import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;


public class BBBlockSetTypes {

    // ----- BLOCKSET TYPES ----- //

    public static final BlockSetType MUD = BlockSetType.register(
            new BlockSetType(
                    "mud",
                    true,
                    true,
                    true,
                    BlockSetType.PressurePlateSensitivity.MOBS,
                    SoundType.MUD,
                    SoundEvents.MUD_BRICKS_STEP,
                    SoundEvents.MUD_BRICKS_STEP,
                    SoundEvents.MUD_BRICKS_STEP,
                    SoundEvents.MUD_BRICKS_STEP,
                    SoundEvents.MUD_BRICKS_STEP,
                    SoundEvents.MUD_BRICKS_STEP,
                    SoundEvents.MUD_BRICKS_STEP,
                    SoundEvents.MUD_BRICKS_STEP
            )
    );


    public static void registerBlockSetTypes() {}
}
