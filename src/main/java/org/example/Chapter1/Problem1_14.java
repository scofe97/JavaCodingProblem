package org.example.Chapter1;

import java.util.*;
import java.util.stream.Collectors;

public class Problem1_14 {

    private static final String TEXT = "oobotooorogshŜoootorgo";
    private static final char CHAR = 'Ŝ';

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : TEXT.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        map.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .ifPresent(System.out::println);


        Map.Entry<Character, Long> maxEntry = TEXT.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(Map.entry(Character.MIN_VALUE, -1L));

    }
}
