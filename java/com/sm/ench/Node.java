package com.sm.ench;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
	private NData ndata = null;
	
	//Type variables
	public static boolean isTrigger = false;
	public static boolean isOnBlock = false;
	public static boolean isOnSword = false;
	public static boolean isOnBow = false;
	public static boolean isOnAmulet = false;
	public static boolean isOnMulti = false;
	public static boolean isOnArmor = false;
	public static boolean isOnTool = false;
	
	
	public Node(int type,int parent,Ench ench){
		TYPE=type;
		ENCH=ench;
		ID=ENCH.regNode(this);
		hasID=true;
		ENCH.setTreeP(parent,this);
		ndata=ENCH.getNData(type);
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
	
	public void perfAction(NodePar np){
			try {
				Method method = Class.forName(Index.class.getName()).getDeclaredMethod(ndata.getMName(),NodePar.class,NData.class,Node.class);
				method.invoke(ENCH.getIndex(),np,ndata,this);
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
			
			
		
	}
	
	
	
	
	
	
	
}