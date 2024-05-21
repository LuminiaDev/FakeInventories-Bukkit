package com.mefrreex.fakeinventories;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import com.mefrreex.fakeinventories.handler.FakeInventoryItemHandler;

import java.util.Map;

public class FakeInventoryListener implements Listener {

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent event) {
        if(event.getInventory().getHolder() instanceof FakeInventoryHolder holder) {
            if (event.getView().getPlayer() instanceof Player player) {
                holder.getInventory().onOpen(player);
            }
        }
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {
        if(event.getInventory().getHolder() instanceof FakeInventoryHolder holder) {
            if (event.getView().getPlayer() instanceof Player player) {
                holder.getInventory().onClose(player);
            }
        }
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if(event.getInventory().getHolder() instanceof FakeInventoryHolder holder) {
            if (event.getView().getPlayer() instanceof Player player) {
                Map<Integer, FakeInventoryItemHandler> handlers = holder.getInventory().getItemHandlers();
                FakeInventoryItemHandler handler = handlers.getOrDefault(event.getSlot(), holder.getInventory().getDefaultItemHandler());
                if (handler != null) {
                    handler.handle(player);
                }
            }
        }
    }
}
