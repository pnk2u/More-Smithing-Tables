package de.pnku.mst.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SmithingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreSmithingTableBlock extends SmithingTableBlock {
    public final String smithingTableType;

    public MoreSmithingTableBlock(MapColor colour, String smithingTableType) {
        super(Properties.copy(Blocks.SMITHING_TABLE).mapColor(colour));
        this.smithingTableType = smithingTableType;
    }

    public MoreSmithingTableBlock(MapColor colour, SoundType sound, String smithingTableType) {
        super(Properties.copy(Blocks.SMITHING_TABLE).mapColor(colour).sound(sound));
        this.smithingTableType = smithingTableType;
    }
}