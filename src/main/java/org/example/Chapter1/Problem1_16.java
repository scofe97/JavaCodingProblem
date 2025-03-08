package org.example.Chapter1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Problem1_16 {

    private static final String STRING = "111111";
    private static final String SUBSTRING = "11";

    public static void main(String[] args) {

        int position = 0;
        int count = 0;
        int n = SUBSTRING.length();

        while((position = STRING.indexOf(SUBSTRING, position)) != -1) {
            position += n;
            count++;
        }

        System.out.println("count = " + count);

        // 11 11 11 -> "" "" "" ""
        //11 11 11 -> "" "" "" -> []

        // limit 값 의미
        // 0 마지막 빈 문자열 제거
        // -1 빈 문자열 포함해서 반환
        // n > 0 최대 n개의 배열 요소 반환
        int result = STRING.split(Pattern.quote(SUBSTRING), -1).length -1;
        System.out.println("result = " + result);



    }
}
