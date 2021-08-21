package fr.allgames.basics;

import org.bukkit.plugin.java.JavaPlugin;

import fr.allgames.basics.commands.LobbyCommand;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		System.out.println("Basics by AllGames: Started");
		getCommand("lobby").setExecutor(new LobbyCommand());
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		System.out.println("Basics by AllGames: Stopped");
		super.onEnable();
	}
}
