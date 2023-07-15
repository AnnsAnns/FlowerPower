package eu.tomger.forge;

import dev.architectury.platform.forge.EventBuses;
import eu.tomger.FlowerPower;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FlowerPower.MOD_ID)
public class FlowerPowerForge {
    public FlowerPowerForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(FlowerPower.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        FlowerPower.init();
    }
}
