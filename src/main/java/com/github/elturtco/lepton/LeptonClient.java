package com.github.elturtco.lepton;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import static com.github.elturtco.lepton.registry.LeptonBlocks.*;

public class LeptonClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(POLISHED_ANDESITE_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(POLISHED_DIORITE_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(POLISHED_GRANITE_BUTTON, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(POLISHED_ANDESITE_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(POLISHED_DIORITE_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(POLISHED_GRANITE_PRESSURE_PLATE, RenderLayer.getTranslucent());

    }

}
