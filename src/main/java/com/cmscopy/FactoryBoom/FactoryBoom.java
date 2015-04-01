package com.cmscopy.FactoryBoom;


import com.cmscopy.FactoryBoom.handler.ConfigHandler;
import com.cmscopy.FactoryBoom.init.ModBlocks;
import com.cmscopy.FactoryBoom.init.ModItems;
import com.cmscopy.FactoryBoom.init.ModRecipes;
import com.cmscopy.FactoryBoom.proxy.IProxy;
import com.cmscopy.FactoryBoom.reference.Reference;
import com.cmscopy.FactoryBoom.utility.LogHelp;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.sql.Ref;

/**
 * Created by clemens on 01.04.15.
 */
@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class FactoryBoom
{
    @Mod.Instance(Reference.MOD_ID)
    public static FactoryBoom instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide =  Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelp.info("Pre-Init finished!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelp.info(Reference.MOD_NAME+" is online! :-)");

        ModRecipes.init();

        LogHelp.info("Init finished!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

        LogHelp.info("Post-Init finished!");

        for(String oreName: OreDictionary.getOreNames())
            LogHelp.info(oreName);
    }

}
