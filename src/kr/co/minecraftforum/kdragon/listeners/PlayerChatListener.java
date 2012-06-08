package kr.co.minecraftforum.kdragon.listeners;

import kr.co.minecraftforum.kdragon.allmute.AllMute;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class PlayerChatListener implements Listener {
	
	@EventHandler
	public void onPlayerChat(PlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		if(AllMute.isAllMuted) {
			
			if(p.isOp()) {
				
			}
			if(!p.isOp()) {
				e.setCancelled(true);
				p.sendMessage(ChatColor.RED + "[AllMute] 전채 채팅 금지 상태입니다.");
			}
			
		}
		
		if(!AllMute.isAllMuted) {
			
		}
		
	}
	
}
