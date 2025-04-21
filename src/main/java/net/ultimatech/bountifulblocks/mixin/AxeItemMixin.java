package net.ultimatech.bountifulblocks.mixin;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.state.BlockState;
import net.ultimatech.bountifulblocks.BountifulBlocks;
import net.ultimatech.bountifulblocks.block.BBBlocks;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Debug(export = true)
@Mixin(value = AxeItem.class, remap = false)
public class AxeItemMixin {

    @Inject(method = "getAxeStrippingState", at = @At("HEAD"), cancellable = true)
    private static void getAxeStrippingState(BlockState state, CallbackInfoReturnable<BlockState> cir) {
        if (BountifulBlocks.CARVABLE_PLANKS.containsKey(state.getBlock())) {
            cir.setReturnValue(BountifulBlocks.CARVABLE_PLANKS.get(state.getBlock()).get().defaultBlockState());
        }
        if (state.getBlock().getName().getString().equals("Pale Oak Planks")) {
            cir.setReturnValue(BBBlocks.CARVED_PALE_OAK_PLANKS.get().defaultBlockState());
        }
    }
}
