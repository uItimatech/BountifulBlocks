package net.ultimatech.bountifulblocks.tab;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.ultimatech.bountifulblocks.BBDependencyManager;
import net.ultimatech.bountifulblocks.block.BBBlocks;

public class BBVanillaCreativeTabs {

    private static void addToTab_BUILDING_BLOCKS(FabricItemGroupEntries entries) {

        entries.add(BBBlocks.STONE_WALL);

        entries.add(BBBlocks.CHISELED_SMOOTH_STONE);
        entries.add(BBBlocks.SMOOTH_STONE_STAIRS);
        entries.add(BBBlocks.SMOOTH_STONE_WALL);
        entries.add(BBBlocks.SMOOTH_STONE_BRICKS);
        entries.add(BBBlocks.SMOOTH_STONE_BRICK_STAIRS);
        entries.add(BBBlocks.SMOOTH_STONE_BRICK_SLAB);
        entries.add(BBBlocks.SMOOTH_STONE_BRICK_WALL);
        entries.add(BBBlocks.SMOOTH_STONE_TILES);
        entries.add(BBBlocks.SMOOTH_STONE_TILE_STAIRS);
        entries.add(BBBlocks.SMOOTH_STONE_TILE_SLAB);
        entries.add(BBBlocks.SMOOTH_STONE_TILE_WALL);

        entries.add(BBBlocks.CARVED_OAK_PLANKS);
        entries.add(BBBlocks.CARVED_SPRUCE_PLANKS);
        entries.add(BBBlocks.CARVED_BIRCH_PLANKS);
        entries.add(BBBlocks.CARVED_JUNGLE_PLANKS);
        entries.add(BBBlocks.CARVED_ACACIA_PLANKS);
        entries.add(BBBlocks.CARVED_DARK_OAK_PLANKS);
        entries.add(BBBlocks.CARVED_MANGROVE_PLANKS);
        entries.add(BBBlocks.CARVED_CHERRY_PLANKS);
        entries.add(BBBlocks.CARVED_BAMBOO_PLANKS);
        entries.add(BBBlocks.CARVED_CRIMSON_PLANKS);
        entries.add(BBBlocks.CARVED_WARPED_PLANKS);

        entries.add(BBBlocks.OAK_FLOORING);
        entries.add(BBBlocks.OAK_FLOORING_STAIRS);
        entries.add(BBBlocks.OAK_FLOORING_SLAB);
        entries.add(BBBlocks.SPRUCE_FLOORING);
        entries.add(BBBlocks.SPRUCE_FLOORING_STAIRS);
        entries.add(BBBlocks.SPRUCE_FLOORING_SLAB);
        entries.add(BBBlocks.BIRCH_FLOORING);
        entries.add(BBBlocks.BIRCH_FLOORING_STAIRS);
        entries.add(BBBlocks.BIRCH_FLOORING_SLAB);
        entries.add(BBBlocks.JUNGLE_FLOORING);
        entries.add(BBBlocks.JUNGLE_FLOORING_STAIRS);
        entries.add(BBBlocks.JUNGLE_FLOORING_SLAB);
        entries.add(BBBlocks.ACACIA_FLOORING);
        entries.add(BBBlocks.ACACIA_FLOORING_STAIRS);
        entries.add(BBBlocks.ACACIA_FLOORING_SLAB);
        entries.add(BBBlocks.DARK_OAK_FLOORING);
        entries.add(BBBlocks.DARK_OAK_FLOORING_STAIRS);
        entries.add(BBBlocks.DARK_OAK_FLOORING_SLAB);
        entries.add(BBBlocks.MANGROVE_FLOORING);
        entries.add(BBBlocks.MANGROVE_FLOORING_STAIRS);
        entries.add(BBBlocks.MANGROVE_FLOORING_SLAB);
        entries.add(BBBlocks.CHERRY_FLOORING);
        entries.add(BBBlocks.CHERRY_FLOORING_STAIRS);
        entries.add(BBBlocks.CHERRY_FLOORING_SLAB);
        entries.add(BBBlocks.BAMBOO_FLOORING_STAIRS);
        entries.add(BBBlocks.BAMBOO_FLOORING_SLAB);
        entries.add(BBBlocks.CRIMSON_FLOORING);
        entries.add(BBBlocks.CRIMSON_FLOORING_STAIRS);
        entries.add(BBBlocks.CRIMSON_FLOORING_SLAB);
        entries.add(BBBlocks.WARPED_FLOORING);
        entries.add(BBBlocks.WARPED_FLOORING_STAIRS);
        entries.add(BBBlocks.WARPED_FLOORING_SLAB);

        entries.add(BBBlocks.POLISHED_COBBLESTONE);
        entries.add(BBBlocks.POLISHED_COBBLESTONE_STAIRS);
        entries.add(BBBlocks.POLISHED_COBBLESTONE_SLAB);
        entries.add(BBBlocks.POLISHED_COBBLESTONE_WALL);
        entries.add(BBBlocks.COBBLESTONE_BRICKS);
        entries.add(BBBlocks.COBBLESTONE_BRICK_STAIRS);
        entries.add(BBBlocks.COBBLESTONE_BRICK_SLAB);
        entries.add(BBBlocks.COBBLESTONE_BRICK_WALL);
        entries.add(BBBlocks.COBBLESTONE_TILES);
        entries.add(BBBlocks.COBBLESTONE_TILE_STAIRS);
        entries.add(BBBlocks.COBBLESTONE_TILE_SLAB);
        entries.add(BBBlocks.COBBLESTONE_TILE_WALL);

        entries.add(BBBlocks.POLISHED_MOSSY_COBBLESTONE);
        entries.add(BBBlocks.POLISHED_MOSSY_COBBLESTONE_STAIRS);
        entries.add(BBBlocks.POLISHED_MOSSY_COBBLESTONE_SLAB);
        entries.add(BBBlocks.POLISHED_MOSSY_COBBLESTONE_WALL);
        entries.add(BBBlocks.MOSSY_COBBLESTONE_BRICKS);
        entries.add(BBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
        entries.add(BBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB);
        entries.add(BBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);
        entries.add(BBBlocks.MOSSY_COBBLESTONE_TILES);
        entries.add(BBBlocks.MOSSY_COBBLESTONE_TILE_STAIRS);
        entries.add(BBBlocks.MOSSY_COBBLESTONE_TILE_SLAB);
        entries.add(BBBlocks.MOSSY_COBBLESTONE_TILE_WALL);

        entries.add(BBBlocks.STONE_TILES);
        entries.add(BBBlocks.STONE_TILE_STAIRS);
        entries.add(BBBlocks.STONE_TILE_SLAB);
        entries.add(BBBlocks.STONE_TILE_WALL);

        entries.add(BBBlocks.MOSSY_STONE_TILES);
        entries.add(BBBlocks.MOSSY_STONE_TILE_STAIRS);
        entries.add(BBBlocks.MOSSY_STONE_TILE_SLAB);
        entries.add(BBBlocks.MOSSY_STONE_TILE_WALL);

        entries.add(BBBlocks.MOSSY_CRACKED_STONE_BRICKS);
        entries.add(BBBlocks.MOSSY_CHISELED_STONE_BRICKS);

        entries.add(BBBlocks.POLISHED_GRANITE_WALL);
        entries.add(BBBlocks.CHISELED_GRANITE);
        entries.add(BBBlocks.GRANITE_BRICKS);
        entries.add(BBBlocks.GRANITE_BRICK_STAIRS);
        entries.add(BBBlocks.GRANITE_BRICK_SLAB);
        entries.add(BBBlocks.GRANITE_BRICK_WALL);
        entries.add(BBBlocks.GRANITE_TILES);
        entries.add(BBBlocks.GRANITE_TILE_STAIRS);
        entries.add(BBBlocks.GRANITE_TILE_SLAB);
        entries.add(BBBlocks.GRANITE_TILE_WALL);

        entries.add(BBBlocks.POLISHED_DIORITE_WALL);
        entries.add(BBBlocks.CHISELED_DIORITE);
        entries.add(BBBlocks.DIORITE_BRICKS);
        entries.add(BBBlocks.DIORITE_BRICK_STAIRS);
        entries.add(BBBlocks.DIORITE_BRICK_SLAB);
        entries.add(BBBlocks.DIORITE_BRICK_WALL);
        entries.add(BBBlocks.DIORITE_TILES);
        entries.add(BBBlocks.DIORITE_TILE_STAIRS);
        entries.add(BBBlocks.DIORITE_TILE_SLAB);
        entries.add(BBBlocks.DIORITE_TILE_WALL);

        entries.add(BBBlocks.POLISHED_ANDESITE_WALL);
        entries.add(BBBlocks.CHISELED_ANDESITE);
        entries.add(BBBlocks.ANDESITE_BRICKS);
        entries.add(BBBlocks.ANDESITE_BRICK_STAIRS);
        entries.add(BBBlocks.ANDESITE_BRICK_SLAB);
        entries.add(BBBlocks.ANDESITE_BRICK_WALL);
        entries.add(BBBlocks.ANDESITE_TILES);
        entries.add(BBBlocks.ANDESITE_TILE_STAIRS);
        entries.add(BBBlocks.ANDESITE_TILE_SLAB);
        entries.add(BBBlocks.ANDESITE_TILE_WALL);

        entries.add(BBBlocks.DEEPSLATE_STAIRS);
        entries.add(BBBlocks.DEEPSLATE_SLAB);
        entries.add(BBBlocks.DEEPSLATE_WALL);

        entries.add(BBBlocks.TUFF_TILES);
        entries.add(BBBlocks.TUFF_TILE_STAIRS);
        entries.add(BBBlocks.TUFF_TILE_SLAB);
        entries.add(BBBlocks.TUFF_TILE_WALL);

        entries.add(Blocks.CALCITE);
        entries.add(BBBlocks.CALCITE_STAIRS);
        entries.add(BBBlocks.CALCITE_SLAB);
        entries.add(BBBlocks.CALCITE_WALL);
        entries.add(BBBlocks.CHISELED_CALCITE);
        entries.add(BBBlocks.POLISHED_CALCITE);
        entries.add(BBBlocks.POLISHED_CALCITE_STAIRS);
        entries.add(BBBlocks.POLISHED_CALCITE_SLAB);
        entries.add(BBBlocks.POLISHED_CALCITE_WALL);
        entries.add(BBBlocks.CALCITE_BRICKS);
        entries.add(BBBlocks.CALCITE_BRICK_STAIRS);
        entries.add(BBBlocks.CALCITE_BRICK_SLAB);
        entries.add(BBBlocks.CALCITE_BRICK_WALL);
        entries.add(BBBlocks.CALCITE_TILES);
        entries.add(BBBlocks.CALCITE_TILE_STAIRS);
        entries.add(BBBlocks.CALCITE_TILE_SLAB);
        entries.add(BBBlocks.CALCITE_TILE_WALL);

        entries.add(BBBlocks.PACKED_MUD_STAIRS);
        entries.add(BBBlocks.PACKED_MUD_SLAB);
        entries.add(BBBlocks.PACKED_MUD_WALL);
        entries.add(BBBlocks.MUD_TILES);
        entries.add(BBBlocks.MUD_TILE_STAIRS);
        entries.add(BBBlocks.MUD_TILE_SLAB);
        entries.add(BBBlocks.MUD_TILE_WALL);

        entries.add(BBBlocks.SMOOTH_SANDSTONE_WALL);
        entries.add(BBBlocks.CUT_SANDSTONE_STAIRS);
        entries.add(BBBlocks.CUT_SANDSTONE_WALL);
        entries.add(BBBlocks.SANDSTONE_BRICKS);
        entries.add(BBBlocks.SANDSTONE_BRICK_STAIRS);
        entries.add(BBBlocks.SANDSTONE_BRICK_SLAB);
        entries.add(BBBlocks.SANDSTONE_BRICK_WALL);
        entries.add(BBBlocks.SANDSTONE_TILES);
        entries.add(BBBlocks.SANDSTONE_TILE_STAIRS);
        entries.add(BBBlocks.SANDSTONE_TILE_SLAB);
        entries.add(BBBlocks.SANDSTONE_TILE_WALL);

        entries.add(BBBlocks.SMOOTH_RED_SANDSTONE_WALL);
        entries.add(BBBlocks.CUT_RED_SANDSTONE_STAIRS);
        entries.add(BBBlocks.CUT_RED_SANDSTONE_WALL);
        entries.add(BBBlocks.RED_SANDSTONE_BRICKS);
        entries.add(BBBlocks.RED_SANDSTONE_BRICK_STAIRS);
        entries.add(BBBlocks.RED_SANDSTONE_BRICK_SLAB);
        entries.add(BBBlocks.RED_SANDSTONE_BRICK_WALL);
        entries.add(BBBlocks.RED_SANDSTONE_TILES);
        entries.add(BBBlocks.RED_SANDSTONE_TILE_STAIRS);
        entries.add(BBBlocks.RED_SANDSTONE_TILE_SLAB);
        entries.add(BBBlocks.RED_SANDSTONE_TILE_WALL);

        entries.add(BBBlocks.PRISMARINE_BRICK_WALL);
        entries.add(BBBlocks.DARK_PRISMARINE_WALL);

        entries.add(Blocks.DRIPSTONE_BLOCK);
        entries.add(BBBlocks.DRIPSTONE_STAIRS);
        entries.add(BBBlocks.DRIPSTONE_SLAB);
        entries.add(BBBlocks.DRIPSTONE_WALL);
        entries.add(BBBlocks.POLISHED_DRIPSTONE);
        entries.add(BBBlocks.POLISHED_DRIPSTONE_STAIRS);
        entries.add(BBBlocks.POLISHED_DRIPSTONE_SLAB);
        entries.add(BBBlocks.POLISHED_DRIPSTONE_WALL);
        entries.add(BBBlocks.CHISELED_DRIPSTONE);
        entries.add(BBBlocks.DRIPSTONE_BRICKS);
        entries.add(BBBlocks.DRIPSTONE_BRICK_STAIRS);
        entries.add(BBBlocks.DRIPSTONE_BRICK_SLAB);
        entries.add(BBBlocks.DRIPSTONE_BRICK_WALL);
        entries.add(BBBlocks.DRIPSTONE_TILES);
        entries.add(BBBlocks.DRIPSTONE_TILE_STAIRS);
        entries.add(BBBlocks.DRIPSTONE_TILE_SLAB);
        entries.add(BBBlocks.DRIPSTONE_TILE_WALL);

        entries.add(Blocks.OBSIDIAN);
        entries.add(BBBlocks.CHISELED_OBSIDIAN);
        entries.add(BBBlocks.POLISHED_OBSIDIAN);
        entries.add(BBBlocks.POLISHED_OBSIDIAN_STAIRS);
        entries.add(BBBlocks.POLISHED_OBSIDIAN_SLAB);
        entries.add(BBBlocks.POLISHED_OBSIDIAN_WALL);
        entries.add(BBBlocks.OBSIDIAN_BRICKS);
        entries.add(BBBlocks.OBSIDIAN_BRICK_STAIRS);
        entries.add(BBBlocks.OBSIDIAN_BRICK_SLAB);
        entries.add(BBBlocks.OBSIDIAN_BRICK_WALL);
        entries.add(BBBlocks.OBSIDIAN_TILES);
        entries.add(BBBlocks.OBSIDIAN_TILE_STAIRS);
        entries.add(BBBlocks.OBSIDIAN_TILE_SLAB);
        entries.add(BBBlocks.OBSIDIAN_TILE_WALL);

        /*
        entries.add(Blocks.CRYING_OBSIDIAN);
        entries.add(BBBlocks.CHISELED_CRYING_OBSIDIAN);
        entries.add(BBBlocks.POLISHED_CRYING_OBSIDIAN);
        entries.add(BBBlocks.POLISHED_CRYING_OBSIDIAN_STAIRS);
        entries.add(BBBlocks.POLISHED_CRYING_OBSIDIAN_SLAB);
        entries.add(BBBlocks.POLISHED_CRYING_OBSIDIAN_WALL);
        entries.add(BBBlocks.CRYING_OBSIDIAN_BRICKS);
        entries.add(BBBlocks.CRYING_OBSIDIAN_BRICK_STAIRS);
        entries.add(BBBlocks.CRYING_OBSIDIAN_BRICK_SLAB);
        entries.add(BBBlocks.CRYING_OBSIDIAN_BRICK_WALL);
        entries.add(BBBlocks.CRYING_OBSIDIAN_TILES);
        entries.add(BBBlocks.CRYING_OBSIDIAN_TILE_STAIRS);
        entries.add(BBBlocks.CRYING_OBSIDIAN_TILE_SLAB);
        entries.add(BBBlocks.CRYING_OBSIDIAN_TILE_WALL);
        */

        entries.add(BBBlocks.CRACKED_RED_NETHER_BRICKS);
        entries.add(BBBlocks.CHISELED_RED_NETHER_BRICKS);
        entries.add(BBBlocks.RED_NETHER_BRICK_FENCE);

        entries.add(BBBlocks.END_STONE_STAIRS);
        entries.add(BBBlocks.END_STONE_SLAB);
        entries.add(BBBlocks.END_STONE_WALL);
        entries.add(BBBlocks.CHISELED_END_STONE);
        entries.add(BBBlocks.POLISHED_END_STONE);
        entries.add(BBBlocks.POLISHED_END_STONE_STAIRS);
        entries.add(BBBlocks.POLISHED_END_STONE_SLAB);
        entries.add(BBBlocks.POLISHED_END_STONE_WALL);
        entries.add(BBBlocks.END_STONE_TILES);
        entries.add(BBBlocks.END_STONE_TILE_STAIRS);
        entries.add(BBBlocks.END_STONE_TILE_SLAB);
        entries.add(BBBlocks.END_STONE_TILE_WALL);

        entries.add(BBBlocks.CHISELED_PURPUR);
        entries.add(BBBlocks.POLISHED_PURPUR);
        entries.add(BBBlocks.POLISHED_PURPUR_STAIRS);
        entries.add(BBBlocks.POLISHED_PURPUR_SLAB);
        entries.add(BBBlocks.POLISHED_PURPUR_WALL);
        entries.add(BBBlocks.PURPUR_BRICKS);
        entries.add(BBBlocks.PURPUR_BRICK_STAIRS);
        entries.add(BBBlocks.PURPUR_BRICK_SLAB);
        entries.add(BBBlocks.PURPUR_BRICK_WALL);
        entries.add(BBBlocks.PURPUR_TILE_WALL);

        entries.add(BBBlocks.BLACKSTONE_TILES);
        entries.add(BBBlocks.BLACKSTONE_TILE_STAIRS);
        entries.add(BBBlocks.BLACKSTONE_TILE_SLAB);
        entries.add(BBBlocks.BLACKSTONE_TILE_WALL);

        entries.add(BBBlocks.SMOOTH_BASALT_STAIRS);
        entries.add(BBBlocks.SMOOTH_BASALT_SLAB);
        entries.add(BBBlocks.SMOOTH_BASALT_WALL);
        entries.add(BBBlocks.CHISELED_SMOOTH_BASALT);
        entries.add(BBBlocks.POLISHED_SMOOTH_BASALT);
        entries.add(BBBlocks.POLISHED_SMOOTH_BASALT_STAIRS);
        entries.add(BBBlocks.POLISHED_SMOOTH_BASALT_SLAB);
        entries.add(BBBlocks.POLISHED_SMOOTH_BASALT_WALL);
        entries.add(BBBlocks.SMOOTH_BASALT_BRICKS);
        entries.add(BBBlocks.CRACKED_SMOOTH_BASALT_BRICKS);
        entries.add(BBBlocks.SMOOTH_BASALT_BRICK_STAIRS);
        entries.add(BBBlocks.SMOOTH_BASALT_BRICK_SLAB);
        entries.add(BBBlocks.SMOOTH_BASALT_BRICK_WALL);
        entries.add(BBBlocks.SMOOTH_BASALT_TILES);
        entries.add(BBBlocks.SMOOTH_BASALT_TILE_STAIRS);
        entries.add(BBBlocks.SMOOTH_BASALT_TILE_SLAB);
        entries.add(BBBlocks.SMOOTH_BASALT_TILE_WALL);

        entries.add(BBBlocks.LARGE_CHAIN);

        entries.add(Blocks.SNOW_BLOCK);
        entries.add(BBBlocks.CARVED_SNOW);
        entries.add(BBBlocks.PACKED_SNOW);
        entries.add(BBBlocks.PACKED_SNOW_STAIRS);
        entries.add(BBBlocks.PACKED_SNOW_SLAB);
        entries.add(BBBlocks.PACKED_SNOW_WALL);
        entries.add(BBBlocks.SNOW_BRICKS);
        entries.add(BBBlocks.SNOW_BRICK_STAIRS);
        entries.add(BBBlocks.SNOW_BRICK_SLAB);
        entries.add(BBBlocks.SNOW_BRICK_WALL);

        entries.add(BBBlocks.CHISELED_ICE);
        entries.add(BBBlocks.POLISHED_ICE);
        entries.add(BBBlocks.POLISHED_ICE_STAIRS);
        entries.add(BBBlocks.POLISHED_ICE_SLAB);
        entries.add(BBBlocks.POLISHED_ICE_WALL);
        entries.add(BBBlocks.ICE_BRICKS);
        entries.add(BBBlocks.ICE_BRICK_STAIRS);
        entries.add(BBBlocks.ICE_BRICK_SLAB);
        entries.add(BBBlocks.ICE_BRICK_WALL);
        entries.add(BBBlocks.ICE_TILES);
        entries.add(BBBlocks.ICE_TILE_STAIRS);
        entries.add(BBBlocks.ICE_TILE_SLAB);
        entries.add(BBBlocks.ICE_TILE_WALL);

        entries.add(BBBlocks.CHISELED_PACKED_ICE);
        entries.add(BBBlocks.POLISHED_PACKED_ICE);
        entries.add(BBBlocks.POLISHED_PACKED_ICE_STAIRS);
        entries.add(BBBlocks.POLISHED_PACKED_ICE_SLAB);
        entries.add(BBBlocks.POLISHED_PACKED_ICE_WALL);
        entries.add(BBBlocks.PACKED_ICE_BRICKS);
        entries.add(BBBlocks.PACKED_ICE_BRICK_STAIRS);
        entries.add(BBBlocks.PACKED_ICE_BRICK_SLAB);
        entries.add(BBBlocks.PACKED_ICE_BRICK_WALL);
        entries.add(BBBlocks.PACKED_ICE_TILES);
        entries.add(BBBlocks.PACKED_ICE_TILE_STAIRS);
        entries.add(BBBlocks.PACKED_ICE_TILE_SLAB);
        entries.add(BBBlocks.PACKED_ICE_TILE_WALL);

        entries.add(BBBlocks.CHISELED_BLUE_ICE);
        entries.add(BBBlocks.POLISHED_BLUE_ICE);
        entries.add(BBBlocks.POLISHED_BLUE_ICE_STAIRS);
        entries.add(BBBlocks.POLISHED_BLUE_ICE_SLAB);
        entries.add(BBBlocks.POLISHED_BLUE_ICE_WALL);
        entries.add(BBBlocks.BLUE_ICE_BRICKS);
        entries.add(BBBlocks.BLUE_ICE_BRICK_STAIRS);
        entries.add(BBBlocks.BLUE_ICE_BRICK_SLAB);
        entries.add(BBBlocks.BLUE_ICE_BRICK_WALL);
        entries.add(BBBlocks.BLUE_ICE_TILES);
        entries.add(BBBlocks.BLUE_ICE_TILE_STAIRS);
        entries.add(BBBlocks.BLUE_ICE_TILE_SLAB);
        entries.add(BBBlocks.BLUE_ICE_TILE_WALL);
    }

    private static void addToTab_COLORED_BLOCKS(FabricItemGroupEntries entries) {

        entries.add(BBBlocks.WHITE_THREADED_WOOL);
        entries.add(BBBlocks.LIGHT_GRAY_THREADED_WOOL);
        entries.add(BBBlocks.GRAY_THREADED_WOOL);
        entries.add(BBBlocks.BLACK_THREADED_WOOL);
        entries.add(BBBlocks.BROWN_THREADED_WOOL);
        entries.add(BBBlocks.RED_THREADED_WOOL);
        entries.add(BBBlocks.ORANGE_THREADED_WOOL);
        entries.add(BBBlocks.YELLOW_THREADED_WOOL);
        entries.add(BBBlocks.LIME_THREADED_WOOL);
        entries.add(BBBlocks.GREEN_THREADED_WOOL);
        entries.add(BBBlocks.CYAN_THREADED_WOOL);
        entries.add(BBBlocks.LIGHT_BLUE_THREADED_WOOL);
        entries.add(BBBlocks.BLUE_THREADED_WOOL);
        entries.add(BBBlocks.PURPLE_THREADED_WOOL);
        entries.add(BBBlocks.MAGENTA_THREADED_WOOL);
        entries.add(BBBlocks.PINK_THREADED_WOOL);

        entries.add(BBBlocks.WHITE_THREADED_CARPET);
        entries.add(BBBlocks.LIGHT_GRAY_THREADED_CARPET);
        entries.add(BBBlocks.GRAY_THREADED_CARPET);
        entries.add(BBBlocks.BLACK_THREADED_CARPET);
        entries.add(BBBlocks.BROWN_THREADED_CARPET);
        entries.add(BBBlocks.RED_THREADED_CARPET);
        entries.add(BBBlocks.ORANGE_THREADED_CARPET);
        entries.add(BBBlocks.YELLOW_THREADED_CARPET);
        entries.add(BBBlocks.LIME_THREADED_CARPET);
        entries.add(BBBlocks.GREEN_THREADED_CARPET);
        entries.add(BBBlocks.CYAN_THREADED_CARPET);
        entries.add(BBBlocks.LIGHT_BLUE_THREADED_CARPET);
        entries.add(BBBlocks.BLUE_THREADED_CARPET);
        entries.add(BBBlocks.PURPLE_THREADED_CARPET);
        entries.add(BBBlocks.MAGENTA_THREADED_CARPET);
        entries.add(BBBlocks.PINK_THREADED_CARPET);

        entries.add(BBBlocks.TERRACOTTA_STAIRS);
        entries.add(BBBlocks.TERRACOTTA_SLAB);
        entries.add(BBBlocks.TERRACOTTA_WALL);
        entries.add(BBBlocks.TERRACOTTA_BRICKS);
        entries.add(BBBlocks.TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.WHITE_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.WHITE_TERRACOTTA_SLAB);
        entries.add(BBBlocks.WHITE_TERRACOTTA_WALL);
        entries.add(BBBlocks.WHITE_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.WHITE_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.WHITE_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        entries.add(BBBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        entries.add(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.GRAY_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.GRAY_TERRACOTTA_SLAB);
        entries.add(BBBlocks.GRAY_TERRACOTTA_WALL);
        entries.add(BBBlocks.GRAY_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.GRAY_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.GRAY_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.BLACK_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.BLACK_TERRACOTTA_SLAB);
        entries.add(BBBlocks.BLACK_TERRACOTTA_WALL);
        entries.add(BBBlocks.BLACK_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.BLACK_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.BLACK_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.BROWN_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.BROWN_TERRACOTTA_SLAB);
        entries.add(BBBlocks.BROWN_TERRACOTTA_WALL);
        entries.add(BBBlocks.BROWN_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.BROWN_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.BROWN_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.RED_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.RED_TERRACOTTA_SLAB);
        entries.add(BBBlocks.RED_TERRACOTTA_WALL);
        entries.add(BBBlocks.RED_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.RED_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.RED_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.RED_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.ORANGE_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.ORANGE_TERRACOTTA_SLAB);
        entries.add(BBBlocks.ORANGE_TERRACOTTA_WALL);
        entries.add(BBBlocks.ORANGE_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.ORANGE_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.ORANGE_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.YELLOW_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.YELLOW_TERRACOTTA_SLAB);
        entries.add(BBBlocks.YELLOW_TERRACOTTA_WALL);
        entries.add(BBBlocks.YELLOW_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.YELLOW_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.YELLOW_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.LIME_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.LIME_TERRACOTTA_SLAB);
        entries.add(BBBlocks.LIME_TERRACOTTA_WALL);
        entries.add(BBBlocks.LIME_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.LIME_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.LIME_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.GREEN_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.GREEN_TERRACOTTA_SLAB);
        entries.add(BBBlocks.GREEN_TERRACOTTA_WALL);
        entries.add(BBBlocks.GREEN_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.GREEN_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.GREEN_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.CYAN_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.CYAN_TERRACOTTA_SLAB);
        entries.add(BBBlocks.CYAN_TERRACOTTA_WALL);
        entries.add(BBBlocks.CYAN_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.CYAN_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.CYAN_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        entries.add(BBBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        entries.add(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.BLUE_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.BLUE_TERRACOTTA_SLAB);
        entries.add(BBBlocks.BLUE_TERRACOTTA_WALL);
        entries.add(BBBlocks.BLUE_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.BLUE_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.BLUE_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.PURPLE_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.PURPLE_TERRACOTTA_SLAB);
        entries.add(BBBlocks.PURPLE_TERRACOTTA_WALL);
        entries.add(BBBlocks.PURPLE_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.PURPLE_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.PURPLE_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.MAGENTA_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.MAGENTA_TERRACOTTA_SLAB);
        entries.add(BBBlocks.MAGENTA_TERRACOTTA_WALL);
        entries.add(BBBlocks.MAGENTA_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.PINK_TERRACOTTA_STAIRS);
        entries.add(BBBlocks.PINK_TERRACOTTA_SLAB);
        entries.add(BBBlocks.PINK_TERRACOTTA_WALL);
        entries.add(BBBlocks.PINK_TERRACOTTA_BRICKS);
        entries.add(BBBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
        entries.add(BBBlocks.PINK_TERRACOTTA_BRICK_SLAB);
        entries.add(BBBlocks.PINK_TERRACOTTA_BRICK_WALL);

        entries.add(BBBlocks.WHITE_CONCRETE_STAIRS);
        entries.add(BBBlocks.WHITE_CONCRETE_SLAB);
        entries.add(BBBlocks.WHITE_CONCRETE_WALL);
        entries.add(BBBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        entries.add(BBBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        entries.add(BBBlocks.LIGHT_GRAY_CONCRETE_WALL);
        entries.add(BBBlocks.GRAY_CONCRETE_STAIRS);
        entries.add(BBBlocks.GRAY_CONCRETE_SLAB);
        entries.add(BBBlocks.GRAY_CONCRETE_WALL);
        entries.add(BBBlocks.BLACK_CONCRETE_STAIRS);
        entries.add(BBBlocks.BLACK_CONCRETE_SLAB);
        entries.add(BBBlocks.BLACK_CONCRETE_WALL);
        entries.add(BBBlocks.BROWN_CONCRETE_STAIRS);
        entries.add(BBBlocks.BROWN_CONCRETE_SLAB);
        entries.add(BBBlocks.BROWN_CONCRETE_WALL);
        entries.add(BBBlocks.RED_CONCRETE_STAIRS);
        entries.add(BBBlocks.RED_CONCRETE_SLAB);
        entries.add(BBBlocks.RED_CONCRETE_WALL);
        entries.add(BBBlocks.ORANGE_CONCRETE_STAIRS);
        entries.add(BBBlocks.ORANGE_CONCRETE_SLAB);
        entries.add(BBBlocks.ORANGE_CONCRETE_WALL);
        entries.add(BBBlocks.YELLOW_CONCRETE_STAIRS);
        entries.add(BBBlocks.YELLOW_CONCRETE_SLAB);
        entries.add(BBBlocks.YELLOW_CONCRETE_WALL);
        entries.add(BBBlocks.LIME_CONCRETE_STAIRS);
        entries.add(BBBlocks.LIME_CONCRETE_SLAB);
        entries.add(BBBlocks.LIME_CONCRETE_WALL);
        entries.add(BBBlocks.GREEN_CONCRETE_STAIRS);
        entries.add(BBBlocks.GREEN_CONCRETE_SLAB);
        entries.add(BBBlocks.GREEN_CONCRETE_WALL);
        entries.add(BBBlocks.CYAN_CONCRETE_STAIRS);
        entries.add(BBBlocks.CYAN_CONCRETE_SLAB);
        entries.add(BBBlocks.CYAN_CONCRETE_WALL);
        entries.add(BBBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        entries.add(BBBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        entries.add(BBBlocks.LIGHT_BLUE_CONCRETE_WALL);
        entries.add(BBBlocks.BLUE_CONCRETE_STAIRS);
        entries.add(BBBlocks.BLUE_CONCRETE_SLAB);
        entries.add(BBBlocks.BLUE_CONCRETE_WALL);
        entries.add(BBBlocks.PURPLE_CONCRETE_STAIRS);
        entries.add(BBBlocks.PURPLE_CONCRETE_SLAB);
        entries.add(BBBlocks.PURPLE_CONCRETE_WALL);
        entries.add(BBBlocks.MAGENTA_CONCRETE_STAIRS);
        entries.add(BBBlocks.MAGENTA_CONCRETE_SLAB);
        entries.add(BBBlocks.MAGENTA_CONCRETE_WALL);
        entries.add(BBBlocks.PINK_CONCRETE_STAIRS);
        entries.add(BBBlocks.PINK_CONCRETE_SLAB);
        entries.add(BBBlocks.PINK_CONCRETE_WALL);

        entries.add(BBBlocks.GLAZED_TERRACOTTA);
    }

    private static void addDuplicatesToTab_FUNCTIONAL(FabricItemGroupEntries entries) {

        entries.add(BBBlocks.LARGE_CHAIN);

        entries.add(BBBlocks.MUD_POT);

        entries.add(BBBlocks.CHISELED_MUD_BRICKS);
        entries.add(BBBlocks.SMOOTH_MUD);
        entries.add(BBBlocks.SMOOTH_MUD_STAIRS);
        entries.add(BBBlocks.SMOOTH_MUD_SLAB);
        entries.add(BBBlocks.SMOOTH_MUD_WALL);
        entries.add(BBBlocks.SMOOTH_MUD_PRESSURE_PLATE);
        entries.add(BBBlocks.SMOOTH_MUD_BUTTON);
    }

    private static void addToTab_FUNCTIONAL(FabricItemGroupEntries entries) {

        entries.add(BBBlocks.INFESTED_POLISHED_COBBLESTONE);
        entries.add(BBBlocks.INFESTED_POLISHED_MOSSY_COBBLESTONE);
        entries.add(BBBlocks.INFESTED_MOSSY_COBBLESTONE);
        entries.add(BBBlocks.INFESTED_COBBLESTONE_BRICKS);
        entries.add(BBBlocks.INFESTED_MOSSY_COBBLESTONE_BRICKS);
        entries.add(BBBlocks.INFESTED_COBBLESTONE_TILES);
        entries.add(BBBlocks.INFESTED_MOSSY_COBBLESTONE_TILES);

        entries.add(BBBlocks.INFESTED_MOSSY_CRACKED_STONE_BRICKS);
        entries.add(BBBlocks.INFESTED_MOSSY_CHISELED_STONE_BRICKS);
        entries.add(BBBlocks.INFESTED_STONE_TILES);
        entries.add(BBBlocks.INFESTED_MOSSY_STONE_TILES);
    }

    public static void registerTabs() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(BBVanillaCreativeTabs::addToTab_BUILDING_BLOCKS);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(BBVanillaCreativeTabs::addToTab_COLORED_BLOCKS);
        if (!BBDependencyManager.isEchoingWildsInstalled()) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(BBVanillaCreativeTabs::addDuplicatesToTab_FUNCTIONAL);
        }
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(BBVanillaCreativeTabs::addToTab_FUNCTIONAL);
    }
}
