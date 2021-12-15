package com.design.pattern.strategy;

public class App {
    public static void main(String[] args) {
        CollectContext context = new CollectContext(new JsonExecutor());
        context.collect();

        context.changeExecutor(new XmlExecutor());
        context.collect();

        context.changeExecutor(LambdaExecutor.JsonExecutorStrategy);
        context.collect();

        context.changeExecutor(LambdaExecutor.XmlExecutorStrategy);
        context.collect();
    }
}
