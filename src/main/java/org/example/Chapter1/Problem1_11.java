package org.example.Chapter1;

import java.util.stream.IntStream;

public class Problem1_11 {

    private static final String TEXT = "ABCDEFEDCBA";

    public static void main(String[] args) {

        int start = 0;
        int end = TEXT.length() - 1;

        for (; start <= end; start++, end--) {
            if(TEXT.charAt(start) != TEXT.charAt(end)) {
                System.out.println("회문 x");
                return;
            }
        }

        System.out.println("회문 o");


        System.out.println(TEXT.contentEquals(new StringBuilder(TEXT).reverse()));
        System.out.println(IntStream.range(0, TEXT.length() / 2)
                .allMatch(i -> TEXT.charAt(i) == TEXT.charAt(TEXT.length() - i - 1)));
    }
}
