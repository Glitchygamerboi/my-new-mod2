package net.glitchyystudios.better_underground;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {
    public SwordBase(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(ToolMaterialWroughtIron.INSTANCE, 4, -4, settings);
    }


    }

