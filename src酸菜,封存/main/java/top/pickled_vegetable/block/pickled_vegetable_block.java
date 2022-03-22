package top.pickled_vegetable.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class pickled_vegetable_block extends Block {
    public pickled_vegetable_block() {
        super(Properties.create(Material.PLANTS).hardnessAndResistance(5));
    }
}