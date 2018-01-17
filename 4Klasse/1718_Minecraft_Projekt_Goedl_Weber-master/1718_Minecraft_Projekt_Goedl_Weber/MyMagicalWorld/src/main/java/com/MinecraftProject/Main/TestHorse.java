package com.MinecraftProject.Main;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.World;

public class TestHorse extends EntityHorse {
    public TestHorse(World worldIn) {
        super(worldIn);
        this.canGallop = true;
    }
}
