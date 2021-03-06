package betterwithmods.util.item;

import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.util.Collections;
import java.util.Set;

/**
 * Set of methods dealing with ItemTools.
 *
 * @author Koward
 */
public final class ToolsManager {
    private ToolsManager() {
    }

    public static Item.ToolMaterial getToolMaterial(ItemTool tool) {
        return Item.ToolMaterial.valueOf(tool.getToolMaterialName());
    }

    public static void setAxesAsEffectiveAgainst(Block... blocks) {
        for (Item item : Item.REGISTRY) {
            if (!(item instanceof ItemAxe)) continue;
            ItemAxe tool = (ItemAxe) item;
            setToolAsEffectiveAgainst(tool, blocks);
        }
    }

    public static void setPickaxesAsEffectiveAgainst(Block... blocks) {
        for (Item item : Item.REGISTRY) {
            if (!(item instanceof ItemPickaxe)) continue;
            ItemPickaxe tool = (ItemPickaxe) item;
            setToolAsEffectiveAgainst(tool, blocks);
        }
    }

    public static Set<Block> getEffectiveBlocks(ItemTool tool) {
        return ReflectionHelper.getPrivateValue(ItemTool.class, tool, "field_150914_c", "effectiveBlocks");
    }

    public static void setToolAsEffectiveAgainst(ItemTool tool, Block... blocks) {
        Set<Block> effectiveOn = getEffectiveBlocks(tool);
        Collections.addAll(effectiveOn, blocks);
    }

    public static float getSpeed(ItemStack stack) {
        if (!stack.isEmpty() && stack.getItem() instanceof ItemTool) {
            ItemTool tool = (ItemTool) stack.getItem();
            Item.ToolMaterial material = getToolMaterial(tool);
            return material.getEfficiencyOnProperMaterial();
        }
        return 1;
    }

}
