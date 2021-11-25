package com.design.pattern.iterator;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("test board1");
        board.addPost("test board2");
        board.addPost("test board3");

        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        recentPostIterator.forEachRemaining(post->System.out.println("content = " + post.getContent()));
    }
}
