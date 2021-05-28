package net.glitchyystudios.better_underground.worldgen;

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.glitchyystudios.better_underground.Utils;
import net.glitchyystudios.better_underground.registry.BlockRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class biome {
    private static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> RWASTES_SURFACE_BUILDER = SurfaceBuilder.DEFAULT.withConfig(new TernarySurfaceConfig(BlockRegistry.RHYOLITE.getDefaultState(), BlockRegistry.RHYODACITE.getDefaultState(), BlockRegistry.NEPHELINE.getDefaultState()));private static final Biome RWASTES = createRwastes();private static Biome createRwastes() {// We specify what entities spawn and what features generate in the biome// Aside from some structures, trees, rocks, plants and//   custom entities, these are mostly the same for each biome.// Vanilla configured features for biomes are defined in DefaultBiomeFeatures
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();DefaultBiomeFeatures.addFarmAnimals(spawnSettings);DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();generationSettings.surfaceBuilder(RWASTES_SURFACE_BUILDER);DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);DefaultBiomeFeatures.addLandCarvers(generationSettings);DefaultBiomeFeatures.addDefaultLakes(generationSettings);DefaultBiomeFeatures.addDungeons(generationSettings);DefaultBiomeFeatures.addMineables(generationSettings);DefaultBiomeFeatures.addDefaultOres(generationSettings);DefaultBiomeFeatures.addDefaultDisks(generationSettings);DefaultBiomeFeatures.addSprings(generationSettings);DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);return (new Biome.Builder()).precipitation(Biome.Precipitation.RAIN).category(Biome.Category.NONE).depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.4F).effects((new BiomeEffects.Builder()).waterColor(0x3f76e4).waterFogColor(0x050533).fogColor(0xc0d8ff).skyColor(0x77adff).build()).spawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }


    public static final RegistryKey<Biome> RWASTES_KEY = RegistryKey.of(Registry.BIOME_KEY, Utils.ID("rwastes_key"));

    public static void register() {
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, Utils.ID("rhyolite_wastes"), RWASTES_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, RWASTES_KEY.getValue(), RWASTES);
        OverworldBiomes.addContinentalBiome(RWASTES_KEY, OverworldClimate.COOL, 50);
        OverworldBiomes.addContinentalBiome(RWASTES_KEY, OverworldClimate.SNOWY, 50);
    }
}

