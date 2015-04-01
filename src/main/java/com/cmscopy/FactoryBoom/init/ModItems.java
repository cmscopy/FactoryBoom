package com.cmscopy.FactoryBoom.init;

import com.cmscopy.FactoryBoom.item.ItemFactoryBoom;
import com.cmscopy.FactoryBoom.item.ItemTest;
import com.cmscopy.FactoryBoom.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by clemens on 01.04.15.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemFactoryBoom itemTest = new ItemTest();

    public static void init() {
        GameRegistry.registerItem(itemTest, "ItemTest");
    }
}
