package mc.z1gned.nme;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModMain implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("nme");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
