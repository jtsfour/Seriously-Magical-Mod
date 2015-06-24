package com.sm.items;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;

import com.sm.ench.EnchEventHandler;
import com.sm.main.Instances;

public class EItemHandler {
	
	private EnchEventHandler ENCHEH;
	private ArrayList<EntityPlayer> players = new ArrayList<EntityPlayer>();
	
	public EItemHandler(){
		Instances.setEIHandler(this);
		ENCHEH=Instances.getEnchEH();
		ENCHEH.setEIH(this);
	}
	
	public void updatePlayer(EntityPlayer p){
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
