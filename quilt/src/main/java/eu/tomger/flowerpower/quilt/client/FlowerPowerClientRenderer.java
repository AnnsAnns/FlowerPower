package eu.tomger.flowerpower.quilt.client;

import eu.tomger.flowerpower.FlowerLayerManager;
import eu.tomger.flowerpower.FlowerPower;
import eu.tomger.flowerpower.FlowerRegistry;
import net.minecraft.client.renderer.RenderType;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

import java.util.Arrays;

public class FlowerPowerClientRenderer implements ClientModInitializer {
    @Override
    public void onInitializeClient(ModContainer mod) {
        Arrays.stream(FlowerRegistry.Petals).forEach(blockSupplier -> {
                    var block = blockSupplier.get();
                    FlowerLayerManager.INSTANCE.putBlock(block, RenderType.cutout());
                    FlowerPower.LOGGER.info("Registered block '" + block.getName().getString() + "'.");
                }
        );
    }
}
