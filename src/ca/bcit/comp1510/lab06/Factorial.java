package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Factorial calculates stuff.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Factorial {
    
    /**
     * readPositiveInt reads and validates an integer.
     * @return validated int
     */
    private static int readPositiveInt() {
        Scanner scan = new Scanner(System.in);

        int number = -1;
        
        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            
            if (!scan.hasNextInt()) {
                System.out.println(scan.next() + " is not a number.");
                continue;
            }
            
            number = scan.nextInt();

            if (number < 0) {
                System.out.println(number + " is a negative number.");
                continue;
            }
        }
        scan.close();

        return number;
    }
    
    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        
        int number = readPositiveInt();
        
        if (number == 0) {
            System.out.println("The factorial of 0 is 1.");
        } else {
            int product = 1;
            for (int i = 2; i <= number; i++) {
                product *= i;
            }
            System.out.println("The factorial of " 
                        + number + " is "
                        + product + "."
            );
        }
    }
}
