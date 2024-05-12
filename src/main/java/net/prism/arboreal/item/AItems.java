package net.prism.arboreal.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prism.arboreal.Arboreal;

public class AItems {



    // ----- REGISTRATION ----- //
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(Arboreal.MOD_ID, name), item);
    }

    public static void registerItems() {
        Arboreal.LOGGER.info("Registering items for " + Arboreal.MOD_ID);
    }
}
