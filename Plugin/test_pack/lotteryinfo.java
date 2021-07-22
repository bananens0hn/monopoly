package test_pack;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class lotteryinfo implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender Sender, org.bukkit.command.Command Command, String Alias, String[] args) {
		Sender.sendMessage(ChatColor.GREEN+"Zur Benutzung des lottery Commands 1 Smaragd in den 9. Slot des Inventars legen und auf die Truhe clicken! Gewinnchance: 30% Preis: 2 Smaragde Trostpreis: 1 Eisenbarren                      Glücksspiel kann süchtig machen Infos unter www.bzga.de");
		return true;
	}

}
