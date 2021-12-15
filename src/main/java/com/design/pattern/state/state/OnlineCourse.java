package com.design.pattern.state.state;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class OnlineCourse implements State{

    private State state = new Draft(this);

    private List<Student> students = new ArrayList<>();

    private List<String> reviews = new ArrayList<>();

    @Override
    public void addReview(String review, Student student) {
        state.addReview(review, student);
    }

    @Override
    public void addStudent(Student student) {
        state.addStudent(student);
    }

    public void changedState(State state) {
        this.state = state;
    }
}
