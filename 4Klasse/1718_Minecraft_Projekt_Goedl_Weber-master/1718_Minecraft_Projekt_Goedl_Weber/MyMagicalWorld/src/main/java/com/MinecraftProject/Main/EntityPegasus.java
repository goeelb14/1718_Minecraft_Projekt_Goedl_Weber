package com.MinecraftProject.Main;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;


import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.*;

import net.minecraft.entity.passive.*;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.*;
import net.minecraft.nbt.*;
import net.minecraft.entity.*;


public class EntityPegasus extends EntityHorse {


    public EntityPegasus(World world) {
        super(world);
        //texture = "src/main/resources/assets/mymagicalworld/textures/entities/pinkHorse.png";
        this.setSize(1.3964844F, 1.6F);

    }

    public void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);
    }

    public void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        super.readEntityFromNBT(nbttagcompound);
    }

    protected int getDropItemId() {
        return 0;
    }




}
