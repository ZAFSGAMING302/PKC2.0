package me.zain.projectkorra.elements;

import java.util.HashMap;
import java.util.Map;

public class ElementRegistry {

    public static final Map<String, String> ELEMENTS = new HashMap<>();

    public static void registerAll() {
        register("Air");
        register("Water");
        register("Earth");
        register("Fire");
        register("Lightning");
        register("Ice");
        register("Metal");
        register("Sound");
        register("Plant");
        register("Blood");
        register("Dark");
        register("Light");
        register("Tech");
        register("Hacker");
    }

    private static void register(String name) {
        ELEMENTS.put(name, name);
    }
}
