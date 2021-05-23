package net.glitchyystudios.better_underground;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.glitchyystudios.better_underground.registry.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BUItemGroups {

    public static final ItemGroup REALISTICS_BLOCKS = FabricItemGroupBuilder.create(Utils.ID("realistics_in_pixels_blocks")).icon(() -> new ItemStack(ItemRegistry.GREY_DACITE)).build();
    public static final ItemGroup REALISTICS_WEAPONS = FabricItemGroupBuilder.create(Utils.ID("realistics_in_pixels_weapons")).icon(() -> new ItemStack(ItemRegistry.DOLOMITE)).build();
}
