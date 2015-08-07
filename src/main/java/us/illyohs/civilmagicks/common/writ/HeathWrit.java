package us.illyohs.civilmagicks.common.writ;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import us.illyohs.civilmagicks.api.writ.WritBase;

public class HeathWrit extends WritBase {

    public HeathWrit() {
        setType("Test");
        setName("Health test");
        setLore("Hmm heathy");
    }

    @Override
    public void spell(EntityPlayer caster) {
        caster.addPotionEffect(new PotionEffect(Potion.regeneration.id, 25, 3));
    }
}
