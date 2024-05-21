package com.mefrreex.fakeinventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import net.kyori.adventure.text.Component;
import com.mefrreex.fakeinventories.handler.FakeInventoryCloseHandler;
import com.mefrreex.fakeinventories.handler.FakeInventoryItemHandler;
import com.mefrreex.fakeinventories.handler.FakeInventoryOpenHandler;
import lombok.Setter;
import lombok.Getter;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class FakeInventory extends FakeInventoryAdapter {

    private final Inventory inventory;
    private final InventoryType inventoryType;
    private final Component title;

    private FakeInventoryItemHandler defaultItemHandler = (player, slot, oldItem, newItem, event) -> {};
    private final Map<Integer, FakeInventoryItemHandler> itemHandlers = new HashMap<>();
    private FakeInventoryOpenHandler openHandler;
    private FakeInventoryCloseHandler closeHandler;

    public FakeInventory(InventoryType inventoryType) {
        this(inventoryType, inventoryType.defaultTitle());
    }

    public FakeInventory(InventoryType inventoryType, String title) {
        this(inventoryType, Component.text(title));
    }

    public FakeInventory(InventoryType inventoryType, Component title) {
        this.inventory = Bukkit.createInventory(new FakeInventoryHolder(this), inventoryType, title);
        this.inventoryType = inventoryType;
        this.title = title;
    }

    protected @NotNull Inventory getInventory() {
        return inventory;
    }

    public void setItemHandler(int index, FakeInventoryItemHandler handler) {
        this.itemHandlers.put(index, handler);
    }

    public void onOpen(Player player, InventoryOpenEvent event) {
        this.openHandler.handle(player, event);
    }

    public void onClose(Player player, InventoryCloseEvent event) {
        this.closeHandler.handle(player, event);
    }

    public void onClick(Player player, InventoryClickEvent event) {
        FakeInventoryItemHandler handler = itemHandlers.getOrDefault(event.getSlot(), defaultItemHandler);
        if (handler != null) {
            ItemStack itemStack = event.getCurrentItem() != null ? event.getCurrentItem() : new ItemStack(Material.AIR);
            handler.handle(player, event.getSlot(), itemStack, event.getCursor(), event);
        }
    }

    public void open(Player player) {
        player.openInventory(this.getInventory());
    }
}
