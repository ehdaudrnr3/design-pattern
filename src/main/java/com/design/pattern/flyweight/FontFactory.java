package com.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        String[] fonts = font.split(":");
        return cache.getOrDefault(font, new Font(fonts[0], Integer.parseInt(fonts[1])));
    }

}
