package us.illyohs.mod.civilmagiks.api.sigil;

import net.minecraft.entity.Entity;

import net.minecraftforge.fml.common.eventhandler.Event;

public class SigilEvent extends Event {

    public Sigil        sigil;
    public Entity       entity;
    public ActionType   actionType;
    
    public enum ActionType {
        INTERACT, COLLIED
    }

    public SigilEvent(Sigil sigil, Entity entity, ActionType actionType) {
        this.sigil = sigil;
        this.entity = entity;
        this.actionType = actionType;
    }
}
