package net.glitchyystudios.better_underground.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.glitchyystudios.better_underground.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    
    private ItemRegistry(){}
    public static final Item COMPRESSED_STONE = new BlockItem(BlockRegistry.COMPRESSED_STONE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item RHYOLITE = new BlockItem(BlockRegistry.RHYOLITE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item MARBLE = new BlockItem(BlockRegistry.MARBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item DOLOMITE = new BlockItem(BlockRegistry.DOLOMITE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item LIMESTONE = new BlockItem(BlockRegistry.LIMESTONE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item LAKE_MISSOULA_CLAYSTONE_SEDIMENT = new BlockItem(BlockRegistry.LAKE_MISSOULA_CLAYSTONE_SEDIMENT, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item ALKALI_FELDSPAR_GRANITE = new BlockItem(BlockRegistry.ALKALI_FELDSPAR_GRANITE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item RHYODACITE = new BlockItem(BlockRegistry.RHYODACITE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item NEPHELINE = new BlockItem(BlockRegistry.NEPHELINE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item GREY_DACITE = new BlockItem(BlockRegistry.GREY_DACITE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
   //you can reuse the code to add more blocks, make sure to change the names, if you are making an item, replace BlockItem with Item
    public static final Item STONE_SAND = new BlockItem(BlockRegistry.STONE_SAND, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item BOREAL_DIRT = new BlockItem(BlockRegistry.BOREAL_DIRT, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item PEARL_DACITE = new BlockItem(BlockRegistry.PEARL_DACITE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item LAYERSTONE = new BlockItem(BlockRegistry.LAYERSTONE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item GOLD_ORE_LAYERSTONE = new BlockItem(BlockRegistry.GOLD_ORE_LAYERSTONE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item PUMICE = new BlockItem(BlockRegistry.PUMICE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item GRANODIORITE = new BlockItem(BlockRegistry.GRANODIORITE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item COMPRESSED_STONE_PEBBLE = new BlockItem(BlockRegistry.COMPRESSED_STONE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item RHYOLITE_PEBBLE = new BlockItem(BlockRegistry.RHYOLITE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item MARBLE_PEBBLE = new BlockItem(BlockRegistry.MARBLE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item DOLOMITE_PEBBLE = new BlockItem(BlockRegistry.DOLOMITE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item LIMESTONE_PEBBLE = new BlockItem(BlockRegistry.LIMESTONE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item LAKE_MISSOULA_CLAYSTONE_SEDIMENT_PEBBLE = new BlockItem(BlockRegistry.LAKE_MISSOULA_CLAYSTONE_SEDIMENT_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item ALKALI_FELDSPAR_GRANITE_PEBBLE = new BlockItem(BlockRegistry.ALKALI_FELDSPAR_GRANITE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item RHYODACITE_PEBBLE = new BlockItem(BlockRegistry.RHYODACITE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item NEPHELINE_PEBBLE = new BlockItem(BlockRegistry.NEPHELINE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item GREY_DACITE_PEBBLE = new BlockItem(BlockRegistry.GREY_DACITE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item STONE_SAND_PEBBLE = new BlockItem(BlockRegistry.STONE_SAND_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item PEARL_DACITE_PEBBLE = new BlockItem(BlockRegistry.PEARL_DACITE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item LAYERSTONE_PEBBLE = new BlockItem(BlockRegistry.LAYERSTONE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item GOLD_ORE_LAYERSTONE_PEBBLE = new BlockItem(BlockRegistry.GOLD_ORE_LAYERSTONE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item PUMICE_PEBBLE = new BlockItem(BlockRegistry.PUMICE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));
    public static final Item GRANODIORITE_PEBBLE = new BlockItem(BlockRegistry.GRANODIORITE_PEBBLE, new FabricItemSettings().group(BUItemGroups.REALISTICS_GEOLOGICAL_BLOCKS));


    public static void register() {
        Registry.register(Registry.ITEM, Utils.ID("compressed_stone"), COMPRESSED_STONE);
        Registry.register(Registry.ITEM, Utils.ID("rhyolite"), RHYOLITE);
        Registry.register(Registry.ITEM, Utils.ID("marble"), MARBLE);
        Registry.register(Registry.ITEM, Utils.ID("dolomite"), DOLOMITE);
        Registry.register(Registry.ITEM, Utils.ID("limestone"), LIMESTONE);
        Registry.register(Registry.ITEM, Utils.ID("lake_missoula_claystone_sediment"), LAKE_MISSOULA_CLAYSTONE_SEDIMENT);
        Registry.register(Registry.ITEM, Utils.ID("alkali_feldspar_granite"), ALKALI_FELDSPAR_GRANITE);
        Registry.register(Registry.ITEM, Utils.ID("rhyodacite"), RHYODACITE);
        Registry.register(Registry.ITEM, Utils.ID("nepheline"), NEPHELINE);
        Registry.register(Registry.ITEM, Utils.ID("grey_dacite"), GREY_DACITE);
        Registry.register(Registry.ITEM, Utils.ID("boreal_dirt"), BOREAL_DIRT);
        Registry.register(Registry.ITEM, Utils.ID("pearl_dacite"), PEARL_DACITE);
        Registry.register(Registry.ITEM, Utils.ID("layerstone"), LAYERSTONE);
        Registry.register(Registry.ITEM, Utils.ID("gold_ore_layerstone"), GOLD_ORE_LAYERSTONE);
        Registry.register(Registry.ITEM, Utils.ID("pumice"), PUMICE);
        Registry.register(Registry.ITEM, Utils.ID("granodiorite"), GRANODIORITE);
        Registry.register(Registry.ITEM, Utils.ID("compressed_stone_pebble"), COMPRESSED_STONE_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("rhyolite_pebble"), RHYOLITE_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("marble_pebble"), MARBLE_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("dolomite_pebble"), DOLOMITE_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("limestone_pebble"), LIMESTONE_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("lake_missoula_claystone_sediment_pebble"), LAKE_MISSOULA_CLAYSTONE_SEDIMENT_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("alkali_feldspar_granite_pebble"), ALKALI_FELDSPAR_GRANITE_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("rhyodacite_pebble"), RHYODACITE_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("nepheline_pebble"), NEPHELINE_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("grey_dacite_pebble"), GREY_DACITE_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("stone_sand_pebble"), STONE_SAND_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("layerstone_pebble"), LAYERSTONE_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("pearl_dacite_pebble"), PEARL_DACITE_PEBBLE);   
        Registry.register(Registry.ITEM, Utils.ID("gold_ore_layerstone_pebble"), GOLD_ORE_LAYERSTONE_PEBBLE);
        Registry.register(Registry.ITEM,Utils.ID("pumice_pebble"), PUMICE_PEBBLE);
        Registry.register(Registry.ITEM, Utils.ID("granodiorite_pebble"), GRANODIORITE_PEBBLE);
        //use the code below to register an item, rename the item to the name of your item
        Registry.register(Registry.ITEM, Utils.ID("stone_sand"), STONE_SAND);
    }


}
