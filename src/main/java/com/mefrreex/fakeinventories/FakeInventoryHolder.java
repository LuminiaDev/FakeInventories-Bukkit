package com.mefrreex.fakeinventories;

import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class FakeInventoryHolder implements InventoryHolder {
    private final FakeInventory inventory;

    public FakeInventoryHolder(FakeInventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public @NotNull FakeInventory getInventory() {
        return inventory;
    }
}
