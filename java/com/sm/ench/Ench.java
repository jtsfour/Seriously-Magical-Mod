package com.sm.ench;

import java.util.ArrayList;
import com.sm.blocks.EBlock;
import com.sm.items.EItem;
import com.sm.main.Instances;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Ench {
	
	private ArrayList<Node> nodes = new ArrayList();
	private EItem ITEM;
	private EBlock BLOCK;
	private int type=0;
	private int nextID = 0;
	private Index INDEX = null;
	public int PROCESS = 0;
	//NEEDS UPDATING!!!!!!!!!!!!!!!!
	public Ench(Object obj){
		INDEX = Instances.getIndex();
		if(obj.getClass()==EItem.class){
			ITEM=(EItem)obj;
			type=1;
		}else if(obj.getClass()==EBlock.class){
			BLOCK=(EBlock)obj;
			type=2;
		}else{
			System.out.println("[ERROR] TRIED TO CREATE AN ENCH WITH UNDEFINED OBJECT TYPE: "+obj.getClass().getName());
		}
	}
	
	public Ench(Object obj,int nextId,int process){
		nextID=nextId;
		PROCESS=process;
		if(obj.getClass()==EItem.class){
			ITEM=(EItem)obj;
			type=1;
		}else if(obj.getClass()==EBlock.class){
			BLOCK=(EBlock)obj;
			type=2;
		}else{
			System.out.println("[ERROR] TRIED TO CREATE AN ENCH WITH UNDEFINED OBJECT TYPE: "+obj.getClass().getName());
		}
	}
	
	public int regNode(Node node){
		int id=nextID;
		nextID++;
		if(!node.hasID){
			nodes.add(node);
			if(id==0)return 1;else return id;
		}else{
			return 0;
		}
			
	}
	
	public void addNode(Node node){
		nodes.add(node);
	}
	/*//sets link as node's parent/*
	public boolean setTreeP(int parent,Node node){
		Node node0=getNode(parent);
		if(node0!=null){
			node.setParent(node0.ID);
			return node0.addLink(node.ID);
		}else{
			return false;
		}
		
	}*/
	
	
	
	public Node getNode(int id)throws ArrayIndexOutOfBoundsException{
		Node node=null;
		if(id!=0){
			boolean loop=true;
		 node = null;
		for(int i=0;loop;i++){
			if(nodes.get(i).ID==id){
				loop=false;
				node=nodes.get(i);
			}
		}
		}
		
		return node;
	}
	
	public NData getNData(int type){
		return INDEX.getNDataI(type);
	}
	
	public Index getIndex(){
		return INDEX;
	}
	
	public EItem getItem(){
		if(type==1){
			return ITEM;
		}else{
			return null;
		}
	}
	
	public void runProcess(NodePar np){
		getNode(PROCESS).perfAction(np);
	}
	
}
