package me.zain.projectkorra;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import me.zain.projectkorra.listeners.DamageListener;
import me.zain.projectkorra.weaknesses.WeaknessManager;
import me.zain.projectkorra.elements.ElementRegistry;

public class ProjectKorraCustom extends JavaPlugin {

    @Override
    public void onEnable() {
        ElementRegistry.registerAll();
        WeaknessManager.load();
        Bukkit.getPluginManager().registerEvents(new DamageListener(), this);
        getLogger().info("ProjectKorraCustom Enabled!");
    }
}
