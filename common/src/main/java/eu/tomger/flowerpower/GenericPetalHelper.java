package eu.tomger.flowerpower;

import net.minecraft.world.level.block.PinkPetalsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

public class GenericPetalHelper {
    public static PinkPetalsBlock createNewPetal() {
        return new PinkPetalsBlock(
                BlockBehaviour.Properties
                        .of()
                        .noCollission()
                        .sound(SoundType.PINK_PETALS)
                        .pushReaction(PushReaction.DESTROY)
        );
    }

}
