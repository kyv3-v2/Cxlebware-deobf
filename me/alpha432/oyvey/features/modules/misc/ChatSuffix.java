//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\utente\Desktop\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.oyvey.features.modules.misc;

import me.alpha432.oyvey.features.modules.*;
import me.alpha432.oyvey.event.events.*;
import net.minecraft.network.play.client.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class ChatSuffix extends Module
{
    public Boolean suffix;
    public String s;
    
    public ChatSuffix() {
        super("ChatSuffix", "flexs your leeanware suffix.", Category.MISC, true, false, false);
        this.suffix = true;
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (event.getStage() == 0 && event.getPacket() instanceof CPacketChatMessage) {
            final CPacketChatMessage packet = (CPacketChatMessage)event.getPacket();
            String s = packet.getMessage();
            if (s.startsWith("/")) {
                return;
            }
            s += " \u300b\u1d04\u0280\u1d07\u1d07\u1d18\u028f\u1d21\u1d00\u0280\u1d07";
            if (s.length() >= 256) {
                s = s.substring(0, 256);
            }
            packet.message = s;
        }
    }
    
    @SubscribeEvent
    public void onChatPacketReceive(final PacketEvent.Receive event) {
        if (event.getStage() == 0) {
            event.getPacket();
        }
    }
}
