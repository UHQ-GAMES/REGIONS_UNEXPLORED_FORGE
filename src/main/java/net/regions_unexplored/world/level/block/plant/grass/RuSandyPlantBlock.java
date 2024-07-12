package net.regions_unexplored.world.level.block.plant.grass;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.data.tags.RuTags;
import net.regions_unexplored.world.level.block.plant.tall.RuSandyDoublePlantBlock;
import net.regions_unexplored.world.level.block.state.properties.RuBlockStateProperties;

import static net.minecraft.world.level.block.DoublePlantBlock.copyWaterloggedFrom;

public class RuSandyPlantBlock extends BushBlock implements BonemealableBlock, net.minecraftforge.common.IForgeShearable {
    public static final MapCodec<? extends RuPlantBlock> CODEC = simpleCodec(RuPlantBlock::new);
    public static final BooleanProperty IS_RED = RuBlockStateProperties.IS_RED;
    protected static final float AABB_OFFSET = 6.0F;
    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    public RuSandyPlantBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(IS_RED, false));
    }

    @Override
    protected MapCodec<? extends BushBlock> codec() {
        return CODEC;
    }

    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    public BlockState updateShape(BlockState state, Direction direction, BlockState state1, LevelAccessor level, BlockPos pos, BlockPos pos2) {
        if(level.getBlockState(pos.below()).is(TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("forge", "sand/red")))){
            state.setValue(IS_RED, true);
        }
        else{
            state.setValue(IS_RED, false);
        }
        return !state.canSurvive(level, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, direction, state1, level, pos, pos2);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(IS_RED);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean isRed = context.getLevel().getBlockState(context.getClickedPos().below()).is(TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("forge", "sand/red")));
        return (this.defaultBlockState().setValue(IS_RED, isRed));
    }

    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        return true;
    }

    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    public static void placeAt(LevelAccessor level, BlockState state, BlockPos pos, int i) {
        level.setBlock(pos, copyWaterloggedFrom(level, pos, state), i);
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(RuTags.SANDY_PLANT_CAN_SURVIVE_ON);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockpos = pos.below();

        return this.mayPlaceOn(level.getBlockState(blockpos), level, blockpos);
    }


    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        boolean isRed = state.getValue(IS_RED);
        if(state.is(RuBlocks.SANDY_GRASS.get())){
            DoublePlantBlock sandyTallGrass = (DoublePlantBlock) RuBlocks.SANDY_TALL_GRASS.get();
            if (sandyTallGrass.defaultBlockState().canSurvive(level, pos) && level.isEmptyBlock(pos.above())) {
                placeAt(level, sandyTallGrass.defaultBlockState().setValue(IS_RED, isRed), pos, 2);
                placeAt(level, sandyTallGrass.defaultBlockState().setValue(RuSandyDoublePlantBlock.HALF, DoubleBlockHalf.UPPER).setValue(IS_RED, isRed), pos.above(), 2);
            }
        }

    }
}
