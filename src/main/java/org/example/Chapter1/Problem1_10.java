package org.example.Chapter1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Problem1_10 {

    private static final String[] TEXT = {"Illinois","Mathematics","and", "Science", "Academy"};
    private static final String TEXT2 = "TEST";

    public static void main(String[] args) {
        dfs(0, new String[5], new boolean[5], TEXT.length);
        System.out.println(permuteAndPrint("", TEXT2));
        permuteAndPrint2("", TEXT2);
    }

    private static void dfs(int depth, String[] result, boolean[] visited, int max) {

        if (depth == max) {
            System.out.println(Arrays.toString(result));
            return;
        }

        for (int i = 0; i < max; i++) {
            if (!visited[i]) {
                visited[i] = true;

                result[depth] = TEXT[i];
                dfs(depth + 1, result, visited, max);

                visited[i] = false;
            }
        }
    }

    private static Set<String> permuteAndPrint(String prefix, String str) {
        Set<String> permutations = new HashSet<>();
        int n = str.length();

        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations.addAll(permuteAndPrint(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1)));
            }
        }

        return permutations;
    }

    private static void permuteAndPrint2(String prefix, String str) {
        int n = str.length();

        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            IntStream.range(0, n)
                    .parallel()
                    .forEach(i -> permuteAndPrint2(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1)));
        }
    }


}
