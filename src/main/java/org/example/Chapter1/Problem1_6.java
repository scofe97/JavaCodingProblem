package org.example.Chapter1;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem1_6 {
    private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";

    public static void main(String[] args) {

        Map<String, Integer> countMap = new HashMap<>();
        String[] strings = TEXT.replaceAll("[,.]", "")
                .toLowerCase()
                .split(" ");

        for (String string : strings) {
            countMap.putIfAbsent(string, 0);
            countMap.put(string, countMap.get(string) + 1);
        }

        HashMap<String, Integer> collect = countMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        for (Map.Entry<String, Integer> entry : collect.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
