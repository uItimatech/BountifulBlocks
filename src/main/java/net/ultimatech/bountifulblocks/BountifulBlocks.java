package net.ultimatech.bountifulblocks;

import com.google.common.collect.ImmutableMap;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.ultimatech.bountifulblocks.block.BBBlockSetTypes;
import net.ultimatech.bountifulblocks.block.BBBlocks;
import net.ultimatech.bountifulblocks.block.entity.BBBlockEntities;
import net.ultimatech.bountifulblocks.item.BBItems;
import net.ultimatech.bountifulblocks.tab.BBVanillaCreativeTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Unique;

import java.util.Map;

public class
BountifulBlocks implements ModInitializer {

	public static final String MOD_ID = "bountifulblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	public static final Map<Block,Block> CARVABLE_PLANKS = ImmutableMap.<Block,Block>builder()
			.put(Blocks.OAK_PLANKS, BBBlocks.CARVED_OAK_PLANKS)
			.put(Blocks.SPRUCE_PLANKS, BBBlocks.CARVED_SPRUCE_PLANKS)
			.put(Blocks.BIRCH_PLANKS, BBBlocks.CARVED_BIRCH_PLANKS)
			.put(Blocks.JUNGLE_PLANKS, BBBlocks.CARVED_JUNGLE_PLANKS)
			.put(Blocks.ACACIA_PLANKS, BBBlocks.CARVED_ACACIA_PLANKS)
			.put(Blocks.DARK_OAK_PLANKS, BBBlocks.CARVED_DARK_OAK_PLANKS)
			.put(Blocks.CHERRY_PLANKS, BBBlocks.CARVED_CHERRY_PLANKS)
			.put(Blocks.MANGROVE_PLANKS, BBBlocks.CARVED_MANGROVE_PLANKS)
			.put(Blocks.BAMBOO_PLANKS, BBBlocks.CARVED_BAMBOO_PLANKS)
			.put(Blocks.CRIMSON_PLANKS, BBBlocks.CARVED_CRIMSON_PLANKS)
			.put(Blocks.WARPED_PLANKS, BBBlocks.CARVED_WARPED_PLANKS)
			.build();



	@Override
	public void onInitialize() {

		BBBlockSetTypes.registerBlockSetTypes();

		BBBlocks.registerBlocks();
		BBItems.registerItems();

		BBBlockEntities.registerBlockEntities();

		BBVanillaCreativeTabs.registerTabs();

		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CARVED_OAK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CARVED_SPRUCE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CARVED_BIRCH_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CARVED_JUNGLE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CARVED_ACACIA_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CARVED_DARK_OAK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CARVED_MANGROVE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CARVED_CHERRY_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CARVED_BAMBOO_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CARVED_CRIMSON_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CARVED_WARPED_PLANKS, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.OAK_FLOORING, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.SPRUCE_FLOORING, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.BIRCH_FLOORING, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.JUNGLE_FLOORING, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.ACACIA_FLOORING, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.DARK_OAK_FLOORING, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.MANGROVE_FLOORING, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CHERRY_FLOORING, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CRIMSON_FLOORING, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.WARPED_FLOORING, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.OAK_FLOORING_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.SPRUCE_FLOORING_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.BIRCH_FLOORING_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.JUNGLE_FLOORING_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.ACACIA_FLOORING_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.DARK_OAK_FLOORING_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.MANGROVE_FLOORING_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CHERRY_FLOORING_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.BAMBOO_FLOORING_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CRIMSON_FLOORING_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.WARPED_FLOORING_STAIRS, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.OAK_FLOORING_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.SPRUCE_FLOORING_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.BIRCH_FLOORING_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.JUNGLE_FLOORING_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.ACACIA_FLOORING_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.DARK_OAK_FLOORING_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.MANGROVE_FLOORING_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CHERRY_FLOORING_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.BAMBOO_FLOORING_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CRIMSON_FLOORING_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.WARPED_FLOORING_SLAB, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.WHITE_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.LIGHT_GRAY_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.GRAY_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.BLACK_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.BROWN_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.RED_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.ORANGE_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.YELLOW_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.LIME_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.GREEN_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CYAN_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.LIGHT_BLUE_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.BLUE_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.PURPLE_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.MAGENTA_THREADED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.PINK_THREADED_WOOL, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.WHITE_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.LIGHT_GRAY_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.GRAY_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.BLACK_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.BROWN_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.RED_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.ORANGE_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.YELLOW_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.LIME_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.GREEN_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.CYAN_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.LIGHT_BLUE_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.BLUE_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.PURPLE_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.MAGENTA_THREADED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BBBlocks.PINK_THREADED_CARPET, 30, 60);



		LOGGER.info(MOD_ID + " mod initialized.");
	}
}