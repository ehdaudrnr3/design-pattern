package com.design.pattern.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReactiveRequester {

    public void invokeRequest() {
        log.info("Reactive web request");
    }
}
