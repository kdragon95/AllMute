package kr.co.minecraftforum.kdragon.allmute;

import java.util.logging.Logger;

import kr.co.minecraftforum.kdragon.commands.CommandCore;
import kr.co.minecraftforum.kdragon.listeners.PlayerChatListener;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class AllMute extends JavaPlugin {
	
	public static Logger log = Bukkit.getLogger();
	
	private CommandCore cc = new CommandCore(this);
	
	public static boolean isAllMuted = false;
	
	@Override
	public void onEnable() {
		
		log.info(getName() + " 1.0  이 실행됩니다.");
		registerEvent();
		
	}
	
	@Override
	public void onDisable() {
		
		log.info(getName() + " 1.0 이 종료됩니다.");
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("채팅")) {
			cc.onCommand(sender, cmd, Label, args);
		}
		return true;
	}
	
	private void registerEvent() {
		getServer().getPluginManager().registerEvents(new PlayerChatListener(), this);
	}
	
	public static void isAllMutedSetTrue() {
		isAllMuted = true;
	}
	
	public static void isAllMutedSetFalse() {
		isAllMuted = false;
	}
	
}
