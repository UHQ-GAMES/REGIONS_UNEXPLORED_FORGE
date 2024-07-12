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
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.data.tags.RuTags;
import net.regions_unexplored.world.level.feature.configuration.RuTreeConfiguration;

import java.util.Random;

public class SakuraTreeFeature extends Feature<RuTreeConfiguration> {

    public SakuraTreeFeature(Codec<RuTreeConfiguration> codec) {
        super(codec);
    }

    public boolean place(FeaturePlaceContext<RuTreeConfiguration> context) {
        RuTreeConfiguration treeConfiguration = context.config();
        BlockPos pos = context.origin();
        RandomSource randomSource = context.random();
        WorldGenLevel level = context.level();

        int limbDirection = context.random().nextInt(12);
        int height_main = context.random().nextInt(treeConfiguration.sizeVariation) + treeConfiguration.minimumSize;

        int check = 0;
        BlockPos.MutableBlockPos checkPos = pos.mutable();
        while (check <= height_main) {
            if(!checkReplaceable(level, checkPos)){
                return false;
            }
            else{
                if(check == height_main){
                    if(!placeLimbsCheck(level, checkPos, limbDirection)){
                       return false;
                    }
                }
                checkPos.move(Direction.UP);
                check = check + 1;
            }
        }
        int placeCheck = 0;
        BlockPos.MutableBlockPos placePos = pos.mutable();
        while (placeCheck <= height_main) {
            if(placeCheck == 0){
                placeBase(level, placePos, randomSource, treeConfiguration);
            }
            if(placeCheck == height_main){
                placeLimbs(level, placePos, limbDirection, randomSource, treeConfiguration);
            }
            placeLog(level, placePos, randomSource, treeConfiguration);
            placePos.move(Direction.UP);
            placeCheck = placeCheck + 1;
        }
        return true;
    }

    public boolean placeLimbs(LevelAccessor level, BlockPos pos, int limbDirection, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        if(limbDirection==0){
            placeLog(level, pos.north(), randomSource, treeConfiguration);
            placeLog(level, pos.north().above(), randomSource, treeConfiguration);
            placeLog(level, pos.north().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.north().above().above().north(), randomSource, treeConfiguration);
            placeLog(level, pos.north().above().above().north().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.north().above().above().north().above(), randomSource, treeConfiguration);

            placeLogZ(level, pos.above().south(), randomSource, treeConfiguration);
            placeLogZ(level, pos.above().south().south(), randomSource, treeConfiguration);
            placeLogZ(level, pos.above().south().south().above().south(), randomSource, treeConfiguration);
            placeBeehive(level, pos.above().south().south().south(), Direction.SOUTH);
            placeLeavesBlobRight(level, pos.above().south().south().above().south(), randomSource, treeConfiguration);
        }
        if(limbDirection==1){
            placeLog(level, pos.south(), randomSource, treeConfiguration);
            placeLog(level, pos.south().above(), randomSource, treeConfiguration);
            placeLog(level, pos.south().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.south().above().above().south(), randomSource, treeConfiguration);
            placeLog(level, pos.south().above().above().south().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.south().above().above().south().above(), randomSource, treeConfiguration);

            placeLogZ(level, pos.above().north(), randomSource, treeConfiguration);
            placeLogZ(level, pos.above().north().north(), randomSource, treeConfiguration);
            placeLogZ(level, pos.above().north().north().above().north(), randomSource, treeConfiguration);
            placeBeehive(level, pos.above().north().north().north(), Direction.NORTH);
            placeLeavesBlobRight(level, pos.above().north().north().above().north(), randomSource, treeConfiguration);
        }
        if(limbDirection==2){
            placeLog(level, pos.east(), randomSource, treeConfiguration);
            placeLog(level, pos.east().above(), randomSource, treeConfiguration);
            placeLog(level, pos.east().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.east().above().above().east(), randomSource, treeConfiguration);
            placeLog(level, pos.east().above().above().east().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.east().above().above().east().above(), randomSource, treeConfiguration);

            placeLogX(level, pos.above().west(), randomSource, treeConfiguration);
            placeLogX(level, pos.above().west().west(), randomSource, treeConfiguration);
            placeLogX(level, pos.above().west().west().above().west(), randomSource, treeConfiguration);
            placeBeehive(level, pos.above().west().west().west(), Direction.WEST);
            placeLeavesBlobRight(level, pos.above().west().west().above().west(), randomSource, treeConfiguration);
        }
        if(limbDirection==3){
            placeLog(level, pos.west(), randomSource, treeConfiguration);
            placeLog(level, pos.west().above(), randomSource, treeConfiguration);
            placeLog(level, pos.west().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.west().above().above().west(), randomSource, treeConfiguration);
            placeLog(level, pos.west().above().above().west().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.west().above().above().west().above(), randomSource, treeConfiguration);

            placeLogX(level, pos.above().east(), randomSource, treeConfiguration);
            placeLogX(level, pos.above().east().east(), randomSource, treeConfiguration);
            placeLogX(level, pos.above().east().east().above().east(), randomSource, treeConfiguration);
            placeBeehive(level, pos.above().east().east().east(), Direction.EAST);
            placeLeavesBlobRight(level, pos.above().east().east().above().east(), randomSource, treeConfiguration);
        }
        if(limbDirection==4){
            placeLog(level, pos.east().north(), randomSource, treeConfiguration);
            placeLog(level, pos.east().north().above(), randomSource, treeConfiguration);
            placeLog(level, pos.east().north().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.east().east().north().above().above().north(), randomSource, treeConfiguration);
            placeLog(level, pos.east().east().north().above().above().north().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.east().east().north().above().above().north().above(), randomSource, treeConfiguration);

            placeLogZ(level, pos.west().above().south(), randomSource, treeConfiguration);
            placeLogZ(level, pos.west().above().south().south(), randomSource, treeConfiguration);
            placeLogZ(level, pos.west().west().above().south().south().above().south(), randomSource, treeConfiguration);
            placeBeehive(level, pos.west().west().above().south().south().south(), Direction.SOUTH);
            placeLeavesBlobRight(level, pos.west().west().above().south().south().above().south(), randomSource, treeConfiguration);
        }
        if(limbDirection==5){
            placeLog(level, pos.west().north(), randomSource, treeConfiguration);
            placeLog(level, pos.west().north().above(), randomSource, treeConfiguration);
            placeLog(level, pos.west().north().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.west().west().north().above().above().north(), randomSource, treeConfiguration);
            placeLog(level, pos.west().west().north().above().above().north().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.west().west().north().above().above().north().above(), randomSource, treeConfiguration);

            placeLogZ(level, pos.east().above().south(), randomSource, treeConfiguration);
            placeLogZ(level, pos.east().above().south().south(), randomSource, treeConfiguration);
            placeLogZ(level, pos.east().east().above().south().south().above().south(), randomSource, treeConfiguration);
            placeBeehive(level, pos.east().east().above().south().south().south(), Direction.SOUTH);
            placeLeavesBlobRight(level, pos.east().east().above().south().south().above().south(), randomSource, treeConfiguration);
        }
        if(limbDirection==6){
            placeLog(level, pos.east().south(), randomSource, treeConfiguration);
            placeLog(level, pos.east().south().above(), randomSource, treeConfiguration);
            placeLog(level, pos.east().south().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.east().east().south().above().above().south(), randomSource, treeConfiguration);
            placeLog(level, pos.east().east().south().above().above().south().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.east().east().south().above().above().south().above(), randomSource, treeConfiguration);

            placeLogZ(level, pos.west().above().north(), randomSource, treeConfiguration);
            placeLogZ(level, pos.west().above().north().north(), randomSource, treeConfiguration);
            placeLogZ(level, pos.west().west().above().north().north().above().north(), randomSource, treeConfiguration);
            placeBeehive(level, pos.west().west().above().north().north().north(), Direction.NORTH);
            placeLeavesBlobRight(level, pos.west().west().above().north().north().above().north(), randomSource, treeConfiguration);
        }
        if(limbDirection==7){
            placeLog(level, pos.west().south(), randomSource, treeConfiguration);
            placeLog(level, pos.west().south().above(), randomSource, treeConfiguration);
            placeLog(level, pos.west().south().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.west().west().south().above().above().south(), randomSource, treeConfiguration);
            placeLog(level, pos.west().west().south().above().above().south().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.west().west().south().above().above().south().above(), randomSource, treeConfiguration);

            placeLogZ(level, pos.east().above().north(), randomSource, treeConfiguration);
            placeLogZ(level, pos.east().above().north().north(), randomSource, treeConfiguration);
            placeLogZ(level, pos.east().east().above().north().north().above().north(), randomSource, treeConfiguration);
            placeBeehive(level, pos.east().east().above().north().north().north(), Direction.NORTH);
            placeLeavesBlobRight(level, pos.east().east().above().north().north().above().north(), randomSource, treeConfiguration);
        }
        if(limbDirection==8){
            placeLog(level, pos.north().east(), randomSource, treeConfiguration);
            placeLog(level, pos.north().east().above(), randomSource, treeConfiguration);
            placeLog(level, pos.north().east().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.north().north().east().above().above().east(), randomSource, treeConfiguration);
            placeLog(level, pos.north().north().east().above().above().east().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.north().north().east().above().above().east().above(), randomSource, treeConfiguration);

            placeLogX(level, pos.south().above().west(), randomSource, treeConfiguration);
            placeLogX(level, pos.south().above().west().west(), randomSource, treeConfiguration);
            placeLogX(level, pos.south().south().above().west().west().above().west(), randomSource, treeConfiguration);
            placeBeehive(level, pos.south().south().above().west().west().west(), Direction.WEST);
            placeLeavesBlobRight(level, pos.south().south().above().west().west().above().west(), randomSource, treeConfiguration);
        }
        if(limbDirection==9){
            placeLog(level, pos.north().west(), randomSource, treeConfiguration);
            placeLog(level, pos.north().west().above(), randomSource, treeConfiguration);
            placeLog(level, pos.north().west().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.north().north().west().above().above().west(), randomSource, treeConfiguration);
            placeLog(level, pos.north().north().west().above().above().west().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.north().north().west().above().above().west().above(), randomSource, treeConfiguration);

            placeLogX(level, pos.south().above().east(), randomSource, treeConfiguration);
            placeLogX(level, pos.south().above().east().east(), randomSource, treeConfiguration);
            placeLogX(level, pos.south().south().above().east().east().above().east(), randomSource, treeConfiguration);
            placeBeehive(level, pos.south().south().above().east().east().east(), Direction.EAST);
            placeLeavesBlobRight(level, pos.south().south().above().east().east().above().east(), randomSource, treeConfiguration);
        }
        if(limbDirection==10){
            placeLog(level, pos.south().east(), randomSource, treeConfiguration);
            placeLog(level, pos.south().east().above(), randomSource, treeConfiguration);
            placeLog(level, pos.south().east().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.south().south().east().above().above().east(), randomSource, treeConfiguration);
            placeLog(level, pos.south().south().east().above().above().east().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.south().south().east().above().above().east().above(), randomSource, treeConfiguration);

            placeLogX(level, pos.north().above().west(), randomSource, treeConfiguration);
            placeLogX(level, pos.north().above().west().west(), randomSource, treeConfiguration);
            placeLogX(level, pos.north().north().above().west().west().above().west(), randomSource, treeConfiguration);
            placeBeehive(level, pos.north().north().above().west().west().west(), Direction.WEST);
            placeLeavesBlobRight(level, pos.north().north().above().west().west().above().west(), randomSource, treeConfiguration);
        }
        if(limbDirection==11){
            placeLog(level, pos.south().west(), randomSource, treeConfiguration);
            placeLog(level, pos.south().west().above(), randomSource, treeConfiguration);
            placeLog(level, pos.south().west().above().above(), randomSource, treeConfiguration);
            placeLog(level, pos.south().south().west().above().above().west(), randomSource, treeConfiguration);
            placeLog(level, pos.south().south().west().above().above().west().above(), randomSource, treeConfiguration);
            placeLeavesBlobLeft(level, pos.south().south().west().above().above().west().above(), randomSource, treeConfiguration);

            placeLogX(level, pos.north().above().east(), randomSource, treeConfiguration);
            placeLogX(level, pos.north().above().east().east(), randomSource, treeConfiguration);
            placeLogX(level, pos.north().north().above().east().east().above().east(), randomSource, treeConfiguration);
            placeBeehive(level, pos.north().north().above().east().east().east(), Direction.EAST);
            placeLeavesBlobRight(level, pos.north().north().above().east().east().above().east(), randomSource, treeConfiguration);
        }
        return true;
    }

    public boolean placeBase(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        Random random = new Random();
        int rot = random.nextInt(8);
        if(rot==0){
            placeLog(level, pos.north().east(), randomSource, treeConfiguration);
            placeRoot(level, pos.north().east(), randomSource, treeConfiguration);
            placeLogZ(level, pos.south(), randomSource, treeConfiguration);
            placeRoot(level, pos.south(), randomSource, treeConfiguration);
        }
        if(rot==1){
            placeLog(level, pos.north().west(), randomSource, treeConfiguration);
            placeRoot(level, pos.north().west(), randomSource, treeConfiguration);
            placeLogZ(level, pos.south(), randomSource, treeConfiguration);
            placeRoot(level, pos.south(), randomSource, treeConfiguration);
        }
        if(rot==2){
            placeLog(level, pos.south().east(), randomSource, treeConfiguration);
            placeRoot(level, pos.south().east(), randomSource, treeConfiguration);
            placeLogZ(level, pos.north(), randomSource, treeConfiguration);
            placeRoot(level, pos.north(), randomSource, treeConfiguration);
        }
        if(rot==3){
            placeLog(level, pos.south().west(), randomSource, treeConfiguration);
            placeRoot(level, pos.south().west(), randomSource, treeConfiguration);
            placeLogZ(level, pos.north(), randomSource, treeConfiguration);
            placeRoot(level, pos.north(), randomSource, treeConfiguration);
        }
        if(rot==4){
            placeLog(level, pos.east().north(), randomSource, treeConfiguration);
            placeRoot(level, pos.east().north(), randomSource, treeConfiguration);
            placeLogX(level, pos.west(), randomSource, treeConfiguration);
            placeRoot(level, pos.west(), randomSource, treeConfiguration);
        }
        if(rot==5){
            placeLog(level, pos.east().south(), randomSource, treeConfiguration);
            placeRoot(level, pos.east().south(), randomSource, treeConfiguration);
            placeLogX(level, pos.west(), randomSource, treeConfiguration);
            placeRoot(level, pos.west(), randomSource, treeConfiguration);
        }
        if(rot==6){
            placeLog(level, pos.west().north(), randomSource, treeConfiguration);
            placeRoot(level, pos.west().north(), randomSource, treeConfiguration);
            placeLogX(level, pos.east(), randomSource, treeConfiguration);
            placeRoot(level, pos.east(), randomSource, treeConfiguration);
        }
        if(rot==7){
            placeLog(level, pos.west().south(), randomSource, treeConfiguration);
            placeRoot(level, pos.west().south(), randomSource, treeConfiguration);
            placeLogX(level, pos.east(), randomSource, treeConfiguration);
            placeRoot(level, pos.east(), randomSource, treeConfiguration);
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
    public boolean placeLogX(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
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
            level.setBlock(pos, treeConfiguration.trunkProvider.getState(randomSource, pos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
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
    public boolean placeLogZ(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
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
            level.setBlock(pos, treeConfiguration.trunkProvider.getState(randomSource, pos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
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

    public void placeRoot(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        int rd = 2;
        int i = 0;
        BlockPos.MutableBlockPos placePos = pos.below().mutable();
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

    public boolean placeLeavesBlobLeft(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        Random random = new Random();
        placeLeavesTopLeft(level, pos, randomSource, treeConfiguration);
        placeLeavesMiddle(level, pos.above(), randomSource, treeConfiguration);
        placeLeavesTopLeft(level, pos.above().above(), randomSource, treeConfiguration);
        return true;
    }
    public boolean placeLeavesBlobRight(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        Random random = new Random();
        placeLeavesTopRight(level, pos, randomSource, treeConfiguration);
        placeLeavesMiddle(level, pos.above(), randomSource, treeConfiguration);
        placeLeavesTopRight(level, pos.above().above(), randomSource, treeConfiguration);
        return true;
    }

    public boolean placeLeavesMiddle(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        Random random = new Random();
        placeLeavesBlock(level,pos, randomSource, treeConfiguration);

        placeLeavesBlock(level,pos.north(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().east().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().west().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().west().west().west(), randomSource, treeConfiguration);

        placeLeavesBlock(level,pos.north().north(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().east().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().west().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().west().west().west(), randomSource, treeConfiguration);

        placeLeavesBlock(level,pos.north().north().north(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().north().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().north().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().north().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().north().west().west(), randomSource, treeConfiguration);

        placeLeavesBlock(level,pos.south(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().east().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().west().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().west().west().west(), randomSource, treeConfiguration);

        placeLeavesBlock(level,pos.south().south(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().east().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().west().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().west().west().west(), randomSource, treeConfiguration);

        placeLeavesBlock(level,pos.south().south().south(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().south().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().south().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().south().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().south().west().west(), randomSource, treeConfiguration);

        placeLeavesBlock(level,pos.east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.east().east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.west().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.west().west().west(), randomSource, treeConfiguration);
        return true;
    }
    public boolean placeLeavesTopLeft(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        Random random = new Random();
        placeLeavesBlock(level,pos, randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.east().north(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.east().east().north(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.west().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.west().south(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.west().west().south(), randomSource, treeConfiguration);
        return true;
    }
    public void placeLeavesTopRight(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        placeLeavesBlock(level,pos, randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.north().north().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.south().south().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.east().east(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.east().south(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.east().east().south(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.west().west(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.west().north(), randomSource, treeConfiguration);
        placeLeavesBlock(level,pos.west().west().north(), randomSource, treeConfiguration);
    }

    public void placeLeavesBlock(LevelAccessor level, BlockPos pos, RandomSource randomSource, RuTreeConfiguration treeConfiguration) {
        if(level.isOutsideBuildHeight(pos)){
            return;
        }
        if(level.getBlockState(pos).canBeReplaced()) {
            level.setBlock(pos, treeConfiguration.foliageProvider.getState(randomSource, pos).setValue(LeavesBlock.DISTANCE, 1), 2);

        }
    }

    public boolean placeLimbsCheck(LevelAccessor level, BlockPos pos, int limbDirection) {
        if(limbDirection==0){
            if (!checkReplaceable(level, pos.north())){return false;}
            if(!checkReplaceable(level, pos.north().above())){return false;}
            if(!checkReplaceable(level, pos.north().above().above())){return false;}
            if(!checkReplaceable(level, pos.north().above().above().north())){return false;}
            if(!checkReplaceable(level, pos.north().above().above().north().above())){return false;}

            if(!checkReplaceable(level, pos.above().south())){return false;}
            if(!checkReplaceable(level, pos.above().south().south())){return false;}
            if(!checkReplaceable(level, pos.above().south().south().above().south())){return false;}
        }
        if(limbDirection==1){
            if(!checkReplaceable(level, pos.south())){return false;}
            if(!checkReplaceable(level, pos.south().above())){return false;}
            if(!checkReplaceable(level, pos.south().above().above())){return false;}
            if(!checkReplaceable(level, pos.south().above().above().south())){return false;}
            if(!checkReplaceable(level, pos.south().above().above().south().above())){return false;}

            if(!checkReplaceable(level, pos.above().north())){return false;}
            if(!checkReplaceable(level, pos.above().north().north())){return false;}
            if(!checkReplaceable(level, pos.above().north().north().above().north())){return false;}
        }
        if(limbDirection==2){
            if(!checkReplaceable(level, pos.east())){return false;}
            if(!checkReplaceable(level, pos.east().above())){return false;}
            if(!checkReplaceable(level, pos.east().above().above())){return false;}
            if(!checkReplaceable(level, pos.east().above().above().east())){return false;}
            if(!checkReplaceable(level, pos.east().above().above().east().above())){return false;}

            if(!checkReplaceable(level, pos.above().west())){return false;}
            if(!checkReplaceable(level, pos.above().west().west())){return false;}
            if(!checkReplaceable(level, pos.above().west().west().above().west())){return false;}
        }
        if(limbDirection==3){
            if(!checkReplaceable(level, pos.west())){return false;}
            if(!checkReplaceable(level, pos.west().above())){return false;}
            if(!checkReplaceable(level, pos.west().above().above())){return false;}
            if(!checkReplaceable(level, pos.west().above().above().west())){return false;}
            if(!checkReplaceable(level, pos.west().above().above().west().above())){return false;}

            if(!checkReplaceable(level, pos.above().east())){return false;}
            if(!checkReplaceable(level, pos.above().east().east())){return false;}
            if(!checkReplaceable(level, pos.above().east().east().above().east())){return false;}
        }
        if(limbDirection==4){
            if(!checkReplaceable(level, pos.east().north())){return false;}
            if(!checkReplaceable(level, pos.east().north().above())){return false;}
            if(!checkReplaceable(level, pos.east().north().above().above())){return false;}
            if(!checkReplaceable(level, pos.east().east().north().above().above().north())){return false;}
            if(!checkReplaceable(level, pos.east().east().north().above().above().north().above())){return false;}

            if(!checkReplaceable(level, pos.west().above().south())){return false;}
            if(!checkReplaceable(level, pos.west().above().south().south())){return false;}
            if(!checkReplaceable(level, pos.west().west().above().south().south().above().south())){return false;}
        }
        if(limbDirection==5){
            if(!checkReplaceable(level, pos.west().north())){return false;}
            if(!checkReplaceable(level, pos.west().north().above())){return false;}
            if(!checkReplaceable(level, pos.west().north().above().above())){return false;}
            if(!checkReplaceable(level, pos.west().west().north().above().above().north())){return false;}
            if(!checkReplaceable(level, pos.west().west().north().above().above().north().above())){return false;}

            if(!checkReplaceable(level, pos.east().above().south())){return false;}
            if(!checkReplaceable(level, pos.east().above().south().south())){return false;}
            if(!checkReplaceable(level, pos.east().east().above().south().south().above().south())){return false;}
        }
        if(limbDirection==6){
            if(!checkReplaceable(level, pos.east().south())){return false;}
            if(!checkReplaceable(level, pos.east().south().above())){return false;}
            if(!checkReplaceable(level, pos.east().south().above().above())){return false;}
            if(!checkReplaceable(level, pos.east().east().south().above().above().south())){return false;}
            if(!checkReplaceable(level, pos.east().east().south().above().above().south().above())){return false;}

            if(!checkReplaceable(level, pos.west().above().north())){return false;}
            if(!checkReplaceable(level, pos.west().above().north().north())){return false;}
            if(!checkReplaceable(level, pos.west().west().above().north().north().above().north())){return false;}
        }
        if(limbDirection==7){
            if(!checkReplaceable(level, pos.west().south())){return false;}
            if(!checkReplaceable(level, pos.west().south().above())){return false;}
            if(!checkReplaceable(level, pos.west().south().above().above())){return false;}
            if(!checkReplaceable(level, pos.west().west().south().above().above().south())){return false;}
            if(!checkReplaceable(level, pos.west().west().south().above().above().south().above())){return false;}

            if(!checkReplaceable(level, pos.east().above().north())){return false;}
            if(!checkReplaceable(level, pos.east().above().north().north())){return false;}
            if(!checkReplaceable(level, pos.east().east().above().north().north().above().north())){return false;}
        }
        if(limbDirection==8){
            if(!checkReplaceable(level, pos.north().east())){return false;}
            if(!checkReplaceable(level, pos.north().east().above())){return false;}
            if(!checkReplaceable(level, pos.north().east().above().above())){return false;}
            if(!checkReplaceable(level, pos.north().north().east().above().above().east())){return false;}
            if(!checkReplaceable(level, pos.north().north().east().above().above().east().above())){return false;}

            if(!checkReplaceable(level, pos.south().above().west())){return false;}
            if(!checkReplaceable(level, pos.south().above().west().west())){return false;}
            if(!checkReplaceable(level, pos.south().south().above().west().west().above().west())){return false;}
        }
        if(limbDirection==9){
            if(!checkReplaceable(level, pos.north().west())){return false;}
            if(!checkReplaceable(level, pos.north().west().above())){return false;}
            if(!checkReplaceable(level, pos.north().west().above().above())){return false;}
            if(!checkReplaceable(level, pos.north().north().west().above().above().west())){return false;}
            if(!checkReplaceable(level, pos.north().north().west().above().above().west().above())){return false;}

            if(!checkReplaceable(level, pos.south().above().east())){return false;}
            if(!checkReplaceable(level, pos.south().above().east().east())){return false;}
            if(!checkReplaceable(level, pos.south().south().above().east().east().above().east())){return false;}
        }
        if(limbDirection==10){
            if(!checkReplaceable(level, pos.south().east())){return false;}
            if(!checkReplaceable(level, pos.south().east().above())){return false;}
            if(!checkReplaceable(level, pos.south().east().above().above())){return false;}
            if(!checkReplaceable(level, pos.south().south().east().above().above().east())){return false;}
            if(!checkReplaceable(level, pos.south().south().east().above().above().east().above())){return false;}

            if(!checkReplaceable(level, pos.north().above().west())){return false;}
            if(!checkReplaceable(level, pos.north().above().west().west())){return false;}
            if(!checkReplaceable(level, pos.north().north().above().west().west().above().west())){return false;}
        }
        if(limbDirection==11){
            if(!checkReplaceable(level, pos.south().west())){return false;}
            if(!checkReplaceable(level, pos.south().west().above())){return false;}
            if(!checkReplaceable(level, pos.south().west().above().above())){return false;}
            if(!checkReplaceable(level, pos.south().south().west().above().above().west())){return false;}
            if(!checkReplaceable(level, pos.south().south().west().above().above().west().above())){return false;}

            if(!checkReplaceable(level, pos.north().above().east())){return false;}
            if(!checkReplaceable(level, pos.north().above().east().east())){return false;}
            if(!checkReplaceable(level, pos.north().north().above().east().east().above().east())){return false;}
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

    public boolean placeBeehive(LevelAccessor level, BlockPos pos, Direction direction){
        Random random = new Random();
        int chance = random.nextInt(20);
        if(level.getBlockState(pos).isAir()&&chance==0){
            level.setBlock(pos, Blocks.BEE_NEST.defaultBlockState().setValue(BeehiveBlock.FACING, direction), 2);
            level.getBlockEntity(pos, BlockEntityType.BEEHIVE).ifPresent((addBee) -> {
                int j = 2 + random.nextInt(2);
                for(int k = 0; k < j; ++k) {
                    addBee.storeBee(BeehiveBlockEntity.Occupant.create(k));
                }
            });
        }
        return true;
    }
    
    public static boolean isReplaceableDirtBlock(BlockState state) {
        return state.is(RuTags.TREE_GRASS_REPLACEABLES);
    }

    public static boolean isReplaceableDirt(LevelSimulatedReader reader, BlockPos pos) {
        return reader.isStateAtPosition(pos, SakuraTreeFeature::isReplaceableDirtBlock);
    }

    public static boolean isReplaceableBlock(BlockState state) {
        return state.is(RuTags.REPLACEABLE_BLOCKS);
    }

    public static boolean isReplaceable(LevelSimulatedReader reader, BlockPos pos) {
        return reader.isStateAtPosition(pos, SakuraTreeFeature::isReplaceableBlock);
    }
}