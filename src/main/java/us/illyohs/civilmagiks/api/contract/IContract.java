package us.illyohs.civilmagiks.api.contract;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

public interface IContract
{

    String getName();

    EntityPlayer getContracotr();

    ContractableEntity getContractableEntity();

    void effectOnClick(EntityPlayer player);

    void effectOnTick();

    void effectEntity(EntityLivingBase entity);

    void effectPos(BlockPos pos);
}
