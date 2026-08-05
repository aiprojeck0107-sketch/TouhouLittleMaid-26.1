package com.github.tartaricacid.touhoulittlemaid;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class TouhouLittleMaid implements ModInitializer {
    public static final String MOD_ID = "touhou_little_maid";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing TouhouLittleMaid on Fabric (Java 21)");

        // TODO: migrate registration logic from NeoForge IEventBus style to Fabric Registry API.
        // The original code used Init* classes that call .register(eventBus).
        // For a full migration we need to replace those registration calls with Registry.register(...) or Fabric API helper calls.
        // For now this is a placeholder to be iteratively completed.
    }
}
