package com.sm.ench;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Index {
	
	private ArrayList<NData> ndata = new ArrayList();
	public int[] regids = new int[2000];
	public static int nc = 0;
	
	
	public Index(){
		
	}
	
	
	public NData register(int id,String name,String methodName,int nodeGroup){
		try {
			Method method = Class.forName(Index.class.getName()).getDeclaredMethod(methodName,NodePar.class,NData.class,Node.class);
		}catch(NoSuchMethodException e){
			System.out.println("[ERROR]INVALID METHOD TAG AND/OR PARAMS FOR NODE : "+name+" : "+id);
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		NData nd = new NData(id,name,methodName,nodeGroup);
		ndata.add(nd);
		regids[nc]=id;
		nc++;
		return nd;
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
	
	public static boolean test(NodePar np,NData nd,Node node){
		System.out.println("I WORKED!");
		return true;
	}
	
	
	
	
	
}
