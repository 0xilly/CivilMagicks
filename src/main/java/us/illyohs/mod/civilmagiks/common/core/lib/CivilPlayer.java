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
package us.illyohs.mod.civilmagiks.common.core.lib;

import us.illyohs.mod.civilmagiks.api.mana.ManaType;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import net.minecraftforge.common.IExtendedEntityProperties;

public class CivilPlayer implements IExtendedEntityProperties {

    public static final String IDENT = "civil_data";

    public int CIVIL_LEVEL;
    public int MANA_LEVEL;
    public boolean isCivil;
    public ManaType MANA_TYPE;

    private final EntityPlayer player;

    public static CivilPlayer forPlayer(EntityPlayer player){
        return (CivilPlayer) player.getExtendedProperties(IDENT);
    }
    
    public CivilPlayer(EntityPlayer player) {
        this.player = player;
    }

    @Override
    public void init(Entity entity, World world) {
        this.CIVIL_LEVEL = 100;
        this.MANA_LEVEL = 1000;
        this.isCivil = true;
        this.MANA_TYPE = ManaType.NEUTRAL;
    }

    @Override
    public void saveNBTData(NBTTagCompound compound) {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setInteger("civillevel", this.CIVIL_LEVEL);
        nbt.setBoolean("isCivil", this.isCivil);
        nbt.setInteger("manalevel", this.MANA_LEVEL);
        nbt.setTag(IDENT, nbt);
        //		nbt.setString("ManaType", this.MANA_TYPE.values());

    }

    @Override
    public void loadNBTData(NBTTagCompound playertag) {
        NBTTagCompound nbt = playertag.getCompoundTag(IDENT);
        nbt.getInteger("civillevel");
        nbt.getBoolean("isCivil");
        nbt.getInteger("manalevel");

    }

    public int getMana() {
        return this.MANA_LEVEL;
    }

    public int incrementMana(int mana) {
        if(getMana() != getMaxMana()) {
            return getMana() + mana;
        }
        return mana;
    }

    public int decrementMana(int mana) {
        if(getMana() != 0) {
            return getMana() - mana;
        }
        return mana;
    }
    
    public int getCivilLevel() {
        return this.CIVIL_LEVEL;
    }
    
    public int incrementCivilLevel(int increment) {
        if(getCivilLevel() != getMaxCivilLevel()) {
            return getCivilLevel() + increment;
        }
        return increment;
    }
    
    public int decrementCivilLevel(int decrement) {
        if(getCivilLevel() != 0) {
            return getCivilLevel() - decrement;
        }
        return decrement;
    }
    
    public boolean getIsCivil() {
        return this.isCivil;     
    }
    
    public boolean setIsCivil() {
        if(getCivilLevel() >= 51) {
            return true;
        } else if(getCivilLevel() <= 49) {
            return false;
        }
        return isCivil;

    }
    
    public int getMaxCivilLevel() {
        return 100;
    }

    public int getMaxMana() {
        return 1000;
    }

    public EntityPlayer getplayer() {
        return this.player;
    }

}
