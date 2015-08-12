package com.sm.ench.epu;

import java.util.ArrayList;

import com.sm.ench.Ench;
import com.sm.ench.EnchEventHandler;
import com.sm.ench.EnchObjHandler;
import com.sm.main.Instances;

public class EnchPU {
	
	private Instances INST;
	private EnchEventHandler EEH;
	private EnchObjHandler EOH;
	
	private ArrayList<Ench> enchs = new ArrayList<Ench>();
	
	public EnchPU(){
		INST=Instances.getInstance();
		EEH=INST.getEnchEH();
		EOH=INST.getEOHandler();
	}
}
