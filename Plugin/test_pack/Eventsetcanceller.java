package test_pack;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


	public class Eventsetcanceller implements Listener{
		@EventHandler
		public void OnClick(InventoryClickEvent Event){
		
			if(Event.getView().getTitle().contentEquals(ChatColor.BLUE+"Bingo")){
				if(Event.getCurrentItem()!=null) {
					Event.setCancelled(true);

}
}
		}
	
}