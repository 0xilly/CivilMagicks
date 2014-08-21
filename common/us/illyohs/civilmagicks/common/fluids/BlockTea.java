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
 * Class created on Aug 18, 2014 at 2:45:33 AM
 * 
 */
package us.illyohs.civilmagicks.common.fluids;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.illyohs.civilmagicks.client.lib.LibAssets;
import us.illyohs.civilmagicks.common.lib.LibInfo;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockTea extends BlockFluidClassic {
    
    @SideOnly(Side.CLIENT)
    private IIcon TFS;
    
    @SideOnly(Side.CLIENT)
    private IIcon TFF;

    public BlockTea(Fluid fluid, Material material) {
        super(fluid, material);
        setBlockName(LibInfo.MOD_ID + ":basetea");
        setCreativeTab(CreativeTabs.tabBrewing);//Should make a tab for these things but really lazy
    }
    
    @Override
    public IIcon getIcon(int side, int meta) {
        return (side == 0 || side == 1)? TFS : TFF;
        
    }
    
    public void registerBlockIcons(IIconRegister reg) {
        TFS = reg.registerIcon(LibAssets.TEABASESTILL);
        TFF = reg.registerIcon(LibAssets.TEABASEFLOW);
    }
}
