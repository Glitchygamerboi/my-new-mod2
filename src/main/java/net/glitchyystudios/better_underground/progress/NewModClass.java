package net.glitchyystudios.better_underground.progress;
		import net.fabricmc.api.ModInitializer;
		import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
		import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
		import net.minecraft.block.Block;
		import net.minecraft.block.Blocks;
		import net.minecraft.block.Material;
		import net.minecraft.item.BlockItem;
		import net.minecraft.item.ItemGroup;
		import net.minecraft.util.Identifier;
		import net.minecraft.util.registry.Registry;
		import net.minecraft.world.gen.feature.DefaultFeatureConfig;
		import net.minecraft.world.gen.feature.util.FeatureContext;
		import org.lwjgl.system.CallbackI;

public class NewModClass implements ModInitializer {
	public static final Block compressed_stone = new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE));
	public static final Block rhyolite = new Block(FabricBlockSettings.copy(Blocks.GRANITE));
	public static final Block marble = new Block(FabricBlockSettings.copy(Blocks.GRANITE));
public static final Block dolomite = new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE));
public static final Block limestone = new Block(FabricBlockSettings.copy(Blocks.GRANITE));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("better_underground", "compressed_stone"), compressed_stone);
		Registry.register(Registry.BLOCK, new Identifier("better_underground", "rhyolite"), rhyolite);
		Registry.register(Registry.BLOCK, new Identifier("better_underground", "marble"), marble);
		Registry.register(Registry.ITEM, new Identifier("better_underground", "compressed_stone"),new BlockItem(compressed_stone, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("better_underground", "rhyolite"), new BlockItem(rhyolite, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("better_underground", "marble"), new BlockItem(marble, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
Registry.register(Registry.BLOCK, new Identifier("better_underground", "dolomite"), dolomite);
Registry.register(Registry.ITEM, new Identifier("better_underground", "dolomite"), new BlockItem(dolomite, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
Registry.register(Registry.BLOCK, new Identifier("better_underground", "limestone"), limestone);
		Registry.register(Registry.ITEM, new Identifier("better_underground", "limestone"), new BlockItem(limestone, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));


	}

}