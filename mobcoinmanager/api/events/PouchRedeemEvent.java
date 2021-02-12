package me.h1dd3nxn1nja.mobcoinmanager.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PouchRedeemEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	private Player player;
	private int value;

	public PouchRedeemEvent(Player player, int value) {
		this.player = player;
		this.value = value;
	}

	public Player getPlayer() {
		return player;
	}

	public int getValue() {
		return value;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
