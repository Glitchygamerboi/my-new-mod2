package net.glitchyystudios.better_underground;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.glitchyystudios.better_underground.registry.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BUItemGroups {

    public static final ItemGroup REALISTICS_GEOLOGICAL_BLOCKS = FabricItemGroupBuilder.create(Utils.ID("realistics_geological_blocks")).icon(() -> new ItemStack(ItemRegistry.GREY_DACITE)).build();
    public static final ItemGroup REALISTICS_NATURE_BLOCKS = FabricItemGroupBuilder.create(Utils.ID("realistics_nature_blocks")).icon(() -> new ItemStack(ItemRegistry.PINE_LOG)).build();
}
