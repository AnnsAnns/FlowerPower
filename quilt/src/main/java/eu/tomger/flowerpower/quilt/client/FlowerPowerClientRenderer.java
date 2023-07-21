package eu.tomger.flowerpower.quilt.client;

import eu.tomger.flowerpower.FlowerPower;
import eu.tomger.flowerpower.FlowerRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.RenderType;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

import java.util.Arrays;

public class FlowerPowerClientRenderer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Arrays.stream(FlowerRegistry.Petals).forEach(blockSupplier -> {
                var block = blockSupplier.get();
                BlockRenderLayerMap.put(RenderType.cutout(), block);
                FlowerPower.LOGGER.info("Registered block '" + block.getName().getString() + "'.");
            }
        );
    }
}
