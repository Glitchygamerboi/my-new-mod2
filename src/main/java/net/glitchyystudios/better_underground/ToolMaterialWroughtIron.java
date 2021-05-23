package net.glitchyystudios.better_underground;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialWroughtIron implements ToolMaterial{

    public static final ToolMaterialWroughtIron INSTANCE = new ToolMaterialWroughtIron();

    public ToolMaterialWroughtIron() {
    }

    @Override
    public int getDurability() {
        return 534;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4;
    }

    @Override
    public float getAttackDamage() {
        return 3;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 4;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }
}
