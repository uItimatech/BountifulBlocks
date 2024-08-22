package net.ultimatech.bountifulblocks.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class CarvedSnowBlock extends Block {

    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final BooleanProperty CARVED = BooleanProperty.create("carved");

    public CarvedSnowBlock(BlockBehaviour.Properties settings) {
        super(settings);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, CARVED);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(CARVED, false);
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {

        if (!state.getValue(CARVED) && player.getItemInHand(hand).getItem().getDefaultInstance().is(ItemTags.SHOVELS)) {
            world.setBlock(pos, state.setValue(FACING, hit.getDirection()).setValue(CARVED, true), 1);
            this.spawnDestroyParticles(world, player, pos, state);

            ItemStack itemstack = player.getItemInHand(hand);

            if (!player.isCreative()) {
                itemstack.setDamageValue(itemstack.getDamageValue() + 1);
                if (itemstack.getDamageValue() >= itemstack.getMaxDamage()) {
                    // TODO player.broadcastBreakEvent(hand);
                    player.setItemInHand(hand, ItemStack.EMPTY);
                }
            }

            return ItemInteractionResult.SUCCESS;
        }
    return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }
}
