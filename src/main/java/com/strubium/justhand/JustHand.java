package com.strubium.justhand;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = JustHand.MODID, name = JustHand.NAME, version = JustHand.VERSION, clientSideOnly = true)
public class JustHand {
    public static final String MODID = "justhand";
    public static final String NAME = "JustHand";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Register event handler
        net.minecraftforge.common.MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onRenderOverlay(RenderGameOverlayEvent.Pre event) {
        if (event.getType() == ElementType.HOTBAR) {
            event.setCanceled(true); // Cancel just the hotbar
        }
    }
}
