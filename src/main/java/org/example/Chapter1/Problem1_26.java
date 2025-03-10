package org.example.Chapter1;

import java.util.function.BinaryOperator;

public class Problem1_26 {

    public static void main(String[] args) {

        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int z = x + y;
        System.out.println("z = " + z);

        long xl = Long.MAX_VALUE;
        long yl = Long.MAX_VALUE;
        long zl = xl + yl;
        System.out.println("zl = " + zl);

        long zl2 = Long.sum(xl, yl);
        System.out.println("zl2 = " + zl2);

        // 오버플로우시 예외발생
        // int z2 = Math.addExact(x, y);
        // long zl3 = Math.addExact(xl, yl);

    }
}
