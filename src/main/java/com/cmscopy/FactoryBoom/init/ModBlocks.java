package com.cmscopy.FactoryBoom.init;

import com.cmscopy.FactoryBoom.block.BlockFactoryBoom;
import com.cmscopy.FactoryBoom.block.ConveyorMotor;
import com.cmscopy.FactoryBoom.block.FactoryHousing;
import com.cmscopy.FactoryBoom.block.ProcessingConveyor;
import com.cmscopy.FactoryBoom.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by clemens on 01.04.15.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockFactoryBoom factoryHousing = new FactoryHousing();
    public static final BlockFactoryBoom conveyorMotor = new ConveyorMotor();
    public static final BlockFactoryBoom processingConveyor = new ProcessingConveyor();

    public static void init()
    {
        GameRegistry.registerBlock(factoryHousing, "FactoryHousing");
        GameRegistry.registerBlock(conveyorMotor, "ConveyorMotor");
        GameRegistry.registerBlock(processingConveyor, "ProcessingConveyor");
    }
}
