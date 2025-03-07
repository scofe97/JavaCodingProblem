package org.example.Chapter1;

import java.util.HashMap;
import java.util.Map;

public class Problem1_4 {
    private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";

    private static final String TEXT2 = "123456";

    public static void main(String[] args) {

        for (char c : TEXT2.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("숫자 구성 x");
            }
        }

        System.out.println("숫자 구성 o");
    }
}
