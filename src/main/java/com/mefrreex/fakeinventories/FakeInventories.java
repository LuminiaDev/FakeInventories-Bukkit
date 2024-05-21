package com.mefrreex.fakeinventories;

import org.bukkit.plugin.java.JavaPlugin;

public class FakeInventories extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new FakeInventoryListener(), this);
    }
}
