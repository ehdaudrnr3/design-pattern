package com.design.pattern.mediator;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        CleaningServcie cleaningServcie = new CleaningServcie(frontDesk);
        Restaurant restaurant = new Restaurant(frontDesk);
        frontDesk.setCleaningServcie(cleaningServcie);
        frontDesk.setRestaurant(restaurant);

        Guest guest = new Guest(frontDesk);
        frontDesk.reserve(guest);
        
        guest.dinner(LocalDateTime.now());
        guest.getTowers(5);
    }
}
