package com.sm.main;

import com.sm.ench.Index;
import com.sm.ench.NData;

public class Initializer {

	
	
	public static Index INDEX;
	
	public Initializer(Index ind){
		System.out.println("Registering Ench Nodes");
		INDEX=ind;
		
		
		//Nodes
		regNode(1001, "Test", "test", 1).setCanBeLinked(true);
		
		System.out.println("Ench Nodes Successfully Registered");
	}
	
	
	private NData regNode(int id,String name,String methodName,int nodeGroup){
		NData nd = INDEX.register(id,name,methodName,nodeGroup);
		return nd;
	}
	
}
