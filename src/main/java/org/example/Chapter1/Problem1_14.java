package org.example.Chapter1;

import java.util.*;

public class Problem1_14 {

    private static final String TEXT = "oobotooorogshŜoootorgo";
    private static final char CHAR = 'Ŝ';

    public static void main(String[] args) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : TEXT.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        map.values()
                .stream()
                .max(Integer::compareTo)
                .ifPresent(System.out::println);
    }
}
