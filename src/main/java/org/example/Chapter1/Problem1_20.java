package org.example.Chapter1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1_20 {

    private static String[] texts =
            {"abc", "abcd", "abcde", "ab", "abcd", "abcdef"};

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(texts));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        // 처음 문자 길이
        int firstLen = strs[0].length();

        //
        for (int prefixLen = 0; prefixLen < firstLen; prefixLen++) {
            char ch = strs[0].charAt(prefixLen);

            for (int i = 1; i < strs.length; i++) {
                if(prefixLen >= strs[i].length() || strs[i].charAt(prefixLen) != ch) {
                    return strs[i].substring(0, prefixLen);
                }
            }
        }

        return strs[0];
    }
}
