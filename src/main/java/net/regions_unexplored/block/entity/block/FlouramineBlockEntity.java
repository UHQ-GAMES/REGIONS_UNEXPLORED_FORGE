package net.regions_unexplored.block.entity.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.regions_unexplored.block.entity.RuBlockEntities;
import net.regions_unexplored.world.level.block.aquatic.FlouramineBlock;

public class FlouramineBlockEntity extends BlockEntity {
    private static final RandomSource RANDOM = RandomSource.create();

    public FlouramineBlockEntity(BlockPos pos, BlockState state) {
        super(RuBlockEntities.FLOURAMINE_BLOCK_ENTITY.get(), pos, state);
    }

    public static void setActive(Level level, BlockPos pos, BlockState state, FlouramineBlockEntity entity) {
        Player player = level.getNearestPlayer((double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, 3.0, false);

        if (FlouramineBlock.canActivate(state)) {
            Block block = state.getBlock();
            if (block instanceof FlouramineBlock flouramineBlock) {
                if (player != null) {
                    flouramineBlock.activate(state);
                } else {
                    flouramineBlock.deactivate(state);
                }
            }
        }

    }
}
