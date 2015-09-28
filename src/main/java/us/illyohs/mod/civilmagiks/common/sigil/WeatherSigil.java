package us.illyohs.mod.civilmagiks.common.sigil;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import us.illyohs.mod.civilmagiks.api.sigil.Sigil;

public class WeatherSigil extends Sigil {

    public WeatherSigil() {
        super();
        setName("Sigil of Weaather");
        setDescription("Mmm moist");
        setLore("Will finish this later");
        setIsPersistent(false);
    }

    @Override
    public void execute(EntityPlayer writer) {
        writer.getEntityWorld().getWorldInfo().setRaining(true);
        writer.getEntityWorld().getWorldInfo().setThundering(true);
    }
}
