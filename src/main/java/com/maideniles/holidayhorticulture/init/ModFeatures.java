package com.maideniles.holidayhorticulture.init;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BushFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;

import java.util.OptionalInt;

public class ModFeatures {

//PLANTS//
    public static final ConfiguredFeature<RandomPatchConfiguration, ?> CHRISTMAS_CACTUS_CONFIG = FeatureUtils.register("christmas_cactus_config",
            Feature.FLOWER.configured(new RandomPatchConfiguration(3, 3, 1, () -> {
        return Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHRISTMAS_CACTUS.get())))
                .placed(PlacementUtils.countExtra(0, 0.05F , 1), InSquarePlacement.spread(),  PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.CACTUS.defaultBlockState(), BlockPos.ZERO)));
    })));

    public static final ConfiguredFeature<RandomPatchConfiguration, ?> POINSETTIA_CONFIG = FeatureUtils.register("poinsettia_config",
            Feature.FLOWER.configured(new RandomPatchConfiguration(1, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.POINSETTIA_PLANT.get())))
                        .placed(PlacementUtils.countExtra(1, 0.05F , 1), InSquarePlacement.spread(),  PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.DANDELION.defaultBlockState(), BlockPos.ZERO)));
            })));

    public static final ConfiguredFeature<RandomPatchConfiguration, ?> POINSETTIA_WHITE_CONFIG = FeatureUtils.register("poinsettia_white_config",
            Feature.FLOWER.configured(new RandomPatchConfiguration(1, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.POINSETTIA_PLANT_WHITE.get())))
                        .placed(PlacementUtils.countExtra(1, 0.05F , 1), InSquarePlacement.spread(),  PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.DANDELION.defaultBlockState(), BlockPos.ZERO)));
            })));

    public static final ConfiguredFeature<RandomPatchConfiguration, ?> CHRISTMAS_ROSE_CONFIG = FeatureUtils.register("christmas_rose_config",
            Feature.FLOWER.configured(new RandomPatchConfiguration(1, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHRISTMAS_ROSE.get())))
                        .placed(PlacementUtils.countExtra(1, 0.05F , 1), InSquarePlacement.spread(),  PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.DANDELION.defaultBlockState(), BlockPos.ZERO)));
            })));

    public static final ConfiguredFeature<RandomPatchConfiguration, ?> AMARYLLIS_CONFIG = FeatureUtils.register("amaryllis_config",
            Feature.FLOWER.configured(new RandomPatchConfiguration(1, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.AMARYLLIS.get())))
                        .placed(PlacementUtils.countExtra(1, 0.05F , 1), InSquarePlacement.spread(),  PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.DANDELION.defaultBlockState(), BlockPos.ZERO)));
            })));

    public static final ConfiguredFeature<RandomPatchConfiguration, ?> WINTERGREEN_CONFIG = FeatureUtils.register("wintergreen_config",
            Feature.FLOWER.configured(new RandomPatchConfiguration(1, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WINTERGREEN.get())))
                        .placed(PlacementUtils.countExtra(1, 0.05F , 1), InSquarePlacement.spread(),  PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.DANDELION.defaultBlockState(), BlockPos.ZERO)));
            })));


    public static final ConfiguredFeature<RandomPatchConfiguration, ?> CAMELLIA_CONFIG = FeatureUtils.register("camellia_config",
            Feature.FLOWER.configured(new RandomPatchConfiguration(1, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.YULETIDE_CAMELLIA.get())))
                        .placed(PlacementUtils.countExtra(1, 0.05F , 1), InSquarePlacement.spread(),  PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.DANDELION.defaultBlockState(), BlockPos.ZERO)));
            })));

    public static final ConfiguredFeature<RandomPatchConfiguration, ?> WINTERBERRY_CONFIG = FeatureUtils.register("winterberry_config",
            Feature.FLOWER.configured(new RandomPatchConfiguration(1, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WINTERBERRY.get())))
                        .placed(PlacementUtils.countExtra(1, 0.05F , 1), InSquarePlacement.spread(),  PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.DANDELION.defaultBlockState(), BlockPos.ZERO)));
            })));

    public static final ConfiguredFeature<RandomPatchConfiguration, ?> SNOWDROP_CONFIG = FeatureUtils.register("snowdrop_config",
            Feature.FLOWER.configured(new RandomPatchConfiguration(1, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SNOWDROP.get())))
                        .placed(PlacementUtils.countExtra(1, 0.05F , 1), InSquarePlacement.spread(),  PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.DANDELION.defaultBlockState(), BlockPos.ZERO)));
            })));

    public static final ConfiguredFeature<RandomPatchConfiguration, ?> PAPERWHITE_CONFIG = FeatureUtils.register("paperwhite_config",
            Feature.FLOWER.configured(new RandomPatchConfiguration(1, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PAPERWHITE.get())))
                        .placed(PlacementUtils.countExtra(1, 0.05F , 1), InSquarePlacement.spread(),  PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.DANDELION.defaultBlockState(), BlockPos.ZERO)));
            })));


//TREES AND BUSHES//

   public static final ConfiguredFeature<TreeConfiguration, ?> YEW_CONFIG = FeatureUtils.register("yew_config", Feature.TREE.configured(
            (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.SPRUCE_LOG),
                    new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.simple(ModBlocks.YEW_LEAVES.get()),
                    new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2),
                            UniformInt.of(1, 2)), new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build()));
   public static final ConfiguredFeature<TreeConfiguration, ?> POINSETTIA_BUSH_CONFIG = FeatureUtils.register("poinsettia_bush_config",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.JUNGLE_LOG),
                    new StraightTrunkPlacer(1, 0, 0), BlockStateProvider.simple(ModBlocks.POINSETTIA_LEAVES.get()),
                    new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                    new TwoLayersFeatureSize(0, 0, 0))).build()));

    public static final ConfiguredFeature<TreeConfiguration, ?> POINSETTIA_WHITE_BUSH_CONFIG = FeatureUtils.register("poinsettia_white_bush_config",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.JUNGLE_LOG),
                    new StraightTrunkPlacer(1, 0, 0), BlockStateProvider.simple(ModBlocks.POINSETTIA_WHITE_LEAVES.get()),
                    new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                    new TwoLayersFeatureSize(0, 0, 0))).build()));

    public static final ConfiguredFeature<TreeConfiguration, ?> MISTLETOE_OAK_CONFIG = FeatureUtils.register("mistletoe_oak_config",
            Feature.TREE.configured(createMistletoeOak().build()));

    public static final ConfiguredFeature<TreeConfiguration, ?> MISTLETOE_BIRCH_CONFIG = FeatureUtils.register("mistletoe_birch_config",
            Feature.TREE.configured(createMistletoeBirch().build()));



    private static <FC extends FeatureConfiguration>ConfiguredFeature<FC, ?> register(String name,
                                                                                      ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name, configuredFeature);
    }

    private static TreeConfiguration.TreeConfigurationBuilder createMistletoeOak() {
        return (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG),
                new FancyTrunkPlacer(3, 11, 0), new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
              .add(ModBlocks.MISTLETOE_OAK_LEAVES.get().defaultBlockState(), 1).add(Blocks.OAK_LEAVES.defaultBlockState(),3)),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
    }
    private static TreeConfiguration.TreeConfigurationBuilder createMistletoeBirch() {
        return (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.BIRCH_LOG),
                new FancyTrunkPlacer(3, 11, 0), new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                .add(ModBlocks.MISTLETOE_BIRCH_LEAVES.get().defaultBlockState(), 1).add(Blocks.BIRCH_LEAVES.defaultBlockState(),3)),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
    }

}
