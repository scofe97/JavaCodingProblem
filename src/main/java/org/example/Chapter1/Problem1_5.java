package org.example.Chapter1;

import java.util.Objects;

public class Problem1_5 {
    private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";

    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        for (char c : TEXT.toCharArray()) {
            if (Objects.equals(c, 'a') || Objects.equals(c, 'e') || Objects.equals(c, 'i') || Objects.equals(c, 'o') || Objects.equals(c, 'u')) {
                a++;
            } else {
                b++;
            }

        }

        System.out.println("모음 수: " + a);
        System.out.println("자음 수: " + b);
    }
}
