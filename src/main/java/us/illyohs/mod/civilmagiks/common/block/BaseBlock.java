package us.illyohs.mod.civilmagiks.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import us.illyohs.mod.civilmagiks.common.core.lib.LibInfo;

public class BaseBlock extends Block {

    public BaseBlock(Material material, String name, float hardness, float resistance, float light, boolean tick, CreativeTabs tab) {
        super(material);
        this.setUnlocalizedName(LibInfo.MOD_ID + ":" + name);
        this.setLightLevel(light);
        this.setTickRandomly(tick);
        this.setCreativeTab(tab);
        this.setHardness(hardness);
        this.setResistance(resistance);
//        this.set
    }

    
}
