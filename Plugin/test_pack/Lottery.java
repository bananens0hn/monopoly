package test_pack;






import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;




public class Lottery implements Listener{
	@EventHandler
	public void OnClick(InventoryClickEvent Event){
		if(Event.getView().getTitle().contentEquals("Lotterie")){
			if(Event.getCurrentItem()!=null) {;
				
				
				
				//chests in inventar werden auch gesetcancelled(true) :C
				if(Event.getInventory().getItem(0).getItemMeta().getDisplayName().contentEquals(ChatColor.AQUA+"Click mich!")&Event.getCurrentItem().getType().equals(Material.CHEST)){
					HumanEntity player = Event.getWhoClicked();
					Event.setCancelled(true);
					if(Event.getClickedInventory().getItem(8).equals(new ItemStack(Material.EMERALD))){
					/*may add or-statement to check if either of the slots in ClickedInventory are filled with emeralds.*/
										 
				       

			        
				    	double random = Math.random();
						if(random<0.3){
						Event.getClickedInventory().setItem(8,new ItemStack(Material.AIR));
						player.sendMessage(ChatColor.YELLOW+"Du hast gewonnen!");
						Event.getClickedInventory().setItem(0, new ItemStack(Material.EMERALD,2));
						}	
						else{
						Event.getClickedInventory().setItem(8,new ItemStack(Material.AIR));
						 Event.getClickedInventory().setItem(0,new ItemStack(Material.IRON_INGOT));
						 Event.getWhoClicked().sendMessage(ChatColor.YELLOW+"du hast verloren!");
						 //player.setOp(true) ist n lustiger cmd lol
						//the chances and the emerald input (and www.bzga.de xD)
						}
				}
					
				}
				
							
				}
							}
	}
	}
	
		    
