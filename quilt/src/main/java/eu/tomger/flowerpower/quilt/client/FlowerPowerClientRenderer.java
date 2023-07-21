package eu.tomger.flowerpower.quilt.client;

import eu.tomger.flowerpower.FlowerPower;
import eu.tomger.flowerpower.FlowerRegistry;
import net.minecraft.client.renderer.RenderType;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

import java.util.Arrays;

public class FlowerPowerClientRenderer implements ClientModInitializer {
    @Override
    public void onInitializeClient(ModContainer mod) {
        Arrays.stream(FlowerRegistry.Petals).forEach(blockSupplier -> {
                var block = blockSupplier.get();
                BlockRenderLayerMap.put(RenderType.cutout(), block);
                FlowerPower.LOGGER.info("Registered block '" + block.getName().getString() + "'.");
            }
        );
    }
}
