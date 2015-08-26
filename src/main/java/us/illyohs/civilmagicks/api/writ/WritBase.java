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

package us.illyohs.civilmagicks.api.writ;

import net.minecraft.entity.player.EntityPlayer;

public abstract class WritBase {

    public String       type;
    public String       name;
    public String       lore;
    public int          duration;
    public EntityPlayer player;
    public boolean      isProtected;

    public WritBase() {

    }

    public abstract void spell(EntityPlayer caster);


    public int getDuration() {
        return duration;
    }

    public String getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLore() {
        return lore;
    }

    public EntityPlayer getPlayer() {
        return player;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setLore(String lore) {
        this.lore = lore;
    }

    public void setPlayer(EntityPlayer player) {
        this.player = player;
    }

    public void setProtected(boolean isProtected) {
        this.isProtected = isProtected;
    }

}
