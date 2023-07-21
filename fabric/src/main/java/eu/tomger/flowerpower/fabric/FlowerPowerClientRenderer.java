package eu.tomger.flowerpower.fabric;

import eu.tomger.flowerpower.FlowerLayerManager;
import eu.tomger.flowerpower.FlowerPower;
import eu.tomger.flowerpower.FlowerRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.RenderType;

import java.util.Arrays;

public class FlowerPowerClientRenderer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Arrays.stream(FlowerRegistry.Petals).forEach(blockSupplier -> {
                    var block = blockSupplier.get();
                    FlowerLayerManager.INSTANCE.putBlock(block, RenderType.cutout());
                    FlowerPower.LOGGER.info("Registered block '" + block.getName().getString() + "'.");
                }
        );
    }
}
