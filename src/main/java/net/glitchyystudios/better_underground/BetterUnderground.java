package net.glitchyystudios.better_underground;

import net.fabricmc.api.ModInitializer;
import net.glitchyystudios.better_underground.registry.BlockRegistry;
import net.glitchyystudios.better_underground.registry.ItemRegistry;
import net.glitchyystudios.better_underground.worldgen.CustomConfiguredFeatures;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BetterUnderground implements ModInitializer {

	public static final String MOD_ID = "better_underground";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRegistry.register();
		ItemRegistry.register();
		CustomConfiguredFeatures.register();
		LOGGER.info("[Better Underground] has finished initializing!");
	}

}