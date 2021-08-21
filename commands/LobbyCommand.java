package fr.allgames.basics.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class LobbyCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player))
		{
			
			sender.sendMessage("Ooops, you're not a player.");
			return false;
			
		}
		
		Location lobby = new Location(Bukkit.getWorld("world"), 263, 65, 385);
		Player player = (Player) sender;
		
		player.teleport(lobby);
		player.sendMessage(ChatColor.GREEN + "Téléportation effectué avec succès");
		return false;
	}

}
