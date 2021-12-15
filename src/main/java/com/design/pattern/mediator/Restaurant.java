package com.design.pattern.mediator;

import java.time.LocalDateTime;

public class Restaurant {

    private FrontDesk frontDesk;

    public Restaurant(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void dinner(Long id, LocalDateTime localDateTime) {
        Long roomNumber = frontDesk.getRoomNumber(id);
        System.out.println("provide room service " + roomNumber + " to at " + localDateTime);
    }
}
