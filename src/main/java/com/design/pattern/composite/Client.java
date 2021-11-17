package com.design.pattern.composite;

public class Client {

    public static void main(String[] args) {
        Item book = new Item("novel", 1000);
        Item gun = new Item("gun", 1000);
        Item phone = new Item("phone", 1000);
        
        Bag bag = new Bag();
        bag.add(book);
        bag.add(gun);
        bag.add(phone);

        printPrice(book);
        printPrice(gun);
        printPrice(phone);
        printPrice(bag);
    }

    private static void printPrice(Component component) {
        System.out.println("price : " + component.getPrice());
    }
}
