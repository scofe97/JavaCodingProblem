package org.example.Chapter1;

public class Problem1_28 {

    public static void main(String[] args) {

        long result = Integer.toUnsignedLong(Integer.MIN_VALUE);
        System.out.println("result = " + result);

        int result1 = Short.toUnsignedInt(Short.MIN_VALUE);
        int result2 = Short.toUnsignedInt(Short.MAX_VALUE);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // 1번째가 크다 >0, 같으면 0, 2번째가크다 0<
        int resultUnsigned = Integer.compareUnsigned(result1, result2);
        System.out.println("resultUnsigned = " + resultUnsigned);
    }
}
