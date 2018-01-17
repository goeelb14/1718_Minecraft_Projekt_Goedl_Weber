package com.MinecraftProject.Main;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class RenderUnicorn extends RenderLiving
{
    public RenderUnicorn(ModelBase modelbase, float f)
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
