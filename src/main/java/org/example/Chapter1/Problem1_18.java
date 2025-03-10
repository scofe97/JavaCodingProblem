package org.example.Chapter1;

import java.util.Arrays;

public class Problem1_18 {

    private static final String STRING1 = "H e llo";
    private static final String STRING2 = "oehLL ";

    public static void main(String[] args) {

        int[] chCounts = new int[256];

        char[] chStr1 = STRING1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] chStr2 = STRING2.replaceAll("\\s", "").toLowerCase().toCharArray();

        if (chStr1.length != chStr2.length) {
            return;
        }

        for (int i = 0; i < chStr1.length; i++) {
            chCounts[chStr1[i]]++;
            chCounts[chStr2[i]]--;
        }

        for (int i = 0; i < chStr1.length; i++) {
            if (chCounts[i] != 0) {
                return;
            }
        }

        System.out.println("같은문자");

    }

    public static boolean isAnagramV3(String str1, String str2) {

        if (str1 == null || str2 == null
                || str1.isBlank() || str2.isBlank()) {
            // throw IllegalArgumentException
            return false;
        }

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        return Arrays.equals(
                str1.chars().sorted().toArray(),
                str2.chars().sorted().toArray()
        );
    }
}
