package net.ultimatech.bountifulblocks.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.item.AxeItem;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

import static net.ultimatech.bountifulblocks.BountifulBlocks.CARVABLE_PLANKS;

@Debug(export = true)
@Mixin(AxeItem.class)
public class AxeItemMixin {

    @Inject(method = "getStrippedState", at = @At("HEAD"), cancellable = true)
    private void getStrippedState(BlockState state, CallbackInfoReturnable<Optional<BlockState>> cir) {

        if (CARVABLE_PLANKS.containsKey(state.getBlock())) {
            cir.setReturnValue(Optional.of(CARVABLE_PLANKS.get(state.getBlock()).getDefaultState()));
        }
    }
}
