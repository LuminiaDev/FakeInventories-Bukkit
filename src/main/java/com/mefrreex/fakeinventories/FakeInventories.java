package com.mefrreex.fakeinventories;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class FakeInventories extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new FakeInventoryListener(), this);
        this.getServer().getCommandMap().register("", new Command("inv") {
            @Override
            public boolean execute(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String[] strings) {
                if (commandSender instanceof Player player) {
                    TestInventory testInventory = new TestInventory();
                    testInventory.getHolder();
                    testInventory.open(player);
                }
                return true;
            }
        });
    }
}
