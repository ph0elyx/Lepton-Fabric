package com.github.elturtco.lepton.block;

import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class LeptonButtonBlock extends AbstractButtonBlock {

    public LeptonButtonBlock(Settings settings) {
        super(false, settings);
    }

    public SoundEvent getClickSound(boolean powered) {
        return powered ? SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON : SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
    }

}
