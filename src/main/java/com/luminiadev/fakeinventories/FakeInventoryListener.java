package com.luminiadev.fakeinventories;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;

public class FakeInventoryListener implements Listener {

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent event) {
        if(event.getInventory().getHolder() instanceof FakeInventoryHolder holder) {
            if (event.getView().getPlayer() instanceof Player player) {
                holder.getInventory().onOpen(player, event);
            }
        }
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {
        if(event.getInventory().getHolder() instanceof FakeInventoryHolder holder) {
            if (event.getView().getPlayer() instanceof Player player) {
                holder.getInventory().onClose(player, event);
            }
        }
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if(event.getInventory().getHolder() instanceof FakeInventoryHolder holder) {
            if (event.getView().getPlayer() instanceof Player player) {
                holder.getInventory().onClick(player, event);
            }
        }
    }
}
