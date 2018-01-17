package com.MinecraftProject.Main;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PurpleBlock extends Block{

    public PurpleBlock(String name){
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        setHardness(2f);
        setResistance(4f);
        setSoundType(SoundType.STONE);
    }

}
