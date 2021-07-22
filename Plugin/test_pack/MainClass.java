package test_pack;

import java.util.HashMap;
import java.util.UUID;


import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {
	public static MainClass instance;
	public HashMap<UUID, Inventory> Backpak;
	public HashMap<UUID, Inventory>bingo;
	@Override
	public void onEnable() {
		this.getServer().getConsoleSender().sendMessage("hallo");
		this.getCommand("lottery").setExecutor(new Command());
		this.getCommand("lotteryinfo").setExecutor(new lotteryinfo());
		this.getCommand("signedit").setExecutor(new signeditor());
		this.getCommand("backpack").setExecutor(new Backpack());
		this.getCommand("bingo").setExecutor(new ListenerTest());
		this.getServer().getPluginManager().registerEvents(new EventListener(), this);
		this.getServer().getPluginManager().registerEvents(new Eventsetcanceller(), this);
		this.getServer().getPluginManager().registerEvents(new InvListener(), this);
	//	this.getServer().getPluginManager().registerEvents(new ItemDropChanger(), this);
	//	this.getCommand("biingo").setExecutor(new Bingohash());
		super.onEnable();
		instance=this;
		Backpak=new HashMap<UUID, Inventory>();
		bingo=new HashMap<UUID, Inventory>();
		//Bukkit.loadServerIcon(file)
	}

}
