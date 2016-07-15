package us.illyohs.civilmagiks.api.contract;


import javax.annotation.Nonnull;

import net.minecraft.entity.player.EntityPlayer;

public abstract class Contract implements IContract
{

    String              name;
    EntityPlayer        contracor;
    ContractableEntity  contractableEntity;

    public Contract(@Nonnull String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public EntityPlayer getContracotr()
    {
        return contracor;
    }

    @Override
    public ContractableEntity getContractableEntity()
    {
        return contractableEntity;
    }

}
