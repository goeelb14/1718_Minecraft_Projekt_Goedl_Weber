package com.MinecraftProject.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WandItem extends net.minecraft.item.ItemBow {


    public WandItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
        setNoRepair();
        setMaxDamage(600);
        maxStackSize = 1;

    }
}
