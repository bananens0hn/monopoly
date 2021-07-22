package test_pack;




import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class Command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender Sender, org.bukkit.command.Command Command, String Alias, String[] args) {
		if(Sender instanceof Player ) {
			Player player=(Player) Sender;
			Inventory inventory=Bukkit.createInventory(player,9,ChatColor.BLUE+"Lotterie");
			
            ItemStack itmstk = new ItemStack (Material.CHEST);
            
            ItemMeta itmmta = itmstk.getItemMeta();
            itmmta.setDisplayName(ChatColor.AQUA+"Click mich!");
            itmstk.setItemMeta(itmmta);
            inventory.setItem(0, itmstk);
            
                //Sender.sendMessage(ChatColor.GREEN+"Zur Benutzung einen Smaragd in den 9. Slot des Invenrtars legen und auf die Truhe clicken!");
            
			
			player.openInventory(inventory);
		} else {
			Sender.sendMessage("Das geht nur als Spieler!");
		}
		return true;
	}

}
