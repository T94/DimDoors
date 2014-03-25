package StevenDimDoors.mod_pocketDim.items;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import StevenDimDoors.mod_pocketDim.mod_pocketDim;
import StevenDimDoors.mod_pocketDim.blocks.BaseDimDoor;

public class ItemDimensionalDoor extends BaseItemDoor
{
	public ItemDimensionalDoor(int itemID, Material material)
	{
		super(itemID, material);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("Place on the block under a rift");
		par3List.add("to activate that rift or place");
		par3List.add("anywhere else to create a");
		par3List.add("pocket dimension.");
	}

	@Override
	protected BaseDimDoor getDoortoItemMapping()
	{
		return (BaseDimDoor) mod_pocketDim.dimensionalDoor;
	}
}