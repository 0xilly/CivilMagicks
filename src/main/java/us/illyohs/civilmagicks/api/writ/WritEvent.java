package us.illyohs.civilmagicks.api.writ;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;

public class WritEvent extends Event {

    public EntityPlayer player;
    public String       name;
    public ActionType   actionType;

    /**
     * 
     */
    public WritEvent(EntityPlayer player, String name, ActionType actionType) {
        this.player = player;
        this.name = name;
        this.actionType = actionType;

    }
    

    public enum ActionType {
        CREATE, ACTIVATE
    }
    
    public static void createWrit(EntityPlayer player, ActionType actionType, String name) {
        MinecraftForge.EVENT_BUS.post(new WritEvent(player, name, actionType.CREATE));
    }
    
    public static void activateWrit(EntityPlayer player, ActionType actionType, String name) {
        MinecraftForge.EVENT_BUS.post(new WritEvent(player, name, actionType.ACTIVATE));
    }

}
