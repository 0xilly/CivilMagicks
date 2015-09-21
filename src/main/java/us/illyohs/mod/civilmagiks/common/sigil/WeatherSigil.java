package us.illyohs.mod.civilmagiks.common.sigil;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import us.illyohs.mod.civilmagiks.api.sigil.SigilBase;

public class WeatherSigil extends SigilBase {

    public WeatherSigil() {
        super();
        setName("Sigil of Weaather");
        setDescription("Mmm moist");
        setLore("Will finish this later");
        setIsPersistent(false);
    }
    @Override
    public void execute(EntityPlayer writer, BlockPos pos) {
        writer.getEntityWorld().getWorldInfo().setRaining(true);
        writer.getEntityWorld().getWorldInfo().setThundering(true);
    }
}
