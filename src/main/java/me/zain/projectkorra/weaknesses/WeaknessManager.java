package me.zain.projectkorra.weaknesses;

import java.util.HashMap;
import java.util.Map;

public class WeaknessManager {

    private static final Map<String, Map<String, Weakness>> weaknesses = new HashMap<>();

    public static void load() {
        add("Air", "Plant", 1.15);
        add("Air", "Sound", 1.15);
        add("Water", "Lightning", 1.2);
        add("Water", "Ice", 1.2);
        add("Fire", "Water", 1.2);
        add("Fire", "Ice", 1.2);
        add("Tech", "Hacker", 1.15);
        add("Dark", "Light", 1.2);
    }

    private static void add(String defender, String attacker, double multiplier) {
        weaknesses.computeIfAbsent(defender, k -> new HashMap<>())
                  .put(attacker, new Weakness(multiplier));
    }

    public static Weakness get(String defender, String attacker) {
        return weaknesses.getOrDefault(defender, Map.of()).get(attacker);
    }
}
