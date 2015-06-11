package com.sm.ench;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class Node {
	
	public static int ID;
	public static int TYPE;
	private static Ench ENCH;
	public boolean hasID=false;
	public static int[] links = new int[100];
	public static int PARENT=0;
	public boolean hasParent=false;
	private int lc=0;
	
	//Type variables
	public static boolean isTrigger = false;
	
	
	public Node(int type,int parent,Ench ench){
		TYPE=type;
		ENCH=ench;
		ID=ENCH.regNode(this);
		hasID=true;
		ENCH.setTreeP(parent,this);
	}
	
	protected boolean addLink(int id){
		boolean b=true;
		try{
			links[lc]=id;
			lc++;	
		}catch(Exception e){
			b=false;
		}
		
		return b;
	}
	public boolean removelink(int id){
		boolean loop=true;
		boolean r=false;
		boolean f=false;
		for(int i=0;loop;i++){
			try{
				if(f){
					links[i-1]=links[i];
					links[i]=0;
						}
			}catch(Exception e){
				r=true;
				loop=false;
				}
			try{
				if(links[i]==id){
					f=true;
					links[i]=0;
				}	
			}catch(Exception e){
				r=false;
				loop=false;
			}
			}
			return r;
		}
	
	public void setParent(int id){
		PARENT=id;
		hasParent=true;
	}
	
	public void perfAction(World world,EntityLivingBase entity,double x,double y,double z){
		
	}
	
	
	
	
	
	
	
}