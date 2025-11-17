package Chisu.characterKit;

import Chisu.characterKit.Commands.BlueKitCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class CharacterKit extends JavaPlugin {

    @Override
    public void onEnable() {
        // Registro de comandos
        getCommand("BlueKit").setExecutor(new BlueKitCommand());

        // Mensaje de Inicio
        System.out.println("Characterkit fue activado correctamente!");
    }

    @Override
    public void onDisable() {

        // Mensaje de Cierre
        System.out.println("El Plugin fue desactivado :C");
    }
}
