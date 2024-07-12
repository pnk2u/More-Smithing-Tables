package com.pnku.mst.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SmithingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreSmithingTableBlock extends SmithingTableBlock {
    public final String smithingtableType;

    public MoreSmithingTableBlock(MapColor colour, String smithingtableType) {
        super(Properties.copy(Blocks.SMITHING_TABLE).mapColor(colour));
        this.smithingtableType = smithingtableType;
    }

    public MoreSmithingTableBlock(MapColor colour, SoundType sound, String smithingtableType) {
        super(Properties.copy(Blocks.SMITHING_TABLE).mapColor(colour).sound(sound));
        this.smithingtableType = smithingtableType;
    }
}