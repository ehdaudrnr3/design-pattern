package com.design.pattern.chainreponsibility;

public class Client {
    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("api request..");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        AuthRequestHandler requestHandler = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(requestHandler);
        client.doWork();
    }
}

