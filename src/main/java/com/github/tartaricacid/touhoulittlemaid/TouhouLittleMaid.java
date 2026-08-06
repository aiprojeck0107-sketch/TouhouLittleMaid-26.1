package com.github.tartaricacid.touhoulittlemaid;

import com.github.tartaricacid.touhoulittlemaid.entity.info.CommonDefaultPack;
import com.github.tartaricacid.touhoulittlemaid.init.InitBlocks;
import com.github.tartaricacid.touhoulittlemaid.init.InitEntities;
import com.github.tartaricacid.touhoulittlemaid.init.InitItems;
import com.github.tartaricacid.touhoulittlemaid.init.InitSounds;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class TouhouLittleMaid implements ModInitializer {
    public static final String MOD_ID = "touhou_little_maid";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing TouhouLittleMaid on Fabric (Java 21)");

        // Register core game content
        InitBlocks.registerAll();
        InitItems.registerAll();
        InitEntities.registerAll();
        InitSounds.registerAll();

        // Initialize default packs
        CommonDefaultPack.initCommonDefaultPack();

        // TODO: migrate remaining Init* classes, event handlers, network handlers and compat modules.
    }
}
