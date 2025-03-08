package org.example.Chapter1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem1_2 {
    private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";

    private static final String TEXT_CP =  "😍 I love 💕 you Ӝ so much 💕 😍 🎼🎼🎼!";
    private static final String TEXT_CP2 = "A💕😊";

    public static void main(String[] args) {

        LinkedHashMap<Character, Integer> chars = new LinkedHashMap<>();

        //
        Map<Integer, Long> chars2 = TEXT_CP.codePoints()
                .boxed()
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        int cp = chars2.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse((int) Character.MIN_VALUE);

        System.out.println(String.valueOf(Character.toChars(cp)));
    }
}
