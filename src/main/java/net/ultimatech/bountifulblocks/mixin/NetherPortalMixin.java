package net.ultimatech.bountifulblocks.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.dimension.NetherPortal;
import net.ultimatech.bountifulblocks.misc.BBTags;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Debug(export = true)
@Mixin(NetherPortal.class)
public class NetherPortalMixin {

    @Shadow
    @Final
    @Mutable
    private static AbstractBlock.ContextPredicate IS_VALID_FRAME_BLOCK;

    @Inject(method = "<init>(Lnet/minecraft/world/WorldAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction$Axis;)V", at = @At(value = "TAIL"))
    private void NetherPortal(WorldAccess worldAccess, BlockPos blockPos, Direction.Axis axis, CallbackInfo ci) {
        IS_VALID_FRAME_BLOCK = (state, world, pos) -> state.isIn(BBTags.Blocks.NETHER_PORTAL_FRAMES);
    }
}
