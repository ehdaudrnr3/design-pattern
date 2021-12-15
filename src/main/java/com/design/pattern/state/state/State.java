package com.design.pattern.state.state;

public interface State {

    void addReview(String review, Student student);
    void addStudent(Student student);
}
