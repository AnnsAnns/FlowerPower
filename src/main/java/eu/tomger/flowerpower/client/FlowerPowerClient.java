package eu.tomger.flowerpower.client;

import eu.tomger.flowerpower.FlowerPower;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FlowerPowerClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(FlowerPower.RED_PETALS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FlowerPower.YELLOW_PETALS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FlowerPower.BLUE_PETALS, RenderLayer.getCutout());
    }
}
