package alkemy;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import alkemy.blocks.AlkemyBlocks;
import alkemy.items.AlkemyItems;
import alkemy.lib.Constants;

@Mod(name=Constants.MODID, modid=Constants.NAME, version=Constants.VERSION)
public class Alkemy {

	@SidedProxy(clientSide="alkemy.ClientProxy", serverSide="alkemy.CommonProxy")
	public static CommonProxy proxy;
	
	public static ToolMaterial enumToolMaterialAlchemists = EnumHelper.addToolMaterial("Alchemists", 2, 500, 7.0F, 3.0F, 16);
	
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
