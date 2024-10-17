package com.pnku.mst.init;

import com.pnku.mst.MoreSmithingTables;
import com.pnku.mst.block.MoreSmithingTableBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.core.Registry;

import static com.pnku.mst.init.MstBlockInit.*;

public class MstItemInit {
    public static final BlockItem OAK_SMITHING_TABLE_I = itemFromBlock(OAK_SMITHING_TABLE);
    public static final BlockItem DARK_OAK_SMITHING_TABLE_I = itemFromBlock(DARK_OAK_SMITHING_TABLE);
    public static final BlockItem SPRUCE_SMITHING_TABLE_I = itemFromBlock(SPRUCE_SMITHING_TABLE);
    public static final BlockItem BIRCH_SMITHING_TABLE_I = itemFromBlock(BIRCH_SMITHING_TABLE);
    public static final BlockItem JUNGLE_SMITHING_TABLE_I = itemFromBlock(JUNGLE_SMITHING_TABLE);
    public static final BlockItem ACACIA_SMITHING_TABLE_I = itemFromBlock(ACACIA_SMITHING_TABLE);
    public static final BlockItem MANGROVE_SMITHING_TABLE_I = itemFromBlock(MANGROVE_SMITHING_TABLE);
    public static final BlockItem CHERRY_SMITHING_TABLE_I = itemFromBlock(CHERRY_SMITHING_TABLE);
    public static final BlockItem BAMBOO_SMITHING_TABLE_I = itemFromBlock(BAMBOO_SMITHING_TABLE);
    public static final BlockItem CRIMSON_SMITHING_TABLE_I = itemFromBlock(CRIMSON_SMITHING_TABLE);
    public static final BlockItem WARPED_SMITHING_TABLE_I = itemFromBlock(WARPED_SMITHING_TABLE);

    public static BlockItem itemFromBlock(MoreSmithingTableBlock moreSmithingTableBlock) {
        return new BlockItem(moreSmithingTableBlock, setProperties(moreSmithingTableBlock));
    }

    public static Item.Properties setProperties(MoreSmithingTableBlock moreSmithingTableBlock) {
        return new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM,BuiltInRegistries.BLOCK.getKey(moreSmithingTableBlock))).useBlockDescriptionPrefix();
    }

    public static void registerItems() {
        registerItem(OAK_SMITHING_TABLE_I, Items.SMITHING_TABLE);
        registerItem(DARK_OAK_SMITHING_TABLE_I, OAK_SMITHING_TABLE_I);
        registerItem(SPRUCE_SMITHING_TABLE_I, DARK_OAK_SMITHING_TABLE_I);
        registerItem(BIRCH_SMITHING_TABLE_I, SPRUCE_SMITHING_TABLE_I);
        registerItem(JUNGLE_SMITHING_TABLE_I, BIRCH_SMITHING_TABLE_I);
        registerItem(ACACIA_SMITHING_TABLE_I, JUNGLE_SMITHING_TABLE_I);
        registerItem(MANGROVE_SMITHING_TABLE_I, ACACIA_SMITHING_TABLE_I);
        registerItem(CHERRY_SMITHING_TABLE_I, MANGROVE_SMITHING_TABLE_I);
        registerItem(BAMBOO_SMITHING_TABLE_I, CHERRY_SMITHING_TABLE_I);
        registerItem(CRIMSON_SMITHING_TABLE_I, BAMBOO_SMITHING_TABLE_I);
        registerItem(WARPED_SMITHING_TABLE_I, CRIMSON_SMITHING_TABLE_I);
    }

    private static void registerItem(BlockItem smithingTable, Item smithingTableAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreSmithingTables.asId(((MoreSmithingTableBlock) smithingTable.getBlock()).smithingtableType + "_smithing_table"), smithingTable);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(smithingTableAfter, smithingTable));
    }
}