package net.ultimatech.bountifulblocks.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ultimatech.bountifulblocks.BountifulBlocks;
import net.ultimatech.bountifulblocks.block.custom.*;
import net.ultimatech.bountifulblocks.item.BBItems;

import java.util.function.Supplier;

public class BBBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BountifulBlocks.MOD_ID);


    // ----- REGISTRATION ----- //

    public static final RegistryObject<Block> STONE_WALL = registerBlock("stone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));



    public static final RegistryObject<Block> CHISELED_SMOOTH_STONE = registerBlock("chiseled_smooth_stone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));

    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs", () ->
            new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));

    public static final RegistryObject<Block> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_STAIRS = registerBlock("smooth_stone_brick_stairs", () ->
            new StairBlock(BBBlocks.SMOOTH_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_STONE_BRICKS.get())));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_SLAB = registerBlock("smooth_stone_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_STONE_BRICKS.get())));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_WALL = registerBlock("smooth_stone_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_STONE_BRICKS.get())));

    public static final RegistryObject<Block> SMOOTH_STONE_TILES = registerBlock("smooth_stone_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));

    public static final RegistryObject<Block> SMOOTH_STONE_TILE_STAIRS = registerBlock("smooth_stone_tile_stairs", () ->
            new StairBlock(BBBlocks.SMOOTH_STONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_STONE_TILES.get())));

    public static final RegistryObject<Block> SMOOTH_STONE_TILE_SLAB = registerBlock("smooth_stone_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_STONE_TILES.get())));

    public static final RegistryObject<Block> SMOOTH_STONE_TILE_WALL = registerBlock("smooth_stone_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_STONE_TILES.get())));



    public static final RegistryObject<Block> CARVED_OAK_PLANKS = registerBlock("carved_oak_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> CARVED_SPRUCE_PLANKS = registerBlock("carved_spruce_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> CARVED_BIRCH_PLANKS = registerBlock("carved_birch_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> CARVED_JUNGLE_PLANKS = registerBlock("carved_jungle_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));

    public static final RegistryObject<Block> CARVED_ACACIA_PLANKS = registerBlock("carved_acacia_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> CARVED_DARK_OAK_PLANKS = registerBlock("carved_dark_oak_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> CARVED_MANGROVE_PLANKS = registerBlock("carved_mangrove_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> CARVED_CHERRY_PLANKS = registerBlock("carved_cherry_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> CARVED_BAMBOO_PLANKS = registerBlock("carved_bamboo_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));

    public static final RegistryObject<Block> CARVED_CRIMSON_PLANKS = registerBlock("carved_crimson_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> CARVED_WARPED_PLANKS = registerBlock("carved_warped_planks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));



    public static final RegistryObject<Block> OAK_FLOORING = registerBlock("oak_flooring", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SPRUCE_FLOORING = registerBlock("spruce_flooring", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> BIRCH_FLOORING = registerBlock("birch_flooring", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> JUNGLE_FLOORING = registerBlock("jungle_flooring", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));

    public static final RegistryObject<Block> ACACIA_FLOORING = registerBlock("acacia_flooring", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> DARK_OAK_FLOORING = registerBlock("dark_oak_flooring", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> MANGROVE_FLOORING = registerBlock("mangrove_flooring", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> CHERRY_FLOORING = registerBlock("cherry_flooring", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> CRIMSON_FLOORING = registerBlock("crimson_flooring", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_FLOORING = registerBlock("warped_flooring", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));



    public static final RegistryObject<Block> OAK_FLOORING_STAIRS = registerBlock("oak_flooring_stairs", () ->
            new StairBlock(BBBlocks.OAK_FLOORING.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.OAK_FLOORING.get())));

    public static final RegistryObject<Block> OAK_FLOORING_SLAB = registerBlock("oak_flooring_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.OAK_FLOORING.get())));

    public static final RegistryObject<Block> SPRUCE_FLOORING_STAIRS = registerBlock("spruce_flooring_stairs", () ->
            new StairBlock(BBBlocks.SPRUCE_FLOORING.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.SPRUCE_FLOORING.get())));

    public static final RegistryObject<Block> SPRUCE_FLOORING_SLAB = registerBlock("spruce_flooring_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.SPRUCE_FLOORING.get())));

    public static final RegistryObject<Block> BIRCH_FLOORING_STAIRS = registerBlock("birch_flooring_stairs", () ->
            new StairBlock(BBBlocks.BIRCH_FLOORING.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.BIRCH_FLOORING.get())));

    public static final RegistryObject<Block> BIRCH_FLOORING_SLAB = registerBlock("birch_flooring_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.BIRCH_FLOORING.get())));

    public static final RegistryObject<Block> JUNGLE_FLOORING_STAIRS = registerBlock("jungle_flooring_stairs", () ->
            new StairBlock(BBBlocks.JUNGLE_FLOORING.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.JUNGLE_FLOORING.get())));

    public static final RegistryObject<Block> JUNGLE_FLOORING_SLAB = registerBlock("jungle_flooring_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.JUNGLE_FLOORING.get())));

    public static final RegistryObject<Block> ACACIA_FLOORING_STAIRS = registerBlock("acacia_flooring_stairs", () ->
            new StairBlock(BBBlocks.ACACIA_FLOORING.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.ACACIA_FLOORING.get())));

    public static final RegistryObject<Block> ACACIA_FLOORING_SLAB = registerBlock("acacia_flooring_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.ACACIA_FLOORING.get())));

    public static final RegistryObject<Block> DARK_OAK_FLOORING_STAIRS = registerBlock("dark_oak_flooring_stairs", () ->
            new StairBlock(BBBlocks.DARK_OAK_FLOORING.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.DARK_OAK_FLOORING.get())));

    public static final RegistryObject<Block> DARK_OAK_FLOORING_SLAB = registerBlock("dark_oak_flooring_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.DARK_OAK_FLOORING.get())));

    public static final RegistryObject<Block> MANGROVE_FLOORING_STAIRS = registerBlock("mangrove_flooring_stairs", () ->
            new StairBlock(BBBlocks.MANGROVE_FLOORING.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.MANGROVE_FLOORING.get())));

    public static final RegistryObject<Block> MANGROVE_FLOORING_SLAB = registerBlock("mangrove_flooring_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.MANGROVE_FLOORING.get())));

    public static final RegistryObject<Block> CHERRY_FLOORING_STAIRS = registerBlock("cherry_flooring_stairs", () ->
            new StairBlock(BBBlocks.CHERRY_FLOORING.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.CHERRY_FLOORING.get())));

    public static final RegistryObject<Block> CHERRY_FLOORING_SLAB = registerBlock("cherry_flooring_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.CHERRY_FLOORING.get())));

    public static final RegistryObject<Block> BAMBOO_FLOORING_STAIRS = registerBlock("bamboo_flooring_stairs", () ->
            new StairBlock(Blocks.BAMBOO_MOSAIC.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC)));

    public static final RegistryObject<Block> BAMBOO_FLOORING_SLAB = registerBlock("bamboo_flooring_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC)));

    public static final RegistryObject<Block> CRIMSON_FLOORING_STAIRS = registerBlock("crimson_flooring_stairs", () ->
            new StairBlock(BBBlocks.CRIMSON_FLOORING.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.CRIMSON_FLOORING.get())));

    public static final RegistryObject<Block> CRIMSON_FLOORING_SLAB = registerBlock("crimson_flooring_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.CRIMSON_FLOORING.get())));

    public static final RegistryObject<Block> WARPED_FLOORING_STAIRS = registerBlock("warped_flooring_stairs", () ->
            new StairBlock(BBBlocks.WARPED_FLOORING.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.WARPED_FLOORING.get())));

    public static final RegistryObject<Block> WARPED_FLOORING_SLAB = registerBlock("warped_flooring_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.WARPED_FLOORING.get())));



    public static final RegistryObject<Block> INFESTED_MOSSY_COBBLESTONE = registerBlock("infested_mossy_cobblestone", () ->
            new InfestedBlock(Blocks.MOSSY_COBBLESTONE, BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final RegistryObject<Block> COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> INFESTED_COBBLESTONE_BRICKS = registerBlock("infested_cobblestone_bricks", () ->
            new InfestedBlock(BBBlocks.COBBLESTONE_BRICKS.get(), BlockBehaviour.Properties.copy(BBBlocks.COBBLESTONE_BRICKS.get())));

    public static final RegistryObject<Block> COBBLESTONE_BRICK_STAIRS = registerBlock("cobblestone_brick_stairs", () ->
            new StairBlock(BBBlocks.COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.COBBLESTONE_BRICKS.get())));

    public static final RegistryObject<Block> COBBLESTONE_BRICK_SLAB = registerBlock("cobblestone_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.COBBLESTONE_BRICKS.get())));

    public static final RegistryObject<Block> COBBLESTONE_BRICK_WALL = registerBlock("cobblestone_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.COBBLESTONE_BRICKS.get())));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICKS = registerBlock("mossy_cobblestone_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final RegistryObject<Block> INFESTED_MOSSY_COBBLESTONE_BRICKS = registerBlock("infested_mossy_cobblestone_bricks", () ->
            new InfestedBlock(BBBlocks.MOSSY_COBBLESTONE_BRICKS.get(), BlockBehaviour.Properties.copy(BBBlocks.MOSSY_COBBLESTONE_BRICKS.get())));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_STAIRS = registerBlock("mossy_cobblestone_brick_stairs", () ->
            new StairBlock(BBBlocks.MOSSY_COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.MOSSY_COBBLESTONE_BRICKS.get())));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_SLAB = registerBlock("mossy_cobblestone_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.MOSSY_COBBLESTONE_BRICKS.get())));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_WALL = registerBlock("mossy_cobblestone_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.MOSSY_COBBLESTONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_COBBLESTONE = registerBlock("polished_cobblestone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> POLISHED_COBBLESTONE_STAIRS = registerBlock("polished_cobblestone_stairs", () ->
            new StairBlock(BBBlocks.POLISHED_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.POLISHED_COBBLESTONE.get())));

    public static final RegistryObject<Block> POLISHED_COBBLESTONE_SLAB = registerBlock("polished_cobblestone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_COBBLESTONE.get())));

    public static final RegistryObject<Block> POLISHED_COBBLESTONE_WALL = registerBlock("polished_cobblestone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_COBBLESTONE.get())));

    public static final RegistryObject<Block> COBBLESTONE_TILES = registerBlock("cobblestone_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> COBBLESTONE_TILE_STAIRS = registerBlock("cobblestone_tile_stairs", () ->
            new StairBlock(BBBlocks.COBBLESTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.COBBLESTONE_TILES.get())));

    public static final RegistryObject<Block> COBBLESTONE_TILE_SLAB = registerBlock("cobblestone_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.COBBLESTONE_TILES.get())));

    public static final RegistryObject<Block> COBBLESTONE_TILE_WALL = registerBlock("cobblestone_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.COBBLESTONE_TILES.get())));

    public static final RegistryObject<Block> POLISHED_MOSSY_COBBLESTONE = registerBlock("polished_mossy_cobblestone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final RegistryObject<Block> POLISHED_MOSSY_COBBLESTONE_STAIRS = registerBlock("polished_mossy_cobblestone_stairs", () ->
            new StairBlock(BBBlocks.POLISHED_MOSSY_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.POLISHED_MOSSY_COBBLESTONE.get())));

    public static final RegistryObject<Block> POLISHED_MOSSY_COBBLESTONE_SLAB = registerBlock("polished_mossy_cobblestone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_MOSSY_COBBLESTONE.get())));

    public static final RegistryObject<Block> POLISHED_MOSSY_COBBLESTONE_WALL = registerBlock("polished_mossy_cobblestone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_MOSSY_COBBLESTONE.get())));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_TILES = registerBlock("mossy_cobblestone_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_TILE_STAIRS = registerBlock("mossy_cobblestone_tile_stairs", () ->
            new StairBlock(BBBlocks.MOSSY_COBBLESTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.MOSSY_COBBLESTONE_TILES.get())));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_TILE_SLAB = registerBlock("mossy_cobblestone_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.MOSSY_COBBLESTONE_TILES.get())));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_TILE_WALL = registerBlock("mossy_cobblestone_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.MOSSY_COBBLESTONE_TILES.get())));

    public static final RegistryObject<Block> INFESTED_COBBLESTONE_TILES = registerBlock("infested_cobblestone_tiles", () ->
            new InfestedBlock(BBBlocks.COBBLESTONE_TILES.get(), BlockBehaviour.Properties.copy(BBBlocks.COBBLESTONE_TILES.get())));

    public static final RegistryObject<Block> INFESTED_MOSSY_COBBLESTONE_TILES = registerBlock("infested_mossy_cobblestone_tiles", () ->
            new InfestedBlock(BBBlocks.MOSSY_COBBLESTONE_TILES.get(), BlockBehaviour.Properties.copy(BBBlocks.MOSSY_COBBLESTONE_TILES.get())));

    public static final RegistryObject<Block> INFESTED_POLISHED_COBBLESTONE = registerBlock("infested_polished_cobblestone", () ->
            new InfestedBlock(BBBlocks.POLISHED_COBBLESTONE.get(), BlockBehaviour.Properties.copy(BBBlocks.POLISHED_COBBLESTONE.get())));

    public static final RegistryObject<Block> INFESTED_POLISHED_MOSSY_COBBLESTONE = registerBlock("infested_polished_mossy_cobblestone", () ->
            new InfestedBlock(BBBlocks.POLISHED_MOSSY_COBBLESTONE.get(), BlockBehaviour.Properties.copy(BBBlocks.POLISHED_MOSSY_COBBLESTONE.get())));



    public static final RegistryObject<Block> MOSSY_CRACKED_STONE_BRICKS = registerBlock("mossy_cracked_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));

    public static final RegistryObject<Block> INFESTED_MOSSY_CRACKED_STONE_BRICKS = registerBlock("infested_mossy_cracked_stone_bricks", () ->
            new InfestedBlock(BBBlocks.MOSSY_CRACKED_STONE_BRICKS.get(), BlockBehaviour.Properties.copy(BBBlocks.MOSSY_CRACKED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> MOSSY_CHISELED_STONE_BRICKS = registerBlock("mossy_chiseled_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));

    public static final RegistryObject<Block> INFESTED_MOSSY_CHISELED_STONE_BRICKS = registerBlock("infested_mossy_chiseled_stone_bricks", () ->
            new InfestedBlock(BBBlocks.MOSSY_CHISELED_STONE_BRICKS.get(), BlockBehaviour.Properties.copy(BBBlocks.MOSSY_CHISELED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> STONE_TILES = registerBlock("stone_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> INFESTED_STONE_TILES = registerBlock("infested_stone_tiles", () ->
            new InfestedBlock(BBBlocks.STONE_TILES.get(), BlockBehaviour.Properties.copy(BBBlocks.STONE_TILES.get())));

    public static final RegistryObject<Block> STONE_TILE_STAIRS = registerBlock("stone_tile_stairs", () ->
            new StairBlock(BBBlocks.STONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.STONE_TILES.get())));

    public static final RegistryObject<Block> STONE_TILE_SLAB = registerBlock("stone_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.STONE_TILES.get())));

    public static final RegistryObject<Block> STONE_TILE_WALL = registerBlock("stone_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.STONE_TILES.get())));

    public static final RegistryObject<Block> MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));

    public static final RegistryObject<Block> INFESTED_MOSSY_STONE_TILES = registerBlock("infested_mossy_stone_tiles", () ->
            new InfestedBlock(BBBlocks.MOSSY_STONE_TILES.get(), BlockBehaviour.Properties.copy(BBBlocks.MOSSY_STONE_TILES.get())));

    public static final RegistryObject<Block> MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs", () ->
            new StairBlock(BBBlocks.MOSSY_STONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.MOSSY_STONE_TILES.get())));

    public static final RegistryObject<Block> MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.MOSSY_STONE_TILES.get())));

    public static final RegistryObject<Block> MOSSY_STONE_TILE_WALL = registerBlock("mossy_stone_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.MOSSY_STONE_TILES.get())));



    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));

    public static final RegistryObject<Block> CHISELED_ANDESITE = registerBlock("chiseled_andesite", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));

    public static final RegistryObject<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));

    public static final RegistryObject<Block> ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs", () ->
            new StairBlock(BBBlocks.ANDESITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.ANDESITE_BRICKS.get())));

    public static final RegistryObject<Block> ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.ANDESITE_BRICKS.get())));

    public static final RegistryObject<Block> ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.ANDESITE_BRICKS.get())));

    public static final RegistryObject<Block> ANDESITE_TILES = registerBlock("andesite_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));

    public static final RegistryObject<Block> ANDESITE_TILE_STAIRS = registerBlock("andesite_tile_stairs", () ->
            new StairBlock(BBBlocks.ANDESITE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.ANDESITE_TILES.get())));

    public static final RegistryObject<Block> ANDESITE_TILE_SLAB = registerBlock("andesite_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.ANDESITE_TILES.get())));

    public static final RegistryObject<Block> ANDESITE_TILE_WALL = registerBlock("andesite_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.ANDESITE_TILES.get())));



    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));

    public static final RegistryObject<Block> CHISELED_DIORITE = registerBlock("chiseled_diorite", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));

    public static final RegistryObject<Block> DIORITE_BRICKS = registerBlock("diorite_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));

    public static final RegistryObject<Block> DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs", () ->
            new StairBlock(BBBlocks.DIORITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.DIORITE_BRICKS.get())));

    public static final RegistryObject<Block> DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.DIORITE_BRICKS.get())));

    public static final RegistryObject<Block> DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.DIORITE_BRICKS.get())));

    public static final RegistryObject<Block> DIORITE_TILES = registerBlock("diorite_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));

    public static final RegistryObject<Block> DIORITE_TILE_STAIRS = registerBlock("diorite_tile_stairs", () ->
            new StairBlock(BBBlocks.DIORITE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.DIORITE_TILES.get())));

    public static final RegistryObject<Block> DIORITE_TILE_SLAB = registerBlock("diorite_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.DIORITE_TILES.get())));

    public static final RegistryObject<Block> DIORITE_TILE_WALL = registerBlock("diorite_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.DIORITE_TILES.get())));



    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));

    public static final RegistryObject<Block> CHISELED_GRANITE = registerBlock("chiseled_granite", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));

    public static final RegistryObject<Block> GRANITE_BRICKS = registerBlock("granite_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));

    public static final RegistryObject<Block> GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs", () ->
            new StairBlock(BBBlocks.GRANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.GRANITE_BRICKS.get())));

    public static final RegistryObject<Block> GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.GRANITE_BRICKS.get())));

    public static final RegistryObject<Block> GRANITE_BRICK_WALL = registerBlock("granite_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.GRANITE_BRICKS.get())));

    public static final RegistryObject<Block> GRANITE_TILES = registerBlock("granite_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));

    public static final RegistryObject<Block> GRANITE_TILE_STAIRS = registerBlock("granite_tile_stairs", () ->
            new StairBlock(BBBlocks.GRANITE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.GRANITE_TILES.get())));

    public static final RegistryObject<Block> GRANITE_TILE_SLAB = registerBlock("granite_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.GRANITE_TILES.get())));

    public static final RegistryObject<Block> GRANITE_TILE_WALL = registerBlock("granite_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.GRANITE_TILES.get())));



    public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs", () ->
            new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> DRIPSTONE_WALL = registerBlock("dripstone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs", () ->
            new StairBlock(BBBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.POLISHED_DRIPSTONE.get())));

    public static final RegistryObject<Block> POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_DRIPSTONE.get())));

    public static final RegistryObject<Block> POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_DRIPSTONE.get())));

    public static final RegistryObject<Block> CHISELED_DRIPSTONE = registerBlock("chiseled_dripstone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs", () ->
            new StairBlock(BBBlocks.DRIPSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.DRIPSTONE_BRICKS.get())));

    public static final RegistryObject<Block> DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.DRIPSTONE_BRICKS.get())));

    public static final RegistryObject<Block> DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.DRIPSTONE_BRICKS.get())));

    public static final RegistryObject<Block> DRIPSTONE_TILES = registerBlock("dripstone_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> DRIPSTONE_TILE_STAIRS = registerBlock("dripstone_tile_stairs", () ->
            new StairBlock(BBBlocks.DRIPSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.DRIPSTONE_TILES.get())));

    public static final RegistryObject<Block> DRIPSTONE_TILE_SLAB = registerBlock("dripstone_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.DRIPSTONE_TILES.get())));

    public static final RegistryObject<Block> DRIPSTONE_TILE_WALL = registerBlock("dripstone_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.DRIPSTONE_TILES.get())));



    public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));

    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));



    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE)));

    public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs", () ->
            new StairBlock(Blocks.CUT_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE)));

    public static final RegistryObject<Block> CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE)));

    public static final RegistryObject<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs", () ->
            new StairBlock(BBBlocks.SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> SANDSTONE_TILES = registerBlock("sandstone_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> SANDSTONE_TILE_STAIRS = registerBlock("sandstone_tile_stairs", () ->
            new StairBlock(BBBlocks.SANDSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.SANDSTONE_TILES.get())));

    public static final RegistryObject<Block> SANDSTONE_TILE_SLAB = registerBlock("sandstone_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.SANDSTONE_TILES.get())));

    public static final RegistryObject<Block> SANDSTONE_TILE_WALL = registerBlock("sandstone_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.SANDSTONE_TILES.get())));



    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE)));

    public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs", () ->
            new StairBlock(Blocks.CUT_RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE)));

    public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs", () ->
            new StairBlock(BBBlocks.RED_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.RED_SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.RED_SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.RED_SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> RED_SANDSTONE_TILES = registerBlock("red_sandstone_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_TILE_STAIRS = registerBlock("red_sandstone_tile_stairs", () ->
            new StairBlock(BBBlocks.RED_SANDSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.RED_SANDSTONE_TILES.get())));

    public static final RegistryObject<Block> RED_SANDSTONE_TILE_SLAB = registerBlock("red_sandstone_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.RED_SANDSTONE_TILES.get())));

    public static final RegistryObject<Block> RED_SANDSTONE_TILE_WALL = registerBlock("red_sandstone_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.RED_SANDSTONE_TILES.get())));



    public static final RegistryObject<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs", () ->
            new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> DEEPSLATE_WALL = registerBlock("deepslate_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));



    public static final RegistryObject<Block> TUFF_STAIRS = registerBlock("tuff_stairs", () ->
            new StairBlock(Blocks.TUFF.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_SLAB = registerBlock("tuff_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_WALL = registerBlock("tuff_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));


    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs", () ->
            new StairBlock(Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CHISELED_CALCITE = registerBlock("chiseled_calcite", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> POLISHED_CALCITE = registerBlock("polished_calcite", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs", () ->
            new StairBlock(BBBlocks.POLISHED_CALCITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.POLISHED_CALCITE.get())));

    public static final RegistryObject<Block> POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_CALCITE.get())));

    public static final RegistryObject<Block> POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_CALCITE.get())));

    public static final RegistryObject<Block> CALCITE_BRICKS = registerBlock("calcite_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs", () ->
            new StairBlock(BBBlocks.CALCITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.CALCITE_BRICKS.get())));

    public static final RegistryObject<Block> CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.CALCITE_BRICKS.get())));

    public static final RegistryObject<Block> CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.CALCITE_BRICKS.get())));

    public static final RegistryObject<Block> CALCITE_TILES = registerBlock("calcite_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CALCITE_TILE_STAIRS = registerBlock("calcite_tile_stairs", () ->
            new StairBlock(BBBlocks.CALCITE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.CALCITE_TILES.get())));

    public static final RegistryObject<Block> CALCITE_TILE_SLAB = registerBlock("calcite_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.CALCITE_TILES.get())));

    public static final RegistryObject<Block> CALCITE_TILE_WALL = registerBlock("calcite_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.CALCITE_TILES.get())));



    public static final RegistryObject<Block> LARGE_CHAIN = registerBlock("large_chain", () ->
            new LargeChainBlock(BlockBehaviour.Properties.copy(Blocks.CHAIN)));



    public static final RegistryObject<Block> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs", () ->
            new StairBlock(Blocks.PACKED_MUD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<Block> PACKED_MUD_SLAB = registerBlock("packed_mud_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<Block> PACKED_MUD_WALL = registerBlock("packed_mud_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<Block> MUD_TILES = registerBlock("mud_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<Block> MUD_TILE_STAIRS = registerBlock("mud_tile_stairs", () ->
            new StairBlock(BBBlocks.MUD_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.MUD_TILES.get())));

    public static final RegistryObject<Block> MUD_TILE_SLAB = registerBlock("mud_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.MUD_TILES.get())));

    public static final RegistryObject<Block> MUD_TILE_WALL = registerBlock("mud_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.MUD_TILES.get())));

    public static final RegistryObject<Block> CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    public static final RegistryObject<Block> SMOOTH_MUD = registerBlock("smooth_mud", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    public static final RegistryObject<Block> SMOOTH_MUD_STAIRS = registerBlock("smooth_mud_stairs", () ->
            new StairBlock(BBBlocks.SMOOTH_MUD.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_MUD.get())));

    public static final RegistryObject<Block> SMOOTH_MUD_SLAB = registerBlock("smooth_mud_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_MUD.get())));

    public static final RegistryObject<Block> SMOOTH_MUD_WALL = registerBlock("smooth_mud_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_MUD.get())));



    public static final RegistryObject<Block> SMOOTH_MUD_PRESSURE_PLATE = registerBlock("smooth_mud_pressure_plate", () ->
            new MudPressurePlateBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<Block> SMOOTH_MUD_BUTTON = registerBlock("smooth_mud_button", () ->
            new MudButtonBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));



    public static final RegistryObject<Block> CHISELED_OBSIDIAN = registerBlock("chiseled_obsidian", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));

    public static final RegistryObject<Block> POLISHED_OBSIDIAN = registerBlock("polished_obsidian", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));

    public static final RegistryObject<Block> POLISHED_OBSIDIAN_STAIRS = registerBlock("polished_obsidian_stairs", () ->
            new StairBlock(BBBlocks.POLISHED_OBSIDIAN.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.POLISHED_OBSIDIAN.get())));

    public static final RegistryObject<Block> POLISHED_OBSIDIAN_SLAB = registerBlock("polished_obsidian_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_OBSIDIAN.get())));

    public static final RegistryObject<Block> POLISHED_OBSIDIAN_WALL = registerBlock("polished_obsidian_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_OBSIDIAN.get())));

    public static final RegistryObject<Block> OBSIDIAN_BRICKS = registerBlock("obsidian_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));

    public static final RegistryObject<Block> OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs", () ->
            new StairBlock(BBBlocks.OBSIDIAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.OBSIDIAN_BRICKS.get())));

    public static final RegistryObject<Block> OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.OBSIDIAN_BRICKS.get())));

    public static final RegistryObject<Block> OBSIDIAN_BRICK_WALL = registerBlock("obsidian_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.OBSIDIAN_BRICKS.get())));

    public static final RegistryObject<Block> OBSIDIAN_TILES = registerBlock("obsidian_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));

    public static final RegistryObject<Block> OBSIDIAN_TILE_STAIRS = registerBlock("obsidian_tile_stairs", () ->
            new StairBlock(BBBlocks.OBSIDIAN_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.OBSIDIAN_TILES.get())));

    public static final RegistryObject<Block> OBSIDIAN_TILE_SLAB = registerBlock("obsidian_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.OBSIDIAN_TILES.get())));

    public static final RegistryObject<Block> OBSIDIAN_TILE_WALL = registerBlock("obsidian_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.OBSIDIAN_TILES.get())));





    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)));

    public static final RegistryObject<Block> CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)));

    public static final RegistryObject<Block> RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)));



    public static final RegistryObject<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs", () ->
            new StairBlock(Blocks.END_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.END_STONE)));

    public static final RegistryObject<Block> END_STONE_SLAB = registerBlock("end_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)));

    public static final RegistryObject<Block> END_STONE_WALL = registerBlock("end_stone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)));

    public static final RegistryObject<Block> CHISELED_END_STONE = registerBlock("chiseled_end_stone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)));

    public static final RegistryObject<Block> POLISHED_END_STONE = registerBlock("polished_end_stone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)));

    public static final RegistryObject<Block> POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs", () ->
            new StairBlock(BBBlocks.POLISHED_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.POLISHED_END_STONE.get())));

    public static final RegistryObject<Block> POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_END_STONE.get())));

    public static final RegistryObject<Block> POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_END_STONE.get())));


    public static final RegistryObject<Block> END_STONE_TILES = registerBlock("end_stone_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)));
    public static final RegistryObject<Block> END_STONE_TILE_STAIRS = registerBlock("end_stone_tile_stairs", () ->
            new StairBlock(BBBlocks.END_STONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.END_STONE_TILES.get())));

    public static final RegistryObject<Block> END_STONE_TILE_SLAB = registerBlock("end_stone_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.END_STONE_TILES.get())));

    public static final RegistryObject<Block> END_STONE_TILE_WALL = registerBlock("end_stone_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.END_STONE_TILES.get())));



    public static final RegistryObject<Block> CHISELED_PURPUR = registerBlock("chiseled_purpur", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)));
    public static final RegistryObject<Block> POLISHED_PURPUR = registerBlock("polished_purpur", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)));

    public static final RegistryObject<Block> POLISHED_PURPUR_STAIRS = registerBlock("polished_purpur_stairs", () ->
            new StairBlock(BBBlocks.POLISHED_PURPUR.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.POLISHED_PURPUR.get())));

    public static final RegistryObject<Block> POLISHED_PURPUR_SLAB = registerBlock("polished_purpur_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_PURPUR.get())));

    public static final RegistryObject<Block> POLISHED_PURPUR_WALL = registerBlock("polished_purpur_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_PURPUR.get())));

    public static final RegistryObject<Block> PURPUR_BRICKS = registerBlock("purpur_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)));

    public static final RegistryObject<Block> PURPUR_BRICK_STAIRS = registerBlock("purpur_brick_stairs", () ->
            new StairBlock(BBBlocks.PURPUR_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.PURPUR_BRICKS.get())));

    public static final RegistryObject<Block> PURPUR_BRICK_SLAB = registerBlock("purpur_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.PURPUR_BRICKS.get())));

    public static final RegistryObject<Block> PURPUR_BRICK_WALL = registerBlock("purpur_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.PURPUR_BRICKS.get())));

    public static final RegistryObject<Block> PURPUR_TILE_WALL = registerBlock("purpur_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)));



    public static final RegistryObject<Block> BLACKSTONE_TILES = registerBlock("blackstone_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));

    public static final RegistryObject<Block> BLACKSTONE_TILE_STAIRS = registerBlock("blackstone_tile_stairs", () ->
            new StairBlock(BBBlocks.BLACKSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.BLACKSTONE_TILES.get())));

    public static final RegistryObject<Block> BLACKSTONE_TILE_SLAB = registerBlock("blackstone_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.BLACKSTONE_TILES.get())));

    public static final RegistryObject<Block> BLACKSTONE_TILE_WALL = registerBlock("blackstone_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.BLACKSTONE_TILES.get())));



    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs", () ->
            new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> POLISHED_SMOOTH_BASALT = registerBlock("polished_smooth_basalt", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> POLISHED_SMOOTH_BASALT_STAIRS = registerBlock("polished_smooth_basalt_stairs", () ->
            new StairBlock(BBBlocks.POLISHED_SMOOTH_BASALT.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.POLISHED_SMOOTH_BASALT.get())));

    public static final RegistryObject<Block> POLISHED_SMOOTH_BASALT_SLAB = registerBlock("polished_smooth_basalt_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_SMOOTH_BASALT.get())));

    public static final RegistryObject<Block> POLISHED_SMOOTH_BASALT_WALL = registerBlock("polished_smooth_basalt_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_SMOOTH_BASALT.get())));

    public static final RegistryObject<Block> SMOOTH_BASALT_BRICKS = registerBlock("smooth_basalt_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> SMOOTH_BASALT_BRICK_STAIRS = registerBlock("smooth_basalt_brick_stairs", () ->
            new StairBlock(BBBlocks.SMOOTH_BASALT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_BASALT_BRICKS.get())));

    public static final RegistryObject<Block> SMOOTH_BASALT_BRICK_SLAB = registerBlock("smooth_basalt_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_BASALT_BRICKS.get())));

    public static final RegistryObject<Block> SMOOTH_BASALT_BRICK_WALL = registerBlock("smooth_basalt_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_BASALT_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_SMOOTH_BASALT_BRICKS = registerBlock("cracked_smooth_basalt_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> CHISELED_SMOOTH_BASALT = registerBlock("chiseled_smooth_basalt", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> SMOOTH_BASALT_TILES = registerBlock("smooth_basalt_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> SMOOTH_BASALT_TILE_STAIRS = registerBlock("smooth_basalt_tile_stairs", () ->
            new StairBlock(BBBlocks.SMOOTH_BASALT_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_BASALT_TILES.get())));

    public static final RegistryObject<Block> SMOOTH_BASALT_TILE_SLAB = registerBlock("smooth_basalt_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_BASALT_TILES.get())));

    public static final RegistryObject<Block> SMOOTH_BASALT_TILE_WALL = registerBlock("smooth_basalt_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.SMOOTH_BASALT_TILES.get())));



    public static final RegistryObject<Block> CARVED_SNOW = registerBlock("carved_snow", () ->
            new CarvedSnowBlock(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK).strength(0.4f)));

    public static final RegistryObject<Block> PACKED_SNOW = registerBlock("packed_snow", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK).strength(0.4f)));

    public static final RegistryObject<Block> PACKED_SNOW_STAIRS = registerBlock("packed_snow_stairs", () ->
            new StairBlock(BBBlocks.PACKED_SNOW.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.PACKED_SNOW.get())));

    public static final RegistryObject<Block> PACKED_SNOW_SLAB = registerBlock("packed_snow_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.PACKED_SNOW.get())));

    public static final RegistryObject<Block> PACKED_SNOW_WALL = registerBlock("packed_snow_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.PACKED_SNOW.get())));

    public static final RegistryObject<Block> SNOW_BRICKS = registerBlock("snow_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK).strength(0.4f)));

    public static final RegistryObject<Block> SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs", () ->
            new StairBlock(BBBlocks.SNOW_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.SNOW_BRICKS.get())));

    public static final RegistryObject<Block> SNOW_BRICK_SLAB = registerBlock("snow_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.SNOW_BRICKS.get())));

    public static final RegistryObject<Block> SNOW_BRICK_WALL = registerBlock("snow_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.SNOW_BRICKS.get())));



    public static final RegistryObject<Block> POLISHED_ICE = registerBlock("polished_ice", () ->
            new IceBlock(BlockBehaviour.Properties.copy(Blocks.ICE)));

    public static final RegistryObject<Block> POLISHED_ICE_STAIRS = registerBlock("polished_ice_stairs", () ->
            new StairBlock(BBBlocks.POLISHED_ICE.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.POLISHED_ICE.get())));

    public static final RegistryObject<Block> POLISHED_ICE_SLAB = registerBlock("polished_ice_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_ICE.get())));

    public static final RegistryObject<Block> POLISHED_ICE_WALL = registerBlock("polished_ice_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.POLISHED_ICE.get())));

    public static final RegistryObject<Block> ICE_BRICKS = registerBlock("ice_bricks", () ->
            new IceBlock(BlockBehaviour.Properties.copy(Blocks.ICE)));

    public static final RegistryObject<Block> ICE_BRICK_STAIRS = registerBlock("ice_brick_stairs", () ->
            new StairBlock(BBBlocks.ICE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.ICE_BRICKS.get())));

    public static final RegistryObject<Block> ICE_BRICK_SLAB = registerBlock("ice_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.ICE_BRICKS.get())));

    public static final RegistryObject<Block> ICE_BRICK_WALL = registerBlock("ice_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.ICE_BRICKS.get())));

    public static final RegistryObject<Block> ICE_TILES = registerBlock("ice_tiles", () ->
            new IceBlock(BlockBehaviour.Properties.copy(Blocks.ICE)));

    public static final RegistryObject<Block> ICE_TILE_STAIRS = registerBlock("ice_tile_stairs", () ->
            new StairBlock(BBBlocks.ICE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.ICE_TILES.get())));

    public static final RegistryObject<Block> ICE_TILE_SLAB = registerBlock("ice_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.ICE_TILES.get())));

    public static final RegistryObject<Block> ICE_TILE_WALL = registerBlock("ice_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.ICE_TILES.get())));

    public static final RegistryObject<Block> CHISELED_ICE = registerBlock("chiseled_ice", () ->
            new IceBlock(BlockBehaviour.Properties.copy(Blocks.ICE)));



    public static final RegistryObject<Block> POLISHED_PACKED_ICE = registerBlock("polished_packed_ice", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)));

    public static final RegistryObject<Block> POLISHED_PACKED_ICE_STAIRS = registerBlock("polished_packed_ice_stairs", () ->
            new StairBlock(Blocks.PACKED_ICE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)));

    public static final RegistryObject<Block> POLISHED_PACKED_ICE_SLAB = registerBlock("polished_packed_ice_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)));

    public static final RegistryObject<Block> POLISHED_PACKED_ICE_WALL = registerBlock("polished_packed_ice_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)));

    public static final RegistryObject<Block> PACKED_ICE_BRICKS = registerBlock("packed_ice_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)));

    public static final RegistryObject<Block> PACKED_ICE_BRICK_STAIRS = registerBlock("packed_ice_brick_stairs", () ->
            new StairBlock(BBBlocks.PACKED_ICE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.PACKED_ICE_BRICKS.get())));

    public static final RegistryObject<Block> PACKED_ICE_BRICK_SLAB = registerBlock("packed_ice_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.PACKED_ICE_BRICKS.get())));

    public static final RegistryObject<Block> PACKED_ICE_BRICK_WALL = registerBlock("packed_ice_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.PACKED_ICE_BRICKS.get())));

    public static final RegistryObject<Block> PACKED_ICE_TILES = registerBlock("packed_ice_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)));

    public static final RegistryObject<Block> PACKED_ICE_TILE_STAIRS = registerBlock("packed_ice_tile_stairs", () ->
            new StairBlock(BBBlocks.PACKED_ICE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.PACKED_ICE_TILES.get())));

    public static final RegistryObject<Block> PACKED_ICE_TILE_SLAB = registerBlock("packed_ice_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.PACKED_ICE_TILES.get())));

    public static final RegistryObject<Block> PACKED_ICE_TILE_WALL = registerBlock("packed_ice_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.PACKED_ICE_TILES.get())));

    public static final RegistryObject<Block> CHISELED_PACKED_ICE = registerBlock("chiseled_packed_ice", () ->
            new BBHorizontalDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)));



    public static final RegistryObject<Block> POLISHED_BLUE_ICE = registerBlock("polished_blue_ice", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE)));

    public static final RegistryObject<Block> POLISHED_BLUE_ICE_STAIRS = registerBlock("polished_blue_ice_stairs", () ->
            new StairBlock(Blocks.BLUE_ICE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_ICE)));

    public static final RegistryObject<Block> POLISHED_BLUE_ICE_SLAB = registerBlock("polished_blue_ice_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE)));

    public static final RegistryObject<Block> POLISHED_BLUE_ICE_WALL = registerBlock("polished_blue_ice_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE)));

    public static final RegistryObject<Block> BLUE_ICE_BRICKS = registerBlock("blue_ice_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE)));

    public static final RegistryObject<Block> BLUE_ICE_BRICK_STAIRS = registerBlock("blue_ice_brick_stairs", () ->
            new StairBlock(BBBlocks.BLUE_ICE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.BLUE_ICE_BRICKS.get())));

    public static final RegistryObject<Block> BLUE_ICE_BRICK_SLAB = registerBlock("blue_ice_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.BLUE_ICE_BRICKS.get())));

    public static final RegistryObject<Block> BLUE_ICE_BRICK_WALL = registerBlock("blue_ice_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.BLUE_ICE_BRICKS.get())));

    public static final RegistryObject<Block> BLUE_ICE_TILES = registerBlock("blue_ice_tiles", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE)));

    public static final RegistryObject<Block> BLUE_ICE_TILE_STAIRS = registerBlock("blue_ice_tile_stairs", () ->
            new StairBlock(BBBlocks.BLUE_ICE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.BLUE_ICE_TILES.get())));

    public static final RegistryObject<Block> BLUE_ICE_TILE_SLAB = registerBlock("blue_ice_tile_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.BLUE_ICE_TILES.get())));

    public static final RegistryObject<Block> BLUE_ICE_TILE_WALL = registerBlock("blue_ice_tile_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.BLUE_ICE_TILES.get())));

    public static final RegistryObject<Block> CHISELED_BLUE_ICE = registerBlock("chiseled_blue_ice", () ->
            new BBHorizontalDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE)));



    public static final RegistryObject<Block> WHITE_THREADED_WOOL = registerBlock("white_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> WHITE_THREADED_CARPET = registerBlock("white_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CARPET)));

    public static final RegistryObject<Block> LIGHT_GRAY_THREADED_WOOL = registerBlock("light_gray_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)));

    public static final RegistryObject<Block> LIGHT_GRAY_THREADED_CARPET = registerBlock("light_gray_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CARPET)));

    public static final RegistryObject<Block> GRAY_THREADED_WOOL = registerBlock("gray_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));

    public static final RegistryObject<Block> GRAY_THREADED_CARPET = registerBlock("gray_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CARPET)));

    public static final RegistryObject<Block> BLACK_THREADED_WOOL = registerBlock("black_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));

    public static final RegistryObject<Block> BLACK_THREADED_CARPET = registerBlock("black_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CARPET)));

    public static final RegistryObject<Block> BROWN_THREADED_WOOL = registerBlock("brown_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));

    public static final RegistryObject<Block> BROWN_THREADED_CARPET = registerBlock("brown_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CARPET)));

    public static final RegistryObject<Block> RED_THREADED_WOOL = registerBlock("red_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));

    public static final RegistryObject<Block> RED_THREADED_CARPET = registerBlock("red_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.RED_CARPET)));

    public static final RegistryObject<Block> ORANGE_THREADED_WOOL = registerBlock("orange_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)));

    public static final RegistryObject<Block> ORANGE_THREADED_CARPET = registerBlock("orange_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CARPET)));

    public static final RegistryObject<Block> YELLOW_THREADED_WOOL = registerBlock("yellow_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));

    public static final RegistryObject<Block> YELLOW_THREADED_CARPET = registerBlock("yellow_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CARPET)));

    public static final RegistryObject<Block> LIME_THREADED_WOOL = registerBlock("lime_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)));

    public static final RegistryObject<Block> LIME_THREADED_CARPET = registerBlock("lime_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CARPET)));

    public static final RegistryObject<Block> GREEN_THREADED_WOOL = registerBlock("green_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));

    public static final RegistryObject<Block> GREEN_THREADED_CARPET = registerBlock("green_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CARPET)));

    public static final RegistryObject<Block> CYAN_THREADED_WOOL = registerBlock("cyan_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)));

    public static final RegistryObject<Block> CYAN_THREADED_CARPET = registerBlock("cyan_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CARPET)));

    public static final RegistryObject<Block> LIGHT_BLUE_THREADED_WOOL = registerBlock("light_blue_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));

    public static final RegistryObject<Block> LIGHT_BLUE_THREADED_CARPET = registerBlock("light_blue_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CARPET)));

    public static final RegistryObject<Block> BLUE_THREADED_WOOL = registerBlock("blue_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));

    public static final RegistryObject<Block> BLUE_THREADED_CARPET = registerBlock("blue_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CARPET)));

    public static final RegistryObject<Block> PURPLE_THREADED_WOOL = registerBlock("purple_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)));

    public static final RegistryObject<Block> PURPLE_THREADED_CARPET = registerBlock("purple_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CARPET)));

    public static final RegistryObject<Block> MAGENTA_THREADED_WOOL = registerBlock("magenta_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)));

    public static final RegistryObject<Block> MAGENTA_THREADED_CARPET = registerBlock("magenta_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CARPET)));

    public static final RegistryObject<Block> PINK_THREADED_WOOL = registerBlock("pink_threaded_wool", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)));

    public static final RegistryObject<Block> PINK_THREADED_CARPET = registerBlock("pink_threaded_carpet", () ->
            new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CARPET)));



    public static final RegistryObject<Block> TERRACOTTA_STAIRS = registerBlock("terracotta_stairs", () ->
            new StairBlock(Blocks.TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> TERRACOTTA_SLAB = registerBlock("terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> TERRACOTTA_WALL = registerBlock("terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs", () ->
            new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs", () ->
            new StairBlock(Blocks.GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs", () ->
            new StairBlock(Blocks.BLACK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs", () ->
            new StairBlock(Blocks.WHITE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs", () ->
            new StairBlock(Blocks.BROWN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs", () ->
            new StairBlock(Blocks.RED_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs", () ->
            new StairBlock(Blocks.ORANGE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs", () ->
            new StairBlock(Blocks.YELLOW_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs", () ->
            new StairBlock(Blocks.LIME_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs", () ->
            new StairBlock(Blocks.GREEN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs", () ->
            new StairBlock(Blocks.CYAN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs", () ->
            new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs", () ->
            new StairBlock(Blocks.BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs", () ->
            new StairBlock(Blocks.PURPLE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs", () ->
            new StairBlock(Blocks.MAGENTA_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs", () ->
            new StairBlock(Blocks.PINK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> TERRACOTTA_BRICKS = registerBlock("terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> TERRACOTTA_BRICK_STAIRS = registerBlock("terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> TERRACOTTA_BRICK_WALL = registerBlock("terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_STAIRS = registerBlock("white_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.WHITE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.WHITE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("white_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.WHITE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_WALL = registerBlock("white_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.WHITE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("light_gray_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("light_gray_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_WALL = registerBlock("light_gray_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("gray_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.GRAY_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("gray_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.GRAY_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_WALL = registerBlock("gray_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.GRAY_TERRACOTTA_BRICKS.get())));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_STAIRS = registerBlock("black_terracotta_brick_stairs", () ->
new StairBlock(BBBlocks.BLACK_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.BLACK_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("black_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.BLACK_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_WALL = registerBlock("black_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.BLACK_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_STAIRS = registerBlock("brown_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.BROWN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.BROWN_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("brown_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.BROWN_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_WALL = registerBlock("brown_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.BROWN_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_STAIRS = registerBlock("red_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.RED_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.RED_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_SLAB = registerBlock("red_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.RED_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_WALL = registerBlock("red_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.RED_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlock("orange_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.ORANGE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.ORANGE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("orange_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.ORANGE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_WALL = registerBlock("orange_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.ORANGE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlock("yellow_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.YELLOW_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.YELLOW_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("yellow_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.YELLOW_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_WALL = registerBlock("yellow_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.YELLOW_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_STAIRS = registerBlock("lime_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.LIME_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.LIME_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_SLAB = registerBlock("lime_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.LIME_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_WALL = registerBlock("lime_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.LIME_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_STAIRS = registerBlock("green_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.GREEN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.GREEN_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("green_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.GREEN_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_WALL = registerBlock("green_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.GREEN_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cyan_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.CYAN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.CYAN_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("cyan_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.CYAN_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_WALL = registerBlock("cyan_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.CYAN_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("light_blue_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("light_blue_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_WALL = registerBlock("light_blue_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("blue_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.BLUE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("blue_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.BLUE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_WALL = registerBlock("blue_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.BLUE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlock("purple_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.PURPLE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.PURPLE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("purple_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.PURPLE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_WALL = registerBlock("purple_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.PURPLE_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlock("magenta_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.MAGENTA_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.MAGENTA_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("magenta_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.MAGENTA_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_WALL = registerBlock("magenta_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.MAGENTA_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_STAIRS = registerBlock("pink_terracotta_brick_stairs", () ->
            new StairBlock(BBBlocks.PINK_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BBBlocks.PINK_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_SLAB = registerBlock("pink_terracotta_brick_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(BBBlocks.PINK_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_WALL = registerBlock("pink_terracotta_brick_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(BBBlocks.PINK_TERRACOTTA_BRICKS.get())));

    public static final RegistryObject<Block> GLAZED_TERRACOTTA = registerBlock("glazed_terracotta", () ->
            new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));



    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs", () ->
            new StairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs", () ->
            new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs", () ->
            new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)));

    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)));

    public static final RegistryObject<Block> GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)));

    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs", () ->
            new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)));

    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)));

    public static final RegistryObject<Block> BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)));

    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs", () ->
            new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)));

    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)));

    public static final RegistryObject<Block> BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)));

    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs", () ->
            new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)));

    public static final RegistryObject<Block> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)));

    public static final RegistryObject<Block> RED_CONCRETE_WALL = registerBlock("red_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)));

    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs", () ->
            new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)));

    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)));

    public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)));

    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs", () ->
            new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));

    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));

    public static final RegistryObject<Block> YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));

    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs", () ->
            new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)));

    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)));

    public static final RegistryObject<Block> LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)));

    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs", () ->
            new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));

    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));

    public static final RegistryObject<Block> GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));

    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs", () ->
            new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)));

    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)));

    public static final RegistryObject<Block> CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)));

    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs", () ->
            new StairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs", () ->
            new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)));

    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)));

    public static final RegistryObject<Block> BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)));

    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs", () ->
            new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)));

    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)));

    public static final RegistryObject<Block> PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)));

    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs", () ->
            new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)));

    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)));

    public static final RegistryObject<Block> MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)));

    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs", () ->
            new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)));

    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)));

    public static final RegistryObject<Block> PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall", () ->
            new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)));





    

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return BBItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}