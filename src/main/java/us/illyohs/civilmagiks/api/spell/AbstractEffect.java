package us.illyohs.civilmagiks.api.spell;

import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by illyohs on 8/2/16.
 */
public abstract class AbstractEffect
{
    int     time;
    String  name;
    boolean canTarget;

    public AbstractEffect(String name)
    {
        this.name = name;
    }

    public AbstractEffect(String name, boolean canTarget)
    {
        this.name = name;
        this.canTarget = canTarget;
    }

    public AbstractEffect(int seconds, String name)
    {
        this.time = seconds;
        this.name = name;
    }

    public AbstractEffect(int seconds, String name, boolean canTarget)
    {
        this.time = seconds;
        this.name = name;
        this.canTarget = canTarget;
    }

    public int getTime()
    {
        return time * 20;
    }

    public boolean canTarget()
    {
        return canTarget;
    }

    public void setCanTarget(boolean canTarget)
    {
        this.canTarget = canTarget;
    }

    public String getName()
    {
        return name;
    }



    public abstract void effectPlayer(EntityPlayer player);

    public abstract void effectTarget(EntityPlayer player, Object target);

}
