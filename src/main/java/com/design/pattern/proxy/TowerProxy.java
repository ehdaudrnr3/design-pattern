package com.design.pattern.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TowerProxy implements Tower {

    private final int NUM_ALLOWED = 3;

    private int numPerson;

    private final Tower tower;

    public TowerProxy(Tower tower) {
        this.tower = tower;
    }

    @Override
    public void enter(Person person) {
        if(numPerson < NUM_ALLOWED) {
            tower.enter(person);
            numPerson++;
        } else {
            log.info("{} is not allowd to enter", person);
        }
    }
}
