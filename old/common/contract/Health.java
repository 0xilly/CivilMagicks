package us.illyohs.civilmagiks.common.contract;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import us.illyohs.civilmagiks.api.contract.Contract;

public class Health extends Contract {

    public Health(String name) {
        super(name);
    }

    @Override
    public void effectOnClick(EntityPlayer player) {

    }

    @Override
    public void effectOnTick() {

    }

    @Override
    public void effectEntity(EntityLivingBase entity) {
        entity.addPotionEffect(new PotionEffect(MobEffects.REGENERATION));
    }

    @Override
    public void effectPos(BlockPos pos) {

    }
}
