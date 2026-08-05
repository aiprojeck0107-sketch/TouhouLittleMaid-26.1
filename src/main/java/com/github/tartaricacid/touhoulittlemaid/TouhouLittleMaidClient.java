package com.github.tartaricacid.touhoulittlemaid;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TouhouLittleMaidClient implements ClientModInitializer {
    public static final Logger LOGGER = LogManager.getLogger(TouhouLittleMaid.MOD_ID + "-client");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing TouhouLittleMaidClient on Fabric");

        // TODO: move client-only registration here (renderers, keybindings, client data, config menu integration)
        // Original code used NeoForge ModContainer and cloth config detection. On Fabric we should use ModMenu/Cloth-Config-Fabric integration
    }
}
