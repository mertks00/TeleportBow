package me.oyuncozucu.teleportbow.commands;

import me.oyuncozucu.teleportbow.utils.BowItem;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("teleportbow.command")) {

                player.getInventory().addItem(BowItem.bowItem(player));

            }else{
                player.sendMessage(ChatColor.RED+ "Buna izniniz yok.");
            }

        }


        return true;
    }
}
