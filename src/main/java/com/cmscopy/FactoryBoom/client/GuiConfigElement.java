package com.cmscopy.FactoryBoom.client;

import cpw.mods.fml.client.config.ConfigGuiType;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.config.GuiEditArrayEntries;
import cpw.mods.fml.client.config.IConfigElement;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by clemens on 01.04.15.
 */
public class GuiConfigElement implements IConfigElement {
    @Override
    public boolean isProperty() {
        return false;
    }

    @Override
    public Class<? extends GuiConfigEntries.IConfigEntry> getConfigEntryClass() {
        return null;
    }

    @Override
    public Class<? extends GuiEditArrayEntries.IArrayEntry> getArrayEntryClass() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getQualifiedName() {
        return null;
    }

    @Override
    public String getLanguageKey() {
        return null;
    }

    @Override
    public String getComment() {
        return null;
    }

    @Override
    public List<IConfigElement> getChildElements() {
        return null;
    }

    @Override
    public ConfigGuiType getType() {
        return null;
    }

    @Override
    public boolean isList() {
        return false;
    }

    @Override
    public boolean isListLengthFixed() {
        return false;
    }

    @Override
    public int getMaxListLength() {
        return 0;
    }

    @Override
    public boolean isDefault() {
        return false;
    }

    @Override
    public Object getDefault() {
        return null;
    }

    @Override
    public Object[] getDefaults() {
        return new Object[0];
    }

    @Override
    public void setToDefault() {

    }

    @Override
    public boolean requiresWorldRestart() {
        return false;
    }

    @Override
    public boolean showInGui() {
        return false;
    }

    @Override
    public boolean requiresMcRestart() {
        return false;
    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public Object[] getList() {
        return new Object[0];
    }

    @Override
    public void set(Object value) {

    }

    @Override
    public void set(Object[] aVal) {

    }

    @Override
    public String[] getValidValues() {
        return new String[0];
    }

    @Override
    public Object getMinValue() {
        return null;
    }

    @Override
    public Object getMaxValue() {
        return null;
    }

    @Override
    public Pattern getValidationPattern() {
        return null;
    }
}
