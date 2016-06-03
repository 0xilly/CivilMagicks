package us.illyohs.civilmagiks.api.contract;


import net.minecraft.entity.player.EntityPlayer;

public abstract class Contract implements IContract {

    String              name;
    EntityPlayer        contracor;
    ContractableEntity  contractableEntity;

    public Contract(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public EntityPlayer getContracotr() {
        return null;
    }

    @Override
    public ContractableEntity getContractableEntity() {
        return null;
    }

}
