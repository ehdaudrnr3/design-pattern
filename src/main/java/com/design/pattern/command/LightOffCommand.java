package com.design.pattern.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        new LightOnCommand(light).execute();
    }
}
