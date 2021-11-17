package com.design.pattern.decorator;

public class SpamFilteringCommentDecorator extends CommentDecorator {
    public SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if(isSpam(comment)) {
            comment = filter(comment);
        }
        super.addComment(comment);
    }

    private String filter(String comment) {
        return comment.replace("http", "https");
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
}
