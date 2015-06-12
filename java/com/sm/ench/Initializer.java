package com.sm.ench;

public class Initializer {

	
	
	public static Index INDEX;
	
	public Initializer(){
		INDEX=new Index();
		
		
		//Nodes
		regNode(1001, "Test", "test", 1, true, true, true, true, true, true, true, true, 0);
		
		
		
	}
	
	
	private void regNode(int id,String name,String methodName,int nodeGroup,boolean isTrigger,boolean canBlock,boolean canSword,boolean canBow,boolean canAmulet,boolean canMulti,boolean canArmor,boolean canTool,int ttype){
		INDEX.register(id,name,methodName,nodeGroup,isTrigger,canBlock,canSword,canBow,canAmulet,canMulti,canArmor,canTool,ttype);
	}
	
}
