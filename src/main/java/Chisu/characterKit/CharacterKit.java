package Chisu.characterKit;

import org.bukkit.plugin.java.JavaPlugin;

public final class CharacterKit extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Characterkit fue activado correctamente!");
    }

    @Override
    public void onDisable() {
        System.out.println("El Plugin fue desactivado :C");
    }
}
