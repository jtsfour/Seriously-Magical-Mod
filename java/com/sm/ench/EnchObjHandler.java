package com.sm.ench;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;

import com.sm.items.IRO;
import com.sm.main.Instances;

public class EnchObjHandler {
	
	private Instances INST;
	private EnchEventHandler EEH;
	private Index INDEX;
	
	public ArrayList<EntityPlayer> players = new ArrayList<EntityPlayer>();
	public ArrayList<TileEntity> eblocks = new ArrayList<TileEntity>();
	public ArrayList<IRO> eitems = new ArrayList<IRO>();
	
	public EnchObjHandler(){
		INST=Instances.getInstance();
		EEH=INST.getEnchEH();
		INDEX=INST.getIndex();
	}
	
	
}
