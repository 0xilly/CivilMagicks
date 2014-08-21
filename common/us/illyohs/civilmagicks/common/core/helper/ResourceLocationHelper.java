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
 * Class created on Jul 20, 2014 at 10:13:32 PM
 * 
 */
package us.illyohs.civilmagicks.common.core.helper;

import us.illyohs.civilmagicks.common.lib.LibInfo;
import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper {
	
	public static ResourceLocation getResourceLocation(String modid, String path) {
		return new ResourceLocation(modid, path);
	}
	
	public static ResourceLocation getOBJAsset(String path) {
		return getResourceLocation(LibInfo.MOD_ID.toLowerCase(), "models/" + path + ".obj");
	}
	
	public static ResourceLocation getGUIAsset(String path) {
		return getResourceLocation(LibInfo.MOD_ID.toLowerCase(), "textures/gui/" + path + ".png");
	}
	
	public static ResourceLocation getModelAsset(String path) {
		return getResourceLocation(LibInfo.MOD_ID.toLowerCase(), "textures/models/" + path + ".png");
	}

}