package com.github.torbs00.victuals;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class VictualListener implements Listener {

    private final Victual module;
    private final VictualUsageTracker usageTracker;

    VictualListener(Victual module) {
        this.module = module;
        this.usageTracker = new VictualUsageTracker();
    }

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        UUID uuid = player.getUniqueId();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();

        if(!(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)) {
            return;
        }

        if(event.getHand() == EquipmentSlot.OFF_HAND) {
            return;
        }

        if(!usageTracker.attemptUsage(uuid)) {
            return;
        }



    }
}
