package com.design.pattern.factorymethod;

import com.design.pattern.abstractfactory.PartsFactory;

public class OwnerShipFactory implements ShipFactory{

    private PartsFactory partsFactory;

    public OwnerShipFactory(PartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    @Override
    public Ship createShip() {
        OwnerShip ship = new OwnerShip();
        ship.setAnchor(partsFactory.createAnchor());
        ship.setWheel(partsFactory.createWheel());
        return ship;
    }
}
