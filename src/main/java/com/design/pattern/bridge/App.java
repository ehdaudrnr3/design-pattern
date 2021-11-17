package com.design.pattern.bridge;

public class App {
    public static void main(String[] args) {
        Champion ari = new Ari(new KDA());
        Champion shen = new Shen(new Frozen());

        ari.attack();
        shen.defense();;
        shen.move();
        shen.attack();
        ari.defense();
    }
}
