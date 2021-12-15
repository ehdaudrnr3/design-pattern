package com.design.pattern.state.state;

public class App {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student kim = new Student("kim");
        Student lee = new Student("lee");
        lee.addPrivate(onlineCourse);

        onlineCourse.addStudent(kim);
        onlineCourse.changedState(new Private(onlineCourse));
        onlineCourse.addReview("hello", kim);
        onlineCourse.addStudent(lee);

        System.out.println("onlineCourse.getReviews() = " + onlineCourse.getReviews());
        System.out.println("onlineCourse.getState() = " + onlineCourse.getState());
        System.out.println("onlineCourse.getStudents() = " + onlineCourse.getStudents());
    }
}
