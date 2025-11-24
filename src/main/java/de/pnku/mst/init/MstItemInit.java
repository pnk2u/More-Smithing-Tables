package de.pnku.mst.init;

import de.pnku.mst.MoreSmithingTables;
import de.pnku.mst.block.MoreSmithingTableBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.core.Registry;

import java.util.ArrayList;
import java.util.List;

public class MstItemInit {
    public static final Item OAK_SMITHING_TABLE_I = new BlockItem(MstBlockInit.OAK_SMITHING_TABLE, new Item.Properties());
    public static final Item SPRUCE_SMITHING_TABLE_I = new BlockItem(MstBlockInit.SPRUCE_SMITHING_TABLE, new Item.Properties());
    public static final Item BIRCH_SMITHING_TABLE_I = new BlockItem(MstBlockInit.BIRCH_SMITHING_TABLE, new Item.Properties());
    public static final Item JUNGLE_SMITHING_TABLE_I = new BlockItem(MstBlockInit.JUNGLE_SMITHING_TABLE, new Item.Properties());
    public static final Item ACACIA_SMITHING_TABLE_I = new BlockItem(MstBlockInit.ACACIA_SMITHING_TABLE, new Item.Properties());
    public static final Item DARK_OAK_SMITHING_TABLE_I = new BlockItem(MstBlockInit.DARK_OAK_SMITHING_TABLE, new Item.Properties());
    public static final Item MANGROVE_SMITHING_TABLE_I = new BlockItem(MstBlockInit.MANGROVE_SMITHING_TABLE, new Item.Properties());
    public static final Item CHERRY_SMITHING_TABLE_I = new BlockItem(MstBlockInit.CHERRY_SMITHING_TABLE, new Item.Properties());
    public static final Item BAMBOO_SMITHING_TABLE_I = new BlockItem(MstBlockInit.BAMBOO_SMITHING_TABLE, new Item.Properties());
    public static final Item CRIMSON_SMITHING_TABLE_I = new BlockItem(MstBlockInit.CRIMSON_SMITHING_TABLE, new Item.Properties());
    public static final Item WARPED_SMITHING_TABLE_I = new BlockItem(MstBlockInit.WARPED_SMITHING_TABLE, new Item.Properties());
    public static final List<Item> more_smithing_table_items = new ArrayList<>();

    public static void registerItems() {
        registerItem(OAK_SMITHING_TABLE_I);
        registerItem(SPRUCE_SMITHING_TABLE_I);
        registerItem(BIRCH_SMITHING_TABLE_I);
        registerItem(JUNGLE_SMITHING_TABLE_I);
        registerItem(ACACIA_SMITHING_TABLE_I);
        registerItem(DARK_OAK_SMITHING_TABLE_I);
        registerItem(MANGROVE_SMITHING_TABLE_I);
        registerItem(CHERRY_SMITHING_TABLE_I);
        registerItem(BAMBOO_SMITHING_TABLE_I);
        registerItem(CRIMSON_SMITHING_TABLE_I);
        registerItem(WARPED_SMITHING_TABLE_I);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(Items.SMITHING_TABLE, more_smithing_table_items.toArray(new Item[0])));
    }

    private static void registerItem(Item smithingTableItem) {
        Registry.register(BuiltInRegistries.ITEM, MoreSmithingTables.withModId(((MoreSmithingTableBlock) ((BlockItem) smithingTableItem).getBlock()).smithingTableType + "_smithing_table"), smithingTableItem);
        more_smithing_table_items.add(smithingTableItem);
    }
}