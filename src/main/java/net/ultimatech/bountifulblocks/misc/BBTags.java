package net.ultimatech.bountifulblocks.misc;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.ultimatech.bountifulblocks.BountifulBlocks;

public class BBTags {

    public static class Blocks {
        public static final TagKey<Block> NETHER_PORTAL_FRAMES =
                createTag("nether_portal_frames");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BountifulBlocks.MOD_ID, name));
        }
    }
}
