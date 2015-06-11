package com.sm.ench;

import java.util.ArrayList;

public class Ench {
	
	private ArrayList<Node> nodes = new ArrayList();
	private static int nextID = 0;
	
	public Ench(){
		
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
	//sets link as node's parent
	public boolean setTreeP(int parent,Node node){
		Node node0=getNode(parent);
		if(node0!=null){
			node.setParent(node0.ID);
			return node0.addLink(node.ID);
		}else{
			return false;
		}
		
	}
	
	public Node getNode(int id){
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
	
	
	
}
