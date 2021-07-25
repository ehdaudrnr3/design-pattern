package com.design.pattern.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.IntPredicate;

public class RemoveDigitsHandler implements Handler<String, String> {

    private static final Logger logger = LoggerFactory.getLogger(RemoveDigitsHandler.class);

    @Override
    public String process(String input) {
        StringBuilder inputWitoutDigits = new StringBuilder();
        IntPredicate isDigit = Character::isDigit;

        input.chars().filter(isDigit.negate()).mapToObj(x->(char)x).forEachOrdered(inputWitoutDigits::append);
        String values = inputWitoutDigits.toString();
        logger.info("Current handler: {}, input is {} of type {}, output is {}, type {}", RemoveDigitsHandler.class, input, String.class, values, String.class);

        return values;
    }
}
