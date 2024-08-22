package net.ultimatech.bountifulblocks.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.ultimatech.bountifulblocks.BountifulBlocks;

public class BBItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BountifulBlocks.MOD_ID);

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
