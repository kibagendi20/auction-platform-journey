package com.auctionplatform.phase1.week1;

public class IntegerOverflowDetection {
    public static void main(String[] args){
        int a = Integer.MAX_VALUE;
        int b = 1;

        //Method 1
        if (a > Integer.MAX_VALUE - b){
            System.out.println("Overflow would occur — switch to long");
        }

        //Method 2: Java 8+ built-in overflow checker
        try {
            int safeResult = Math.addExact(a, b); //throws ArithmeticException on overflow
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        //Cast to long
        long safeResult  = (long) a + b;

        System.out.println("Safe Result: " + safeResult);

        System.out.println(0.1 * 0.1);

    }
}
