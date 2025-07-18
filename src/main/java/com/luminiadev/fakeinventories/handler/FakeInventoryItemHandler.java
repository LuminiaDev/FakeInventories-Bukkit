package com.luminiadev.fakeinventories.handler;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public interface FakeInventoryItemHandler {
    void handle(Player player, int slot, ItemStack oldItem, ItemStack newItem, InventoryClickEvent event);
}
