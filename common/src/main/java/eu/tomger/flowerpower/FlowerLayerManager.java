package eu.tomger.flowerpower;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class FlowerLayerManager {
    public static final FlowerLayerManager INSTANCE = new FlowerLayerManager();

    private static Map<Block, RenderType> blockMap = new HashMap<>();
    private static BiConsumer<Block, RenderType> blockHandler = (block, renderType) -> blockMap.put(block, renderType);
    public static void initialize(BiConsumer<Block, RenderType> blockInput) {
        blockMap.forEach(blockInput);
        blockHandler = blockInput;
    }

    public void putBlock(Block block, RenderType renderLayer) {
        if (block == null) throw new IllegalArgumentException("Request to map null block to BlockRenderLayer");
        if (renderLayer == null) throw new IllegalArgumentException("Request to map block " + block.toString() + " to null BlockRenderLayer");

        blockHandler.accept(block, renderLayer);
    }
}
