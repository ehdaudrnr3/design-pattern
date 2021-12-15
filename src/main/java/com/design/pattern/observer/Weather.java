package com.design.pattern.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Weather {

    private WeatherType currentWeather;
    private final List<WeatherObserver> observers;

    public Weather() {
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void timePasses() {
        WeatherType[] values = WeatherType.values();
        currentWeather = values[(currentWeather.ordinal() + 1) % values.length];
        log.info("The weather changed to {}.", currentWeather);
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(currentWeather);
        }
    }
}
