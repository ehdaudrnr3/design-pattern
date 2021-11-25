package com.design.pattern.proxy;

public class Client {

    public static void main(String[] args) {
        var proxy = new TowerProxy(new DefaultTower());
        proxy.enter(new Person("Red"));
        proxy.enter(new Person("blue"));
        proxy.enter(new Person("green"));
        proxy.enter(new Person("marinblue"));
        proxy.enter(new Person("black"));
    }
}
