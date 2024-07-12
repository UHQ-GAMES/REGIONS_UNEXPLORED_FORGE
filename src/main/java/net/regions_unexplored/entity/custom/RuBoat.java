package net.regions_unexplored.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.entity.RuEntities;
import net.regions_unexplored.item.RuItems;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

import java.util.Arrays;

public class RuBoat extends Boat {
    public RuBoat(EntityType<? extends RuBoat> type, Level level) {
        super(type, level);
        this.blocksBuilding = true;
    }

    public RuBoat(Level level, double x, double y, double z) {
        this((EntityType<? extends RuBoat>) RuEntities.BOAT.get(), level);
        this.setPos(x, y, z);
        this.xo = x;
        this.yo = y;
        this.zo = z;
    }

    @Override
    protected Vec3 getPassengerAttachmentPoint(Entity entity, EntityDimensions entityDimensions, float isBamboo) {
        float f = this.getSinglePassengerXOffset();
        if (this.getPassengers().size() > 1) {
            int i = this.getPassengers().indexOf(entity);
            if (i == 0) {
                f = 0.2F;
            } else {
                f = -0.6F;
            }

            if (entity instanceof Animal) {
                f += 0.2F;
            }
        }

        return new Vec3(0.0F, entityDimensions.height() / 3.0F, f);
    }

    @Override
    public @NotNull Item getDropItem() {
        return switch (ModelType.byId(this.entityData.get(DATA_ID_TYPE))) {
            case BLACKWOOD -> RuItems.BLACKWOOD_BOAT.get();
            case CYPRESS -> RuItems.CYPRESS_BOAT.get();
            case DEAD -> RuItems.DEAD_BOAT.get();
            case EUCALYPTUS -> RuItems.EUCALYPTUS_BOAT.get();
            case JOSHUA -> RuItems.JOSHUA_BOAT.get();
            case KAPOK -> RuItems.KAPOK_BOAT.get();
            case LARCH -> RuItems.LARCH_BOAT.get();
            case MAGNOLIA -> RuItems.MAGNOLIA_BOAT.get();
            case MAPLE -> RuItems.MAPLE_BOAT.get();
            case MAUVE -> RuItems.MAUVE_BOAT.get();
            case PALM -> RuItems.PALM_BOAT.get();
            case PINE -> RuItems.PINE_BOAT.get();
            case REDWOOD -> RuItems.REDWOOD_BOAT.get();
            case SOCOTRA -> RuItems.SOCOTRA_BOAT.get();
            case WILLOW -> RuItems.WILLOW_BOAT.get();
            default -> RuItems.BAOBAB_BOAT.get();
        };
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        tag.putString("model", getModel().getName());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        if (tag.contains("model", Tag.TAG_STRING)) {
            this.entityData.set(DATA_ID_TYPE, ModelType.byName(tag.getString("model")).ordinal());
        }
    }

    @Override
    protected void checkFallDamage(double distance, boolean onLand, BlockState state, BlockPos pos) {
        this.lastYd = this.getDeltaMovement().y;
        if (!this.isPassenger()) {
            if (onLand) {
                if (this.fallDistance > 3.0F) {
                    if (this.status != Status.ON_LAND) {
                        this.resetFallDistance();
                        return;
                    }

                    this.causeFallDamage(this.fallDistance, 1.0F, this.damageSources().fall());
                    if (!this.level.isClientSide && !this.isRemoved()) {
                        this.kill();
                        if (this.level.getGameRules().getBoolean(GameRules.RULE_DOENTITYDROPS)) {
                            for(int i = 0; i < 3; ++i) {
                                this.spawnAtLocation(this.getVariant().getPlanks());
                            }

                            for(int j = 0; j < 2; ++j) {
                                this.spawnAtLocation(Items.STICK);
                            }
                        }
                    }
                }

                this.resetFallDistance();
            }
            else if (!this.canBoatInFluid(this.level.getFluidState(this.blockPosition().below())) && distance < 0.0D) {
                this.fallDistance -= (float)distance;
            }

        }
    }

    public void setModel(ModelType model) {
        this.entityData.set(DATA_ID_TYPE, model.ordinal());
    }

    public ModelType getModel() {
        return ModelType.byId(this.entityData.get(DATA_ID_TYPE));
    }

    @Deprecated
    @Override
    public void setVariant(Type type) {
        this.entityData.set(DATA_ID_TYPE, type.ordinal());
    }

    @Deprecated
    @Override
    public Type getVariant() {
        return Type.byId(this.entityData.get(DATA_ID_TYPE));
    }

    public enum ModelType {
        BAOBAB("baobab", RuBlocks.BAOBAB_PLANKS.get()),
        BLACKWOOD("blackwood", RuBlocks.BLACKWOOD_PLANKS.get()),
        MAGNOLIA("magnolia", RuBlocks.MAGNOLIA_PLANKS.get()),
        CYPRESS("cypress", RuBlocks.CYPRESS_PLANKS.get()),
        DEAD("dead", RuBlocks.DEAD_PLANKS.get()),
        EUCALYPTUS("eucalyptus", RuBlocks.EUCALYPTUS_PLANKS.get()),
        JOSHUA("joshua", RuBlocks.JOSHUA_PLANKS.get()),
        KAPOK("kapok", RuBlocks.KAPOK_PLANKS.get()),
        LARCH("larch", RuBlocks.LARCH_PLANKS.get()),
        MAPLE("maple", RuBlocks.MAPLE_PLANKS.get()),
        MAUVE("mauve", RuBlocks.MAUVE_PLANKS.get()),
        PALM("palm", RuBlocks.PALM_PLANKS.get()),
        PINE("pine", RuBlocks.PINE_PLANKS.get()),
        REDWOOD("redwood", RuBlocks.REDWOOD_PLANKS.get()),
        SOCOTRA("socotra", RuBlocks.SOCOTRA_PLANKS.get()),
        WILLOW("willow", RuBlocks.WILLOW_PLANKS.get());

        private final String name;
        private final Block planks;

        ModelType(String name, Block planks) {
            this.name = name;
            this.planks = planks;
        }

        public String getName() {
            return this.name;
        }

        public Block getPlanks() {
            return this.planks;
        }

        public String toString() {
            return this.name;
        }

        public static ModelType byId(int id) {
            ModelType[] modelType = values();
            if (id < 0 || id >= modelType.length) {
                return modelType[0];
            }
            else{
                return modelType[id];
            }
        }

        public static ModelType byName(String name) {
            ModelType[] modelType = values();
            return Arrays.stream(modelType).filter(t ->
                    t.getName().equals(name)).findFirst().orElse(modelType[0]);
        }
    }
}