package top.pickled_vegetable.block;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "pickled_vegetable");
    public static RegistryObject<Block> pickled_vegetable_block = BLOCKS.register("pickled_vegetable_block", pickled_vegetable_block::new);
}