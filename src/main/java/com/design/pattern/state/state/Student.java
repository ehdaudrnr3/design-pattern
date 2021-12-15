package com.design.pattern.state.state;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    private Set<OnlineCourse> onlineCourses = new HashSet<>();

    public boolean isAvailable(OnlineCourse course) {
        return onlineCourses.contains(course);
    }

    public void addPrivate(OnlineCourse onlineCourse) {
        onlineCourses.add(onlineCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", onlineCourses=" + onlineCourses +
                '}';
    }
}
