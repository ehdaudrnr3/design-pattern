package com.design.pattern.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonExecutor implements CollectExecutor {

    @Override
    public void execute() {
        log.info("json collect...");
    }
}
