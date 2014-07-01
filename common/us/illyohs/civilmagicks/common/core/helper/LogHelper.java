/**
 * This class was created by Anthony Anderson(Lord Illyohs)
 * It is distributed as part of CivilMagicks
 * Source Code: https://github.com/LordIllyohs/CivilMagicks
 *
 * CivilMagicks is Open Source and distributed under a
 * Attribution-NonCommercial-ShareAlike 3.0 Unported license.
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/)
 *
 * 
 * Class created on ?
 * 
 */
package us.illyohs.civilmagicks.common.core.helper;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import us.illyohs.civilmagicks.common.lib.LibInfo;

public class LogHelper {
	
	private static final Logger CivilLog = LogManager.getLogger(LibInfo.MOD_ID);

    public static void log(Level logLevel, Object obj) {
        CivilLog.log(logLevel, obj.toString());
    }

    public static void debug(Object obj) {
        log(Level.INFO, "[" + LibInfo.MOD_NAME + " DEBUG] " + obj.toString());
    }

    public static void warn(Object obj) {
        log(Level.WARN, "[" + LibInfo.MOD_NAME + "] " + obj.toString());
    }

    public static void info(Object obj) {
        log(Level.INFO, "[" + LibInfo.MOD_NAME + "] " + obj.toString());
    }

    public static void fatal(Object obj) {
        log(Level.FATAL, "[" + LibInfo.MOD_NAME + "] " + obj.toString());
    }
}
