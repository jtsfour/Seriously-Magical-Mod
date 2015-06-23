package com.sm.ench;

import java.util.ArrayList;

public class Ench {
	
	private ArrayList<Node> nodes = new ArrayList();
	private static int nextID = 0;
	private Index INDEX = null;
	public int PROCESS = 0;
	
	public Ench(Index index){
		INDEX = index;
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
	
	public void runProcess(NodePar np){
		getNode(PROCESS).perfAction(np);
	}
	
}
