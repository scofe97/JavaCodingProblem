package org.example.Chapter1;

import java.util.HashMap;
import java.util.Map;

public class Problem1_12 {

    private static final String TEXT = "!ABCBA;C D E-D  D  DFA;";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (char c : TEXT.toCharArray()) {
            if(!map.containsKey(c)) {
                map.put(c, 1);
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}
