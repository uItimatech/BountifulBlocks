package net.ultimatech.bountifulblocks.block;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.ultimatech.bountifulblocks.BountifulBlocks;

public class BBBlockSetTypes {

    // ----- BLOCKSET TYPES ----- //
    public static final BlockSetType MUD = registerBlockSetType("mud", BlockSetTypeBuilder.copyOf(BlockSetType.POLISHED_BLACKSTONE).pressurePlateClickOnSound(SoundEvents.BLOCK_MUD_BRICKS_STEP).pressurePlateClickOffSound(SoundEvents.BLOCK_MUD_BRICKS_STEP).buttonClickOnSound(SoundEvents.BLOCK_MUD_BRICKS_STEP).buttonClickOffSound(SoundEvents.BLOCK_MUD_BRICKS_STEP));



    // ----- REGISTRATION ----- //
    public static BlockSetType registerBlockSetType(String name, BlockSetTypeBuilder blockSetTypeBuilder)
    {
        return blockSetTypeBuilder.build(Identifier.of(BountifulBlocks.MOD_ID, name));
    }

    public static void registerBlockSetTypes() {
    }
}
