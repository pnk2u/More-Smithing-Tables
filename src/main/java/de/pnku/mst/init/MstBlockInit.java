package de.pnku.mst.init;

import de.pnku.mst.MoreSmithingTables;
import de.pnku.mst.block.MoreSmithingTableBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

public class MstBlockInit {
    public static final Block OAK_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.WOOD, "oak");
    public static final Block DARK_OAK_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.COLOR_BROWN, "dark_oak");
    public static final Block PALE_OAK_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.QUARTZ, "pale_oak");
    public static final Block SPRUCE_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.PODZOL, "spruce");
    public static final Block BIRCH_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.SAND, "birch");
    public static final Block JUNGLE_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.DIRT, "jungle");
    public static final Block ACACIA_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.COLOR_ORANGE, "acacia");
    public static final Block MANGROVE_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.COLOR_RED, "mangrove");
    public static final Block CHERRY_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry");
    public static final Block BAMBOO_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo");
    public static final Block CRIMSON_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson");
    public static final Block WARPED_SMITHING_TABLE = new MoreSmithingTableBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped");
    public static final List<Block> more_smithing_table_blocks = new ArrayList<>();


    public static void registerBlocks() {
        registerBlock(OAK_SMITHING_TABLE);
        registerBlock(DARK_OAK_SMITHING_TABLE);
        registerBlock(PALE_OAK_SMITHING_TABLE);
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

    private static void registerBlock(Block smithing_table) {
        Registry.register(BuiltInRegistries.BLOCK, MoreSmithingTables.withModId(((MoreSmithingTableBlock) smithing_table).smithingTableType + "_smithing_table"), smithing_table);
        more_smithing_table_blocks.add(smithing_table);
    }
}
