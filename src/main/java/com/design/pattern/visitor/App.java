package com.design.pattern.visitor;

public class App {
    public static void main(String[] args) {
        Unit command = new Commander(
                new Sergeant(new Soldier(), new Soldier())
        );
        command.accept(new SoldierVisitor());
        command.accept(new SergeantVisitor());
        command.accept(new CommanderVisitor());

    }
}
