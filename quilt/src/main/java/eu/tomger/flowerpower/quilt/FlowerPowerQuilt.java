package eu.tomger.flowerpower.quilt;

import eu.tomger.flowerpower.FlowerPower;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class FlowerPowerQuilt implements ModInitializer {

    @Override
    public void onInitialize(ModContainer mod) {
        FlowerPower.initialize();
    }
}
