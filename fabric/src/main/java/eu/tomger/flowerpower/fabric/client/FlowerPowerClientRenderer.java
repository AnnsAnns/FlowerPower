package eu.tomger.flowerpower.fabric.client;

import eu.tomger.flowerpower.FlowerPower;
import eu.tomger.flowerpower.FlowerRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

import java.util.Arrays;

public class FlowerPowerClientRenderer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Arrays.stream(FlowerRegistry.Petals).forEach(blockSupplier -> {
                    var block = blockSupplier.get();
                    BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
                    FlowerPower.LOGGER.debug("Registered block '" + block.toString() + "'.");
                }
        );
    }
}
