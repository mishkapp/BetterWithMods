package betterwithmods.module.gameplay;

import betterwithmods.common.BWCrafting;
import betterwithmods.common.BWOreDictionary;
import betterwithmods.common.registry.OreStack;
import betterwithmods.module.Feature;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

/**
 * Created by tyler on 4/21/17.
 */
public class NuggetCompression extends Feature {
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        for (ItemStack ingot : BWOreDictionary.ingotNames) {
            String suffix = BWOreDictionary.getSuffix(ingot,"ingot");
            if(suffix != null)
                BWCrafting.addOreCrucibleRecipe(ingot, new Object[]{new OreStack("nugget"+suffix, 9)});
        }
    }
}