/*
 * Copyright (c) 2014, Anthony Anderson(Lord Illyohs)
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

package us.illyohs.civilmagicks.common.world;

import java.util.List;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

public class ChunkProvidAtheris implements IChunkProvider {

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#chunkExists(int, int)
     */
    @Override
    public boolean chunkExists(int x, int z) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#provideChunk(int, int)
     */
    @Override
    public Chunk provideChunk(int x, int z) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#provideChunk(net.minecraft.util.BlockPos)
     */
    @Override
    public Chunk provideChunk(BlockPos blockPosIn) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#populate(net.minecraft.world.chunk.IChunkProvider, int, int)
     */
    @Override
    public void populate(IChunkProvider p_73153_1_, int p_73153_2_, int p_73153_3_) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#func_177460_a(net.minecraft.world.chunk.IChunkProvider, net.minecraft.world.chunk.Chunk, int, int)
     */
    @Override
    public boolean func_177460_a(IChunkProvider p_177460_1_, Chunk p_177460_2_, int p_177460_3_, int p_177460_4_) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#saveChunks(boolean, net.minecraft.util.IProgressUpdate)
     */
    @Override
    public boolean saveChunks(boolean p_73151_1_, IProgressUpdate p_73151_2_) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#unloadQueuedChunks()
     */
    @Override
    public boolean unloadQueuedChunks() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#canSave()
     */
    @Override
    public boolean canSave() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#makeString()
     */
    @Override
    public String makeString() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#getPossibleCreatures(net.minecraft.entity.EnumCreatureType, net.minecraft.util.BlockPos)
     */
    @Override
    public List getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#getStrongholdGen(net.minecraft.world.World, java.lang.String, net.minecraft.util.BlockPos)
     */
    @Override
    public BlockPos getStrongholdGen(World worldIn, String structureName, BlockPos position) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#getLoadedChunkCount()
     */
    @Override
    public int getLoadedChunkCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#recreateStructures(net.minecraft.world.chunk.Chunk, int, int)
     */
    @Override
    public void recreateStructures(Chunk p_180514_1_, int p_180514_2_, int p_180514_3_) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.chunk.IChunkProvider#saveExtraData()
     */
    @Override
    public void saveExtraData() {
        // TODO Auto-generated method stub
        
    }
    

}
