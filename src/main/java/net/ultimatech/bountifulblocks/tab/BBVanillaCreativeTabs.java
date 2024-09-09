package net.ultimatech.bountifulblocks.tab;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.ultimatech.bountifulblocks.BBDependencyManager;
import net.ultimatech.bountifulblocks.block.BBBlocks;

public class BBVanillaCreativeTabs {

    private static void addToTab_BUILDING_BLOCKS(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

            event.accept(BBBlocks.STONE_WALL);

            event.accept(BBBlocks.CHISELED_SMOOTH_STONE);
            event.accept(BBBlocks.SMOOTH_STONE_STAIRS);
            event.accept(BBBlocks.SMOOTH_STONE_WALL);
            event.accept(BBBlocks.SMOOTH_STONE_BRICKS);
            event.accept(BBBlocks.SMOOTH_STONE_BRICK_STAIRS);
            event.accept(BBBlocks.SMOOTH_STONE_BRICK_SLAB);
            event.accept(BBBlocks.SMOOTH_STONE_BRICK_WALL);
            event.accept(BBBlocks.SMOOTH_STONE_TILES);
            event.accept(BBBlocks.SMOOTH_STONE_TILE_STAIRS);
            event.accept(BBBlocks.SMOOTH_STONE_TILE_SLAB);
            event.accept(BBBlocks.SMOOTH_STONE_TILE_WALL);

            event.accept(BBBlocks.CARVED_OAK_PLANKS);
            event.accept(BBBlocks.CARVED_SPRUCE_PLANKS);
            event.accept(BBBlocks.CARVED_BIRCH_PLANKS);
            event.accept(BBBlocks.CARVED_JUNGLE_PLANKS);
            event.accept(BBBlocks.CARVED_ACACIA_PLANKS);
            event.accept(BBBlocks.CARVED_DARK_OAK_PLANKS);
            event.accept(BBBlocks.CARVED_MANGROVE_PLANKS);
            event.accept(BBBlocks.CARVED_CHERRY_PLANKS);
            event.accept(BBBlocks.CARVED_BAMBOO_PLANKS);
            event.accept(BBBlocks.CARVED_CRIMSON_PLANKS);
            event.accept(BBBlocks.CARVED_WARPED_PLANKS);

            event.accept(BBBlocks.OAK_FLOORING);
            event.accept(BBBlocks.OAK_FLOORING_STAIRS);
            event.accept(BBBlocks.OAK_FLOORING_SLAB);
            event.accept(BBBlocks.SPRUCE_FLOORING);
            event.accept(BBBlocks.SPRUCE_FLOORING_STAIRS);
            event.accept(BBBlocks.SPRUCE_FLOORING_SLAB);
            event.accept(BBBlocks.BIRCH_FLOORING);
            event.accept(BBBlocks.BIRCH_FLOORING_STAIRS);
            event.accept(BBBlocks.BIRCH_FLOORING_SLAB);
            event.accept(BBBlocks.JUNGLE_FLOORING);
            event.accept(BBBlocks.JUNGLE_FLOORING_STAIRS);
            event.accept(BBBlocks.JUNGLE_FLOORING_SLAB);
            event.accept(BBBlocks.ACACIA_FLOORING);
            event.accept(BBBlocks.ACACIA_FLOORING_STAIRS);
            event.accept(BBBlocks.ACACIA_FLOORING_SLAB);
            event.accept(BBBlocks.DARK_OAK_FLOORING);
            event.accept(BBBlocks.DARK_OAK_FLOORING_STAIRS);
            event.accept(BBBlocks.DARK_OAK_FLOORING_SLAB);
            event.accept(BBBlocks.MANGROVE_FLOORING);
            event.accept(BBBlocks.MANGROVE_FLOORING_STAIRS);
            event.accept(BBBlocks.MANGROVE_FLOORING_SLAB);
            event.accept(BBBlocks.CHERRY_FLOORING);
            event.accept(BBBlocks.CHERRY_FLOORING_STAIRS);
            event.accept(BBBlocks.CHERRY_FLOORING_SLAB);
            //event.accept(BBBlocks.BAMBOO_FLOORING_STAIRS);
            //event.accept(BBBlocks.BAMBOO_FLOORING_SLAB);
            event.accept(BBBlocks.CRIMSON_FLOORING);
            event.accept(BBBlocks.CRIMSON_FLOORING_STAIRS);
            event.accept(BBBlocks.CRIMSON_FLOORING_SLAB);
            event.accept(BBBlocks.WARPED_FLOORING);
            event.accept(BBBlocks.WARPED_FLOORING_STAIRS);
            event.accept(BBBlocks.WARPED_FLOORING_SLAB);

            event.accept(BBBlocks.POLISHED_COBBLESTONE);
            event.accept(BBBlocks.POLISHED_COBBLESTONE_STAIRS);
            event.accept(BBBlocks.POLISHED_COBBLESTONE_SLAB);
            event.accept(BBBlocks.POLISHED_COBBLESTONE_WALL);
            event.accept(BBBlocks.COBBLESTONE_BRICKS);
            event.accept(BBBlocks.COBBLESTONE_BRICK_STAIRS);
            event.accept(BBBlocks.COBBLESTONE_BRICK_SLAB);
            event.accept(BBBlocks.COBBLESTONE_BRICK_WALL);
            event.accept(BBBlocks.COBBLESTONE_TILES);
            event.accept(BBBlocks.COBBLESTONE_TILE_STAIRS);
            event.accept(BBBlocks.COBBLESTONE_TILE_SLAB);
            event.accept(BBBlocks.COBBLESTONE_TILE_WALL);

            event.accept(BBBlocks.POLISHED_MOSSY_COBBLESTONE);
            event.accept(BBBlocks.POLISHED_MOSSY_COBBLESTONE_STAIRS);
            event.accept(BBBlocks.POLISHED_MOSSY_COBBLESTONE_SLAB);
            event.accept(BBBlocks.POLISHED_MOSSY_COBBLESTONE_WALL);
            event.accept(BBBlocks.MOSSY_COBBLESTONE_BRICKS);
            event.accept(BBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
            event.accept(BBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB);
            event.accept(BBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);
            event.accept(BBBlocks.MOSSY_COBBLESTONE_TILES);
            event.accept(BBBlocks.MOSSY_COBBLESTONE_TILE_STAIRS);
            event.accept(BBBlocks.MOSSY_COBBLESTONE_TILE_SLAB);
            event.accept(BBBlocks.MOSSY_COBBLESTONE_TILE_WALL);

            event.accept(BBBlocks.STONE_TILES);
            event.accept(BBBlocks.STONE_TILE_STAIRS);
            event.accept(BBBlocks.STONE_TILE_SLAB);
            event.accept(BBBlocks.STONE_TILE_WALL);

            event.accept(BBBlocks.MOSSY_STONE_TILES);
            event.accept(BBBlocks.MOSSY_STONE_TILE_STAIRS);
            event.accept(BBBlocks.MOSSY_STONE_TILE_SLAB);
            event.accept(BBBlocks.MOSSY_STONE_TILE_WALL);

            event.accept(BBBlocks.MOSSY_CRACKED_STONE_BRICKS);
            event.accept(BBBlocks.MOSSY_CHISELED_STONE_BRICKS);

            event.accept(BBBlocks.POLISHED_GRANITE_WALL);
            event.accept(BBBlocks.CHISELED_GRANITE);
            event.accept(BBBlocks.GRANITE_BRICKS);
            event.accept(BBBlocks.GRANITE_BRICK_STAIRS);
            event.accept(BBBlocks.GRANITE_BRICK_SLAB);
            event.accept(BBBlocks.GRANITE_BRICK_WALL);
            event.accept(BBBlocks.GRANITE_TILES);
            event.accept(BBBlocks.GRANITE_TILE_STAIRS);
            event.accept(BBBlocks.GRANITE_TILE_SLAB);
            event.accept(BBBlocks.GRANITE_TILE_WALL);

            event.accept(BBBlocks.POLISHED_DIORITE_WALL);
            event.accept(BBBlocks.CHISELED_DIORITE);
            event.accept(BBBlocks.DIORITE_BRICKS);
            event.accept(BBBlocks.DIORITE_BRICK_STAIRS);
            event.accept(BBBlocks.DIORITE_BRICK_SLAB);
            event.accept(BBBlocks.DIORITE_BRICK_WALL);
            event.accept(BBBlocks.DIORITE_TILES);
            event.accept(BBBlocks.DIORITE_TILE_STAIRS);
            event.accept(BBBlocks.DIORITE_TILE_SLAB);
            event.accept(BBBlocks.DIORITE_TILE_WALL);

            event.accept(BBBlocks.POLISHED_ANDESITE_WALL);
            event.accept(BBBlocks.CHISELED_ANDESITE);
            event.accept(BBBlocks.ANDESITE_BRICKS);
            event.accept(BBBlocks.ANDESITE_BRICK_STAIRS);
            event.accept(BBBlocks.ANDESITE_BRICK_SLAB);
            event.accept(BBBlocks.ANDESITE_BRICK_WALL);
            event.accept(BBBlocks.ANDESITE_TILES);
            event.accept(BBBlocks.ANDESITE_TILE_STAIRS);
            event.accept(BBBlocks.ANDESITE_TILE_SLAB);
            event.accept(BBBlocks.ANDESITE_TILE_WALL);

            event.accept(BBBlocks.DEEPSLATE_STAIRS);
            event.accept(BBBlocks.DEEPSLATE_SLAB);
            event.accept(BBBlocks.DEEPSLATE_WALL);

            event.accept(BBBlocks.TUFF_STAIRS);
            event.accept(BBBlocks.TUFF_SLAB);
            event.accept(BBBlocks.TUFF_WALL);

            event.accept(Blocks.CALCITE);
            event.accept(BBBlocks.CALCITE_STAIRS);
            event.accept(BBBlocks.CALCITE_SLAB);
            event.accept(BBBlocks.CALCITE_WALL);
            event.accept(BBBlocks.CHISELED_CALCITE);
            event.accept(BBBlocks.POLISHED_CALCITE);
            event.accept(BBBlocks.POLISHED_CALCITE_STAIRS);
            event.accept(BBBlocks.POLISHED_CALCITE_SLAB);
            event.accept(BBBlocks.POLISHED_CALCITE_WALL);
            event.accept(BBBlocks.CALCITE_BRICKS);
            event.accept(BBBlocks.CALCITE_BRICK_STAIRS);
            event.accept(BBBlocks.CALCITE_BRICK_SLAB);
            event.accept(BBBlocks.CALCITE_BRICK_WALL);
            event.accept(BBBlocks.CALCITE_TILES);
            event.accept(BBBlocks.CALCITE_TILE_STAIRS);
            event.accept(BBBlocks.CALCITE_TILE_SLAB);
            event.accept(BBBlocks.CALCITE_TILE_WALL);

            event.accept(BBBlocks.PACKED_MUD_STAIRS);
            event.accept(BBBlocks.PACKED_MUD_SLAB);
            event.accept(BBBlocks.PACKED_MUD_WALL);
            event.accept(BBBlocks.MUD_TILES);
            event.accept(BBBlocks.MUD_TILE_STAIRS);
            event.accept(BBBlocks.MUD_TILE_SLAB);
            event.accept(BBBlocks.MUD_TILE_WALL);

            event.accept(BBBlocks.SMOOTH_SANDSTONE_WALL);
            event.accept(BBBlocks.CUT_SANDSTONE_STAIRS);
            event.accept(BBBlocks.CUT_SANDSTONE_WALL);
            event.accept(BBBlocks.SANDSTONE_BRICKS);
            event.accept(BBBlocks.SANDSTONE_BRICK_STAIRS);
            event.accept(BBBlocks.SANDSTONE_BRICK_SLAB);
            event.accept(BBBlocks.SANDSTONE_BRICK_WALL);
            event.accept(BBBlocks.SANDSTONE_TILES);
            event.accept(BBBlocks.SANDSTONE_TILE_STAIRS);
            event.accept(BBBlocks.SANDSTONE_TILE_SLAB);
            event.accept(BBBlocks.SANDSTONE_TILE_WALL);

            event.accept(BBBlocks.SMOOTH_RED_SANDSTONE_WALL);
            event.accept(BBBlocks.CUT_RED_SANDSTONE_STAIRS);
            event.accept(BBBlocks.CUT_RED_SANDSTONE_WALL);
            event.accept(BBBlocks.RED_SANDSTONE_BRICKS);
            event.accept(BBBlocks.RED_SANDSTONE_BRICK_STAIRS);
            event.accept(BBBlocks.RED_SANDSTONE_BRICK_SLAB);
            event.accept(BBBlocks.RED_SANDSTONE_BRICK_WALL);
            event.accept(BBBlocks.RED_SANDSTONE_TILES);
            event.accept(BBBlocks.RED_SANDSTONE_TILE_STAIRS);
            event.accept(BBBlocks.RED_SANDSTONE_TILE_SLAB);
            event.accept(BBBlocks.RED_SANDSTONE_TILE_WALL);

            event.accept(BBBlocks.PRISMARINE_BRICK_WALL);
            event.accept(BBBlocks.DARK_PRISMARINE_WALL);

            event.accept(Blocks.DRIPSTONE_BLOCK);
            event.accept(BBBlocks.DRIPSTONE_STAIRS);
            event.accept(BBBlocks.DRIPSTONE_SLAB);
            event.accept(BBBlocks.DRIPSTONE_WALL);
            event.accept(BBBlocks.POLISHED_DRIPSTONE);
            event.accept(BBBlocks.POLISHED_DRIPSTONE_STAIRS);
            event.accept(BBBlocks.POLISHED_DRIPSTONE_SLAB);
            event.accept(BBBlocks.POLISHED_DRIPSTONE_WALL);
            event.accept(BBBlocks.CHISELED_DRIPSTONE);
            event.accept(BBBlocks.DRIPSTONE_BRICKS);
            event.accept(BBBlocks.DRIPSTONE_BRICK_STAIRS);
            event.accept(BBBlocks.DRIPSTONE_BRICK_SLAB);
            event.accept(BBBlocks.DRIPSTONE_BRICK_WALL);
            event.accept(BBBlocks.DRIPSTONE_TILES);
            event.accept(BBBlocks.DRIPSTONE_TILE_STAIRS);
            event.accept(BBBlocks.DRIPSTONE_TILE_SLAB);
            event.accept(BBBlocks.DRIPSTONE_TILE_WALL);

            event.accept(Blocks.OBSIDIAN);
            event.accept(BBBlocks.CHISELED_OBSIDIAN);
            event.accept(BBBlocks.POLISHED_OBSIDIAN);
            event.accept(BBBlocks.POLISHED_OBSIDIAN_STAIRS);
            event.accept(BBBlocks.POLISHED_OBSIDIAN_SLAB);
            event.accept(BBBlocks.POLISHED_OBSIDIAN_WALL);
            event.accept(BBBlocks.OBSIDIAN_BRICKS);
            event.accept(BBBlocks.OBSIDIAN_BRICK_STAIRS);
            event.accept(BBBlocks.OBSIDIAN_BRICK_SLAB);
            event.accept(BBBlocks.OBSIDIAN_BRICK_WALL);
            event.accept(BBBlocks.OBSIDIAN_TILES);
            event.accept(BBBlocks.OBSIDIAN_TILE_STAIRS);
            event.accept(BBBlocks.OBSIDIAN_TILE_SLAB);
            event.accept(BBBlocks.OBSIDIAN_TILE_WALL);

            /*
            event.accept(Blocks.CRYING_OBSIDIAN);
            event.accept(BBBlocks.CHISELED_CRYING_OBSIDIAN);
            event.accept(BBBlocks.POLISHED_CRYING_OBSIDIAN);
            event.accept(BBBlocks.POLISHED_CRYING_OBSIDIAN_STAIRS);
            event.accept(BBBlocks.POLISHED_CRYING_OBSIDIAN_SLAB);
            event.accept(BBBlocks.POLISHED_CRYING_OBSIDIAN_WALL);
            event.accept(BBBlocks.CRYING_OBSIDIAN_BRICKS);
            event.accept(BBBlocks.CRYING_OBSIDIAN_BRICK_STAIRS);
            event.accept(BBBlocks.CRYING_OBSIDIAN_BRICK_SLAB);
            event.accept(BBBlocks.CRYING_OBSIDIAN_BRICK_WALL);
            event.accept(BBBlocks.CRYING_OBSIDIAN_TILES);
            event.accept(BBBlocks.CRYING_OBSIDIAN_TILE_STAIRS);
            event.accept(BBBlocks.CRYING_OBSIDIAN_TILE_SLAB);
            event.accept(BBBlocks.CRYING_OBSIDIAN_TILE_WALL);
            */

            event.accept(BBBlocks.CRACKED_RED_NETHER_BRICKS);
            event.accept(BBBlocks.CHISELED_RED_NETHER_BRICKS);
            event.accept(BBBlocks.RED_NETHER_BRICK_FENCE);

            event.accept(BBBlocks.END_STONE_STAIRS);
            event.accept(BBBlocks.END_STONE_SLAB);
            event.accept(BBBlocks.END_STONE_WALL);
            event.accept(BBBlocks.CHISELED_END_STONE);
            event.accept(BBBlocks.POLISHED_END_STONE);
            event.accept(BBBlocks.POLISHED_END_STONE_STAIRS);
            event.accept(BBBlocks.POLISHED_END_STONE_SLAB);
            event.accept(BBBlocks.POLISHED_END_STONE_WALL);
            event.accept(BBBlocks.END_STONE_TILES);
            event.accept(BBBlocks.END_STONE_TILE_STAIRS);
            event.accept(BBBlocks.END_STONE_TILE_SLAB);
            event.accept(BBBlocks.END_STONE_TILE_WALL);

            event.accept(BBBlocks.CHISELED_PURPUR);
            event.accept(BBBlocks.POLISHED_PURPUR);
            event.accept(BBBlocks.POLISHED_PURPUR_STAIRS);
            event.accept(BBBlocks.POLISHED_PURPUR_SLAB);
            event.accept(BBBlocks.POLISHED_PURPUR_WALL);
            event.accept(BBBlocks.PURPUR_BRICKS);
            event.accept(BBBlocks.PURPUR_BRICK_STAIRS);
            event.accept(BBBlocks.PURPUR_BRICK_SLAB);
            event.accept(BBBlocks.PURPUR_BRICK_WALL);
            event.accept(BBBlocks.PURPUR_TILE_WALL);

            event.accept(BBBlocks.BLACKSTONE_TILES);
            event.accept(BBBlocks.BLACKSTONE_TILE_STAIRS);
            event.accept(BBBlocks.BLACKSTONE_TILE_SLAB);
            event.accept(BBBlocks.BLACKSTONE_TILE_WALL);

            event.accept(BBBlocks.SMOOTH_BASALT_STAIRS);
            event.accept(BBBlocks.SMOOTH_BASALT_SLAB);
            event.accept(BBBlocks.SMOOTH_BASALT_WALL);
            event.accept(BBBlocks.CHISELED_SMOOTH_BASALT);
            event.accept(BBBlocks.POLISHED_SMOOTH_BASALT);
            event.accept(BBBlocks.POLISHED_SMOOTH_BASALT_STAIRS);
            event.accept(BBBlocks.POLISHED_SMOOTH_BASALT_SLAB);
            event.accept(BBBlocks.POLISHED_SMOOTH_BASALT_WALL);
            event.accept(BBBlocks.SMOOTH_BASALT_BRICKS);
            event.accept(BBBlocks.CRACKED_SMOOTH_BASALT_BRICKS);
            event.accept(BBBlocks.SMOOTH_BASALT_BRICK_STAIRS);
            event.accept(BBBlocks.SMOOTH_BASALT_BRICK_SLAB);
            event.accept(BBBlocks.SMOOTH_BASALT_BRICK_WALL);
            event.accept(BBBlocks.SMOOTH_BASALT_TILES);
            event.accept(BBBlocks.SMOOTH_BASALT_TILE_STAIRS);
            event.accept(BBBlocks.SMOOTH_BASALT_TILE_SLAB);
            event.accept(BBBlocks.SMOOTH_BASALT_TILE_WALL);

            event.accept(BBBlocks.LARGE_CHAIN);

            event.accept(Blocks.SNOW_BLOCK);
            event.accept(BBBlocks.CARVED_SNOW);
            event.accept(BBBlocks.PACKED_SNOW);
            event.accept(BBBlocks.PACKED_SNOW_STAIRS);
            event.accept(BBBlocks.PACKED_SNOW_SLAB);
            event.accept(BBBlocks.PACKED_SNOW_WALL);
            event.accept(BBBlocks.SNOW_BRICKS);
            event.accept(BBBlocks.SNOW_BRICK_STAIRS);
            event.accept(BBBlocks.SNOW_BRICK_SLAB);
            event.accept(BBBlocks.SNOW_BRICK_WALL);

            event.accept(BBBlocks.CHISELED_ICE);
            event.accept(BBBlocks.POLISHED_ICE);
            event.accept(BBBlocks.POLISHED_ICE_STAIRS);
            event.accept(BBBlocks.POLISHED_ICE_SLAB);
            event.accept(BBBlocks.POLISHED_ICE_WALL);
            event.accept(BBBlocks.ICE_BRICKS);
            event.accept(BBBlocks.ICE_BRICK_STAIRS);
            event.accept(BBBlocks.ICE_BRICK_SLAB);
            event.accept(BBBlocks.ICE_BRICK_WALL);
            event.accept(BBBlocks.ICE_TILES);
            event.accept(BBBlocks.ICE_TILE_STAIRS);
            event.accept(BBBlocks.ICE_TILE_SLAB);
            event.accept(BBBlocks.ICE_TILE_WALL);

            event.accept(BBBlocks.CHISELED_PACKED_ICE);
            event.accept(BBBlocks.POLISHED_PACKED_ICE);
            event.accept(BBBlocks.POLISHED_PACKED_ICE_STAIRS);
            event.accept(BBBlocks.POLISHED_PACKED_ICE_SLAB);
            event.accept(BBBlocks.POLISHED_PACKED_ICE_WALL);
            event.accept(BBBlocks.PACKED_ICE_BRICKS);
            event.accept(BBBlocks.PACKED_ICE_BRICK_STAIRS);
            event.accept(BBBlocks.PACKED_ICE_BRICK_SLAB);
            event.accept(BBBlocks.PACKED_ICE_BRICK_WALL);
            event.accept(BBBlocks.PACKED_ICE_TILES);
            event.accept(BBBlocks.PACKED_ICE_TILE_STAIRS);
            event.accept(BBBlocks.PACKED_ICE_TILE_SLAB);
            event.accept(BBBlocks.PACKED_ICE_TILE_WALL);

            event.accept(BBBlocks.CHISELED_BLUE_ICE);
            event.accept(BBBlocks.POLISHED_BLUE_ICE);
            event.accept(BBBlocks.POLISHED_BLUE_ICE_STAIRS);
            event.accept(BBBlocks.POLISHED_BLUE_ICE_SLAB);
            event.accept(BBBlocks.POLISHED_BLUE_ICE_WALL);
            event.accept(BBBlocks.BLUE_ICE_BRICKS);
            event.accept(BBBlocks.BLUE_ICE_BRICK_STAIRS);
            event.accept(BBBlocks.BLUE_ICE_BRICK_SLAB);
            event.accept(BBBlocks.BLUE_ICE_BRICK_WALL);
            event.accept(BBBlocks.BLUE_ICE_TILES);
            event.accept(BBBlocks.BLUE_ICE_TILE_STAIRS);
            event.accept(BBBlocks.BLUE_ICE_TILE_SLAB);
            event.accept(BBBlocks.BLUE_ICE_TILE_WALL);
        }
    }

    private static void addToTab_COLORED_BLOCKS(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {

            event.accept(BBBlocks.WHITE_THREADED_WOOL);
            event.accept(BBBlocks.LIGHT_GRAY_THREADED_WOOL);
            event.accept(BBBlocks.GRAY_THREADED_WOOL);
            event.accept(BBBlocks.BLACK_THREADED_WOOL);
            event.accept(BBBlocks.BROWN_THREADED_WOOL);
            event.accept(BBBlocks.RED_THREADED_WOOL);
            event.accept(BBBlocks.ORANGE_THREADED_WOOL);
            event.accept(BBBlocks.YELLOW_THREADED_WOOL);
            event.accept(BBBlocks.LIME_THREADED_WOOL);
            event.accept(BBBlocks.GREEN_THREADED_WOOL);
            event.accept(BBBlocks.CYAN_THREADED_WOOL);
            event.accept(BBBlocks.LIGHT_BLUE_THREADED_WOOL);
            event.accept(BBBlocks.BLUE_THREADED_WOOL);
            event.accept(BBBlocks.PURPLE_THREADED_WOOL);
            event.accept(BBBlocks.MAGENTA_THREADED_WOOL);
            event.accept(BBBlocks.PINK_THREADED_WOOL);

            event.accept(BBBlocks.WHITE_THREADED_CARPET);
            event.accept(BBBlocks.LIGHT_GRAY_THREADED_CARPET);
            event.accept(BBBlocks.GRAY_THREADED_CARPET);
            event.accept(BBBlocks.BLACK_THREADED_CARPET);
            event.accept(BBBlocks.BROWN_THREADED_CARPET);
            event.accept(BBBlocks.RED_THREADED_CARPET);
            event.accept(BBBlocks.ORANGE_THREADED_CARPET);
            event.accept(BBBlocks.YELLOW_THREADED_CARPET);
            event.accept(BBBlocks.LIME_THREADED_CARPET);
            event.accept(BBBlocks.GREEN_THREADED_CARPET);
            event.accept(BBBlocks.CYAN_THREADED_CARPET);
            event.accept(BBBlocks.LIGHT_BLUE_THREADED_CARPET);
            event.accept(BBBlocks.BLUE_THREADED_CARPET);
            event.accept(BBBlocks.PURPLE_THREADED_CARPET);
            event.accept(BBBlocks.MAGENTA_THREADED_CARPET);
            event.accept(BBBlocks.PINK_THREADED_CARPET);

            event.accept(BBBlocks.TERRACOTTA_STAIRS);
            event.accept(BBBlocks.TERRACOTTA_SLAB);
            event.accept(BBBlocks.TERRACOTTA_WALL);
            event.accept(BBBlocks.TERRACOTTA_BRICKS);
            event.accept(BBBlocks.TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.WHITE_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.WHITE_TERRACOTTA_SLAB);
            event.accept(BBBlocks.WHITE_TERRACOTTA_WALL);
            event.accept(BBBlocks.WHITE_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.WHITE_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.WHITE_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
            event.accept(BBBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
            event.accept(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.GRAY_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.GRAY_TERRACOTTA_SLAB);
            event.accept(BBBlocks.GRAY_TERRACOTTA_WALL);
            event.accept(BBBlocks.GRAY_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.GRAY_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.GRAY_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.BLACK_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.BLACK_TERRACOTTA_SLAB);
            event.accept(BBBlocks.BLACK_TERRACOTTA_WALL);
            event.accept(BBBlocks.BLACK_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.BLACK_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.BLACK_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.BROWN_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.BROWN_TERRACOTTA_SLAB);
            event.accept(BBBlocks.BROWN_TERRACOTTA_WALL);
            event.accept(BBBlocks.BROWN_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.BROWN_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.BROWN_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.RED_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.RED_TERRACOTTA_SLAB);
            event.accept(BBBlocks.RED_TERRACOTTA_WALL);
            event.accept(BBBlocks.RED_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.RED_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.RED_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.RED_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.ORANGE_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.ORANGE_TERRACOTTA_SLAB);
            event.accept(BBBlocks.ORANGE_TERRACOTTA_WALL);
            event.accept(BBBlocks.ORANGE_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.ORANGE_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.ORANGE_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.YELLOW_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.YELLOW_TERRACOTTA_SLAB);
            event.accept(BBBlocks.YELLOW_TERRACOTTA_WALL);
            event.accept(BBBlocks.YELLOW_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.YELLOW_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.YELLOW_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.LIME_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.LIME_TERRACOTTA_SLAB);
            event.accept(BBBlocks.LIME_TERRACOTTA_WALL);
            event.accept(BBBlocks.LIME_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.LIME_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.LIME_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.GREEN_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.GREEN_TERRACOTTA_SLAB);
            event.accept(BBBlocks.GREEN_TERRACOTTA_WALL);
            event.accept(BBBlocks.GREEN_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.GREEN_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.GREEN_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.CYAN_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.CYAN_TERRACOTTA_SLAB);
            event.accept(BBBlocks.CYAN_TERRACOTTA_WALL);
            event.accept(BBBlocks.CYAN_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.CYAN_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.CYAN_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
            event.accept(BBBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
            event.accept(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.BLUE_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.BLUE_TERRACOTTA_SLAB);
            event.accept(BBBlocks.BLUE_TERRACOTTA_WALL);
            event.accept(BBBlocks.BLUE_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.BLUE_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.BLUE_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.PURPLE_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.PURPLE_TERRACOTTA_SLAB);
            event.accept(BBBlocks.PURPLE_TERRACOTTA_WALL);
            event.accept(BBBlocks.PURPLE_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.PURPLE_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.PURPLE_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.MAGENTA_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.MAGENTA_TERRACOTTA_SLAB);
            event.accept(BBBlocks.MAGENTA_TERRACOTTA_WALL);
            event.accept(BBBlocks.MAGENTA_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.PINK_TERRACOTTA_STAIRS);
            event.accept(BBBlocks.PINK_TERRACOTTA_SLAB);
            event.accept(BBBlocks.PINK_TERRACOTTA_WALL);
            event.accept(BBBlocks.PINK_TERRACOTTA_BRICKS);
            event.accept(BBBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
            event.accept(BBBlocks.PINK_TERRACOTTA_BRICK_SLAB);
            event.accept(BBBlocks.PINK_TERRACOTTA_BRICK_WALL);

            event.accept(BBBlocks.WHITE_CONCRETE_STAIRS);
            event.accept(BBBlocks.WHITE_CONCRETE_SLAB);
            event.accept(BBBlocks.WHITE_CONCRETE_WALL);
            event.accept(BBBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
            event.accept(BBBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            event.accept(BBBlocks.LIGHT_GRAY_CONCRETE_WALL);
            event.accept(BBBlocks.GRAY_CONCRETE_STAIRS);
            event.accept(BBBlocks.GRAY_CONCRETE_SLAB);
            event.accept(BBBlocks.GRAY_CONCRETE_WALL);
            event.accept(BBBlocks.BLACK_CONCRETE_STAIRS);
            event.accept(BBBlocks.BLACK_CONCRETE_SLAB);
            event.accept(BBBlocks.BLACK_CONCRETE_WALL);
            event.accept(BBBlocks.BROWN_CONCRETE_STAIRS);
            event.accept(BBBlocks.BROWN_CONCRETE_SLAB);
            event.accept(BBBlocks.BROWN_CONCRETE_WALL);
            event.accept(BBBlocks.RED_CONCRETE_STAIRS);
            event.accept(BBBlocks.RED_CONCRETE_SLAB);
            event.accept(BBBlocks.RED_CONCRETE_WALL);
            event.accept(BBBlocks.ORANGE_CONCRETE_STAIRS);
            event.accept(BBBlocks.ORANGE_CONCRETE_SLAB);
            event.accept(BBBlocks.ORANGE_CONCRETE_WALL);
            event.accept(BBBlocks.YELLOW_CONCRETE_STAIRS);
            event.accept(BBBlocks.YELLOW_CONCRETE_SLAB);
            event.accept(BBBlocks.YELLOW_CONCRETE_WALL);
            event.accept(BBBlocks.LIME_CONCRETE_STAIRS);
            event.accept(BBBlocks.LIME_CONCRETE_SLAB);
            event.accept(BBBlocks.LIME_CONCRETE_WALL);
            event.accept(BBBlocks.GREEN_CONCRETE_STAIRS);
            event.accept(BBBlocks.GREEN_CONCRETE_SLAB);
            event.accept(BBBlocks.GREEN_CONCRETE_WALL);
            event.accept(BBBlocks.CYAN_CONCRETE_STAIRS);
            event.accept(BBBlocks.CYAN_CONCRETE_SLAB);
            event.accept(BBBlocks.CYAN_CONCRETE_WALL);
            event.accept(BBBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            event.accept(BBBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            event.accept(BBBlocks.LIGHT_BLUE_CONCRETE_WALL);
            event.accept(BBBlocks.BLUE_CONCRETE_STAIRS);
            event.accept(BBBlocks.BLUE_CONCRETE_SLAB);
            event.accept(BBBlocks.BLUE_CONCRETE_WALL);
            event.accept(BBBlocks.PURPLE_CONCRETE_STAIRS);
            event.accept(BBBlocks.PURPLE_CONCRETE_SLAB);
            event.accept(BBBlocks.PURPLE_CONCRETE_WALL);
            event.accept(BBBlocks.MAGENTA_CONCRETE_STAIRS);
            event.accept(BBBlocks.MAGENTA_CONCRETE_SLAB);
            event.accept(BBBlocks.MAGENTA_CONCRETE_WALL);
            event.accept(BBBlocks.PINK_CONCRETE_STAIRS);
            event.accept(BBBlocks.PINK_CONCRETE_SLAB);
            event.accept(BBBlocks.PINK_CONCRETE_WALL);

            event.accept(BBBlocks.GLAZED_TERRACOTTA);
        }
    }

    private static void addDuplicatesToTab_FUNCTIONAL(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

            event.accept(BBBlocks.LARGE_CHAIN);

            event.accept(BBBlocks.CHISELED_MUD_BRICKS);
            event.accept(BBBlocks.SMOOTH_MUD);
            event.accept(BBBlocks.SMOOTH_MUD_STAIRS);
            event.accept(BBBlocks.SMOOTH_MUD_SLAB);
            event.accept(BBBlocks.SMOOTH_MUD_WALL);
            event.accept(BBBlocks.SMOOTH_MUD_PRESSURE_PLATE);
            event.accept(BBBlocks.SMOOTH_MUD_BUTTON);
        }
    }

    private static void addToTab_FUNCTIONAL(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

            event.accept(BBBlocks.INFESTED_POLISHED_COBBLESTONE);
            event.accept(BBBlocks.INFESTED_POLISHED_MOSSY_COBBLESTONE);
            event.accept(BBBlocks.INFESTED_MOSSY_COBBLESTONE);
            event.accept(BBBlocks.INFESTED_COBBLESTONE_BRICKS);
            event.accept(BBBlocks.INFESTED_MOSSY_COBBLESTONE_BRICKS);
            event.accept(BBBlocks.INFESTED_COBBLESTONE_TILES);
            event.accept(BBBlocks.INFESTED_MOSSY_COBBLESTONE_TILES);

            event.accept(BBBlocks.INFESTED_MOSSY_CRACKED_STONE_BRICKS);
            event.accept(BBBlocks.INFESTED_MOSSY_CHISELED_STONE_BRICKS);
            event.accept(BBBlocks.INFESTED_STONE_TILES);
            event.accept(BBBlocks.INFESTED_MOSSY_STONE_TILES);
        }
    }

    public static void register(IEventBus modEventBus) {

        modEventBus.addListener(BBVanillaCreativeTabs::addToTab_BUILDING_BLOCKS);
        modEventBus.addListener(BBVanillaCreativeTabs::addToTab_COLORED_BLOCKS);

        if (!BBDependencyManager.isEchoingWildsInstalled()) {
            modEventBus.addListener(BBVanillaCreativeTabs::addDuplicatesToTab_FUNCTIONAL);
        }
        modEventBus.addListener(BBVanillaCreativeTabs::addToTab_FUNCTIONAL);
    }
}
