package com.design.pattern.observer;

public class App {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.addObserver(new Hobbits());
        weather.addObserver(new Orc());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
