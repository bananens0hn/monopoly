/*package test_pack;






import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.Pose;
import org.bukkit.entity.Entity.Spigot;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Vector;



public class Bingohash implements Listener{
@EventHandler
public void pickupevent(EntityPickupItemEvent event) {
	Player player=(Player) event.getEntity();
	if (MainClass.instance.bingo.containsKey(player.getUniqueId())) {
	ItemStack[] itemstacks=new ItemStack[9];
	itemstacks=MainClass.instance.bingo.get(player.getUniqueId()).getContents();

	for (int i = 0; i < itemstacks.length; i++) {
		if (itemstacks[i]!=null) {
		if(event.getItem().getItemStack().getType().equals(itemstacks[i].getType())) {
			if(itemstacks[i].getAmount() < event.getItem().getItemStack().getAmount()){
				event.getItem().getItemStack().setAmount(event.getItem().getItemStack().getAmount()-itemstacks[i].getAmount());
				itemstacks[i]=null;
			
	}else {
	 itemstacks[i].setAmount(itemstacks[i].getAmount()-event.getItem().getItemStack().getAmount());
	 event.getItem().getItemStack().setType(Material.AIR);
	player.sendMessage("Ein tem gefunden");
	 MainClass.instance.bingo.get(player.getUniqueId()).setContents(itemstacks);
	 return;
	}
	}
		}	
			}
		}
	}
	
				
		
	}
	
	
	
*/