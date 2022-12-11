package com.github.torbs00.victuals;

import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Victual implements VictualsAPI {

    /**
     * TODO:
     - 1) Caching of loaded victuals
     - 2) Saving/loading victuals
     - 3) Interactions
     - 4) API compatible.
     */


    private final JavaPlugin plugin;
    private final Logger logger;

    Victual(JavaPlugin plugin) {
        this.plugin = plugin;
        this.logger = plugin.getLogger();
    }

    void load() {
        logger.info("Starting Victual module");
    }

    void close() {

    }

    public JavaPlugin getPlugin() {
        return plugin;
    }

    public Logger getLogger() {
        return logger;
    }

    @Override
    public Supplier<Optional<VictualsItem>> getVictual(ItemStack item) {
        return null;
    }

    @Override
    public Supplier<Optional<VictualsItem>> getVictual(String name) {
        return null;
    }

}
