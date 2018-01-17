package com.MinecraftProject.Main;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntites {
    public static World world = Minecraft.getMinecraft().world;
    public static EntityHorse HORSE = new TestHorse(world);


    public static void init(){

        createEntity(HORSE.getClass(), 1513, "horse", 161425, 1582224);

    }


    public static void createEntity(Class entityClass, int ID, String entityName, int solidColor, int spotColor){
        //EntityRegistry.registerModEntity(entityClass, entityName, ID, MyMagicalWorld.instance, 128, 1, true);


//		EntityRegistry.registerEgg(entityClass, solidColor, spotColor);

    }
}
