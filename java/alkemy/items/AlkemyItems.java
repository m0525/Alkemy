package alkemy.items;

import net.minecraft.item.Item;

public class AlkemyItems {
	
	public static Item alchemicalPowder;
	public static Item alchemicalGold;
	
	public static void init(){
		alchemicalPowder = new alchemicalPowder();
		alchemicalGold = new alchemicalGold();
	}
}
