package net.ultimatech.bountifulblocks.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ultimatech.bountifulblocks.BountifulBlocks;

public class BBItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(BountifulBlocks.MOD_ID);

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
