package com.github.torbs00.victuals;

import org.bukkit.inventory.ItemStack;

import java.util.Optional;
import java.util.function.Supplier;

public interface VictualsAPI {

    Supplier<Optional<VictualsItem>> getVictual(ItemStack item);

    Supplier<Optional<VictualsItem>> getVictual(String name);

}
