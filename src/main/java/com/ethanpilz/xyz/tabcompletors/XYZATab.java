package com.ethanpilz.xyz.tabcompletors;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class XYZATab implements TabCompleter {

    List<String> arguments = new ArrayList<String>();

    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args){
        if (arguments.isEmpty()) {
            arguments.add("version");
            arguments.add("other");
            arguments.add("relocate");
            arguments.add("tp");
            arguments.add("swap");
            arguments.add("freeze");
            arguments.add("distance");
            arguments.add("spawn");
            arguments.add("stalk");
            arguments.add("clear");
            arguments.add("blind");
            arguments.add("serverinfo");
            arguments.add("players");
            arguments.add("portals");
            arguments.add("lockdown");
            arguments.add("world");
            arguments.add("home");
        }

        List<String> result = new ArrayList<String>();
        if (args.length == 1 && sender.hasPermission("xyz.admin")) {
            for (String a : arguments) {
                if (a.toLowerCase().startsWith(args[0].toLowerCase()))
                    result.add(a);

            }
            return result;

        }

        return null;
    }

}
