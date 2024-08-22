package net.ultimatech.bountifulblocks.misc;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.ultimatech.bountifulblocks.BountifulBlocks;

public class BBTags {

	public static class Items {

		private static TagKey<Item> tag(String name) {
			return ItemTags.create(new ResourceLocation(BountifulBlocks.MOD_ID, name));
		}

		private static TagKey<Item> forgeTag(String name) {
			return ItemTags.create(new ResourceLocation("forge", name));
		}
	}

	public static class Blocks {

		public static final TagKey<Block> NETHER_PORTAL_FRAMES = tag("nether_portal_frames");


		private static TagKey<Block> tag(String name) {
			return BlockTags.create(new ResourceLocation(BountifulBlocks.MOD_ID, name));
		}

		private static TagKey<Block> forgeTag(String name) {
			return BlockTags.create(new ResourceLocation("forge", name));
		}
	}
	}
