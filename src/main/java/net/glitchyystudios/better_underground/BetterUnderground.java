package net.glitchyystudios.better_underground;

import net.fabricmc.api.ModInitializer;
import net.glitchyystudios.better_underground.registry.BlockRegistry;
import net.glitchyystudios.better_underground.registry.ItemRegistry;
import net.glitchyystudios.better_underground.worldgen.CustomConfiguredFeatures;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class BetterUnderground implements ModInitializer {

	public static final String MOD_ID = "better_underground";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRegistry.register();
		ItemRegistry.register();
		CustomConfiguredFeatures.register();
		System.out.println("THANKS FOR CONTRIBUTING, CONTRIBUTORS");
		System.out.println("HOW MINECRAFT GOT ME INTO CODING");

		LOGGER.info("[Better Underground] has finished initializing!");
	}

}