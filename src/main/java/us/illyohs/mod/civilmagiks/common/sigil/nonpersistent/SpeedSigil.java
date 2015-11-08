package us.illyohs.mod.civilmagiks.common.sigil.nonpersistent;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import us.illyohs.mod.civilmagiks.api.sigil.Sigil;

public class SpeedSigil extends Sigil {

    public SpeedSigil(String name, String description, String lore, ResourceLocation texture, int radius,
            int lightLevel, boolean isPersistent, boolean usesMana, boolean canOverlap) {
        super(name, description, lore, texture, radius, lightLevel, isPersistent, usesMana, canOverlap);
    }
    
    public void onEntityCollied(Entity entity) {
        EntityPlayer player = (EntityPlayer)entity;
        if (entity instanceof EntityPlayer) {
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 4, 5000));
        }
    }
}
