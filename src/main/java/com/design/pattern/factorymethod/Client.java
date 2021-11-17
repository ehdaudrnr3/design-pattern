package com.design.pattern.factorymethod;

import com.design.pattern.abstractfactory.WhaleShipFactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new OwnerShipFactory(new WhaleShipFactory()), "ownership", "owner@mail.com");
        client.print(new BlackShipFactory(), "blackship", "owner@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
