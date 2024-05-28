package Recursion;

import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for (BigInteger i = new BigInteger("1"); numberOfDigits(fibonacci(i)) <= 1000; i = i.add(BigInteger.ONE))
            System.out.println(" " + i + "  -  " + fibonacci(i) + "  -  " + numberOfDigits(fibonacci(i)));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Duration: " + duration/1000000 + " ms");    }

    private static BigInteger fibonacci(BigInteger n){
        if(n.compareTo(BigInteger.ONE)==0){
            return BigInteger.ONE;
        } else if(n.compareTo(BigInteger.ZERO)==0){
            return BigInteger.ZERO;
        }
        else{
            return fibonacci(n.subtract(BigInteger.ONE)).add(fibonacci(n.subtract(BigInteger.valueOf(2))));
        }

    }

    public static int numberOfDigits(BigInteger fibonacci) {
        return Integer.valueOf(fibonacci.toString().length());
    }

}
