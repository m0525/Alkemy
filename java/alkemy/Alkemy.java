package alkemy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import alkemy.blocks.AlkemyBlocks;
import alkemy.items.AlkemyItems;
import alkemy.lib.Constants;

@Mod(name=Constants.MODID, modid=Constants.NAME, version=Constants.VERSION)
public class Alkemy {

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		AlkemyBlocks.init();
		AlkemyItems.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
