package com.github.torbs00.victuals;

import org.bukkit.potion.PotionEffect;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class VictualData implements VictualDataAttributes, Victuals {

    private final VictualDataItem victualItem;
    private final int hunger;
    private final double health;
    private final PotionEffect effect;

    VictualData(VictualDataItem victualItem, int hunger, double health, PotionEffect effect) {
        this.victualItem = victualItem;
        this.hunger = hunger;
        this.health = health;
        this.effect = effect;
    }

    @Override
    public OptionalInt getHunger() {
        return OptionalInt.of(hunger);
    }

    @Override
    public OptionalDouble getHealth() {
        return OptionalDouble.of(hunger);
    }

    @Override
    public Optional<PotionEffect> getEffect() {
        return Optional.ofNullable(effect);
    }
}
