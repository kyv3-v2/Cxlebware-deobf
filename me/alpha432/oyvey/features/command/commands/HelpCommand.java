//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\utente\Desktop\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.oyvey.features.command.commands;

import me.alpha432.oyvey.features.command.*;
import me.alpha432.oyvey.*;
import com.mojang.realmsclient.gui.*;
import java.util.*;

public class HelpCommand extends Command
{
    public HelpCommand() {
        super("help");
    }
    
    public void execute(final String[] commands) {
        sendMessage("Commands: ");
        for (final Command command : OyVey.commandManager.getCommands()) {
            sendMessage(ChatFormatting.GRAY + OyVey.commandManager.getPrefix() + command.getName());
        }
    }
}
