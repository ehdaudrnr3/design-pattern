package com.design.pattern.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Orc implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
      log.info("The Orc are facing {} weather now", currentWeather);
    }
}
