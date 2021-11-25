package com.design.pattern.iterator;

import java.time.LocalDateTime;

public class Post {

    private String content;
    private LocalDateTime createdDateTime;

    public Post(String content) {
        this.content = content;
        this.createdDateTime = LocalDateTime.now();
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public String getContent() {
        return content;
    }
}
