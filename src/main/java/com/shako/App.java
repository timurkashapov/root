package com.shako;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        System.out.println(0.1 + 0.2);

        java.math.BigDecimal big = new java.math.BigDecimal(110.00001);

        System.out.println(big.abs());
        System.out.println(big.negate());
        System.out.println(big.signum());
        System.out.println(big.scale());
        System.out.println(big.precision());
    }
}
