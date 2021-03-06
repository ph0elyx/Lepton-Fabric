package com.github.elturtco.lepton.registry;

import com.github.elturtco.lepton.Lepton;
import com.github.elturtco.lepton.block.*;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LeptonBlocks {

    // Cracked Sandstone
    public static final Block CRACKED_SANDSTONE = new Block(Settings.copy(Blocks.SANDSTONE));
    public static final Block CRACKED_RED_SANDSTONE = new Block(Settings.copy(Blocks.RED_SANDSTONE));

    public static final SlabBlock CRACKED_SANDSTONE_SLAB = new SlabBlock(Settings.copy(Blocks.SANDSTONE));
    public static final SlabBlock CRACKED_RED_SANDSTONE_SLAB = new SlabBlock(Settings.copy(Blocks.RED_SANDSTONE));

    public static final LeptonStairsBlock CRACKED_SANDSTONE_STAIRS = new LeptonStairsBlock(CRACKED_SANDSTONE.getDefaultState(), Settings.copy(Blocks.SANDSTONE));
    public static final LeptonStairsBlock CRACKED_RED_SANDSTONE_STAIRS = new LeptonStairsBlock(CRACKED_RED_SANDSTONE.getDefaultState(), Settings.copy(Blocks.RED_SANDSTONE));

    public static final WallBlock CRACKED_SANDSTONE_WALL = new WallBlock(Settings.copy(Blocks.SANDSTONE));
    public static final WallBlock CRACKED_RED_SANDSTONE_WALL = new WallBlock(Settings.copy(Blocks.RED_SANDSTONE));

    // Vanilla Slabs
    public static final SlabBlock STRIPPED_ACACIA_WOOD_SLAB = new SlabBlock(Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final SlabBlock STRIPPED_BIRCH_WOOD_SLAB = new SlabBlock(Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final SlabBlock STRIPPED_DARK_OAK_WOOD_SLAB = new SlabBlock(Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final SlabBlock STRIPPED_JUNGLE_WOOD_SLAB = new SlabBlock(Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final SlabBlock STRIPPED_OAK_WOOD_SLAB = new SlabBlock(Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final SlabBlock STRIPPED_SPRUCE_WOOD_SLAB = new SlabBlock(Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final SlabBlock STRIPPED_CRIMSON_HYPHAE_SLAB = new SlabBlock(Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final SlabBlock STRIPPED_WARPED_HYPHAE_SLAB = new SlabBlock(Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE));

    public static final LogSlabBlock ACACIA_WOOD_SLAB = new LogSlabBlock(STRIPPED_ACACIA_WOOD_SLAB, Settings.copy(Blocks.ACACIA_WOOD));
    public static final LogSlabBlock BIRCH_WOOD_SLAB = new LogSlabBlock(STRIPPED_BIRCH_WOOD_SLAB, Settings.copy(Blocks.BIRCH_WOOD));
    public static final LogSlabBlock DARK_OAK_WOOD_SLAB = new LogSlabBlock(STRIPPED_DARK_OAK_WOOD_SLAB, Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final LogSlabBlock JUNGLE_WOOD_SLAB = new LogSlabBlock(STRIPPED_JUNGLE_WOOD_SLAB, Settings.copy(Blocks.JUNGLE_WOOD));
    public static final LogSlabBlock OAK_WOOD_SLAB = new LogSlabBlock(STRIPPED_OAK_WOOD_SLAB, Settings.copy(Blocks.OAK_WOOD));
    public static final LogSlabBlock SPRUCE_WOOD_SLAB = new LogSlabBlock(STRIPPED_SPRUCE_WOOD_SLAB, Settings.copy(Blocks.SPRUCE_WOOD));
    public static final LogSlabBlock CRIMSON_HYPHAE_SLAB = new LogSlabBlock(STRIPPED_CRIMSON_HYPHAE_SLAB, Settings.copy(Blocks.CRIMSON_HYPHAE));
    public static final LogSlabBlock WARPED_HYPHAE_SLAB = new LogSlabBlock(STRIPPED_WARPED_HYPHAE_SLAB, Settings.copy(Blocks.WARPED_HYPHAE));

    public static final SlabBlock CRACKED_STONE_BRICK_SLAB = new SlabBlock(Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final SlabBlock QUARTZ_BRICK_SLAB = new SlabBlock(Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final SlabBlock CRACKED_NETHER_BRICK_SLAB = new SlabBlock(Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final SlabBlock CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = new SlabBlock(Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

    // Vanilla Stairs
    public static final LeptonStairsBlock STRIPPED_ACACIA_WOOD_STAIRS = new LeptonStairsBlock(Blocks.STRIPPED_ACACIA_WOOD.getDefaultState(), Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final LeptonStairsBlock STRIPPED_BIRCH_WOOD_STAIRS = new LeptonStairsBlock(Blocks.STRIPPED_BIRCH_WOOD.getDefaultState(), Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final LeptonStairsBlock STRIPPED_DARK_OAK_WOOD_STAIRS = new LeptonStairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState(), Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final LeptonStairsBlock STRIPPED_JUNGLE_WOOD_STAIRS = new LeptonStairsBlock(Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState(), Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final LeptonStairsBlock STRIPPED_OAK_WOOD_STAIRS = new LeptonStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final LeptonStairsBlock STRIPPED_SPRUCE_WOOD_STAIRS = new LeptonStairsBlock(Blocks.STRIPPED_SPRUCE_WOOD.getDefaultState(), Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final LeptonStairsBlock STRIPPED_CRIMSON_HYPHAE_STAIRS = new LeptonStairsBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.getDefaultState(), Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final LeptonStairsBlock STRIPPED_WARPED_HYPHAE_STAIRS = new LeptonStairsBlock(Blocks.STRIPPED_WARPED_HYPHAE.getDefaultState(), Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE));

    public static final LogStairsBlock ACACIA_WOOD_STAIRS = new LogStairsBlock(STRIPPED_ACACIA_WOOD_STAIRS, Blocks.ACACIA_WOOD.getDefaultState(), Settings.copy(Blocks.ACACIA_WOOD));
    public static final LogStairsBlock BIRCH_WOOD_STAIRS = new LogStairsBlock(STRIPPED_BIRCH_WOOD_STAIRS, Blocks.BIRCH_WOOD.getDefaultState(), Settings.copy(Blocks.BIRCH_WOOD));
    public static final LogStairsBlock DARK_OAK_WOOD_STAIRS = new LogStairsBlock(STRIPPED_DARK_OAK_WOOD_STAIRS, Blocks.DARK_OAK_WOOD.getDefaultState(), Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final LogStairsBlock JUNGLE_WOOD_STAIRS = new LogStairsBlock(STRIPPED_JUNGLE_WOOD_STAIRS, Blocks.JUNGLE_WOOD.getDefaultState(), Settings.copy(Blocks.JUNGLE_WOOD));
    public static final LogStairsBlock OAK_WOOD_STAIRS = new LogStairsBlock(STRIPPED_OAK_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Settings.copy(Blocks.OAK_WOOD));
    public static final LogStairsBlock SPRUCE_WOOD_STAIRS = new LogStairsBlock(STRIPPED_SPRUCE_WOOD_STAIRS, Blocks.SPRUCE_WOOD.getDefaultState(), Settings.copy(Blocks.SPRUCE_WOOD));
    public static final LogStairsBlock CRIMSON_HYPHAE_STAIRS = new LogStairsBlock(STRIPPED_CRIMSON_HYPHAE_STAIRS, Blocks.CRIMSON_HYPHAE.getDefaultState(), Settings.copy(Blocks.CRIMSON_HYPHAE));
    public static final LogStairsBlock WARPED_HYPHAE_STAIRS = new LogStairsBlock(STRIPPED_WARPED_HYPHAE_STAIRS, Blocks.WARPED_HYPHAE.getDefaultState(), Settings.copy(Blocks.WARPED_HYPHAE));

    public static final LeptonStairsBlock SMOOTH_STONE_STAIRS = new LeptonStairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), Settings.copy(Blocks.SMOOTH_STONE));
    public static final LeptonStairsBlock CUT_SANDSTONE_STAIRS = new LeptonStairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), Settings.copy(Blocks.CUT_SANDSTONE));
    public static final LeptonStairsBlock CUT_RED_SANDSTONE_STAIRS = new LeptonStairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), Settings.copy(Blocks.CUT_RED_SANDSTONE));
    public static final LeptonStairsBlock CRACKED_STONE_BRICK_STAIRS = new LeptonStairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final LeptonStairsBlock QUARTZ_BRICK_STAIRS = new LeptonStairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final LeptonStairsBlock CRACKED_NETHER_BRICK_STAIRS = new LeptonStairsBlock(Blocks.CRACKED_NETHER_BRICKS.getDefaultState(), Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final LeptonStairsBlock CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = new LeptonStairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

    // Vanilla Walls
    public static final Block STRIPPED_ACACIA_WOOD_WALL = new WallBlock(Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block STRIPPED_BIRCH_WOOD_WALL = new WallBlock(Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block STRIPPED_DARK_OAK_WOOD_WALL = new WallBlock(Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block STRIPPED_JUNGLE_WOOD_WALL = new WallBlock(Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block STRIPPED_OAK_WOOD_WALL = new WallBlock(Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block STRIPPED_SPRUCE_WOOD_WALL = new WallBlock(Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block STRIPPED_CRIMSON_HYPHAE_WALL = new WallBlock(Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block STRIPPED_WARPED_HYPHAE_WALL = new WallBlock(Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE));

    public static final LogWallBlock ACACIA_WOOD_WALL = new LogWallBlock(STRIPPED_ACACIA_WOOD_WALL, Settings.copy(Blocks.ACACIA_WOOD));
    public static final LogWallBlock BIRCH_WOOD_WALL = new LogWallBlock(STRIPPED_BIRCH_WOOD_WALL, Settings.copy(Blocks.BIRCH_WOOD));
    public static final LogWallBlock DARK_OAK_WOOD_WALL = new LogWallBlock(STRIPPED_DARK_OAK_WOOD_WALL, Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final LogWallBlock JUNGLE_WOOD_WALL = new LogWallBlock(STRIPPED_JUNGLE_WOOD_WALL, Settings.copy(Blocks.JUNGLE_WOOD));
    public static final LogWallBlock OAK_WOOD_WALL = new LogWallBlock(STRIPPED_OAK_WOOD_WALL, Settings.copy(Blocks.OAK_WOOD));
    public static final LogWallBlock SPRUCE_WOOD_WALL = new LogWallBlock(STRIPPED_SPRUCE_WOOD_WALL, Settings.copy(Blocks.SPRUCE_WOOD));
    public static final LogWallBlock CRIMSON_HYPHAE_WALL = new LogWallBlock(STRIPPED_CRIMSON_HYPHAE_WALL, Settings.copy(Blocks.CRIMSON_HYPHAE));
    public static final LogWallBlock WARPED_HYPHAE_WALL = new LogWallBlock(STRIPPED_WARPED_HYPHAE_WALL, Settings.copy(Blocks.WARPED_HYPHAE));

    public static final WallBlock PURPUR_WALL = new WallBlock(Settings.copy(Blocks.PURPUR_BLOCK));
    public static final WallBlock QUARTZ_WALL = new WallBlock(Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final WallBlock SMOOTH_QUARTZ_WALL = new WallBlock(Settings.copy(Blocks.SMOOTH_QUARTZ));
    public static final WallBlock POLISHED_ANDESITE_WALL = new WallBlock(Settings.copy(Blocks.POLISHED_ANDESITE));
    public static final WallBlock POLISHED_DIORITE_WALL = new WallBlock(Settings.copy(Blocks.POLISHED_DIORITE));
    public static final WallBlock POLISHED_GRANITE_WALL = new WallBlock(Settings.copy(Blocks.POLISHED_GRANITE));
    public static final WallBlock STONE_WALL = new WallBlock(Settings.copy(Blocks.STONE));
    public static final WallBlock SMOOTH_STONE_WALL = new WallBlock(Settings.copy(Blocks.SMOOTH_STONE));
    public static final WallBlock PRISMARINE_BRICK_WALL = new WallBlock(Settings.copy(Blocks.PRISMARINE_BRICKS));
    public static final WallBlock DARK_PRISMARINE_WALL = new WallBlock(Settings.copy(Blocks.DARK_PRISMARINE));
    public static final WallBlock CUT_SANDSTONE_WALL = new WallBlock(Settings.copy(Blocks.CUT_SANDSTONE));
    public static final WallBlock CUT_RED_SANDSTONE_WALL = new WallBlock(Settings.copy(Blocks.CUT_RED_SANDSTONE));
    public static final WallBlock SMOOTH_SANDSTONE_WALL = new WallBlock(Settings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final WallBlock SMOOTH_RED_SANDSTONE_WALL = new WallBlock(Settings.copy(Blocks.SMOOTH_RED_SANDSTONE));
    public static final WallBlock CRACKED_STONE_BRICK_WALL = new WallBlock(Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final WallBlock QUARTZ_BRICK_WALL = new WallBlock(Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final WallBlock CRACKED_NETHER_BRICK_WALL = new WallBlock(Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final WallBlock CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = new WallBlock(Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

    // Vanilla Buttons
    public static final LeptonButtonBlock POLISHED_ANDESITE_BUTTON = new LeptonButtonBlock(Properties.BUTTON);
    public static final LeptonButtonBlock POLISHED_DIORITE_BUTTON = new LeptonButtonBlock(Properties.BUTTON);
    public static final LeptonButtonBlock POLISHED_GRANITE_BUTTON = new LeptonButtonBlock(Properties.BUTTON);

    // Vanilla Pressure Plates
    public static final LeptonPressurePlateBlock POLISHED_ANDESITE_PRESSURE_PLATE = new LeptonPressurePlateBlock(LeptonPressurePlateBlock.ActivationRule.MOBS, Properties.ANDESITE_PRESSURE_PLATE);
    public static final LeptonPressurePlateBlock POLISHED_DIORITE_PRESSURE_PLATE = new LeptonPressurePlateBlock(LeptonPressurePlateBlock.ActivationRule.MOBS, Properties.DIORITE_PRESSURE_PLATE);
    public static final LeptonPressurePlateBlock POLISHED_GRANITE_PRESSURE_PLATE = new LeptonPressurePlateBlock(LeptonPressurePlateBlock.ActivationRule.MOBS, Properties.GRANITE_PRESSURE_PLATE);

    public static class Properties {

        // Vanilla
        public static final Settings BUTTON = Settings.of(Material.SUPPORTED).noCollision().strength(0.5F, 0.5F);

        public static final Settings ANDESITE_PRESSURE_PLATE = Settings.of(Material.STONE, MaterialColor.STONE).requiresTool().noCollision().strength(0.5F, 0.5f);
        public static final Settings DIORITE_PRESSURE_PLATE = Settings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().noCollision().strength(0.5F, 0.5F);
        public static final Settings GRANITE_PRESSURE_PLATE = Settings.of(Material.STONE, MaterialColor.DIRT).requiresTool().noCollision().strength(0.5F, 0.5F);

    }

    public static void RegisterLeptonBlocks() {

        //Cracked Sandstone
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_sandstone"), CRACKED_SANDSTONE);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_red_sandstone"), CRACKED_RED_SANDSTONE);

        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_sandstone_slab"), CRACKED_SANDSTONE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_red_sandstone_slab"), CRACKED_RED_SANDSTONE_SLAB);

        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_sandstone_stairs"), CRACKED_SANDSTONE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_red_sandstone_stairs"), CRACKED_RED_SANDSTONE_STAIRS);

        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_sandstone_wall"), CRACKED_SANDSTONE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_red_sandstone_wall"), CRACKED_RED_SANDSTONE_WALL);

        // Vanilla Slabs
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_acacia_wood_slab"), STRIPPED_ACACIA_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_birch_wood_slab"), STRIPPED_BIRCH_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_dark_oak_wood_slab"), STRIPPED_DARK_OAK_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_jungle_wood_slab"), STRIPPED_JUNGLE_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_oak_wood_slab"), STRIPPED_OAK_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_spruce_wood_slab"), STRIPPED_SPRUCE_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_crimson_hyphae_slab"), STRIPPED_CRIMSON_HYPHAE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_warped_hyphae_slab"), STRIPPED_WARPED_HYPHAE_SLAB);

        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "acacia_wood_slab"), ACACIA_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "birch_wood_slab"), BIRCH_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "dark_oak_wood_slab"), DARK_OAK_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "jungle_wood_slab"), JUNGLE_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "oak_wood_slab"), OAK_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "spruce_wood_slab"), SPRUCE_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "crimson_hyphae_slab"), CRIMSON_HYPHAE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "warped_hyphae_slab"), WARPED_HYPHAE_SLAB);

        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_stone_brick_slab"), CRACKED_STONE_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "quartz_brick_slab"), QUARTZ_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_nether_brick_slab"), CRACKED_NETHER_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_polished_blackstone_brick_slab"), CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);

        // Vanilla Stairs
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_acacia_wood_stairs"), STRIPPED_ACACIA_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_birch_wood_stairs"), STRIPPED_BIRCH_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_dark_oak_wood_stairs"), STRIPPED_DARK_OAK_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_jungle_wood_stairs"), STRIPPED_JUNGLE_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_oak_wood_stairs"), STRIPPED_OAK_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_spruce_wood_stairs"), STRIPPED_SPRUCE_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_crimson_hyphae_stairs"), STRIPPED_CRIMSON_HYPHAE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_warped_hyphae_stairs"), STRIPPED_WARPED_HYPHAE_STAIRS);

        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "acacia_wood_stairs"), ACACIA_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "birch_wood_stairs"), BIRCH_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "dark_oak_wood_stairs"), DARK_OAK_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "jungle_wood_stairs"), JUNGLE_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "oak_wood_stairs"), OAK_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "spruce_wood_stairs"), SPRUCE_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "crimson_hyphae_stairs"), CRIMSON_HYPHAE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "warped_hyphae_stairs"), WARPED_HYPHAE_STAIRS);

        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "smooth_stone_stairs"), SMOOTH_STONE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cut_sandstone_stairs"), CUT_SANDSTONE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cut_red_sandstone_stairs"), CUT_RED_SANDSTONE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_stone_brick_stairs"), CRACKED_STONE_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "quartz_brick_stairs"), QUARTZ_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_nether_brick_stairs"), CRACKED_NETHER_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_polished_blackstone_brick_stairs"), CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);

        // Vanilla Walls
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_acacia_wood_wall"), STRIPPED_ACACIA_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_birch_wood_wall"), STRIPPED_BIRCH_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_dark_oak_wood_wall"), STRIPPED_DARK_OAK_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_jungle_wood_wall"), STRIPPED_JUNGLE_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_oak_wood_wall"), STRIPPED_OAK_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_spruce_wood_wall"), STRIPPED_SPRUCE_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_crimson_hyphae_wall"), STRIPPED_CRIMSON_HYPHAE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stripped_warped_hyphae_wall"), STRIPPED_WARPED_HYPHAE_WALL);

        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "acacia_wood_wall"), ACACIA_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "birch_wood_wall"), BIRCH_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "dark_oak_wood_wall"), DARK_OAK_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "jungle_wood_wall"), JUNGLE_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "oak_wood_wall"), OAK_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "spruce_wood_wall"), SPRUCE_WOOD_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "crimson_hyphae_wall"), CRIMSON_HYPHAE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "warped_hyphae_wall"), WARPED_HYPHAE_WALL);

        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "purpur_wall"), PURPUR_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "quartz_wall"), QUARTZ_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "smooth_quartz_wall"), SMOOTH_QUARTZ_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "polished_andesite_wall"), POLISHED_ANDESITE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "polished_diorite_wall"), POLISHED_DIORITE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "polished_granite_wall"), POLISHED_GRANITE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "stone_wall"), STONE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "smooth_stone_wall"), SMOOTH_STONE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "prismarine_brick_wall"), PRISMARINE_BRICK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "dark_prismarine_wall"), DARK_PRISMARINE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cut_sandstone_wall"), CUT_SANDSTONE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cut_red_sandstone_wall"), CUT_RED_SANDSTONE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "smooth_sandstone_wall"), SMOOTH_SANDSTONE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "smooth_red_sandstone_wall"), SMOOTH_RED_SANDSTONE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_stone_brick_wall"), CRACKED_STONE_BRICK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "quartz_brick_wall"), QUARTZ_BRICK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_nether_brick_wall"), CRACKED_NETHER_BRICK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "cracked_polished_blackstone_brick_wall"), CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);

        // Vanilla Buttons
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "polished_andesite_button"), POLISHED_ANDESITE_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "polished_diorite_button"), POLISHED_DIORITE_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "polished_granite_button"), POLISHED_GRANITE_BUTTON);

        // Vanilla Pressure Plates
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "polished_andesite_pressure_plate"), POLISHED_ANDESITE_PRESSURE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "polished_diorite_pressure_plate"), POLISHED_DIORITE_PRESSURE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Lepton.MOD_ID, "polished_granite_pressure_plate"), POLISHED_GRANITE_PRESSURE_PLATE);

    }

}
