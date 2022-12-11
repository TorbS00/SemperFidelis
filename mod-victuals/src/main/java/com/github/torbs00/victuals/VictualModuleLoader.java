package com.github.torbs00.victuals;

import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

public class VictualModuleLoader extends JavaPlugin {

    private Victual module;

    @Override
    public synchronized void onEnable() {
        module = new Victual(this);
        module.load();
        getServer().getServicesManager().register(VictualsAPI.class, module, this, ServicePriority.Low);
    }

    @Override
    public synchronized void onDisable(){
        module.close();
        module = null;
    }

}
