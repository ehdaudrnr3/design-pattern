package com.design.pattern.templateMethod;

public class TemplateMethodApp {
    public static void main(String[] args) {
        HalflingThief thief = new HalflingThief(new SubtleMethod());
        thief.steal();;
        thief.changeMethod(new HItAndRunMethod());
        thief.steal();
    }
}
