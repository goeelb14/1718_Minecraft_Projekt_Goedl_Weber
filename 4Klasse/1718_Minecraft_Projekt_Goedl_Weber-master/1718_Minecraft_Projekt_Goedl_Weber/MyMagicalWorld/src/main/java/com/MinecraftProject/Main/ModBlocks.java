package com.MinecraftProject.Main;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.*;


@Mod.EventBusSubscriber(modid = MyMagicalWorld.MODID)

public class ModBlocks {

    public static Block MAGIC_BLOCK = new MagicBlock("magicblock");;
    public static Block PINK_BLOCK = new PinkBlock("pinkblock");
    public static Block MAGENTA_COBBLE_BLOCK = new MagentaCobbleBlock("magentacobbleblock");
    public static Block MAGIC_PILLAR = new MagicPillar("magicpillar");
    public static Block BLACK_MARBLE_BLOCK = new BlackMarbleBlock("blackmarbleblock");
    public static Block GOLDWAY_BLOCK = new GoldWayBlock("goldwayblock");
    public static Block MARBLE_BLOCK = new MarbleBlock("marbleblock");
    public static Block PINK_BRICK= new PinkBrick("pinkbrick");
    public static Block PINK_ROOFTOP_BRICK= new PinkRooftopBrick("pinkrooftopbrick");
    public static Block PURPLE_BLOCK= new PurpleBlock("purpleblock");
    public static Block PURPLE_STAR_BLOCK= new PurpleBlock("purplestarblock");;

    public static void init() {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(MAGIC_BLOCK);
        event.getRegistry().register(PINK_BLOCK);
        event.getRegistry().register(MAGENTA_COBBLE_BLOCK);
        event.getRegistry().register(MAGIC_PILLAR);
        event.getRegistry().register(BLACK_MARBLE_BLOCK);
        event.getRegistry().register(GOLDWAY_BLOCK);
        event.getRegistry().register(MARBLE_BLOCK);
        event.getRegistry().register(PINK_BRICK);
        event.getRegistry().register(PINK_ROOFTOP_BRICK);
        event.getRegistry().register(PURPLE_BLOCK);
        event.getRegistry().register(PURPLE_STAR_BLOCK);

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(MAGIC_BLOCK).setRegistryName(MAGIC_BLOCK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(PINK_BLOCK).setRegistryName(PINK_BLOCK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(MAGENTA_COBBLE_BLOCK).setRegistryName(MAGENTA_COBBLE_BLOCK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(MAGIC_PILLAR).setRegistryName(MAGIC_PILLAR.getRegistryName()));
        event.getRegistry().register(new ItemBlock(BLACK_MARBLE_BLOCK).setRegistryName(BLACK_MARBLE_BLOCK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(GOLDWAY_BLOCK).setRegistryName(GOLDWAY_BLOCK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(MARBLE_BLOCK).setRegistryName(MARBLE_BLOCK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(PINK_BRICK).setRegistryName(PINK_BRICK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(PINK_ROOFTOP_BRICK).setRegistryName(PINK_ROOFTOP_BRICK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(PURPLE_BLOCK).setRegistryName(PURPLE_BLOCK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(PURPLE_STAR_BLOCK).setRegistryName(PURPLE_STAR_BLOCK.getRegistryName()));

    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        registerRender(Item.getItemFromBlock(MAGIC_BLOCK));
        registerRender(Item.getItemFromBlock(PINK_BLOCK));
        registerRender(Item.getItemFromBlock(MAGENTA_COBBLE_BLOCK));
        registerRender(Item.getItemFromBlock(MAGIC_PILLAR));
        registerRender(Item.getItemFromBlock(BLACK_MARBLE_BLOCK));
        registerRender(Item.getItemFromBlock(GOLDWAY_BLOCK));
        registerRender(Item.getItemFromBlock(MARBLE_BLOCK));
        registerRender(Item.getItemFromBlock(PINK_BRICK));
        registerRender(Item.getItemFromBlock(PINK_ROOFTOP_BRICK));
        registerRender(Item.getItemFromBlock(PURPLE_BLOCK));
        registerRender(Item.getItemFromBlock(PURPLE_STAR_BLOCK));
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}