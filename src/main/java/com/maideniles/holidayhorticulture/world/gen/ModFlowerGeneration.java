package com.maideniles.holidayhorticulture.world.gen;

import com.maideniles.holidayhorticulture.init.ModPlacements;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.Set;


public class ModFlowerGeneration {


    public static void generateFlowers(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);


   //HOT  OR WARM BIOMES//

        if (event.getCategory() == Biome.BiomeCategory.DESERT ||event.getCategory() == Biome.BiomeCategory.MESA ) {
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.CHRISTMAS_CACTUS_PLACEMENT);

        }

        if (event.getCategory() == Biome.BiomeCategory.SAVANNA ||event.getCategory() == Biome.BiomeCategory.MESA  ) {
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.AMARYLLIS_PLACEMENT);

        }

        if (event.getCategory() == Biome.BiomeCategory.SAVANNA || event.getCategory()== Biome.BiomeCategory.JUNGLE
                || event.getCategory()== Biome.BiomeCategory.BEACH || event.getCategory() == Biome.BiomeCategory.MESA) {
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.PAPERWHITE_PLACEMENT);

        }

        if (event.getCategory() == Biome.BiomeCategory.JUNGLE || event.getCategory() == Biome.BiomeCategory.SAVANNA) {
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.POINSETTIA_BUSH_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.POINSETTIA_WHITE_BUSH_PLACEMENT);
        }

     //MILD OR WARM BIOMES//
        if (event.getCategory() == Biome.BiomeCategory.PLAINS || event.getCategory()== Biome.BiomeCategory.FOREST) {
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.CAMELLIA_PLACEMENT);

        }

        if (event.getCategory()== Biome.BiomeCategory.FOREST) {
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.MISTLETOE_OAK_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.MISTLETOE_BIRCH_PLACEMENT);

        }



//COOL, COLD OR ICY BIOMES//
        if (event.getCategory() == Biome.BiomeCategory.MOUNTAIN || event.getCategory()== Biome.BiomeCategory.ICY
                || event.getCategory()==Biome.BiomeCategory.EXTREME_HILLS) {
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.CHRISTMAS_ROSE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.WINTERBERRY_PLACEMENT);

        }

        if (event.getCategory() == Biome.BiomeCategory.MOUNTAIN || event.getCategory()== Biome.BiomeCategory.ICY
                || event.getCategory()==Biome.BiomeCategory.EXTREME_HILLS || event.getCategory()==Biome.BiomeCategory.TAIGA) {
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.WINTERGREEN_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.SNOWDROP_PLACEMENT);

        }


       if (event.getCategory() == Biome.BiomeCategory.TAIGA || event.getCategory()== Biome.BiomeCategory.MOUNTAIN
       || event.getCategory()== Biome.BiomeCategory.ICY) {
           event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.YEW_PLACEMENT);

        }

    }

}