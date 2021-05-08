package net.glitchyystudios.better_underground.worldgen;

import jdk.nashorn.internal.ir.Block;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.glitchyystudios.better_underground.Utils;
import net.glitchyystudios.better_underground.registry.BlockRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class CustomConfiguredFeatures {

    private static ConfiguredFeature<?, ?> ORE_COMPRESSED_STONE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.COMPRESSED_STONE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(16)).spreadHorizontally().repeat(10);
    private static ConfiguredFeature<?, ?> ORE_RHYOLITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.RHYOLITE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(200)).spreadHorizontally().repeat(16);
    private static ConfiguredFeature<?, ?> ORE_MARBLE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.MARBLE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(200)).spreadHorizontally().repeat(16);
    private static ConfiguredFeature<?, ?> ORE_DOLOMITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.DOLOMITE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(16)).spreadHorizontally().repeat(16);
    private static ConfiguredFeature<?, ?> ORE_LIMESTONE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.LIMESTONE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(200)).spreadHorizontally().repeat(16);
    private static ConfiguredFeature<?, ?> ORE_LAKE_MISSOULA_CLAYSTONE_SEDIMENT = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.LAKE_MISSOULA_CLAYSTONE_SEDIMENT.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(200)).spreadHorizontally().repeat(16);
    private static ConfiguredFeature<?, ?> ORE_ALKALI_FELDSPAR_GRANITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.ALKALI_FELDSPAR_GRANITE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(200)).spreadHorizontally().repeat(16);
    private static ConfiguredFeature<?, ?> ORE_RHYODACITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.RHYODACITE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(200)).spreadHorizontally().repeat(16);
    private static ConfiguredFeature<?, ?> ORE_NEPHELINE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.NEPHELINE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(200)).spreadHorizontally().repeat(16);
    private static ConfiguredFeature<?, ?> ORE_GREY_DACITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.GREY_DACITE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(200)).spreadHorizontally().repeat(16);
    private static ConfiguredFeature<?, ?> ORE_CLAY = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, Blocks.CLAY.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(96)).spreadHorizontally().repeat(16);
    private static ConfiguredFeature<?, ?> ORE_PEGMATITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.PEGMATITE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(200)).spreadHorizontally().repeat(16);
    private static ConfiguredFeature<?, ?> ORE_CLEAN_PEGMATITE = Feature.SCATTERED_ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.CLEAN_PEGMATITE.getDefaultState(), 33)).method_36296(YOffset.fixed(0), YOffset.fixed(200)).spreadHorizontally().repeat(16);

    public static void register() {
        registerOre("compressed_stone", ORE_COMPRESSED_STONE);
        registerOre("rhyolite", ORE_RHYOLITE);
        registerOre("marble", ORE_MARBLE);
        registerOre("dolomite", ORE_DOLOMITE);
        registerOre("limestone", ORE_LIMESTONE);
        registerOre("lake_missoula_claystone_sediment", ORE_LAKE_MISSOULA_CLAYSTONE_SEDIMENT);
        registerOre("alkali_feldspar_granite", ORE_ALKALI_FELDSPAR_GRANITE);
        registerOre("rhyodacite", ORE_RHYODACITE);
        registerOre("nepheline", ORE_NEPHELINE);
        registerOre("grey_dacite", ORE_GREY_DACITE);
        registerOre("clay", ORE_CLAY);
        registerOre("pegmatite", ORE_PEGMATITE);
        registerOre("clean_pegmatite", ORE_CLEAN_PEGMATITE);
    }

    private static void registerOre(String id, ConfiguredFeature<?, ?> ORE) {
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, Utils.ID(id));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getValue(), ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }
}
