package us.illyohs.civilmagicks.magicks.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import us.illyohs.civilmagicks.api.mana.ManaNetEvent;

public class ManaHandler {
    
    public static final ManaHandler instatnce = new ManaHandler();

    
    @SubscribeEvent
    public void ManaNetEvent(ManaNetEvent event) {

    }
    
}
