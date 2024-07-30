package net.regions_unexplored.world.level.block.plant.branch;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.data.tags.RuTags;

import java.util.Objects;

public class BranchBlock extends BushBlock {

    private static MapCodec<? extends BranchBlock> createCodec() {
        return RecordCodecBuilder.mapCodec(instance ->
                instance.group(
                        BlockBehaviour.Properties.CODEC.fieldOf("properties").forGetter(BranchBlock::properties),
                        Codec.STRING.xmap(BranchBlock.BranchType::byName, BranchBlock.BranchType::getBranchType).fieldOf("type").forGetter(BranchBlock::getBranchType)
                ).apply(instance, BranchBlock::new)
        );
    }

    public static final MapCodec<? extends BranchBlock> CODEC = createCodec();

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    private final BranchType type;

    public BranchBlock(Properties properties, BranchType branchType) {
        super(properties);
        this.type = branchType;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        if (Objects.equals(type, BranchType.BEARD)) {
            return switch (state.getValue(FACING)) {
                default -> box(0, 0, 0, 16, 16, 3);
                case NORTH -> box(0, 0, 13, 16, 16, 16);
                case EAST -> box(0, 0, 0, 3, 16, 16);
                case WEST -> box(13, 0, 0, 16, 16, 16);
            };
        }
        else{
        return switch (state.getValue(FACING)) {
            default -> box(6, 4, 0, 10, 9, 16);
            case NORTH -> box(6, 4, 0, 10, 9, 16);
            case EAST -> box(0, 4, 6, 16, 9, 10);
            case WEST -> box(0, 4, 6, 16, 9, 10);
        };
        }
    }


    @Override
    protected MapCodec<? extends BushBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        Direction direction = state.getValue(FACING).getOpposite();
        BlockPos.MutableBlockPos blockPos = pos.mutable().move(direction);

        return mayPlaceOn(level.getBlockState(blockPos), level, blockPos);
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(RuTags.BRANCHES_CAN_SURVIVE_ON);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        if (context.getClickedFace().getAxis() == Direction.Axis.Y)
            return this.defaultBlockState().setValue(FACING, Direction.NORTH);

        return this.defaultBlockState().setValue(FACING, context.getClickedFace());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    public BranchType getBranchType() {
        return this.type;
    }

    public enum BranchType {
        BRANCH("branch"),
        BEARD("beard"),
        ;
        private final String branchType;

        BranchType(String type) {
            this.branchType = type;
        }

        public String getBranchType() {
            return branchType;
        }

        public static BranchType byName(String name) {
            for (BranchType value : values()) {
                if (value.branchType.equals(name)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("Unknown BranchType: " + name);
        }
    }
}
