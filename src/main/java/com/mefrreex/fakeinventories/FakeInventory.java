package com.mefrreex.fakeinventories;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import net.kyori.adventure.text.Component;
import com.mefrreex.fakeinventories.handler.FakeInventoryCloseHandler;
import com.mefrreex.fakeinventories.handler.FakeInventoryItemHandler;
import com.mefrreex.fakeinventories.handler.FakeInventoryOpenHandler;
import lombok.Setter;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class FakeInventory extends FakeInventoryAdapter {

    private final InventoryType inventoryType;
    private final Component title;

    private FakeInventoryItemHandler defaultItemHandler = (player) -> {};
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
        super(Bukkit.createInventory(null, inventoryType, title));
        this.inventoryType = inventoryType;
        this.title = title;
    }

    public void setItemHandler(int index, FakeInventoryItemHandler handler) {
        this.itemHandlers.put(index, handler);
    }

    public void onOpen(Player player) {
        this.openHandler.handle(player);
    }

    public void onClose(Player player) {
        this.closeHandler.handle(player);
    }

    public void open(Player player) {
        player.openInventory(this.getInventory());
    }
}
