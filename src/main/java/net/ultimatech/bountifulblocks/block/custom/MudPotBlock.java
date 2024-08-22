package net.ultimatech.bountifulblocks.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.DecoratedPotBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.DecoratedPotBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.ultimatech.bountifulblocks.block.BBBlocks;
import org.jetbrains.annotations.Nullable;


public class MudPotBlock extends DecoratedPotBlock {

    public MudPotBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }




    // ----- PROPERTIES ----- //

    @Override
    public ItemStack getCloneItemStack(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        return BBBlocks.MUD_POT.asItem().getDefaultInstance();
    }


    @Override
    protected ItemInteractionResult useItemOn(ItemStack itemStack, BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult hitResult){

        if (level.getBlockEntity(blockPos) instanceof DecoratedPotBlockEntity mudPotBlockEntity) {
            //TODO Replace with MudPotBlockEntity
            if (level.isClientSide) {
                return ItemInteractionResult.CONSUME;
            } else {
                ItemStack itemstack1 = mudPotBlockEntity.getTheItem();
                if (!itemStack.isEmpty()
                        && (
                        itemstack1.isEmpty()
                                || ItemStack.isSameItemSameComponents(itemstack1, itemStack) && itemstack1.getCount() < itemstack1.getMaxStackSize()
                )) {
                    mudPotBlockEntity.wobble(DecoratedPotBlockEntity.WobbleStyle.POSITIVE);
                    player.awardStat(Stats.ITEM_USED.get(itemStack.getItem()));
                    ItemStack itemstack = itemStack.consumeAndReturn(1, player);
                    float f;
                    if (mudPotBlockEntity.isEmpty()) {
                        mudPotBlockEntity.setTheItem(itemstack);
                        f = (float)itemstack.getCount() / (float)itemstack.getMaxStackSize();
                    } else {
                        itemstack1.grow(1);
                        f = (float)itemstack1.getCount() / (float)itemstack1.getMaxStackSize();
                    }

                    level.playSound(null, blockPos, SoundEvents.DECORATED_POT_INSERT, SoundSource.BLOCKS, 1.0F, 0.7F + 0.5F * f);
                    if (level instanceof ServerLevel serverlevel) {
                        serverlevel.sendParticles(
                                ParticleTypes.DUST_PLUME,
                                (double)blockPos.getX() + 0.5,
                                (double)blockPos.getY() + 1.2,
                                (double)blockPos.getZ() + 0.5,
                                7,
                                0.0,
                                0.0,
                                0.0,
                                0.0
                        );
                    }

                    mudPotBlockEntity.setChanged();
                    level.gameEvent(player, GameEvent.BLOCK_CHANGE, blockPos);
                    return ItemInteractionResult.SUCCESS;
                } else {
                    return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
                }
            }
        } else {
            return ItemInteractionResult.SKIP_DEFAULT_BLOCK_INTERACTION;
        }
    }




    // ----- RENDERING ----- //

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new DecoratedPotBlockEntity(blockPos, blockState);
        //TODO Replace with MudPotBlockEntity
    }

    @Override
    protected boolean isOcclusionShapeFullBlock(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return false;
    }

    @Override
    protected boolean useShapeForLightOcclusion(BlockState pState) {
        return false;
    }
}
