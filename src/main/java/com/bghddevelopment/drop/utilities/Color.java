package com.bghddevelopment.drop.utilities;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

/**
 * Author:  Kim (Thinkverse) Hallberg <work@hallberg.kim>
 * Created: 2020-04-12 02:47
 */
public class Color {
    public static String translate(final String value) {
        return ChatColor.translateAlternateColorCodes('&', value);
    }

}
