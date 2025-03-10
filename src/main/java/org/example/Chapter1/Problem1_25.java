package org.example.Chapter1;

import java.util.function.BinaryOperator;

public class Problem1_25 {

    private static String TEXT = "GOOOOOOOOOOOOOL! GOOOOOOOOOOOOOL!";

    public static void main(String[] args) {
        int i1 = -45;
        int i2 = -15;

        int min = Math.min(i1, i2);
        int max = Math.max(i1, i2);

        double d1 = 0.023844D;
        double d2 = 0.03546895D;
        double minD = Double.min(d1, d2);
        double maxD = Double.max(d1, d2);

        Integer minBi = BinaryOperator.minBy(Integer::compare).apply(i1, i2);
        Integer maxBi = BinaryOperator.maxBy(Integer::compare).apply(i1, i2);
    }
}
