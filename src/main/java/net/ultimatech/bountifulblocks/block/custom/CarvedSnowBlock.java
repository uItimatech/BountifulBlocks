package net.ultimatech.bountifulblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class CarvedSnowBlock extends Block {

    public static final DirectionProperty FACING = Properties.FACING;
    public static final BooleanProperty CARVED = BooleanProperty.of("carved");

    public static final MapCodec<CarvedSnowBlock> CODEC = CarvedSnowBlock.createCodec(CarvedSnowBlock::new);

    public MapCodec<CarvedSnowBlock> getCodec() {
        return CODEC;
    }

    public CarvedSnowBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder< Block, BlockState> builder) {
        builder.add(FACING, CARVED);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, Direction.NORTH).with(CARVED, false);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if (!state.get(CARVED) && player.getStackInHand(hand) != null && player.getStackInHand(hand).getItem().getDefaultStack().isIn(ItemTags.SHOVELS)) {
            world.setBlockState(pos, state.with(FACING, hit.getSide()).with(CARVED, true));
            this.spawnBreakParticles(world, player, pos, state);

            player.getStackInHand(hand).damage(1, player, (playerEntity) -> {
                playerEntity.sendToolBreakStatus(hand);
            });

            return ActionResult.SUCCESS;
        }
    return ActionResult.PASS;
    }
}
