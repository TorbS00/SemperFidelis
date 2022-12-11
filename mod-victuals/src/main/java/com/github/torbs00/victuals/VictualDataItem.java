package com.github.torbs00.victuals;

import org.bukkit.inventory.ItemStack;

import java.util.Objects;

record VictualDataItem(String name, ItemStack item) implements VictualsItem {

    VictualDataItem {
        Objects.requireNonNull(name);
        Objects.requireNonNull(item);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public ItemStack item() {
        return item;
    }
}
