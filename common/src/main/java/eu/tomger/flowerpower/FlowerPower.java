package eu.tomger.flowerpower;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlowerPower {
    public static final String MOD_ID = "flower_power";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void initialize() {
        FlowerRegistry.initialize();
    }
}
