package com.cmscopy.FactoryBoom.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by clemens on 01.04.15.
 */
public class ModRecipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.factoryHousing,8), " b ","bsb"," b ", 'b', "ingotBrick", 's', "stone"));
    }
}
