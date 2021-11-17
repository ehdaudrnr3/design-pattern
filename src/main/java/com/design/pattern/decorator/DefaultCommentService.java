package com.design.pattern.decorator;

public class DefaultCommentService implements CommentService {

    @Override
    public void addComment(String comment) {
        System.out.println("comment = " + comment);
    }
}
