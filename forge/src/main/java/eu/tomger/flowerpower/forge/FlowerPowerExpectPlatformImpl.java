package eu.tomger.flowerpower.forge;

import eu.tomger.flowerpower.FlowerPowerExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class FlowerPowerExpectPlatformImpl {
    /**
     * This is our actual method to {@link FlowerPowerExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
