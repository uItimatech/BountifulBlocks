package net.prism.arboreal;

import net.fabricmc.api.ModInitializer;

import net.prism.arboreal.block.ABlocks;
import net.prism.arboreal.item.AItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Arboreal implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("arboreal");
	public static final String MOD_ID = "arboreal";

	@Override
	public void onInitialize() {

		ABlocks.registerBlocks();
		AItems.registerItems();

		LOGGER.info("Arboreal mod initialized.");
	}
}