package de.pnku.mst.poi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import de.pnku.mst.init.MstBlockInit;
import de.pnku.mst.mixin.PoiTypesAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MstPointOfInterestTypes {
    public static void init() {
        Map<BlockState, Holder<PoiType>> poiStatesToType = PoiTypesAccessor
                .getPointOfInterestStatesToType();

        Holder<PoiType> toolsmithEntry = BuiltInRegistries.POINT_OF_INTEREST_TYPE
                .getHolder(PoiTypes.TOOLSMITH).get();

        PoiType toolsmithPoiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.get(PoiTypes.TOOLSMITH);

        List<BlockState> toolsmithBlockStates = new ArrayList<BlockState>(toolsmithPoiType.matchingStates);

        for (Block block : MstBlockInit.more_smithing_table_blocks) {
            ImmutableList<BlockState> blockStates = block.getStateDefinition().getPossibleStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, toolsmithEntry);
            }

            toolsmithBlockStates.addAll(blockStates);
        }

        toolsmithPoiType.matchingStates = ImmutableSet.copyOf(toolsmithBlockStates);
    }
}