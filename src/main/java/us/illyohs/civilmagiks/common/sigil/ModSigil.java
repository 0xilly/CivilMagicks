package us.illyohs.civilmagiks.common.sigil;

import us.illyohs.civilmagiks.api.CivilMagicksAPI;
import us.illyohs.civilmagiks.api.sigil.Sigil;
import us.illyohs.civilmagiks.client.core.lib.LibAssets;
import us.illyohs.civilmagiks.common.core.lib.LibInfo;
import us.illyohs.civilmagiks.common.sigil.nonpersistent.SpeedSigil;

public class ModSigil {

    public static Sigil weatherSigil;
    public static Sigil speedSigil;

    public static void init() {
//        weatherSigil = new WeatherSigil();
        speedSigil = new SpeedSigil("speed sigil", "sigil descripor", "sigil", LibAssets.stormSigil, -1, 3, false, false, false);
        

        sigReg();
    }

    private static void sigReg() {
        CivilMagicksAPI.registerSigil(LibInfo.MOD_ID +"_speedSigil", speedSigil);
//        CivilMagicksAPI.registerSigil(LibInfo.MOD_ID + "sigilweather", weatherSigil);
    }
}
