//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\utente\Desktop\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.oyvey.features.modules.combat;

import me.alpha432.oyvey.features.modules.*;
import me.alpha432.oyvey.features.setting.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import me.alpha432.oyvey.util.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public class SelfFill extends Module
{
    private final Setting<Boolean> packet;
    
    public SelfFill() {
        super("SelfFill", "SelfFills yourself in a hole.", Category.COMBAT, true, false, true);
        this.packet = (Setting<Boolean>)this.register(new Setting("PacketPlace", (T)Boolean.FALSE));
    }
    
    @Override
    public void onEnable() {
        SelfFill.mc.player.jump();
        SelfFill.mc.player.jump();
    }
    
    @Override
    public void onUpdate() {
        final BlockPos pos = new BlockPos(SelfFill.mc.player.posX, SelfFill.mc.player.posY, SelfFill.mc.player.posZ);
        if (SelfFill.mc.world.getBlockState(pos.down()).getBlock() == Blocks.AIR && BlockUtil.isPositionPlaceable(pos.down(), false) == 3) {
            BlockUtil.placeBlock(pos.down(), EnumHand.MAIN_HAND, false, this.packet.getValue(), false);
        }
        if (SelfFill.mc.world.getBlockState(pos.down()).getBlock() == Blocks.OBSIDIAN) {
            SelfFill.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(SelfFill.mc.player.posX, SelfFill.mc.player.posY - 1.3, SelfFill.mc.player.posZ, false));
            SelfFill.mc.player.setPosition(SelfFill.mc.player.posX, SelfFill.mc.player.posY - 1.3, SelfFill.mc.player.posZ);
            this.toggle();
        }
    }
}
