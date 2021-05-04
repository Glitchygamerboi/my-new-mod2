package net.glitchyystudios.better_underground.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.glitchyystudios.better_underground.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    private BlockRegistry(){}

    public static final Block COMPRESSED_STONE = new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).requiresTool().strength(1.5F, 6.0F));
    public static final Block RHYOLITE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool().strength(1.5F, 6.0F));
    public static final Block MARBLE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool().strength(1.5F, 6.0F));
    public static final Block DOLOMITE = new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).requiresTool().strength(1.5F, 6.0F));
    public static final Block LIMESTONE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool().strength(1.5F, 6.0F));
    public static final Block LAKE_MISSOULA_CLAYSTONE_SEDIMENT = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool().strength(1.5F, 6.0F));
public static final Block ALKALI_FELDSPAR_GRANITE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool().strength(1.5F, 6.0F));
public static final Block RHYODACITE =new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool().strength(1.5F, 6.0F));
public static final Block NEPHELINE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool().strength(1.5F, 6.0F));
public static final Block GREY_DACITE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool().strength(1.5F, 6.0F));
//Follow the template below if you want to contribute a block, im going to create the BlockItem
public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool().strength(0F, 0F));
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
        //Follow the template below to register an item
        Registry.register(Registry.BLOCK, Utils.ID("example_block"), EXAMPLE_BLOCK);
    }

}
