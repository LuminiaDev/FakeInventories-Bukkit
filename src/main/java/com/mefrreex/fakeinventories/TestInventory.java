package com.mefrreex.fakeinventories;

import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

public class TestInventory extends FakeInventory {

    public TestInventory() {
        super(InventoryType.CHEST, "Тайтл честа");
        this.setItem(0, new ItemStack(Material.ACACIA_LEAVES));
        this.setItemHandler(0, (player) -> {
            player.sendMessage("Item clicked!");
        });
        this.setOpenHandler((player) -> {
            player.sendMessage("Inventory opened!");
        });
        this.setCloseHandler((player) -> {
            player.sendMessage("Inventory closed!");
        });
    }
}
