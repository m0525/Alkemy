package alkemy.items;

import cpw.mods.fml.common.registry.GameRegistry;
import alkemy.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class alchemicalGold extends Item {

	private String name = "alchemicalGold";
	
	public alchemicalGold(){
		this.setTextureName("crafting:alchemicalGold");
		this.setUnlocalizedName(Constants.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	
}
