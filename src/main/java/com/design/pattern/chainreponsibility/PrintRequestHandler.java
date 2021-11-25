package com.design.pattern.chainreponsibility;

public class PrintRequestHandler extends RequestHandler {
    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("request = " + request.getBody());
        super.handle(request);
    }
}
