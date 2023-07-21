package eu.tomger.flowerpower;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.platform.Platform;

import java.nio.file.Path;

public class FlowerPowerExpectPlatform {
    /**
     * We can use {@link Platform#getConfigFolder()} but this is just an example of {@link ExpectPlatform}.
     * <p>
     * This must be a <b>public static</b> method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with {@code Impl}.
     * <p>
     * Example:
     * Expect: eu.tomger.flowerpower.FlowerPowerExpectPlatform#getConfigDirectory()
     * Actual Fabric: eu.tomger.flowerpower.fabric.FlowerPowerExpectPlatformImpl#getConfigDirectory()
     * Actual Forge: eu.tomger.flowerpower.forge.FlowerPowerExpectPlatformImpl#getConfigDirectory()
     * Actual Quilt: eu.tomger.flowerpower.quilt.FlowerPowerExpectPlatformImpl#getConfigDirectory()
     * <p>
     * <a href="https://plugins.jetbrains.com/plugin/16210-architectury">You should also get the IntelliJ plugin to help with @ExpectPlatform.</a>
     */
    @ExpectPlatform
    public static Path getConfigDirectory() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }
}
