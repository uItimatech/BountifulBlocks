package net.ultimatech.bountifulblocks.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.DecoratedPotBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.DecoratedPotBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import net.ultimatech.bountifulblocks.block.BBBlocks;
import net.ultimatech.bountifulblocks.block.entity.MudPotBlockEntity;


public class MudPotBlock extends DecoratedPotBlock {

    public MudPotBlock(Settings properties) {
        super(properties);
    }




    // ----- PROPERTIES ----- //

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos blockPos, BlockState blockState) {
        return BBBlocks.MUD_POT.asItem().getDefaultStack();
    }

    @Override
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        BlockEntity itemStack = world.getBlockEntity(blockPos);
        if (itemStack instanceof MudPotBlockEntity MudPotBlockEntity) {
            if (world.isClient) {
                return ActionResult.CONSUME;
            } else {
                ItemStack itemStackx = player.getStackInHand(hand);
                ItemStack itemStack2 = MudPotBlockEntity.getStack();
                if (!itemStackx.isEmpty() && (itemStack2.isEmpty() || ItemStack.canCombine(itemStack2, itemStackx) && itemStack2.getCount() < itemStack2.getMaxCount())) {
                    MudPotBlockEntity.wobble(DecoratedPotBlockEntity.WobbleType.POSITIVE);
                    player.incrementStat(Stats.USED.getOrCreateStat(itemStackx.getItem()));
                    ItemStack itemStack3 = player.isCreative() ? itemStackx.copyWithCount(1) : itemStackx.split(1);
                    float f;
                    if (MudPotBlockEntity.isEmpty()) {
                        MudPotBlockEntity.setStack(itemStack3);
                        f = (float)itemStack3.getCount() / (float)itemStack3.getMaxCount();
                    } else {
                        itemStack2.increment(1);
                        f = (float)itemStack2.getCount() / (float)itemStack2.getMaxCount();
                    }

                    world.playSound(null, blockPos, SoundEvents.BLOCK_DECORATED_POT_INSERT, SoundCategory.BLOCKS, 1.0F, 0.7F + 0.5F * f);
                    if (world instanceof ServerWorld serverWorld) {
                        serverWorld.spawnParticles(ParticleTypes.DUST_PLUME, (double) blockPos.getX() + 0.5, (double) blockPos.getY() + 1.2, (double) blockPos.getZ() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
                    }

                    MudPotBlockEntity.markDirty();
                } else {
                    world.playSound(null, blockPos, SoundEvents.BLOCK_DECORATED_POT_INSERT_FAIL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    MudPotBlockEntity.wobble(DecoratedPotBlockEntity.WobbleType.NEGATIVE);
                }

                world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, blockPos);
                return ActionResult.SUCCESS;
            }
        } else {
            return ActionResult.PASS;
        }
    }




    // ----- RENDERING ----- //

    @Override
    public BlockEntity createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new MudPotBlockEntity(blockPos, blockState);
    }

    @Override
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
}
