package net.glitchyystudios.better_underground.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.glitchyystudios.better_underground.Utils;
import net.glitchyystudios.better_underground.registry.BlockRegistry;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class CustomConfiguredFeatures {

    private static ConfiguredFeature<?, ?> ORE_COMPRESSED_STONE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.COMPRESSED_STONE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(79)).spreadHorizontally().repeat(10);
    private static ConfiguredFeature<?, ?> ORE_RHYOLITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.RHYOLITE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(79)).spreadHorizontally().repeat(10);
    private static ConfiguredFeature<?, ?> ORE_MARBLE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.MARBLE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(79)).spreadHorizontally().repeat(10);
    private static ConfiguredFeature<?, ?> ORE_DOLOMITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.DOLOMITE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(79)).spreadHorizontally().repeat(10);
    private static ConfiguredFeature<?, ?> ORE_LIMESTONE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.LIMESTONE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(79)).spreadHorizontally().repeat(10);
    private static ConfiguredFeature<?, ?> ORE_LAKE_MISSOULA_CLAYSTONE_SEDIMENT = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.LAKE_MISSOULA_CLAYSTONE_SEDIMENT.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(79)).spreadHorizontally().repeat(10);
    private static ConfiguredFeature<?, ?> ORE_ALKALI_FELDSPAR_GRANITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.ALKALI_FELDSPAR_GRANITE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(79)).spreadHorizontally().repeat(10);

    public static void register() {
        registerOre("compressed_stone", ORE_COMPRESSED_STONE);
        registerOre("rhyolite", ORE_RHYOLITE);
        registerOre("marble", ORE_MARBLE);
        registerOre("dolomite", ORE_DOLOMITE);
        registerOre("limestone", ORE_LIMESTONE);
        registerOre("lake_missoula_claystone_sediment", ORE_LAKE_MISSOULA_CLAYSTONE_SEDIMENT);
        registerOre("alkali_feldspar_granite", ORE_ALKALI_FELDSPAR_GRANITE);
    }

    private static void registerOre(String id, ConfiguredFeature<?, ?> ORE) {
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, Utils.ID(id));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getValue(), ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }

}
