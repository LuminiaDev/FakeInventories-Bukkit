package com.luminiadev.fakeinventories.handler;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryCloseEvent;

public interface FakeInventoryCloseHandler {
    void handle(Player player, InventoryCloseEvent event);
}
