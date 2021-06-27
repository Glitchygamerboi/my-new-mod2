package net.glitchyystudios.better_underground.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.glitchyystudios.better_underground.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    private BlockRegistry(){}

    public static final Block COMPRESSED_STONE = new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).requiresTool());
    public static final Block RHYOLITE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block MARBLE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block DOLOMITE = new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).requiresTool());
    public static final Block LIMESTONE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block LAKE_MISSOULA_CLAYSTONE_SEDIMENT = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
public static final Block ALKALI_FELDSPAR_GRANITE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
public static final Block RHYODACITE =new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
public static final Block NEPHELINE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
public static final Block GREY_DACITE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
public static final Block STONE_SAND = new Block(FabricBlockSettings.copy(Blocks.SAND).requiresTool());
public static final Block BOREAL_DIRT = new Block(FabricBlockSettings.copy(Blocks.DIRT).requiresTool());
public static final Block PEARL_DACITE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
public static final Block LAYERSTONE = new Block(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static final Block GOLD_ORE_LAYERSTONE = new Block(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static final Block PUMICE = new Block(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static final Block PINE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).requiresTool());
    public static final Block PINE_LEAVES = new Block(FabricBlockSettings.copy(Blocks.SPRUCE_LEAVES).requiresTool());
//Follow the template below if you want to contribute a block, im going to create the BlockItem
public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static void register() {
        Registry.register(Registry.BLOCK, Utils.ID("compressed_stone"), COMPRESSED_STONE);
        Registry.register(Registry.BLOCK, Utils.ID("rhyolite"), RHYOLITE);
        Registry.register(Registry.BLOCK, Utils.ID("marble"), MARBLE);
        Registry.register(Registry.BLOCK, Utils.ID("dolomite"), DOLOMITE);
        Registry.register(Registry.BLOCK, Utils.ID("limestone"), LIMESTONE);
        Registry.register(Registry.BLOCK, Utils.ID("lake_missoula_claystone_sediment"), LAKE_MISSOULA_CLAYSTONE_SEDIMENT);
        Registry.register(Registry.BLOCK, Utils.ID("alkali_feldspar_granite"), ALKALI_FELDSPAR_GRANITE);
        Registry.register(Registry.BLOCK, Utils.ID("rhyodacite"), RHYODACITE);
        Registry.register(Registry.BLOCK, Utils.ID("nepheline"), NEPHELINE);
        Registry.register(Registry.BLOCK, Utils.ID("grey_dacite"), GREY_DACITE);
        Registry.register(Registry.BLOCK, Utils.ID("stone_sand"), STONE_SAND);
        Registry.register(Registry.BLOCK, Utils.ID("boreal_dirt"), BOREAL_DIRT);
        Registry.register(Registry.BLOCK, Utils.ID("layerstone"), LAYERSTONE);
        Registry.register(Registry.BLOCK, Utils.ID("pearl_dacite"), PEARL_DACITE);   
        Registry.register(Registry.BLOCK, Utils.ID("gold_ore_layerstone"), GOLD_ORE_LAYERSTONE);
        Registry.register(Registry.BLOCK,Utils.ID("pumice"), PUMICE);
        Registry.register(Registry.BLOCK, Utils.ID("pine_planks"), PINE_PLANKS);
        Registry.register(Registry.BLOCK, Utils.ID("pine_leaves"), PINE_LEAVES);
          //Follow the template below to register an block
        Registry.register(Registry.BLOCK, Utils.ID("example_block"), EXAMPLE_BLOCK);
    }

}
