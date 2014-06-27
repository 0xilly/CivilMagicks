package us.illyohs.civilmagicks.common.helper;

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
        log(Level.DEBUG, "[" + LibInfo.MOD_NAME + "] " + obj.toString());
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
