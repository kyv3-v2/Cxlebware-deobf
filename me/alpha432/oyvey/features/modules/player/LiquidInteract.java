//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\utente\Desktop\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.oyvey.features.modules.player;

import me.alpha432.oyvey.features.modules.*;

public class LiquidInteract extends Module
{
    private static LiquidInteract INSTANCE;
    
    public LiquidInteract() {
        super("LiquidInteract", "Interact with liquids", Module.Category.PLAYER, false, false, false);
        this.setInstance();
    }
    
    public static LiquidInteract getInstance() {
        if (LiquidInteract.INSTANCE == null) {
            LiquidInteract.INSTANCE = new LiquidInteract();
        }
        return LiquidInteract.INSTANCE;
    }
    
    private void setInstance() {
        LiquidInteract.INSTANCE = this;
    }
    
    static {
        LiquidInteract.INSTANCE = new LiquidInteract();
    }
}
