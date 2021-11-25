package com.design.pattern.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {

    private Iterator<Post> internalInterator;

    public RecentPostIterator(List<Post> posts) {
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.internalInterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return internalInterator.hasNext();
    }

    @Override
    public Post next() {
        return internalInterator.next();
    }
}

