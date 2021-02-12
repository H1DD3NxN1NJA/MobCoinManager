package me.h1dd3nxn1nja.mobcoinmanager.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RedeemCoinEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	private Player player;
	private int amount;

	public RedeemCoinEvent(Player player, int amount) {
	    this.player = player;
	    this.amount = amount;
	}

	public Player getPlayer() {
		return player;
	}

	public int getAmount() {
		return amount;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
