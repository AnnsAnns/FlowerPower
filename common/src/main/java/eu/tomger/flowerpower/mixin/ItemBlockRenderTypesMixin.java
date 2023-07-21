package eu.tomger.flowerpower.mixin;

import eu.tomger.flowerpower.FlowerLayerManager;
import eu.tomger.flowerpower.FlowerRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Arrays;
import java.util.Map;

@Environment(EnvType.CLIENT)
@Mixin(ItemBlockRenderTypes.class)
public class ItemBlockRenderTypesMixin {
    @Shadow
    @Final
    private static Map<Block, RenderType> TYPE_BY_BLOCK;

    @Inject(method = "<clinit>*", at = @At("RETURN"))
    private static void onInitialize(CallbackInfo info) {
        FlowerLayerManager.initialize(TYPE_BY_BLOCK::put);
    }
}