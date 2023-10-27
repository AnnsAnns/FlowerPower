package eu.annsann.flowerpower;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowerbedBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static eu.annsann.flowerpower.FlowerPower.*;

public class GenericPetalHelper {
    public static FlowerbedBlock createNewPetal() {
        return new FlowerbedBlock(
                AbstractBlock.Settings
                        .create()
                        .noCollision()
                        .sounds(BlockSoundGroup.PINK_PETALS)
                        .pistonBehavior(PistonBehavior.DESTROY)
        );
    }

    public static void registerPetal(String name, FlowerbedBlock entry) {
        Registry.register(Registries.BLOCK,
                new Identifier(MOD_NAME, name),
                entry);
        Registry.register(Registries.ITEM,
                new Identifier(MOD_NAME, name),
                new BlockItem(entry, new FabricItemSettings()));
    }

}
