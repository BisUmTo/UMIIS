package it.bisumto.umiis;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Umiis implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("UMIIS");

    @Override
    public void onInitialize() {
        LOGGER.info("Mod loaded");
    }
}
