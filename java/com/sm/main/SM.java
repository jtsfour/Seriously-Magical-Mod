package com.sm.main;


import com.sm.ench.Ench;
import com.sm.ench.Index;
import com.sm.ench.Node;

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
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {	
    	Index index = new Index();
    	Initializer initer = new Initializer(index);
    	Ench ench = new Ench(index);
    	Node node = new Node(1001,0,ench);
    	node.perfAction(null);
    	
    	
    	
        
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
