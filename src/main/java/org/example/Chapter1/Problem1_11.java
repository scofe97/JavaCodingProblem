package org.example.Chapter1;

import java.util.Arrays;

public class Problem1_11 {

    private static final String[] TEXT = {"Illinois","Mathematics","and", "Science", "Academy"};

    public static void main(String[] args) {
        dfs(0, new String[5], new boolean[5], TEXT.length);
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
}
