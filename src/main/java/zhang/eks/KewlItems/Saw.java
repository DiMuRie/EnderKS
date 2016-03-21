package zhang.eks.KewlItems;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Saw extends ItemSpade {

	public Saw(ToolMaterial bhod) {
		super(bhod);
        setRegistryName("saw");
        setUnlocalizedName("saw");     
        GameRegistry.registerItem(this);
        setCreativeTab(EKSItemLoader.tabEKS);
        setMaxStackSize(1);
	
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4)
    {
    par3List.add("I saw a saw!");
    }
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
	par3EntityPlayer.capabilities.allowFlying = true;
	par3EntityPlayer.capabilities.setFlySpeed(0.15F);
	par3EntityPlayer.capabilities.setPlayerWalkSpeed(0.15F);
		 return par1ItemStack;
	}
	
}
