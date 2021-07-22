package test_pack;

import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;
public class ListenerTest implements CommandExecutor{
	public static void swap(Material[] arr, int i, int j) {
	    Material temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
		@Override
	public boolean onCommand(CommandSender Sender, org.bukkit.command.Command Command, String Alias, String[] args) {
		if (Sender instanceof Player) {
			
			Player player=(Player) Sender;		
			
			Material[] allitemsiwannahave=new Material[30];
			ItemStack[] itemstacks = new ItemStack[9];
			
			allitemsiwannahave[0]=Material.CAKE;
			allitemsiwannahave[1]=Material.GOLDEN_APPLE;
			allitemsiwannahave[2]=Material.BRICK;
			allitemsiwannahave[3]=Material.JACK_O_LANTERN;
			allitemsiwannahave[4]=Material.CLOCK;
			allitemsiwannahave[5]=Material.CROSSBOW;
			allitemsiwannahave[6]=Material.BOOKSHELF;
			allitemsiwannahave[7]=Material.INK_SAC;
			allitemsiwannahave[8]=Material.SMOOTH_QUARTZ;
			allitemsiwannahave[9]=Material.GLOWSTONE;
			allitemsiwannahave[10]=Material.CAMPFIRE;
			allitemsiwannahave[11]=Material.ANVIL;
			allitemsiwannahave[12]=Material.LAVA_BUCKET;
			allitemsiwannahave[13]=Material.ENCHANTING_TABLE;
			allitemsiwannahave[14]=Material.COMPARATOR;
			allitemsiwannahave[15]=Material.ANDESITE_SLAB;
			allitemsiwannahave[16]=Material.DRIED_KELP_BLOCK;
			allitemsiwannahave[17]=Material.CUT_SANDSTONE;
			allitemsiwannahave[18]=Material.PUFFERFISH;
			allitemsiwannahave[19]=Material.MAGMA_BLOCK;
			allitemsiwannahave[20]=Material.ENDER_EYE;
			allitemsiwannahave[21]=Material.JUKEBOX;
			allitemsiwannahave[22]=Material.RED_BED;
			allitemsiwannahave[23]=Material.COOKIE;
			allitemsiwannahave[24]=Material.SWEET_BERRIES;
			allitemsiwannahave[25]=Material.EMERALD;
			allitemsiwannahave[26]=Material.GLASS_BOTTLE;
			allitemsiwannahave[27]=Material.SUSPICIOUS_STEW;
			allitemsiwannahave[28]=Material.FERMENTED_SPIDER_EYE;
			allitemsiwannahave[29]=Material.DETECTOR_RAIL;
	/*	if (args.length>0) {
			
		
			if (args[0].contentEquals("new")) {
				Random rn=new Random();
				for (int i = 0; i < allitemsiwannahave.length; i++) {
					
				
				swap(allitemsiwannahave, rn.nextInt(29-i), 29-i);*/
				itemstacks[0]=new ItemStack(allitemsiwannahave[0]);
				itemstacks[1]=new ItemStack(allitemsiwannahave[1]);
				itemstacks[2]=new ItemStack(allitemsiwannahave[2]);
				itemstacks[3]=new ItemStack(allitemsiwannahave[3]);
				itemstacks[4]=new ItemStack(allitemsiwannahave[4]);
				itemstacks[5]=new ItemStack(allitemsiwannahave[5]);
				itemstacks[6]=new ItemStack(allitemsiwannahave[6]);
				itemstacks[7]=new ItemStack(allitemsiwannahave[7]);
				itemstacks[8]=new ItemStack(allitemsiwannahave[8]);
				
			//}4
		//	}
			//}else {
			//	Sender.sendMessage("/bingo new");
			//}
		/*itemstacks[0]=new ItemStack(allitemsiwannahave[0]);
			itemstacks[1]=new ItemStack(allitemsiwannahave[1]);
			itemstacks[2]=new ItemStack(allitemsiwannahave[2]);
			itemstacks[3]=new ItemStack(allitemsiwannahave[3]);
			itemstacks[4]=new ItemStack(allitemsiwannahave[4]);
			itemstacks[5]=new ItemStack(allitemsiwannahave[5]);
			itemstacks[6]=new ItemStack(allitemsiwannahave[6]);
			itemstacks[7]=new ItemStack(allitemsiwannahave[7]);
			itemstacks[8]=new ItemStack(allitemsiwannahave[8]);*/

				//MainClass.instance.bingo.put(player.getUniqueId(), Bukkit.createInventory(player, InventoryType.DISPENSER,ChatColor.BLUE+"Bingo"));
				//MainClass.instance.bingo.get(player.getUniqueId()).setContents(itemstacks);
				
				
				if (!MainClass.instance.bingo.containsKey(player.getUniqueId())) {
					Random rnd=new Random();
					for (int i = 0; i < allitemsiwannahave.length; i++) {
						
					swap(allitemsiwannahave,rnd.nextInt(29) , 29-i);
					
					itemstacks[0]=new ItemStack(allitemsiwannahave[0]);
					itemstacks[1]=new ItemStack(allitemsiwannahave[1]);
					itemstacks[2]=new ItemStack(allitemsiwannahave[2]);
					itemstacks[3]=new ItemStack(allitemsiwannahave[3]);
					itemstacks[4]=new ItemStack(allitemsiwannahave[4]);
					itemstacks[5]=new ItemStack(allitemsiwannahave[5]);
					itemstacks[6]=new ItemStack(allitemsiwannahave[6]);
					itemstacks[7]=new ItemStack(allitemsiwannahave[7]);
					itemstacks[8]=new ItemStack(allitemsiwannahave[8]);
					
					}
						MainClass.instance.bingo.put(player.getUniqueId(), Bukkit.createInventory(player, InventoryType.DISPENSER,ChatColor.BLUE+"Bingo"));
						MainClass.instance.bingo.get(player.getUniqueId()).setContents(itemstacks);

						}
			
			player.openInventory(MainClass.instance.bingo.get(player.getUniqueId()));
			/*if (args.length>0) {
				if(args[0].contentEquals("done")) {
					
					ItemStack[] nul=new ItemStack[9];
					nul[0]=new ItemStack(Material.AIR);
					nul[1]=new ItemStack(Material.AIR);
					nul[2]=new ItemStack(Material.AIR);
					nul[3]=new ItemStack(Material.AIR);
					nul[4]=new ItemStack(Material.AIR);
					nul[5]=new ItemStack(Material.AIR);
					nul[6]=new ItemStack(Material.AIR);
					nul[7]=new ItemStack(Material.AIR);
					nul[8]=new ItemStack(Material.AIR);
					if (MainClass.instance.bingo.get(player.getUniqueId()).getContents().equals(nul)) {
						player.sendMessage("toll");

					}
					}
			
			}*/
		   
	}else {
		Sender.sendMessage(ChatColor.RED+"Das geht nur als Spieler");
	}
		
		return true;
}
		}	