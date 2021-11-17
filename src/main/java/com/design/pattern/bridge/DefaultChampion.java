package com.design.pattern.bridge;



public class DefaultChampion implements Champion {

    private Skin skin;
    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getName(), name);
    }

    @Override
    public void attack() {
        System.out.printf("%s %s attack\n", skin.getName(), name);
    }

    @Override
    public void defense() {
        System.out.printf("%s %s defense\n", skin.getName(), name);
    }
}
