package com.github.elturtco.lepton;

import com.github.elturtco.lepton.registry.LeptonBlocks;
import com.github.elturtco.lepton.registry.LeptonItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lepton implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "lepton";
    public static final String MOD_NAME = "Lepton-Fabric";

    @Override
    public void onInitialize() {
        new LeptonBlocks();
        new LeptonItems();
        LeptonBlocks.RegisterLeptonBlocks();
        LeptonItems.RegisterLeptonItems();
        log(Level.INFO, "Initializing");
        //TODO: Initializer
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }



}