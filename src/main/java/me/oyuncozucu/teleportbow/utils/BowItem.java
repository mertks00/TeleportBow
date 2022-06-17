package me.oyuncozucu.teleportbow.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.swing.text.AttributeSet;

public class BowItem {

    public static ItemStack bowItem(Player player) {

        ItemStack bow = new ItemStack(Material.BOW);

        ItemMeta bow_ = bow.getItemMeta();
        bow_.setDisplayName(ChatColor.RED+ "Teleport Bow");
        bow_.addEnchant(Enchantment.ARROW_INFINITE,1,false);
        bow.setItemMeta(bow_);

        return bow;

    }

}
