package eu.annsann.flowerpower.client;

import eu.annsann.flowerpower.FlowerPower;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import java.util.Arrays;

import static eu.annsann.flowerpower.Flowers.*;

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
