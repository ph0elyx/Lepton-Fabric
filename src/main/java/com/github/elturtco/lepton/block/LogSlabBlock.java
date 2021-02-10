package com.github.elturtco.lepton.block;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;

public class LogSlabBlock extends SlabBlock {

    private final Block block;

    public LogSlabBlock(Block strippedBlock, Settings settings) {
        super(settings);
        this.block = strippedBlock;
    }

}
