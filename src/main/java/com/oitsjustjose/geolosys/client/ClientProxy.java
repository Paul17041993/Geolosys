package com.oitsjustjose.geolosys.client;

import com.oitsjustjose.geolosys.common.CommonProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.client.resources.I18n;

public class ClientProxy extends CommonProxy
{
    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
        GuiManual.initPages();
    }

    @Override
    public String translate(String untranslated, Object... args)
    {
        return I18n.format(untranslated, args);
    }
}
