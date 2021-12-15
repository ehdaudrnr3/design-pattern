package com.design.pattern.strategy;

public class CollectContext {

    private CollectExecutor executor;

    public CollectContext(CollectExecutor executor) {
        this.executor = executor;
    }

    public void changeExecutor(CollectExecutor executor) {
        this.executor = executor;
    }

    public void collect() {
        executor.execute();
    }
}
