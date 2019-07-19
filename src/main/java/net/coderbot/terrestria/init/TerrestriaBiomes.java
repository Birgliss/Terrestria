package net.coderbot.terrestria.init;

import io.github.terraformersmc.terraform.biomeapi.OverworldBiomesExt;
import net.coderbot.terrestria.Terrestria;
import net.coderbot.terrestria.biome.TerrestriaBiome;
import net.fabricmc.fabric.api.biomes.v1.FabricBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.DecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MineshaftFeature;
import net.minecraft.world.gen.feature.MineshaftFeatureConfig;
import net.minecraft.world.gen.feature.OceanRuinFeature;
import net.minecraft.world.gen.feature.OceanRuinFeatureConfig;
import net.minecraft.world.gen.feature.SeagrassFeatureConfig;
import net.minecraft.world.gen.feature.ShipwreckFeatureConfig;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

import java.util.function.Consumer;

import static net.coderbot.terrestria.biome.TerrestriaBiome.DefaultFeature.*;

// This class exports public biome constants, these fields have to be public
@SuppressWarnings("WeakerAccess")
public class TerrestriaBiomes {
	public static Biome REDWOOD_FOREST;
	public static Biome REDWOOD_FOREST_EDGE;
	public static Biome REDWOOD_CLEARING;
	public static Biome LUSH_REDWOOD_FOREST;
	public static Biome LUSH_REDWOOD_FOREST_EDGE;
	public static Biome LUSH_REDWOOD_CLEARING;
	public static Biome HEMLOCK_RAINFOREST;
	public static Biome HEMLOCK_CLEARING;
	public static Biome SNOWY_HEMLOCK_FOREST;
	public static Biome SNOWY_HEMLOCK_CLEARING;
	public static Biome ALPINE;
	public static Biome CYPRESS_FOREST;
	public static Biome WOODED_CYPRESS_HILLS;
	public static Biome SAKURA_FOREST;
	public static Biome WOODED_SAKURA_HILLS;
	public static Biome JAPANESE_MAPLE_FOREST;
	public static Biome WOODED_JAPANESE_MAPLE_HILLS;
	public static Biome DENSE_WOODLANDS;
	public static Biome DENSE_WOODLANDS_EDGE;
	public static Biome RAINBOW_RAINFOREST;
	public static Biome RAINBOW_RAINFOREST_MOUNTAINS;
	public static Biome RAINBOW_RAINFOREST_LAKE;
	public static Biome CYPRESS_SWAMP;
	public static Biome CALDERA;
	public static Biome CALDERA_RIDGE;
	public static Biome CALDERA_BEACH;
	public static Biome VOLCANIC_ISLAND;
	public static Biome VOLCANIC_ISLAND_BEACH;
	public static Biome VOLCANIC_ISLAND_SHORE;
	public static Biome ALPS;
	public static Biome TROPICAL_REEF;
	public static Biome TROPICAL_REEF_EDGE;
	public static Biome TROPICAL_ISLAND;
	public static Biome TROPICAL_ISLAND_COAST;

	public static void init() {

		REDWOOD_FOREST = register("redwood_forest", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.GIANT_TREE_TAIGA, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.TAIGA)
				.depth(1.2F)
				.scale(0.3F)
				.temperature(0.9F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, LARGE_FERNS, MINEABLES, ORES, DISKS,
						TAIGA_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, SWEET_BERRY_BUSHES_SNOWY,
						FROZEN_TOP_LAYER)
				.addTreeFeature(TerrestriaFeatures.MEGA_REDWOOD_TREE, 7)
				.addTreeFeature(TerrestriaFeatures.FALLEN_REDWOOD_LOG, 3)
				.addRareTreeFeature(TerrestriaFeatures.TINY_REDWOOD_TREE, 1)
				.addGrassFeature(Blocks.FERN.getDefaultState(), 4)
				.addDoubleGrassFeature(Blocks.LARGE_FERN.getDefaultState(), 7)
				.addDoubleGrassFeature(Blocks.TALL_GRASS.getDefaultState(), 7)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 8, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 4, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.FOX, 8, 2, 4))
				.build());

		REDWOOD_FOREST_EDGE = register("redwood_forest_edge", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.GIANT_TREE_TAIGA, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.TAIGA)
				.depth(0.5F)
				.scale(0.3F)
				.temperature(0.9F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, LARGE_FERNS, MINEABLES, ORES, DISKS,
						TAIGA_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, SWEET_BERRY_BUSHES_SNOWY,
						FROZEN_TOP_LAYER)
				.addTreeFeature(TerrestriaFeatures.REDWOOD_TREE, 3)
				.addTreeFeature(TerrestriaFeatures.TINY_REDWOOD_TREE, 2)
				.addDoubleGrassFeature(Blocks.LARGE_FERN.getDefaultState(), 4)
				.addDoubleGrassFeature(Blocks.TALL_GRASS.getDefaultState(), 4)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 8, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 4, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.FOX, 8, 2, 4))
				.build());

		REDWOOD_CLEARING = register("redwood_clearing", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.GIANT_TREE_TAIGA, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.TAIGA)
				.depth(1.2F)
				.scale(0.3F)
				.temperature(0.9F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, LARGE_FERNS, MINEABLES, ORES, DISKS,
						TAIGA_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, SWEET_BERRY_BUSHES_SNOWY,
						FROZEN_TOP_LAYER)
				.addTreeFeature(TerrestriaFeatures.FALLEN_REDWOOD_LOG, 2)
				.addTreeFeature(TerrestriaFeatures.TINY_REDWOOD_TREE, 2)
				.addDoubleGrassFeature(Blocks.LARGE_FERN.getDefaultState(), 4)
				.addDoubleGrassFeature(Blocks.TALL_GRASS.getDefaultState(), 4)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 8, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 4, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.FOX, 8, 2, 4))
				.build());

		LUSH_REDWOOD_FOREST = register("lush_redwood_forest", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.TAIGA)
				.depth(1.2F)
				.scale(0.3F)
				.temperature(0.9F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, LARGE_FERNS, MINEABLES, ORES, DISKS,
						TAIGA_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, SWEET_BERRY_BUSHES_SNOWY,
						FROZEN_TOP_LAYER, DEFAULT_FLOWERS)
				.addTreeFeature(TerrestriaFeatures.HEMLOCK_TREE, 4)
				.addTreeFeature(TerrestriaFeatures.MEGA_REDWOOD_TREE, 4)
				.addTreeFeature(TerrestriaFeatures.FALLEN_REDWOOD_LOG, 2)
				.addTreeFeature(TerrestriaFeatures.FALLEN_HEMLOCK_LOG, 2)
				.addTreeFeature(TerrestriaFeatures.TINY_REDWOOD_TREE, 2)
				.addTreeFeature(TerrestriaFeatures.TINY_HEMLOCK_TREE, 2)
				.addGrassFeature(Blocks.GRASS.getDefaultState(), 4)
				.addGrassFeature(Blocks.FERN.getDefaultState(), 12)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 8, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 4, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.FOX, 8, 2, 4))
				.build());

		LUSH_REDWOOD_FOREST_EDGE = register("lush_redwood_forest_edge", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.TAIGA)
				.depth(1.2F)
				.scale(0.3F)
				.temperature(0.9F)
				.downfall(1.4F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, LARGE_FERNS, MINEABLES, ORES, DISKS,
						TAIGA_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, SWEET_BERRY_BUSHES_SNOWY,
						FROZEN_TOP_LAYER, DEFAULT_FLOWERS)
				.addTreeFeature(TerrestriaFeatures.HEMLOCK_TREE, 1)
				.addTreeFeature(TerrestriaFeatures.REDWOOD_TREE, 2)
				.addTreeFeature(TerrestriaFeatures.TINY_REDWOOD_TREE, 1)
				.addTreeFeature(TerrestriaFeatures.TINY_HEMLOCK_TREE, 2)
				.addGrassFeature(Blocks.GRASS.getDefaultState(), 4)
				.addGrassFeature(Blocks.FERN.getDefaultState(), 12)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 8, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 4, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.FOX, 8, 2, 4))
				.build());

		LUSH_REDWOOD_CLEARING = register("lush_redwood_clearing", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.TAIGA)
				.depth(1.2F)
				.scale(0.3F)
				.temperature(0.9F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, LARGE_FERNS, MINEABLES, ORES, DISKS,
						TAIGA_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, SWEET_BERRY_BUSHES_SNOWY,
						FROZEN_TOP_LAYER, DEFAULT_FLOWERS)
				.addTreeFeature(TerrestriaFeatures.FALLEN_REDWOOD_LOG, 1)
				.addTreeFeature(TerrestriaFeatures.FALLEN_HEMLOCK_LOG, 1)
				.addTreeFeature(TerrestriaFeatures.TINY_REDWOOD_TREE, 2)
				.addTreeFeature(TerrestriaFeatures.TINY_HEMLOCK_TREE, 2)
				.addGrassFeature(Blocks.GRASS.getDefaultState(), 4)
				.addGrassFeature(Blocks.FERN.getDefaultState(), 12)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 8, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 4, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.FOX, 8, 2, 4))
				.build());

		HEMLOCK_RAINFOREST = register("hemlock_rainforest", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.TAIGA)
				.depth(0.95F)
				.scale(0.55F)
				.temperature(0.6F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, LARGE_FERNS, MINEABLES, ORES, DISKS,
						TAIGA_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, SWEET_BERRY_BUSHES_SNOWY, FROZEN_TOP_LAYER)
				.addTreeFeature(TerrestriaFeatures.MEGA_HEMLOCK_TREE, 8)
				.addTreeFeature(TerrestriaFeatures.HEMLOCK_TREE, 8)
				.addTreeFeature(TerrestriaFeatures.FALLEN_HEMLOCK_LOG, 4)
				.addTreeFeature(TerrestriaFeatures.TINY_HEMLOCK_TREE, 1)
				.addGrassFeature(Blocks.GRASS.getDefaultState(), 4)
				.addGrassFeature(Blocks.FERN.getDefaultState(), 12)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 8, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 4, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.FOX, 8, 2, 4))
				.build());

		HEMLOCK_CLEARING = register("hemlock_clearing", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.TAIGA)
				.depth(0.95F)
				.scale(0.2F)
				.temperature(0.6F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, LARGE_FERNS, MINEABLES, ORES, DISKS,
						TAIGA_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, SWEET_BERRY_BUSHES_SNOWY, FROZEN_TOP_LAYER)
				.addTreeFeature(TerrestriaFeatures.HEMLOCK_TREE, 1)
				.addTreeFeature(TerrestriaFeatures.TINY_HEMLOCK_TREE, 1)
				.addTreeFeature(TerrestriaFeatures.FALLEN_HEMLOCK_LOG, 2)
				.addGrassFeature(Blocks.GRASS.getDefaultState(), 4)
				.addGrassFeature(Blocks.FERN.getDefaultState(), 12)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 8, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 4, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.FOX, 8, 2, 4))
				.build());

		SNOWY_HEMLOCK_FOREST = register("snowy_hemlock_forest", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.SNOW).category(Biome.Category.TAIGA)
				.depth(0.95F)
				.scale(0.55F)
				.temperature(-0.5F)
				.downfall(1.0F)
				.waterColor(4020182)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, LARGE_FERNS, MINEABLES, ORES, DISKS,
						TAIGA_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, SWEET_BERRY_BUSHES_SNOWY, FROZEN_TOP_LAYER)
				.addTreeFeature(TerrestriaFeatures.MEGA_HEMLOCK_TREE, 8)
				.addTreeFeature(TerrestriaFeatures.HEMLOCK_TREE, 8)
				.addTreeFeature(TerrestriaFeatures.FALLEN_HEMLOCK_LOG, 4)
				.addTreeFeature(TerrestriaFeatures.TINY_HEMLOCK_TREE, 1)
				.addGrassFeature(Blocks.GRASS.getDefaultState(), 4)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 8, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 4, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.FOX, 8, 2, 4))
				.build());

		SNOWY_HEMLOCK_CLEARING = register("snowy_hemlock_clearing", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.SNOW).category(Biome.Category.TAIGA)
				.depth(0.95F)
				.scale(0.55F)
				.temperature(-0.5F)
				.downfall(1.0F)
				.waterColor(4020182)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, LARGE_FERNS, MINEABLES, ORES, DISKS,
						TAIGA_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, SWEET_BERRY_BUSHES_SNOWY, FROZEN_TOP_LAYER)
				.addTreeFeature(TerrestriaFeatures.HEMLOCK_TREE, 1)
				.addTreeFeature(TerrestriaFeatures.TINY_HEMLOCK_TREE, 1)
				.addTreeFeature(TerrestriaFeatures.FALLEN_HEMLOCK_LOG, 2)
				.addGrassFeature(Blocks.GRASS.getDefaultState(), 4)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 8, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 4, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.FOX, 8, 2, 4))
				.build());

		ALPINE = register("alpine", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.MOUNTAIN, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.SNOW).category(Biome.Category.EXTREME_HILLS)
				.depth(1.7F)
				.scale(0.4F)
				.temperature(0.0F)
				.downfall(0.1F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_MUSHROOMS,
						DEFAULT_VEGETATION, SPRINGS, EMERALD_ORE, INFECTED_STONE, FROZEN_TOP_LAYER)
				.addRareTreeFeature(TerrestriaFeatures.REDWOOD_TREE, 2)
				.addRareTreeFeature(TerrestriaFeatures.HEMLOCK_TREE, 2)
				.addTreeFeature(TerrestriaFeatures.TINY_REDWOOD_TREE, 1)
				.addTreeFeature(TerrestriaFeatures.TINY_HEMLOCK_TREE, 1)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 5, 4, 4))
				.build());

		CYPRESS_FOREST = register("cypress_forest", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.FOREST)
				.depth(0.1F)
				.scale(0.2F)
				.temperature(0.7F)
				.downfall(0.8F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, FOREST_FLOWERS, MINEABLES, ORES, DISKS,
						DEFAULT_FLOWERS, DEFAULT_MUSHROOMS, FOREST_GRASS, DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addTreeFeature(TerrestriaFeatures.CYPRESS_TREE, 9)
				.addTreeFeature(TerrestriaFeatures.TALLER_BIRCH_TREE, 4)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 5, 4, 4))
				.build());

		WOODED_CYPRESS_HILLS = register("wooded_cypress_hills", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.FOREST)
				.depth(0.45F)
				.scale(0.3F)
				.temperature(0.7F)
				.downfall(0.8F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, FOREST_FLOWERS, MINEABLES, ORES, DISKS,
						DEFAULT_FLOWERS, DEFAULT_MUSHROOMS, FOREST_GRASS, DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addTreeFeature(TerrestriaFeatures.CYPRESS_TREE, 9)
				.addTreeFeature(TerrestriaFeatures.TALLER_BIRCH_TREE, 4)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 5, 4, 4))
				.build());

		CYPRESS_SWAMP = register("cypress_swamp", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.SWAMP, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.SWAMP)
				.depth(-0.25F)
				.scale(0.05F)
				.temperature(0.7F)
				.downfall(0.7F)
				.waterColor(0x2c7f32)
				.waterFogColor(0x053305)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, CLAY, DEFAULT_GRASS,
						DEFAULT_MUSHROOMS, SWAMP_VEGETATION, SPRINGS, SEAGRASS, FOSSILS, FROZEN_TOP_LAYER, SWAMP_FEATURES)
				.addTreeFeature(TerrestriaFeatures.MEGA_CYPRESS_TREE, 2)
				.addTreeFeature(TerrestriaFeatures.RUBBER_TREE, 3)
				.addCustomFeature(GenerationStep.Feature.VEGETAL_DECORATION, Biome.configureFeature(
						TerrestriaFeatures.CATTAIL, new SeagrassFeatureConfig(80, 0.3D),
						Decorator.TOP_SOLID_HEIGHTMAP, DecoratorConfig.DEFAULT))
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.build());

		SAKURA_FOREST = register("sakura_forest", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.FOREST)
				.depth(0.05F)
				.scale(0.1F)
				.temperature(0.8F)
				.downfall(1.0F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DEFAULT_MUSHROOMS,
						DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addTreeFeature(TerrestriaFeatures.SAKURA_TREE, 6)
				.addTreeFeature(TerrestriaFeatures.JAPANESE_MAPLE_SHRUB, 4)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 5, 4, 4))
				.build());

		WOODED_SAKURA_HILLS = register("wooded_sakura_hills", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.FOREST)
				.depth(0.4F)
				.scale(0.3F)
				.temperature(0.8F)
				.downfall(1.0F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DEFAULT_MUSHROOMS,
						DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addTreeFeature(TerrestriaFeatures.SAKURA_TREE, 6)
				.addTreeFeature(TerrestriaFeatures.JAPANESE_MAPLE_SHRUB, 4)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 5, 4, 4))
				.build());

		JAPANESE_MAPLE_FOREST = register("japanese_maple_forest", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.FOREST)
				.depth(0.05F)
				.scale(0.2F)
				.temperature(0.8F)
				.downfall(0.5F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DEFAULT_MUSHROOMS,
						DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER, FOREST_GRASS)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addTreeFeature(TerrestriaFeatures.JAPANESE_MAPLE_TREE, 3)
				.addTreeFeature(TerrestriaFeatures.JAPANESE_MAPLE_SHRUB, 3)
				.addTreeFeature(TerrestriaFeatures.DARK_JAPANESE_MAPLE_TREE, 3)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 5, 4, 4))
				.build());

		WOODED_JAPANESE_MAPLE_HILLS = register("wooded_japanese_maple_hills", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.FOREST)
				.depth(0.45F)
				.scale(0.5F)
				.temperature(0.8F)
				.downfall(0.5F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DEFAULT_MUSHROOMS,
						DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER, FOREST_GRASS)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addTreeFeature(TerrestriaFeatures.JAPANESE_MAPLE_TREE, 3)
				.addTreeFeature(TerrestriaFeatures.JAPANESE_MAPLE_SHRUB, 3)
				.addTreeFeature(TerrestriaFeatures.DARK_JAPANESE_MAPLE_TREE, 3)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 5, 4, 4))
				.build());

		DENSE_WOODLANDS = register("dense_woodlands", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.TAIGA)
				.depth(0.125F)
				.scale(0.05F)
				.temperature(0.9F)
				.downfall(0.3F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, PLAINS_TALL_GRASS, MINEABLES, ORES, DISKS,
						PLAINS_FEATURES, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addTreeFeature(Feature.FANCY_TREE, 7)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.build());

		DENSE_WOODLANDS_EDGE = register("dense_woodlands_edge", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.TAIGA)
				.depth(0.125F)
				.scale(0.05F)
				.temperature(0.9F)
				.downfall(0.3F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, PLAINS_TALL_GRASS, MINEABLES, ORES, DISKS,
						PLAINS_FEATURES, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addTreeFeature(Feature.FANCY_TREE, 3)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.build());

		RAINBOW_RAINFOREST = register("rainbow_rainforest", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.JUNGLE)
				.depth(0.4F)
				.scale(0.4F)
				.temperature(0.95F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						JUNGLE_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, JUNGLE_VEGETATION, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.JUNGLE_TEMPLE)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addTreeFeature(TerrestriaFeatures.RAINBOW_EUCALYPTUS_TREE, 5)
				.addTreeFeature(Feature.FANCY_TREE, 5)
				.addTreeFeature(TerrestriaFeatures.RUBBER_TREE, 3)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.PARROT, 40, 1, 2))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.OCELOT, 2, 1, 1))
				.build());

		RAINBOW_RAINFOREST_MOUNTAINS = register("rainbow_rainforest_mountains", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.JUNGLE)
				.depth(1.0F)
				.scale(0.5F)
				.temperature(0.95F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						JUNGLE_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, JUNGLE_VEGETATION, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.JUNGLE_TEMPLE)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addTreeFeature(TerrestriaFeatures.RAINBOW_EUCALYPTUS_TREE, 5)
				.addTreeFeature(Feature.FANCY_TREE, 5)
				.addTreeFeature(TerrestriaFeatures.RUBBER_TREE, 3)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.PARROT, 40, 1, 2))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.OCELOT, 2, 1, 1))
				.build());

		RAINBOW_RAINFOREST_LAKE = register("rainbow_rainforest_lake", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.JUNGLE)
				.depth(-0.2F)
				.scale(0.0F)
				.temperature(0.95F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						JUNGLE_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, JUNGLE_VEGETATION, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.JUNGLE_TEMPLE)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addTreeFeature(TerrestriaFeatures.RAINBOW_EUCALYPTUS_TREE, 5)
				.addTreeFeature(Feature.FANCY_TREE, 5)
				.addTreeFeature(TerrestriaFeatures.RUBBER_TREE, 3)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.PARROT, 40, 1, 2))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.OCELOT, 2, 1, 1))
				.build());

		CALDERA = register("caldera", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(TerrestriaSurfaces.CALDERA, SurfaceBuilder.GRASS_SAND_UNDERWATER_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.OCEAN)
				.depth(1.5F)
				.scale(0.05F)
				.temperature(0.7F)
				.downfall(0.7F)
				.waterColor(0x54d3c0)
				.waterFogColor(0x24a0b0)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						DEFAULT_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SQUID, 3, 1, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SALMON, 15, 3, 6))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.COD, 15, 1, 5))
				.build());

		CALDERA_RIDGE = register("caldera_ridge", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.EXTREME_HILLS)
				.depth(4F)
				.scale(0F)
				.temperature(0F)
				.downfall(1F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						DEFAULT_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addTreeFeature(TerrestriaFeatures.TINY_REDWOOD_TREE, 1)
				.addTreeFeature(TerrestriaFeatures.TINY_HEMLOCK_TREE, 1)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SQUID, 3, 1, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SALMON, 15, 3, 6))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.COD, 15, 1, 5))
				.build());

		CALDERA_BEACH = register("caldera_beach", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(TerrestriaSurfaces.CALDERA, SurfaceBuilder.GRASS_SAND_UNDERWATER_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.BEACH)
				.depth(2.25F)
				.scale(0F)
				.temperature(0.7F)
				.downfall(0.7F)
				.waterColor(0x54d3c0)
				.waterFogColor(0x24a0b0)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						DEFAULT_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SQUID, 3, 1, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SALMON, 15, 3, 6))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.COD, 15, 1, 5))
				.build());


		VOLCANIC_ISLAND = register("volcanic_island", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(TerrestriaSurfaces.CLIFF, TerrestriaSurfaces.BASALT_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.EXTREME_HILLS)
				.depth(0.1F)
				.scale(0.2F)
				.temperature(0.9F)
				.downfall(0.9F)
				.waterColor(0x54d3c0)
				.waterFogColor(0x24a0b0)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						DEFAULT_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addGrassFeature(TerrestriaBlocks.INDIAN_PAINTBRUSH.getDefaultState(), 1)
				.addGrassFeature(TerrestriaBlocks.MONSTERAS.getDefaultState(), 4)
				.addTreeFeature(TerrestriaFeatures.PALM_TREE, 5)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SQUID, 3, 1, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SALMON, 15, 3, 6))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.COD, 15, 1, 5))
				.build());

		VOLCANIC_ISLAND_SHORE = register("volcanic_island_shore", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(TerrestriaSurfaces.CLIFF, TerrestriaSurfaces.BASALT_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.BEACH)
				.depth(0.05F)
				.scale(0.05F)
				.temperature(0.9F)
				.downfall(0.9F)
				.waterColor(0x54d3c0)
				.waterFogColor(0x24a0b0)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						DEFAULT_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addGrassFeature(TerrestriaBlocks.INDIAN_PAINTBRUSH.getDefaultState(), 1)
				.addGrassFeature(TerrestriaBlocks.MONSTERAS.getDefaultState(), 4)
				.addTreeFeature(TerrestriaFeatures.PALM_TREE, 2)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SQUID, 3, 1, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SALMON, 15, 3, 6))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.COD, 15, 1, 5))
				.build());

		VOLCANIC_ISLAND_BEACH = register("volcanic_island_beach", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(TerrestriaSurfaces.BASALT_BEACH, TerrestriaSurfaces.BASALT_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.BEACH)
				.depth(0F)
				.scale(0.05F)
				.temperature(0.9F)
				.downfall(0.9F)
				.waterColor(0x54d3c0)
				.waterFogColor(0x24a0b0)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						DEFAULT_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addGrassFeature(TerrestriaBlocks.INDIAN_PAINTBRUSH.getDefaultState(), 1)
				.addGrassFeature(TerrestriaBlocks.MONSTERAS.getDefaultState(), 4)
				.addTreeFeature(TerrestriaFeatures.PALM_TREE, 2)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SQUID, 3, 1, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SALMON, 15, 3, 6))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.COD, 15, 1, 5))
				.build());
		
		ALPS = register("alps", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(SurfaceBuilder.DEFAULT, TerrestriaSurfaces.ALPS_CONFIG)
				.precipitation(Biome.Precipitation.SNOW).category(Biome.Category.ICY)
				.depth(3.7F)
				.scale(0.3F)
				.temperature(-0.5F)
				.downfall(0.1F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_VEGETATION,
						SPRINGS, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.build());
		
		TROPICAL_REEF = register("tropical_reef", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(TerrestriaSurfaces.TROPICAL_BEACH, TerrestriaSurfaces.TROPICAL_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.OCEAN)
				.depth(-0.5F)
				.scale(0.01F)
				.temperature(1.1F)
				.downfall(0.7F)
				.waterColor(4445678)
				.waterFogColor(270131)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, DUNGEONS, MINEABLES, ORES, DISKS,
						DEFAULT_FLOWERS, DEFAULT_GRASS, DEFAULT_MUSHROOMS, SWAMP_VEGETATION,
						SPRINGS, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addStructureFeature(Feature.OCEAN_RUIN, new OceanRuinFeatureConfig(OceanRuinFeature.BiomeType.WARM, 0.33F, 0.95F))
				.addStructureFeature(Feature.SHIPWRECK, new ShipwreckFeatureConfig(false))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SQUID, 9, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.PUFFERFISH, 18, 1, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.TROPICAL_FISH, 26, 8, 8))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.DOLPHIN, 5, 1, 2))
				.build());
		
		TROPICAL_REEF_EDGE = register("tropical_reef_edge", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(TerrestriaSurfaces.TROPICAL_BEACH, TerrestriaSurfaces.TROPICAL_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.OCEAN)
				.depth(-1.5F)
				.scale(0.01F)
				.temperature(1.1F)
				.downfall(0.7F)
				.waterColor(4445678)
				.waterFogColor(270131)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, DUNGEONS, MINEABLES, ORES, DISKS,
						DEFAULT_FLOWERS, DEFAULT_GRASS, DEFAULT_MUSHROOMS, SWAMP_VEGETATION,
						SPRINGS, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addStructureFeature(Feature.OCEAN_RUIN, new OceanRuinFeatureConfig(OceanRuinFeature.BiomeType.WARM, 0.33F, 0.95F))
				.addStructureFeature(Feature.SHIPWRECK, new ShipwreckFeatureConfig(false))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SQUID, 9, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.PUFFERFISH, 18, 1, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.TROPICAL_FISH, 26, 8, 8))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.DOLPHIN, 5, 1, 2))
				.build());
		
		TROPICAL_ISLAND = register("tropical_island", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(TerrestriaSurfaces.TROPICAL_BEACH, TerrestriaSurfaces.TROPICAL_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.FOREST)
				.depth(0.2F)
				.scale(0.26F)
				.temperature(1.1F)
				.downfall(0.7F)
				.waterColor(4445678)
				.waterFogColor(270131)
				.setParent("blossom:tropical_reef") // I'm not risking changing this
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, DUNGEONS, MINEABLES, ORES, DISKS,
						DEFAULT_FLOWERS, DEFAULT_GRASS, DEFAULT_MUSHROOMS, SWAMP_VEGETATION,
						SPRINGS, FROZEN_TOP_LAYER)
				.addTreeFeature(TerrestriaFeatures.TROPICAL_ISLAND_PALM, 1)
				.addTreeFeature(TerrestriaFeatures.TROPICAL_ISLAND_PALM_2, 1)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.BAT, 10, 8, 8))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SPIDER, 100, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SKELETON, 100, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.CREEPER, 100, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SLIME, 100, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WITCH, 5, 1, 1))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.ZOMBIE, 95, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.ZOMBIE_VILLAGER, 1, 1, 1))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.TROPICAL_FISH, 26, 8, 8))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 1, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.PARROT, 1, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.CHICKEN, 5, 2, 5))
				.build());
		
		TROPICAL_ISLAND_COAST = register("tropical_island_coast", TerrestriaBiome.builder()
				.configuredSurfaceBuilder(TerrestriaSurfaces.TROPICAL_BEACH, TerrestriaSurfaces.TROPICAL_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.BEACH)
				.depth(0.025F)
				.scale(0.025F)
				.temperature(1.1F)
				.downfall(0.7F)
				.waterColor(4445678)
				.waterFogColor(270131)
				.setParent("blossom:tropical_reef") // I'm not risking changing this
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, DUNGEONS, MINEABLES, ORES, DISKS,
						DEFAULT_FLOWERS, DEFAULT_GRASS, DEFAULT_MUSHROOMS, SWAMP_VEGETATION,
						SPRINGS, FROZEN_TOP_LAYER)
				.addTreeFeature(TerrestriaFeatures.TROPICAL_ISLAND_PALM, 1)
				.addTreeFeature(TerrestriaFeatures.TROPICAL_ISLAND_PALM_2, 1)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.BAT, 10, 8, 8))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SPIDER, 100, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SKELETON, 100, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.CREEPER, 100, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SLIME, 100, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.WITCH, 5, 1, 1))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.ZOMBIE, 95, 4, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.ZOMBIE_VILLAGER, 1, 1, 1))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.TROPICAL_FISH, 26, 8, 8))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.RABBIT, 1, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.PARROT, 1, 2, 3))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.CHICKEN, 5, 2, 5))
				.build());
		
		TerrestriaFeatures.addVolcanoStarts(
				VOLCANIC_ISLAND,
				VOLCANIC_ISLAND_SHORE,
				Biomes.DEEP_OCEAN,
				Biomes.DEEP_COLD_OCEAN,
				Biomes.DEEP_LUKEWARM_OCEAN,
				Biomes.DEEP_WARM_OCEAN
		);

		forEveryBiome(TerrestriaFeatures::addVolcanoStructure);

		// 33% of Jungles will be replaced by Rainforest biomes
		// 33% of Mountains will be replaced with Caldera Ridges
		// 10% of Deep Oceans will be replaced with Volcanic Islands
		// 30% of Deep Oceans will be replaced with Tropical Islands
		OverworldBiomes.addBiomeVariant(Biomes.JUNGLE, RAINBOW_RAINFOREST, 0.33);
		OverworldBiomes.addBiomeVariant(Biomes.MOUNTAINS, CALDERA_RIDGE, 0.33);
		OverworldBiomes.addBiomeVariant(Biomes.DEEP_OCEAN, VOLCANIC_ISLAND_SHORE, 0.10);
		OverworldBiomes.addBiomeVariant(Biomes.DEEP_OCEAN, TROPICAL_REEF, 0.3);
		
		OverworldBiomes.addContinentalBiome(CYPRESS_FOREST, OverworldClimate.TEMPERATE, 1.0);
		OverworldBiomes.addContinentalBiome(SAKURA_FOREST, OverworldClimate.TEMPERATE, 1.0);
		OverworldBiomes.addContinentalBiome(JAPANESE_MAPLE_FOREST, OverworldClimate.TEMPERATE, 1.0);
		OverworldBiomes.addContinentalBiome(CYPRESS_SWAMP, OverworldClimate.TEMPERATE, 1.0);
		OverworldBiomes.addContinentalBiome(REDWOOD_FOREST, OverworldClimate.TEMPERATE, 1.0);
		OverworldBiomes.addContinentalBiome(LUSH_REDWOOD_FOREST, OverworldClimate.TEMPERATE, 1.0);
		OverworldBiomes.addContinentalBiome(HEMLOCK_RAINFOREST, OverworldClimate.COOL, 1.0);
		OverworldBiomes.addContinentalBiome(SNOWY_HEMLOCK_FOREST, OverworldClimate.SNOWY, 2.0);
		OverworldBiomes.addContinentalBiome(ALPS, OverworldClimate.SNOWY, 1.0);
		OverworldBiomes.addContinentalBiome(DENSE_WOODLANDS, OverworldClimate.DRY, 1.0);

		OverworldBiomes.addEdgeBiome(CALDERA, CALDERA_BEACH, 1);
		OverworldBiomes.addEdgeBiome(REDWOOD_FOREST, REDWOOD_FOREST_EDGE, 1);
		OverworldBiomes.addEdgeBiome(LUSH_REDWOOD_FOREST, LUSH_REDWOOD_FOREST_EDGE, 1);
		OverworldBiomes.addEdgeBiome(DENSE_WOODLANDS, DENSE_WOODLANDS_EDGE, 1);

		OverworldBiomesExt.addBorderBiome(CALDERA_RIDGE, ALPINE);
		OverworldBiomesExt.addCenterBiome(CALDERA_RIDGE, CALDERA);
		
		OverworldBiomesExt.addBorderBiome(TROPICAL_REEF, TROPICAL_REEF_EDGE);
		
		OverworldBiomesExt.addBorderBiome(VOLCANIC_ISLAND_SHORE, VOLCANIC_ISLAND_SHORE);
		OverworldBiomesExt.addCenterBiome(VOLCANIC_ISLAND_SHORE, VOLCANIC_ISLAND);

		OverworldBiomes.addHillsBiome(REDWOOD_FOREST, REDWOOD_CLEARING, 1.0);
		OverworldBiomes.addHillsBiome(LUSH_REDWOOD_FOREST, LUSH_REDWOOD_CLEARING, 1.0);
		OverworldBiomes.addHillsBiome(CYPRESS_FOREST, WOODED_CYPRESS_HILLS, 1.0);
		OverworldBiomes.addHillsBiome(HEMLOCK_RAINFOREST, HEMLOCK_CLEARING, 1.0);
		OverworldBiomes.addHillsBiome(SNOWY_HEMLOCK_FOREST, SNOWY_HEMLOCK_CLEARING, 1.0);
		OverworldBiomes.addHillsBiome(SAKURA_FOREST, WOODED_SAKURA_HILLS, 1.0);
		OverworldBiomes.addHillsBiome(JAPANESE_MAPLE_FOREST, WOODED_JAPANESE_MAPLE_HILLS, 1.0);
		OverworldBiomes.addHillsBiome(RAINBOW_RAINFOREST, RAINBOW_RAINFOREST_MOUNTAINS, 1.0);
		OverworldBiomes.addHillsBiome(RAINBOW_RAINFOREST, RAINBOW_RAINFOREST_LAKE, 0.6);
		OverworldBiomes.addHillsBiome(ALPS, ALPINE, 1);
		OverworldBiomes.addHillsBiome(TROPICAL_REEF, TROPICAL_ISLAND, 1);
		
		OverworldBiomes.setRiverBiome(ALPS, null);
		OverworldBiomes.setRiverBiome(ALPINE, null);
		OverworldBiomes.setRiverBiome(CALDERA, null);
		OverworldBiomes.setRiverBiome(CALDERA_RIDGE, null);
		OverworldBiomes.setRiverBiome(CALDERA_BEACH, null);
		OverworldBiomes.setRiverBiome(VOLCANIC_ISLAND, null);
		OverworldBiomes.setRiverBiome(VOLCANIC_ISLAND_SHORE, null);
		OverworldBiomes.setRiverBiome(VOLCANIC_ISLAND_BEACH, null);
		OverworldBiomes.setRiverBiome(TROPICAL_ISLAND, null);
		OverworldBiomes.setRiverBiome(TROPICAL_ISLAND_COAST, null);
		OverworldBiomes.setRiverBiome(TROPICAL_REEF, null);
		OverworldBiomes.setRiverBiome(TROPICAL_REEF_EDGE, null);
		
		OverworldBiomes.addShoreBiome(VOLCANIC_ISLAND, VOLCANIC_ISLAND_BEACH, 1);
		OverworldBiomes.addShoreBiome(VOLCANIC_ISLAND_SHORE, VOLCANIC_ISLAND_BEACH, 1);
		OverworldBiomes.addShoreBiome(TROPICAL_ISLAND, TROPICAL_ISLAND_COAST, 1);
		OverworldBiomes.addShoreBiome(TROPICAL_REEF_EDGE, TROPICAL_REEF_EDGE, 1);
		
		FabricBiomes.addSpawnBiome(CYPRESS_FOREST);
		FabricBiomes.addSpawnBiome(RAINBOW_RAINFOREST);
		FabricBiomes.addSpawnBiome(REDWOOD_FOREST);
		FabricBiomes.addSpawnBiome(LUSH_REDWOOD_FOREST);
		FabricBiomes.addSpawnBiome(HEMLOCK_RAINFOREST);
	}

	public static <T extends Biome> T register(String name, T biome) {
		return Registry.register(Registry.BIOME, new Identifier(Terrestria.MOD_ID, name), biome);
	}

	private static void forEveryBiome(Consumer<Biome> biomes) {
		Registry.BIOME.forEach(biomes);
		RegistryEntryAddedCallback.event(Registry.BIOME).register((rawId, id, biome) -> biomes.accept(biome));
	}
}
