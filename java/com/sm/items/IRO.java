package com.sm.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class IRO {
	private ItemStack ITEM;
	private EntityLivingBase ENTITY;
	
	
	public IRO(ItemStack item, EntityLivingBase obj){
		ITEM=item;
		ENTITY=obj;
	}
}
