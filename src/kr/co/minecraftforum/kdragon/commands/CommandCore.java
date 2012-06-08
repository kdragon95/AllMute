package kr.co.minecraftforum.kdragon.commands;

import kr.co.minecraftforum.kdragon.allmute.AllMute;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class CommandCore {
	
	private AllMute plugin;
	
	public CommandCore(AllMute plugin) {
		this.plugin = plugin;
	}
	
	private HelpCommand helpCommand = new HelpCommand();
	
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player csender = (Player) sender;
			
			if(csender.isOp()) {
				
				if(args.length == 0) {
					helpCommand.helper(csender);
				}
				
				if(args.length == 1) {
					
					if(args[0].equalsIgnoreCase("��ü����")) {
						AllMute.isAllMutedSetTrue();
						csender.sendMessage(ChatColor.GREEN + "��ü ä�� ����" + ChatColor.RED + " Ȱ��ȭ");
					}
					
					if(args[0].equalsIgnoreCase("��ü���")) {
						AllMute.isAllMutedSetFalse();
						csender.sendMessage(ChatColor.GREEN + "��ü ä�� ����" + ChatColor.RED + " ��Ȱ��ȭ");
					}
					
				}
				
			}
			
			if(!csender.isOp()) {
				csender.sendMessage(ChatColor.RED + "[AllMute] ������ �����ϴ�.");
			}
			
		}
		
		else {
			
			System.out.println("[AllMute] �÷��̾ ��� ������ ��ɾ��Դϴ�.");
			
		}
		
		return true;
		
	}
	
}
