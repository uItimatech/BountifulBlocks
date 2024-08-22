package net.ultimatech.bountifulblocks.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.portal.PortalShape;
import net.ultimatech.bountifulblocks.BountifulBlocks;
import net.ultimatech.bountifulblocks.misc.BBTags;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Debug(export = true)
@Mixin(PortalShape.class)
public class NetherPortalMixin {

    @Shadow
    @Final
    @Mutable
    private static BlockBehaviour.StatePredicate FRAME;

    @Inject(method = "<init>(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction$Axis;)V", at = @At(value = "TAIL"))
    private void PortalShape(LevelAccessor level, BlockPos blockPos, Direction.Axis axis, CallbackInfo ci) {
        BountifulBlocks.LOGGER.info("NetherPortalMixin.PortalShape");
        FRAME = (state, world, pos) -> state.is(BBTags.Blocks.NETHER_PORTAL_FRAMES);
    }
}
