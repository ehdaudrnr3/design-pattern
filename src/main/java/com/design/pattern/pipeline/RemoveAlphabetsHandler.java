package com.design.pattern.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.IntPredicate;

public class RemoveAlphabetsHandler implements Handler<String, String> {

    private static final Logger logger = LoggerFactory.getLogger(RemoveAlphabetsHandler.class);

    @Override
    public String process(String input) {
        StringBuilder inputWitoutAlphabets = new StringBuilder();
        IntPredicate isAlphabetic = Character::isAlphabetic;

        input.chars().filter(isAlphabetic.negate()).mapToObj(x->(char)x).forEachOrdered(inputWitoutAlphabets::append);
        String values = inputWitoutAlphabets.toString();
        logger.info("Current handler: {}, input is {} of type {}, output is {}, type {}", RemoveAlphabetsHandler.class, input, String.class, values, String.class);

        return values;
    }
}
