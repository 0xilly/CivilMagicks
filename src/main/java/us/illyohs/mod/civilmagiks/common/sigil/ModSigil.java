package us.illyohs.mod.civilmagiks.common.sigil;

import us.illyohs.mod.civilmagiks.api.CivilMagicksAPI;
import us.illyohs.mod.civilmagiks.api.sigil.Sigil;
import us.illyohs.mod.civilmagiks.common.core.lib.LibInfo;

public class ModSigil {

    public static Sigil weatherSigil;

    public static void init() {
//        weatherSigil = new WeatherSigil();

        sigReg();
    }

    private static void sigReg() {
        CivilMagicksAPI.registerSigil(LibInfo.MOD_ID + "sigilweather", weatherSigil);
    }
}
