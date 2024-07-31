package net.regions_unexplored.world.level.block.state.properties;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class RuBlockStateProperties {
    public static final BooleanProperty HAS_GRAVITY = BooleanProperty.create("has_gravity");
    public static final BooleanProperty TRANSITION_BLOCK = BooleanProperty.create("transition_block");
    public static final BooleanProperty SMOULDERING = BooleanProperty.create("smouldering");
    public static final BooleanProperty LEAVES = BooleanProperty.create("leaves");
    public static final BooleanProperty IS_RED = BooleanProperty.create("is_red");
    public static final BooleanProperty NATURAL = BooleanProperty.create("natural");
    public static final BooleanProperty CLOSED = BooleanProperty.create("closed");
    public static final BooleanProperty ACTIVE = BooleanProperty.create("active");
    public static final BooleanProperty IS_BASE = BooleanProperty.create("is_base");
    public static final BooleanProperty IS_STRIPPED = BooleanProperty.create("is_stripped");
    public static final BooleanProperty MOSSED = BooleanProperty.create("mossed");
    public static final EnumProperty<SaguaroCactusShape> CACTUS_SHAPE = EnumProperty.create("cactus_shape", SaguaroCactusShape.class);
    public static final EnumProperty<HangingPrismariteShape> HANGING_PRISMARITE_SHAPE = EnumProperty.create("hanging_prismarite_shape", HangingPrismariteShape.class);
    public static final EnumProperty<TallHyacinthStockShape> TALL_HYACINTH_STOCK_SHAPE = EnumProperty.create("tall_hyacinth_stock_shape", TallHyacinthStockShape.class);
    public static final EnumProperty<WillowShape> WILLOW_SHAPE = EnumProperty.create("willow_shape", WillowShape.class);
}
