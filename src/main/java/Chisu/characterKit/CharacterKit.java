package Chisu.characterKit;

import Chisu.characterKit.Commands.EjemploCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class CharacterKit extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("ejemplo").setExecutor(new EjemploCommand());

        // Mensaje de Inicio
        System.out.println("Characterkit fue activado correctamente!");
    }

    @Override
    public void onDisable() {

        // Mensaje de Cierre
        System.out.println("El Plugin fue desactivado :C");
    }
}
