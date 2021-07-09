package net.glitchyystudios.better_underground.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.glitchyystudios.better_underground.Utils;
import net.glitchyystudios.better_underground.special_blocks.PebbleBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    private BlockRegistry(){}

    public static final Block COMPRESSED_STONE = new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE));
    public static final Block RHYOLITE = new Block(FabricBlockSettings.copy(Blocks.GRANITE));
    public static final Block MARBLE = new Block(FabricBlockSettings.copy(Blocks.GRANITE));
    public static final Block DOLOMITE = new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE));
    public static final Block LIMESTONE = new Block(FabricBlockSettings.copy(Blocks.GRANITE));
    public static final Block LAKE_MISSOULA_CLAYSTONE_SEDIMENT = new Block(FabricBlockSettings.copy(Blocks.GRANITE));
public static final Block ALKALI_FELDSPAR_GRANITE = new Block(FabricBlockSettings.copy(Blocks.GRANITE));
public static final Block RHYODACITE =new Block(FabricBlockSettings.copy(Blocks.GRANITE));
public static final Block NEPHELINE = new Block(FabricBlockSettings.copy(Blocks.GRANITE));
public static final Block GREY_DACITE = new Block(FabricBlockSettings.copy(Blocks.GRANITE));
public static final Block STONE_SAND = new Block(FabricBlockSettings.copy(Blocks.SAND));
public static final Block BOREAL_DIRT = new Block(FabricBlockSettings.copy(Blocks.DIRT));
public static final Block PEARL_DACITE = new Block(FabricBlockSettings.copy(Blocks.GRANITE));
public static final Block LAYERSTONE = new Block(FabricBlockSettings.copy(Blocks.STONE));
    public static final Block GOLD_ORE_LAYERSTONE = new Block(FabricBlockSettings.copy(Blocks.STONE));
    public static final Block PUMICE = new Block(FabricBlockSettings.copy(Blocks.STONE));
    public static final Block GRANODIORITE = new Block(FabricBlockSettings.copy(Blocks.STONE));
public static final PebbleBlock COMPRESSED_STONE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock RHYOLITE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock MARBLE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock DOLOMITE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock LIMESTONE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock LAKE_MISSOULA_CLAYSTONE_SEDIMENT_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock ALKALI_FELDSPAR_GRANITE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock RHYODACITE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock NEPHELINE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock GREY_DACITE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock STONE_SAND_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock PEARL_DACITE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock LAYERSTONE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock GOLD_ORE_LAYERSTONE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock PUMICE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
public static final PebbleBlock GRANODIORITE_PEBBLE = new PebbleBlock(FabricBlockSettings.copy(Blocks.GRANITE));
//Follow the template below if you want to contribute a block, im going to create the BlockItem
public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.copy(Blocks.GRANITE));

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
        Registry.register(Registry.BLOCK, Utils.ID("granodiorite"), GRANODIORITE);
        Registry.register(Registry.BLOCK, Utils.ID("compressed_stone_pebble"), COMPRESSED_STONE_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("rhyolite_pebble"), RHYOLITE_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("marble_pebble"), MARBLE_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("dolomite_pebble"), DOLOMITE_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("limestone_pebble"), LIMESTONE_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("lake_missoula_claystone_sediment_pebble"), LAKE_MISSOULA_CLAYSTONE_SEDIMENT_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("alkali_feldspar_granite_pebble"), ALKALI_FELDSPAR_GRANITE_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("rhyodacite_pebble"), RHYODACITE_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("nepheline_pebble"), NEPHELINE_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("grey_dacite_pebble"), GREY_DACITE_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("stone_sand_pebble"), STONE_SAND_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("layerstone_pebble"), LAYERSTONE_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("pearl_dacite_pebble"), PEARL_DACITE_PEBBLE);   
        Registry.register(Registry.BLOCK, Utils.ID("gold_ore_layerstone_pebble"), GOLD_ORE_LAYERSTONE_PEBBLE);
        Registry.register(Registry.BLOCK,Utils.ID("pumice_pebble"), PUMICE_PEBBLE);
        Registry.register(Registry.BLOCK, Utils.ID("granodiorite_pebble"), GRANODIORITE_PEBBLE);
          //Follow the template below to register an block
        Registry.register(Registry.BLOCK, Utils.ID("example_block"), EXAMPLE_BLOCK);
    }

}
