package net.ultimatech.bountifulblocks;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.ultimatech.bountifulblocks.block.BBBlockSetTypes;
import net.ultimatech.bountifulblocks.block.BBBlocks;
import net.ultimatech.bountifulblocks.item.BBItems;
import net.ultimatech.bountifulblocks.tab.BBVanillaCreativeTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import java.util.Map;


@Mod(BountifulBlocks.MOD_ID)
public class BountifulBlocks {

    public static final String MOD_ID = "bountifulblocks";
    public static final Logger LOGGER = LogUtils.getLogger();

    //public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    //public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("example_block", EXAMPLE_BLOCK);

    public static final Map<Block,DeferredBlock<Block>> CARVABLE_PLANKS = ImmutableMap.<Block,DeferredBlock<Block>>builder()
            .put(Blocks.OAK_PLANKS, BBBlocks.CARVED_OAK_PLANKS)
            .put(Blocks.SPRUCE_PLANKS, BBBlocks.CARVED_SPRUCE_PLANKS)
            .put(Blocks.BIRCH_PLANKS, BBBlocks.CARVED_BIRCH_PLANKS)
            .put(Blocks.JUNGLE_PLANKS, BBBlocks.CARVED_JUNGLE_PLANKS)
            .put(Blocks.ACACIA_PLANKS, BBBlocks.CARVED_ACACIA_PLANKS)
            .put(Blocks.DARK_OAK_PLANKS, BBBlocks.CARVED_DARK_OAK_PLANKS)
            .put(Blocks.CHERRY_PLANKS, BBBlocks.CARVED_CHERRY_PLANKS)
            .put(Blocks.MANGROVE_PLANKS, BBBlocks.CARVED_MANGROVE_PLANKS)
            .put(Blocks.BAMBOO_PLANKS, BBBlocks.CARVED_BAMBOO_PLANKS)
            .put(Blocks.CRIMSON_PLANKS, BBBlocks.CARVED_CRIMSON_PLANKS)
            .put(Blocks.WARPED_PLANKS, BBBlocks.CARVED_WARPED_PLANKS)
            .build();




    public BountifulBlocks(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);

        BBBlockSetTypes.registerBlockSetTypes();

        BBBlocks.register(modEventBus);
        BBItems.register(modEventBus);

        BBVanillaCreativeTabs.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        //TODO add flammable blocks
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
