package com.pnku.mst.init;

import com.pnku.mst.block.MoreSmithingTableBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

public class MstBlockInit {
    public static final MoreSmithingTableBlock OAK_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.WOOD, "oak");
    public static final MoreSmithingTableBlock DARK_OAK_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.COLOR_BROWN, "dark_oak");
    public static final MoreSmithingTableBlock SPRUCE_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.PODZOL, "spruce");
    public static final MoreSmithingTableBlock BIRCH_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.SAND, "birch");
    public static final MoreSmithingTableBlock JUNGLE_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.DIRT, "jungle");
    public static final MoreSmithingTableBlock ACACIA_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.COLOR_ORANGE, "acacia");
    public static final MoreSmithingTableBlock MANGROVE_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.COLOR_RED, "mangrove");
    public static final MoreSmithingTableBlock CHERRY_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry");
    public static final MoreSmithingTableBlock BAMBOO_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo");
    public static final MoreSmithingTableBlock CRIMSON_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson");
    public static final MoreSmithingTableBlock WARPED_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped");

    public static final List<Block> more_smithing_tables = new ArrayList<>();


    public static void registerBlocks() {
        registerBlock(OAK_SMITHING_TABLE);
        registerBlock(DARK_OAK_SMITHING_TABLE);
        registerBlock(SPRUCE_SMITHING_TABLE);
        registerBlock(BIRCH_SMITHING_TABLE);
        registerBlock(JUNGLE_SMITHING_TABLE);
        registerBlock(ACACIA_SMITHING_TABLE);
        registerBlock(MANGROVE_SMITHING_TABLE);
        registerBlock(CHERRY_SMITHING_TABLE);
        registerBlock(BAMBOO_SMITHING_TABLE);
        registerBlock(CRIMSON_SMITHING_TABLE);
        registerBlock(WARPED_SMITHING_TABLE);

    }

    private static void registerBlock(MoreSmithingTableBlock smithing_table) {
        Registry.register(BuiltInRegistries.BLOCK, com.pnku.mst.MoreSmithingTables.asId(smithing_table.smithingtableType + "_smithing_table"), smithing_table);
        more_smithing_tables.add(smithing_table);
    }
}
