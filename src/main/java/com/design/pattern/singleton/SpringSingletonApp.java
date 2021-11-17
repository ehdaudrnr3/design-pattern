package com.design.pattern.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringSingletonApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("runtime = " + runtime.maxMemory());
        System.out.println("runtime = " + runtime.freeMemory());

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = context.getBean("hello", String.class);
        String hello2 = context.getBean("hello", String.class);
        System.out.println("hello = " + hello == hello2);
    }
}
