package test_pack;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitTask;



public class InvListener implements Listener {
	@EventHandler
	public void invs(InventoryOpenEvent inv) {
		Player player=(Player)inv.getPlayer();
		Material[] itemStacks=new Material[9];
		itemStacks[0]=MainClass.instance.bingo.get(player.getUniqueId()).getItem(0).getType();
		itemStacks[1]=MainClass.instance.bingo.get(player.getUniqueId()).getItem(1).getType();
		itemStacks[2]=MainClass.instance.bingo.get(player.getUniqueId()).getItem(2).getType();
		itemStacks[3]=MainClass.instance.bingo.get(player.getUniqueId()).getItem(3).getType();
		itemStacks[4]=MainClass.instance.bingo.get(player.getUniqueId()).getItem(4).getType();
		itemStacks[5]=MainClass.instance.bingo.get(player.getUniqueId()).getItem(5).getType();
		itemStacks[6]=MainClass.instance.bingo.get(player.getUniqueId()).getItem(6).getType();
		itemStacks[7]=MainClass.instance.bingo.get(player.getUniqueId()).getItem(7).getType();
		itemStacks[8]=MainClass.instance.bingo.get(player.getUniqueId()).getItem(8).getType();
		  ItemMeta itmmta = MainClass.instance.bingo.get(player.getUniqueId()).getItem(0).getItemMeta();
		 ItemStack[] itemstacks=new ItemStack[9];
		  itemstacks[0]=new ItemStack(Material.LIME_STAINED_GLASS_PANE);
		  itemstacks[1]=new ItemStack(Material.LIME_STAINED_GLASS_PANE);
		  itemstacks[2]=new ItemStack(Material.LIME_STAINED_GLASS_PANE);
		  itemstacks[3]=new ItemStack(Material.LIME_STAINED_GLASS_PANE);
		  itemstacks[4]=new ItemStack(Material.LIME_STAINED_GLASS_PANE);
		  itemstacks[5]=new ItemStack(Material.LIME_STAINED_GLASS_PANE);
		  itemstacks[6]=new ItemStack(Material.LIME_STAINED_GLASS_PANE);
		  itemstacks[7]=new ItemStack(Material.LIME_STAINED_GLASS_PANE);
		  itemstacks[8]=new ItemStack(Material.LIME_STAINED_GLASS_PANE);
          itmmta.setDisplayName(ChatColor.STRIKETHROUGH+"Gefunden");
          itmmta.addEnchant(Enchantment.ARROW_DAMAGE, 0, true);
          itmmta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
         
		
		
		
			if (player.getInventory().contains(itemStacks[0])) {
				Bukkit.broadcastMessage(ChatColor.GREEN+player.getName()+" hat "+String.valueOf(itemStacks[0]+" gefunden"));
				//MainClass.instance.bingo.get(player.getUniqueId()).getItem(0).setItemMeta(itmmta);
				MainClass.instance.bingo.get(player.getUniqueId()).getItem(0).setType(Material.LIME_STAINED_GLASS_PANE);
			}
				if (player.getInventory().contains(itemStacks[1])) {
					Bukkit.broadcastMessage(ChatColor.GREEN+player.getName()+" hat "+String.valueOf(itemStacks[1]+" gefunden"));
					//player.sendMessage("du hast "+String.valueOf(itemStacks[1]+" gefunden"));
					//MainClass.instance.bingo.get(player.getUniqueId()).getItem(1).setItemMeta(itmmta);
					MainClass.instance.bingo.get(player.getUniqueId()).getItem(1).setType(Material.LIME_STAINED_GLASS_PANE);
					
					 
				}
					if (player.getInventory().contains(itemStacks[2])) {
						Bukkit.broadcastMessage(ChatColor.GREEN+player.getName()+" hat "+String.valueOf(itemStacks[2]+" gefunden"));
						//player.sendMessage("du hast "+String.valueOf(itemStacks[2]+" gefunden"));
						//MainClass.instance.bingo.get(player.getUniqueId()).getItem(2).setItemMeta(itmmta);
						MainClass.instance.bingo.get(player.getUniqueId()).getItem(2).setType(Material.LIME_STAINED_GLASS_PANE);
						
						
					}
						if (player.getInventory().contains(itemStacks[3])) {
							//player.sendMessage("du hast "+String.valueOf(itemStacks[3]+" gefunden"));
						//	MainClass.instance.bingo.get(player.getUniqueId()).getItem(3).setItemMeta(itmmta);
							MainClass.instance.bingo.get(player.getUniqueId()).getItem(3).setType(Material.LIME_STAINED_GLASS_PANE);
							Bukkit.broadcastMessage(ChatColor.GREEN+player.getName()+" hat "+String.valueOf(itemStacks[3]+" gefunden"));
							
						}
							if (player.getInventory().contains(itemStacks[4])) {
							//	player.sendMessage("du hast "+String.valueOf(itemStacks[4]+" gefunden"));
								//MainClass.instance.bingo.get(player.getUniqueId()).getItem(4).setItemMeta(itmmta);
								MainClass.instance.bingo.get(player.getUniqueId()).getItem(4).setType(Material.LIME_STAINED_GLASS_PANE);
								Bukkit.broadcastMessage(ChatColor.GREEN+player.getName()+" hat "+String.valueOf(itemStacks[4]+" gefunden"));
								
							}
								if (player.getInventory().contains(itemStacks[5])) {
									//player.sendMessage("du hast "+String.valueOf(itemStacks[5]+" gefunden"));
									//MainClass.instance.bingo.get(player.getUniqueId()).getItem(5).setItemMeta(itmmta);
									MainClass.instance.bingo.get(player.getUniqueId()).getItem(5).setType(Material.LIME_STAINED_GLASS_PANE);
									Bukkit.broadcastMessage(ChatColor.GREEN+player.getName()+" hat "+String.valueOf(itemStacks[5]+" gefunden"));
									
								}
									if (player.getInventory().contains(itemStacks[6])) {
										//player.sendMessage("du hast "+String.valueOf(itemStacks[6]+" gefunden"));
										//MainClass.instance.bingo.get(player.getUniqueId()).getItem(6).setItemMeta(itmmta);
										MainClass.instance.bingo.get(player.getUniqueId()).getItem(6).setType(Material.LIME_STAINED_GLASS_PANE);
										Bukkit.broadcastMessage(ChatColor.GREEN+player.getName()+" hat "+String.valueOf(itemStacks[6]+" gefunden"));
										
									}
										if (player.getInventory().contains(itemStacks[7])) {
											//player.sendMessage("du hast "+String.valueOf(itemStacks[7]+" gefunden"));
											//MainClass.instance.bingo.get(player.getUniqueId()).getItem(7).setItemMeta(itmmta);
											MainClass.instance.bingo.get(player.getUniqueId()).getItem(7).setType(Material.LIME_STAINED_GLASS_PANE);
											Bukkit.broadcastMessage(ChatColor.GREEN+player.getName()+" hat "+String.valueOf(itemStacks[7]+" gefunden"));
											
										}
											if (player.getInventory().contains(itemStacks[8])) {
											//	player.sendMessage("du hast "+String.valueOf(itemStacks[8]+" gefunden"));
												//MainClass.instance.bingo.get(player.getUniqueId()).getItem(8).setItemMeta(itmmta);
												MainClass.instance.bingo.get(player.getUniqueId()).getItem(8).setType(Material.LIME_STAINED_GLASS_PANE);
												Bukkit.broadcastMessage(ChatColor.GREEN+player.getName()+" hat "+String.valueOf(itemStacks[8]+" gefunden"));
												
											}
												//if (player.getInventory().contains(itemStacks[0])&player.getInventory().contains(itemStacks[1])&player.getInventory().contains(itemStacks[2])&player.getInventory().contains(itemStacks[3])&player.getInventory().contains(itemStacks[4])&player.getInventory().contains(itemStacks[5])&player.getInventory().contains(itemStacks[6])&player.getInventory().contains(itemStacks[7])&player.getInventory().contains(itemStacks[8])) {
													if (MainClass.instance.bingo.get(player.getUniqueId()).getContents().equals(itemstacks)){
														
													
												Bukkit.broadcastMessage(ChatColor.GREEN+player.getName()+" hat es geschafft! ");
													}
												//}
	}
	}
	
