package me.pseudo.workshop.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SayCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player player)) {
            return false;
        }

        if (strings.length == 0) {
            player.sendMessage(ChatColor.RED + "Usage: /say <message>");
            return false;
        }

        Bukkit.broadcastMessage("§aThe player §e" + player.getName() + "§a say :" + strings[0]);
        return true;
    }
}
