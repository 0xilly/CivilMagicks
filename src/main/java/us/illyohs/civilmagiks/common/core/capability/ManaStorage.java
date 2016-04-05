package us.illyohs.civilmagiks.common.core.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import us.illyohs.civilmagiks.api.capability.IManaHandler;

import java.util.concurrent.Callable;

public class ManaStorage implements IStorage<IManaHandler> {

    @Override
    public NBTBase writeNBT(Capability<IManaHandler> capability, IManaHandler instance, EnumFacing side) {

        return null;
    }

    @Override
    public void readNBT(Capability<IManaHandler> capability, IManaHandler instance, EnumFacing side, NBTBase nbt) {

    }

    public static class ManaCallable implements Callable<IManaHandler> {

        @Override
        public IManaHandler call() throws Exception {
            return null;
        }
    }
}
