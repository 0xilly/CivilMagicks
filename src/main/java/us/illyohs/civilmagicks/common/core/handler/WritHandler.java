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
import us.illyohs.civilmagicks.api.CivilMagicksAPI;
import us.illyohs.civilmagicks.api.writ.WritBase;
import us.illyohs.civilmagicks.api.writ.WritEvent;

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
            if (is.getTagCompound() == null || is.getTagCompound().getString("spellname") == "nillspell") {
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "No spell bound to this writ"));
            } else {

                return getSpell(spellname);
            }
        }
        return null;
    }

//    private WritBase getSpell(String writName) {
//        for (Writ writ: CivilMagicksAPI.writReg) {
//            if (writ.getName()==  writName) {
//                return writ.getWrit();
//            }
//        }
//        return null;
//    }

    private WritBase getSpell(String writName) {
        return CivilMagicksAPI.writReg.get(writName);
    }
}
