package com.design.pattern.memento;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class App {

    public static void main(String[] args) {
        Stack<StarMemento> states = new Stack<>();
        Star star = new Star(StarType.SUN, 1000, 5000);

        log.info(star.toString());
        states.add(star.save());
        star.timePasses();

        log.info(star.toString());
        states.add(star.save());
        star.timePasses();

        while (!states.isEmpty()) {
            star.restore(states.pop());
            log.info(star.toString());
        }
    }
}
