package top.pickled_vegetable.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class pickled_vegetable_noodle extends Item {
    private static EffectInstance effectInstance = new EffectInstance(Effects.POISON, 3 * 20, 1);
    private static Food food = (new Food.Builder())
            .saturation(10)
            .hunger(20)
            .effect(effectInstance, 1)
            .build();

    public pickled_vegetable_noodle() {
        super(new Properties().food(food).group(ModGroup.itemGroup));
    }
}
