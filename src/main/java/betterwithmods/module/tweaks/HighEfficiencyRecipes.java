package betterwithmods.module.tweaks;

import betterwithmods.module.Feature;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

/**
 * Created by tyler on 5/16/17.
 */
public class HighEfficiencyRecipes extends Feature {
    @Override
    public void postInit(FMLPostInitializationEvent event) {
//        BWMRecipes.addOreRecipe(BlockMechMachines.getStack(BlockMechMachines.EnumType.PULLEY), "PIP", "GLG", "PIP", 'P', "sidingWood", 'I', "ingotIron", 'G', "gearWood", 'L', ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.REDSTONE_LATCH));
//
//        BWMRecipes.addOreRecipe(new ItemStack(BWMBlocks.PLATFORM), "MWM", " M ", "MWM", 'M', "sidingWood", 'W', new ItemStack(BWMBlocks.WICKER, 1, 2));
//        BWMRecipes.addOreRecipe(new ItemStack(BWMBlocks.WOODEN_AXLE), "M", "R", "M", 'M', "mouldingWood", 'R', BWMBlocks.ROPE);
//        BWMRecipes.addOreRecipe(new ItemStack(BWMBlocks.GEARBOX), "SGS", "GLG", "SGS", 'L', ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.REDSTONE_LATCH), 'S', "sidingWood", 'G', "gearWood");
//        BWMRecipes.addOreRecipe(new ItemStack(Blocks.STONE_BRICK_STAIRS), "M ", "MM", 'M', new ItemStack(BWMBlocks.STONE_MOULDING, 1, BlockMini.EnumType.STONEBRICK.getMetadata()));
//        BWMRecipes.addOreRecipe(new ItemStack(Blocks.NETHER_BRICK_STAIRS), "M ", "MM", 'M', new ItemStack(BWMBlocks.STONE_MOULDING, 1, BlockMini.EnumType.NETHERBRICK.getMetadata()));
//        BWMRecipes.addOreRecipe(new ItemStack(Blocks.BRICK_STAIRS), "M ", "MM", 'M', new ItemStack(BWMBlocks.STONE_MOULDING, 1, BlockMini.EnumType.BRICK.getMetadata()));
//        BWMRecipes.addOreRecipe(new ItemStack(Blocks.SANDSTONE_STAIRS), "M ", "MM", 'M', new ItemStack(BWMBlocks.STONE_MOULDING, 1, BlockMini.EnumType.SANDSTONE.getMetadata()));
//        BWMRecipes.addOreRecipe(new ItemStack(Blocks.NOTEBLOCK), "SSS", "SRS", "SSS", 'S', "sidingWood", 'R', "dustRedstone");
//        BWMRecipes.addOreRecipe(new ItemStack(Blocks.JUKEBOX), "SSS", "SDS", "SSS", 'S', "sidingWood", 'D', "gemDiamond");
//        BWMRecipes.addOreRecipe(new ItemStack(BWMBlocks.SAW), "III", "GBG", "WGW", 'I', "ingotIron", 'G', "gearWood", 'W', "sidingWood", 'B', ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.LEATHER_BELT));
//        BWMRecipes.addOreRecipe(new ItemStack(Blocks.BOOKSHELF), "SSS", "BBB", "SSS", 'S', "sidingWood", 'B', Items.BOOK);
//        BWMRecipes.addOreRecipe(new ItemStack(Blocks.CHEST), "SSS", "S S", "SSS", 'S', "sidingWood");
//        BWMRecipes.addOreRecipe(new ItemStack(Blocks.LADDER, 4), "M M", "MMM", "M M", 'M', "mouldingWood");
//        BWMRecipes.addOreRecipe(new ItemStack(Blocks.TRAPDOOR, 2), "SSS", "SSS", 'S', "sidingWood");
//        BWMRecipes.addOreRecipe(new ItemStack(Items.SIGN, 3), "S", "M", 'S', "sidingWood", 'M', "mouldingWood");
//        BWMRecipes.addOreRecipe(new ItemStack(Items.ITEM_FRAME), "MMM", "MLM", "MMM", 'M', "mouldingWood", 'L', ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.LEATHER_CUT));
//        BWMRecipes.addOreRecipe(new ItemStack(Items.BOWL, 6), "S S", " S ", 'S', "sidingWood");
//
//        for (BlockPlanks.EnumType type : BlockPlanks.EnumType.values()) {
//            BWMRecipes.addShapelessOreRecipe(new ItemStack(BWMBlocks.WOOD_MOULDING, 1, type.getMetadata()), new ItemStack(BWMBlocks.WOOD_CORNER, 1, type.getMetadata()), new ItemStack(BWMBlocks.WOOD_CORNER, 1, type.getMetadata()));
//            BWMRecipes.addShapelessOreRecipe(new ItemStack(BWMBlocks.WOOD_SIDING, 1, type.getMetadata()), new ItemStack(BWMBlocks.WOOD_MOULDING, 1, type.getMetadata()), new ItemStack(BWMBlocks.WOOD_MOULDING, 1, type.getMetadata()));
//            BWMRecipes.addShapelessOreRecipe(new ItemStack(Blocks.PLANKS, 1, type.getMetadata()), new ItemStack(BWMBlocks.WOOD_SIDING, 1, type.getMetadata()), new ItemStack(BWMBlocks.WOOD_SIDING, 1, type.getMetadata()));
//            BWMRecipes.addOreRecipe(new ItemStack(BWMBlocks.WOOD_TABLE, 4, type.getMetadata()), "SSS", " M ", " M ", 'S', new ItemStack(BWMBlocks.WOOD_SIDING, 1, type.getMetadata()), 'M', new ItemStack(BWMBlocks.WOOD_MOULDING, 1, type.getMetadata()));
//            BWMRecipes.addOreRecipe(new ItemStack(BWMBlocks.WOOD_BENCH, 4, type.getMetadata()), "SSS", " M ", 'S', new ItemStack(BWMBlocks.WOOD_SIDING, 1, type.getMetadata()), 'M', new ItemStack(BWMBlocks.WOOD_MOULDING, 1, type.getMetadata()));
//        }
//
//        for (BlockMini.EnumType type : BlockMini.EnumType.values()) {
//            BWMRecipes.addShapelessOreRecipe(new ItemStack(BWMBlocks.STONE_MOULDING, 1, type.getMetadata()), new ItemStack(BWMBlocks.STONE_CORNER, 1, type.getMetadata()), new ItemStack(BWMBlocks.STONE_CORNER, 1, type.getMetadata()));
//            BWMRecipes.addShapelessOreRecipe(new ItemStack(BWMBlocks.STONE_SIDING, 1, type.getMetadata()), new ItemStack(BWMBlocks.STONE_MOULDING, 1, type.getMetadata()), new ItemStack(BWMBlocks.STONE_MOULDING, 1, type.getMetadata()));
//            BWMRecipes.addShapelessOreRecipe(type.getBlock(), new ItemStack(BWMBlocks.STONE_SIDING, 1, type.getMetadata()), new ItemStack(BWMBlocks.STONE_SIDING, 1, type.getMetadata()));
//        }
//
//        BWMRecipes.addShapelessOreRecipe(new ItemStack(Items.STICK), new ItemStack(BWMBlocks.WOOD_MOULDING, 1, OreDictionary.WILDCARD_VALUE));
//        BWMRecipes.addShapelessOreRecipe(new ItemStack(Items.BOOK), ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.LEATHER_CUT), "paper", "paper", "paper");
//
//        int count = ModuleLoader.isFeatureEnabled(HCSaw.class) ? 1 : 3;
//        ItemStack[] doors = {new ItemStack(Items.OAK_DOOR, count), new ItemStack(Items.SPRUCE_DOOR, count), new ItemStack(Items.BIRCH_DOOR, count), new ItemStack(Items.JUNGLE_DOOR, count), new ItemStack(Items.ACACIA_DOOR, count), new ItemStack(Items.DARK_OAK_DOOR, count)};
//        ItemStack[] boats = {new ItemStack(Items.BOAT), new ItemStack(Items.SPRUCE_BOAT), new ItemStack(Items.BIRCH_BOAT), new ItemStack(Items.JUNGLE_BOAT), new ItemStack(Items.ACACIA_BOAT), new ItemStack(Items.DARK_OAK_BOAT)};
//        ItemStack[] fences = {new ItemStack(Blocks.OAK_FENCE, 2), new ItemStack(Blocks.SPRUCE_FENCE, 2), new ItemStack(Blocks.BIRCH_FENCE, 2), new ItemStack(Blocks.JUNGLE_FENCE, 2), new ItemStack(Blocks.ACACIA_FENCE, 2), new ItemStack(Blocks.DARK_OAK_FENCE, 2)};
//        ItemStack[] gates = {new ItemStack(Blocks.OAK_FENCE_GATE), new ItemStack(Blocks.SPRUCE_FENCE_GATE), new ItemStack(Blocks.BIRCH_FENCE_GATE), new ItemStack(Blocks.JUNGLE_FENCE_GATE), new ItemStack(Blocks.ACACIA_FENCE_GATE), new ItemStack(Blocks.DARK_OAK_FENCE_GATE)};
//        ItemStack[] stairs = {new ItemStack(Blocks.OAK_STAIRS), new ItemStack(Blocks.SPRUCE_STAIRS), new ItemStack(Blocks.BIRCH_STAIRS), new ItemStack(Blocks.JUNGLE_STAIRS), new ItemStack(Blocks.ACACIA_STAIRS), new ItemStack(Blocks.DARK_OAK_STAIRS)};
//        for (BlockPlanks.EnumType type : BlockPlanks.EnumType.values()) {
//            int meta = type.getMetadata();
//            BWMRecipes.addOreRecipe(doors[meta], "SS", "SS", "SS", 'S', new ItemStack(BWMBlocks.WOOD_SIDING, 1, meta));
//            BWMRecipes.addOreRecipe(boats[meta], "S S", "SSS", 'S', new ItemStack(BWMBlocks.WOOD_SIDING, 1, meta));
//            BWMRecipes.addOreRecipe(fences[meta], "MMM", 'M', new ItemStack(BWMBlocks.WOOD_MOULDING, 1, meta));
//            BWMRecipes.addOreRecipe(gates[meta], "MSM", 'M', new ItemStack(BWMBlocks.WOOD_MOULDING, 1, meta), 'S', new ItemStack(BWMBlocks.WOOD_SIDING, 1, meta));
//            BWMRecipes.addOreRecipe(stairs[meta], "M ", "MM", 'M', new ItemStack(BWMBlocks.WOOD_MOULDING, 1, meta));
//        }
    }

    @Override
    public String getFeatureDescription() {
        return "Add High Efficiency Recipes by using more advanced materials";
    }
}
