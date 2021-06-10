package net.glitchyystudios.better_underground.worldgen;

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.glitchyystudios.better_underground.Utils;
import net.glitchyystudios.better_underground.registry.BlockRegistry;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class biome {
    private static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> BOREAL_SURFACE_BUILDER = SurfaceBuilder.DEFAULT.withConfig(new TernarySurfaceConfig(BlockRegistry.BOREAL_DIRT.getDefaultState(), BlockRegistry.RHYODACITE.getDefaultState(), BlockRegistry.NEPHELINE.getDefaultState()));private static final Biome BOREAL = createBoreal();private static Biome createBoreal() {// We specify what entities spawn and what features generate in the biome// Aside from some structures, trees, rocks, plants and//   custom entities, these are mostly the same for each biome.// Vanilla configured features for biomes are defined in DefaultBiomeFeatures
        
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();DefaultBiomeFeatures.addFarmAnimals(spawnSettings);DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(BOREAL_SURFACE_BUILDER);DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);DefaultBiomeFeatures.addLandCarvers(generationSettings);DefaultBiomeFeatures.addDefaultLakes(generationSettings); DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings); DefaultBiomeFeatures.addDefaultOres(generationSettings); DefaultBiomeFeatures.addDefaultDisks(generationSettings); DefaultBiomeFeatures.addSprings(generationSettings);DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        DefaultBiomeFeatures.addTaigaTrees(generationSettings);DefaultBiomeFeatures.addMossyRocks(generationSettings);
        return (new Biome.Builder()).precipitation(Biome.Precipitation.RAIN).category(Biome.Category.NONE).depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.4F).effects((new BiomeEffects.Builder()).waterColor(0x3f76e4).waterFogColor(0x050533).fogColor(0xc0d8ff).skyColor(0x77adff).build()).spawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }
     
    private static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> CSHIELD_SBUILDER = SurfaceBuilder.MOUNTAIN.withConfig(new TernarySurfaceConfig(BlockRegistry.BOREAL_DIRT.getDefaultState(), BlockRegistry.PEARL_DACITE.getDefaultState(), BlockRegistry.PEARL_DACITE.getDefaultState()));private static final Biome CSHIELD = createShield();private static Biome createShield() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();DefaultBiomeFeatures.addFarmAnimals(spawnSettings);DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(CSHIELD_SBUILDER);DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);DefaultBiomeFeatures.addLandCarvers(generationSettings);DefaultBiomeFeatures.addDefaultLakes(generationSettings); DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings); DefaultBiomeFeatures.addDefaultOres(generationSettings); DefaultBiomeFeatures.addDefaultDisks(generationSettings); DefaultBiomeFeatures.addSprings(generationSettings);DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        DefaultBiomeFeatures.addTaigaTrees(generationSettings);DefaultBiomeFeatures.addMossyRocks(generationSettings);
        return (new Biome.Builder()).precipitation(Biome.Precipitation.RAIN).category(Biome.Category.NONE).depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.4F).effects((new BiomeEffects.Builder()).waterColor(0x3f76e4).waterFogColor(0x050533).fogColor(0xc0d8ff).skyColor(0x77adff).build()).spawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }



    public static final RegistryKey<Biome> BOREAL_KEY = RegistryKey.of(Registry.BIOME_KEY, Utils.ID("boreal_plain"));
    public static final RegistryKey<Biome> CSHIELD_KEY = RegistryKey.of(Registry.BIOME_KEY, Utils.ID("canadian_shield"));

    public static void register() {
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, Utils.ID("boreal_plain"), BOREAL_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, BOREAL_KEY.getValue(), BOREAL);
        OverworldBiomes.addContinentalBiome(BOREAL_KEY, OverworldClimate.COOL, 50);
        OverworldBiomes.addContinentalBiome(BOREAL_KEY, OverworldClimate.SNOWY, 50);

        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, Utils.ID("canadian_shield"), CSHIELD_SBUILDER);
        Registry.register(BuiltinRegistries.BIOME, CSHIELD_KEY.getValue(), CSHIELD);
        OverworldBiomes.addContinentalBiome(CSHIELD_KEY, OverworldClimate.COOL, 50);
        OverworldBiomes.addContinentalBiome(CSHIELD_KEY, OverworldClimate.SNOWY, 50);
    }
}

