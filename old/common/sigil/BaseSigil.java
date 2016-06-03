package us.illyohs.civilmagiks.common.sigil;

import net.minecraft.util.ResourceLocation;
import us.illyohs.civilmagiks.api.sigil.Sigil;
import us.illyohs.civilmagiks.common.core.util.InfoUtil;

public class BaseSigil extends Sigil{

    public BaseSigil(String name, int radius, String texture) {
        this.setModid(InfoUtil.MOD_ID);
        this.setRadius(radius);
        this.setTexture(new ResourceLocation(InfoUtil.MOD_ID, "textures/sigil/" + texture));
        this.setUnLocalizedName(InfoUtil.MOD_ID + ":" + name);
        this.setRegistryName(name);
    }

    public BaseSigil(String name, int radius) {
        this.setModid(InfoUtil.MOD_ID);
        this.setRadius(radius);
        this.setUnLocalizedName(InfoUtil.MOD_ID + ":" + name);
        this.setRegistryName(name);
    }
}
