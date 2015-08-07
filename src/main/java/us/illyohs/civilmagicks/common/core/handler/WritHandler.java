/**
 * Copyright (c) 2014, Anthony Anderson(Lord Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.illyohs.civilmagicks.common.core.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.Sys;
import us.illyohs.civilmagicks.api.CivilMagicksAPI;
import us.illyohs.civilmagicks.api.writ.Writ;
import us.illyohs.civilmagicks.api.writ.WritBase;
import us.illyohs.civilmagicks.api.writ.WritEvent;
import us.illyohs.civilmagicks.api.writ.WritEvent.ActionType;

public class WritHandler {

    static CivilMagicksAPI civilMagicksAPI;
    public static WritHandler instance = null;

    public WritHandler() {

        MinecraftForge.EVENT_BUS.register(this);

        civilMagicksAPI = new CivilMagicksAPI();
    }

    public void WritEvent(WritEvent event) {

    }

    public static WritHandler instance() {
        if (instance == null) {
            instance = new WritHandler();
        }
        return instance;
    }

    public WritBase initSpell(ItemStack is, EntityPlayer player, String spellname) {
        if (is.getTagCompound() != null) {
            if (is.getTagCompound().getString("spellname") == null || is.getTagCompound().getString("spellname") == "nillspell") {
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "No spell bound to this writ"));
            } else {
//                System.out.println("TestSpell : " + spellname);
                return getspell(spellname);
            }
        }
        return null;
    }

    WritBase getspell(String writName) {
        System.out.println("Get spell got " + writName + " now trying to  cast spell");
        for (Writ writ : CivilMagicksAPI.getWritList()) {
            if (writ.getName() == writName) {
                EntityPlayer player = null;
                MinecraftForge.EVENT_BUS.post(new WritEvent(player, writ.getName(), ActionType.ACTIVATE));
                System.out.println("Testing this spell in to return writ");
                return writ.getWrit();
            }
        }
        return null;

    }
}
