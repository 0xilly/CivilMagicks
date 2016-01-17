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
package us.illyohs.civilmagiks.common.tile.node;

import us.illyohs.civilmagiks.api.mana.ManaType;
import us.illyohs.civilmagiks.common.core.util.BiomeUtils;
import us.illyohs.civilmagiks.common.tile.TileNode;

import net.minecraft.nbt.NBTTagCompound;

import net.minecraftforge.common.BiomeManager.BiomeType;

public class TileStar extends TileNode {
    
//    ManaType type;
    
    @Override
    public void writeToModNBT(NBTTagCompound bNBT) {
        super.writeToModNBT(bNBT);
    }
    
    @Override
    public void readFromModNBT(NBTTagCompound bNBT) {
        super.readFromModNBT(bNBT);
    }
    
    @Override
    public void updateTile() { 
        super.updateTile();
        
        if (getCurrentManaType() != null) {
            addMana(600);
        }
    }
    
    private ManaType getCurrentManaType() {
       return new BiomeUtils().getManaType(this.getWorld(), this.getPos());
    }

}
