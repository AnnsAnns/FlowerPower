package eu.tomger.fabric;

import eu.tomger.FlowerPower;
import net.fabricmc.api.ModInitializer;

public class FlowerPowerFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FlowerPower.init();
    }
}
