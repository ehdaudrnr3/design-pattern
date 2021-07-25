package com.design.pattern.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebReactiveAdapter implements WebRequester {

    private ReactiveRequester reactiveRequester;

    public WebReactiveAdapter(ReactiveRequester reactiveRequester) {
        this.reactiveRequester = reactiveRequester;
    }

    @Override
    public void requestHandler() {
        reactiveRequester.invokeRequest();;
    }
}
