package net.regions_unexplored.world.level.block.leaves;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AppleLeavesBlock extends LeavesBlock implements BonemealableBlock{
    public static final int MAX_AGE = 4;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_4;
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    public AppleLeavesBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(DISTANCE, Integer.valueOf(7)).setValue(PERSISTENT, Boolean.valueOf(false)).setValue(WATERLOGGED, Boolean.valueOf(false)).setValue(AGE, Integer.valueOf(0)));

    }

    public boolean isRandomlyTicking(BlockState state) {
        return state.getValue(AGE) <= 4;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        int i = state.getValue(AGE);
        if(!this.decaying(state)) {
            if (i < 4 && level.getRawBrightness(pos.above(), 0) >= 9 && net.minecraftforge.common.ForgeHooks.onCropsGrowPre(level, pos, state, random.nextInt(4) == 0)) {
                BlockState blockstate = state.setValue(AGE, Integer.valueOf(i + 1));
                level.setBlock(pos, blockstate, 2);
                level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(blockstate));
                net.minecraftforge.common.ForgeHooks.onCropsGrowPost(level, pos, state);
            }
        }
        else {
            if(state.getValue(AGE)==4){
                popResourceFromFace(level, pos, Direction.DOWN, new ItemStack(Items.APPLE, 1));
            }
            dropResources(state, level, pos);
            level.removeBlock(pos, false);
        }
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        int i = state.getValue(AGE);
        boolean flag = i == 4;
        if (!flag && player.getItemInHand(hand).is(Items.BONE_MEAL)) {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        } else if (i > 3) {
            int j = 1 + level.random.nextInt(1);
            popResourceFromFace(level, pos, result.getDirection(), new ItemStack(Items.APPLE, 1));
            level.playSound((Player)null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + level.random.nextFloat() * 0.4F);
            BlockState blockstate = state.setValue(AGE, Integer.valueOf(0));
            level.setBlock(pos, blockstate, 2);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, blockstate));
            return ItemInteractionResult.sidedSuccess(level.isClientSide);
        } else {
            return super.useItemOn(stack, state, level, pos, player, hand, result);
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(DISTANCE, PERSISTENT, WATERLOGGED, AGE);
    }

    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        return state.getValue(AGE) < 4;
    }

    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        int i = Math.min(4, state.getValue(AGE) + 1);
        level.setBlock(pos, state.setValue(AGE, Integer.valueOf(i)), 2);
    }

}