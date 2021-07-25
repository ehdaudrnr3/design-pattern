package com.design.pattern.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ConvertToCharArrayHandler implements Handler<String, char[]> {

    private static final Logger logger = LoggerFactory.getLogger(ConvertToCharArrayHandler.class);

    @Override
    public char[] process(String input) {
        char[] chars = input.toCharArray();
        String values = Arrays.toString(chars);
        logger.info("Current handler: {}, input is {} of type {}, output is {}, type {}", ConvertToCharArrayHandler.class, input, String.class, values, Character.class);
        return chars;
    }
}
