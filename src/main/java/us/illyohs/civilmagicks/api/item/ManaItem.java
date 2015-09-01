/**
 * Copyright (c) 2015, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
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

package us.illyohs.civilmagicks.api.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import us.illyohs.civilmagicks.api.mana.IManaItem;

public class ManaItem extends Item implements IManaItem {

    public ManaItem() {
        super();
        setMaxStackSize(1);
    }

    @Override
    public void onCreated(ItemStack is, World world, EntityPlayer player) {
        is.stackTagCompound.setInteger("ManaLevel", 0);
        is.stackTagCompound.setInteger("MaxManaLevel", setMaxMana());
//        is.stackTagCompound.setString("ManaType", ManaType.NEUTRAL.toString());
    }

    @Override
    public int getCurrentMana(ItemStack is) {
        return is.stackTagCompound.getInteger("ManaLevel");
    }

    @Override
    public int setCurrentMana(ItemStack is, int mana) {
        int oldMana = getCurrentMana(is);
        is.stackTagCompound = new NBTTagCompound();
        if (getCurrentMana(is) <= getMaxMana(is)) {
            is.stackTagCompound.setInteger("ManaLevel", mana + oldMana);
        }
        return getCurrentMana(is);
    }

    @Override
    public int getMaxMana(ItemStack is) {
        return is.stackTagCompound.getInteger("MaxManaLevel");
    }
    
    @Override
    public int setMaxMana() {
        return 0;
    }

}
