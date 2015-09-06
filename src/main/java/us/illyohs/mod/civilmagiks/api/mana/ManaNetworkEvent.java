/**
 * Copyright (c) 2015, Anthony Anderson(Illyohs)
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
package us.illyohs.mod.civilmagiks.api.mana;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;

public class ManaNetworkEvent extends Event {
    
    public TileEntity tile;
    public ActionType actionType;
    public ManaType manaType;
    
    /**
     * 
     */
    public ManaNetworkEvent(TileEntity tile, ManaType manaType, ActionType actionType) {
        this.tile = tile;
        this.manaType = manaType;
        this.actionType = actionType;
    }
    
    public enum ActionType {
        SEND, RECEIVE
    }
    
    public static void sendMana(TileEntity tile, ManaType manaType) {
        MinecraftForge.EVENT_BUS.post(new ManaNetworkEvent(tile, manaType, ActionType.SEND));
    }
    
    public static void receiveMana(TileEntity tile, ManaType manaType) {
        MinecraftForge.EVENT_BUS.post(new ManaNetworkEvent(tile, manaType, ActionType.RECEIVE));
    }

}
