package eu.tomger.flowerpower;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class FlowerPower implements ModInitializer {
    public static final FlowerbedBlock RED_PETALS = GenericPetalHelper.createNewPetal();
    public static final FlowerbedBlock YELLOW_PETALS = GenericPetalHelper.createNewPetal();
    public static final String MOD_NAME = "flower_power";
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(
            new Identifier(MOD_NAME, MOD_NAME))
                .icon(() -> new ItemStack(Blocks.TORCHFLOWER))
                .build();
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        GenericPetalHelper.registerPetal("red_petals", RED_PETALS);
        GenericPetalHelper.registerPetal("yellow_petals", YELLOW_PETALS);
    }
}
