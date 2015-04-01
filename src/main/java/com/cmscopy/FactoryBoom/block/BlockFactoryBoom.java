package com.cmscopy.FactoryBoom.block;

import com.cmscopy.FactoryBoom.creativetab.CreativeTabFactoryBoom;
import com.cmscopy.FactoryBoom.item.ItemFactoryBoom;
import com.cmscopy.FactoryBoom.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

/**
 * Created by clemens on 01.04.15.
 */
public class BlockFactoryBoom extends Block
{

    public BlockFactoryBoom(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabFactoryBoom.FactoryBoom_Tab);
    }

    public BlockFactoryBoom()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        // tile.modid:blockname.name
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }
}
