package com.design.pattern.mediator;

import java.time.LocalDateTime;
import java.util.Random;

public class Guest {

    private Long id;

    private FrontDesk frontDesk;

    public Guest(FrontDesk frontDesk) {
        this.id = new Random().nextLong();
        this.frontDesk = frontDesk;

    }

    public void dinner(LocalDateTime localDateTime) {
        frontDesk.dinner(this, localDateTime);
    }

    public void getTowers(int numberOfTower) {
        frontDesk.getTowers(this, numberOfTower);
    }

    public Long getId() {
        return id;
    }
}
