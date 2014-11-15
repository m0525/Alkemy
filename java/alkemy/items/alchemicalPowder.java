package alkemy.items;

import alkemy.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class alchemicalPowder extends Item {
	
	private String name = "alchemicalPowder";
	
	public alchemicalPowder () {
		GameRegistry.registerItem(this, name);
		this.setUnlocalizedName(Constants.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setTextureName("crafting:AlchemicalPowder");
	}
	
}
