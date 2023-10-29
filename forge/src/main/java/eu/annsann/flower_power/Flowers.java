package eu.annsann.flower_power;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PinkPetalsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

import static eu.annsann.flower_power.FlowerPower.BLOCKS;
import static eu.annsann.flower_power.FlowerPower.ITEMS;

public class Flowers {
    public static RegistryObject<Block> registerPetalBlock(String name) {
        return BLOCKS.register(name, () -> new PinkPetalsBlock(BlockBehaviour.Properties.of().sound(SoundType.PINK_PETALS).noCollission()));
    }
    public static RegistryObject<Item> registerPetal(String name, RegistryObject<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
