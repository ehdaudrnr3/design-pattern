package com.design.pattern.builder;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder title(String title);

    TourPlanBuilder nightsAndDay(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();

}
