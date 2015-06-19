package com.sm.main;


import com.sm.ench.Ench;
import com.sm.ench.Index;
import com.sm.ench.Node;
import com.sm.ench.EnchEventHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


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
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {	
    	Index index = new Index();
    	@SuppressWarnings("unused")
		Initializer initer = new Initializer(index);
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
