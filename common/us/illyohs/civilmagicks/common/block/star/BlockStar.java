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
 * Class created on Jun 29, 2014 at 8:27:58 PM
 * 
 */
package us.illyohs.civilmagicks.common.block.star;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import us.illyohs.civilmagicks.common.core.material.CivilMaterials;

public class BlockStar extends Block {

	public BlockStar() {
		this(CivilMaterials.starry);
	}
	
	public BlockStar(Material material){
		super(material);
		this.setCreativeTab(CreativeTabs.tabBrewing);
		this.setBlockBounds(0.25F, 0.25F, 0.25F, 0.75F, 0.75F, 0.75F);
		this.setTickRandomly(true);
		
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int x, int y, int z) {
        return null;
    }
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

}
