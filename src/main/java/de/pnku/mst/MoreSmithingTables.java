package de.pnku.mst;

import de.pnku.mst.init.MstBlockInit;
import de.pnku.mst.init.MstItemInit;
import de.pnku.mst.poi.MstPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class MoreSmithingTables implements ModInitializer {
    public static final String MODID = "lolmst";

    @Override
    public void onInitialize() {
        MstBlockInit.registerBlocks();
        MstItemInit.registerItems();
        MstPointOfInterestTypes.init();
    }

    public static ResourceLocation withModId(String path) {
        return ResourceLocation.tryBuild(MODID, path);
    }
}