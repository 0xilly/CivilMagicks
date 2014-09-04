/**
 * This class was created by Anthony Anderson(Lord Illyohs)
 * It is distributed as part of CivilMagicks
 * Source Code: https://github.com/LordIllyohs/CivilMagicks
 *
 * CivilMagicks is Open Source and distributed under a
 * Attribution-NonCommercial-ShareAlike 3.0 Unported license.
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/)
 *
 * 
 * Class created on Sep 3, 2014 at 2:55:55 PM
 * 
 */
package us.illyohs.civilmagicks.common.block.star;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import us.illyohs.civilmagicks.common.lib.LibInfo;
import us.illyohs.civilmagicks.common.tile.star.TileLightManaStar;

public class BlockLightManaStar extends BlockStar implements ITileEntityProvider{
    
    public BlockLightManaStar() {
        setBlockName(LibInfo.MOD_ID + "lightmanastar");
        
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileLightManaStar();
    }

}
