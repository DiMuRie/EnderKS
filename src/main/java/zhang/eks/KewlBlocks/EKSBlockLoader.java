package zhang.eks.KewlBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zhang.eks.EnderKewlStuff;
import zhang.eks.EnderKewlStuffLib;

public class EKSBlockLoader {

	public static Elevator Elevator;

    public static void init() {
        Elevator = new Elevator();
    }
    
    public static void register()
    {
    	GameRegistry.registerBlock(Elevator, Elevator.getUnlocalizedName().substring(5));
    }
    public static void registerRenders()
    {
    	registerRender(Elevator);
    }
    
    public static void registerRender(Block block)
    {
    	Item item = Item.getItemFromBlock(block);
    	//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(EnderKewlStuffLib.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
    
	
}
