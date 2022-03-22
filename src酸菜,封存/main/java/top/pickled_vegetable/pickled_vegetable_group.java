package top.pickled_vegetable;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import top.pickled_vegetable.item.ItemRegistry;

public class pickled_vegetable_group extends ItemGroup {
    public pickled_vegetable_group() {
        super("pickled_vegetable_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.pickled_vegetable.get());
    }
}
