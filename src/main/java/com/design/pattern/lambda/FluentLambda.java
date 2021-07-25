package com.design.pattern.lambda;

import java.util.function.Consumer;

class Mailer {
    private String from;
    private String to;
    private String subject;
    private String body;

    public static void print(String msg) { System.out.println(msg); }

    public Mailer from(String from) {
        this.from = from;
        print(from);
        return this;
    }

    public Mailer to(String to) {
        this.to = to;
        print(to);
        return this;
    }

    public Mailer subject(String subject) {
        this.subject = subject;
        print(subject);
        return this;
    }

    public Mailer body(String body) {
        this.body = body;
        print(body);
        return this;
    }

    @Override
    public String toString() {
        return "Mailer{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public static void send(Consumer<Mailer> block) {
        Mailer mailer = new Mailer();
        block.accept(mailer);
        System.out.println("mailer = " + mailer);mailer.toString();
        System.out.println("sending...");
    }
}

public class FluentLambda {

    public static void main(String[] args) {
        Consumer<Mailer> mail = malier -> malier
                .from("bulder@naver.com")
                .to("to@naver.com")
                .subject("hello")
                .body("..here item");
        Mailer.send(mail);
    }
}