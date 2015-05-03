/*
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
package us.illyohs.civilmagicks.common.block.nodes;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import us.illyohs.civilmagicks.api.block.BlockStar;
import us.illyohs.civilmagicks.client.core.creativetab.CivilTab;
import us.illyohs.civilmagicks.common.block.tile.node.TileGeneralStar;
import us.illyohs.civilmagicks.common.core.lib.LibInfo;

public class BlockGeneralStar extends BlockStar {

    public BlockGeneralStar() {
        setCreativeTab(CivilTab.BLOCKS);
        setUnlocalizedName(LibInfo.MOD_ID + "generalstar");
        setTickRandomly(true);
    }
    
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
        if(!worldIn.isRemote) {
        }
        TileGeneralStar tile =  (TileGeneralStar)worldIn.getTileEntity(pos);
//            tile.get
        playerIn.addChatMessage(new ChatComponentText("TYhis star currently has " + tile.current + " Mana"));
        System.out.println("Boop");
        
    }
//    Minecraft.getMinecraft().effectRenderer.addEffect(new BaseParticleFX(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(),2.0, 2.0, 2.0, "0xffff7e", 0.5F, .05F, 200, 200, LibAssets.spark))
    
    
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileGeneralStar();
    }
}
