package me.h1dd3nxn1nja.mobcoinmanager.api;

import org.bukkit.entity.Player;

import me.h1dd3nxn1nja.mobcoinmanager.Main;

public class MobCoinManager {
	
	private static MobCoinManager instance = new MobCoinManager();

	public static MobCoinManager getInstance() {
		return instance;
	}
	
	/**
	 * 
	 * Gets the players mob coin balance.
	 * @param player the player you want to get the balance from.
	 * @return integer amount of mob coins a player has.
	 */
	public int getMobCoins(Player player) {
		return Main.settings.getPlayerData().getInt("Players." + player.getUniqueId().toString() + ".Coins");
	}
	
	/**
	 * 
	 * You can set the amount of mob coins you want a player to have.
	 * @param player the player you want to change the balance of.
	 * @param amount integer amount of mob coins you want to set the players balance to.
	 */
	public void setMobCoins(Player player, int amount) {
		Main.settings.getPlayerData().set("Players." + player.getUniqueId() + ".Coins", Integer.valueOf(amount));
		Main.settings.savePlayerData();
	}
	
	/**
	 * 
	 * You can add X amount of mob coins to a players account.
	 * @param player the player you want to add mob coins to.
	 * @param amount integer amount of mob coins you want to add to the players account.
	 */
	public void addMobCoins(Player player, int amount) {
		Main.settings.getPlayerData().set("Players." + player.getUniqueId() + ".Coins", Integer.valueOf(getMobCoins(player) + amount));
		Main.settings.savePlayerData();
	}
	
	/**
	 * 
	 * You can reset a players mob coin amount to 0.
	 * @param player the player you want to reset the mob coins of.
	 */
	public void resetMobCoins(Player player) {
		Main.settings.getPlayerData().set("Players." + player.getUniqueId() + ".Coins", Integer.valueOf(0));
		Main.settings.savePlayerData();
	}
	
	/**
	 * 
	 * You can remove X amount of mob coins from a players account.
	 * @param player the player you want to remove the mob coins of.
	 * @param amount integer amount of mob coins you want to remove from a players account.
	 */
	public void removeMobCoins(Player player, int amount) {
		if (getMobCoins(player) - amount < 0) {
			Main.settings.getPlayerData().set("Players." + player.getUniqueId() + ".Coins", Integer.valueOf(0));
		} else {
			Main.settings.getPlayerData().set("Players." + player.getUniqueId() + ".Coins", Integer.valueOf(getMobCoins(player) - amount));
		}
		Main.settings.savePlayerData();
	}
}
