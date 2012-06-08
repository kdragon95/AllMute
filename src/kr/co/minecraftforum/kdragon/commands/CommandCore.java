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
					
					if(args[0].equalsIgnoreCase("전체금지")) {
						AllMute.isAllMutedSetTrue();
						csender.sendMessage(ChatColor.GREEN + "전체 채팅 금지" + ChatColor.RED + " 활성화");
					}
					
					if(args[0].equalsIgnoreCase("전체허용")) {
						AllMute.isAllMutedSetFalse();
						csender.sendMessage(ChatColor.GREEN + "전체 채팅 금지" + ChatColor.RED + " 비활성화");
					}
					
				}
				
			}
			
			if(!csender.isOp()) {
				csender.sendMessage(ChatColor.RED + "[AllMute] 권한이 없습니다.");
			}
			
		}
		
		else {
			
			System.out.println("[AllMute] 플레이어만 사용 가능한 명령어입니다.");
			
		}
		
		return true;
		
	}
	
}
