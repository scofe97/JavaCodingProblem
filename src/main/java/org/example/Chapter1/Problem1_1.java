package org.example.Chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 문자 개수 세기
 * 주어진 문자열에서 문자 개수를 세는 프로그램 작성
 */
public class Problem1_1 {
    private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";

    private static final String TEXT_CP =  "😍 I love 💕 you Ӝ so much 💕 😍 🎼🎼🎼!";
    private static final String TEXT_CP2 = "A💕😊";

    public static void main(String[] args) {

        // 1. 해당 코드는 유니코드 고려가 되어 있지 않음
        HashMap<Character, Integer> result = new HashMap<>();
        for (char c : TEXT_CP.toCharArray()) {
            // result.put(c, result.getOrDefault(c, 0) + 1);

            result.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }
        System.out.println("result = " + result);

        // 2. 유니코드 고려 for문
        HashMap<String, Integer> result2 = new HashMap<>();
        for (int i = 0; i < TEXT_CP.length(); i++) {
            int cp = TEXT_CP.codePointAt(i); // 65535
            String ch = String.valueOf(Character.toChars(cp));

            // 2는 대리 쌍을 의미한다,
            if (Character.charCount(cp) == 2) {
                i++;
            }

            result2.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }
        System.out.println("result2 = " + result2);

        // 3. 유니코드 고려 (codePoints 사용)
        Map<String, Long> result3 = TEXT_CP.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("result3 = " + result3);

        System.out.println("TEXT_CP2 length = " + TEXT_CP2.length());
        System.out.println("TEXT_CP2 codePointCount = " + TEXT_CP2.codePointCount(0, TEXT_CP2.length()));
    }
}
