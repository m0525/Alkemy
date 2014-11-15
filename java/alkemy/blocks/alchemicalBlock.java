package alkemy.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import alkemy.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class alchemicalBlock extends Block {
	
	private String name = "alchemicalBlock";
	
	public alchemicalBlock() {
		super(Material.rock);
		this.setBlockName(Constants.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerBlock(this, name);
		this.setBlockTextureName("crafting:alchemicalGoldBlock");
	}
	
}
