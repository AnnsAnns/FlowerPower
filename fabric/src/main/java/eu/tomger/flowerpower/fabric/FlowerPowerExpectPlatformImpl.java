package eu.tomger.flowerpower.fabric;

import eu.tomger.flowerpower.FlowerPowerExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class FlowerPowerExpectPlatformImpl {
    /**
     * This is our actual method to {@link FlowerPowerExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
