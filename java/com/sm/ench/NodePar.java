package com.sm.ench;

import java.util.ArrayList;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class NodePar {
	public World world;
	public Object origin;
	public ArrayList<EntityLivingBase> entitiesaffected = new ArrayList();
	public double x;
	public double y;
	public double z;
	
	
	
	
	public NodePar(World wor, Object or, EntityLivingBase... ents){
		
	}
}
