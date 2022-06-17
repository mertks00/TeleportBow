package me.oyuncozucu.teleportbow.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class BowListener implements Listener {

    @EventHandler
    public void onArrowLand(ProjectileHitEvent e) {

        if (e.getEntity().getType() == EntityType.ARROW) {
            if (e.getEntity().getShooter() instanceof Player) {
                Player player = (Player) e.getEntity().getShooter();

                ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
                if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED+ "Teleport Bow")) {

                    Location location = e.getEntity().getLocation();
                    player.teleport(location);
                    e.getEntity().remove();
                    player.sendMessage(ChatColor.GREEN+ "Işınlandın!");
                    player.playSound(location, Sound.ENTITY_BLAZE_SHOOT, 1.0F, 1.0F);

                }

            }
        }

    }

}
