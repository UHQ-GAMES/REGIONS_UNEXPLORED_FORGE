package net.regions_unexplored.world.level.block.leaves;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.regions_unexplored.registry.BlockRegistry;

public class BrimwoodLeavesBlock extends LeavesBlock {
    public BrimwoodLeavesBlock(MapColor colour) {
        super(Properties.of().mapColor(colour).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BrimwoodLeavesBlock::ocelotOrParrot).isSuffocating(BrimwoodLeavesBlock::never).isViewBlocking(BrimwoodLeavesBlock::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter getter, BlockPos pos) {
        return 15;
    }

    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }

    private static Boolean ocelotOrParrot(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return (boolean)(type == EntityType.OCELOT || type == EntityType.PARROT);
    }
}