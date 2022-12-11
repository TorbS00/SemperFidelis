package com.github.torbs00.victuals;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Victual implements VictualsAPI {

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
}
