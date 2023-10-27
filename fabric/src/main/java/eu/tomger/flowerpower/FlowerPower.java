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

import java.util.Arrays;

import static eu.tomger.flowerpower.Flowers.*;

public class FlowerPower implements ModInitializer {
    public static final String MOD_NAME = "flower_power";
    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(
            RegistryKeys.ITEM_GROUP,
            new Identifier(MOD_NAME, MOD_NAME + "_group")
    );

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        GenericPetalHelper.registerPetal("red_petals", RED_PETALS);
        GenericPetalHelper.registerPetal("yellow_petals", YELLOW_PETALS);
        GenericPetalHelper.registerPetal("blue_petals", BLUE_PETALS);
        GenericPetalHelper.registerPetal("orchid_petals", ORCHID_PETALS);
        GenericPetalHelper.registerPetal("orange_petals", ORANGE_PETALS);
        GenericPetalHelper.registerPetal("grey_petals", GREY_PETALS);
        GenericPetalHelper.registerPetal("pink_petals", PINK_PETALS);
        GenericPetalHelper.registerPetal("white_petals", WHITE_PETALS);
        GenericPetalHelper.registerPetal("magenta_petals", MAGENTA_PETALS);
        GenericPetalHelper.registerPetal("black_petals", BLACK_PETALS);

        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.flower_power.flower_power"))
                .icon(() -> new ItemStack(Blocks.TORCHFLOWER))
                .entries((context, entries) -> Arrays.stream(Petals).forEach(entries::add))
                .build());
    }
}
