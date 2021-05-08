package net.glitchyystudios.better_underground.registry;

import jdk.nashorn.internal.ir.Block;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.glitchyystudios.better_underground.BUItemGroups;
import net.glitchyystudios.better_underground.Utils;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    
    private ItemRegistry(){}
    public static final Item COMPRESSED_STONE = new BlockItem(BlockRegistry.COMPRESSED_STONE, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));
    public static final Item RHYOLITE = new BlockItem(BlockRegistry.RHYOLITE, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));
    public static final Item MARBLE = new BlockItem(BlockRegistry.MARBLE, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));
    public static final Item DOLOMITE = new BlockItem(BlockRegistry.DOLOMITE, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));
    public static final Item LIMESTONE = new BlockItem(BlockRegistry.LIMESTONE, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));
    public static final Item LAKE_MISSOULA_CLAYSTONE_SEDIMENT = new BlockItem(BlockRegistry.LAKE_MISSOULA_CLAYSTONE_SEDIMENT, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));
    public static final Item ALKALI_FELDSPAR_GRANITE = new BlockItem(BlockRegistry.ALKALI_FELDSPAR_GRANITE, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));
    public static final Item RHYODACITE = new BlockItem(BlockRegistry.RHYODACITE, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));
    public static final Item NEPHELINE = new BlockItem(BlockRegistry.NEPHELINE, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));
    public static final Item GREY_DACITE = new BlockItem(BlockRegistry.GREY_DACITE, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));
    public static final Item PEGMATITE = new BlockItem(BlockRegistry.PEGMATITE, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));
    public static final Item CLEAN_PEGMATITE = new BlockItem(BlockRegistry.CLEAN_PEGMATITE, new FabricItemSettings().group(BUItemGroups.BETTER_UNDERGROUND));

    public static void register() {
        Registry.register(Registry.ITEM, Utils.ID("compressed_stone"),COMPRESSED_STONE);
        Registry.register(Registry.ITEM, Utils.ID("rhyolite"), RHYOLITE);
        Registry.register(Registry.ITEM, Utils.ID("marble"), MARBLE);
        Registry.register(Registry.ITEM, Utils.ID("dolomite"), DOLOMITE);
        Registry.register(Registry.ITEM, Utils.ID("limestone"), LIMESTONE);
        Registry.register(Registry.ITEM, Utils.ID("lake_missoula_claystone_sediment"), LAKE_MISSOULA_CLAYSTONE_SEDIMENT);
        Registry.register(Registry.ITEM, Utils.ID("alkali_feldspar_granite"), ALKALI_FELDSPAR_GRANITE);
        Registry.register(Registry.ITEM, Utils.ID("rhyodacite"), RHYODACITE);
        Registry.register(Registry.ITEM, Utils.ID("nepheline"), NEPHELINE);
        Registry.register(Registry.ITEM, Utils.ID("grey_dacite"), GREY_DACITE);
        Registry.register(Registry.ITEM, Utils.ID("pegmatite"), PEGMATITE);
        Registry.register(Registry.ITEM, Utils.ID("clean_pegmatite"), CLEAN_PEGMATITE);
    }

}
