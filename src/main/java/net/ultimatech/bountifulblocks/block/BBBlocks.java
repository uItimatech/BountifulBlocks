package net.ultimatech.bountifulblocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ultimatech.bountifulblocks.BountifulBlocks;
import net.ultimatech.bountifulblocks.block.custom.*;

public class BBBlocks {

    // ----- REGISTRATION ----- //

    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.STONE)));



    public static final Block CHISELED_SMOOTH_STONE = registerBlock("chiseled_smooth_stone",
            new Block(FabricBlockSettings.copy(Blocks.SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), FabricBlockSettings.copy(Blocks.SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_BRICK_STAIRS = registerBlock("smooth_stone_brick_stairs",
            new StairsBlock(BBBlocks.SMOOTH_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.SMOOTH_STONE_BRICKS)));

    public static final Block SMOOTH_STONE_BRICK_SLAB = registerBlock("smooth_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.SMOOTH_STONE_BRICKS)));

    public static final Block SMOOTH_STONE_BRICK_WALL = registerBlock("smooth_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.SMOOTH_STONE_BRICKS)));

    public static final Block SMOOTH_STONE_TILES = registerBlock("smooth_stone_tiles",
            new Block(FabricBlockSettings.copy(Blocks.SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_TILE_STAIRS = registerBlock("smooth_stone_tile_stairs",
            new StairsBlock(BBBlocks.SMOOTH_STONE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.SMOOTH_STONE_TILES)));

    public static final Block SMOOTH_STONE_TILE_SLAB = registerBlock("smooth_stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.SMOOTH_STONE_TILES)));

    public static final Block SMOOTH_STONE_TILE_WALL = registerBlock("smooth_stone_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.SMOOTH_STONE_TILES)));



    public static final Block CARVED_OAK_PLANKS = registerBlock("carved_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));

    public static final Block CARVED_SPRUCE_PLANKS = registerBlock("carved_spruce_planks",
            new Block(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)));

    public static final Block CARVED_BIRCH_PLANKS = registerBlock("carved_birch_planks",
            new Block(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)));

    public static final Block CARVED_JUNGLE_PLANKS = registerBlock("carved_jungle_planks",
            new Block(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)));

    public static final Block CARVED_ACACIA_PLANKS = registerBlock("carved_acacia_planks",
            new Block(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)));

    public static final Block CARVED_DARK_OAK_PLANKS = registerBlock("carved_dark_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)));

    public static final Block CARVED_MANGROVE_PLANKS = registerBlock("carved_mangrove_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));

    public static final Block CARVED_CHERRY_PLANKS = registerBlock("carved_cherry_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));

    public static final Block CARVED_BAMBOO_PLANKS = registerBlock("carved_bamboo_planks",
            new Block(FabricBlockSettings.copy(Blocks.BAMBOO_PLANKS)));

    public static final Block CARVED_CRIMSON_PLANKS = registerBlock("carved_crimson_planks",
            new Block(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)));

    public static final Block CARVED_WARPED_PLANKS = registerBlock("carved_warped_planks",
            new Block(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)));



    public static final Block OAK_FLOORING = registerBlock("oak_flooring",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));

    public static final Block SPRUCE_FLOORING = registerBlock("spruce_flooring",
            new Block(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)));

    public static final Block BIRCH_FLOORING = registerBlock("birch_flooring",
            new Block(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)));

    public static final Block JUNGLE_FLOORING = registerBlock("jungle_flooring",
            new Block(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)));

    public static final Block ACACIA_FLOORING = registerBlock("acacia_flooring",
            new Block(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)));

    public static final Block DARK_OAK_FLOORING = registerBlock("dark_oak_flooring",
            new Block(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)));

    public static final Block MANGROVE_FLOORING = registerBlock("mangrove_flooring",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));

    public static final Block CHERRY_FLOORING = registerBlock("cherry_flooring",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));

    public static final Block CRIMSON_FLOORING = registerBlock("crimson_flooring",
            new Block(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)));

    public static final Block WARPED_FLOORING = registerBlock("warped_flooring",
            new Block(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)));



    public static final Block OAK_FLOORING_STAIRS = registerBlock("oak_flooring_stairs",
            new StairsBlock(BBBlocks.OAK_FLOORING.getDefaultState(), FabricBlockSettings.copy(BBBlocks.OAK_FLOORING)));

    public static final Block OAK_FLOORING_SLAB = registerBlock("oak_flooring_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.OAK_FLOORING)));

    public static final Block SPRUCE_FLOORING_STAIRS = registerBlock("spruce_flooring_stairs",
            new StairsBlock(BBBlocks.SPRUCE_FLOORING.getDefaultState(), FabricBlockSettings.copy(BBBlocks.SPRUCE_FLOORING)));

    public static final Block SPRUCE_FLOORING_SLAB = registerBlock("spruce_flooring_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.SPRUCE_FLOORING)));

    public static final Block BIRCH_FLOORING_STAIRS = registerBlock("birch_flooring_stairs",
            new StairsBlock(BBBlocks.BIRCH_FLOORING.getDefaultState(), FabricBlockSettings.copy(BBBlocks.BIRCH_FLOORING)));

    public static final Block BIRCH_FLOORING_SLAB = registerBlock("birch_flooring_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.BIRCH_FLOORING)));

    public static final Block JUNGLE_FLOORING_STAIRS = registerBlock("jungle_flooring_stairs",
            new StairsBlock(BBBlocks.JUNGLE_FLOORING.getDefaultState(), FabricBlockSettings.copy(BBBlocks.JUNGLE_FLOORING)));

    public static final Block JUNGLE_FLOORING_SLAB = registerBlock("jungle_flooring_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.JUNGLE_FLOORING)));

    public static final Block ACACIA_FLOORING_STAIRS = registerBlock("acacia_flooring_stairs",
            new StairsBlock(BBBlocks.ACACIA_FLOORING.getDefaultState(), FabricBlockSettings.copy(BBBlocks.ACACIA_FLOORING)));

    public static final Block ACACIA_FLOORING_SLAB = registerBlock("acacia_flooring_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.ACACIA_FLOORING)));

    public static final Block DARK_OAK_FLOORING_STAIRS = registerBlock("dark_oak_flooring_stairs",
            new StairsBlock(BBBlocks.DARK_OAK_FLOORING.getDefaultState(), FabricBlockSettings.copy(BBBlocks.DARK_OAK_FLOORING)));

    public static final Block DARK_OAK_FLOORING_SLAB = registerBlock("dark_oak_flooring_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.DARK_OAK_FLOORING)));

    public static final Block MANGROVE_FLOORING_STAIRS = registerBlock("mangrove_flooring_stairs",
            new StairsBlock(BBBlocks.MANGROVE_FLOORING.getDefaultState(), FabricBlockSettings.copy(BBBlocks.MANGROVE_FLOORING)));

    public static final Block MANGROVE_FLOORING_SLAB = registerBlock("mangrove_flooring_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.MANGROVE_FLOORING)));

    public static final Block CHERRY_FLOORING_STAIRS = registerBlock("cherry_flooring_stairs",
            new StairsBlock(BBBlocks.CHERRY_FLOORING.getDefaultState(), FabricBlockSettings.copy(BBBlocks.CHERRY_FLOORING)));

    public static final Block CHERRY_FLOORING_SLAB = registerBlock("cherry_flooring_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.CHERRY_FLOORING)));

    public static final Block BAMBOO_FLOORING_STAIRS = registerBlock("bamboo_flooring_stairs",
            new StairsBlock(Blocks.BAMBOO_MOSAIC.getDefaultState(), FabricBlockSettings.copy(Blocks.BAMBOO_MOSAIC)));

    public static final Block BAMBOO_FLOORING_SLAB = registerBlock("bamboo_flooring_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BAMBOO_MOSAIC)));

    public static final Block CRIMSON_FLOORING_STAIRS = registerBlock("crimson_flooring_stairs",
            new StairsBlock(BBBlocks.CRIMSON_FLOORING.getDefaultState(), FabricBlockSettings.copy(BBBlocks.CRIMSON_FLOORING)));

    public static final Block CRIMSON_FLOORING_SLAB = registerBlock("crimson_flooring_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.CRIMSON_FLOORING)));

    public static final Block WARPED_FLOORING_STAIRS = registerBlock("warped_flooring_stairs",
            new StairsBlock(BBBlocks.WARPED_FLOORING.getDefaultState(), FabricBlockSettings.copy(BBBlocks.WARPED_FLOORING)));

    public static final Block WARPED_FLOORING_SLAB = registerBlock("warped_flooring_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.WARPED_FLOORING)));



    public static final Block INFESTED_MOSSY_COBBLESTONE = registerBlock("infested_mossy_cobblestone",
            new InfestedBlock(Blocks.MOSSY_COBBLESTONE, FabricBlockSettings.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final Block COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE)));

    public static final Block INFESTED_COBBLESTONE_BRICKS = registerBlock("infested_cobblestone_bricks",
            new InfestedBlock(BBBlocks.COBBLESTONE_BRICKS, FabricBlockSettings.copy(BBBlocks.COBBLESTONE_BRICKS)));

    public static final Block COBBLESTONE_BRICK_STAIRS = registerBlock("cobblestone_brick_stairs",
            new StairsBlock(BBBlocks.COBBLESTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.COBBLESTONE_BRICKS)));

    public static final Block COBBLESTONE_BRICK_SLAB = registerBlock("cobblestone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.COBBLESTONE_BRICKS)));

    public static final Block COBBLESTONE_BRICK_WALL = registerBlock("cobblestone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.COBBLESTONE_BRICKS)));

    public static final Block MOSSY_COBBLESTONE_BRICKS = registerBlock("mossy_cobblestone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final Block INFESTED_MOSSY_COBBLESTONE_BRICKS = registerBlock("infested_mossy_cobblestone_bricks",
            new InfestedBlock(BBBlocks.MOSSY_COBBLESTONE_BRICKS, FabricBlockSettings.copy(BBBlocks.MOSSY_COBBLESTONE_BRICKS)));

    public static final Block MOSSY_COBBLESTONE_BRICK_STAIRS = registerBlock("mossy_cobblestone_brick_stairs",
        new StairsBlock(BBBlocks.MOSSY_COBBLESTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.MOSSY_COBBLESTONE_BRICKS)));

    public static final Block MOSSY_COBBLESTONE_BRICK_SLAB = registerBlock("mossy_cobblestone_brick_slab",
        new SlabBlock(FabricBlockSettings.copy(BBBlocks.MOSSY_COBBLESTONE_BRICKS)));

    public static final Block MOSSY_COBBLESTONE_BRICK_WALL = registerBlock("mossy_cobblestone_brick_wall",
        new WallBlock(FabricBlockSettings.copy(BBBlocks.MOSSY_COBBLESTONE_BRICKS)));

    public static final Block POLISHED_COBBLESTONE = registerBlock("polished_cobblestone",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE)));

    public static final Block POLISHED_COBBLESTONE_STAIRS = registerBlock("polished_cobblestone_stairs",
            new StairsBlock(BBBlocks.POLISHED_COBBLESTONE.getDefaultState(), FabricBlockSettings.copy(BBBlocks.POLISHED_COBBLESTONE)));

    public static final Block POLISHED_COBBLESTONE_SLAB = registerBlock("polished_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_COBBLESTONE)));

    public static final Block POLISHED_COBBLESTONE_WALL = registerBlock("polished_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_COBBLESTONE)));

    public static final Block COBBLESTONE_TILES = registerBlock("cobblestone_tiles",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE)));

    public static final Block COBBLESTONE_TILE_STAIRS = registerBlock("cobblestone_tile_stairs",
            new StairsBlock(BBBlocks.COBBLESTONE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.COBBLESTONE_TILES)));

    public static final Block COBBLESTONE_TILE_SLAB = registerBlock("cobblestone_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.COBBLESTONE_TILES)));

    public static final Block COBBLESTONE_TILE_WALL = registerBlock("cobblestone_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.COBBLESTONE_TILES)));

    public static final Block POLISHED_MOSSY_COBBLESTONE = registerBlock("polished_mossy_cobblestone",
            new Block(FabricBlockSettings.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final Block POLISHED_MOSSY_COBBLESTONE_STAIRS = registerBlock("polished_mossy_cobblestone_stairs",
            new StairsBlock(BBBlocks.POLISHED_MOSSY_COBBLESTONE.getDefaultState(), FabricBlockSettings.copy(BBBlocks.POLISHED_MOSSY_COBBLESTONE)));

    public static final Block POLISHED_MOSSY_COBBLESTONE_SLAB = registerBlock("polished_mossy_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_MOSSY_COBBLESTONE)));

    public static final Block POLISHED_MOSSY_COBBLESTONE_WALL = registerBlock("polished_mossy_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_MOSSY_COBBLESTONE)));

    public static final Block MOSSY_COBBLESTONE_TILES = registerBlock("mossy_cobblestone_tiles",
            new Block(FabricBlockSettings.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final Block MOSSY_COBBLESTONE_TILE_STAIRS = registerBlock("mossy_cobblestone_tile_stairs",
            new StairsBlock(BBBlocks.MOSSY_COBBLESTONE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.MOSSY_COBBLESTONE_TILES)));

    public static final Block MOSSY_COBBLESTONE_TILE_SLAB = registerBlock("mossy_cobblestone_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.MOSSY_COBBLESTONE_TILES)));

    public static final Block MOSSY_COBBLESTONE_TILE_WALL = registerBlock("mossy_cobblestone_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.MOSSY_COBBLESTONE_TILES)));

    public static final Block INFESTED_COBBLESTONE_TILES = registerBlock("infested_cobblestone_tiles",
            new InfestedBlock(BBBlocks.COBBLESTONE_TILES, FabricBlockSettings.copy(BBBlocks.COBBLESTONE_TILES)));

    public static final Block INFESTED_MOSSY_COBBLESTONE_TILES = registerBlock("infested_mossy_cobblestone_tiles",
            new InfestedBlock(BBBlocks.MOSSY_COBBLESTONE_TILES, FabricBlockSettings.copy(BBBlocks.MOSSY_COBBLESTONE_TILES)));

    public static final Block INFESTED_POLISHED_COBBLESTONE = registerBlock("infested_polished_cobblestone",
            new InfestedBlock(BBBlocks.POLISHED_COBBLESTONE, FabricBlockSettings.copy(BBBlocks.POLISHED_COBBLESTONE)));

    public static final Block INFESTED_POLISHED_MOSSY_COBBLESTONE = registerBlock("infested_polished_mossy_cobblestone",
            new InfestedBlock(BBBlocks.POLISHED_MOSSY_COBBLESTONE, FabricBlockSettings.copy(BBBlocks.POLISHED_MOSSY_COBBLESTONE)));



    public static final Block MOSSY_CRACKED_STONE_BRICKS = registerBlock("mossy_cracked_stone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block INFESTED_MOSSY_CRACKED_STONE_BRICKS = registerBlock("infested_mossy_cracked_stone_bricks",
            new InfestedBlock(BBBlocks.MOSSY_CRACKED_STONE_BRICKS, FabricBlockSettings.copy(BBBlocks.MOSSY_CRACKED_STONE_BRICKS)));

    public static final Block MOSSY_CHISELED_STONE_BRICKS = registerBlock("mossy_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block INFESTED_MOSSY_CHISELED_STONE_BRICKS = registerBlock("infested_mossy_chiseled_stone_bricks",
            new InfestedBlock(BBBlocks.MOSSY_CHISELED_STONE_BRICKS, FabricBlockSettings.copy(BBBlocks.MOSSY_CHISELED_STONE_BRICKS)));

    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.copy(Blocks.STONE)));

    public static final Block INFESTED_STONE_TILES = registerBlock("infested_stone_tiles",
            new InfestedBlock(BBBlocks.STONE_TILES, FabricBlockSettings.copy(BBBlocks.STONE_TILES)));

    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            new StairsBlock(BBBlocks.STONE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.STONE_TILES)));

    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.STONE_TILES)));

    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.STONE_TILES)));

    public static final Block MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            new Block(FabricBlockSettings.copy(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block INFESTED_MOSSY_STONE_TILES = registerBlock("infested_mossy_stone_tiles",
            new InfestedBlock(BBBlocks.MOSSY_STONE_TILES, FabricBlockSettings.copy(BBBlocks.MOSSY_STONE_TILES)));

    public static final Block MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
            new StairsBlock(BBBlocks.MOSSY_STONE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.MOSSY_STONE_TILES)));

    public static final Block MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.MOSSY_STONE_TILES)));

    public static final Block MOSSY_STONE_TILE_WALL = registerBlock("mossy_stone_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.MOSSY_STONE_TILES)));



    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)));

    public static final Block CHISELED_ANDESITE = registerBlock("chiseled_andesite",
            new Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)));

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)));

    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(BBBlocks.ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.ANDESITE_BRICKS)));

    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.ANDESITE_BRICKS)));

    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.ANDESITE_BRICKS)));

    public static final Block ANDESITE_TILES = registerBlock("andesite_tiles",
            new Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)));

    public static final Block ANDESITE_TILE_STAIRS = registerBlock("andesite_tile_stairs",
            new StairsBlock(BBBlocks.ANDESITE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.ANDESITE_TILES)));

    public static final Block ANDESITE_TILE_SLAB = registerBlock("andesite_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.ANDESITE_TILES)));

    public static final Block ANDESITE_TILE_WALL = registerBlock("andesite_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.ANDESITE_TILES)));



    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)));

    public static final Block CHISELED_DIORITE = registerBlock("chiseled_diorite",
            new Block(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)));

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)));

    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(BBBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.DIORITE_BRICKS)));

    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.DIORITE_BRICKS)));

    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.DIORITE_BRICKS)));

    public static final Block DIORITE_TILES = registerBlock("diorite_tiles",
            new Block(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)));

    public static final Block DIORITE_TILE_STAIRS = registerBlock("diorite_tile_stairs",
            new StairsBlock(BBBlocks.DIORITE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.DIORITE_TILES)));

    public static final Block DIORITE_TILE_SLAB = registerBlock("diorite_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.DIORITE_TILES)));

    public static final Block DIORITE_TILE_WALL = registerBlock("diorite_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.DIORITE_TILES)));



    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)));

    public static final Block CHISELED_GRANITE = registerBlock("chiseled_granite",
            new Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)));

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)));

    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            new StairsBlock(BBBlocks.GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.GRANITE_BRICKS)));

    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.GRANITE_BRICKS)));

    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.GRANITE_BRICKS)));

    public static final Block GRANITE_TILES = registerBlock("granite_tiles",
            new Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)));

    public static final Block GRANITE_TILE_STAIRS = registerBlock("granite_tile_stairs",
            new StairsBlock(BBBlocks.GRANITE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.GRANITE_TILES)));

    public static final Block GRANITE_TILE_SLAB = registerBlock("granite_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.GRANITE_TILES)));

    public static final Block GRANITE_TILE_WALL = registerBlock("granite_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.GRANITE_TILES)));



    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            new Block(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final Block POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            new StairsBlock(BBBlocks.POLISHED_DRIPSTONE.getDefaultState(), FabricBlockSettings.copy(BBBlocks.POLISHED_DRIPSTONE)));

    public static final Block POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_DRIPSTONE)));

    public static final Block POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_DRIPSTONE)));

    public static final Block CHISELED_DRIPSTONE = registerBlock("chiseled_dripstone",
            new Block(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            new StairsBlock(BBBlocks.DRIPSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.DRIPSTONE_BRICKS)));

    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.DRIPSTONE_BRICKS)));

    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.DRIPSTONE_BRICKS)));

    public static final Block DRIPSTONE_TILES = registerBlock("dripstone_tiles",
            new Block(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_TILE_STAIRS = registerBlock("dripstone_tile_stairs",
            new StairsBlock(BBBlocks.DRIPSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.DRIPSTONE_TILES)));

    public static final Block DRIPSTONE_TILE_SLAB = registerBlock("dripstone_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.DRIPSTONE_TILES)));

    public static final Block DRIPSTONE_TILE_WALL = registerBlock("dripstone_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.DRIPSTONE_TILES)));



    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS)));

    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)));



    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE)));

    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(Blocks.CUT_SANDSTONE)));

    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE)));

    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.SANDSTONE)));

    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            new StairsBlock(BBBlocks.SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.SANDSTONE_BRICKS)));

    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.SANDSTONE_BRICKS)));

    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.SANDSTONE_BRICKS)));

    public static final Block SANDSTONE_TILES = registerBlock("sandstone_tiles",
            new Block(FabricBlockSettings.copy(Blocks.SANDSTONE)));

    public static final Block SANDSTONE_TILE_STAIRS = registerBlock("sandstone_tile_stairs",
            new StairsBlock(BBBlocks.SANDSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.SANDSTONE_TILES)));

    public static final Block SANDSTONE_TILE_SLAB = registerBlock("sandstone_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.SANDSTONE_TILES)));

    public static final Block SANDSTONE_TILE_WALL = registerBlock("sandstone_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.SANDSTONE_TILES)));



    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.SMOOTH_RED_SANDSTONE)));

    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(Blocks.CUT_RED_SANDSTONE)));

    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.CUT_RED_SANDSTONE)));

    public static final Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)));

    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            new StairsBlock(BBBlocks.RED_SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.RED_SANDSTONE_BRICKS)));

    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.RED_SANDSTONE_BRICKS)));

    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.RED_SANDSTONE_BRICKS)));

    public static final Block RED_SANDSTONE_TILES = registerBlock("red_sandstone_tiles",
            new Block(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)));

    public static final Block RED_SANDSTONE_TILE_STAIRS = registerBlock("red_sandstone_tile_stairs",
            new StairsBlock(BBBlocks.RED_SANDSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.RED_SANDSTONE_TILES)));

    public static final Block RED_SANDSTONE_TILE_SLAB = registerBlock("red_sandstone_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.RED_SANDSTONE_TILES)));

    public static final Block RED_SANDSTONE_TILE_WALL = registerBlock("red_sandstone_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.RED_SANDSTONE_TILES)));



    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(Blocks.DEEPSLATE.getDefaultState(), FabricBlockSettings.copy(Blocks.DEEPSLATE)));

    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE)));

    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE)));


    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(), FabricBlockSettings.copy(Blocks.TUFF)));

    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF)));

    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.TUFF)));

    public static final Block TUFF_TILES = registerBlock("tuff_tiles",
            new Block(FabricBlockSettings.copy(Blocks.TUFF)));

    public static final Block TUFF_TILE_STAIRS = registerBlock("tuff_tile_stairs",
            new StairsBlock(BBBlocks.TUFF_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.TUFF_TILES)));

    public static final Block TUFF_TILE_SLAB = registerBlock("tuff_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.TUFF_TILES)));

    public static final Block TUFF_TILE_WALL = registerBlock("tuff_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.TUFF_TILES)));



    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), FabricBlockSettings.copy(Blocks.CALCITE)));

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE)));

    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.CALCITE)));

    public static final Block CHISELED_CALCITE = registerBlock("chiseled_calcite",
            new Block(FabricBlockSettings.copy(Blocks.CALCITE)));

    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(FabricBlockSettings.copy(Blocks.CALCITE)));

    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            new StairsBlock(BBBlocks.POLISHED_CALCITE.getDefaultState(), FabricBlockSettings.copy(BBBlocks.POLISHED_CALCITE)));

    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_CALCITE)));

    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_CALCITE)));

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(FabricBlockSettings.copy(Blocks.CALCITE)));

    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(BBBlocks.CALCITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.CALCITE_BRICKS)));

    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.CALCITE_BRICKS)));

    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.CALCITE_BRICKS)));

    public static final Block CALCITE_TILES = registerBlock("calcite_tiles",
            new Block(FabricBlockSettings.copy(Blocks.CALCITE)));

    public static final Block CALCITE_TILE_STAIRS = registerBlock("calcite_tile_stairs",
            new StairsBlock(BBBlocks.CALCITE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.CALCITE_TILES)));

    public static final Block CALCITE_TILE_SLAB = registerBlock("calcite_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.CALCITE_TILES)));

    public static final Block CALCITE_TILE_WALL = registerBlock("calcite_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.CALCITE_TILES)));



    public static final Block LARGE_CHAIN = registerBlock("large_chain",
            new LargeChainBlock(FabricBlockSettings.copy(Blocks.CHAIN).nonOpaque()));



    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(), FabricBlockSettings.copy(Blocks.PACKED_MUD)));

    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.PACKED_MUD)));

    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.PACKED_MUD)));

    public static final Block MUD_TILES = registerBlock("mud_tiles",
            new Block(FabricBlockSettings.copy(Blocks.PACKED_MUD)));

    public static final Block MUD_TILE_STAIRS = registerBlock("mud_tile_stairs",
            new StairsBlock(BBBlocks.MUD_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.MUD_TILES)));

    public static final Block MUD_TILE_SLAB = registerBlock("mud_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.MUD_TILES)));

    public static final Block MUD_TILE_WALL = registerBlock("mud_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.MUD_TILES)));

    public static final Block CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            new Block(FabricBlockSettings.copy(Blocks.MUD_BRICKS)));

    public static final Block SMOOTH_MUD = registerBlock("smooth_mud",
            new Block(FabricBlockSettings.copy(Blocks.MUD_BRICKS)));

    public static final Block SMOOTH_MUD_STAIRS = registerBlock("smooth_mud_stairs",
            new StairsBlock(BBBlocks.SMOOTH_MUD.getDefaultState(), FabricBlockSettings.copy(BBBlocks.SMOOTH_MUD)));

    public static final Block SMOOTH_MUD_SLAB = registerBlock("smooth_mud_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.SMOOTH_MUD)));

    public static final Block SMOOTH_MUD_WALL = registerBlock("smooth_mud_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.SMOOTH_MUD)));

    public static final Block SMOOTH_MUD_PRESSURE_PLATE = registerBlock("smooth_mud_pressure_plate",
            new MudPressurePlateBlock(FabricBlockSettings.copy(Blocks.PACKED_MUD)));

    public static final Block SMOOTH_MUD_BUTTON = registerBlock("smooth_mud_button",
            new MudButtonBlock(FabricBlockSettings.copy(Blocks.PACKED_MUD)));

    public static final Block MUD_POT = registerBlock("mud_pot",
            new MudPotBlock(FabricBlockSettings.copy(Blocks.PACKED_MUD).breakInstantly()));



    public static final Block CHISELED_OBSIDIAN = registerBlock("chiseled_obsidian",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN)));

    public static final Block POLISHED_OBSIDIAN = registerBlock("polished_obsidian",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN)));

    public static final Block POLISHED_OBSIDIAN_STAIRS = registerBlock("polished_obsidian_stairs",
            new StairsBlock(BBBlocks.POLISHED_OBSIDIAN.getDefaultState(), FabricBlockSettings.copy(BBBlocks.POLISHED_OBSIDIAN)));

    public static final Block POLISHED_OBSIDIAN_SLAB = registerBlock("polished_obsidian_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_OBSIDIAN)));

    public static final Block POLISHED_OBSIDIAN_WALL = registerBlock("polished_obsidian_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_OBSIDIAN)));

    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN)));

    public static final Block OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs",
            new StairsBlock(BBBlocks.OBSIDIAN_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.OBSIDIAN_BRICKS)));

    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.OBSIDIAN_BRICKS)));

    public static final Block OBSIDIAN_BRICK_WALL = registerBlock("obsidian_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.OBSIDIAN_BRICKS)));

    public static final Block OBSIDIAN_TILES = registerBlock("obsidian_tiles",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN)));

    public static final Block OBSIDIAN_TILE_STAIRS = registerBlock("obsidian_tile_stairs",
            new StairsBlock(BBBlocks.OBSIDIAN_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.OBSIDIAN_TILES)));

    public static final Block OBSIDIAN_TILE_SLAB = registerBlock("obsidian_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.OBSIDIAN_TILES)));

    public static final Block OBSIDIAN_TILE_WALL = registerBlock("obsidian_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.OBSIDIAN_TILES)));


    /* Removed for now as they did not fit properly into the game
    public static final Block CHISELED_CRYING_OBSIDIAN = registerBlock("chiseled_crying_obsidian",
            new CryingObsidianBlock(FabricBlockSettings.copy(Blocks.CRYING_OBSIDIAN)));

    public static final Block POLISHED_CRYING_OBSIDIAN = registerBlock("polished_crying_obsidian",
            new CryingObsidianBlock(FabricBlockSettings.copy(Blocks.CRYING_OBSIDIAN)));

    public static final Block POLISHED_CRYING_OBSIDIAN_STAIRS = registerBlock("polished_crying_obsidian_stairs",
            new StairsBlock(BBBlocks.POLISHED_CRYING_OBSIDIAN.getDefaultState(), FabricBlockSettings.copy(BBBlocks.POLISHED_CRYING_OBSIDIAN)));

    public static final Block POLISHED_CRYING_OBSIDIAN_SLAB = registerBlock("polished_crying_obsidian_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_CRYING_OBSIDIAN)));

    public static final Block POLISHED_CRYING_OBSIDIAN_WALL = registerBlock("polished_crying_obsidian_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_CRYING_OBSIDIAN)));

    public static final Block CRYING_OBSIDIAN_BRICKS = registerBlock("crying_obsidian_bricks",
            new CryingObsidianBlock(FabricBlockSettings.copy(Blocks.CRYING_OBSIDIAN)));

    public static final Block CRYING_OBSIDIAN_BRICK_STAIRS = registerBlock("crying_obsidian_brick_stairs",
            new StairsBlock(BBBlocks.CRYING_OBSIDIAN_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.CRYING_OBSIDIAN_BRICKS)));

    public static final Block CRYING_OBSIDIAN_BRICK_SLAB = registerBlock("crying_obsidian_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.CRYING_OBSIDIAN_BRICKS)));

    public static final Block CRYING_OBSIDIAN_BRICK_WALL = registerBlock("crying_obsidian_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.CRYING_OBSIDIAN_BRICKS)));

    public static final Block CRYING_OBSIDIAN_TILES = registerBlock("crying_obsidian_tiles",
            new CryingObsidianBlock(FabricBlockSettings.copy(Blocks.CRYING_OBSIDIAN)));

    public static final Block CRYING_OBSIDIAN_TILE_STAIRS = registerBlock("crying_obsidian_tile_stairs",
            new StairsBlock(BBBlocks.CRYING_OBSIDIAN_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.CRYING_OBSIDIAN_TILES)));

    public static final Block CRYING_OBSIDIAN_TILE_SLAB = registerBlock("crying_obsidian_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.CRYING_OBSIDIAN_TILES)));

    public static final Block CRYING_OBSIDIAN_TILE_WALL = registerBlock("crying_obsidian_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.CRYING_OBSIDIAN_TILES)));
    */


    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            new Block(FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS)));

    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS)));

    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS)));



    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(), FabricBlockSettings.copy(Blocks.END_STONE)));

    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.END_STONE)));

    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.END_STONE)));

    public static final Block CHISELED_END_STONE = registerBlock("chiseled_end_stone",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE)));

    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE)));

    public static final Block POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            new StairsBlock(BBBlocks.POLISHED_END_STONE.getDefaultState(), FabricBlockSettings.copy(BBBlocks.POLISHED_END_STONE)));

    public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_END_STONE)));

    public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_END_STONE)));


    public static final Block END_STONE_TILES = registerBlock("end_stone_tiles",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_TILE_STAIRS = registerBlock("end_stone_tile_stairs",
            new StairsBlock(BBBlocks.END_STONE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.END_STONE_TILES)));

    public static final Block END_STONE_TILE_SLAB = registerBlock("end_stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.END_STONE_TILES)));

    public static final Block END_STONE_TILE_WALL = registerBlock("end_stone_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.END_STONE_TILES)));



    public static final Block CHISELED_PURPUR = registerBlock("chiseled_purpur",
            new Block(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block POLISHED_PURPUR = registerBlock("polished_purpur",
            new Block(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK)));

    public static final Block POLISHED_PURPUR_STAIRS = registerBlock("polished_purpur_stairs",
            new StairsBlock(BBBlocks.POLISHED_PURPUR.getDefaultState(), FabricBlockSettings.copy(BBBlocks.POLISHED_PURPUR)));

    public static final Block POLISHED_PURPUR_SLAB = registerBlock("polished_purpur_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_PURPUR)));

    public static final Block POLISHED_PURPUR_WALL = registerBlock("polished_purpur_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_PURPUR)));

    public static final Block PURPUR_BRICKS = registerBlock("purpur_bricks",
            new Block(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK)));

    public static final Block PURPUR_BRICK_STAIRS = registerBlock("purpur_brick_stairs",
            new StairsBlock(BBBlocks.PURPUR_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.PURPUR_BRICKS)));

    public static final Block PURPUR_BRICK_SLAB = registerBlock("purpur_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.PURPUR_BRICKS)));

    public static final Block PURPUR_BRICK_WALL = registerBlock("purpur_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.PURPUR_BRICKS)));

    public static final Block PURPUR_TILE_WALL = registerBlock("purpur_tile_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK)));



    public static final Block BLACKSTONE_TILES = registerBlock("blackstone_tiles",
            new Block(FabricBlockSettings.copy(Blocks.BLACKSTONE)));

    public static final Block BLACKSTONE_TILE_STAIRS = registerBlock("blackstone_tile_stairs",
            new StairsBlock(BBBlocks.BLACKSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.BLACKSTONE_TILES)));

    public static final Block BLACKSTONE_TILE_SLAB = registerBlock("blackstone_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.BLACKSTONE_TILES)));

    public static final Block BLACKSTONE_TILE_WALL = registerBlock("blackstone_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.BLACKSTONE_TILES)));



    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), FabricBlockSettings.copy(Blocks.SMOOTH_BASALT)));

    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.SMOOTH_BASALT)));

    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.SMOOTH_BASALT)));

    public static final Block POLISHED_SMOOTH_BASALT = registerBlock("polished_smooth_basalt",
            new Block(FabricBlockSettings.copy(Blocks.SMOOTH_BASALT)));

    public static final Block POLISHED_SMOOTH_BASALT_STAIRS = registerBlock("polished_smooth_basalt_stairs",
            new StairsBlock(BBBlocks.POLISHED_SMOOTH_BASALT.getDefaultState(), FabricBlockSettings.copy(BBBlocks.POLISHED_SMOOTH_BASALT)));

    public static final Block POLISHED_SMOOTH_BASALT_SLAB = registerBlock("polished_smooth_basalt_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_SMOOTH_BASALT)));

    public static final Block POLISHED_SMOOTH_BASALT_WALL = registerBlock("polished_smooth_basalt_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_SMOOTH_BASALT)));

    public static final Block SMOOTH_BASALT_BRICKS = registerBlock("smooth_basalt_bricks",
            new Block(FabricBlockSettings.copy(Blocks.SMOOTH_BASALT)));

    public static final Block SMOOTH_BASALT_BRICK_STAIRS = registerBlock("smooth_basalt_brick_stairs",
            new StairsBlock(BBBlocks.SMOOTH_BASALT_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.SMOOTH_BASALT_BRICKS)));

    public static final Block SMOOTH_BASALT_BRICK_SLAB = registerBlock("smooth_basalt_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.SMOOTH_BASALT_BRICKS)));

    public static final Block SMOOTH_BASALT_BRICK_WALL = registerBlock("smooth_basalt_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.SMOOTH_BASALT_BRICKS)));

    public static final Block CRACKED_SMOOTH_BASALT_BRICKS = registerBlock("cracked_smooth_basalt_bricks",
            new Block(FabricBlockSettings.copy(Blocks.SMOOTH_BASALT)));

    public static final Block CHISELED_SMOOTH_BASALT = registerBlock("chiseled_smooth_basalt",
            new Block(FabricBlockSettings.copy(Blocks.SMOOTH_BASALT)));

    public static final Block SMOOTH_BASALT_TILES = registerBlock("smooth_basalt_tiles",
            new Block(FabricBlockSettings.copy(Blocks.SMOOTH_BASALT)));

    public static final Block SMOOTH_BASALT_TILE_STAIRS = registerBlock("smooth_basalt_tile_stairs",
            new StairsBlock(BBBlocks.SMOOTH_BASALT_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.SMOOTH_BASALT_TILES)));

    public static final Block SMOOTH_BASALT_TILE_SLAB = registerBlock("smooth_basalt_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.SMOOTH_BASALT_TILES)));

    public static final Block SMOOTH_BASALT_TILE_WALL = registerBlock("smooth_basalt_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.SMOOTH_BASALT_TILES)));



    public static final Block CARVED_SNOW = registerBlock("carved_snow",
            new CarvedSnowBlock(FabricBlockSettings.copy(Blocks.SNOW_BLOCK).strength(0.4f)));

    public static final Block PACKED_SNOW = registerBlock("packed_snow",
            new Block(FabricBlockSettings.copy(Blocks.SNOW_BLOCK).strength(0.4f)));

    public static final Block PACKED_SNOW_STAIRS = registerBlock("packed_snow_stairs",
            new StairsBlock(BBBlocks.PACKED_SNOW.getDefaultState(), FabricBlockSettings.copy(BBBlocks.PACKED_SNOW)));

    public static final Block PACKED_SNOW_SLAB = registerBlock("packed_snow_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.PACKED_SNOW)));

    public static final Block PACKED_SNOW_WALL = registerBlock("packed_snow_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.PACKED_SNOW)));

    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(FabricBlockSettings.copy(Blocks.SNOW_BLOCK).strength(0.4f)));

    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(BBBlocks.SNOW_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.SNOW_BRICKS)));

    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.SNOW_BRICKS)));

    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.SNOW_BRICKS)));



    public static final Block POLISHED_ICE = registerBlock("polished_ice",
            new IceBlock(FabricBlockSettings.copy(Blocks.ICE)));

    public static final Block POLISHED_ICE_STAIRS = registerBlock("polished_ice_stairs",
            new StairsBlock(BBBlocks.POLISHED_ICE.getDefaultState(), FabricBlockSettings.copy(BBBlocks.POLISHED_ICE)));

    public static final Block POLISHED_ICE_SLAB = registerBlock("polished_ice_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_ICE)));

    public static final Block POLISHED_ICE_WALL = registerBlock("polished_ice_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.POLISHED_ICE)));

    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            new IceBlock(FabricBlockSettings.copy(Blocks.ICE)));

    public static final Block ICE_BRICK_STAIRS = registerBlock("ice_brick_stairs",
            new StairsBlock(BBBlocks.ICE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.ICE_BRICKS)));

    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.ICE_BRICKS)));

    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.ICE_BRICKS)));

    public static final Block ICE_TILES = registerBlock("ice_tiles",
            new IceBlock(FabricBlockSettings.copy(Blocks.ICE)));

    public static final Block ICE_TILE_STAIRS = registerBlock("ice_tile_stairs",
            new StairsBlock(BBBlocks.ICE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.ICE_TILES)));

    public static final Block ICE_TILE_SLAB = registerBlock("ice_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.ICE_TILES)));

    public static final Block ICE_TILE_WALL = registerBlock("ice_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.ICE_TILES)));

    public static final Block CHISELED_ICE = registerBlock("chiseled_ice",
            new IceBlock(FabricBlockSettings.copy(Blocks.ICE)));



    public static final Block POLISHED_PACKED_ICE = registerBlock("polished_packed_ice",
            new Block(FabricBlockSettings.copy(Blocks.PACKED_ICE)));

    public static final Block POLISHED_PACKED_ICE_STAIRS = registerBlock("polished_packed_ice_stairs",
            new StairsBlock(Blocks.PACKED_ICE.getDefaultState(), FabricBlockSettings.copy(Blocks.PACKED_ICE)));

    public static final Block POLISHED_PACKED_ICE_SLAB = registerBlock("polished_packed_ice_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.PACKED_ICE)));

    public static final Block POLISHED_PACKED_ICE_WALL = registerBlock("polished_packed_ice_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.PACKED_ICE)));

    public static final Block PACKED_ICE_BRICKS = registerBlock("packed_ice_bricks",
            new Block(FabricBlockSettings.copy(Blocks.PACKED_ICE)));

    public static final Block PACKED_ICE_BRICK_STAIRS = registerBlock("packed_ice_brick_stairs",
            new StairsBlock(BBBlocks.PACKED_ICE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.PACKED_ICE_BRICKS)));

    public static final Block PACKED_ICE_BRICK_SLAB = registerBlock("packed_ice_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.PACKED_ICE_BRICKS)));

    public static final Block PACKED_ICE_BRICK_WALL = registerBlock("packed_ice_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.PACKED_ICE_BRICKS)));

    public static final Block PACKED_ICE_TILES = registerBlock("packed_ice_tiles",
            new Block(FabricBlockSettings.copy(Blocks.PACKED_ICE)));

    public static final Block PACKED_ICE_TILE_STAIRS = registerBlock("packed_ice_tile_stairs",
            new StairsBlock(BBBlocks.PACKED_ICE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.PACKED_ICE_TILES)));

    public static final Block PACKED_ICE_TILE_SLAB = registerBlock("packed_ice_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.PACKED_ICE_TILES)));

    public static final Block PACKED_ICE_TILE_WALL = registerBlock("packed_ice_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.PACKED_ICE_TILES)));

    public static final Block CHISELED_PACKED_ICE = registerBlock("chiseled_packed_ice",
            new BBHorizontalFacingBlock(FabricBlockSettings.copy(Blocks.PACKED_ICE)));



    public static final Block POLISHED_BLUE_ICE = registerBlock("polished_blue_ice",
            new Block(FabricBlockSettings.copy(Blocks.BLUE_ICE)));

    public static final Block POLISHED_BLUE_ICE_STAIRS = registerBlock("polished_blue_ice_stairs",
            new StairsBlock(Blocks.BLUE_ICE.getDefaultState(), FabricBlockSettings.copy(Blocks.BLUE_ICE)));

    public static final Block POLISHED_BLUE_ICE_SLAB = registerBlock("polished_blue_ice_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BLUE_ICE)));

    public static final Block POLISHED_BLUE_ICE_WALL = registerBlock("polished_blue_ice_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.BLUE_ICE)));

    public static final Block BLUE_ICE_BRICKS = registerBlock("blue_ice_bricks",
            new Block(FabricBlockSettings.copy(Blocks.BLUE_ICE)));

    public static final Block BLUE_ICE_BRICK_STAIRS = registerBlock("blue_ice_brick_stairs",
            new StairsBlock(BBBlocks.BLUE_ICE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.BLUE_ICE_BRICKS)));

    public static final Block BLUE_ICE_BRICK_SLAB = registerBlock("blue_ice_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.BLUE_ICE_BRICKS)));

    public static final Block BLUE_ICE_BRICK_WALL = registerBlock("blue_ice_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.BLUE_ICE_BRICKS)));

    public static final Block BLUE_ICE_TILES = registerBlock("blue_ice_tiles",
            new Block(FabricBlockSettings.copy(Blocks.BLUE_ICE)));

    public static final Block BLUE_ICE_TILE_STAIRS = registerBlock("blue_ice_tile_stairs",
            new StairsBlock(BBBlocks.BLUE_ICE_TILES.getDefaultState(), FabricBlockSettings.copy(BBBlocks.BLUE_ICE_TILES)));

    public static final Block BLUE_ICE_TILE_SLAB = registerBlock("blue_ice_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.BLUE_ICE_TILES)));

    public static final Block BLUE_ICE_TILE_WALL = registerBlock("blue_ice_tile_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.BLUE_ICE_TILES)));

    public static final Block CHISELED_BLUE_ICE = registerBlock("chiseled_blue_ice",
            new BBHorizontalFacingBlock(FabricBlockSettings.copy(Blocks.BLUE_ICE)));



    public static final Block WHITE_THREADED_WOOL = registerBlock("white_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL)));

    public static final Block WHITE_THREADED_CARPET = registerBlock("white_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.WHITE_CARPET)));

    public static final Block LIGHT_GRAY_THREADED_WOOL = registerBlock("light_gray_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_WOOL)));

    public static final Block LIGHT_GRAY_THREADED_CARPET = registerBlock("light_gray_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CARPET)));

    public static final Block GRAY_THREADED_WOOL = registerBlock("gray_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.GRAY_WOOL)));

    public static final Block GRAY_THREADED_CARPET = registerBlock("gray_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.GRAY_CARPET)));

    public static final Block BLACK_THREADED_WOOL = registerBlock("black_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.BLACK_WOOL)));

    public static final Block BLACK_THREADED_CARPET = registerBlock("black_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.BLACK_CARPET)));

    public static final Block BROWN_THREADED_WOOL = registerBlock("brown_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.BROWN_WOOL)));

    public static final Block BROWN_THREADED_CARPET = registerBlock("brown_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.BROWN_CARPET)));

    public static final Block RED_THREADED_WOOL = registerBlock("red_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.RED_WOOL)));

    public static final Block RED_THREADED_CARPET = registerBlock("red_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.RED_CARPET)));

    public static final Block ORANGE_THREADED_WOOL = registerBlock("orange_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.ORANGE_WOOL)));

    public static final Block ORANGE_THREADED_CARPET = registerBlock("orange_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.ORANGE_CARPET)));

    public static final Block YELLOW_THREADED_WOOL = registerBlock("yellow_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.YELLOW_WOOL)));

    public static final Block YELLOW_THREADED_CARPET = registerBlock("yellow_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.YELLOW_CARPET)));

    public static final Block LIME_THREADED_WOOL = registerBlock("lime_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.LIME_WOOL)));

    public static final Block LIME_THREADED_CARPET = registerBlock("lime_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.LIME_CARPET)));

    public static final Block GREEN_THREADED_WOOL = registerBlock("green_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.GREEN_WOOL)));

    public static final Block GREEN_THREADED_CARPET = registerBlock("green_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.GREEN_CARPET)));

    public static final Block CYAN_THREADED_WOOL = registerBlock("cyan_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.CYAN_WOOL)));

    public static final Block CYAN_THREADED_CARPET = registerBlock("cyan_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.CYAN_CARPET)));

    public static final Block LIGHT_BLUE_THREADED_WOOL = registerBlock("light_blue_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_WOOL)));

    public static final Block LIGHT_BLUE_THREADED_CARPET = registerBlock("light_blue_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_CARPET)));

    public static final Block BLUE_THREADED_WOOL = registerBlock("blue_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.BLUE_WOOL)));

    public static final Block BLUE_THREADED_CARPET = registerBlock("blue_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.BLUE_CARPET)));

    public static final Block PURPLE_THREADED_WOOL = registerBlock("purple_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.PURPLE_WOOL)));

    public static final Block PURPLE_THREADED_CARPET = registerBlock("purple_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.PURPLE_CARPET)));

    public static final Block MAGENTA_THREADED_WOOL = registerBlock("magenta_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.MAGENTA_WOOL)));

    public static final Block MAGENTA_THREADED_CARPET = registerBlock("magenta_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.MAGENTA_CARPET)));

    public static final Block PINK_THREADED_WOOL = registerBlock("pink_threaded_wool",
            new Block(FabricBlockSettings.copy(Blocks.PINK_WOOL)));

    public static final Block PINK_THREADED_CARPET = registerBlock("pink_threaded_carpet",
            new CarpetBlock(FabricBlockSettings.copy(Blocks.PINK_CARPET)));



    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.TERRACOTTA)));

    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.TERRACOTTA)));

    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.TERRACOTTA)));

    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.GRAY_TERRACOTTA)));

    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.GRAY_TERRACOTTA)));

    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.GRAY_TERRACOTTA)));

    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.BLACK_TERRACOTTA)));

    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BLACK_TERRACOTTA)));

    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.BLACK_TERRACOTTA)));

    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_TERRACOTTA)));

    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.WHITE_TERRACOTTA)));

    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.WHITE_TERRACOTTA)));

    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.BROWN_TERRACOTTA)));

    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BROWN_TERRACOTTA)));

    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.BROWN_TERRACOTTA)));

    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.RED_TERRACOTTA)));

    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.RED_TERRACOTTA)));

    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.RED_TERRACOTTA)));

    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.LIME_TERRACOTTA)));

    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.LIME_TERRACOTTA)));

    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.LIME_TERRACOTTA)));

    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.GREEN_TERRACOTTA)));

    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.GREEN_TERRACOTTA)));

    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.GREEN_TERRACOTTA)));

    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.CYAN_TERRACOTTA)));

    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.CYAN_TERRACOTTA)));

    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.CYAN_TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.BLUE_TERRACOTTA)));

    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BLUE_TERRACOTTA)));

    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.BLUE_TERRACOTTA)));

    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(Blocks.PINK_TERRACOTTA)));

    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.PINK_TERRACOTTA)));

    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.PINK_TERRACOTTA)));

    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA)));

    public static final Block TERRACOTTA_BRICK_STAIRS = registerBlock("terracotta_brick_stairs",
            new StairsBlock(BBBlocks.TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.TERRACOTTA_BRICKS)));

    public static final Block TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.TERRACOTTA_BRICKS)));

    public static final Block TERRACOTTA_BRICK_WALL = registerBlock("terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.TERRACOTTA_BRICKS)));

    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_TERRACOTTA)));

    public static final Block WHITE_TERRACOTTA_BRICK_STAIRS = registerBlock("white_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.WHITE_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.WHITE_TERRACOTTA_BRICKS)));

    public static final Block WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("white_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.WHITE_TERRACOTTA_BRICKS)));

    public static final Block WHITE_TERRACOTTA_BRICK_WALL = registerBlock("white_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.WHITE_TERRACOTTA_BRICKS)));

    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("light_gray_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)));

    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("light_gray_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)));

    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = registerBlock("light_gray_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)));

    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.GRAY_TERRACOTTA)));

    public static final Block GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("gray_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.GRAY_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.GRAY_TERRACOTTA_BRICKS)));

    public static final Block GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("gray_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.GRAY_TERRACOTTA_BRICKS)));

    public static final Block GRAY_TERRACOTTA_BRICK_WALL = registerBlock("gray_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.GRAY_TERRACOTTA_BRICKS)));
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.BLACK_TERRACOTTA)));

    public static final Block BLACK_TERRACOTTA_BRICK_STAIRS = registerBlock("black_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.BLACK_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.BLACK_TERRACOTTA_BRICKS)));

    public static final Block BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("black_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.BLACK_TERRACOTTA_BRICKS)));

    public static final Block BLACK_TERRACOTTA_BRICK_WALL = registerBlock("black_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.BLACK_TERRACOTTA_BRICKS)));

    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.BROWN_TERRACOTTA)));

    public static final Block BROWN_TERRACOTTA_BRICK_STAIRS = registerBlock("brown_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.BROWN_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.BROWN_TERRACOTTA_BRICKS)));

    public static final Block BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("brown_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.BROWN_TERRACOTTA_BRICKS)));

    public static final Block BROWN_TERRACOTTA_BRICK_WALL = registerBlock("brown_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.BROWN_TERRACOTTA_BRICKS)));

    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.RED_TERRACOTTA)));

    public static final Block RED_TERRACOTTA_BRICK_STAIRS = registerBlock("red_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.RED_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.RED_TERRACOTTA_BRICKS)));

    public static final Block RED_TERRACOTTA_BRICK_SLAB = registerBlock("red_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.RED_TERRACOTTA_BRICKS)));

    public static final Block RED_TERRACOTTA_BRICK_WALL = registerBlock("red_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.RED_TERRACOTTA_BRICKS)));

    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final Block ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlock("orange_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.ORANGE_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.ORANGE_TERRACOTTA_BRICKS)));

    public static final Block ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("orange_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.ORANGE_TERRACOTTA_BRICKS)));

    public static final Block ORANGE_TERRACOTTA_BRICK_WALL = registerBlock("orange_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.ORANGE_TERRACOTTA_BRICKS)));

    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final Block YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlock("yellow_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.YELLOW_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.YELLOW_TERRACOTTA_BRICKS)));

    public static final Block YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("yellow_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.YELLOW_TERRACOTTA_BRICKS)));

    public static final Block YELLOW_TERRACOTTA_BRICK_WALL = registerBlock("yellow_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.YELLOW_TERRACOTTA_BRICKS)));

    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.LIME_TERRACOTTA)));

    public static final Block LIME_TERRACOTTA_BRICK_STAIRS = registerBlock("lime_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.LIME_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.LIME_TERRACOTTA_BRICKS)));

    public static final Block LIME_TERRACOTTA_BRICK_SLAB = registerBlock("lime_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.LIME_TERRACOTTA_BRICKS)));

    public static final Block LIME_TERRACOTTA_BRICK_WALL = registerBlock("lime_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.LIME_TERRACOTTA_BRICKS)));

    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.GREEN_TERRACOTTA)));

    public static final Block GREEN_TERRACOTTA_BRICK_STAIRS = registerBlock("green_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.GREEN_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.GREEN_TERRACOTTA_BRICKS)));

    public static final Block GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("green_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.GREEN_TERRACOTTA_BRICKS)));

    public static final Block GREEN_TERRACOTTA_BRICK_WALL = registerBlock("green_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.GREEN_TERRACOTTA_BRICKS)));

    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.CYAN_TERRACOTTA)));

    public static final Block CYAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cyan_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.CYAN_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.CYAN_TERRACOTTA_BRICKS)));

    public static final Block CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("cyan_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.CYAN_TERRACOTTA_BRICKS)));

    public static final Block CYAN_TERRACOTTA_BRICK_WALL = registerBlock("cyan_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.CYAN_TERRACOTTA_BRICKS)));

    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("light_blue_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)));

    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("light_blue_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)));

    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = registerBlock("light_blue_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)));

    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.BLUE_TERRACOTTA)));

    public static final Block BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("blue_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.BLUE_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.BLUE_TERRACOTTA_BRICKS)));

    public static final Block BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("blue_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.BLUE_TERRACOTTA_BRICKS)));

    public static final Block BLUE_TERRACOTTA_BRICK_WALL = registerBlock("blue_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.BLUE_TERRACOTTA_BRICKS)));

    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final Block PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlock("purple_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.PURPLE_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.PURPLE_TERRACOTTA_BRICKS)));

    public static final Block PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("purple_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.PURPLE_TERRACOTTA_BRICKS)));

    public static final Block PURPLE_TERRACOTTA_BRICK_WALL = registerBlock("purple_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.PURPLE_TERRACOTTA_BRICKS)));

    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlock("magenta_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.MAGENTA_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.MAGENTA_TERRACOTTA_BRICKS)));

    public static final Block MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("magenta_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.MAGENTA_TERRACOTTA_BRICKS)));

    public static final Block MAGENTA_TERRACOTTA_BRICK_WALL = registerBlock("magenta_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.MAGENTA_TERRACOTTA_BRICKS)));

    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            new Block(FabricBlockSettings.copy(Blocks.PINK_TERRACOTTA)));

    public static final Block PINK_TERRACOTTA_BRICK_STAIRS = registerBlock("pink_terracotta_brick_stairs",
            new StairsBlock(BBBlocks.PINK_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BBBlocks.PINK_TERRACOTTA_BRICKS)));

    public static final Block PINK_TERRACOTTA_BRICK_SLAB = registerBlock("pink_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(BBBlocks.PINK_TERRACOTTA_BRICKS)));

    public static final Block PINK_TERRACOTTA_BRICK_WALL = registerBlock("pink_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copy(BBBlocks.PINK_TERRACOTTA_BRICKS)));

    public static final Block GLAZED_TERRACOTTA = registerBlock("glazed_terracotta",
            new GlazedTerracottaBlock(FabricBlockSettings.copy(Blocks.TERRACOTTA)));



    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));

    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));

    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.GRAY_CONCRETE)));

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.GRAY_CONCRETE)));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.GRAY_CONCRETE)));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.BLACK_CONCRETE)));

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE)));

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE)));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.BROWN_CONCRETE)));

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BROWN_CONCRETE)));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.BROWN_CONCRETE)));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.RED_CONCRETE)));

    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.RED_CONCRETE)));

    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.RED_CONCRETE)));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.ORANGE_CONCRETE)));

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.ORANGE_CONCRETE)));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.ORANGE_CONCRETE)));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.YELLOW_CONCRETE)));

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.YELLOW_CONCRETE)));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.YELLOW_CONCRETE)));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.LIME_CONCRETE)));

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.LIME_CONCRETE)));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.LIME_CONCRETE)));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.GREEN_CONCRETE)));

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.GREEN_CONCRETE)));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.GREEN_CONCRETE)));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.CYAN_CONCRETE)));

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.CYAN_CONCRETE)));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.CYAN_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.BLUE_CONCRETE)));

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BLUE_CONCRETE)));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.BLUE_CONCRETE)));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.PURPLE_CONCRETE)));

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.PURPLE_CONCRETE)));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.PURPLE_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.MAGENTA_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.MAGENTA_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.MAGENTA_CONCRETE)));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(Blocks.PINK_CONCRETE)));

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.PINK_CONCRETE)));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.PINK_CONCRETE)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BountifulBlocks.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(BountifulBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(BountifulBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {}
}