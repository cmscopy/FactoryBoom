package com.cmscopy.FactoryBoom.creativetab;

import com.cmscopy.FactoryBoom.init.ModItems;
import com.cmscopy.FactoryBoom.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by clemens on 01.04.15.
 */
public class CreativeTabFactoryBoom
{
    public static final CreativeTabs FactoryBoom_Tab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.itemTest;
        }

    };

}
