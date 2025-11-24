package de.pnku.mst.block;

import de.pnku.mst.MoreSmithingTables;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SmithingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreSmithingTableBlock extends SmithingTableBlock {
    public final String smithingTableType;

    public MoreSmithingTableBlock(MapColor colour, String smithingTableType) {
        super(Properties.ofFullCopy(Blocks.SMITHING_TABLE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreSmithingTables.withModId(smithingTableType + "_smithing_table"))));
        this.smithingTableType = smithingTableType;
    }

    public MoreSmithingTableBlock(MapColor colour, SoundType sound, String smithingTableType) {
        super(Properties.ofFullCopy(Blocks.SMITHING_TABLE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreSmithingTables.withModId(smithingTableType + "_smithing_table"))).sound(sound));
        this.smithingTableType = smithingTableType;
    }
}