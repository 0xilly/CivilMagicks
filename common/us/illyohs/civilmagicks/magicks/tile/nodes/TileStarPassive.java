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
package us.illyohs.civilmagicks.magicks.tile.nodes;

import net.minecraft.nbt.NBTTagCompound;

import us.illyohs.civilmagicks.api.mana.ManaType;
import us.illyohs.civilmagicks.api.tile.TileStar;
import us.illyohs.civilmagicks.core.helper.BiomeHelper;

public class TileStarPassive extends TileStar {
    
    int tick;
    
    public TileStarPassive() {
        
    }
    
    @Override
    public ManaType canAccept(ManaType type) { 
        return new BiomeHelper().getManaFromBiomeType(new BiomeHelper().getBiome(xCoord, zCoord));
    }
    
    public int maxMana(int max) {
        return 1000;
    }
    
    public int addMana(int add) {
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
    public void updateEntity() {
        
        if(!worldObj.isRemote) {
            tick++;
            if(tick == 1000) {
                addMana(3);
            }
            
        }
        
    }
    
}
