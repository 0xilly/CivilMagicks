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
package us.illyohs.civilmagicks.common.block.tile.node;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import us.illyohs.civilmagicks.api.CivilMagicksAPI;
import us.illyohs.civilmagicks.api.mana.ManaNetworkEvent;
import us.illyohs.civilmagicks.api.mana.ManaType;
import us.illyohs.civilmagicks.api.tile.TileStar;

public class TileGeneralStar extends TileStar {
    
    int timer;
    World world;
    
    public TileGeneralStar() {
        timer = 20;
    }
    
    @Override
    public ManaType canAccept() { 
        return CivilMagicksAPI.getManaTypeFromBiome(getWorld().getBiomeGenForCoords(getPos()));
    }
    
    public int maxMana(int max) {
        return 1000;
    }
    
    public int addMana(int add) {
        ManaNetworkEvent.receiveMana(this, canAccept());
//        LogHelper.info("Mana Added:"+ add  + "");
        return add;
        
    }
 
    @Override
    public void writeToNBT(NBTTagCompound nbt) {

        
    }
    
    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);

    }
    
    @Override
    public void update() {
    }
    
    
}