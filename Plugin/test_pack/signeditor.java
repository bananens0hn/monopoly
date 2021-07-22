package test_pack;




import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.block.Sign;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;




public class signeditor implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender Sender, org.bukkit.command.Command Command, String Alias, String[] args) {
		if (Sender instanceof Player) {
			Player player=(Player) Sender;
			if (player.getTargetBlockExact(4).getState() instanceof Sign) {
				Sign sign = (Sign)  player.getTargetBlockExact(5).getState();
				
				int in = Integer.parseInt(args[0]);
				int arg0=in-1;
				String arg1=String.join(" ", Arrays.copyOfRange(args, 1, args.length));
				sign.setLine(arg0,arg1);
				sign.update(true);
				if (in!=1&in!=2&in!=3&in!=4) {
					player.sendMessage("Gib eine Zahl zwischen 1 und 4 an");				}
				
				//internal error meldungen eliminieren
				
				
			}else {
				Sender.sendMessage(ChatColor.RED+"Dafür musst du ein Schild targetten");
			}
			
		}else {
			Sender.sendMessage(ChatColor.RED+"Das geht nur als Spieler");
		}
			
			
		return true;
	}
}



