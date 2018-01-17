package com.MinecraftProject.Main;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Mod(modid = MyMagicalWorld.MODID, version = MyMagicalWorld.VERSION)
public class MyMagicalWorld {

    public static final String MODID = "mymagicalworld";
    public static final String VERSION = "1.0";

    @Mod.Instance
    public static MyMagicalWorld instance;

    public void preInit(FMLPreInitializationEvent e) {
        System.out.println(MyMagicalWorld.MODID + ":preinit");
        ModItems.init();
        ModBlocks.init();
        //ModEntites.init();
    }

    public void init(FMLInitializationEvent e) {
        System.out.println(MyMagicalWorld.MODID + ":init");
    }

    public void postInit(FMLPostInitializationEvent e) {
        System.out.println(MyMagicalWorld.MODID + ":postInit");
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}


