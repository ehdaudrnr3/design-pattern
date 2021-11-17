package com.design.pattern.builder;

import java.time.LocalDate;

public class app {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("kankun")
                .nightsAndDay(2, 3)
                .startDate(LocalDate.of(2021, 11, 10))
                .whereToStay("resort")
                .addPlan(0, "checkin")
                .addPlan(1, "workout")
                .getPlan();

        TourPlan longBeach = builder.title("long beach")
                .startDate(LocalDate.of(2021, 11, 21))
                .getPlan();

        TourDirector tourDirector = new TourDirector(builder);
        TourPlan tourPlan = tourDirector.cancunTrip();
    }
}
