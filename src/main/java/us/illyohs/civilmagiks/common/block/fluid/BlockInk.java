package us.illyohs.civilmagiks.common.block.fluid;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockInk extends BlockFluidClassic {

    public BlockInk(Fluid fluid, Material material) {
        super(fluid, material);
        this.setQuantaPerBlock(5);
    }

}
