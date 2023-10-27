package eu.tomger.flowerpower;

import net.minecraft.block.Block;
import net.minecraft.block.FlowerbedBlock;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class Flowers {
    public static final FlowerbedBlock RED_PETALS = GenericPetalHelper.createNewPetal();
    public static final FlowerbedBlock YELLOW_PETALS = GenericPetalHelper.createNewPetal();
    public static final FlowerbedBlock BLUE_PETALS = GenericPetalHelper.createNewPetal();
    public static final FlowerbedBlock ORCHID_PETALS = GenericPetalHelper.createNewPetal();
    public static final FlowerbedBlock ORANGE_PETALS = GenericPetalHelper.createNewPetal();
    public static final FlowerbedBlock GREY_PETALS = GenericPetalHelper.createNewPetal();
    public static final FlowerbedBlock PINK_PETALS = GenericPetalHelper.createNewPetal();
    public static final FlowerbedBlock WHITE_PETALS = GenericPetalHelper.createNewPetal();
    public static final FlowerbedBlock MAGENTA_PETALS = GenericPetalHelper.createNewPetal();
    public static final FlowerbedBlock BLACK_PETALS = GenericPetalHelper.createNewPetal();

    public static final Block[] Petals = {
            RED_PETALS,
            YELLOW_PETALS,
            BLUE_PETALS,
            ORCHID_PETALS,
            ORANGE_PETALS,
            GREY_PETALS,
            PINK_PETALS,
            WHITE_PETALS,
            MAGENTA_PETALS,
            BLACK_PETALS
    };
}
