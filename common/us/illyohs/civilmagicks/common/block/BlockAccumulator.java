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
 * Class created on Jul 8, 2014 at 3:21:34 AM
 * 
 */
package us.illyohs.civilmagicks.common.block;

import us.illyohs.civilmagicks.common.tile.TileAccumulator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAccumulator extends BlockContainer {

	public BlockAccumulator() {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBrewing);
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
		return new TileAccumulator();
	}


}
