package eu.tomger.flowerpower.quilt;

import eu.tomger.flowerpower.FlowerPowerExpectPlatform;
import org.quiltmc.loader.api.QuiltLoader;

import java.nio.file.Path;

public class FlowerPowerExpectPlatformImpl {
    /**
     * This is our actual method to {@link FlowerPowerExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}
