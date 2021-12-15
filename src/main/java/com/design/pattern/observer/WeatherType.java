package com.design.pattern.observer;

public enum WeatherType {
    SUNNY("Sunny"),
    RAINY("Rainy"),
    WINDY("Windy"),
    COLD("Cold");

    private String decription;

    WeatherType(String decription) {
        this.decription = decription;
    }

    public String getDecription() {
        return decription;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
