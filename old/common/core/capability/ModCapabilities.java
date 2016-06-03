package us.illyohs.civilmagiks.common.core.capability;

import net.minecraftforge.common.capabilities.CapabilityManager;
import us.illyohs.civilmagiks.api.capability.IManaHandler;
import us.illyohs.civilmagiks.common.core.capability.ManaStorage.ManaCallable;

public class ModCapabilities {

    public static void init() {
        CapabilityManager.INSTANCE.register(IManaHandler.class,  new ManaStorage(), new ManaCallable());
    }
}
