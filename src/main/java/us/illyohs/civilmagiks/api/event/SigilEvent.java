/**
 * Copyright (c) 2016, Anthony Anderson<Illyohs>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice, this
 *        list of conditions and the following disclaimer.
 *
 *     * Redistributions in binary form must reproduce the above copyright notice,
 *        this list of conditions and the following disclaimer in the documentation
 *        and/or other materials provided with the distribution.
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

package us.illyohs.civilmagiks.api.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

import net.minecraftforge.fml.common.eventhandler.Event;

public class SigilEvent extends Event
{

    String      name, id;
    BlockPos    pos;

    public SigilEvent(String name, String id, BlockPos pos)
    {
        this.name = name;
        this.id = id;
        this.pos = pos;
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public BlockPos getPos()
    {
        return pos;
    }

    public static class SigilPlaceEvent extends SigilEvent
    {

        EntityPlayer player;

        public SigilPlaceEvent(String name, String id, BlockPos pos, EntityPlayer player)
        {
            super(name, id, pos);
            this.player = player;
        }

        public EntityPlayer getPlayer()
        {
            return player;
        }
    }

    public static class SigilDestroyedEvent extends SigilEvent
    {

        EntityPlayer player;

        public SigilDestroyedEvent(String name, String id, BlockPos pos, EntityPlayer player)
        {
            super(name, id, pos);
            this.player = player;
        }

        public EntityPlayer getPlayer()
        {
            return player;
        }
    }

    public static class SigilActivateEvent extends SigilEvent
    {

        Entity entity;

        public SigilActivateEvent(String name, String id, BlockPos pos, Entity entity)
        {
            super(name, id, pos);
        }

        public Entity getEntity()
        {
            return entity;
        }
    }
}
