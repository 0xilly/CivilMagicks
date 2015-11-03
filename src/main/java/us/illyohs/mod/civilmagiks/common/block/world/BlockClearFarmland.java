package us.illyohs.mod.civilmagiks.common.block.world;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import us.illyohs.mod.civilmagiks.common.block.BaseBlock;

public class BlockClearFarmland extends BaseBlock {

    public BlockClearFarmland(Material material, String name, float hardness, float resistance, float light, boolean tick, CreativeTabs tab) {
        super(material, name, hardness, resistance, light, tick, tab);
    }
    
    @Override
    public boolean isFullCube() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }
}
