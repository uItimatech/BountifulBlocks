package net.ultimatech.bountifulblocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.ultimatech.bountifulblocks.block.BBBlocks;
import net.ultimatech.bountifulblocks.block.entity.BBBlockEntities;
//import net.ultimatech.bountifulblocks.block.entity.MudPotBlockEntityRenderer;

public class BountifulBlocksClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.LARGE_CHAIN, RenderLayer.getCutout());

		//lockRenderLayerMap.INSTANCE.putBlock(BBBlocks.MUD_POT, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.POLISHED_ICE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.POLISHED_ICE_STAIRS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.POLISHED_ICE_SLAB, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.POLISHED_ICE_WALL, RenderLayer.getTranslucent());

		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.ICE_BRICKS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.ICE_BRICK_STAIRS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.ICE_BRICK_SLAB, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.ICE_BRICK_WALL, RenderLayer.getTranslucent());

		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.ICE_TILES, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.ICE_TILE_STAIRS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.ICE_TILE_SLAB, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.ICE_TILE_WALL, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.CHISELED_ICE, RenderLayer.getTranslucent());

		//BlockEntityRendererFactories.register(BBBlockEntities.MUD_POT, MudPotBlockEntityRenderer::new);
	}
}