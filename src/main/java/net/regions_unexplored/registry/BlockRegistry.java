package net.regions_unexplored.registry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.world.level.block.leaves.*;
import net.regions_unexplored.world.level.block.sign.RuCeilingHangingSignBlock;
import net.regions_unexplored.world.level.block.sign.RuStandingSignBlock;
import net.regions_unexplored.world.level.block.sign.RuWallHangingSignBlock;
import net.regions_unexplored.world.level.block.sign.RuWallSignBlock;
import net.regions_unexplored.world.level.block.wood.AspenLogBlock;
import net.regions_unexplored.world.level.block.wood.MagmaLogBlock;
import net.regions_unexplored.world.level.block.wood.PineLogBlock;

import java.util.function.Supplier;

public class BlockRegistry {
    //Register default blocks and items
    public static <T extends Block> RegistryObject<T> registerDefaultBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = RegionsUnexploredMod.BLOCK_REGISTRY.register(name, block);
        ItemRegistry.registerDefaultBlockItem(name, toReturn);
        return toReturn;
    }

    //Register Duckweed block and item
    public static <T extends Block> RegistryObject<T> registerDuckweedBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = RegionsUnexploredMod.BLOCK_REGISTRY.register(name, block);
        ItemRegistry.registerDuckweedItem(name, toReturn);
        return toReturn;
    }

    //Register Lily block and item
    public static <T extends Block> RegistryObject<T> registerLilyBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = RegionsUnexploredMod.BLOCK_REGISTRY.register(name, block);
        ItemRegistry.registerLilyItem(name, toReturn);
        return toReturn;
    }

    public static PineLogBlock pineLog(MapColor colour, MapColor colour2, SoundType sound) {
        return new PineLogBlock(BlockBehaviour.Properties.of().mapColor((p_152624_) -> {
            return p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? colour : colour2;
        }).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(sound).ignitedByLava());
    }
    public static AspenLogBlock aspenLogBlock(MapColor colour, MapColor colour2, SoundType sound) {
        return new AspenLogBlock(BlockBehaviour.Properties.of().mapColor((p_152624_) -> {
            return p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? colour : colour2;
        }).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(sound).ignitedByLava());
    }
    //Configure log block
    public static RotatedPillarBlock log(MapColor colour, MapColor colour2, SoundType sound) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor((p_152624_) -> {
            return p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? colour : colour2;
        }).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(sound).ignitedByLava());
    }
    //Configure wood block
    public static RotatedPillarBlock woodBlock(MapColor colour, SoundType sound) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound).ignitedByLava());
    }
    //Configure wooden planks
    public static Block woodPlanks(MapColor colour, SoundType sound) {
        return new Block(BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound).ignitedByLava());
    }
    //Configure wooden stairs
    public static StairBlock woodStairs(MapColor colour, SoundType sound) {
        return new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound).ignitedByLava());
    }
    //Configure wooden slab
    public static SlabBlock woodSlab(MapColor colour, SoundType sound) {
        return new SlabBlock(BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound).ignitedByLava());
    }
    //Configure wooden door
    public static DoorBlock woodDoor(MapColor colour, SoundType sound, BlockSetType blockSetType) {
        return new DoorBlock(blockSetType, BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(3.0F).sound(sound).noOcclusion().ignitedByLava());
    }
    //Configure wooden trap door
    public static TrapDoorBlock woodTrapDoor(MapColor colour, SoundType sound, BlockSetType blockSetType) {
        return new TrapDoorBlock(blockSetType, BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(3.0F).sound(sound).noOcclusion().ignitedByLava());
    }
    //Configure wooden fence
    public static FenceBlock woodFence(MapColor colour, SoundType sound) {
        return new FenceBlock(BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound).ignitedByLava());
    }
    //Configure wooden gate
    public static FenceGateBlock woodFenceGate(MapColor colour, WoodType type, SoundType sound) {
        return new FenceGateBlock(type, BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound).ignitedByLava());
    }
    //Configure wooden pressure plate
    public static PressurePlateBlock woodPressurePlate(MapColor colour, SoundType sound, BlockSetType blockSetType) {
        return new PressurePlateBlock(blockSetType, BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).sound(sound).ignitedByLava());
    }
    //Configure wooden button
    public static ButtonBlock woodButton(SoundType sound, BlockSetType blockSetType) {
        return new ButtonBlock(blockSetType, 30, BlockBehaviour.Properties.of().noCollission().strength(0.5F).sound(sound));
    }
    //Configure sign
    public static RuStandingSignBlock sign(SoundType sound, WoodType woodType) {
        return new RuStandingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).sound(sound).ignitedByLava(), woodType);
    }
    //Configure wall sign
    public static RuWallSignBlock wallSign(SoundType sound, Block block, WoodType woodType) {
        return new RuWallSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).sound(sound).ignitedByLava().dropsLike(block), woodType);
    }
    //Configure hanging sign
    public static RuCeilingHangingSignBlock hangingSign(MapColor color, SoundType sound, WoodType woodType) {
        return new RuCeilingHangingSignBlock(BlockBehaviour.Properties.of().mapColor(color).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().sound(sound), woodType);
    }
    //Configure hanging wall sign
    public static RuWallHangingSignBlock wallHangingSign(MapColor color, SoundType sound, Block block, WoodType woodType) {
        return new RuWallHangingSignBlock(BlockBehaviour.Properties.of().mapColor(color).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().sound(sound).dropsLike(block), woodType);
    }
    //Configure log block
    public static RotatedPillarBlock fireproofLog(MapColor colour, MapColor colour2, SoundType sound) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor((p_152624_) -> {
            return p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? colour : colour2;
        }).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(sound));
    }
    //Configure log block
    public static MagmaLogBlock fireproofMagmaLog(MapColor colour, SoundType sound) {
        return new MagmaLogBlock(BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(sound));
    }
    //Configure wood block
    public static RotatedPillarBlock fireproofWoodBlock(MapColor colour, SoundType sound) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound));
    }
    //Configure wooden planks
    public static Block fireproofWoodPlanks(MapColor colour, SoundType sound) {
        return new Block(BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound));
    }
    //Configure wooden stairs
    public static StairBlock fireproofWoodStairs(MapColor colour, SoundType sound) {
        return new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound));
    }
    //Configure wooden slab
    public static SlabBlock fireproofWoodSlab(MapColor colour, SoundType sound) {
        return new SlabBlock(BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound));
    }
    //Configure wooden door
    public static DoorBlock fireproofWoodDoor(MapColor colour, SoundType sound, BlockSetType blockSetType) {
        return new DoorBlock(blockSetType, BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(3.0F).sound(sound).noOcclusion());
    }
    //Configure wooden trap door
    public static TrapDoorBlock fireproofWoodTrapDoor(MapColor colour, SoundType sound, BlockSetType blockSetType) {
        return new TrapDoorBlock(blockSetType, BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(3.0F).sound(sound).noOcclusion());
    }
    //Configure wooden fence
    public static FenceBlock fireproofWoodFence(MapColor colour, SoundType sound) {
        return new FenceBlock(BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound).ignitedByLava());
    }
    //Configure wooden gate
    public static FenceGateBlock fireproofWoodFenceGate(MapColor colour, WoodType type, SoundType sound) {
        return new FenceGateBlock(type, BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(sound));
    }
    //Configure wooden pressure plate
    public static PressurePlateBlock fireproofWoodPressurePlate(MapColor colour, SoundType sound, BlockSetType blockSetType) {
        return new PressurePlateBlock(blockSetType, BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).sound(sound));
    }
    //Configure wooden button
    public static ButtonBlock fireproofWoodButton(SoundType sound, BlockSetType blockSetType) {
        return new ButtonBlock(blockSetType, 30, BlockBehaviour.Properties.of().noCollission().strength(0.5F).sound(sound));
    }
    //Configure sign
    public static RuStandingSignBlock fireproofSign(SoundType sound, WoodType woodType) {
        return new RuStandingSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).sound(sound), woodType);
    }
    //Configure wall sign
    public static RuWallSignBlock fireproofWallSign(SoundType sound, Block block, WoodType woodType) {
        return new RuWallSignBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).sound(sound).dropsLike(block), woodType);
    }
    //Configure hanging sign
    public static RuCeilingHangingSignBlock fireproofHangingSign(MapColor color, SoundType sound, WoodType woodType) {
        return new RuCeilingHangingSignBlock(BlockBehaviour.Properties.of().mapColor(color).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).sound(sound), woodType);
    }
    //Configure hanging wall sign
    public static RuWallHangingSignBlock fireproofWallHangingSign(MapColor color, SoundType sound, Block block, WoodType woodType) {
        return new RuWallHangingSignBlock(BlockBehaviour.Properties.of().mapColor(color).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).sound(sound).dropsLike(block), woodType);
    }

    //Configure leaves blocks
    public static LeavesBlock leaves(MapColor colour) {
        return new LeavesBlock(BlockBehaviour.Properties.of().mapColor(colour).ignitedByLava().strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BlockRegistry::ocelotOrParrot).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static LeavesBlock fireproofLeaves(MapColor colour) {
        return new LeavesBlock(BlockBehaviour.Properties.of().mapColor(colour).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BlockRegistry::ocelotOrParrot).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static MauveLeavesBlock mauveLeaves(MapColor colour) {
        return new MauveLeavesBlock(BlockBehaviour.Properties.of().mapColor(colour).ignitedByLava().strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BlockRegistry::ocelotOrParrot).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static BlueMagnoliaLeavesBlock blueMagnoliaLeaves(MapColor colour) {
        return new BlueMagnoliaLeavesBlock(BlockBehaviour.Properties.of().mapColor(colour).ignitedByLava().strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BlockRegistry::ocelotOrParrot).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static PinkMagnoliaLeavesBlock pinkMagnoliaLeaves(MapColor colour) {
        return new PinkMagnoliaLeavesBlock(BlockBehaviour.Properties.of().mapColor(colour).ignitedByLava().strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BlockRegistry::ocelotOrParrot).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static WhiteMagnoliaLeavesBlock whiteMagnoliaLeaves(MapColor colour) {
        return new WhiteMagnoliaLeavesBlock(BlockBehaviour.Properties.of().mapColor(colour).ignitedByLava().strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BlockRegistry::ocelotOrParrot).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static SilverBirchLeavesBlock silverBirchLeaves(MapColor colour) {
        return new SilverBirchLeavesBlock(BlockBehaviour.Properties.of().mapColor(colour).ignitedByLava().strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BlockRegistry::ocelotOrParrot).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static EnchantedBirchLeavesBlock enchantedBirchLeaves(MapColor colour) {
        return new EnchantedBirchLeavesBlock(BlockBehaviour.Properties.of().mapColor(colour).ignitedByLava().strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BlockRegistry::ocelotOrParrot).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static RedMapleLeavesBlock redMapleLeaves(MapColor colour) {
        return new RedMapleLeavesBlock(BlockBehaviour.Properties.of().mapColor(colour).ignitedByLava().strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BlockRegistry::ocelotOrParrot).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static OrangeMapleLeavesBlock orangeMapleLeaves(MapColor colour) {
        return new OrangeMapleLeavesBlock(BlockBehaviour.Properties.of().mapColor(colour).ignitedByLava().strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BlockRegistry::ocelotOrParrot).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static JoshuaLeavesBlock joshuaLeaves(MapColor colour) {
        return new JoshuaLeavesBlock(BlockBehaviour.Properties.of().pushReaction(PushReaction.BLOCK).mapColor(colour).ignitedByLava().strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().noCollission().pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static LeavesBlock appleLeaves(MapColor colour) {
        return new AppleLeavesBlock(BlockBehaviour.Properties.of().mapColor(colour).ignitedByLava().strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(BlockRegistry::ocelotOrParrot).isSuffocating(BlockRegistry::never).isViewBlocking(BlockRegistry::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(BlockRegistry::never));
    }
    public static BrimwoodLeavesBlock brimLeaves(MapColor colour) {
        return new BrimwoodLeavesBlock(colour);
    }


    //Boolean states
    public static Boolean always(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return (boolean)true;
    }
    public static boolean always(BlockState state, BlockGetter getter, BlockPos pos) {
        return true;
    }
    public static Boolean never(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return (boolean)false;
    }
    public static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }
    public static Boolean ocelotOrParrot(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return (boolean)(type == EntityType.OCELOT || type == EntityType.PARROT);
    }
}
