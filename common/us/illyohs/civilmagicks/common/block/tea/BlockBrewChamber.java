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
 * Class created on Jul 20, 2014 at 10:21:46 PM
 * 
 */
package us.illyohs.civilmagicks.common.block.tea;

import us.illyohs.civilmagicks.common.lib.LibInfo;
import us.illyohs.civilmagicks.common.tile.TileBrewChamber;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBrewChamber extends BlockContainer {

	public BlockBrewChamber() {
		super(Material.glass);
		setCreativeTab(CreativeTabs.tabBrewing);
		setBlockName(LibInfo.MOD_ID + "brewchambert");
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

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileBrewChamber();
	}

}