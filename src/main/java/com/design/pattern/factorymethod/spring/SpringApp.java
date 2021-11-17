package com.design.pattern.factorymethod.spring;

import com.design.pattern.singleton.SpringConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        BeanFactory annoFactory = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = annoFactory.getBean("hello", String.class);
        System.out.println("hello = " + hello);
    }
}
