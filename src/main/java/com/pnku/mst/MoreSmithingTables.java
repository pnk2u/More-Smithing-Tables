package com.pnku.mst;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class MoreSmithingTables implements ModInitializer {
    public static final String MODID = "lolmst";

    @Override
    public void onInitialize() {
        com.pnku.mst.init.MstBlockInit.registerBlocks();
        com.pnku.mst.init.MstItemInit.registerItems();
        com.pnku.mst.poi.MstPointOfInterestTypes.init();
    }

    public static ResourceLocation asId(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}