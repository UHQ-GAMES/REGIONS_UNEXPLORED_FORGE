package net.regions_unexplored.api.item;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Food {
    private final int hunger;
    private final float saturationModifier;
    private final List<MobEffectInstance> effect = new ArrayList<>();
    private float effectChance;
    private boolean meat = false;
    private boolean snack = false;
    private boolean alwaysEdible = false;

    public Food(int hunger, float saturationModifier) {
        this.hunger = hunger;
        this.saturationModifier = saturationModifier;
    }

    public Food addEffect(Holder<MobEffect> effect, int effectDurationInTicks, float chance) {
        this.effect.add(new MobEffectInstance(effect, effectDurationInTicks));
        this.effectChance = chance;
        return this;
    }

    public Food isMeat() {
        this.meat = true;
        return this;
    }

    public Food isSnack() {
        this.snack = true;
        return this;
    }

    public Food alwaysEdible() {
        this.alwaysEdible = true;
        return this;
    }

    public FoodProperties createComponent() {
        FoodProperties.Builder builder = new FoodProperties.Builder()
                .nutrition(this.hunger)
                .saturationModifier(this.saturationModifier);

        for (MobEffectInstance me: this.effect) builder.effect(me, this.effectChance);

        if (snack) builder.fast();

        if (alwaysEdible) builder.alwaysEdible();

        return builder.build();
    }

    public Item asItem() {
        return new Item(new Item.Properties().food(createComponent()));
    }
}
