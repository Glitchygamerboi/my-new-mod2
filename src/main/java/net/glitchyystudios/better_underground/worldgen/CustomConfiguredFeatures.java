package net.glitchyystudios.better_underground.worldgen;

import net.minecraft.world.gen.decorator.Decorator;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.glitchyystudios.better_underground.Utils;
import net.glitchyystudios.better_underground.registry.BlockRegistry;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;


public class CustomConfiguredFeatures {

    private static ConfiguredFeature<?, ?> ORE_COMPRESSED_STONE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.COMPRESSED_STONE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(15));
    private static ConfiguredFeature<?, ?> ORE_RHYOLITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.RHYOLITE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(32));
    private static ConfiguredFeature<?, ?> ORE_MARBLE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.MARBLE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(19));
    private static ConfiguredFeature<?, ?> ORE_DOLOMITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.DOLOMITE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(16));
    private static ConfiguredFeature<?, ?> ORE_LIMESTONE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.LIMESTONE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(25));
    private static ConfiguredFeature<?, ?> ORE_LAKE_MISSOULA_CLAYSTONE_SEDIMENT = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.LAKE_MISSOULA_CLAYSTONE_SEDIMENT.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(21));
    private static ConfiguredFeature<?, ?> ORE_ALKALI_FELDSPAR_GRANITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.ALKALI_FELDSPAR_GRANITE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(39));
    private static ConfiguredFeature<?, ?> ORE_RHYODACITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.RHYODACITE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(27));
    private static ConfiguredFeature<?, ?> ORE_NEPHELINE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.NEPHELINE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(23));
    private static ConfiguredFeature<?, ?> ORE_GREY_DACITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.GREY_DACITE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(34));
    private static ConfiguredFeature<?, ?> ORE_LAYERSTONE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.LAYERSTONE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(16));
    private static ConfiguredFeature<?, ?> ORE_PEARL_DACITE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.PEARL_DACITE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(29));
    private static ConfiguredFeature<?, ?> SC_ORE_GOLD_ORE_LAYERSTONE =  Feature.SCATTERED_ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.GOLD_ORE_LAYERSTONE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(25)))).spreadHorizontally().repeat(20));
    private static ConfiguredFeature<?, ?> ORE_PUMICE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER, BlockRegistry.PUMICE.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(200)))).spreadHorizontally().repeat(48));
    //use the code below for making a configuredFeature
    private static ConfiguredFeature<?, ?> ORE_STONE_SAND = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegistry.STONE_SAND.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(64))))).spreadHorizontally().repeat(16);

        public static void register() {
            registerOreOvw("compressed_stone", ORE_COMPRESSED_STONE);
            registerOreOvw("rhyolite", ORE_RHYOLITE);
            registerOreOvw("marble", ORE_MARBLE);
            registerOreOvw("dolomite", ORE_DOLOMITE);
            registerOreOvw("limestone", ORE_LIMESTONE);
            registerOreOvw("lake_missoula_claystone_sediment", ORE_LAKE_MISSOULA_CLAYSTONE_SEDIMENT);
            registerOreOvw("alkali_feldspar_granite", ORE_ALKALI_FELDSPAR_GRANITE);
            registerOreOvw("rhyodacite", ORE_RHYODACITE);
            registerOreOvw("nepheline", ORE_NEPHELINE);
            registerOreOvw("grey_dacite", ORE_GREY_DACITE);
            registerOreOvw("layerstone", ORE_LAYERSTONE);
            registerOreOvw("pearl_dacite", ORE_PEARL_DACITE);
            registerOreOvw("gold_ore_layerstone", SC_ORE_GOLD_ORE_LAYERSTONE);
            registerOreNthr("pumice", ORE_PUMICE);
            //use the code below to register a ConfiguredFeature, for using configured features in another mod, see https://fabricmc.net/wiki/tutorial:ores and look below @Override
            registerOreOvw("stone_sand", ORE_STONE_SAND);


        }

        private static void registerOreOvw(String id, ConfiguredFeature<?, ?> ORE) {
            RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, Utils.ID(id));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getValue(), ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ore);


        }

    private static void registerOreNthr(String id, ConfiguredFeature<?, ?> ORE) {
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, Utils.ID(id));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getValue(), ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }
    }
