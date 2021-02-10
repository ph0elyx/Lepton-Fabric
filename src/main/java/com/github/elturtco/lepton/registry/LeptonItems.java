package com.github.elturtco.lepton.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static com.github.elturtco.lepton.registry.LeptonBlocks.*;
import static com.github.elturtco.lepton.Lepton.*;
import static net.minecraft.item.ItemGroup.*;

public class LeptonItems {

    // Cracked Sandstone
    public static final BlockItem CRACKED_SANDSTONE_ITEM = new BlockItem(CRACKED_SANDSTONE, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CRACKED_RED_SANDSTONE_ITEM = new BlockItem(CRACKED_RED_SANDSTONE, new Item.Settings().group(BUILDING_BLOCKS));

    public static final BlockItem CRACKED_SANDSTONE_SLAB_ITEM = new BlockItem(CRACKED_SANDSTONE_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CRACKED_RED_SANDSTONE_SLAB_ITEM = new BlockItem(CRACKED_RED_SANDSTONE_SLAB, new Item.Settings().group(BUILDING_BLOCKS));

    public static final BlockItem CRACKED_SANDSTONE_STAIRS_ITEM = new BlockItem(CRACKED_SANDSTONE_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CRACKED_RED_SANDSTONE_STAIRS_ITEM = new BlockItem(CRACKED_RED_SANDSTONE_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));

    public static final BlockItem CRACKED_SANDSTONE_WALL_ITEM = new BlockItem(CRACKED_SANDSTONE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem CRACKED_RED_SANDSTONE_WALL_ITEM = new BlockItem(CRACKED_RED_SANDSTONE_WALL, new Item.Settings().group(DECORATIONS));

    // Vanilla Slabs
    public static final BlockItem STRIPPED_ACACIA_WOOD_SLAB_ITEM = new BlockItem(STRIPPED_ACACIA_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_BIRCH_WOOD_SLAB_ITEM = new BlockItem(STRIPPED_BIRCH_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_DARK_OAK_WOOD_SLAB_ITEM = new BlockItem(STRIPPED_DARK_OAK_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_JUNGLE_WOOD_SLAB_ITEM = new BlockItem(STRIPPED_JUNGLE_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_OAK_WOOD_SLAB_ITEM = new BlockItem(STRIPPED_OAK_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_SPRUCE_WOOD_SLAB_ITEM = new BlockItem(STRIPPED_SPRUCE_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_CRIMSON_HYPHAE_SLAB_ITEM = new BlockItem(STRIPPED_CRIMSON_HYPHAE_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_WARPED_HYPHAE_SLAB_ITEM = new BlockItem(STRIPPED_WARPED_HYPHAE_SLAB, new Item.Settings().group(BUILDING_BLOCKS));

    public static final BlockItem ACACIA_WOOD_SLAB_ITEM = new BlockItem(ACACIA_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem BIRCH_WOOD_SLAB_ITEM = new BlockItem(BIRCH_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem DARK_OAK_WOOD_SLAB_ITEM = new BlockItem(DARK_OAK_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem JUNGLE_WOOD_SLAB_ITEM = new BlockItem(JUNGLE_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem OAK_WOOD_SLAB_ITEM = new BlockItem(OAK_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem SPRUCE_WOOD_SLAB_ITEM = new BlockItem(SPRUCE_WOOD_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CRIMSON_HYPHAE_SLAB_ITEM = new BlockItem(CRIMSON_HYPHAE_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem WARPED_HYPHAE_SLAB_ITEM = new BlockItem(WARPED_HYPHAE_SLAB, new Item.Settings().group(BUILDING_BLOCKS));

    public static final BlockItem CRACKED_STONE_BRICK_SLAB_ITEM = new BlockItem(CRACKED_STONE_BRICK_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem QUARTZ_BRICK_SLAB_ITEM = new BlockItem(QUARTZ_BRICK_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CRACKED_NETHER_BRICK_SLAB_ITEM = new BlockItem(CRACKED_NETHER_BRICK_SLAB, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB_ITEM = new BlockItem(CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, new Item.Settings().group(BUILDING_BLOCKS));

    // Vanilla Stairs
    public static final BlockItem STRIPPED_ACACIA_WOOD_STAIRS_ITEM = new BlockItem(STRIPPED_ACACIA_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_BIRCH_WOOD_STAIRS_ITEM = new BlockItem(STRIPPED_BIRCH_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_DARK_OAK_WOOD_STAIRS_ITEM = new BlockItem(STRIPPED_DARK_OAK_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_JUNGLE_WOOD_STAIRS_ITEM = new BlockItem(STRIPPED_JUNGLE_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_OAK_WOOD_STAIRS_ITEM = new BlockItem(STRIPPED_OAK_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_SPRUCE_WOOD_STAIRS_ITEM = new BlockItem(STRIPPED_SPRUCE_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_CRIMSON_HYPHAE_STAIRS_ITEM = new BlockItem(STRIPPED_CRIMSON_HYPHAE_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem STRIPPED_WARPED_HYPHAE_STAIRS_ITEM = new BlockItem(STRIPPED_WARPED_HYPHAE_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));

    public static final BlockItem ACACIA_WOOD_STAIRS_ITEM = new BlockItem(ACACIA_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem BIRCH_WOOD_STAIRS_ITEM = new BlockItem(BIRCH_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem DARK_OAK_WOOD_STAIRS_ITEM = new BlockItem(DARK_OAK_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem JUNGLE_WOOD_STAIRS_ITEM = new BlockItem(JUNGLE_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem OAK_WOOD_STAIRS_ITEM = new BlockItem(OAK_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem SPRUCE_WOOD_STAIRS_ITEM = new BlockItem(SPRUCE_WOOD_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CRIMSON_HYPHAE_STAIRS_ITEM = new BlockItem(CRIMSON_HYPHAE_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem WARPED_HYPHAE_STAIRS_ITEM = new BlockItem(WARPED_HYPHAE_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));

    public static final BlockItem SMOOTH_STONE_STAIRS_ITEM = new BlockItem(SMOOTH_STONE_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CUT_SANDSTONE_STAIRS_ITEM = new BlockItem(CUT_SANDSTONE_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CUT_RED_SANDSTONE_STAIRS_ITEM = new BlockItem(CUT_RED_SANDSTONE_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CRACKED_STONE_BRICK_STAIRS_ITEM = new BlockItem(CRACKED_STONE_BRICK_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem QUARTZ_BRICK_STAIRS_ITEM = new BlockItem(QUARTZ_BRICK_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CRACKED_NETHER_BRICK_STAIRS_ITEM = new BlockItem(CRACKED_NETHER_BRICK_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));
    public static final BlockItem CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS_ITEM = new BlockItem(CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, new Item.Settings().group(BUILDING_BLOCKS));

    // Vanilla Walls
    public static final BlockItem STRIPPED_ACACIA_WOOD_WALL_ITEM = new BlockItem(STRIPPED_ACACIA_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem STRIPPED_BIRCH_WOOD_WALL_ITEM = new BlockItem(STRIPPED_BIRCH_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem STRIPPED_DARK_OAK_WOOD_WALL_ITEM = new BlockItem(STRIPPED_DARK_OAK_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem STRIPPED_JUNGLE_WOOD_WALL_ITEM = new BlockItem(STRIPPED_JUNGLE_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem STRIPPED_OAK_WOOD_WALL_ITEM = new BlockItem(STRIPPED_OAK_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem STRIPPED_SPRUCE_WOOD_WALL_ITEM = new BlockItem(STRIPPED_SPRUCE_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem STRIPPED_CRIMSON_HYPHAE_WALL_ITEM = new BlockItem(STRIPPED_CRIMSON_HYPHAE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem STRIPPED_WARPED_HYPHAE_WALL_ITEM = new BlockItem(STRIPPED_WARPED_HYPHAE_WALL, new Item.Settings().group(DECORATIONS));

    public static final BlockItem ACACIA_WOOD_WALL_ITEM = new BlockItem(ACACIA_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem BIRCH_WOOD_WALL_ITEM = new BlockItem(BIRCH_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem DARK_OAK_WOOD_WALL_ITEM = new BlockItem(DARK_OAK_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem JUNGLE_WOOD_WALL_ITEM = new BlockItem(JUNGLE_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem OAK_WOOD_WALL_ITEM = new BlockItem(OAK_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem SPRUCE_WOOD_WALL_ITEM = new BlockItem(SPRUCE_WOOD_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem CRIMSON_HYPHAE_WALL_ITEM = new BlockItem(CRIMSON_HYPHAE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem WARPED_HYPHAE_WALL_ITEM = new BlockItem(WARPED_HYPHAE_WALL, new Item.Settings().group(DECORATIONS));

    public static final BlockItem PURPUR_WALL_ITEM = new BlockItem(PURPUR_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem QUARTZ_WALL_ITEM = new BlockItem(QUARTZ_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem SMOOTH_QUARTZ_WALL_ITEM = new BlockItem(SMOOTH_QUARTZ_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem POLISHED_ANDESITE_WALL_ITEM = new BlockItem(POLISHED_ANDESITE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem POLISHED_DIORITE_WALL_ITEM = new BlockItem(POLISHED_DIORITE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem POLISHED_GRANITE_WALL_ITEM = new BlockItem(POLISHED_GRANITE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem STONE_WALL_ITEM = new BlockItem(STONE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem SMOOTH_STONE_WALL_ITEM = new BlockItem(SMOOTH_STONE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem PRISMARINE_BRICK_WALL_ITEM = new BlockItem(PRISMARINE_BRICK_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem DARK_PRISMARINE_WALL_ITEM = new BlockItem(DARK_PRISMARINE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem CUT_SANDSTONE_WALL_ITEM = new BlockItem(CUT_SANDSTONE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem CUT_RED_SANDSTONE_WALL_ITEM = new BlockItem(CUT_RED_SANDSTONE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem SMOOTH_SANDSTONE_WALL_ITEM = new BlockItem(SMOOTH_SANDSTONE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem SMOOTH_RED_SANDSTONE_WALL_ITEM = new BlockItem(SMOOTH_RED_SANDSTONE_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem CRACKED_STONE_BRICK_WALL_ITEM = new BlockItem(CRACKED_STONE_BRICK_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem QUARTZ_BRICK_WALL_ITEM = new BlockItem(QUARTZ_BRICK_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem CRACKED_NETHER_BRICK_WALL_ITEM = new BlockItem(CRACKED_NETHER_BRICK_WALL, new Item.Settings().group(DECORATIONS));
    public static final BlockItem CRACKED_POLISHED_BLACKSTONE_BRICK_WALL_ITEM = new BlockItem(CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, new Item.Settings().group(DECORATIONS));

    // Vanilla Buttons
    public static final BlockItem POLISHED_ANDESITE_BUTTON_ITEM = new BlockItem(POLISHED_ANDESITE_BUTTON, new Item.Settings().group(REDSTONE));
    public static final BlockItem POLISHED_DIORITE_BUTTON_ITEM = new BlockItem(POLISHED_DIORITE_BUTTON, new Item.Settings().group(REDSTONE));
    public static final BlockItem POLISHED_GRANITE_BUTTON_ITEM = new BlockItem(POLISHED_GRANITE_BUTTON, new Item.Settings().group(REDSTONE));

    // Vanilla Pressure Plates
    public static final BlockItem POLISHED_ANDESITE_PRESSURE_PLATE_ITEM = new BlockItem(POLISHED_ANDESITE_PRESSURE_PLATE, new Item.Settings().group(REDSTONE));
    public static final BlockItem POLISHED_DIORITE_PRESSURE_PLATE_ITEM = new BlockItem(POLISHED_DIORITE_PRESSURE_PLATE, new Item.Settings().group(REDSTONE));
    public static final BlockItem POLISHED_GRANITE_PRESSURE_PLATE_ITEM = new BlockItem(POLISHED_GRANITE_PRESSURE_PLATE, new Item.Settings().group(REDSTONE));

    public static void RegisterLeptonItems() {

        //Cracked Sandstone
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_sandstone"), CRACKED_SANDSTONE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_red_sandstone"), CRACKED_RED_SANDSTONE_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_sandstone_slab"), CRACKED_SANDSTONE_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_red_sandstone_slab"), CRACKED_RED_SANDSTONE_SLAB_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_sandstone_stairs"), CRACKED_SANDSTONE_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_red_sandstone_stairs"), CRACKED_RED_SANDSTONE_STAIRS_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_sandstone_wall"), CRACKED_SANDSTONE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_red_sandstone_wall"), CRACKED_RED_SANDSTONE_WALL_ITEM);

        // Vanilla Slabs
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_wood_slab"), STRIPPED_ACACIA_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_wood_slab"), STRIPPED_BIRCH_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_wood_slab"), STRIPPED_DARK_OAK_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_wood_slab"), STRIPPED_JUNGLE_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_wood_slab"), STRIPPED_OAK_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_wood_slab"), STRIPPED_SPRUCE_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_crimson_hyphae_slab"), STRIPPED_CRIMSON_HYPHAE_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_warped_hyphae_slab"), STRIPPED_WARPED_HYPHAE_SLAB_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_wood_slab"), ACACIA_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_wood_slab"), BIRCH_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_wood_slab"), DARK_OAK_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_wood_slab"), JUNGLE_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_wood_slab"), OAK_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_wood_slab"), SPRUCE_WOOD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crimson_hyphae_slab"), CRIMSON_HYPHAE_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warped_hyphae_slab"), WARPED_HYPHAE_SLAB_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_stone_brick_slab"), CRACKED_STONE_BRICK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "quartz_brick_slab"), QUARTZ_BRICK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_nether_brick_slab"), CRACKED_NETHER_BRICK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_polished_blackstone_brick_slab"), CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB_ITEM);

        // Vanilla Stairs
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_wood_stairs"), STRIPPED_ACACIA_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_wood_stairs"), STRIPPED_BIRCH_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_wood_stairs"), STRIPPED_DARK_OAK_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_wood_stairs"), STRIPPED_JUNGLE_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_wood_stairs"), STRIPPED_OAK_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_wood_stairs"), STRIPPED_SPRUCE_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_crimson_hyphae_stairs"), STRIPPED_CRIMSON_HYPHAE_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_warped_hyphae_stairs"), STRIPPED_WARPED_HYPHAE_STAIRS_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_wood_stairs"), ACACIA_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_wood_stairs"), BIRCH_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_wood_stairs"), DARK_OAK_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_wood_stairs"), JUNGLE_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_wood_stairs"), OAK_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_wood_stairs"), SPRUCE_WOOD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crimson_hyphae_stairs"), CRIMSON_HYPHAE_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warped_hyphae_stairs"), WARPED_HYPHAE_STAIRS_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "smooth_stone_stairs"), SMOOTH_STONE_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cut_sandstone_stairs"), CUT_SANDSTONE_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cut_red_sandstone_stairs"), CUT_RED_SANDSTONE_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_stone_brick_stairs"), CRACKED_STONE_BRICK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "quartz_brick_stairs"), QUARTZ_BRICK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_nether_brick_stairs"), CRACKED_NETHER_BRICK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_polished_blackstone_brick_stairs"), CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS_ITEM);

        // Vanilla Walls
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_wood_wall"), STRIPPED_ACACIA_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_wood_wall"), STRIPPED_BIRCH_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_wood_wall"), STRIPPED_DARK_OAK_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_wood_wall"), STRIPPED_JUNGLE_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_wood_wall"), STRIPPED_OAK_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_wood_wall"), STRIPPED_SPRUCE_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_crimson_hyphae_wall"), STRIPPED_CRIMSON_HYPHAE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_warped_hyphae_wall"), STRIPPED_WARPED_HYPHAE_WALL_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_wood_wall"), ACACIA_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_wood_wall"), BIRCH_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_wood_wall"), DARK_OAK_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_wood_wall"), JUNGLE_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_wood_wall"), OAK_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_wood_wall"), SPRUCE_WOOD_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crimson_hyphae_wall"), CRIMSON_HYPHAE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warped_hyphae_wall"), WARPED_HYPHAE_WALL_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "purpur_wall"), PURPUR_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "quartz_wall"), QUARTZ_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "smooth_quartz_wall"), SMOOTH_QUARTZ_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_andesite_wall"), POLISHED_ANDESITE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_diorite_wall"), POLISHED_DIORITE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_granite_wall"), POLISHED_GRANITE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_wall"), STONE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "smooth_stone_wall"), SMOOTH_STONE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "prismarine_brick_wall"), PRISMARINE_BRICK_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_prismarine_wall"), DARK_PRISMARINE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cut_sandstone_wall"), CUT_SANDSTONE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cut_red_sandstone_wall"), CUT_RED_SANDSTONE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "smooth_sandstone_wall"), SMOOTH_SANDSTONE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "smooth_red_sandstone_wall"), SMOOTH_RED_SANDSTONE_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_stone_brick_wall"), CRACKED_STONE_BRICK_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "quartz_brick_wall"), QUARTZ_BRICK_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_nether_brick_wall"), CRACKED_NETHER_BRICK_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cracked_polished_blackstone_brick_wall"), CRACKED_POLISHED_BLACKSTONE_BRICK_WALL_ITEM);

        // Vanilla Buttons
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_andesite_button"), POLISHED_ANDESITE_BUTTON_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_diorite_button"), POLISHED_DIORITE_BUTTON_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_granite_button"), POLISHED_GRANITE_BUTTON_ITEM);

        // Vanilla Pressure Plates
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_andesite_pressure_plate"), POLISHED_ANDESITE_PRESSURE_PLATE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_diorite_pressure_plate"), POLISHED_DIORITE_PRESSURE_PLATE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_granite_pressure_plate"), POLISHED_GRANITE_PRESSURE_PLATE_ITEM);

    }

}
