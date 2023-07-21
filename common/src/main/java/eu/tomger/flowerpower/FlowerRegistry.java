package eu.tomger.flowerpower;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PinkPetalsBlock;

import java.util.Arrays;
import java.util.function.Supplier;

public class FlowerRegistry {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(FlowerPower.MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final Supplier<CreativeModeTab> CREATIVE_TAB = TABS.register(FlowerPower.MOD_ID + "_group", () -> CreativeTabRegistry.create(Component.translatable("itemGroup.flower_power.flower_power"),() -> new ItemStack(Blocks.TORCHFLOWER)));

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(FlowerPower.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(FlowerPower.MOD_ID, Registries.BLOCK);

    public static final Supplier<PinkPetalsBlock> RED_PETALS_BLOCK = BLOCKS.register("red_petals", GenericPetalHelper::createNewPetal);
    public static final Supplier<BlockItem> RED_PETALS_ITEM = ITEMS.register("red_petals", () -> new BlockItem(RED_PETALS_BLOCK.get(), new Item.Properties().arch$tab(CREATIVE_TAB.get())));
    public static final Supplier<PinkPetalsBlock> YELLOW_PETALS_BLOCK = BLOCKS.register("yellow_petals", GenericPetalHelper::createNewPetal);
    public static final Supplier<BlockItem> YELLOW_PETALS_ITEM = ITEMS.register("yellow_petals", () -> new BlockItem(YELLOW_PETALS_BLOCK.get(), new Item.Properties().arch$tab(CREATIVE_TAB.get())));
    public static final Supplier<PinkPetalsBlock> BLUE_PETALS_BLOCK = BLOCKS.register("blue_petals", GenericPetalHelper::createNewPetal);
    public static final Supplier<BlockItem> BLUE_PETALS_ITEM = ITEMS.register("blue_petals", () -> new BlockItem(BLUE_PETALS_BLOCK.get(), new Item.Properties().arch$tab(CREATIVE_TAB.get())));
    public static final Supplier<PinkPetalsBlock> ORCHID_PETALS_BLOCK = BLOCKS.register("orchid_petals", GenericPetalHelper::createNewPetal);
    public static final Supplier<BlockItem> ORCHID_PETALS_ITEM = ITEMS.register("orchid_petals", () -> new BlockItem(ORCHID_PETALS_BLOCK.get(), new Item.Properties().arch$tab(CREATIVE_TAB.get())));
    public static final Supplier<PinkPetalsBlock> ORANGE_PETALS_BLOCK = BLOCKS.register("orange_petals", GenericPetalHelper::createNewPetal);
    public static final Supplier<BlockItem> ORANGE_PETALS_ITEM = ITEMS.register("orange_petals", () -> new BlockItem(ORANGE_PETALS_BLOCK.get(), new Item.Properties().arch$tab(CREATIVE_TAB.get())));
    public static final Supplier<PinkPetalsBlock> GREY_PETALS_BLOCK = BLOCKS.register("grey_petals", GenericPetalHelper::createNewPetal);
    public static final Supplier<BlockItem> GREY_PETALS_ITEM = ITEMS.register("grey_petals", () -> new BlockItem(GREY_PETALS_BLOCK.get(), new Item.Properties().arch$tab(CREATIVE_TAB.get())));
    public static final Supplier<PinkPetalsBlock> PINK_PETALS_BLOCK = BLOCKS.register("pink_petals", GenericPetalHelper::createNewPetal);
    public static final Supplier<BlockItem> PINK_PETALS_ITEM = ITEMS.register("pink_petals", () -> new BlockItem(PINK_PETALS_BLOCK.get(), new Item.Properties().arch$tab(CREATIVE_TAB.get())));
    public static final Supplier<PinkPetalsBlock> WHITE_PETALS_BLOCK = BLOCKS.register("white_petals", GenericPetalHelper::createNewPetal);
    public static final Supplier<BlockItem> WHITE_PETALS_ITEM = ITEMS.register("white_petals", () -> new BlockItem(WHITE_PETALS_BLOCK.get(), new Item.Properties().arch$tab(CREATIVE_TAB.get())));
    public static final Supplier<PinkPetalsBlock> MAGENTA_PETALS_BLOCK = BLOCKS.register("magenta_petals", GenericPetalHelper::createNewPetal);
    public static final Supplier<BlockItem> MAGENTA_PETALS_ITEM = ITEMS.register("magenta_petals", () -> new BlockItem(MAGENTA_PETALS_BLOCK.get(), new Item.Properties().arch$tab(CREATIVE_TAB.get())));
    public static final Supplier<PinkPetalsBlock> BLACK_PETALS_BLOCK = BLOCKS.register("black_petals", GenericPetalHelper::createNewPetal);
    public static final Supplier<BlockItem> BLACK_PETALS_ITEM = ITEMS.register("black_petals", () -> new BlockItem(BLACK_PETALS_BLOCK.get(), new Item.Properties().arch$tab(CREATIVE_TAB.get())));

    public static Supplier<PinkPetalsBlock>[] Petals = new Supplier[]{
            RED_PETALS_BLOCK,
            YELLOW_PETALS_BLOCK,
            BLUE_PETALS_BLOCK,
            ORCHID_PETALS_BLOCK,
            ORANGE_PETALS_BLOCK,
            GREY_PETALS_BLOCK,
            PINK_PETALS_BLOCK,
            WHITE_PETALS_BLOCK,
            MAGENTA_PETALS_BLOCK,
            BLACK_PETALS_BLOCK
    };

    public static void initialize() {
        TABS.register();
        BLOCKS.register();
        ITEMS.register();

    }
}
