package com.cmscopy.FactoryBoom.client;

import com.cmscopy.FactoryBoom.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;

import java.util.List;

/**
 * Created by clemens on 01.04.15.
 */
public class GuiConfigMod extends GuiConfig {

    public GuiConfigMod(GuiScreen parentScreen, List<IConfigElement> configElements, String modID, String configID, boolean allRequireWorldRestart, boolean allRequireMcRestart, String title) {
        super(parentScreen, configElements, Reference.MOD_ID, configID, allRequireWorldRestart, allRequireMcRestart, title);

    }
}
