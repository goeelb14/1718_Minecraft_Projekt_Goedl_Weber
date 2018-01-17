package com.MinecraftProject.Main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.*;
public class RenderPegasus extends RenderLiving
{
    public RenderPegasus(ModelBase modelbase, float f)
    {
        super(null,modelbase, f);

    }
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return new ResourceLocation("");
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2,
                               float f, float f1)
    {


        super.doRender(entityliving,d,d1,d2,f,f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2,
                         float f, float f1)
    {
        doRenderLiving((EntityLiving)entity, d, d1, d2, f, f1);
    }
}
