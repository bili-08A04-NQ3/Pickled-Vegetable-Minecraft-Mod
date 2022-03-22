package top.pickled_vegetable;
//https://blockbench.net/
//https://harbinger.covertdragon.team
//https://neutrino.v2mcdev.com/introducation/intro.html
//https://zhangshenxing.gitee.io/vanillamodtutorial/#2.4_进度
/*
[18:42:17] [Render thread/INFO] [minecraft/Minecraft]: Setting user: Dev
[18:42:20] [pool-3-thread-1/DEBUG] [ne.mi.co.tr.CoreModBaseTransformer/COREMOD]: Transforming net/minecraft/block/FlowingFluidBlock
[18:42:21] [pool-3-thread-1/DEBUG] [ne.mi.co.tr.CoreModBaseTransformer/COREMOD]: Transforming net/minecraft/block/StairsBlock
[18:42:22] [pool-3-thread-1/DEBUG] [ne.mi.co.tr.CoreModBaseTransformer/COREMOD]: Transforming net/minecraft/block/FlowerPotBlock
[18:42:45] [pool-3-thread-1/DEBUG] [ne.mi.co.tr.CoreModBaseTransformer/COREMOD]: Transforming net/minecraft/item/BucketItem
[18:42:45] [pool-3-thread-1/DEBUG] [ne.mi.co.tr.CoreModBaseTransformer/COREMOD]: Transforming net/minecraft/item/FishBucketItem
[18:42:47] [pool-3-thread-1/DEBUG] [ne.mi.co.tr.CoreModBaseTransformer/COREMOD]: Transforming net/minecraft/potion/EffectInstance
 */
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.pickled_vegetable.item.ItemRegistry;
import top.pickled_vegetable.block.BlockRegistry;

@Mod("pickled_vegetable")
public class Main {
    public Main() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}