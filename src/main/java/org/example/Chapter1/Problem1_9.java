package org.example.Chapter1;

public class Problem1_9 {
    private static final String TEXT_1 = "Illinois";
    private static final String TEXT_2 = "Mathematics";
    private static final String TEXT_3 = "and";
    private static final String TEXT_4 = "Science";
    private static final String TEXT_5 = "Academy";

    public static void main(String[] args) {
        System.out.println(String.join("/", TEXT_1, TEXT_2, TEXT_3, TEXT_4, TEXT_5));
    }
}
