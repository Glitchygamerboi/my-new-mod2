package net.glitchyystudios.better_underground.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.glitchyystudios.better_underground.Utils;
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

    public static void register() {
        Registry.register(Registry.BLOCK, Utils.ID("compressed_stone"), COMPRESSED_STONE);
        Registry.register(Registry.BLOCK, Utils.ID("rhyolite"), RHYOLITE);
        Registry.register(Registry.BLOCK, Utils.ID("marble"), MARBLE);
        Registry.register(Registry.BLOCK, Utils.ID("dolomite"), DOLOMITE);
        Registry.register(Registry.BLOCK, Utils.ID("limestone"), LIMESTONE);
        Registry.register(Registry.BLOCK, Utils.ID("lake_missoula_claystone_sediment"), LAKE_MISSOULA_CLAYSTONE_SEDIMENT);
    }

}
