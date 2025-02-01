package dev.sowinski.comp1510.assignment1.q2;

import java.util.Scanner;

/**
 * Sqrt estimates the square root of a
 * given number.
 * 
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Sqrt {
    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double a = scan.nextDouble();
        scan.close();
        
        double s = (a + 1) / 2;
        System.out.println("Estimate 1:  " + s);        

        s = (s + a / s) / 2;
        System.out.println("Esitmate 2:  " + s);

        s = (s + a / s) / 2;
        System.out.println("Esitmate 3:  " + s);

        s = (s + a / s) / 2;
        System.out.println("Esitmate 4:  " + s);

        s = (s + a / s) / 2;
        System.out.println("Esitmate 5:  " + s);

        s = (s + a / s) / 2;
        System.out.println("Esitmate 6:  " + s);

        s = (s + a / s) / 2;
        System.out.println("Esitmate 7:  " + s);

        s = (s + a / s) / 2;
        System.out.println("Esitmate 8:  " + s);

        s = (s + a / s) / 2;
        System.out.println("Esitmate 9:  " + s);

        s = (s + a / s) / 2;
        System.out.println("Esitmate 10: " + s);

    }
}
