package com.sm.ench;

import java.util.ArrayList;

import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EnchEventHandler {

	ArrayList<Ench> enchlist = new ArrayList<Ench>();
	
	
	public EnchEventHandler(){
		
		
		
		
	}
	
	public int findEnch(int et){
		try{
			for(int i=0;i>-1;i++){
				Ench ench = enchlist.get(i);
				if(ench.getNode(ench.PROCESS).ndata.isTrigger()){
					if(ench.getNode(ench.PROCESS).ndata.isAEvent(et)){
						return i;
					}
				}
			}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		
		return -1;
	}
	
	
	//EVENTS
	@SubscribeEvent()
	public void playerHit(AttackEntityEvent event){//1
	
		
		
		
	}
	
	@SubscribeEvent()
	public void blockbreak(BlockEvent.BreakEvent event){//2
	
		
		
		
	}
	
	
	
	
	
	
	
	
}