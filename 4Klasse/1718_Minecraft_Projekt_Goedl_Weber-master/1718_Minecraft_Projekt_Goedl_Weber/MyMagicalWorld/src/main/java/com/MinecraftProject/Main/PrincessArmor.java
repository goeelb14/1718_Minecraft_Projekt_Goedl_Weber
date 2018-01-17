package com.MinecraftProject.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.*;

public class PrincessArmor extends ItemArmor
{
    public String textureName;
    public PrincessArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
        super(material, 0, EntityEquipmentSlot.values()[type] );
        this.textureName = textureName;
        this.setUnlocalizedName(unlocalizedName);
        this.textureName=(MyMagicalWorld.MODID + ":" + unlocalizedName);


    }


    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        System.out.println("Des tu ich noch");
        return MyMagicalWorld.MODID + ":textures/armor/" + this.textureName + ".png";
    }
}
