package kr.co.minecraftforum.kdragon.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class HelpCommand {
	
	public void helper(Player csender) {
		
		csender.sendMessage(ChatColor.GREEN + "--------------------" + ChatColor.YELLOW + " <AllMute> ���� " + ChatColor.GREEN + "--------------------");
		csender.sendMessage(ChatColor.YELLOW + "/ä��" + ChatColor.GREEN + " �÷����� ��� ������ ���ϴ�.");
		csender.sendMessage(ChatColor.YELLOW + "/ä�� ��ü����" + ChatColor.GREEN + " ��� �÷��̾ ä�ñ����մϴ�.");
		csender.sendMessage(ChatColor.YELLOW + "/ä�� ��ü���" + ChatColor.GREEN + " ��� �÷��̾ ä������մϴ�.");
		csender.sendMessage(ChatColor.GREEN + "-------------------" + ChatColor.YELLOW + " ������ : kdragon " + ChatColor.GREEN + "-------------------");
		
	}
	
}
