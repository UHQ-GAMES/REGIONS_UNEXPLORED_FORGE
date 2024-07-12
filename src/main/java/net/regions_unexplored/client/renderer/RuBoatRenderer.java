package net.regions_unexplored.client.renderer;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.entity.custom.RuBoat;
import net.regions_unexplored.entity.custom.RuChestBoat;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.stream.Stream;

public class RuBoatRenderer extends BoatRenderer {
    private final Map<RuBoat.ModelType, Pair<ResourceLocation, ListModel<Boat>>> boatResources;

    public RuBoatRenderer(EntityRendererProvider.Context context, boolean chest) {
        super(context, false);
        this.boatResources = Stream.of(RuBoat.ModelType.values()).collect(ImmutableMap.toImmutableMap((key) -> key, (model) ->
                Pair.of(ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, getTextureLocation(model, chest)), createBoatModel(context, model, chest))));
    }

    @Override
    public @NotNull Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(Boat boat) {
        if (boat instanceof RuChestBoat){
            return this.boatResources.get(((RuChestBoat)boat).getModel());
        }
        else{
            return this.boatResources.get(((RuBoat)boat).getModel());
        }
    }

    private static String getTextureLocation(RuBoat.ModelType type, boolean chest) {
        return chest ? "textures/entity/chest_boat/" + type.getName() + ".png" : "textures/entity/boat/" + type.getName() + ".png";
    }

    private BoatModel createBoatModel(EntityRendererProvider.Context context, RuBoat.ModelType type, boolean hasChest) {
        ModelLayerLocation modellayerlocation = hasChest ? chestBoatTextureLocation(type) : boatTextureLocation(type);
        ModelPart baked = context.bakeLayer(modellayerlocation);
        return hasChest ? new ChestBoatModel(baked) : new BoatModel(baked);
    }

    private static ModelLayerLocation getModel(String name, String model) {
        return new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(RegionsUnexploredMod.MOD_ID, name), model);
    }

    public static ModelLayerLocation boatTextureLocation(RuBoat.ModelType type) {
        return getModel("boat/" + type.getName(), "main");
    }

    public static ModelLayerLocation chestBoatTextureLocation(RuBoat.ModelType type) {
        return getModel("chest_boat/" + type.getName(), "main");
    }
}