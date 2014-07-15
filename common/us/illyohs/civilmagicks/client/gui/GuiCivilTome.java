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
package us.illyohs.civilmagicks.client.gui;

import us.illyohs.civilmagicks.client.lib.LibAssets;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GuiCivilTome extends GuiScreen {

	int xSize = 214;
	int ySize = 180;
	int left, top;

	private static final ResourceLocation TEXTURE = new ResourceLocation(LibAssets.CIVILTOME);

	@Override
	public void initGui() {
		super.initGui();
	}

	@Override
	public void drawScreen(int par1, int par2, float par3) {

	}

	public boolean doesGuiPauseGame() {
		return false;
	}

}
