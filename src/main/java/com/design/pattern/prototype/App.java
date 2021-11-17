package com.design.pattern.prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        //todo clone != githibIssue => false
        //todo clone.equals(githibIssue) => true

        GihubRepository repository = new GihubRepository();
        repository.setUser("test");
        repository.setName("prototype");

        GihubIssue gihubIssue = new GihubIssue(repository);
        gihubIssue.setId(1);
        gihubIssue.setTitle("commit issue");

        String url = gihubIssue.getUrl();
        System.out.println(url);
        repository.setUser("gook");

        GihubIssue clone = (GihubIssue) gihubIssue.clone();
        System.out.println("clone.getUrl() = " + clone.getUrl());
        System.out.println("clone != gihubIssue = " + (clone != gihubIssue));
        System.out.println("clone.equals(gihubIssue) = " + clone.equals(gihubIssue));
        System.out.println("clone.getClass() == gihubIssue.getClass() = " + (clone.getClass() == gihubIssue.getClass()));
        System.out.println("clone.getRepository() == gihubIssue.getRepository() = " + (clone.getRepository() == gihubIssue.getRepository()));
        System.out.println("gihubIssue.getUrl() = " + gihubIssue.getUrl());
    }
}
