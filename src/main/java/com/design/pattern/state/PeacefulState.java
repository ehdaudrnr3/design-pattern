package com.design.pattern.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PeacefulState implements State {

    private final Mammoth mommoth;

    public PeacefulState(Mammoth mommoth) {
        this.mommoth = mommoth;
    }

    @Override
    public void onEnterState() {
        log.info("{} calms down", mommoth);
    }

    @Override
    public void observe() {
        log.info("{} is calm and peaceful", mommoth);
    }
}
