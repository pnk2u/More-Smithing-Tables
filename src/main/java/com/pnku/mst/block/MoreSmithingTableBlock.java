package com.pnku.mst.block;

import com.pnku.mst.MoreSmithingTables;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SmithingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreSmithingTableBlock extends SmithingTableBlock {
    public final String smithingtableType;

    public MoreSmithingTableBlock(MapColor colour, String smithingtableType) {
        super(Properties.ofFullCopy(Blocks.SMITHING_TABLE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreSmithingTables.asId(smithingtableType + "_smithing_table"))));
        this.smithingtableType = smithingtableType;
    }

    public MoreSmithingTableBlock(MapColor colour, SoundType sound, String smithingtableType) {
        super(Properties.ofFullCopy(Blocks.SMITHING_TABLE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreSmithingTables.asId(smithingtableType + "_smithing_table"))).sound(sound));
        this.smithingtableType = smithingtableType;
    }
}