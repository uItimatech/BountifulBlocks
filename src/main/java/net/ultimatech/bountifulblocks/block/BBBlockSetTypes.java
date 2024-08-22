package net.ultimatech.bountifulblocks.block;


import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;


public class BBBlockSetTypes {

    // ----- BLOCKSET TYPES ----- //

    // FORMAT: String name, boolean canOpenByHand, SoundType soundType, SoundEvent doorClose, SoundEvent doorOpen, SoundEvent trapdoorClose, SoundEvent trapdoorOpen, SoundEvent pressurePlateClickOff, SoundEvent pressurePlateClickOn, SoundEvent buttonClickOff, SoundEvent buttonClickOn
    public static final BlockSetType MUD = BlockSetType.register(new BlockSetType("mud", true, SoundType.MUD, SoundEvents.MUD_BRICKS_STEP, SoundEvents.MUD_BRICKS_STEP, SoundEvents.MUD_BRICKS_STEP, SoundEvents.MUD_BRICKS_STEP, SoundEvents.MUD_BRICKS_STEP, SoundEvents.MUD_BRICKS_STEP, SoundEvents.MUD_BRICKS_STEP, SoundEvents.MUD_BRICKS_STEP));


    public static void registerBlockSetTypes() {}
}
