package org.example.Chapter1;

import java.util.Arrays;

public class Problem1_15 {

    private static String[] strs = {"one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten"};

    public static void main(String[] args) {
        Arrays.stream(strs).sorted(String::compareToIgnoreCase).forEach(System.out::println);
    }
}
