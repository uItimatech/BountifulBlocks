package net.ultimatech.bountifulblocks;

import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import net.ultimatech.bountifulblocks.block.BBBlockSetTypes;
import net.ultimatech.bountifulblocks.block.BBBlocks;
import net.ultimatech.bountifulblocks.item.BBItems;
import net.ultimatech.bountifulblocks.tab.BBVanillaCreativeTabs;
import org.slf4j.Logger;

import java.util.Map;

@Mod(BountifulBlocks.MOD_ID)
public class BountifulBlocks {

    public static final String MOD_ID = "bountifulblocks";
    public static final Logger LOGGER = LogUtils.getLogger();




    public static final Map<Block, RegistryObject<Block>> CARVABLE_PLANKS = ImmutableMap.<Block, RegistryObject<Block>>builder()
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




    public BountifulBlocks() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        BBBlockSetTypes.registerBlockSetTypes();
        BBBlocks.register(modEventBus);
        BBItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        BBVanillaCreativeTabs.register(modEventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }



    private void commonSetup(final FMLCommonSetupEvent event) {}



    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}



    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.POLISHED_ICE.get(), RenderType.translucent());
                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.POLISHED_ICE_STAIRS.get(), RenderType.translucent());
                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.POLISHED_ICE_SLAB.get(), RenderType.translucent());
                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.POLISHED_ICE_WALL.get(), RenderType.translucent());

                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.ICE_BRICKS.get(), RenderType.translucent());
                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.ICE_BRICK_STAIRS.get(), RenderType.translucent());
                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.ICE_BRICK_SLAB.get(), RenderType.translucent());
                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.ICE_BRICK_WALL.get(), RenderType.translucent());

                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.ICE_TILES.get(), RenderType.translucent());
                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.ICE_TILE_STAIRS.get(), RenderType.translucent());
                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.ICE_TILE_SLAB.get(), RenderType.translucent());
                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.ICE_TILE_WALL.get(), RenderType.translucent());
                        ItemBlockRenderTypes.setRenderLayer(BBBlocks.CHISELED_ICE.get(), RenderType.translucent());
        }
    }
}
