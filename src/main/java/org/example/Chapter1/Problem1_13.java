package org.example.Chapter1;

public class Problem1_13 {

    private static final String TEXT = "oobotooorogshŜoootorgo";
    private static final char CHAR = 'Ŝ';

    public static void main(String[] args) {
        System.out.println(TEXT.replace(Character.toString(CHAR), ""));
    }
}
