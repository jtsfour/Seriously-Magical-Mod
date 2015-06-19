package com.sm.ench;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Node {
	
	public static int ID;
	public static int TYPE;
	private static Ench ENCH;
	public boolean hasID=false;
	public static int[] links = new int[10];
	public static int PARENT=0;
	public boolean hasParent=false;
	public NData ndata = null;
	
	//Type variables
	public static boolean isTrigger = false;
	public static boolean isOnBlock = false;
	public static boolean isOnSword = false;
	public static boolean isOnBow = false;
	public static boolean isOnAmulet = false;
	public static boolean isOnMulti = false;
	public static boolean isOnArmor = false;
	public static boolean isOnTool = false;
	
	
	public Node(int type,Ench ench){
		TYPE=type;
		ENCH=ench;
		ID=ENCH.regNode(this);
		hasID=true;
		//ENCH.setTreeP(parent,this);
		ndata=ENCH.getNData(type);
	}
	
	public boolean addLink(int loc,int id){
		boolean b=true;
		try{
			links[loc]=id;
		}catch(Exception e){
			b=false;
		}
		
		return b;
	}
	public boolean removelink(int loc){
		boolean b=false;
		try{
			links[loc]=0;
			b=true;
		}catch(Exception e){
			b=false;
		}
			return b;
		}
	
	public void setParent(int id){
		PARENT=id;
	}
	
	public Boolean perfAction(NodePar np){
		ENCH.PROCESS=ID;
			Object bool = null;
		try {
				Method method = Class.forName(Index.class.getName()).getDeclaredMethod(ndata.getMName(),NodePar.class,NData.class,Node.class);
				if(ndata.isTrigger()){
					bool = method.invoke(ENCH.getIndex(),np,ndata,this);
					if((Boolean)bool){
						callLinked();
					}
				}else{
					bool = method.invoke(ENCH.getIndex(),np,ndata,this);
				}
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			if(ndata.canLink()){
				if((Boolean)bool){
					callLinked();
				}
			}else{
				return (Boolean)bool;
			}
		return null;
	}
	
	public void callLinked(){
		
	}
	
	public boolean getBooleanValue(NodePar np){
		
		return false;
	}
	
	
	
		
	
	
	
}