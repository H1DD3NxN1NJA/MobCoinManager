package me.h1dd3nxn1nja.mobcoinmanager.api.events;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class ShopEvent extends Event {
	
	  private static final HandlerList handlers = new HandlerList();
	  private Player player;
	  private int value;
	  private ItemStack items;
	  private List<String> commands;
	  
	  public ShopEvent(Player player, ItemStack items, int value, List<String> commands) {
	    this.player = player;
	    this.value = value;
	    this.commands = commands;
	    this.items = items;
	  }
	  
	  public Player getPlayer() {
	    return player;
	  }
	  
	  public int getPrice() {
	    return value;
	  }
	  
	  public ItemStack getItems() {
	    return items;
	  }
	  
	  public List<String> getCommands() {
	    return commands;
	  }
	  
	  public HandlerList getHandlers() {
	    return handlers;
	  }
	  
	  public static HandlerList getHandlerList() {
	    return handlers;
	}
}
