package net.ultimatech.bountifulblocks.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ultimatech.bountifulblocks.BountifulBlocks;

public class BBItems {



    // ----- REGISTRATION ----- //
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BountifulBlocks.MOD_ID, name), item);
    }

    public static void registerItems() {}
}
