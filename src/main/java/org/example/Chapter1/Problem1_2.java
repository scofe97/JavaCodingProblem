package org.example.Chapter1;

import java.util.HashMap;
import java.util.Map;

public class Problem1_2 {
    private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";

    public static void main(String[] args) {

        Map<Character, Integer> countMap = new HashMap<>();

        String textChange = TEXT.replaceAll("[, .]]", "").toLowerCase();

        for (char c : textChange.toCharArray()) {
            countMap.putIfAbsent(c, 0);
            countMap.put(c, countMap.get(c) + 1);
        }

    }
}
