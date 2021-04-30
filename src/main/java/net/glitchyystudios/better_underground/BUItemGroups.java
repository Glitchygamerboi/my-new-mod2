package net.glitchyystudios.better_underground;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.glitchyystudios.better_underground.registry.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BUItemGroups {

    public static final ItemGroup BETTER_UNDERGROUND = FabricItemGroupBuilder.create(Utils.ID("better_underground")).icon(() -> new ItemStack(ItemRegistry.COMPRESSED_STONE)).build();

}
