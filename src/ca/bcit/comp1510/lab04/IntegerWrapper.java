package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * IntegerWrapper provides wrapper
 * methods for integers.
 * 
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class IntegerWrapper {
    
    /**
     * main program entry.
     * @param args cli input unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int x = scan.nextInt();
        
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println("Octal:  " + Integer.toOctalString(x));
        System.out.println("Hex:    " + Integer.toHexString(x));
        System.out.println();

        System.out.println("Max Value: " + Integer.MAX_VALUE);
        System.out.println("Min Value: " + Integer.MIN_VALUE);
        System.out.println();

        System.out.print("Enter an integer: ");
        String y = scan.next();
        
        System.out.print("Enter an integer: ");
        String z = scan.next();
        
        scan.close();
        
        int a = Integer.parseInt(y);
        int b = Integer.parseInt(z);
        
        System.out.println("Sum of (" + a + " + " + b + ") = " + (a + b));
    }
}
