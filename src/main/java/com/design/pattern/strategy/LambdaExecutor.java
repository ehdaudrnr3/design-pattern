package com.design.pattern.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum LambdaExecutor implements CollectExecutor{
    JsonExecutorStrategy(() -> log.info("json collect..")),
    XmlExecutorStrategy(() -> log.info("xml collect.."));

    private final CollectExecutor executor;

    LambdaExecutor(CollectExecutor executor) {
        this.executor = executor;
    }

    @Override
    public void execute() {
        executor.execute();
    }
}
