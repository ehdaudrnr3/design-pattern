package com.design.pattern.decorator;

public class App {
    public static void main(String[] args) {
        CommentService commentServcie = new DefaultCommentService();

        if(true) {
            commentServcie = new SpamFilteringCommentDecorator(commentServcie);
        }
        if(true) {
            commentServcie = new TrimmingCommentDecorator(commentServcie);
        }

        Client client = new Client(commentServcie);
        client.writerComment("test...");
        client.writerComment("http://test.com");
    }
}
