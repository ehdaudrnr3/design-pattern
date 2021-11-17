package com.design.pattern.prototype;

import java.util.Objects;

public class GihubIssue implements Cloneable {

    private int id;

    private String title;

    private GihubRepository repository;

    public GihubIssue(GihubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GihubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issue/%d"
            , repository.getUser()
            , repository.getName()
            , this.getId());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        GihubRepository repository = new GihubRepository();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());

        GihubIssue gihubIssue = new GihubIssue(repository);
        gihubIssue.setId(this.id);
        gihubIssue.setTitle(this.title);
        return gihubIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GihubIssue that = (GihubIssue) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }
}
