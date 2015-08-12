package com.sm.main;

import com.sm.ench.EnchEventHandler;
import com.sm.ench.EnchObjHandler;
import com.sm.ench.epu.EnchPU;
import com.sm.ench.Index;
import com.sm.items.EItemHandler;

public class Instances {
	private static Instances instance;
	private static SM sminst;
	private static EnchEventHandler ehinst;
	private static Index ininst;
	private static EItemHandler eihinst;
	private static EnchObjHandler eohinst;
	private static EnchPU epuinst;
	
	public Instances(){
		instance=this;
	}
	
	//SETTERS
	public static void setSM(SM sm){
		Instances.sminst=sm;
	}
	
	public static void setEnchEH(EnchEventHandler eh){
		Instances.ehinst=eh;
	}
	
	public static void setIndex(Index in){
		Instances.ininst=in;
	}
	
	public static void setEIHandler(EItemHandler eih){
		eihinst=eih;
	}
	
	public static void setEOHandler(EnchObjHandler eoh){
		eohinst=eoh;
	}
	
	public static void setEnchPU(EnchPU epu){
		epuinst=epu;
	}
	
	
	//GETTERS
	public static Instances getInstance(){
		return Instances.instance;
	}
	
	public static SM getSM(){
		try{
			return Instances.sminst;
		}catch(Exception e){
			return null;
		}
	}
	
	public static EnchEventHandler getEnchEH(){
		try{
			return Instances.ehinst;
		}catch(Exception e){
			return null;
		}
	}
	
	public static Index getIndex(){
		try{
			return Instances.ininst;
		}catch(Exception e){
			return null;
		}
	}
	
	public static EItemHandler getEIHandler(){
		return eihinst;
	}
	
	public static EnchObjHandler getEOHandler(){
		return eohinst;
	}
	
	public static EnchPU getEnchPU(){
		return epuinst;
	}
}
