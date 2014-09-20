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
 * Class created on Sep 5, 2014 at 6:34:42 PM
 * 
 */
package us.illyohs.civilmagicks.common.block.tea;

import us.illyohs.civilmagicks.common.lib.LibInfo;
import us.illyohs.civilmagicks.common.tile.TileTeaTank;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTeaTank extends Block implements ITileEntityProvider {

    public BlockTeaTank() {
        super(Material.glass);
        setBlockName(LibInfo.MOD_ID + ":teatank");
        setCreativeTab(CreativeTabs.tabBrewing);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileTeaTank();
    }
    @Override
    public boolean renderAsNormalBlock() {
        return false;

    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public int getRenderType() {
        return -1;
    }

}
