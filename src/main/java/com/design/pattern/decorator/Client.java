package com.design.pattern.decorator;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writerComment(String comment) {
        commentService.addComment(comment);
    }
}
