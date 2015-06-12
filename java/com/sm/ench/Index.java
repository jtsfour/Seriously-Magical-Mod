package com.sm.ench;

import java.util.ArrayList;

public class Index {
	
	private ArrayList<NData> ndata = new ArrayList();
	public int[] regids = new int[2000];
	public static int nc = 0;
	
	
	public Index(){
		
	}
	
	
	public void register(int id,String name,String methodName,int nodeGroup,boolean isTrigger,boolean canBlock,boolean canSword,boolean canBow,boolean canAmulet,boolean canMulti,boolean canArmor,boolean canTool,int ttype){
		ndata.add(new NData(id,name,methodName,nodeGroup,isTrigger,canBlock,canSword,canBow,canAmulet,canMulti,canArmor,canTool,ttype));
		regids[nc]=id;
		nc++;
	}
	
	public NData getNDataI(int id){
		NData nd = null;
        boolean loop=true;
		for(int i=0;loop;i++){
			try{
				if(ndata.get(i).getID()==id){
				nd=ndata.get(i);
				loop=false;
			}
			}catch(IndexOutOfBoundsException e){
				System.out.println("CANNOT FIND NDATA");
			}
			
		}
		return nd;
	}
	
	public NData getNDataS(String name){
		NData nd = null;
		boolean loop=true;
		for(int i=0;loop;i++){
			if(ndata.get(i).getName()==name){
				nd=ndata.get(i);
				loop=false;
			}
		}
		return nd;
	}
	
	
	
	
	
	
	
	
	
	
	
	// NODE METHODS
	
	public static void test(NodePar np,NData nd,Node node){
		System.out.println("I WORKED!");
	}
	
	
	
	
	
}
