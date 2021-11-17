package com.design.pattern.factorymethod;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendToEmail(email, ship);
        return ship;
    }

    private void sendToEmail(String email, Ship ship) {
        System.out.println(ship.getName() + " is created");
    }

    Ship createShip();

    private void validate(String name, String email) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("ship name is required");
        }

        if(email == null || email.isBlank()) {
            throw new IllegalArgumentException("email name is required");
        }
    }

    private void prepareFor(String name) {
        System.out.println("prepare... " + name);
    }
}
