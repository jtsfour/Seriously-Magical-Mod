package com.sm.main;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.sm.ench.EnchEventHandler;
import com.sm.ench.EnchObjHandler;
import com.sm.ench.epu.EnchPU;
import com.sm.ench.Index;
import com.sm.items.EItemHandler;


@Mod(modid = SM.MODID, version = SM.VERSION)
public class SM
{
    public static final String MODID = "Seriously Magical";
    public static final String VERSION = "0.1a";
    
    @SidedProxy(clientSide = "com.sm.main.ClientProxy",serverSide = "com.sm.main.ServerProxy")
    public static IProxy proxy;
    
    @Mod.Instance("SM")
    public static SM instance;
    
    
    EnchEventHandler enhandler = new EnchEventHandler();
    
    @SuppressWarnings("unused")
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {	
    	Instances inst = new Instances();
    	Instances.setSM(this);
    	Index index = new Index();
		Initializer initer = new Initializer(index);
		EItemHandler eih = new EItemHandler();
		EnchObjHandler eoh = new EnchObjHandler();
		EnchPU epu = new EnchPU();
    	MinecraftForge.EVENT_BUS.register(enhandler);
    	FMLCommonHandler.instance().bus().register(enhandler);
    }
   
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		
    
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
    
    }

  
	
}
