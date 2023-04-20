package eu.tomger.flowerpower;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FlowerPower implements ModInitializer {
    public static final FlowerbedBlock RED_PETALS = GenericPetalHelper.createNewPetal();
    public static final FlowerbedBlock YELLOW_PETALS = GenericPetalHelper.createNewPetal();
    public static final String MOD_NAME = "flower_power";
    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(
            RegistryKeys.ITEM_GROUP,
            new Identifier(MOD_NAME, MOD_NAME+"_group")
    );

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        GenericPetalHelper.registerPetal("red_petals", RED_PETALS);
        GenericPetalHelper.registerPetal("yellow_petals", YELLOW_PETALS);

        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder(
                )
                .displayName(Text.translatable("itemGroup.flower_power.flower_power"))
                .icon(() -> new ItemStack(Blocks.TORCHFLOWER))
                .entries((context, entries) -> {
                    entries.add(RED_PETALS);
                    entries.add(YELLOW_PETALS);
                })
                .build());
    }
}
