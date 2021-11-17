package com.design.pattern.abstractfactory;

import com.design.pattern.factorymethod.OwnerShipFactory;
import com.design.pattern.factorymethod.Ship;
import com.design.pattern.factorymethod.ShipFactory;

public class App {

    public static void main(String[] args) {
        ShipFactory factory = new OwnerShipFactory(new WhaleShipFactory());
        Ship ship = factory.createShip();
        System.out.println("anchor = " + ship.getAnchor().getClass());
        System.out.println("wheel = " + ship.getWheel().getClass());
    }
}
