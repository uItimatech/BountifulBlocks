package net.prism.arboreal.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prism.arboreal.Arboreal;

public class ABlocks {

    // ----- REGISTRATION ----- //

    private static Block registerBlock(String name, Block block) {
        registerItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Arboreal.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Arboreal.MOD_ID, name), block);
    }

    private static Item registerItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Arboreal.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        Arboreal.LOGGER.info("Registering blocks for " + Arboreal.MOD_ID);
    }
}
