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
 * Class created on ?
 * 
 */
package us.illyohs.civilmagicks.common.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import us.illyohs.civilmagicks.common.lib.LibInfo;
import us.illyohs.civilmagicks.common.tile.TileHomeCore;

public class BlockHomeCore extends BlockContainer {


	public BlockHomeCore() {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setHardness(6000.0F);
		this.setHarvestLevel("Diamond", 3);
		this.setResistance(6000000.0F);
		this.setBlockTextureName(LibInfo.MOD_ID + ":homecore");
		this.setBlockName(LibInfo.MOD_ID+":homecore");
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileHomeCore thc = (TileHomeCore) world.getTileEntity(x, y, y);
		if(!world.isRemote) {
//			world.setBlock(x, y, x, p_147465_4_, p_147465_5_, p_147465_6_)
		}
		
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileHomeCore();
	}

}
