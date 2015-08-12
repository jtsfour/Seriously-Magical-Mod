package com.sm.ench;

import java.util.ArrayList;

import com.sm.items.EItemHandler;
import com.sm.main.Instances;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.event.world.ChunkEvent.Unload;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class EnchEventHandler {

	ArrayList<Ench> enchlist = new ArrayList<Ench>();
	private EItemHandler EIH;
	
	
	public EnchEventHandler(){
		Instances.setEnchEH(this);
		
		
		
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
		int en = findEnch(1);
		if(en>-1){
			if(!event.entityPlayer.worldObj.isRemote){
				enchlist.get(en).runProcess(new NodePar(event.entityPlayer.worldObj,1,event.entityPlayer,enchlist.get(en).getItem(),(EntityLivingBase)event.target));
			}
		}
		
		
		
	}
	
	@SubscribeEvent()
	public void blockbreak(BlockEvent.BreakEvent event){//2
	
		
		
		
	}
	
	@SubscribeEvent()
	public void playerTick(TickEvent.PlayerTickEvent event){
		//EIH.updatePlayer(event.player);
	}
	
	@SubscribeEvent()
	public void chunkLoad(ChunkEvent.Load event){
		
	}
	
	@SubscribeEvent()
	public void chunkUnload(Unload event){
		
	}
	
	public void setEIH(EItemHandler eih){
		EIH=eih;
	}
	
	
}