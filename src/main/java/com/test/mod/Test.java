package com.test.mod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Test.MODID, version = Test.VERSION)
public class Test
{
    public static final String MODID = "Test mod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preInit(FMLInitializationEvent event)
    {
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
    
    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
    }
}