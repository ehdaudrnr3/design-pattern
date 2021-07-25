package com.design.pattern.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RestWebRequester implements WebRequester{
    @Override
    public void requestHandler() {
        log.info("Rest web request");
    }
}
