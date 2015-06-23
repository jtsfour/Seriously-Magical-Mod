package com.sm.items;

import com.sm.ench.EnchEventHandler;
import com.sm.ench.Ench;
import com.sm.ench.Node;
import com.sm.main.Instances;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;


public class EItem {
	
	private EnchEventHandler EHandler;
	private Ench Ench;
	private ItemStack Item;
	
	public EItem(ItemStack item){
		EHandler=Instances.getEnchEH();
		Item=item;
		Ench=loadEnch(Item.getTagCompound());
	}
	
	public EItem(ItemStack item,Ench ench){
		EHandler=Instances.getEnchEH();
		Item=item;
		Ench=ench;
	}
	
	public Ench loadEnch(NBTTagCompound nbt){
		Ench ench = null;
		    	if(nbt.getBoolean("enchb0")){
		    		//Object obj,int nextId,int process
		    		int nextId=nbt.getInteger("enchi0");
		    		int process=nbt.getInteger("enchi1");
		    		int ni=nbt.getInteger("enchi2");
		    		ench = new Ench(this,nextId,process);
		    		int id = 0;
		    		int type = 0;
		    		int parent = 0;
		    		int[] links;
		    		for(int i=0;i<ni;i++){
		    			id=nbt.getInteger("enchn"+i+"i0");
		    			type=nbt.getInteger("enchn"+i+"i1");
		    			parent=nbt.getInteger("enchn"+i+"i2");
		    			links=nbt.getIntArray("enchn"+i+"ia0");
		    			Ench.addNode(new Node(id,type,parent,ench,links));
		    		}
		    	}	
		 return ench;
	}
	
	
	
	
	
}