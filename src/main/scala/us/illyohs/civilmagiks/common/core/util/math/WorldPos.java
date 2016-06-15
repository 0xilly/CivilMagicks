/**
 * Copyright (c) 2016, Anthony Anderson<Illyohs>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
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

package us.illyohs.civilmagiks.common.core.util.math;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.server.FMLServerHandler;

public class WorldPos extends BlockPos {

    private int dimID;
    private World world =null;

    public WorldPos(int x, int y, int z) {
        super(x, y, z);
        this.setWorld(defaultWorld());
    }

    public WorldPos(World world,int x, int y, int z) {
        super(x, y, z);
        dimID = world.provider.getDimension();
    }

    public WorldPos(double x, double y, double z) {
        super(x, y, z);
        this.setWorld(defaultWorld());
    }

    public WorldPos(World world, double x, double y, double z) {
        super(x, y, z);
    }


    public WorldPos(Vec3d vec) {
        super(vec);
        this.setWorld(defaultWorld());
    }

    public WorldPos(World world, Vec3d vec) {
        super(vec);
        this.setWorld(defaultWorld());
    }

    public WorldPos(Vec3i source) {
        super(source);
        this.setWorld(defaultWorld());
    }

    public WorldPos(World world, Vec3i source) {
        super(source);
        this.setWorld(defaultWorld());
    }

    public void setWorld(int dimension) {
        world = FMLServerHandler.instance().getServer().worldServerForDimension(dimension);
        dimID = getDimID();
    }

    public void setWorld(World world) {
        this.world = world;
        dimID = getDimID();
    }

    public World getWorld() {
        if(world == null && dimID != -500000) {
            setWorld(dimID);
        }
        return world;
    }

    private int getDimID() {
        if(getWorld() == null) {
            setWorld(defaultWorld());
        }
        return getWorld().provider.getDimension();
    }


    public int getDem() {
        return dimID;
    }

    private static World defaultWorld() {
        return FMLServerHandler.instance().getServer().worldServerForDimension(0);
    }

}
