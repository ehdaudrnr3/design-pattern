package com.design.pattern.abstractfactory;

public class WhaleShipFactory implements PartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new SmoothWheel();
    }
}
