//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\utente\Desktop\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.oyvey.features.modules.misc;

import me.alpha432.oyvey.features.modules.*;
import me.alpha432.oyvey.features.setting.*;
import me.alpha432.oyvey.*;

public class RPC extends Module
{
    public static RPC INSTANCE;
    public Setting<String> state;
    public Setting<Boolean> showIP;
    
    public RPC() {
        super("RPC", "Discord rich presence", Category.MISC, false, false, false);
        this.state = (Setting<String>)this.register(new Setting("State", (T)"leeanware 2.0", "Sets the state of the DiscordRPC."));
        this.showIP = (Setting<Boolean>)this.register(new Setting("ShowIP", (T)true, "Shows the server IP in your discord presence."));
        RPC.INSTANCE = this;
    }
    
    @Override
    public void onEnable() {
        DiscordPresence.start();
    }
    
    @Override
    public void onDisable() {
        DiscordPresence.stop();
    }
}
