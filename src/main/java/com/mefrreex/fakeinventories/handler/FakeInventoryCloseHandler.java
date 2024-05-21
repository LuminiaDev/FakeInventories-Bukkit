package com.mefrreex.fakeinventories.handler;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryCloseEvent;

public interface FakeInventoryCloseHandler {
    void handle(Player player, InventoryCloseEvent event);
}
