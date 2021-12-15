package com.design.pattern.state.state;

public class Private implements State {

    private OnlineCourse onlineCourse;

    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        if(!onlineCourse.getStudents().contains(student)) {
            throw new UnsupportedOperationException("프라이빗 코스를 수강하는 학생만 리뷰를 남길 수 있습니다.");
        }
        onlineCourse.getReviews().add(review);
    }

    @Override
    public void addStudent(Student student) {
        if(!student.isAvailable(onlineCourse)) {
            throw new UnsupportedOperationException("프라이빗 코스를 수강하는 학생만 리뷰를 남길 수 있습니다.");
        }
        onlineCourse.getStudents().add(student);
    }
}
