package com.design.pattern.mediator;

public class CleaningServcie {

    private FrontDesk frontDesk;

    public CleaningServcie(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void getTowers(Long guestId, int numberOfTower) {
        Long roomNumber = frontDesk.getRoomNumber(guestId);
        System.out.println("provide " + numberOfTower + " to " + roomNumber);
    }
}
