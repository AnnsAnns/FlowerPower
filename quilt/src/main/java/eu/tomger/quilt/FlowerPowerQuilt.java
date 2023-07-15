package eu.tomger.quilt;

import eu.tomger.FlowerPower;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class FlowerPowerQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        FlowerPower.init();
    }
}
