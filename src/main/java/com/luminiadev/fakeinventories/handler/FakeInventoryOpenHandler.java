package com.luminiadev.fakeinventories.handler;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryOpenEvent;

public interface FakeInventoryOpenHandler {
    void handle(Player player, InventoryOpenEvent event);
}
