package org.example.Chapter1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Problem1_3 {
    private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";

    private static final Pattern PATTERN = Pattern.compile(" +");

    public static void main(String[] args) {

        Map<Character, Integer> countMap = new HashMap<>();
        String[] strings = TEXT.replaceAll("[,.]", "").split(" ");

        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            for (int i = string.length()-1; i >= 0 ; i--) {
                sb.append(string.charAt(i));
            }

            sb.append(' ');
        }

        System.out.println(sb);


        String reverse = PATTERN.splitAsStream(TEXT)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
        System.out.println("reverse = " + reverse);
    }
}
