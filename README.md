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

## Maven
Adding repo:
```xml
<repositories>
    <repository>
        <id>luminiadev-repository-snapshots</id>
        <url>https://repo.luminiadev.com/snapshots</url>
    </repository>
</repositories>
```

Adding dependency:
```xml
<dependency>
    <groupId>com.luminiadev.fakeinventories.bukkit</groupId>
    <artifactId>FakeInventories</artifactId>
    <version>1.0.3</version>
</dependency>
```

## Gradle
Adding repo:
```kts
maven {
    name = "luminiadevRepositorySnapshots"
    url = uri("https://repo.luminiadev.com/snapshots")
}
```

Adding dependency:
```kts
compileOnly("com.luminiadev.fakeinventories.bukkit:FakeInventories:1.0.3")
```