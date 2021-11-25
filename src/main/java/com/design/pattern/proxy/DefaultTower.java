package com.design.pattern.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultTower implements Tower {

    @Override
    public void enter(Person person) {
        log.info("{} enter ther tower", person);
    }
}
