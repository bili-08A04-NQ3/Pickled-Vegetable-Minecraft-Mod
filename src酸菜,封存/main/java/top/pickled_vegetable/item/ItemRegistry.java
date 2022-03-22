package top.pickled_vegetable.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.pickled_vegetable.block.BlockRegistry;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "pickled_vegetable");
    public static RegistryObject<Item> pickled_vegetable = ITEMS.register("pickled_vegetable", () -> {
        return new pickled_vegetable();
    });
    public static RegistryObject<Item> pickled_vegetable_pack = ITEMS.register("pickled_vegetable_pack", () -> {
        return new pickled_vegetable_pack();
    });
    public static RegistryObject<Item> pickled_vegetable_noodle = ITEMS.register("pickled_vegetable_noodle", () -> {
        return new pickled_vegetable_noodle();
    });
    public static RegistryObject<Item> pickled_vegetable_block = ITEMS.register("pickled_vegetable_block", () -> {
        return new BlockItem(BlockRegistry.pickled_vegetable_block.get(), new Item.Properties().group(ModGroup.itemGroup));
    });
}