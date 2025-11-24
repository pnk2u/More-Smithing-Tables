package de.pnku.mst;

import de.pnku.mst.init.MstBlockInit;
import de.pnku.mst.init.MstItemInit;
import de.pnku.mst.poi.MstPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;

public class MoreSmithingTables implements ModInitializer {
    public static final String MODID = "lolmst";

    @Override
    public void onInitialize() {
        MstBlockInit.registerBlocks();
        MstItemInit.registerItems();
        MstPointOfInterestTypes.init();
    }

    public static Identifier withModId(String path) {
        return Identifier.tryBuild(MODID, path);
    }
}