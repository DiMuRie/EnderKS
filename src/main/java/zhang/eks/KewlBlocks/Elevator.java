package zhang.eks.KewlBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import zhang.eks.KewlItems.EKSItemLoader;

public class Elevator extends Block {

	public Elevator() {
		super(Material.iron);
        this.setCreativeTab(EKSItemLoader.tabEKS);
        this.setUnlocalizedName("elevator");
        this.setHardness(0.1F);
        this.setResistance(6.0F);
        this.setStepSound(stepSound.METAL);
	  }
	
}
