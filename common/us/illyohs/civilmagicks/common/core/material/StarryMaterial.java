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
 * Class created on Jun 29, 2014 at 8:10:25 PM
 * 
 */
package us.illyohs.civilmagicks.common.core.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class StarryMaterial extends Material {

	public StarryMaterial() {
		super(MapColor.airColor);
		this.setImmovableMobility();
		this.isToolNotRequired();
	}
	
	@Override
	public boolean isToolNotRequired() {
		return true;
	}
	
}