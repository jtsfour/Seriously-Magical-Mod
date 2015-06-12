package com.sm.ench;

public class NData {
	
	private int ID =0;
	private int TTYPE;
	private int GROUP;
	private String NAME;
	private String MNAME;
	private boolean ISTRI;
	private boolean CANBL;
	private boolean CANSW;
	private boolean CANBW;
	private boolean CANAMU;
	private boolean CANMULTI;
	private boolean CANARM;
	private boolean CANTOOL;
	
	
	
	public NData(int id,String name,String methodName,int nodeGroup,boolean isTrigger,boolean canBlock,boolean canSword,boolean canBow,boolean canAmulet,boolean canMulti,boolean canArmor,boolean canTool,int ttype){
		ID=id;
		NAME=name;
		MNAME=methodName;
		GROUP=nodeGroup;
		ISTRI=isTrigger;
		CANBL=canBlock;
		CANSW=canSword;
		CANBW=canBow;
		CANAMU=canAmulet;
		CANMULTI=canMulti;
		CANARM=canArmor;
		CANTOOL=canTool;
		
	}
	
	public int getID(){
		return ID;
	}
	
	public int getGroup(){
		return GROUP;
	}
	
	public int getToolType(){
		return TTYPE;
	}
	
	public String getName(){
		return NAME;
	}
	
	public String getMName(){
		return MNAME;
	}
	
	public boolean isTrigger(){
		return ISTRI;
	}
	
	public boolean canBlock(){
		return CANBL;
	}
	public boolean canSword(){
		return CANSW;
	}
	public boolean canBow(){
		return CANBW;
	}
	public boolean canAmulet(){
		return CANAMU;
	}
	public boolean canMulti(){
		return CANMULTI;
	}
	public boolean canArmor(){
		return CANARM;
	}
	public boolean canTool(){
		return CANTOOL;
	}
	
}
