package kr.co.minecraftforum.kdragon.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class HelpCommand {
	
	public void helper(Player csender) {
		
		csender.sendMessage(ChatColor.GREEN + "--------------------" + ChatColor.YELLOW + " <AllMute> 도움말 " + ChatColor.GREEN + "--------------------");
		csender.sendMessage(ChatColor.YELLOW + "/채팅" + ChatColor.GREEN + " 플러그인 사용 도움말을 봅니다.");
		csender.sendMessage(ChatColor.YELLOW + "/채팅 전체금지" + ChatColor.GREEN + " 모든 플레이어를 채팅금지합니다.");
		csender.sendMessage(ChatColor.YELLOW + "/채팅 전체허용" + ChatColor.GREEN + " 모든 플레이어를 채팅허용합니다.");
		csender.sendMessage(ChatColor.GREEN + "-------------------" + ChatColor.YELLOW + " 제작자 : kdragon " + ChatColor.GREEN + "-------------------");
		
	}
	
}
