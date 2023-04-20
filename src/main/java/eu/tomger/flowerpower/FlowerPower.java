package eu.tomger.flowerpower;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class FlowerPower implements ModInitializer {
    public static final FlowerbedBlock RED_PETALS = new FlowerbedBlock(
            AbstractBlock.Settings
                    .of(Material.PLANT)
                    .noCollision()
                    .sounds(BlockSoundGroup.PINK_PETALS)
                    .pistonBehavior(PistonBehavior.DESTROY)
    );
    private static ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier("flower_power", "flower_power"))
            .icon(() -> new ItemStack(Blocks.DAMAGED_ANVIL))
            .build();
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        Registry.register(Registries.BLOCK,
                new Identifier("flower_power", "red_petals"),
                RED_PETALS);
        Registry.register(Registries.ITEM,
                new Identifier("flower_power", "red_petals"),
                new BlockItem(RED_PETALS, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content ->
                content.add(RED_PETALS));
    }
}
