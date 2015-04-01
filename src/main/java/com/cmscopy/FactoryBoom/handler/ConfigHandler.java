package com.cmscopy.FactoryBoom.handler;

import com.cmscopy.FactoryBoom.reference.Reference;
import com.cmscopy.FactoryBoom.utility.LogHelp;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by clemens on 01.04.15.
 */
public class ConfigHandler
{
    public static Configuration config;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if(config == null)
        {
            config = new Configuration(configFile);
            loadConfig();
        }

    }

    private static void loadConfig()
    {
        testValue = config.getBoolean(Configuration.CATEGORY_GENERAL, "testValue", true, "TestValue");

        if(config.hasChanged())
            config.save();
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfig();
        }
    }
}

