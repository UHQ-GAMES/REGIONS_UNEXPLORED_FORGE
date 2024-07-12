package net.regions_unexplored.world.level.feature.tree;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.data.tags.RuTags;
import net.regions_unexplored.world.level.block.plant.branch.BranchBlock;
import net.regions_unexplored.world.level.feature.configuration.RuTreeConfiguration;

import java.util.Random;

public class MapleTreeFeature extends Feature<RuTreeConfiguration> {

    public MapleTreeFeature(Codec<RuTreeConfiguration> codec) {
        super(codec);
    }

    public boolean place(FeaturePlaceContext<RuTreeConfiguration> context) {
        RuTreeConfiguration treeConfiguration = context.config();
        BlockPos pos = context.origin();
        RandomSource randomSource = context.random();
        WorldGenLevel level = context.level();
        int height_main = context.random().nextInt(treeConfiguration.sizeVariation) + treeConfiguration.minimumSize;

        int check = 0;
        BlockPos.MutableBlockPos checkPos = pos.mutable();
        while (check <= height_main) {
            if(!checkReplaceable(level, checkPos)){
                return false;
            }
            else{
                checkPos.move(Direction.UP);
                check = check + 1;
            }
        }
        int placeCheck = 0;
        BlockPos.MutableBlockPos placePos = pos.mutable();
        while (placeCheck <= height_main) {
            placeLog(level, placePos, randomSource, treeConfiguration);
            if(placeCheck == 0){
                placeRoot(level, placePos, randomSource, treeConfiguration);
            }
            if(placeCheck == height_main){
                placeLeavesBlob(level, placePos, randomSource, treeConfiguration);
            }
            placePos.move(Direction.UP);
            placeCheck = placeCheck + 1;
        }
        return true;
    }

    public boolean placeLog(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        Random random = new Random();
        if(level.isOutsideBuildHeight(pos)){
            return true;
        }
        if(level.getBlockState(pos).is(RuBlocks.PEAT_GRASS_BLOCK.get())){
            level.setBlock(pos, RuBlocks.PEAT_DIRT.get().defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos).is(RuBlocks.SILT_GRASS_BLOCK.get())){
            level.setBlock(pos, RuBlocks.SILT_DIRT.get().defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos).is(RuBlocks.ALPHA_GRASS_BLOCK.get())){
            level.setBlock(pos, Blocks.DIRT.defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos).is(Blocks.GRASS_BLOCK)){
            level.setBlock(pos, Blocks.DIRT.defaultBlockState(), 2);
        }
        else if(isReplaceable(level, pos)) {
            level.setBlock(pos, treeConfiguration.trunkProvider.getState(randomSource, pos), 2);
        }
        else{
            return true;
        }

        if(level.getBlockState(pos.below()).is(RuBlocks.PEAT_GRASS_BLOCK.get())){
            level.setBlock(pos.below(), RuBlocks.PEAT_DIRT.get().defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos.below()).is(RuBlocks.SILT_GRASS_BLOCK.get())){
            level.setBlock(pos.below(), RuBlocks.SILT_DIRT.get().defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos.below()).is(RuBlocks.ALPHA_GRASS_BLOCK.get())){
            level.setBlock(pos.below(), Blocks.DIRT.defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos.below()).is(Blocks.GRASS_BLOCK)){
            level.setBlock(pos.below(), Blocks.DIRT.defaultBlockState(), 2);
        }
        return true;
    }
    public boolean placeBranches(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        if(isReplaceable(level, pos.north())&&!level.isOutsideBuildHeight(pos.north())){
            level.setBlock(pos.north(), treeConfiguration.branchProvider.getState(randomSource, pos).setValue(BranchBlock.FACING, Direction.NORTH), 2);
        }
        if(isReplaceable(level, pos.south())&&!level.isOutsideBuildHeight(pos.south())){
            level.setBlock(pos.south(), treeConfiguration.branchProvider.getState(randomSource, pos).setValue(BranchBlock.FACING, Direction.SOUTH), 2);
        }
        if(isReplaceable(level, pos.east())&&!level.isOutsideBuildHeight(pos.east())){
            level.setBlock(pos.east(), treeConfiguration.branchProvider.getState(randomSource, pos).setValue(BranchBlock.FACING, Direction.EAST), 2);
        }
        if(isReplaceable(level, pos.west())&&!level.isOutsideBuildHeight(pos.west())){
            level.setBlock(pos.west(), treeConfiguration.branchProvider.getState(randomSource, pos).setValue(BranchBlock.FACING, Direction.WEST), 2);
        }
        return true;
    }

    public void placeRoot(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        Random random = new Random();
        int rd = random.nextInt(2)+4;
        int i = 0;
        BlockPos.MutableBlockPos placePos = pos.mutable();
        while(i<=rd){
            if(level.getBlockState(placePos).canBeReplaced()&&level.getBlockState(placePos.above()).is(BlockTags.DIRT)){
                level.setBlock(placePos, Blocks.HANGING_ROOTS.defaultBlockState(), 2);
                break;
            }
            else if(level.getBlockState(placePos).is(BlockTags.DIRT)||level.getBlockState(placePos).is(BlockTags.REPLACEABLE_BY_TREES)||level.isEmptyBlock(placePos)){
                placeLog(level, placePos, randomSource, treeConfiguration);
            }
            else{
                break;
            }
            placePos.move(Direction.DOWN);
            i++;
        }
    }

    public boolean placeLeavesBlobLayer(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        Random random = new Random();
        int i = random.nextInt(3);
        int j = random.nextInt(3);
        int k = random.nextInt(3);
        int l = random.nextInt(3);
        placeLeavesBlock(level, pos, randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.north(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.north().north(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.north().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.north().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.north().north().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.north().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.north().west().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.north().north().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.south(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.south().south(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.south().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.south().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.south().south().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.south().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.south().west().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.south().south().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.west(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.west().west(), randomSource, treeConfiguration);
        if(i==0){
            placeLeavesBlock(level, pos.north().north().east().east(), randomSource, treeConfiguration);
        }
        if(j==0){
            placeLeavesBlock(level, pos.north().north().west().west(), randomSource, treeConfiguration);
        }
        if(k==0){
            placeLeavesBlock(level, pos.south().south().east().east(), randomSource, treeConfiguration);
        }
        if(l==0){
            placeLeavesBlock(level, pos.south().south().west().west(), randomSource, treeConfiguration);
        }
        return true;
    }
    public boolean placeLeavesBlob(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        Random random = new Random();
        int n = random.nextInt(3);
        if(n==0){
            placeLeavesBlock(level, pos.north().east(), randomSource, treeConfiguration);
        }
        else if(n==1){
            placeLeavesBlock(level, pos.north().east().above(), randomSource, treeConfiguration);
        }
        else{
            placeLeavesBlock(level, pos.below().north().north(), randomSource, treeConfiguration);
        }
        int s = random.nextInt(3);
        if(s==0){
            placeLeavesBlock(level, pos.north().west(), randomSource, treeConfiguration);
        }
        else if(s==1){
            placeLeavesBlock(level, pos.north().west().above(), randomSource, treeConfiguration);
        }
        else{
            placeLeavesBlock(level, pos.below().south().south(), randomSource, treeConfiguration);
        }
        int e = random.nextInt(3);
        if(e==0){
            placeLeavesBlock(level, pos.south().east(), randomSource, treeConfiguration);
        }
        else if(e==1){
            placeLeavesBlock(level, pos.south().east().above(), randomSource, treeConfiguration);
        }
        else{
            placeLeavesBlock(level, pos.below().east().east(), randomSource, treeConfiguration);
        }
        int w = random.nextInt(3);
        if(w==0){
            placeLeavesBlock(level, pos.south().west(), randomSource, treeConfiguration);
        }
        else if(w==1){
            placeLeavesBlock(level, pos.south().west().above(), randomSource, treeConfiguration);
        }
        else{
            placeLeavesBlock(level, pos.below().west().west(), randomSource, treeConfiguration);
        }

        placeBranches(level, pos.below().below().below(), randomSource, treeConfiguration);
        placeBeehiveOrLeaves(level, pos.below().below().below().below(), randomSource, treeConfiguration);
        //Upper
        placeLeavesBlock(level, pos, randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.north(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.south(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.west(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.above(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.above().north(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.above().south(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.above().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.above().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.above().above(), randomSource, treeConfiguration);
        //lower

        placeLeavesBlock(level, pos.below(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.below().north(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.below().north().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.below().north().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.below().south(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.below().south().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.below().south().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.below().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level, pos.below().west(), randomSource, treeConfiguration);
        placeLeavesBlobLayer(level, pos.below().below(), randomSource, treeConfiguration);
        placeLeavesBlobLayer(level, pos.below().below().below(), randomSource, treeConfiguration);
        return true;
    }

    public boolean placeLeavesBlock(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        Random random = new Random();
        if(level.isOutsideBuildHeight(pos)){
            return true;
        }
        if(level.getBlockState(pos).canBeReplaced()) {
            level.setBlock(pos, treeConfiguration.foliageProvider.getState(randomSource, pos).setValue(LeavesBlock.DISTANCE, 1), 2);
        }
        return true;
    }

    public boolean checkReplaceable(LevelAccessor level, BlockPos pos) {
        if(level.isOutsideBuildHeight(pos)){
            return false;
        }
        if(!isReplaceable(level, pos)) {
            return false;
        }
        return true;
    }

    public boolean placeBeehiveOrLeaves(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration){
        Random random = new Random();
        int chance = random.nextInt(500);
        if (level.getBlockState(pos.north()).isAir()) {
            if(chance==0){
            placeLeavesBlock(level,pos.north().above(), randomSource, treeConfiguration);
            level.setBlock(pos.north(), Blocks.BEE_NEST.defaultBlockState().setValue(BeehiveBlock.FACING, Direction.NORTH), 2);
            level.getBlockEntity(pos.north(), BlockEntityType.BEEHIVE).ifPresent((addBee) -> {
                int j = 2 + random.nextInt(2);
                for(int k = 0; k < j; ++k) {
                    addBee.storeBee(BeehiveBlockEntity.Occupant.create(k));
                }
            });
        }
            else{
                placeLeavesBlock(level, pos.north(), randomSource, treeConfiguration);
            }
        }
        if (level.getBlockState(pos.south()).isAir()) {
            if(chance==1){
                placeLeavesBlock(level,pos.south().above(), randomSource, treeConfiguration);
                level.setBlock(pos.south(), Blocks.BEE_NEST.defaultBlockState().setValue(BeehiveBlock.FACING, Direction.SOUTH), 2);
                level.getBlockEntity(pos.south(), BlockEntityType.BEEHIVE).ifPresent((addBee) -> {
                    int j = 2 + random.nextInt(2);
                    for(int k = 0; k < j; ++k) {
                        addBee.storeBee(BeehiveBlockEntity.Occupant.create(k));
                    }
                });
            }
            else{
                placeLeavesBlock(level, pos.south(), randomSource, treeConfiguration);
            }
        }
        if (level.getBlockState(pos.east()).isAir()) {
            if(chance==2){
                placeLeavesBlock(level,pos.east().above(), randomSource, treeConfiguration);
                level.setBlock(pos.east(), Blocks.BEE_NEST.defaultBlockState().setValue(BeehiveBlock.FACING, Direction.EAST), 2);
                level.getBlockEntity(pos.east(), BlockEntityType.BEEHIVE).ifPresent((addBee) -> {
                    int j = 2 + random.nextInt(2);
                    for(int k = 0; k < j; ++k) {
                        addBee.storeBee(BeehiveBlockEntity.Occupant.create(k));
                    }
                });
            }
            else{
                placeLeavesBlock(level, pos.east(), randomSource, treeConfiguration);
            }
        }
        if (level.getBlockState(pos.west()).isAir()) {
            if(chance==3){
                placeLeavesBlock(level,pos.west().above(), randomSource, treeConfiguration);
                level.setBlock(pos.west(), Blocks.BEE_NEST.defaultBlockState().setValue(BeehiveBlock.FACING, Direction.WEST), 2);
                level.getBlockEntity(pos.west(), BlockEntityType.BEEHIVE).ifPresent((addBee) -> {
                    int j = 2 + random.nextInt(2);
                    for(int k = 0; k < j; ++k) {
                        addBee.storeBee(BeehiveBlockEntity.Occupant.create(k));
                    }
                });
            }
            else{
                placeLeavesBlock(level, pos.west(), randomSource, treeConfiguration);
            }
        }
        return true;
    }
    
    public static boolean isReplaceableDirtBlock(BlockState state) {
        return state.is(RuTags.TREE_GRASS_REPLACEABLES);
    }


    public static boolean isReplaceableDirt(LevelSimulatedReader reader, BlockPos pos) {
        return reader.isStateAtPosition(pos, MapleTreeFeature::isReplaceableDirtBlock);
    }

    public static boolean isReplaceableBlock(BlockState state) {
        return state.is(RuTags.REPLACEABLE_BLOCKS);
    }

    public static boolean isReplaceable(LevelSimulatedReader reader, BlockPos pos) {
        return reader.isStateAtPosition(pos, MapleTreeFeature::isReplaceableBlock);
    }
}