package com.design.pattern.command;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) throws InterruptedException {
        Light light = new Light();
        Button button = new Button(new LightOnCommand(light));
        button.press();
        Thread.sleep(1000);

        button = new Button(new LightOffCommand(light));
        button.press();
    }
}
