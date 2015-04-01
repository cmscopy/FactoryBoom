package com.cmscopy.FactoryBoom.utility;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by clemens on 01.04.15.
 */
public class NBTHelper
{
    private static void initNBTTagCompound(ItemStack itemStack)
    {
        if(itemStack.stackTagCompound == null)
            itemStack.setTagCompound(new NBTTagCompound());
    }

    public static void setLong(ItemStack itemStack, String keyName, long keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setLong(keyName,keyValue);
    }

    public static long getLong(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if(!itemStack.stackTagCompound.hasKey(keyName))
            setLong(itemStack, keyName, 0);

        return itemStack.stackTagCompound.getLong(keyName);
    }

    public static boolean hasTag(ItemStack itemStack, String keyName)
    {
        return itemStack != null && itemStack.stackTagCompound != null && itemStack.stackTagCompound.hasKey(keyName);
    }

    public static void removeTag(ItemStack itemStack, String keyName)
    {
        if(itemStack.stackTagCompound != null)
            itemStack.stackTagCompound.removeTag(keyName);
    }
}
