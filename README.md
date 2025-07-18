# FakeInventories
Simple FakeInventories plugin for Bukkit (Paper) based Minecraft Servers

## 🛠 Example of usage

Creating a chest or other inventory by type

```java
import com.luminiadev.fakeinventories.FakeInventory;
import org.bukkit.event.inventory.InventoryType;

FakeInventory fakeInventory = new FakeInventory(InventoryType.CHEST, "Chest title");
```
Creating a chest of custom size

```java
import com.luminiadev.fakeinventories.FakeInventory;
import com.luminiadev.fakeinventories.GenericInventorySlots;

// GenericInventorySlots.FIFTY_FOUR constant that contains int
FakeInventory fakeInventory = new FakeInventory(GenericInventorySlots.FIFTY_FOUR, "Double chest title");
```
