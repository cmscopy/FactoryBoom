package com.cmscopy.FactoryBoom.utility;

import com.cmscopy.FactoryBoom.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;


/**
 * Created by clemens on 01.04.15.
 */
public class LogHelp
{
    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_NAME, logLevel , String.valueOf(object));
    }

    public static void all(Object obj) { log(Level.ALL, obj); }
    public static void debug(Object obj) { log(Level.DEBUG, obj); }
    public static void error(Object obj) { log(Level.ERROR, obj); }
    public static void fatal(Object obj) { log(Level.FATAL, obj); }
    public static void info(Object obj) { log(Level.INFO, obj); }
    public static void trace(Object obj) { log(Level.TRACE, obj); }
    public static void warn(Object obj) { log(Level.WARN, obj); }
}
