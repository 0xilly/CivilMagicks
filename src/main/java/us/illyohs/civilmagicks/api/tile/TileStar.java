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
package us.illyohs.civilmagicks.api.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import us.illyohs.civilmagicks.api.mana.IManaBlock;
import us.illyohs.civilmagicks.api.mana.ManaType;

public class TileStar extends TileEntity implements IUpdatePlayerListBox, IManaBlock {

    public int      mana;
    public int      max;
    public int      current;
    public ManaType type;
    public boolean  isFull;

    @Override
    public int currentMana(int current) {
        NBTTagCompound nbt = new NBTTagCompound();
        current = nbt.getInteger("mana");
        return current;
    }

    @Override
    public int getCurrentMana() {
        return 0;
    }

    @Override
    public ManaType canAccept() {
        return type;

    }

    public int maxMana(int max) {
        return max;
    }

    public int addMana(int add) {
        NBTTagCompound nbt = new NBTTagCompound();
        if (!(currentMana(current) == max)) {
            nbt.setInteger("mana", current + add);
            return currentMana(current) + add;
        } else {
            return 0;
        }

    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setInteger("mana", mana);
        nbt.setInteger("max", max);
        nbt.setBoolean("isFull", isFull);
        nbt.setString("manaType", type.toString());

    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        if (nbt.hasKey("mana")) {
            mana = nbt.getInteger("mana");
        }

        if (nbt.hasKey("isFull")) {
            isFull = nbt.getBoolean("isFull");
        }

        if (nbt.hasKey("manaType")) {
            type = ManaType.valueOf(nbt.getString("manaType"));
        }
    }

    @Override
    public void update() {

    }

}
