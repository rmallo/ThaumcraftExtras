 package thaumcraftextras.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class WardedItemBlock extends ItemBlock
{
       public WardedItemBlock(int par1)
       {
             super(par1);
             setHasSubtypes(true);
       }
      
       /**
        * 0 = White
        * 1 = Red
        * 2 = Blue
        * 3 = Green
        * 4 = Yellow
        * 5 = Brown
        * 6 = Cyan
        * 7 = Gray
        * 8 = Orange
        * 9 = Pink
        * 10 = Purple
        */
       public String getUnlocalizedName(ItemStack itemstack)
       {
             String name = "";
             switch(itemstack.getItemDamage())
             {
             case 0: name = "white"; 
             break;
             case 1: name = "red";
             break;
             case 2: name = "blue";
             break;
             case 3: name = "green";
             break;
             case 4: name = "yellow";
             break;
             case 5: name = "brown";
             break;
             case 6: name = "cyan";
             break;
             case 7: name = "gray";
             break;
             case 8: name = "orange";
             break;
             case 9: name = "pink";
             break;
             case 10: name = "purple";
             break;
             default: name = "white";
             }
             return "tce.warded." + name;
       }
      
       public int getMetadata(int par1)
       {
             return par1;
       }
}