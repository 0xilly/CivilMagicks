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
 * Class created on Jun 29, 2014 at 8:25:46 PM
 * 
 */
package us.illyohs.civilmagicks.common.block.star;

import us.illyohs.civilmagicks.common.tile.TileCivilStar;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCivilStar extends BlockStar implements ITileEntityProvider {
	
	public BlockCivilStar() {
//		this.setBlockBounds(1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileCivilStar();
	}

}
