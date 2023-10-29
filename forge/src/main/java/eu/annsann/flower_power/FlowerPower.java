package eu.annsann.flower_power;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PinkPetalsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import static eu.annsann.flower_power.Flowers.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FlowerPower.MODID)
public class FlowerPower {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "flower_power";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under
    // the "flower_power" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under
    // the "flower_power" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be
    // registered under the "flower_power" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<Block> YELLOW_PETALS_BLOCK = registerPetalBlock("yellow_petals");
    public static final RegistryObject<Item> YELLOW_PETALS_ITEM = registerPetal("yellow_petals", YELLOW_PETALS_BLOCK);

    public static final RegistryObject<Block> BLACK_PETALS_BLOCK = registerPetalBlock("black_petals");
    public static final RegistryObject<Item> BLACK_PETALS_ITEM = registerPetal("black_petals", BLACK_PETALS_BLOCK);

    public static final RegistryObject<Block> BLUE_PETALS_BLOCK = registerPetalBlock("blue_petals");
    public static final RegistryObject<Item> BLUE_PETALS_ITEM = registerPetal("blue_petals", BLUE_PETALS_BLOCK);

    public static final RegistryObject<Block> GREY_PETALS_BLOCK = registerPetalBlock("grey_petals");
    public static final RegistryObject<Item> GREY_PETALS_ITEM = registerPetal("grey_petals", GREY_PETALS_BLOCK);

    public static final RegistryObject<Block> MAGENTA_PETALS_BLOCK = registerPetalBlock("magenta_petals");
    public static final RegistryObject<Item> MAGENTA_PETALS_ITEM = registerPetal("magenta_petals",
            MAGENTA_PETALS_BLOCK);

    public static final RegistryObject<Block> ORANGE_PETALS_BLOCK = registerPetalBlock("orange_petals");
    public static final RegistryObject<Item> ORANGE_PETALS_ITEM = registerPetal("orange_petals", ORANGE_PETALS_BLOCK);

    public static final RegistryObject<Block> ORCHID_PETALS_BLOCK = registerPetalBlock("orchid_petals");
    public static final RegistryObject<Item> ORCHID_PETALS_ITEM = registerPetal("orchid_petals", ORCHID_PETALS_BLOCK);

    public static final RegistryObject<Block> PINK_PETALS_BLOCK = registerPetalBlock("pink_petals");
    public static final RegistryObject<Item> PINK_PETALS_ITEM = registerPetal("pink_petals", PINK_PETALS_BLOCK);

    public static final RegistryObject<Block> RED_PETALS_BLOCK = registerPetalBlock("red_petals");
    public static final RegistryObject<Item> RED_PETALS_ITEM = registerPetal("red_petals", RED_PETALS_BLOCK);

    public static final RegistryObject<Block> WHITE_PETALS_BLOCK = registerPetalBlock("white_petals");
    public static final RegistryObject<Item> WHITE_PETALS_ITEM = registerPetal("white_petals", WHITE_PETALS_BLOCK);

    // Creates a creative tab with the id "flower_power:example_tab" for the example
    // item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("flower_power",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> YELLOW_PETALS_ITEM.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(YELLOW_PETALS_ITEM.get());
                        output.accept(BLACK_PETALS_ITEM.get());
                        output.accept(BLUE_PETALS_ITEM.get());
                        output.accept(GREY_PETALS_ITEM.get());
                        output.accept(MAGENTA_PETALS_ITEM.get());
                        output.accept(ORANGE_PETALS_ITEM.get());
                        output.accept(ORCHID_PETALS_ITEM.get());
                        output.accept(PINK_PETALS_ITEM.get());
                        output.accept(RED_PETALS_ITEM.get());
                        output.accept(WHITE_PETALS_ITEM.get());
                    }).build());

    public FlowerPower() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the
        // config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
            event.accept(YELLOW_PETALS_ITEM);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods
    // in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
