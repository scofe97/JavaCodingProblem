package org.example.Chapter1;

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
    }
}
