package com.github.elturtco.lepton.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class LogStairsBlock extends LeptonStairsBlock {

    private final Block block;

    public LogStairsBlock(Block strippedBlock, BlockState state, Settings settings) {
        super(state, settings);
        this.block = strippedBlock;
    }

}
