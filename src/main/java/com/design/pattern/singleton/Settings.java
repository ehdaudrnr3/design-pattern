package com.design.pattern.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {}

    private static class SettigsHolder {
        private static final Settings INSTANCE = new Settings();
    }
    public static Settings getInstance() {
        return SettigsHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
