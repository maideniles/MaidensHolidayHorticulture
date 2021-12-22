package com.maideniles.holidayhorticulture.init;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;


public class ModPlacements {

 //   public static final PlacedFeature WILLOW_TREE = PlacementUtils.register("willow_tree_placement", ModFeatures.WILLOW.placed(worldSurfaceSquaredWithCount(2)));
 //   public static final PlacedFeature FLOWERING_LILYPAD = PlacementUtils.register("lily_pad_placement", ModFeatures.LILY_PAD_CONFIG.placed(worldSurfaceSquaredWithCount(4)));
    public static final PlacedFeature CHRISTMAS_CACTUS_PLACEMENT = PlacementUtils.register("christmas_cactus_placement", ModFeatures.CHRISTMAS_CACTUS_CONFIG.placed());

    public static final PlacedFeature POINSETTIA_PLACEMENT = PlacementUtils.register("poinsettia_placement", ModFeatures.POINSETTIA_CONFIG.placed());
    public static final PlacedFeature POINSETTIA_WHITE_PLACEMENT = PlacementUtils.register("poinsettia_white_placement", ModFeatures.POINSETTIA_WHITE_CONFIG.placed());
    public static final PlacedFeature CHRISTMAS_ROSE_PLACEMENT = PlacementUtils.register("christmas_rose_placement", ModFeatures.CHRISTMAS_ROSE_CONFIG.placed());
    public static final PlacedFeature AMARYLLIS_PLACEMENT = PlacementUtils.register("amaryllis_placement", ModFeatures.AMARYLLIS_CONFIG.placed());
    public static final PlacedFeature WINTERGREEN_PLACEMENT = PlacementUtils.register("wintergreen_placement", ModFeatures.WINTERGREEN_CONFIG.placed());
    public static final PlacedFeature CAMELLIA_PLACEMENT = PlacementUtils.register("camellia_placement", ModFeatures.CAMELLIA_CONFIG.placed());
    public static final PlacedFeature WINTERBERRY_PLACEMENT = PlacementUtils.register("winterberry_placement", ModFeatures.WINTERBERRY_CONFIG.placed());
    public static final PlacedFeature SNOWDROP_PLACEMENT = PlacementUtils.register("snowdrop_placement", ModFeatures.SNOWDROP_CONFIG.placed());
    public static final PlacedFeature PAPERWHITE_PLACEMENT = PlacementUtils.register("paperwhite_placement", ModFeatures.PAPERWHITE_CONFIG.placed());


    public static final PlacedFeature YEW_PLACEMENT = PlacementUtils.register("yew_placement", ModFeatures.YEW_CONFIG.placed(PlacementUtils.countExtra(0, 0.05F, 1), InSquarePlacement.spread(),VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome()));
    public static final PlacedFeature POINSETTIA_BUSH_PLACEMENT = PlacementUtils.register("poinsettia_bush_placement", ModFeatures.POINSETTIA_BUSH_CONFIG.placed(PlacementUtils.countExtra(0, 0.01F, 1), InSquarePlacement.spread(),VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome()));
    public static final PlacedFeature POINSETTIA_WHITE_BUSH_PLACEMENT = PlacementUtils.register("poinsettia_white_bush_placement", ModFeatures.POINSETTIA_WHITE_BUSH_CONFIG.placed(PlacementUtils.countExtra(0, 0.01F, 1), InSquarePlacement.spread(),VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome()));

   public static final PlacedFeature MISTLETOE_OAK_PLACEMENT = PlacementUtils.register("mistletoe_oak_placement", ModFeatures.MISTLETOE_OAK_CONFIG.placed(PlacementUtils.countExtra(0, 0.01F, 1), InSquarePlacement.spread(),VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome()));

   public static final PlacedFeature MISTLETOE_BIRCH_PLACEMENT = PlacementUtils.register("mistletoe_birch_placement", ModFeatures.MISTLETOE_BIRCH_CONFIG.placed(PlacementUtils.countExtra(0, 0.01F, 1), InSquarePlacement.spread(),VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome()));



   public static List<PlacementModifier> treePlacement(PlacementModifier p_195482_, Block p_195483_) {
        return treePlacementBase(p_195482_).add(BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(p_195483_.defaultBlockState(), BlockPos.ZERO))).build();
    }

    private static ImmutableList.Builder<PlacementModifier> treePlacementBase(PlacementModifier p_195485_) {
        return ImmutableList.<PlacementModifier>builder().add(p_195485_).add(InSquarePlacement.spread()).add(VegetationPlacements.TREE_THRESHOLD).add(PlacementUtils.HEIGHTMAP_OCEAN_FLOOR).add(BiomeFilter.biome());
    }

}
