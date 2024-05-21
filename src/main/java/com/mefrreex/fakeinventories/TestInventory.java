package com.mefrreex.fakeinventories;

import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

public class TestInventory extends FakeInventory {

    public TestInventory() {
        super(InventoryType.CHEST, "Тайтл честа");
        this.setItem(0, new ItemStack(Material.ACACIA_LEAVES));
        this.setItemHandler(0, (player, slot, oldItem, newItem, event) -> {
            System.out.println("Item clicked!\nSlot: " + slot + ", \nOld Item: " + oldItem + ", \nNew Item: " + newItem + ", \nAction: " + event.getAction());
        });
        this.setOpenHandler((player, event) -> {
            System.out.println("Inventory opened!");
        });
        this.setCloseHandler((player, event) -> {
            System.out.println("Inventory closed!");
        });
    }
}
