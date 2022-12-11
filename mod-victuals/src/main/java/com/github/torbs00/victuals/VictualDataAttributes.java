package com.github.torbs00.victuals;

import org.bukkit.potion.PotionEffect;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface VictualDataAttributes {

    OptionalInt getHunger();

    OptionalDouble getHealth();

    Optional<PotionEffect> getEffect();

}
