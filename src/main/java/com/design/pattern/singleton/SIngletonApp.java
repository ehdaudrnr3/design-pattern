package com.design.pattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SIngletonApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Settings settings = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println("settings = " + settings.equals(settings2));


        //리플렉션으로 하면 false
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings contructorSettings = constructor.newInstance();
        System.out.println("contructorSettings.equals(settings) = " + contructorSettings.equals(settings));

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        Settings inputSettings = null;
        try(ObjectInput input = new ObjectInputStream(new FileInputStream(("settings.obj")))) {
            inputSettings = (Settings) input.readObject();
        }

        System.out.println("settings = " + settings.equals(inputSettings));
    }
}
