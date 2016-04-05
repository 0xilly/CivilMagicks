package us.illyohs.civilmagiks.api.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

import java.util.concurrent.Callable;

public class CivilCapabilities {

    @CapabilityInject(IManaHandler.class)
    public static Capability<IManaHandler> MANA_HANDLER_CAPABILITY = null;

}
