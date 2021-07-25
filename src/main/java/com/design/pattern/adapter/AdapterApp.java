package com.design.pattern.adapter;

public class AdapterApp {
    public static void main(String[] args) {
        WebClient webClient = new WebClient(new RestWebRequester());
        webClient.doWork();

        WebReactiveAdapter adapter = new WebReactiveAdapter(new ReactiveRequester());
        webClient = new WebClient(adapter);
        webClient.doWork();
    }
}
