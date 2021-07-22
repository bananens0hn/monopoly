package test_pack;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class EventListener implements Listener{
	@EventHandler
	public void OnClick(InventoryClickEvent Event){
	
		if(Event.getView().getTitle().contentEquals("Lotterie")){
			if(Event.getCurrentItem()!=null) {
				if(Event.getInventory().getItem(0).getItemMeta().getDisplayName().contentEquals(ChatColor.AQUA+"Click mich!")&Event.getCurrentItem().getType().equals(Material.CHEST)){
					HumanEntity player = Event.getWhoClicked();
					Event.setCancelled(true);
				   //int amount=Event.getClickedInventory().getItem(8).amount(sounsoviel);
					//dann von amount 1 abziehen wenns iwie geht
					int amount= Event.getClickedInventory().getItem(8).getAmount();
					if(Event.getClickedInventory().getItem(8).equals(new ItemStack(Material.EMERALD,amount))){
						if(Event.getCurrentItem()==null) {
							Event.getWhoClicked().sendMessage(ChatColor.RED+"Clicke die Kiste an!");
						}
						double random = Math.random();
						if(random<0.3){
						Event.getClickedInventory().setItem(8, new ItemStack(Material.EMERALD,amount*2));
						player.sendMessage(ChatColor.YELLOW+"Du hast gewonnen!");
							
						
					
						
						}	
						else{
						Event.getClickedInventory().setItem(8,new ItemStack(Material.IRON_INGOT,amount));
						 Event.getWhoClicked().sendMessage(ChatColor.YELLOW+"Du hast verloren!");
						 //player.setOp(true) ist n lustiger cmd lol
						//the chances and the emerald input (and www.bzga.de xD)
						}
						
						}
							
						}
				}
					
				}	
					
				}
}