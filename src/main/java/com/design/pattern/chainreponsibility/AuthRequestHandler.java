package com.design.pattern.chainreponsibility;

public class AuthRequestHandler extends RequestHandler {
    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("auth executes");
        super.handle(request);
    }
}
