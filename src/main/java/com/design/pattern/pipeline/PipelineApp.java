package com.design.pattern.pipeline;

public class PipelineApp {

    public static void main(String[] args) {
        Pipeline<String, char[]> pipeline = new Pipeline<>(new RemoveAlphabetsHandler())
                .addHandler(new RemoveDigitsHandler())
                .addHandler(new ConvertToCharArrayHandler());
        char[] execute = pipeline.execute("GoYankees1234!");
        System.out.println("execute = " + execute);
    }
}
