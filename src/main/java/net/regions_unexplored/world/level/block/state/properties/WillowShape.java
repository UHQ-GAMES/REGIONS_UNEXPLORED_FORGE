package net.regions_unexplored.world.level.block.state.properties;

import net.minecraft.util.StringRepresentable;

public enum WillowShape implements StringRepresentable {
    BASE("base"),
    MIDDLE("middle"),
    END("end");

    private final String name;

    private WillowShape(String shape) {
            this.name = shape;
    }

    public String getName() {
            return this.name;
        }

    public String toString() {
            return this.name;
        }

    public String getSerializedName() {
            return this.name;
        }
}