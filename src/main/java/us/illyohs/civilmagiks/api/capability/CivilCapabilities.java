package us.illyohs.civilmagiks.api.capability;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;


public class CivilCapabilities
{

    @CapabilityInject(IManaHandler.class)
    public static Capability<IManaHandler> MANA_HANDLER_CAPABILITY = null;

}
