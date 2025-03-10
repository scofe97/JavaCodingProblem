package org.example.Chapter1;

import java.util.stream.Stream;

public class Problem1_24 {

    private static String TEXT = "GOOOOOOOOOOOOOL! GOOOOOOOOOOOOOL!";

    public static void main(String[] args) {
        // ✅ Stream 없이 직접 문자열 처리
        String result1 = TEXT.toUpperCase()
                .repeat(2)
                .replaceAll("O", "0000");

        System.out.println(result1);

        // ✅ transform() 사용 (Java 12+ 지원)
        String result2 = TEXT
                .transform(String::toUpperCase)
                .transform(s -> s.repeat(2))
                .transform(s -> s.replaceAll("O", "0000"));

        System.out.println(result2);

    }
}
