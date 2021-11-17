package com.design.pattern.builder;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder.title("kankun")
                .nightsAndDay(2, 3)
                .startDate(LocalDate.of(2021, 11, 10))
                .whereToStay("resort")
                .addPlan(0, "checkin")
                .addPlan(1, "workout")
                .getPlan();
    }
}
