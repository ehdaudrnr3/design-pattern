package com.design.pattern.mediator;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FrontDesk {

    private Map<Long, Long> capacityRoom;
    private CleaningServcie cleaningServcie;
    private Restaurant restaurant;

    public FrontDesk() {
        this.capacityRoom = new HashMap<>();
    }

    public void setCleaningServcie(CleaningServcie cleaningServcie) {
        this.cleaningServcie = cleaningServcie;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void reserve(Guest guest) {
        capacityRoom.put(guest.getId(), new Random().nextLong());
    }

    public void getTowers(Guest guest, int numberOfTower) {
        cleaningServcie.getTowers(guest.getId(), numberOfTower);
    }

    public Long getRoomNumber(Long guestId) {
        return capacityRoom.get(guestId);
    }

    public void dinner(Guest guest, LocalDateTime localDateTime) {
        restaurant.dinner(guest.getId(), localDateTime);
    }
}
