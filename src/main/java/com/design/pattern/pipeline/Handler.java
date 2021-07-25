package com.design.pattern.pipeline;

interface Handler<I, O> {
    O process(I input);
}
