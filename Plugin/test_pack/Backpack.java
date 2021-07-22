package test_pack;






import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;






public class Backpack implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender Sender, org.bukkit.command.Command Command, String Alias, String[] args) {
		if(Sender instanceof Player) {
			Player player=(Player) Sender;
			if(!MainClass.instance.Backpak.containsKey(player.getUniqueId())) {
			MainClass.instance.Backpak.put(player.getUniqueId(), Bukkit.createInventory(player, 27,ChatColor.BLUE+"Rucksack"));
			}
			
			player.openInventory(MainClass.instance.Backpak.get(player.getUniqueId()));
			
			
				
					
			
					
		       
			
					
			
			//String toll=Rucksack.getStorageContents().toString();		
			
		}else {
		Sender.sendMessage(ChatColor.RED+"Das geht nur als Spieler");
	}
		

		return true;


	}
}