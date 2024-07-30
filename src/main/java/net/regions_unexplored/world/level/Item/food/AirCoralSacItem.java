package net.regions_unexplored.world.level.Item.food;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.regions_unexplored.api.item.Food;
import net.regions_unexplored.api.item.FoodItem;
import org.jetbrains.annotations.NotNull;

public class AirCoralSacItem extends FoodItem {
    public AirCoralSacItem(@NotNull Properties properties, Food food) {
        super(properties, food);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        FoodProperties foodproperties = itemStack.get(DataComponents.FOOD);
        int airSupply = entity.getAirSupply();

        if(entity instanceof Player) {
            airSupply+=100;
            entity.setAirSupply(Math.min(airSupply, 300));
        }
        return foodproperties != null ? entity.eat(level, itemStack, foodproperties) : itemStack;
    }
}
