package org.example.Chapter1;

import java.util.Arrays;
import java.util.Comparator;

public class Problem1_15 {

    private static String[] strs = {"one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten"};

    public static void main(String[] args) {
        Arrays.stream(strs)
                .sorted(String::compareToIgnoreCase)
                .forEach(System.out::println);

        System.out.println("-----------------");

        Arrays.stream(strs)
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);


    }
}
