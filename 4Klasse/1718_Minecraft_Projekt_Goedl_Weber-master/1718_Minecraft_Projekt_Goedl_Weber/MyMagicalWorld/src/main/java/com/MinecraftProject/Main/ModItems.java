package com.MinecraftProject.Main;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;

@Mod.EventBusSubscriber(modid = MyMagicalWorld.MODID)
public class ModItems {
    public static Item WAND_ITEM = new WandItem("wanditem");;
    public static ArmorMaterial MYARMOR =EnumHelper.addArmorMaterial("PrincessArmor","Peach",10,new int[] {3, 8, 6, 3},30,new SoundEvent(new ResourceLocation("equip")),1);
    public static Item PrincessCostume = new PrincessArmor("Peach",MYARMOR, "Peach",0);

    public static void init() {

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(WAND_ITEM);
        if(PrincessCostume != null){
            //event.getRegistry().registerAll(PrincessCostume);
        }
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(WAND_ITEM);
        //registerRender(PrincessCostume);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}

