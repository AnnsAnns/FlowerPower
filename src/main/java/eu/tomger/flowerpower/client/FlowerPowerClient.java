package eu.tomger.flowerpower.client;

import eu.tomger.flowerpower.FlowerPower;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import java.util.Arrays;

import static eu.tomger.flowerpower.FlowerPower.Petals;

public class FlowerPowerClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */

    @Override
    public void onInitializeClient() {
        Arrays.stream(Petals).forEach(
                block -> BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout())
        );
    }
}
