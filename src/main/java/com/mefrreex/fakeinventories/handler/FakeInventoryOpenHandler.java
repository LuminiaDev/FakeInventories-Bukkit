package com.mefrreex.fakeinventories.handler;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryOpenEvent;

public interface FakeInventoryOpenHandler {
    void handle(Player player, InventoryOpenEvent event);
}
