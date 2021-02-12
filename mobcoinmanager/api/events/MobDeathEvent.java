package me.h1dd3nxn1nja.mobcoinmanager.api.events;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MobDeathEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	private Player player;
	private int amount;
	private int chance;
	private EntityType mob;

	public MobDeathEvent(Player player, int value, int chance, EntityType mob) {
		this.player = player;
		this.amount = value;
		this.chance = chance;
		this.mob = mob;
	}

	public Player getPlayer() {
		return player;
	}

	public int getAmount() {
		return amount;
	}

	public int getChance() {
		return chance;
	}

	public EntityType getMobType() {
		return mob;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
